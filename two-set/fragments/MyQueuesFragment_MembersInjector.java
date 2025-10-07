package com.disney.wdpro.virtualqueue.core.fragments;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.C3821v0;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class MyQueuesFragment_MembersInjector implements MembersInjector<MyQueuesFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<PtrMyQueuesHeader> headerViewProvider;
    private final Provider<LinearLayoutManager> layoutManagerProvider;
    private final Provider<VirtualQueueNavigationEntriesProvider> navigationEntriesProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<QueuesPositionsAdapter.Factory> queuesPositionAdapterFactoryProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public MyQueuesFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<VirtualQueueNavigationEntriesProvider> provider12, Provider<PerformanceTracking> provider13, Provider<LinearLayoutManager> provider14, Provider<PtrMyQueuesHeader> provider15, Provider<C3821v0.c> provider16, Provider<QueuesPositionsAdapter.Factory> provider17) {
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
        this.performanceTrackingProvider = provider13;
        this.layoutManagerProvider = provider14;
        this.headerViewProvider = provider15;
        this.viewModelFactoryProvider = provider16;
        this.queuesPositionAdapterFactoryProvider = provider17;
    }

    public static MembersInjector<MyQueuesFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueManager> provider10, Provider<VirtualQueueAnalytics> provider11, Provider<VirtualQueueNavigationEntriesProvider> provider12, Provider<PerformanceTracking> provider13, Provider<LinearLayoutManager> provider14, Provider<PtrMyQueuesHeader> provider15, Provider<C3821v0.c> provider16, Provider<QueuesPositionsAdapter.Factory> provider17) {
        return new MyQueuesFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    public static void injectHeaderView(MyQueuesFragment myQueuesFragment, PtrMyQueuesHeader ptrMyQueuesHeader) {
        myQueuesFragment.headerView = ptrMyQueuesHeader;
    }

    public static void injectLayoutManager(MyQueuesFragment myQueuesFragment, LinearLayoutManager linearLayoutManager) {
        myQueuesFragment.layoutManager = linearLayoutManager;
    }

    public static void injectNavigationEntriesProvider(MyQueuesFragment myQueuesFragment, VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        myQueuesFragment.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public static void injectPerformanceTracking(MyQueuesFragment myQueuesFragment, PerformanceTracking performanceTracking) {
        myQueuesFragment.performanceTracking = performanceTracking;
    }

    public static void injectQueuesPositionAdapterFactory(MyQueuesFragment myQueuesFragment, QueuesPositionsAdapter.Factory factory) {
        myQueuesFragment.queuesPositionAdapterFactory = factory;
    }

    public static void injectViewModelFactory(MyQueuesFragment myQueuesFragment, C3821v0.c cVar) {
        myQueuesFragment.viewModelFactory = cVar;
    }

    public static void injectVirtualQueueAnalytics(MyQueuesFragment myQueuesFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        myQueuesFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(MyQueuesFragment myQueuesFragment, VirtualQueueManager virtualQueueManager) {
        myQueuesFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MyQueuesFragment myQueuesFragment) {
        C9308e.m38895d(myQueuesFragment, this.busProvider.get());
        C9308e.m38892a(myQueuesFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(myQueuesFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(myQueuesFragment, this.crashHelperProvider.get());
        C9308e.m38897g(myQueuesFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(myQueuesFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(myQueuesFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(myQueuesFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(myQueuesFragment, this.authenticationManagerProvider2.get());
        injectVirtualQueueManager(myQueuesFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(myQueuesFragment, this.virtualQueueAnalyticsProvider.get());
        injectNavigationEntriesProvider(myQueuesFragment, this.navigationEntriesProvider.get());
        injectPerformanceTracking(myQueuesFragment, this.performanceTrackingProvider.get());
        injectLayoutManager(myQueuesFragment, this.layoutManagerProvider.get());
        injectHeaderView(myQueuesFragment, this.headerViewProvider.get());
        injectViewModelFactory(myQueuesFragment, this.viewModelFactoryProvider.get());
        injectQueuesPositionAdapterFactory(myQueuesFragment, this.queuesPositionAdapterFactoryProvider.get());
    }
}