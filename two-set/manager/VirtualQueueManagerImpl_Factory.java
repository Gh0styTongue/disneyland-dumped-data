package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueManagerImpl_Factory implements InterfaceC30583e<VirtualQueueManagerImpl> {
    private final Provider<VirtualQueueServiceApi> apiProvider;
    private final Provider<VirtualQueueRegions> vqRegionsProvider;

    public VirtualQueueManagerImpl_Factory(Provider<VirtualQueueServiceApi> provider, Provider<VirtualQueueRegions> provider2) {
        this.apiProvider = provider;
        this.vqRegionsProvider = provider2;
    }

    public static VirtualQueueManagerImpl_Factory create(Provider<VirtualQueueServiceApi> provider, Provider<VirtualQueueRegions> provider2) {
        return new VirtualQueueManagerImpl_Factory(provider, provider2);
    }

    public static VirtualQueueManagerImpl newInstance(VirtualQueueServiceApi virtualQueueServiceApi, VirtualQueueRegions virtualQueueRegions) {
        return new VirtualQueueManagerImpl(virtualQueueServiceApi, virtualQueueRegions);
    }

    @Override // javax.inject.Provider
    public VirtualQueueManagerImpl get() {
        return newInstance(this.apiProvider.get(), this.vqRegionsProvider.get());
    }
}