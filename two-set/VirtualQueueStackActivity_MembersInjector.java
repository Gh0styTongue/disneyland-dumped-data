package com.disney.wdpro.virtualqueue.core;

import android.content.SharedPreferences;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes20.dex */
public final class VirtualQueueStackActivity_MembersInjector implements MembersInjector<VirtualQueueStackActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<DisneyLocationRegionsMonitor> locationRegionsMonitorProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<VirtualQueueRegions> vqRegionsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueStackActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<SharedPreferences> provider9, Provider<VirtualQueueThemer> provider10, Provider<VirtualQueueRegions> provider11, Provider<DisneyLocationRegionsMonitor> provider12) {
        this.busProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.navigationListenerProvider = provider3;
        this.analyticsHelperProvider = provider4;
        this.crashHelperProvider = provider5;
        this.adobeNotificationTrackingHelperProvider = provider6;
        this.androidInjectorProvider = provider7;
        this.timeProvider = provider8;
        this.sharedPreferencesProvider = provider9;
        this.vqThemerProvider = provider10;
        this.vqRegionsProvider = provider11;
        this.locationRegionsMonitorProvider = provider12;
    }

    public static MembersInjector<VirtualQueueStackActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<SharedPreferences> provider9, Provider<VirtualQueueThemer> provider10, Provider<VirtualQueueRegions> provider11, Provider<DisneyLocationRegionsMonitor> provider12) {
        return new VirtualQueueStackActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectLocationRegionsMonitor(VirtualQueueStackActivity virtualQueueStackActivity, DisneyLocationRegionsMonitor disneyLocationRegionsMonitor) {
        virtualQueueStackActivity.locationRegionsMonitor = disneyLocationRegionsMonitor;
    }

    public static void injectSharedPreferences(VirtualQueueStackActivity virtualQueueStackActivity, SharedPreferences sharedPreferences) {
        virtualQueueStackActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectVqRegions(VirtualQueueStackActivity virtualQueueStackActivity, VirtualQueueRegions virtualQueueRegions) {
        virtualQueueStackActivity.vqRegions = virtualQueueRegions;
    }

    public static void injectVqThemer(VirtualQueueStackActivity virtualQueueStackActivity, VirtualQueueThemer virtualQueueThemer) {
        virtualQueueStackActivity.vqThemer = virtualQueueThemer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VirtualQueueStackActivity virtualQueueStackActivity) {
        C9251d.m38816e(virtualQueueStackActivity, this.busProvider.get());
        C9251d.m38815d(virtualQueueStackActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(virtualQueueStackActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(virtualQueueStackActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(virtualQueueStackActivity, this.crashHelperProvider.get());
        C9251d.m38812a(virtualQueueStackActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(virtualQueueStackActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(virtualQueueStackActivity, this.timeProvider.get());
        injectSharedPreferences(virtualQueueStackActivity, this.sharedPreferencesProvider.get());
        injectVqThemer(virtualQueueStackActivity, this.vqThemerProvider.get());
        injectVqRegions(virtualQueueStackActivity, this.vqRegionsProvider.get());
        injectLocationRegionsMonitor(virtualQueueStackActivity, this.locationRegionsMonitorProvider.get());
    }
}