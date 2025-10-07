package com.disney.wdpro.virtualqueue.core.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class VirtualQueueConfirmationFragment_MembersInjector implements MembersInjector<VirtualQueueConfirmationFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<QueuesPositionsAdapter.Factory> queuesPositionsAdapterFactoryProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueAnalytics> vqAnalyticsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueConfirmationFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<C9314j> provider12, Provider<PerformanceTracking> provider13, Provider<VirtualQueueAnalytics> provider14, Provider<QueuesPositionsAdapter.Factory> provider15) {
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
        this.parkAppConfigurationProvider = provider12;
        this.performanceTrackingProvider = provider13;
        this.vqAnalyticsProvider = provider14;
        this.queuesPositionsAdapterFactoryProvider = provider15;
    }

    public static MembersInjector<VirtualQueueConfirmationFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<C9314j> provider12, Provider<PerformanceTracking> provider13, Provider<VirtualQueueAnalytics> provider14, Provider<QueuesPositionsAdapter.Factory> provider15) {
        return new VirtualQueueConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectParkAppConfiguration(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment, C9314j c9314j) {
        virtualQueueConfirmationFragment.parkAppConfiguration = c9314j;
    }

    public static void injectPerformanceTracking(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment, PerformanceTracking performanceTracking) {
        virtualQueueConfirmationFragment.performanceTracking = performanceTracking;
    }

    public static void injectQueuesPositionsAdapterFactory(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment, QueuesPositionsAdapter.Factory factory) {
        virtualQueueConfirmationFragment.queuesPositionsAdapterFactory = factory;
    }

    public static void injectVirtualQueueAnalytics(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        virtualQueueConfirmationFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment, VirtualQueueManager virtualQueueManager) {
        virtualQueueConfirmationFragment.virtualQueueManager = virtualQueueManager;
    }

    public static void injectVqAnalytics(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        virtualQueueConfirmationFragment.vqAnalytics = virtualQueueAnalytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VirtualQueueConfirmationFragment virtualQueueConfirmationFragment) {
        C9308e.m38895d(virtualQueueConfirmationFragment, this.busProvider.get());
        C9308e.m38892a(virtualQueueConfirmationFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(virtualQueueConfirmationFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(virtualQueueConfirmationFragment, this.crashHelperProvider.get());
        C9308e.m38897g(virtualQueueConfirmationFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(virtualQueueConfirmationFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(virtualQueueConfirmationFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(virtualQueueConfirmationFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(virtualQueueConfirmationFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(virtualQueueConfirmationFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(virtualQueueConfirmationFragment, this.virtualQueueAnalyticsProvider.get());
        injectParkAppConfiguration(virtualQueueConfirmationFragment, this.parkAppConfigurationProvider.get());
        injectPerformanceTracking(virtualQueueConfirmationFragment, this.performanceTrackingProvider.get());
        injectVqAnalytics(virtualQueueConfirmationFragment, this.vqAnalyticsProvider.get());
        injectQueuesPositionsAdapterFactory(virtualQueueConfirmationFragment, this.queuesPositionsAdapterFactoryProvider.get());
    }
}