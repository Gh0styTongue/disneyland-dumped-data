package com.disney.wdpro.midichlorian;

import com.disney.wdpro.midichlorian.annotations.Async;
import com.disney.wdpro.midichlorian.annotations.CacheEvict;
import com.disney.wdpro.midichlorian.annotations.Cacheable;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.C22469t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class Invocation {
    private final Object[] args;
    private final String creatorThreadName = Thread.currentThread().getName();
    private final String defaultRegion;
    private final Object instance;
    private final Method method;

    public Invocation(Object obj, Method method, Object[] objArr) {
        this.instance = C22462m.m68685q(obj, "The instance cannot be null");
        this.method = (Method) C22462m.m68685q(method, "The method cannot be null");
        this.args = (Object[]) C22462m.m68685q(objArr, "The arguments array cannot be null");
        this.defaultRegion = method.getDeclaringClass().getSimpleName();
        validateState();
    }

    private String generateTimeBasedId() {
        String string = Long.toString(System.currentTimeMillis());
        return string.substring(9, string.length());
    }

    private String getName() {
        return this.method.getDeclaringClass().getSimpleName() + "." + this.method.getName() + "()";
    }

    private Object unwrapIfAsync(Object obj) throws ExecutionException, InterruptedException {
        if (isAsync()) {
            if (obj instanceof Future) {
                return ((Future) obj).get();
            }
            if (!isReturningVoid()) {
                throw new UnsupportedOperationException("@Async annotated method should return an AsyncResult or void");
            }
        }
        return obj;
    }

    private void validateState() {
        boolean z10 = true;
        if (isUIEvent()) {
            C22462m.m68691w(!isCacheable(), this.method + " cannot be @UIEvent and @Cacheble at the same time.");
            C22462m.m68691w(isCacheEvict() ^ true, this.method + " cannot be @UIEvent and @CacheEvict at the same time.");
        }
        if (isAsync()) {
            if (!isReturningVoid() && !this.method.getReturnType().isAssignableFrom(Future.class)) {
                z10 = false;
            }
            C22462m.m68691w(z10, "The Async annotated method should return an AsyncResult or void");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Invocation) {
            Invocation invocation = (Invocation) obj;
            if (C22459j.m68660a(invocation.instance, this.instance) && C22459j.m68660a(invocation.method, this.method) && Arrays.deepEquals(invocation.args, this.args)) {
                return true;
            }
        }
        return false;
    }

    String getCacheRegionName() {
        Cacheable cacheable = (Cacheable) this.method.getAnnotation(Cacheable.class);
        C22462m.m68685q(cacheable, "Cache region is only declared in Cacheable annotatated methods.");
        String strRegion = cacheable.region();
        return C22466q.m68722b(strRegion) ? this.defaultRegion : strRegion;
    }

    String[] getEvictCacheRegionNames() {
        CacheEvict cacheEvict = (CacheEvict) this.method.getAnnotation(CacheEvict.class);
        C22462m.m68685q(cacheEvict, "Evict regions are only declared in CacheEvict annotated methods.");
        C22462m.m68691w(!isCacheEvictAll(), "Evict regions cannot be enumerated when evictAll is true.");
        String[] strArrRegions = cacheEvict.regions();
        return strArrRegions.length == 0 ? new String[]{this.defaultRegion} : strArrRegions;
    }

    Class getReturnType() {
        return this.method.getReturnType();
    }

    public int hashCode() {
        return C22459j.m68661b(this.args) + C22459j.m68661b(this.instance, this.method);
    }

    Object invoke() throws Exception {
        try {
            generateTimeBasedId();
            prettyPrint();
            Object objUnwrapIfAsync = unwrapIfAsync(this.method.invoke(this.instance, this.args));
            getName();
            return objUnwrapIfAsync;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            C22469t.m68734i(cause, Exception.class);
            throw C22469t.m68731f(cause);
        }
    }

    boolean isAsync() {
        return this.method.getAnnotation(Async.class) != null;
    }

    boolean isBlockingRefresh() {
        Cacheable cacheable = (Cacheable) this.method.getAnnotation(Cacheable.class);
        return cacheable != null && cacheable.blockingRefresh();
    }

    boolean isCacheEvict() {
        return ((CacheEvict) this.method.getAnnotation(CacheEvict.class)) != null;
    }

    boolean isCacheEvictAll() {
        CacheEvict cacheEvict = (CacheEvict) this.method.getAnnotation(CacheEvict.class);
        C22462m.m68685q(cacheEvict, "Evict regions are only declared in CacheEvict annotated methods.");
        return cacheEvict.evictAll();
    }

    boolean isCacheable() {
        return ((Cacheable) this.method.getAnnotation(Cacheable.class)) != null;
    }

    boolean isRequestingNoCacheInstance() {
        return "noCache".equals(this.method.getName());
    }

    boolean isRequestingPreloadInstance() {
        return "preload".equals(this.method.getName());
    }

    public boolean isReturningVoid() {
        return Void.TYPE.equals(this.method.getReturnType());
    }

    boolean isUIEvent() {
        return this.method.getAnnotation(UIEvent.class) != null;
    }

    String prettyPrint() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isUIEvent() ? "@UIEvent" : "      ");
        sb2.append(" ");
        sb2.append(getReturnType().getSimpleName());
        sb2.append(" ");
        sb2.append(getName());
        if (isCacheable()) {
            sb2.append(String.format(" @Cacheable(region=%s) ", getCacheRegionName()));
        }
        if (isCacheEvict()) {
            sb2.append(String.format(" @CacheEvict(%s) ", isCacheEvictAll() ? "evictAll = true" : Arrays.toString(getEvictCacheRegionNames())));
        }
        String str = "";
        sb2.append(isAsync() ? "@Async" : "");
        if (isUIEvent()) {
            str = " creator: " + this.creatorThreadName;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String toString() {
        return getName();
    }
}