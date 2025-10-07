package com.disney.wdpro.ticketsaleshybrid.p452ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.ticketsaleshybrid.TicketSalesHybridAndroidConfiguration;
import com.disney.wdpro.ticketsaleshybrid.p452ui.Settings.TicketSalesAndroidHybridEnvironment;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes19.dex */
public final class TicketSalesHybridFragment_MembersInjector implements MembersInjector<TicketSalesHybridFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<TicketSalesHybridAndroidConfiguration> configurationProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<TicketSalesAndroidHybridEnvironment> environmentProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ProfileManager> profileManagerProvider;
    private final Provider<UniversalCheckoutEnvironment> ucEnvironmentProvider;
    private final Provider<UniversalCheckoutConfiguration> universalCheckoutConfigurationProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public TicketSalesHybridFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7, Provider<TicketSalesAndroidHybridEnvironment> provider8, Provider<UniversalCheckoutEnvironment> provider9, Provider<TicketSalesHybridAndroidConfiguration> provider10, Provider<ProfileManager> provider11, Provider<UniversalCheckoutDataManager> provider12, Provider<UniversalCheckoutConfiguration> provider13) {
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

    public static MembersInjector<TicketSalesHybridFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7, Provider<TicketSalesAndroidHybridEnvironment> provider8, Provider<UniversalCheckoutEnvironment> provider9, Provider<TicketSalesHybridAndroidConfiguration> provider10, Provider<ProfileManager> provider11, Provider<UniversalCheckoutDataManager> provider12, Provider<UniversalCheckoutConfiguration> provider13) {
        return new TicketSalesHybridFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectConfiguration(TicketSalesHybridFragment ticketSalesHybridFragment, TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration) {
        ticketSalesHybridFragment.configuration = ticketSalesHybridAndroidConfiguration;
    }

    public static void injectEnvironment(TicketSalesHybridFragment ticketSalesHybridFragment, TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment) {
        ticketSalesHybridFragment.environment = ticketSalesAndroidHybridEnvironment;
    }

    public static void injectProfileManager(TicketSalesHybridFragment ticketSalesHybridFragment, ProfileManager profileManager) {
        ticketSalesHybridFragment.profileManager = profileManager;
    }

    public static void injectUcEnvironment(TicketSalesHybridFragment ticketSalesHybridFragment, UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        ticketSalesHybridFragment.ucEnvironment = universalCheckoutEnvironment;
    }

    public static void injectUniversalCheckoutConfiguration(TicketSalesHybridFragment ticketSalesHybridFragment, UniversalCheckoutConfiguration universalCheckoutConfiguration) {
        ticketSalesHybridFragment.universalCheckoutConfiguration = universalCheckoutConfiguration;
    }

    public static void injectUniversalCheckoutDataManager(TicketSalesHybridFragment ticketSalesHybridFragment, UniversalCheckoutDataManager universalCheckoutDataManager) {
        ticketSalesHybridFragment.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(TicketSalesHybridFragment ticketSalesHybridFragment, C9248i c9248i) {
        ticketSalesHybridFragment.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TicketSalesHybridFragment ticketSalesHybridFragment) {
        C9308e.m38895d(ticketSalesHybridFragment, this.busProvider.get());
        C9308e.m38892a(ticketSalesHybridFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(ticketSalesHybridFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(ticketSalesHybridFragment, this.crashHelperProvider.get());
        C9308e.m38897g(ticketSalesHybridFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(ticketSalesHybridFragment, this.androidInjectorProvider.get());
        injectVendomatic(ticketSalesHybridFragment, this.vendomaticProvider.get());
        injectEnvironment(ticketSalesHybridFragment, this.environmentProvider.get());
        injectUcEnvironment(ticketSalesHybridFragment, this.ucEnvironmentProvider.get());
        injectConfiguration(ticketSalesHybridFragment, this.configurationProvider.get());
        injectProfileManager(ticketSalesHybridFragment, this.profileManagerProvider.get());
        injectUniversalCheckoutDataManager(ticketSalesHybridFragment, this.universalCheckoutDataManagerProvider.get());
        injectUniversalCheckoutConfiguration(ticketSalesHybridFragment, this.universalCheckoutConfigurationProvider.get());
    }
}