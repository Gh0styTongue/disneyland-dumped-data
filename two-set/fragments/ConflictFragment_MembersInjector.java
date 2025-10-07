package com.disney.wdpro.virtualqueue.core.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class ConflictFragment_MembersInjector implements MembersInjector<ConflictFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<ConflictGuestAdapter.Factory> conflictGuestAdapterFactoryProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<InterfaceC9336k> locationMonitorProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public ConflictFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<InterfaceC9336k> provider12, Provider<FacilityUtils> provider13, Provider<PerformanceTracking> provider14, Provider<ConflictGuestAdapter.Factory> provider15) {
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
        this.facilityUtilsProvider = provider13;
        this.performanceTrackingProvider = provider14;
        this.conflictGuestAdapterFactoryProvider = provider15;
    }

    public static MembersInjector<ConflictFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<InterfaceC9336k> provider12, Provider<FacilityUtils> provider13, Provider<PerformanceTracking> provider14, Provider<ConflictGuestAdapter.Factory> provider15) {
        return new ConflictFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectConflictGuestAdapterFactory(ConflictFragment conflictFragment, ConflictGuestAdapter.Factory factory) {
        conflictFragment.conflictGuestAdapterFactory = factory;
    }

    public static void injectFacilityUtils(ConflictFragment conflictFragment, FacilityUtils facilityUtils) {
        conflictFragment.facilityUtils = facilityUtils;
    }

    public static void injectLocationMonitor(ConflictFragment conflictFragment, InterfaceC9336k interfaceC9336k) {
        conflictFragment.locationMonitor = interfaceC9336k;
    }

    public static void injectPerformanceTracking(ConflictFragment conflictFragment, PerformanceTracking performanceTracking) {
        conflictFragment.performanceTracking = performanceTracking;
    }

    public static void injectVirtualQueueAnalytics(ConflictFragment conflictFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        conflictFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(ConflictFragment conflictFragment, VirtualQueueManager virtualQueueManager) {
        conflictFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ConflictFragment conflictFragment) {
        C9308e.m38895d(conflictFragment, this.busProvider.get());
        C9308e.m38892a(conflictFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(conflictFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(conflictFragment, this.crashHelperProvider.get());
        C9308e.m38897g(conflictFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(conflictFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(conflictFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(conflictFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(conflictFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(conflictFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(conflictFragment, this.virtualQueueAnalyticsProvider.get());
        injectLocationMonitor(conflictFragment, this.locationMonitorProvider.get());
        injectFacilityUtils(conflictFragment, this.facilityUtilsProvider.get());
        injectPerformanceTracking(conflictFragment, this.performanceTrackingProvider.get());
        injectConflictGuestAdapterFactory(conflictFragment, this.conflictGuestAdapterFactoryProvider.get());
    }
}