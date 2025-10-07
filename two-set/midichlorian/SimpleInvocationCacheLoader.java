package com.disney.wdpro.midichlorian;

import com.google.common.cache.CacheLoader;
import com.google.common.util.concurrent.C22888g;
import com.google.common.util.concurrent.C22898o;
import com.google.common.util.concurrent.C22904u;
import com.google.common.util.concurrent.InterfaceFutureC22897n;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class SimpleInvocationCacheLoader extends CacheLoader<Invocation, Object> {
    private final ExecutorService executor = Executors.newFixedThreadPool(2, new C22904u().m69939f("cache-refresh-%d").m69937b());

    @Override // com.google.common.cache.CacheLoader
    public Object load(Invocation invocation) throws Exception {
        return invocation.invoke();
    }

    @Override // com.google.common.cache.CacheLoader
    public InterfaceFutureC22897n<Object> reload(final Invocation invocation, Object obj) throws Exception {
        if (invocation.isBlockingRefresh()) {
            return C22888g.m69921e(invocation.invoke());
        }
        C22898o c22898oM69927a = C22898o.m69927a(new Callable<Object>() { // from class: com.disney.wdpro.midichlorian.SimpleInvocationCacheLoader.1
            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                return invocation.invoke();
            }
        });
        this.executor.execute(c22898oM69927a);
        return c22898oM69927a;
    }
}