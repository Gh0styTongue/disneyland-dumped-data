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
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class CreatePartyFragment_MembersInjector implements MembersInjector<CreatePartyFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<CreatePartyMainAdapter.Factory> createPartyMainAdapterFactoryProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<InterfaceC9336k> locationMonitorProvider;
    private final Provider<VirtualQueueNavigationEntriesProvider> navigationEntriesProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<QueueStateManagement> queueStateManagementProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public CreatePartyFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<InterfaceC9336k> provider12, Provider<VirtualQueueNavigationEntriesProvider> provider13, Provider<C9314j> provider14, Provider<FacilityUtils> provider15, Provider<PerformanceTracking> provider16, Provider<C3821v0.c> provider17, Provider<QueueStateManagement> provider18, Provider<CreatePartyMainAdapter.Factory> provider19) {
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
        this.locationMonitorProvider = provider12;
        this.navigationEntriesProvider = provider13;
        this.parkAppConfigurationProvider = provider14;
        this.facilityUtilsProvider = provider15;
        this.performanceTrackingProvider = provider16;
        this.viewModelFactoryProvider = provider17;
        this.queueStateManagementProvider = provider18;
        this.createPartyMainAdapterFactoryProvider = provider19;
    }

    public static MembersInjector<CreatePartyFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<InterfaceC9336k> provider12, Provider<VirtualQueueNavigationEntriesProvider> provider13, Provider<C9314j> provider14, Provider<FacilityUtils> provider15, Provider<PerformanceTracking> provider16, Provider<C3821v0.c> provider17, Provider<QueueStateManagement> provider18, Provider<CreatePartyMainAdapter.Factory> provider19) {
        return new CreatePartyFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectCreatePartyMainAdapterFactory(CreatePartyFragment createPartyFragment, CreatePartyMainAdapter.Factory factory) {
        createPartyFragment.createPartyMainAdapterFactory = factory;
    }

    public static void injectFacilityUtils(CreatePartyFragment createPartyFragment, FacilityUtils facilityUtils) {
        createPartyFragment.facilityUtils = facilityUtils;
    }

    public static void injectLocationMonitor(CreatePartyFragment createPartyFragment, InterfaceC9336k interfaceC9336k) {
        createPartyFragment.locationMonitor = interfaceC9336k;
    }

    public static void injectNavigationEntriesProvider(CreatePartyFragment createPartyFragment, VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        createPartyFragment.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public static void injectParkAppConfiguration(CreatePartyFragment createPartyFragment, C9314j c9314j) {
        createPartyFragment.parkAppConfiguration = c9314j;
    }

    public static void injectPerformanceTracking(CreatePartyFragment createPartyFragment, PerformanceTracking performanceTracking) {
        createPartyFragment.performanceTracking = performanceTracking;
    }

    public static void injectQueueStateManagement(CreatePartyFragment createPartyFragment, QueueStateManagement queueStateManagement) {
        createPartyFragment.queueStateManagement = queueStateManagement;
    }

    public static void injectViewModelFactory(CreatePartyFragment createPartyFragment, C3821v0.c cVar) {
        createPartyFragment.viewModelFactory = cVar;
    }

    public static void injectVirtualQueueAnalytics(CreatePartyFragment createPartyFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        createPartyFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(CreatePartyFragment createPartyFragment, VirtualQueueManager virtualQueueManager) {
        createPartyFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreatePartyFragment createPartyFragment) {
        C9308e.m38895d(createPartyFragment, this.busProvider.get());
        C9308e.m38892a(createPartyFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(createPartyFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(createPartyFragment, this.crashHelperProvider.get());
        C9308e.m38897g(createPartyFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(createPartyFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(createPartyFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(createPartyFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(createPartyFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(createPartyFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(createPartyFragment, this.virtualQueueAnalyticsProvider.get());
        injectLocationMonitor(createPartyFragment, this.locationMonitorProvider.get());
        injectNavigationEntriesProvider(createPartyFragment, this.navigationEntriesProvider.get());
        injectParkAppConfiguration(createPartyFragment, this.parkAppConfigurationProvider.get());
        injectFacilityUtils(createPartyFragment, this.facilityUtilsProvider.get());
        injectPerformanceTracking(createPartyFragment, this.performanceTrackingProvider.get());
        injectViewModelFactory(createPartyFragment, this.viewModelFactoryProvider.get());
        injectQueueStateManagement(createPartyFragment, this.queueStateManagementProvider.get());
        injectCreatePartyMainAdapterFactory(createPartyFragment, this.createPartyMainAdapterFactoryProvider.get());
    }
}