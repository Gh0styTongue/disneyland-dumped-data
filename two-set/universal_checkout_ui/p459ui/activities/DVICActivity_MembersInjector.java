package com.disney.wdpro.universal_checkout_ui.p459ui.activities;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes20.dex */
public final class DVICActivity_MembersInjector implements MembersInjector<DVICActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<UniversalCheckoutEnvironment> environmentProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ProfileConfiguration> profileConfigurationProvider;
    private final Provider<ProfileManager> profileManagerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<UniversalCheckoutConfiguration> universalCheckoutConfigurationProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public DVICActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<UniversalCheckoutEnvironment> provider9, Provider<ProfileManager> provider10, Provider<ProfileConfiguration> provider11, Provider<UniversalCheckoutDataManager> provider12, Provider<UniversalCheckoutConfiguration> provider13, Provider<C9248i> provider14) {
        this.busProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.navigationListenerProvider = provider3;
        this.analyticsHelperProvider = provider4;
        this.crashHelperProvider = provider5;
        this.adobeNotificationTrackingHelperProvider = provider6;
        this.androidInjectorProvider = provider7;
        this.timeProvider = provider8;
        this.environmentProvider = provider9;
        this.profileManagerProvider = provider10;
        this.profileConfigurationProvider = provider11;
        this.universalCheckoutDataManagerProvider = provider12;
        this.universalCheckoutConfigurationProvider = provider13;
        this.vendomaticProvider = provider14;
    }

    public static MembersInjector<DVICActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<UniversalCheckoutEnvironment> provider9, Provider<ProfileManager> provider10, Provider<ProfileConfiguration> provider11, Provider<UniversalCheckoutDataManager> provider12, Provider<UniversalCheckoutConfiguration> provider13, Provider<C9248i> provider14) {
        return new DVICActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectEnvironment(DVICActivity dVICActivity, UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        dVICActivity.environment = universalCheckoutEnvironment;
    }

    public static void injectProfileConfiguration(DVICActivity dVICActivity, ProfileConfiguration profileConfiguration) {
        dVICActivity.profileConfiguration = profileConfiguration;
    }

    public static void injectProfileManager(DVICActivity dVICActivity, ProfileManager profileManager) {
        dVICActivity.profileManager = profileManager;
    }

    public static void injectUniversalCheckoutConfiguration(DVICActivity dVICActivity, UniversalCheckoutConfiguration universalCheckoutConfiguration) {
        dVICActivity.universalCheckoutConfiguration = universalCheckoutConfiguration;
    }

    public static void injectUniversalCheckoutDataManager(DVICActivity dVICActivity, UniversalCheckoutDataManager universalCheckoutDataManager) {
        dVICActivity.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(DVICActivity dVICActivity, C9248i c9248i) {
        dVICActivity.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DVICActivity dVICActivity) {
        C9251d.m38816e(dVICActivity, this.busProvider.get());
        C9251d.m38815d(dVICActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(dVICActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(dVICActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(dVICActivity, this.crashHelperProvider.get());
        C9251d.m38812a(dVICActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(dVICActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(dVICActivity, this.timeProvider.get());
        injectEnvironment(dVICActivity, this.environmentProvider.get());
        injectProfileManager(dVICActivity, this.profileManagerProvider.get());
        injectProfileConfiguration(dVICActivity, this.profileConfigurationProvider.get());
        injectUniversalCheckoutDataManager(dVICActivity, this.universalCheckoutDataManagerProvider.get());
        injectUniversalCheckoutConfiguration(dVICActivity, this.universalCheckoutConfigurationProvider.get());
        injectVendomatic(dVICActivity, this.vendomaticProvider.get());
    }
}