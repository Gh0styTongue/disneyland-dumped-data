package com.disney.wdpro.virtualqueue.core.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.VirtualQueueDestinationProviderImpl;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.redeem.RedeemAdapter;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class RedeemFragment_MembersInjector implements MembersInjector<RedeemFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<RedeemAdapter.Factory> redeemAdapterFactoryProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueDestinationProviderImpl> virtualQueueDestinationProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public RedeemFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<PerformanceTracking> provider12, Provider<VirtualQueueDestinationProviderImpl> provider13, Provider<RedeemAdapter.Factory> provider14) {
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
        this.virtualQueueDestinationProvider = provider13;
        this.redeemAdapterFactoryProvider = provider14;
    }

    public static MembersInjector<RedeemFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<PerformanceTracking> provider12, Provider<VirtualQueueDestinationProviderImpl> provider13, Provider<RedeemAdapter.Factory> provider14) {
        return new RedeemFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectPerformanceTracking(RedeemFragment redeemFragment, PerformanceTracking performanceTracking) {
        redeemFragment.performanceTracking = performanceTracking;
    }

    public static void injectRedeemAdapterFactory(RedeemFragment redeemFragment, RedeemAdapter.Factory factory) {
        redeemFragment.redeemAdapterFactory = factory;
    }

    public static void injectVirtualQueueAnalytics(RedeemFragment redeemFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        redeemFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueDestinationProvider(RedeemFragment redeemFragment, VirtualQueueDestinationProviderImpl virtualQueueDestinationProviderImpl) {
        redeemFragment.virtualQueueDestinationProvider = virtualQueueDestinationProviderImpl;
    }

    public static void injectVirtualQueueManager(RedeemFragment redeemFragment, VirtualQueueManager virtualQueueManager) {
        redeemFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RedeemFragment redeemFragment) {
        C9308e.m38895d(redeemFragment, this.busProvider.get());
        C9308e.m38892a(redeemFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(redeemFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(redeemFragment, this.crashHelperProvider.get());
        C9308e.m38897g(redeemFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(redeemFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(redeemFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(redeemFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(redeemFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(redeemFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(redeemFragment, this.virtualQueueAnalyticsProvider.get());
        injectPerformanceTracking(redeemFragment, this.performanceTrackingProvider.get());
        injectVirtualQueueDestinationProvider(redeemFragment, this.virtualQueueDestinationProvider.get());
        injectRedeemAdapterFactory(redeemFragment, this.redeemAdapterFactoryProvider.get());
    }
}