package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.SharedPreferences;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
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
public final class DetailFragment_MembersInjector implements MembersInjector<DetailFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<LoggedInUser> loggedInUserProvider;
    private final Provider<VirtualQueueNavigationEntriesProvider> navigationEntriesProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PeekViewActions> peekViewActionsProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<QueuesPositionsAdapter.Factory> queuesPositionsAdapterFactoryProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueAnalytics> vqAnalyticsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public DetailFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<VirtualQueueNavigationEntriesProvider> provider12, Provider<C9314j> provider13, Provider<SharedPreferences> provider14, Provider<PerformanceTracking> provider15, Provider<VirtualQueueAnalytics> provider16, Provider<PeekViewActions> provider17, Provider<LoggedInUser> provider18, Provider<QueuesPositionsAdapter.Factory> provider19) {
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
        this.navigationEntriesProvider = provider12;
        this.parkAppConfigurationProvider = provider13;
        this.sharedPreferencesProvider = provider14;
        this.performanceTrackingProvider = provider15;
        this.vqAnalyticsProvider = provider16;
        this.peekViewActionsProvider = provider17;
        this.loggedInUserProvider = provider18;
        this.queuesPositionsAdapterFactoryProvider = provider19;
    }

    public static MembersInjector<DetailFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<VirtualQueueNavigationEntriesProvider> provider12, Provider<C9314j> provider13, Provider<SharedPreferences> provider14, Provider<PerformanceTracking> provider15, Provider<VirtualQueueAnalytics> provider16, Provider<PeekViewActions> provider17, Provider<LoggedInUser> provider18, Provider<QueuesPositionsAdapter.Factory> provider19) {
        return new DetailFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static void injectLoggedInUser(DetailFragment detailFragment, LoggedInUser loggedInUser) {
        detailFragment.loggedInUser = loggedInUser;
    }

    public static void injectNavigationEntriesProvider(DetailFragment detailFragment, VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        detailFragment.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public static void injectParkAppConfiguration(DetailFragment detailFragment, C9314j c9314j) {
        detailFragment.parkAppConfiguration = c9314j;
    }

    public static void injectPeekViewActions(DetailFragment detailFragment, PeekViewActions peekViewActions) {
        detailFragment.peekViewActions = peekViewActions;
    }

    public static void injectPerformanceTracking(DetailFragment detailFragment, PerformanceTracking performanceTracking) {
        detailFragment.performanceTracking = performanceTracking;
    }

    public static void injectQueuesPositionsAdapterFactory(DetailFragment detailFragment, QueuesPositionsAdapter.Factory factory) {
        detailFragment.queuesPositionsAdapterFactory = factory;
    }

    public static void injectSharedPreferences(DetailFragment detailFragment, SharedPreferences sharedPreferences) {
        detailFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectVirtualQueueAnalytics(DetailFragment detailFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        detailFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(DetailFragment detailFragment, VirtualQueueManager virtualQueueManager) {
        detailFragment.virtualQueueManager = virtualQueueManager;
    }

    public static void injectVqAnalytics(DetailFragment detailFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        detailFragment.vqAnalytics = virtualQueueAnalytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DetailFragment detailFragment) {
        C9308e.m38895d(detailFragment, this.busProvider.get());
        C9308e.m38892a(detailFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(detailFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(detailFragment, this.crashHelperProvider.get());
        C9308e.m38897g(detailFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(detailFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(detailFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(detailFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(detailFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(detailFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(detailFragment, this.virtualQueueAnalyticsProvider.get());
        injectNavigationEntriesProvider(detailFragment, this.navigationEntriesProvider.get());
        injectParkAppConfiguration(detailFragment, this.parkAppConfigurationProvider.get());
        injectSharedPreferences(detailFragment, this.sharedPreferencesProvider.get());
        injectPerformanceTracking(detailFragment, this.performanceTrackingProvider.get());
        injectVqAnalytics(detailFragment, this.vqAnalyticsProvider.get());
        injectPeekViewActions(detailFragment, this.peekViewActionsProvider.get());
        injectLoggedInUser(detailFragment, this.loggedInUserProvider.get());
        injectQueuesPositionsAdapterFactory(detailFragment, this.queuesPositionsAdapterFactoryProvider.get());
    }
}