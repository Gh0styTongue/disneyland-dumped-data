package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.enchanting_extras_ui.EnchantingExtrasConfiguration;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes25.dex */
public final class DownScreenFragment_MembersInjector implements MembersInjector<DownScreenFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<EnchantingExtrasConfiguration> configurationProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;

    public DownScreenFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<EnchantingExtrasConfiguration> provider7) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.configurationProvider = provider7;
    }

    public static MembersInjector<DownScreenFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<EnchantingExtrasConfiguration> provider7) {
        return new DownScreenFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectConfiguration(DownScreenFragment downScreenFragment, EnchantingExtrasConfiguration enchantingExtrasConfiguration) {
        downScreenFragment.configuration = enchantingExtrasConfiguration;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DownScreenFragment downScreenFragment) {
        C9308e.m38895d(downScreenFragment, this.busProvider.get());
        C9308e.m38892a(downScreenFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(downScreenFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(downScreenFragment, this.crashHelperProvider.get());
        C9308e.m38897g(downScreenFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(downScreenFragment, this.androidInjectorProvider.get());
        injectConfiguration(downScreenFragment, this.configurationProvider.get());
    }
}