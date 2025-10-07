package com.disney.wdpro.virtualqueue.core.viewmodels;

import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class HubLandingViewModel_MembersInjector implements MembersInjector<HubLandingViewModel> {
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public HubLandingViewModel_MembersInjector(Provider<VirtualQueueManager> provider, Provider<VirtualQueueThemer> provider2) {
        this.virtualQueueManagerProvider = provider;
        this.vqThemerProvider = provider2;
    }

    public static MembersInjector<HubLandingViewModel> create(Provider<VirtualQueueManager> provider, Provider<VirtualQueueThemer> provider2) {
        return new HubLandingViewModel_MembersInjector(provider, provider2);
    }

    public static void injectVirtualQueueManager(HubLandingViewModel hubLandingViewModel, VirtualQueueManager virtualQueueManager) {
        hubLandingViewModel.virtualQueueManager = virtualQueueManager;
    }

    public static void injectVqThemer(HubLandingViewModel hubLandingViewModel, VirtualQueueThemer virtualQueueThemer) {
        hubLandingViewModel.vqThemer = virtualQueueThemer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HubLandingViewModel hubLandingViewModel) {
        injectVirtualQueueManager(hubLandingViewModel, this.virtualQueueManagerProvider.get());
        injectVqThemer(hubLandingViewModel, this.vqThemerProvider.get());
    }
}