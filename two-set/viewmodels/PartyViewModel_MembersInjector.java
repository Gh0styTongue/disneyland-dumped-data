package com.disney.wdpro.virtualqueue.core.viewmodels;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class PartyViewModel_MembersInjector implements MembersInjector<PartyViewModel> {
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<LoggedInUser> loggedInUserProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public PartyViewModel_MembersInjector(Provider<VirtualQueueManager> provider, Provider<FacilityUtils> provider2, Provider<VirtualQueueThemer> provider3, Provider<VirtualQueueAnalytics> provider4, Provider<PerformanceTracking> provider5, Provider<C9314j> provider6, Provider<LoggedInUser> provider7) {
        this.virtualQueueManagerProvider = provider;
        this.facilityUtilsProvider = provider2;
        this.vqThemerProvider = provider3;
        this.virtualQueueAnalyticsProvider = provider4;
        this.performanceTrackingProvider = provider5;
        this.parkAppConfigurationProvider = provider6;
        this.loggedInUserProvider = provider7;
    }

    public static MembersInjector<PartyViewModel> create(Provider<VirtualQueueManager> provider, Provider<FacilityUtils> provider2, Provider<VirtualQueueThemer> provider3, Provider<VirtualQueueAnalytics> provider4, Provider<PerformanceTracking> provider5, Provider<C9314j> provider6, Provider<LoggedInUser> provider7) {
        return new PartyViewModel_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectFacilityUtils(PartyViewModel partyViewModel, FacilityUtils facilityUtils) {
        partyViewModel.facilityUtils = facilityUtils;
    }

    public static void injectLoggedInUser(PartyViewModel partyViewModel, LoggedInUser loggedInUser) {
        partyViewModel.loggedInUser = loggedInUser;
    }

    public static void injectParkAppConfiguration(PartyViewModel partyViewModel, C9314j c9314j) {
        partyViewModel.parkAppConfiguration = c9314j;
    }

    public static void injectPerformanceTracking(PartyViewModel partyViewModel, PerformanceTracking performanceTracking) {
        partyViewModel.performanceTracking = performanceTracking;
    }

    public static void injectVirtualQueueAnalytics(PartyViewModel partyViewModel, VirtualQueueAnalytics virtualQueueAnalytics) {
        partyViewModel.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(PartyViewModel partyViewModel, VirtualQueueManager virtualQueueManager) {
        partyViewModel.virtualQueueManager = virtualQueueManager;
    }

    public static void injectVqThemer(PartyViewModel partyViewModel, VirtualQueueThemer virtualQueueThemer) {
        partyViewModel.vqThemer = virtualQueueThemer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PartyViewModel partyViewModel) {
        injectVirtualQueueManager(partyViewModel, this.virtualQueueManagerProvider.get());
        injectFacilityUtils(partyViewModel, this.facilityUtilsProvider.get());
        injectVqThemer(partyViewModel, this.vqThemerProvider.get());
        injectVirtualQueueAnalytics(partyViewModel, this.virtualQueueAnalyticsProvider.get());
        injectPerformanceTracking(partyViewModel, this.performanceTrackingProvider.get());
        injectParkAppConfiguration(partyViewModel, this.parkAppConfigurationProvider.get());
        injectLoggedInUser(partyViewModel, this.loggedInUserProvider.get());
    }
}