package com.disney.wdpro.midichlorian;

import com.disney.wdpro.midichlorian.ExceptionAwareEvent;
import com.google.common.base.C22462m;
import com.google.common.base.C22469t;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class InvocationCallableFactory {
    private Map<Long, Boolean> globalNoCache = new HashMap();
    private final InvocationCache invocationCache;
    private final StickyEventPoster poster;

    private final class CacheEvict implements Callable<Object> {
        private final Invocation invocation;

        CacheEvict(Invocation invocation) {
            this.invocation = invocation;
        }

        private void evictCache() {
            if (this.invocation.isCacheEvictAll()) {
                InvocationCallableFactory.this.invocationCache.invalidateAll();
            } else {
                InvocationCallableFactory.this.invocationCache.invalidateEvictRegions(this.invocation);
            }
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            Object objInvoke = this.invocation.invoke();
            evictCache();
            return objInvoke;
        }
    }

    private final class Cacheable implements Callable<Object> {
        private Invocation invocation;
        private boolean localNoCache;

        Cacheable(Invocation invocation, boolean z10) {
            this.invocation = invocation;
            this.localNoCache = z10;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            if (InvocationCallableFactory.this.isGlobalNoCache() || this.localNoCache) {
                InvocationCallableFactory.this.invocationCache.invalidate(this.invocation);
            }
            try {
                return InvocationCallableFactory.this.invocationCache.get(this.invocation);
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                C22469t.m68734i(cause, Exception.class);
                throw C22469t.m68731f(cause);
            }
        }
    }

    private static final class PreloadUIEvent implements Callable {
        private Invocation invocation;

        PreloadUIEvent(Invocation invocation) {
            C22462m.m68673e(invocation.isUIEvent(), "The invocation should be Async to use this Callable.");
            this.invocation = invocation;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            try {
                this.invocation.invoke();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private static final class SimpleInvocation implements Callable<Object> {
        private Invocation invocation;

        SimpleInvocation(Invocation invocation) {
            this.invocation = invocation;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            return this.invocation.invoke();
        }
    }

    private final class UIEvent implements Callable {
        private Set<String> ids;
        private Invocation invocation;
        private boolean noCacheInstance;

        UIEvent(Invocation invocation, boolean z10, Set<String> set) {
            C22462m.m68685q(invocation, "The invocation cannot be null");
            C22462m.m68685q(set, "The ids cannot be null");
            C22462m.m68673e(invocation.isUIEvent(), "The invocation should be an UIEvent to use this Callable.");
            C22462m.m68673e(!invocation.isReturningVoid(), "The invocation cannot return void, void UIEvents uses PreloadUIEvent callable.");
            this.noCacheInstance = z10;
            this.invocation = invocation;
            this.ids = set;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            Object objInvoke;
            long id2 = Thread.currentThread().getId();
            InvocationCallableFactory.this.globalNoCache.put(Long.valueOf(id2), Boolean.valueOf(this.noCacheInstance));
            try {
                objInvoke = this.invocation.invoke();
            } catch (Throwable th2) {
                ExceptionAwareEvent exceptionAwareEventCreateExceptionEvent = ExceptionAwareEvent.Factory.createExceptionEvent(this.invocation.getReturnType());
                exceptionAwareEventCreateExceptionEvent.setException(th2);
                objInvoke = exceptionAwareEventCreateExceptionEvent;
            }
            InvocationCallableFactory.this.globalNoCache.remove(Long.valueOf(id2));
            try {
                InvocationCallableFactory.this.poster.postEvent(objInvoke, this.ids);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Inject
    public InvocationCallableFactory(InvocationCache invocationCache, StickyEventPoster stickyEventPoster) {
        this.invocationCache = (InvocationCache) C22462m.m68685q(invocationCache, "The invocation cannot be null");
        this.poster = (StickyEventPoster) C22462m.m68685q(stickyEventPoster, "The poster cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isGlobalNoCache() {
        long id2 = Thread.currentThread().getId();
        if (this.globalNoCache.containsKey(Long.valueOf(id2))) {
            return this.globalNoCache.get(Long.valueOf(id2)).booleanValue();
        }
        return false;
    }

    Callable create(Invocation invocation, boolean z10, boolean z11) {
        C22462m.m68685q("The invocation cannot be null", invocation);
        return invocation.isCacheable() ? new Cacheable(invocation, z10) : invocation.isCacheEvict() ? new CacheEvict(invocation) : invocation.isUIEvent() ? (z11 || invocation.isReturningVoid()) ? new PreloadUIEvent(invocation) : new UIEvent(invocation, z10, this.poster.getStickyListenerIds(invocation.getReturnType())) : new SimpleInvocation(invocation);
    }
}