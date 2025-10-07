package com.disney.wdpro.virtualqueue.core.viewmodels;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PartyViewModel_Factory implements InterfaceC30583e<PartyViewModel> {
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<LoggedInUser> loggedInUserProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public PartyViewModel_Factory(Provider<VirtualQueueManager> provider, Provider<FacilityUtils> provider2, Provider<VirtualQueueThemer> provider3, Provider<VirtualQueueAnalytics> provider4, Provider<PerformanceTracking> provider5, Provider<C9314j> provider6, Provider<LoggedInUser> provider7) {
        this.virtualQueueManagerProvider = provider;
        this.facilityUtilsProvider = provider2;
        this.vqThemerProvider = provider3;
        this.virtualQueueAnalyticsProvider = provider4;
        this.performanceTrackingProvider = provider5;
        this.parkAppConfigurationProvider = provider6;
        this.loggedInUserProvider = provider7;
    }

    public static PartyViewModel_Factory create(Provider<VirtualQueueManager> provider, Provider<FacilityUtils> provider2, Provider<VirtualQueueThemer> provider3, Provider<VirtualQueueAnalytics> provider4, Provider<PerformanceTracking> provider5, Provider<C9314j> provider6, Provider<LoggedInUser> provider7) {
        return new PartyViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static PartyViewModel newInstance() {
        return new PartyViewModel();
    }

    @Override // javax.inject.Provider
    public PartyViewModel get() {
        PartyViewModel partyViewModelNewInstance = newInstance();
        PartyViewModel_MembersInjector.injectVirtualQueueManager(partyViewModelNewInstance, this.virtualQueueManagerProvider.get());
        PartyViewModel_MembersInjector.injectFacilityUtils(partyViewModelNewInstance, this.facilityUtilsProvider.get());
        PartyViewModel_MembersInjector.injectVqThemer(partyViewModelNewInstance, this.vqThemerProvider.get());
        PartyViewModel_MembersInjector.injectVirtualQueueAnalytics(partyViewModelNewInstance, this.virtualQueueAnalyticsProvider.get());
        PartyViewModel_MembersInjector.injectPerformanceTracking(partyViewModelNewInstance, this.performanceTrackingProvider.get());
        PartyViewModel_MembersInjector.injectParkAppConfiguration(partyViewModelNewInstance, this.parkAppConfigurationProvider.get());
        PartyViewModel_MembersInjector.injectLoggedInUser(partyViewModelNewInstance, this.loggedInUserProvider.get());
        return partyViewModelNewInstance;
    }
}