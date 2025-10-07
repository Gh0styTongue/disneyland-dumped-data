package com.disney.wdpro.virtualqueue.core.viewmodels;

import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class HubLandingViewModel_Factory implements InterfaceC30583e<HubLandingViewModel> {
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public HubLandingViewModel_Factory(Provider<VirtualQueueManager> provider, Provider<VirtualQueueThemer> provider2) {
        this.virtualQueueManagerProvider = provider;
        this.vqThemerProvider = provider2;
    }

    public static HubLandingViewModel_Factory create(Provider<VirtualQueueManager> provider, Provider<VirtualQueueThemer> provider2) {
        return new HubLandingViewModel_Factory(provider, provider2);
    }

    public static HubLandingViewModel newInstance() {
        return new HubLandingViewModel();
    }

    @Override // javax.inject.Provider
    public HubLandingViewModel get() {
        HubLandingViewModel hubLandingViewModelNewInstance = newInstance();
        HubLandingViewModel_MembersInjector.injectVirtualQueueManager(hubLandingViewModelNewInstance, this.virtualQueueManagerProvider.get());
        HubLandingViewModel_MembersInjector.injectVqThemer(hubLandingViewModelNewInstance, this.vqThemerProvider.get());
        return hubLandingViewModelNewInstance;
    }
}