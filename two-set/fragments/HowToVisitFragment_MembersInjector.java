package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.SharedPreferences;
import android.graphics.Point;
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
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Named;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class HowToVisitFragment_MembersInjector implements MembersInjector<HowToVisitFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<PerformanceTracking> performanceTrackingProvider;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<Point> screenSizeProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<VirtualQueueAnalytics> virtualQueueAnalyticsProvider;
    private final Provider<VirtualQueueManager> virtualQueueManagerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public HowToVisitFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<SharedPreferences> provider10, Provider<VirtualQueueManager> provider11, Provider<VirtualQueueAnalytics> provider12, Provider<PicassoUtils> provider13, Provider<C9314j> provider14, Provider<PerformanceTracking> provider15, Provider<Point> provider16) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.virtualQueueRepositoryProvider = provider7;
        this.vqThemerProvider = provider8;
        this.authenticationManagerProvider2 = provider9;
        this.sharedPreferencesProvider = provider10;
        this.virtualQueueManagerProvider = provider11;
        this.virtualQueueAnalyticsProvider = provider12;
        this.picassoUtilsProvider = provider13;
        this.parkAppConfigurationProvider = provider14;
        this.performanceTrackingProvider = provider15;
        this.screenSizeProvider = provider16;
    }

    public static MembersInjector<HowToVisitFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9, Provider<SharedPreferences> provider10, Provider<VirtualQueueManager> provider11, Provider<VirtualQueueAnalytics> provider12, Provider<PicassoUtils> provider13, Provider<C9314j> provider14, Provider<PerformanceTracking> provider15, Provider<Point> provider16) {
        return new HowToVisitFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static void injectParkAppConfiguration(HowToVisitFragment howToVisitFragment, C9314j c9314j) {
        howToVisitFragment.parkAppConfiguration = c9314j;
    }

    public static void injectPerformanceTracking(HowToVisitFragment howToVisitFragment, PerformanceTracking performanceTracking) {
        howToVisitFragment.performanceTracking = performanceTracking;
    }

    public static void injectPicassoUtils(HowToVisitFragment howToVisitFragment, PicassoUtils picassoUtils) {
        howToVisitFragment.picassoUtils = picassoUtils;
    }

    @Named("ScreenSize")
    public static void injectScreenSize(HowToVisitFragment howToVisitFragment, Point point) {
        howToVisitFragment.screenSize = point;
    }

    public static void injectSharedPreferences(HowToVisitFragment howToVisitFragment, SharedPreferences sharedPreferences) {
        howToVisitFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectVirtualQueueAnalytics(HowToVisitFragment howToVisitFragment, VirtualQueueAnalytics virtualQueueAnalytics) {
        howToVisitFragment.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public static void injectVirtualQueueManager(HowToVisitFragment howToVisitFragment, VirtualQueueManager virtualQueueManager) {
        howToVisitFragment.virtualQueueManager = virtualQueueManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HowToVisitFragment howToVisitFragment) {
        C9308e.m38895d(howToVisitFragment, this.busProvider.get());
        C9308e.m38892a(howToVisitFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(howToVisitFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(howToVisitFragment, this.crashHelperProvider.get());
        C9308e.m38897g(howToVisitFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(howToVisitFragment, this.androidInjectorProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVirtualQueueRepository(howToVisitFragment, this.virtualQueueRepositoryProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectVqThemer(howToVisitFragment, this.vqThemerProvider.get());
        VirtualQueueBaseFragment_MembersInjector.injectAuthenticationManager(howToVisitFragment, this.authenticationManagerProvider2.get());
        injectSharedPreferences(howToVisitFragment, this.sharedPreferencesProvider.get());
        injectVirtualQueueManager(howToVisitFragment, this.virtualQueueManagerProvider.get());
        injectVirtualQueueAnalytics(howToVisitFragment, this.virtualQueueAnalyticsProvider.get());
        injectPicassoUtils(howToVisitFragment, this.picassoUtilsProvider.get());
        injectParkAppConfiguration(howToVisitFragment, this.parkAppConfigurationProvider.get());
        injectPerformanceTracking(howToVisitFragment, this.performanceTrackingProvider.get());
        injectScreenSize(howToVisitFragment, this.screenSizeProvider.get());
    }
}