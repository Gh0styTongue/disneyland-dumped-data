package com.disney.wdpro.virtualqueue.core.manager.dashboard;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueDashboardProviderImpl_Factory implements InterfaceC30583e<VirtualQueueDashboardProviderImpl> {
    private final Provider<C9248i> vendomaticProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueDashboardProviderImpl_Factory(Provider<C9248i> provider, Provider<VirtualQueueThemer> provider2) {
        this.vendomaticProvider = provider;
        this.vqThemerProvider = provider2;
    }

    public static VirtualQueueDashboardProviderImpl_Factory create(Provider<C9248i> provider, Provider<VirtualQueueThemer> provider2) {
        return new VirtualQueueDashboardProviderImpl_Factory(provider, provider2);
    }

    public static VirtualQueueDashboardProviderImpl newInstance(C9248i c9248i, VirtualQueueThemer virtualQueueThemer) {
        return new VirtualQueueDashboardProviderImpl(c9248i, virtualQueueThemer);
    }

    @Override // javax.inject.Provider
    public VirtualQueueDashboardProviderImpl get() {
        return newInstance(this.vendomaticProvider.get(), this.vqThemerProvider.get());
    }
}