package com.disney.wdpro.midichlorian;

import com.google.common.base.C22462m;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.InterfaceC22534h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class InvocationCache {
    private final CacheLoader<Invocation, Object> cacheLoader;
    private final ConcurrentMap<String, InterfaceC22534h> cacheRegionMap = new ConcurrentHashMap(16);
    private final CacheSpec regionsSpec;

    @Inject
    public InvocationCache(CacheLoader<Invocation, Object> cacheLoader, CacheSpec cacheSpec) {
        this.cacheLoader = (CacheLoader) C22462m.m68685q(cacheLoader, "The cacheLoader cannot be null");
        this.regionsSpec = (CacheSpec) C22462m.m68685q(cacheSpec, "The regions spec cannot be null");
    }

    private synchronized InterfaceC22534h<Invocation, ?> getRegion(String str) {
        InterfaceC22534h<Invocation, ?> interfaceC22534hM68758b;
        interfaceC22534hM68758b = this.cacheRegionMap.get(str);
        if (interfaceC22534hM68758b == null) {
            interfaceC22534hM68758b = CacheBuilder.m68743i(this.regionsSpec.getRegionSpec(str)).m68746D().m68758b(this.cacheLoader);
            this.cacheRegionMap.put(str, interfaceC22534hM68758b);
        }
        return interfaceC22534hM68758b;
    }

    <T> T get(Invocation invocation) throws ExecutionException {
        C22462m.m68685q(invocation, "The invocation name cannot be null");
        InterfaceC22534h<Invocation, ?> region = getRegion(invocation.getCacheRegionName());
        region.stats();
        T t10 = (T) region.get(invocation);
        region.stats();
        return t10;
    }

    void invalidate(Invocation invocation) {
        C22462m.m68685q(invocation, "the invocation cannot be null");
        String cacheRegionName = invocation.getCacheRegionName();
        if (this.cacheRegionMap.containsKey(cacheRegionName)) {
            this.cacheRegionMap.get(cacheRegionName).invalidate(invocation);
        }
    }

    public void invalidateAll() {
        Iterator<InterfaceC22534h> it = this.cacheRegionMap.values().iterator();
        while (it.hasNext()) {
            it.next().invalidateAll();
        }
    }

    void invalidateEvictRegions(Invocation invocation) {
        C22462m.m68685q(invocation, "the invocation cannot be null");
        for (String str : invocation.getEvictCacheRegionNames()) {
            if (this.cacheRegionMap.containsKey(str)) {
                InterfaceC22534h interfaceC22534h = this.cacheRegionMap.get(str);
                interfaceC22534h.invalidateAll();
                interfaceC22534h.stats();
            }
        }
    }
}