package com.disney.wdpro.async_messaging.activities;

import androidx.view.C3821v0;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.async_messaging.analytics.C8911d;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.support.badging.BadgeCounterViewModel;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p768n9.InterfaceC30634g;
import p793o9.InterfaceC30823a;
import p972u9.C32393a;

/* renamed from: com.disney.wdpro.async_messaging.activities.i */
/* loaded from: classes24.dex */
public final class C8907i implements MembersInjector<LiveChatActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<BadgeCounterViewModel> badgeCounterViewModelProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8911d> liveChatAnalyticsProvider;
    private final Provider<InterfaceC30823a> livePersonListenerServiceDelgateProvider;
    private final Provider<InterfaceC30634g> livePersonProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;

    /* renamed from: a */
    public static void m37793a(LiveChatActivity liveChatActivity, BadgeCounterViewModel badgeCounterViewModel) {
        liveChatActivity.badgeCounterViewModel = badgeCounterViewModel;
    }

    /* renamed from: b */
    public static void m37794b(LiveChatActivity liveChatActivity, C8911d c8911d) {
        liveChatActivity.liveChatAnalytics = c8911d;
    }

    /* renamed from: c */
    public static void m37795c(LiveChatActivity liveChatActivity, InterfaceC30634g interfaceC30634g) {
        liveChatActivity.livePerson = interfaceC30634g;
    }

    /* renamed from: d */
    public static void m37796d(LiveChatActivity liveChatActivity, InterfaceC30823a interfaceC30823a) {
        liveChatActivity.livePersonListenerServiceDelgate = interfaceC30823a;
    }

    /* renamed from: f */
    public static void m37797f(LiveChatActivity liveChatActivity, C3821v0.c cVar) {
        liveChatActivity.viewModelFactory = cVar;
    }

    @Override // dagger.MembersInjector
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(LiveChatActivity liveChatActivity) {
        C9251d.m38816e(liveChatActivity, this.busProvider.get());
        C9251d.m38815d(liveChatActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(liveChatActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(liveChatActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(liveChatActivity, this.crashHelperProvider.get());
        C9251d.m38812a(liveChatActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(liveChatActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(liveChatActivity, this.timeProvider.get());
        m37795c(liveChatActivity, this.livePersonProvider.get());
        m37797f(liveChatActivity, this.viewModelFactoryProvider.get());
        m37793a(liveChatActivity, this.badgeCounterViewModelProvider.get());
        m37794b(liveChatActivity, this.liveChatAnalyticsProvider.get());
        m37796d(liveChatActivity, this.livePersonListenerServiceDelgateProvider.get());
    }
}