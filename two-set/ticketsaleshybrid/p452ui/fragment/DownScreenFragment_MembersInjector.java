package com.disney.wdpro.ticketsaleshybrid.p452ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.InterfaceC9311h;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.ticketsaleshybrid.TicketSalesHybridAndroidConfiguration;
import com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes19.dex */
public final class DownScreenFragment_MembersInjector implements MembersInjector<DownScreenFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC9311h> commonsEnvironmentProvider;
    private final Provider<TicketSalesHybridAndroidConfiguration> configurationProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<GlobalResourceManager> globalResourceManagerProvider;
    private final Provider<C8667g.b> navigationListenerProvider;

    public DownScreenFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<TicketSalesHybridAndroidConfiguration> provider7, Provider<GlobalResourceManager> provider8, Provider<InterfaceC9311h> provider9) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.configurationProvider = provider7;
        this.globalResourceManagerProvider = provider8;
        this.commonsEnvironmentProvider = provider9;
    }

    public static MembersInjector<DownScreenFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<TicketSalesHybridAndroidConfiguration> provider7, Provider<GlobalResourceManager> provider8, Provider<InterfaceC9311h> provider9) {
        return new DownScreenFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectCommonsEnvironment(DownScreenFragment downScreenFragment, InterfaceC9311h interfaceC9311h) {
        downScreenFragment.commonsEnvironment = interfaceC9311h;
    }

    public static void injectConfiguration(DownScreenFragment downScreenFragment, TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration) {
        downScreenFragment.configuration = ticketSalesHybridAndroidConfiguration;
    }

    public static void injectGlobalResourceManager(DownScreenFragment downScreenFragment, GlobalResourceManager globalResourceManager) {
        downScreenFragment.globalResourceManager = globalResourceManager;
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
        injectGlobalResourceManager(downScreenFragment, this.globalResourceManagerProvider.get());
        injectCommonsEnvironment(downScreenFragment, this.commonsEnvironmentProvider.get());
    }
}