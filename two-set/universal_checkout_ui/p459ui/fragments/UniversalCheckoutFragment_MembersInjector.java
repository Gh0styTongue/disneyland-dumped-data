package com.disney.wdpro.universal_checkout_ui.p459ui.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.monitor.C9340o;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class UniversalCheckoutFragment_MembersInjector implements MembersInjector<UniversalCheckoutFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<UniversalCheckoutEnvironment> environmentProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ProfileConfiguration> profileConfigurationProvider;
    private final Provider<ProfileManager> profileManagerProvider;
    private final Provider<C9340o> reachabilityMonitorProvider;
    private final Provider<UniversalCheckoutConfiguration> universalCheckoutConfigurationProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public UniversalCheckoutFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<UniversalCheckoutEnvironment> provider7, Provider<ProfileManager> provider8, Provider<UniversalCheckoutDataManager> provider9, Provider<ProfileConfiguration> provider10, Provider<UniversalCheckoutConfiguration> provider11, Provider<C9248i> provider12, Provider<C9340o> provider13) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.environmentProvider = provider7;
        this.profileManagerProvider = provider8;
        this.universalCheckoutDataManagerProvider = provider9;
        this.profileConfigurationProvider = provider10;
        this.universalCheckoutConfigurationProvider = provider11;
        this.vendomaticProvider = provider12;
        this.reachabilityMonitorProvider = provider13;
    }

    public static MembersInjector<UniversalCheckoutFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<UniversalCheckoutEnvironment> provider7, Provider<ProfileManager> provider8, Provider<UniversalCheckoutDataManager> provider9, Provider<ProfileConfiguration> provider10, Provider<UniversalCheckoutConfiguration> provider11, Provider<C9248i> provider12, Provider<C9340o> provider13) {
        return new UniversalCheckoutFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectEnvironment(UniversalCheckoutFragment universalCheckoutFragment, UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        universalCheckoutFragment.environment = universalCheckoutEnvironment;
    }

    public static void injectProfileConfiguration(UniversalCheckoutFragment universalCheckoutFragment, ProfileConfiguration profileConfiguration) {
        universalCheckoutFragment.profileConfiguration = profileConfiguration;
    }

    public static void injectProfileManager(UniversalCheckoutFragment universalCheckoutFragment, ProfileManager profileManager) {
        universalCheckoutFragment.profileManager = profileManager;
    }

    public static void injectReachabilityMonitor(UniversalCheckoutFragment universalCheckoutFragment, C9340o c9340o) {
        universalCheckoutFragment.reachabilityMonitor = c9340o;
    }

    public static void injectUniversalCheckoutConfiguration(UniversalCheckoutFragment universalCheckoutFragment, UniversalCheckoutConfiguration universalCheckoutConfiguration) {
        universalCheckoutFragment.universalCheckoutConfiguration = universalCheckoutConfiguration;
    }

    public static void injectUniversalCheckoutDataManager(UniversalCheckoutFragment universalCheckoutFragment, UniversalCheckoutDataManager universalCheckoutDataManager) {
        universalCheckoutFragment.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(UniversalCheckoutFragment universalCheckoutFragment, C9248i c9248i) {
        universalCheckoutFragment.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UniversalCheckoutFragment universalCheckoutFragment) {
        C9308e.m38895d(universalCheckoutFragment, this.busProvider.get());
        C9308e.m38892a(universalCheckoutFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(universalCheckoutFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(universalCheckoutFragment, this.crashHelperProvider.get());
        C9308e.m38897g(universalCheckoutFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(universalCheckoutFragment, this.androidInjectorProvider.get());
        injectEnvironment(universalCheckoutFragment, this.environmentProvider.get());
        injectProfileManager(universalCheckoutFragment, this.profileManagerProvider.get());
        injectUniversalCheckoutDataManager(universalCheckoutFragment, this.universalCheckoutDataManagerProvider.get());
        injectProfileConfiguration(universalCheckoutFragment, this.profileConfigurationProvider.get());
        injectUniversalCheckoutConfiguration(universalCheckoutFragment, this.universalCheckoutConfigurationProvider.get());
        injectVendomatic(universalCheckoutFragment, this.vendomaticProvider.get());
        injectReachabilityMonitor(universalCheckoutFragment, this.reachabilityMonitorProvider.get());
    }
}