package com.disney.wdpro.enchanting_extras_ui.p120ui.activities;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes25.dex */
public final class EnchantingExtrasActivity_MembersInjector implements MembersInjector<EnchantingExtrasActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ProfileConfiguration> profileConfigurationProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public EnchantingExtrasActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<C9248i> provider9, Provider<ProfileConfiguration> provider10, Provider<UniversalCheckoutDataManager> provider11) {
        this.busProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.navigationListenerProvider = provider3;
        this.analyticsHelperProvider = provider4;
        this.crashHelperProvider = provider5;
        this.adobeNotificationTrackingHelperProvider = provider6;
        this.androidInjectorProvider = provider7;
        this.timeProvider = provider8;
        this.vendomaticProvider = provider9;
        this.profileConfigurationProvider = provider10;
        this.universalCheckoutDataManagerProvider = provider11;
    }

    public static MembersInjector<EnchantingExtrasActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<C9248i> provider9, Provider<ProfileConfiguration> provider10, Provider<UniversalCheckoutDataManager> provider11) {
        return new EnchantingExtrasActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectProfileConfiguration(EnchantingExtrasActivity enchantingExtrasActivity, ProfileConfiguration profileConfiguration) {
        enchantingExtrasActivity.profileConfiguration = profileConfiguration;
    }

    public static void injectUniversalCheckoutDataManager(EnchantingExtrasActivity enchantingExtrasActivity, UniversalCheckoutDataManager universalCheckoutDataManager) {
        enchantingExtrasActivity.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(EnchantingExtrasActivity enchantingExtrasActivity, C9248i c9248i) {
        enchantingExtrasActivity.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EnchantingExtrasActivity enchantingExtrasActivity) {
        C9251d.m38816e(enchantingExtrasActivity, this.busProvider.get());
        C9251d.m38815d(enchantingExtrasActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(enchantingExtrasActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(enchantingExtrasActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(enchantingExtrasActivity, this.crashHelperProvider.get());
        C9251d.m38812a(enchantingExtrasActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(enchantingExtrasActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(enchantingExtrasActivity, this.timeProvider.get());
        injectVendomatic(enchantingExtrasActivity, this.vendomaticProvider.get());
        injectProfileConfiguration(enchantingExtrasActivity, this.profileConfigurationProvider.get());
        injectUniversalCheckoutDataManager(enchantingExtrasActivity, this.universalCheckoutDataManagerProvider.get());
    }
}