package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.SharedPreferences;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.leave_queue.LeaveQueueMainAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class LeaveQueueFragment_MembersInjector implements MembersInjector<LeaveQueueFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<LeaveQueueMainAdapter.Factory> leaveQueueMainAdapterFactoryProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public LeaveQueueFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<SharedPreferences> provider12, Provider<PerformanceTracking> provider13, Provider<FacilityUtils> provider14, Provider<LeaveQueueMainAdapter.Factory> provider15) {
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
        this.sharedPreferencesProvider = provider12;
        this.performanceTrackingProvider = provider13;
        this.facilityUtilsProvider = provider14;
        this.leaveQueueMainAdapterFactoryProvider = provider15;
    }

    public static MembersInjector<LeaveQueueFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<SharedPreferences> provider12, Provider<PerformanceTracking> provider13, Provider<FacilityUtils> provider14, Provider<LeaveQueueMainAdapter.Factory> provider15) {
        return new LeaveQueueFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectFacilityUtils(LeaveQueueFragment leaveQueueFragment, FacilityUtils facilityUtils) {
        leaveQueueFragment.facilityUtils = facilityUtils;
    }

    public static void injectLeaveQueueMainAdapterFactory(LeaveQueueFragment leaveQueueFragment, LeaveQueueMainAdapter.Factory factory) {
        leaveQueueFragment.leaveQueueMainAdapterFactory = factory;
    }

    public static void injectPerformanceTracking(LeaveQueueFragment leaveQueueFragment, PerformanceTracking performanceTracking) {
        leaveQueueFragment.performanceTracking = performanceTracking;
    }

    public static void injectSharedPreferences(LeaveQueueFragment leaveQueueFragment, SharedPreferences sharedPreferences) {
        leaveQueueFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectVirtualQueueAnalytics(LeaveQueueFragment leaveQueueFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        leaveQueueFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(LeaveQueueFragment leaveQueueFragment, VirtualQueueManager virtualQueueManager) {
        leaveQueueFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LeaveQueueFragment leaveQueueFragment) {
        C9308e.m38895d(leaveQueueFragment, this.busProvider.get());
        C9308e.m38892a(leaveQueueFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(leaveQueueFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(leaveQueueFragment, this.crashHelperProvider.get());
        C9308e.m38897g(leaveQueueFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(leaveQueueFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(leaveQueueFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(leaveQueueFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(leaveQueueFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(leaveQueueFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(leaveQueueFragment, this.virtualQueueAnalyticsProvider.get());
        injectSharedPreferences(leaveQueueFragment, this.sharedPreferencesProvider.get());
        injectPerformanceTracking(leaveQueueFragment, this.performanceTrackingProvider.get());
        injectFacilityUtils(leaveQueueFragment, this.facilityUtilsProvider.get());
        injectLeaveQueueMainAdapterFactory(leaveQueueFragment, this.leaveQueueMainAdapterFactoryProvider.get());
    }
}