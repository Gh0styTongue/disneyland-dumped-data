package com.disney.wdpro.flutter.commons.activities;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.support.activities.C20530d;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes28.dex */
public final class BaseFlutterFragmentActivity_MembersInjector implements MembersInjector<BaseFlutterFragmentActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<FlutterParkEngineManager> flutterEngineManagerProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9350r> timeProvider;

    public BaseFlutterFragmentActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<FlutterParkEngineManager> provider9) {
        this.busProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.navigationListenerProvider = provider3;
        this.analyticsHelperProvider = provider4;
        this.crashHelperProvider = provider5;
        this.adobeNotificationTrackingHelperProvider = provider6;
        this.androidInjectorProvider = provider7;
        this.timeProvider = provider8;
        this.flutterEngineManagerProvider = provider9;
    }

    public static MembersInjector<BaseFlutterFragmentActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<FlutterParkEngineManager> provider9) {
        return new BaseFlutterFragmentActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectFlutterEngineManager(BaseFlutterFragmentActivity baseFlutterFragmentActivity, FlutterParkEngineManager flutterParkEngineManager) {
        baseFlutterFragmentActivity.flutterEngineManager = flutterParkEngineManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseFlutterFragmentActivity baseFlutterFragmentActivity) {
        C9251d.m38816e(baseFlutterFragmentActivity, this.busProvider.get());
        C9251d.m38815d(baseFlutterFragmentActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(baseFlutterFragmentActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(baseFlutterFragmentActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(baseFlutterFragmentActivity, this.crashHelperProvider.get());
        C9251d.m38812a(baseFlutterFragmentActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(baseFlutterFragmentActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(baseFlutterFragmentActivity, this.timeProvider.get());
        injectFlutterEngineManager(baseFlutterFragmentActivity, this.flutterEngineManagerProvider.get());
    }
}