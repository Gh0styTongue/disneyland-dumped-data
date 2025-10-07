package com.disney.wdpro.midichlorian;

import com.google.common.base.C22457h;
import com.google.common.base.C22462m;
import com.google.common.util.concurrent.C22904u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class ProxyFactory {
    private static final String ASYNC_THREAD_PREFIX = "async";
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE;
    private static final String PRELOAD_THREAD_PREFIX = "preload";
    private static final String UIEVENT_THREAD_PREFIX = "uievent";
    private ExecutorService asyncExecutor;
    private final InvocationCallableFactory callableFactory;
    private ExecutorService preloadExecutor;
    private final ExecutionThreadEnforcer threadEnforcer;
    private ExecutorService uiEventExecutor;

    public interface ExecutionThreadEnforcer {
        void enforceNonUI(String str);

        void enforceUI(String str);
    }

    private final class ProxyInvocationHandler<T> implements InvocationHandler {
        private final T apiClient;
        private final boolean noCacheInstance;
        private final boolean preloadInstance;

        ProxyInvocationHandler(T t10, boolean z10, boolean z11) {
            this.apiClient = t10;
            this.noCacheInstance = z10;
            this.preloadInstance = z11;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Invocation invocation = new Invocation(this.apiClient, method, (Object[]) C22457h.m68644a(objArr, new Object[0]));
            if (invocation.isRequestingNoCacheInstance()) {
                return ProxyFactory.this.createProxy(this.apiClient, true, this.preloadInstance);
            }
            if (invocation.isRequestingPreloadInstance()) {
                return ProxyFactory.this.createProxy(this.apiClient, this.noCacheInstance, true);
            }
            Callable<T> callableCreate = ProxyFactory.this.callableFactory.create(invocation, this.noCacheInstance, this.preloadInstance);
            if (!invocation.isUIEvent()) {
                return invocation.isAsync() ? ProxyFactory.this.asyncExecutor.submit(callableCreate) : callableCreate.call();
            }
            ProxyFactory.this.threadEnforcer.enforceUI(method.getName());
            if (this.preloadInstance) {
                ProxyFactory.this.preloadExecutor.submit(callableCreate);
                return null;
            }
            ProxyFactory.this.uiEventExecutor.submit(callableCreate);
            return null;
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        CORE_POOL_SIZE = iAvailableProcessors + 1;
        MAXIMUM_POOL_SIZE = (iAvailableProcessors * 2) + 1;
    }

    @Inject
    public ProxyFactory(InvocationCallableFactory invocationCallableFactory, ExecutionThreadEnforcer executionThreadEnforcer) {
        this.uiEventExecutor = createThreadPool(UIEVENT_THREAD_PREFIX);
        this.preloadExecutor = Executors.newFixedThreadPool(2, createNamedFactory(PRELOAD_THREAD_PREFIX));
        this.asyncExecutor = createThreadPool(ASYNC_THREAD_PREFIX);
        this.callableFactory = (InvocationCallableFactory) C22462m.m68685q(invocationCallableFactory, "The callable factory cannot be null.");
        this.threadEnforcer = (ExecutionThreadEnforcer) C22462m.m68685q(executionThreadEnforcer, "The threadEnforcer cannot be null.");
    }

    private static final ThreadFactory createNamedFactory(String str) {
        return new C22904u().m69939f(str + "-%d").m69937b();
    }

    private static final ThreadPoolExecutor createThreadPool(String str) {
        return new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), createNamedFactory(str));
    }

    public <T> T createProxy(T t10) {
        return (T) createProxy(t10, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T createProxy(T t10, boolean z10, boolean z11) {
        C22462m.m68685q(t10, "The apiClient cannot be null.");
        return (T) Proxy.newProxyInstance(t10.getClass().getClassLoader(), t10.getClass().getInterfaces(), new ProxyInvocationHandler(t10, z10, z11));
    }

    protected ProxyFactory(InvocationCallableFactory invocationCallableFactory, ExecutionThreadEnforcer executionThreadEnforcer, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        this.uiEventExecutor = createThreadPool(UIEVENT_THREAD_PREFIX);
        this.preloadExecutor = Executors.newFixedThreadPool(2, createNamedFactory(PRELOAD_THREAD_PREFIX));
        this.asyncExecutor = createThreadPool(ASYNC_THREAD_PREFIX);
        this.callableFactory = (InvocationCallableFactory) C22462m.m68685q(invocationCallableFactory, "The callable factory cannot be null.");
        this.threadEnforcer = (ExecutionThreadEnforcer) C22462m.m68685q(executionThreadEnforcer, "The threadEnforcer cannot be null.");
        this.uiEventExecutor = (ExecutorService) C22462m.m68685q(executorService, "The uiEventExecutor cannot be null.");
        this.preloadExecutor = (ExecutorService) C22462m.m68685q(executorService2, "The preloadExecutor cannot be null.");
        this.asyncExecutor = (ExecutorService) C22462m.m68685q(executorService3, "The asyncExecutor cannot be null.");
    }
}