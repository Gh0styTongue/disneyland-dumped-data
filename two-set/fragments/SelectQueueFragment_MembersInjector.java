package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.SharedPreferences;
import android.graphics.Point;
import androidx.view.C3821v0;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment_MembersInjector;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Named;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class SelectQueueFragment_MembersInjector implements MembersInjector<SelectQueueFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<VirtualQueueNavigationEntriesProvider> navigationEntriesProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<Point> screenSizeProvider;
    private final Provider<SelectQueueMainAdapter.Factory> selectQueueMainAdapterFactoryProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueAnalytics> vqAnalyticsProvider;
    private final Provider<VirtualQueueRegions> vqRegionsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public SelectQueueFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueRegions> provider10, Provider<VirtualQueueManager> provider11, Provider<PicassoUtils> provider12, Provider<VirtualQueueAnalytics> provider13, Provider<FacilityUtils> provider14, Provider<SharedPreferences> provider15, Provider<VirtualQueueNavigationEntriesProvider> provider16, Provider<PerformanceTracking> provider17, Provider<C3821v0.c> provider18, Provider<C9314j> provider19, Provider<Point> provider20, Provider<SelectQueueMainAdapter.Factory> provider21) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.virtualQueueRepositoryProvider = provider7;
        this.vqThemerProvider = provider8;
        this.authenticationManagerProvider2 = provider9;
        this.vqRegionsProvider = provider10;
        this.virtualQueueManagerProvider = provider11;
        this.picassoUtilsProvider = provider12;
        this.vqAnalyticsProvider = provider13;
        this.facilityUtilsProvider = provider14;
        this.sharedPreferencesProvider = provider15;
        this.navigationEntriesProvider = provider16;
        this.performanceTrackingProvider = provider17;
        this.viewModelFactoryProvider = provider18;
        this.parkAppConfigurationProvider = provider19;
        this.screenSizeProvider = provider20;
        this.selectQueueMainAdapterFactoryProvider = provider21;
    }

    public static MembersInjector<SelectQueueFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<VirtualQueueRegions> provider10, Provider<VirtualQueueManager> provider11, Provider<PicassoUtils> provider12, Provider<VirtualQueueAnalytics> provider13, Provider<FacilityUtils> provider14, Provider<SharedPreferences> provider15, Provider<VirtualQueueNavigationEntriesProvider> provider16, Provider<PerformanceTracking> provider17, Provider<C3821v0.c> provider18, Provider<C9314j> provider19, Provider<Point> provider20, Provider<SelectQueueMainAdapter.Factory> provider21) {
        return new SelectQueueFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21);
    }

    public static void injectFacilityUtils(SelectQueueFragment selectQueueFragment, FacilityUtils facilityUtils) {
        selectQueueFragment.facilityUtils = facilityUtils;
    }

    public static void injectNavigationEntriesProvider(SelectQueueFragment selectQueueFragment, VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        selectQueueFragment.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public static void injectParkAppConfiguration(SelectQueueFragment selectQueueFragment, C9314j c9314j) {
        selectQueueFragment.parkAppConfiguration = c9314j;
    }

    public static void injectPerformanceTracking(SelectQueueFragment selectQueueFragment, PerformanceTracking performanceTracking) {
        selectQueueFragment.performanceTracking = performanceTracking;
    }

    public static void injectPicassoUtils(SelectQueueFragment selectQueueFragment, PicassoUtils picassoUtils) {
        selectQueueFragment.picassoUtils = picassoUtils;
    }

    @Named("ScreenSize")
    public static void injectScreenSize(SelectQueueFragment selectQueueFragment, Point point) {
        selectQueueFragment.screenSize = point;
    }

    public static void injectSelectQueueMainAdapterFactory(SelectQueueFragment selectQueueFragment, SelectQueueMainAdapter.Factory factory) {
        selectQueueFragment.selectQueueMainAdapterFactory = factory;
    }

    public static void injectSharedPreferences(SelectQueueFragment selectQueueFragment, SharedPreferences sharedPreferences) {
        selectQueueFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectViewModelFactory(SelectQueueFragment selectQueueFragment, C3821v0.c cVar) {
        selectQueueFragment.viewModelFactory = cVar;
    }

    public static void injectVirtualQueueManager(SelectQueueFragment selectQueueFragment, VirtualQueueManager virtualQueueManager) {
        selectQueueFragment.virtualQueueManager = virtualQueueManager;
    }

    public static void injectVqAnalytics(SelectQueueFragment selectQueueFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        selectQueueFragment.vqAnalytics = virtualQueueAnalytics;
    }

    public static void injectVqRegions(SelectQueueFragment selectQueueFragment, VirtualQueueRegions virtualQueueRegions) {
        selectQueueFragment.vqRegions = virtualQueueRegions;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SelectQueueFragment selectQueueFragment) {
        C9308e.m38895d(selectQueueFragment, this.busProvider.get());
        C9308e.m38892a(selectQueueFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(selectQueueFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(selectQueueFragment, this.crashHelperProvider.get());
        C9308e.m38897g(selectQueueFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(selectQueueFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(selectQueueFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(selectQueueFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(selectQueueFragment, this.authenticationManagerProvider2.get());
        injectVqRegions(selectQueueFragment, this.vqRegionsProvider.get());
        injectVirtualQueueManager(selectQueueFragment, this.virtualQueueManagerProvider.get());
        injectPicassoUtils(selectQueueFragment, this.picassoUtilsProvider.get());
        injectVqAnalytics(selectQueueFragment, this.vqAnalyticsProvider.get());
        injectFacilityUtils(selectQueueFragment, this.facilityUtilsProvider.get());
        injectSharedPreferences(selectQueueFragment, this.sharedPreferencesProvider.get());
        injectNavigationEntriesProvider(selectQueueFragment, this.navigationEntriesProvider.get());
        injectPerformanceTracking(selectQueueFragment, this.performanceTrackingProvider.get());
        injectViewModelFactory(selectQueueFragment, this.viewModelFactoryProvider.get());
        injectParkAppConfiguration(selectQueueFragment, this.parkAppConfigurationProvider.get());
        injectScreenSize(selectQueueFragment, this.screenSizeProvider.get());
        injectSelectQueueMainAdapterFactory(selectQueueFragment, this.selectQueueMainAdapterFactoryProvider.get());
    }
}