package com.disney.wdpro.virtualqueue.core;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes20.dex */
public final class VirtualQueueFoundationActivity_MembersInjector implements MembersInjector<VirtualQueueFoundationActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<DisneyLocationRegionsMonitor> locationRegionsMonitorProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueFoundationActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<VirtualQueueThemer> provider9, Provider<DisneyLocationRegionsMonitor> provider10) {
        this.busProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.navigationListenerProvider = provider3;
        this.analyticsHelperProvider = provider4;
        this.crashHelperProvider = provider5;
        this.adobeNotificationTrackingHelperProvider = provider6;
        this.androidInjectorProvider = provider7;
        this.timeProvider = provider8;
        this.vqThemerProvider = provider9;
        this.locationRegionsMonitorProvider = provider10;
    }

    public static MembersInjector<VirtualQueueFoundationActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<VirtualQueueThemer> provider9, Provider<DisneyLocationRegionsMonitor> provider10) {
        return new VirtualQueueFoundationActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static void injectLocationRegionsMonitor(VirtualQueueFoundationActivity virtualQueueFoundationActivity, DisneyLocationRegionsMonitor disneyLocationRegionsMonitor) {
        virtualQueueFoundationActivity.locationRegionsMonitor = disneyLocationRegionsMonitor;
    }

    public static void injectVqThemer(VirtualQueueFoundationActivity virtualQueueFoundationActivity, VirtualQueueThemer virtualQueueThemer) {
        virtualQueueFoundationActivity.vqThemer = virtualQueueThemer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VirtualQueueFoundationActivity virtualQueueFoundationActivity) {
        C9251d.m38816e(virtualQueueFoundationActivity, this.busProvider.get());
        C9251d.m38815d(virtualQueueFoundationActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(virtualQueueFoundationActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(virtualQueueFoundationActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(virtualQueueFoundationActivity, this.crashHelperProvider.get());
        C9251d.m38812a(virtualQueueFoundationActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(virtualQueueFoundationActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(virtualQueueFoundationActivity, this.timeProvider.get());
        injectVqThemer(virtualQueueFoundationActivity, this.vqThemerProvider.get());
        injectLocationRegionsMonitor(virtualQueueFoundationActivity, this.locationRegionsMonitorProvider.get());
    }
}