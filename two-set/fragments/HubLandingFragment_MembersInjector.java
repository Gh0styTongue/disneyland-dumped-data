package com.disney.wdpro.virtualqueue.core.fragments;

import androidx.view.C3821v0;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class HubLandingFragment_MembersInjector implements MembersInjector<HubLandingFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<VirtualQueueNavigationEntriesProvider> navigationEntriesProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<SelectQueueMainAdapter.Factory> selectQueueMainAdapterFactoryProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueAnalytics> vqAnalyticsProvider;
    private final Provider<VirtualQueueRegions> vqRegionsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public HubLandingFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<PicassoUtils> provider10, Provider<FacilityUtils> provider11, Provider<VirtualQueueAnalytics> provider12, Provider<VirtualQueueRegions> provider13, Provider<VirtualQueueNavigationEntriesProvider> provider14, Provider<C3821v0.c> provider15, Provider<SelectQueueMainAdapter.Factory> provider16) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.virtualQueueRepositoryProvider = provider7;
        this.vqThemerProvider = provider8;
        this.authenticationManagerProvider2 = provider9;
        this.picassoUtilsProvider = provider10;
        this.facilityUtilsProvider = provider11;
        this.vqAnalyticsProvider = provider12;
        this.vqRegionsProvider = provider13;
        this.navigationEntriesProvider = provider14;
        this.viewModelFactoryProvider = provider15;
        this.selectQueueMainAdapterFactoryProvider = provider16;
    }

    public static MembersInjector<HubLandingFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<PicassoUtils> provider10, Provider<FacilityUtils> provider11, Provider<VirtualQueueAnalytics> provider12, Provider<VirtualQueueRegions> provider13, Provider<VirtualQueueNavigationEntriesProvider> provider14, Provider<C3821v0.c> provider15, Provider<SelectQueueMainAdapter.Factory> provider16) {
        return new HubLandingFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static void injectFacilityUtils(HubLandingFragment hubLandingFragment, FacilityUtils facilityUtils) {
        hubLandingFragment.facilityUtils = facilityUtils;
    }

    public static void injectNavigationEntriesProvider(HubLandingFragment hubLandingFragment, VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        hubLandingFragment.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public static void injectPicassoUtils(HubLandingFragment hubLandingFragment, PicassoUtils picassoUtils) {
        hubLandingFragment.picassoUtils = picassoUtils;
    }

    public static void injectSelectQueueMainAdapterFactory(HubLandingFragment hubLandingFragment, SelectQueueMainAdapter.Factory factory) {
        hubLandingFragment.selectQueueMainAdapterFactory = factory;
    }

    public static void injectViewModelFactory(HubLandingFragment hubLandingFragment, C3821v0.c cVar) {
        hubLandingFragment.viewModelFactory = cVar;
    }

    public static void injectVqAnalytics(HubLandingFragment hubLandingFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        hubLandingFragment.vqAnalytics = virtualQueueAnalytics;
    }

    public static void injectVqRegions(HubLandingFragment hubLandingFragment, VirtualQueueRegions virtualQueueRegions) {
        hubLandingFragment.vqRegions = virtualQueueRegions;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HubLandingFragment hubLandingFragment) {
        C9308e.m38895d(hubLandingFragment, this.busProvider.get());
        C9308e.m38892a(hubLandingFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(hubLandingFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(hubLandingFragment, this.crashHelperProvider.get());
        C9308e.m38897g(hubLandingFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(hubLandingFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(hubLandingFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(hubLandingFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(hubLandingFragment, this.authenticationManagerProvider2.get());
        injectPicassoUtils(hubLandingFragment, this.picassoUtilsProvider.get());
        injectFacilityUtils(hubLandingFragment, this.facilityUtilsProvider.get());
        injectVqAnalytics(hubLandingFragment, this.vqAnalyticsProvider.get());
        injectVqRegions(hubLandingFragment, this.vqRegionsProvider.get());
        injectNavigationEntriesProvider(hubLandingFragment, this.navigationEntriesProvider.get());
        injectViewModelFactory(hubLandingFragment, this.viewModelFactoryProvider.get());
        injectSelectQueueMainAdapterFactory(hubLandingFragment, this.selectQueueMainAdapterFactoryProvider.get());
    }
}