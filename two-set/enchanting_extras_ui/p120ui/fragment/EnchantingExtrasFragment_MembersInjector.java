package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.enchanting_extras_ui.EnchantingExtrasConfiguration;
import com.disney.wdpro.enchanting_extras_ui.p120ui.Settings.EnchantingExtrasEnvironment;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes25.dex */
public final class EnchantingExtrasFragment_MembersInjector implements MembersInjector<EnchantingExtrasFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<EnchantingExtrasConfiguration> configurationProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<EnchantingExtrasEnvironment> environmentProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ProfileManager> profileManagerProvider;
    private final Provider<UniversalCheckoutEnvironment> ucEnvironmentProvider;
    private final Provider<UniversalCheckoutConfiguration> universalCheckoutConfigurationProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public EnchantingExtrasFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7, Provider<EnchantingExtrasEnvironment> provider8, Provider<UniversalCheckoutEnvironment> provider9, Provider<EnchantingExtrasConfiguration> provider10, Provider<ProfileManager> provider11, Provider<UniversalCheckoutDataManager> provider12, Provider<UniversalCheckoutConfiguration> provider13) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.vendomaticProvider = provider7;
        this.environmentProvider = provider8;
        this.ucEnvironmentProvider = provider9;
        this.configurationProvider = provider10;
        this.profileManagerProvider = provider11;
        this.universalCheckoutDataManagerProvider = provider12;
        this.universalCheckoutConfigurationProvider = provider13;
    }

    public static MembersInjector<EnchantingExtrasFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7, Provider<EnchantingExtrasEnvironment> provider8, Provider<UniversalCheckoutEnvironment> provider9, Provider<EnchantingExtrasConfiguration> provider10, Provider<ProfileManager> provider11, Provider<UniversalCheckoutDataManager> provider12, Provider<UniversalCheckoutConfiguration> provider13) {
        return new EnchantingExtrasFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectConfiguration(EnchantingExtrasFragment enchantingExtrasFragment, EnchantingExtrasConfiguration enchantingExtrasConfiguration) {
        enchantingExtrasFragment.configuration = enchantingExtrasConfiguration;
    }

    public static void injectEnvironment(EnchantingExtrasFragment enchantingExtrasFragment, EnchantingExtrasEnvironment enchantingExtrasEnvironment) {
        enchantingExtrasFragment.environment = enchantingExtrasEnvironment;
    }

    public static void injectProfileManager(EnchantingExtrasFragment enchantingExtrasFragment, ProfileManager profileManager) {
        enchantingExtrasFragment.profileManager = profileManager;
    }

    public static void injectUcEnvironment(EnchantingExtrasFragment enchantingExtrasFragment, UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        enchantingExtrasFragment.ucEnvironment = universalCheckoutEnvironment;
    }

    public static void injectUniversalCheckoutConfiguration(EnchantingExtrasFragment enchantingExtrasFragment, UniversalCheckoutConfiguration universalCheckoutConfiguration) {
        enchantingExtrasFragment.universalCheckoutConfiguration = universalCheckoutConfiguration;
    }

    public static void injectUniversalCheckoutDataManager(EnchantingExtrasFragment enchantingExtrasFragment, UniversalCheckoutDataManager universalCheckoutDataManager) {
        enchantingExtrasFragment.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(EnchantingExtrasFragment enchantingExtrasFragment, C9248i c9248i) {
        enchantingExtrasFragment.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EnchantingExtrasFragment enchantingExtrasFragment) {
        C9308e.m38895d(enchantingExtrasFragment, this.busProvider.get());
        C9308e.m38892a(enchantingExtrasFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(enchantingExtrasFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(enchantingExtrasFragment, this.crashHelperProvider.get());
        C9308e.m38897g(enchantingExtrasFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(enchantingExtrasFragment, this.androidInjectorProvider.get());
        injectVendomatic(enchantingExtrasFragment, this.vendomaticProvider.get());
        injectEnvironment(enchantingExtrasFragment, this.environmentProvider.get());
        injectUcEnvironment(enchantingExtrasFragment, this.ucEnvironmentProvider.get());
        injectConfiguration(enchantingExtrasFragment, this.configurationProvider.get());
        injectProfileManager(enchantingExtrasFragment, this.profileManagerProvider.get());
        injectUniversalCheckoutDataManager(enchantingExtrasFragment, this.universalCheckoutDataManagerProvider.get());
        injectUniversalCheckoutConfiguration(enchantingExtrasFragment, this.universalCheckoutConfigurationProvider.get());
    }
}