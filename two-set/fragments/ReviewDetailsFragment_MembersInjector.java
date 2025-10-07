package com.disney.wdpro.virtualqueue.core.fragments;

import androidx.view.C3821v0;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class ReviewDetailsFragment_MembersInjector implements MembersInjector<ReviewDetailsFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<CreatePartyMainAdapter.Factory> createPartyMainAdapterFactoryProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<InterfaceC9336k> locationMonitorProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PartyListAdapter.Factory> partyListAdapterFactoryProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<QueueStateManagement> queueStateManagementProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public ReviewDetailsFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<PerformanceTracking> provider12, Provider<InterfaceC9336k> provider13, Provider<C9314j> provider14, Provider<FacilityUtils> provider15, Provider<C3821v0.c> provider16, Provider<QueueStateManagement> provider17, Provider<PartyListAdapter.Factory> provider18, Provider<CreatePartyMainAdapter.Factory> provider19) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.virtualQueueRepositoryProvider = provider7;
        this.vqThemerProvider = provider8;
        this.authenticationManagerProvider2 = provider9;
        this.virtualQueueManagerProvider = provider10;
        this.virtualQueueAnalyticsProvider = provider11;
        this.performanceTrackingProvider = provider12;
        this.locationMonitorProvider = provider13;
        this.parkAppConfigurationProvider = provider14;
        this.facilityUtilsProvider = provider15;
        this.viewModelFactoryProvider = provider16;
        this.queueStateManagementProvider = provider17;
        this.partyListAdapterFactoryProvider = provider18;
        this.createPartyMainAdapterFactoryProvider = provider19;
    }

    public static MembersInjector<ReviewDetailsFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<PerformanceTracking> provider12, Provider<InterfaceC9336k> provider13, Provider<C9314j> provider14, Provider<FacilityUtils> provider15, Provider<C3821v0.c> provider16, Provider<QueueStateManagement> provider17, Provider<PartyListAdapter.Factory> provider18, Provider<CreatePartyMainAdapter.Factory> provider19) {
        return new ReviewDetailsFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectCreatePartyMainAdapterFactory(ReviewDetailsFragment reviewDetailsFragment, CreatePartyMainAdapter.Factory factory) {
        reviewDetailsFragment.createPartyMainAdapterFactory = factory;
    }

    public static void injectFacilityUtils(ReviewDetailsFragment reviewDetailsFragment, FacilityUtils facilityUtils) {
        reviewDetailsFragment.facilityUtils = facilityUtils;
    }

    public static void injectLocationMonitor(ReviewDetailsFragment reviewDetailsFragment, InterfaceC9336k interfaceC9336k) {
        reviewDetailsFragment.locationMonitor = interfaceC9336k;
    }

    public static void injectParkAppConfiguration(ReviewDetailsFragment reviewDetailsFragment, C9314j c9314j) {
        reviewDetailsFragment.parkAppConfiguration = c9314j;
    }

    public static void injectPartyListAdapterFactory(ReviewDetailsFragment reviewDetailsFragment, PartyListAdapter.Factory factory) {
        reviewDetailsFragment.partyListAdapterFactory = factory;
    }

    public static void injectPerformanceTracking(ReviewDetailsFragment reviewDetailsFragment, PerformanceTracking performanceTracking) {
        reviewDetailsFragment.performanceTracking = performanceTracking;
    }

    public static void injectQueueStateManagement(ReviewDetailsFragment reviewDetailsFragment, QueueStateManagement queueStateManagement) {
        reviewDetailsFragment.queueStateManagement = queueStateManagement;
    }

    public static void injectViewModelFactory(ReviewDetailsFragment reviewDetailsFragment, C3821v0.c cVar) {
        reviewDetailsFragment.viewModelFactory = cVar;
    }

    public static void injectVirtualQueueAnalytics(ReviewDetailsFragment reviewDetailsFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        reviewDetailsFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(ReviewDetailsFragment reviewDetailsFragment, VirtualQueueManager virtualQueueManager) {
        reviewDetailsFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReviewDetailsFragment reviewDetailsFragment) {
        C9308e.m38895d(reviewDetailsFragment, this.busProvider.get());
        C9308e.m38892a(reviewDetailsFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(reviewDetailsFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(reviewDetailsFragment, this.crashHelperProvider.get());
        C9308e.m38897g(reviewDetailsFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(reviewDetailsFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(reviewDetailsFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(reviewDetailsFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(reviewDetailsFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(reviewDetailsFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(reviewDetailsFragment, this.virtualQueueAnalyticsProvider.get());
        injectPerformanceTracking(reviewDetailsFragment, this.performanceTrackingProvider.get());
        injectLocationMonitor(reviewDetailsFragment, this.locationMonitorProvider.get());
        injectParkAppConfiguration(reviewDetailsFragment, this.parkAppConfigurationProvider.get());
        injectFacilityUtils(reviewDetailsFragment, this.facilityUtilsProvider.get());
        injectViewModelFactory(reviewDetailsFragment, this.viewModelFactoryProvider.get());
        injectQueueStateManagement(reviewDetailsFragment, this.queueStateManagementProvider.get());
        injectPartyListAdapterFactory(reviewDetailsFragment, this.partyListAdapterFactoryProvider.get());
        injectCreatePartyMainAdapterFactory(reviewDetailsFragment, this.createPartyMainAdapterFactoryProvider.get());
    }
}