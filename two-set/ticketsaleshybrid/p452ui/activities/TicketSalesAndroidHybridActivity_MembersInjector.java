package com.disney.wdpro.ticketsaleshybrid.p452ui.activities;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9251d;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.support.activities.C20530d;
import com.disney.wdpro.ticketsaleshybrid.p452ui.Settings.TicketSalesAndroidHybridEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;
import p972u9.C32393a;

/* loaded from: classes19.dex */
public final class TicketSalesAndroidHybridActivity_MembersInjector implements MembersInjector<TicketSalesAndroidHybridActivity> {
    private final Provider<C32393a> adobeNotificationTrackingHelperProvider;
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ProfileConfiguration> profileConfigurationProvider;
    private final Provider<TicketSalesAndroidHybridEnvironment> ticketSalesAndroidHybridEnvironmentProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public TicketSalesAndroidHybridActivity_MembersInjector(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<C9248i> provider9, Provider<ProfileConfiguration> provider10, Provider<UniversalCheckoutDataManager> provider11, Provider<TicketSalesAndroidHybridEnvironment> provider12) {
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
        this.ticketSalesAndroidHybridEnvironmentProvider = provider12;
    }

    public static MembersInjector<TicketSalesAndroidHybridActivity> create(Provider<StickyEventBus> provider, Provider<AuthenticationManager> provider2, Provider<C8667g.b> provider3, Provider<InterfaceC8679k> provider4, Provider<InterfaceC8682n> provider5, Provider<C32393a> provider6, Provider<DispatchingAndroidInjector<Object>> provider7, Provider<C9350r> provider8, Provider<C9248i> provider9, Provider<ProfileConfiguration> provider10, Provider<UniversalCheckoutDataManager> provider11, Provider<TicketSalesAndroidHybridEnvironment> provider12) {
        return new TicketSalesAndroidHybridActivity_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectProfileConfiguration(TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity, ProfileConfiguration profileConfiguration) {
        ticketSalesAndroidHybridActivity.profileConfiguration = profileConfiguration;
    }

    public static void injectTicketSalesAndroidHybridEnvironment(TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity, TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment) {
        ticketSalesAndroidHybridActivity.ticketSalesAndroidHybridEnvironment = ticketSalesAndroidHybridEnvironment;
    }

    public static void injectUniversalCheckoutDataManager(TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity, UniversalCheckoutDataManager universalCheckoutDataManager) {
        ticketSalesAndroidHybridActivity.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity, C9248i c9248i) {
        ticketSalesAndroidHybridActivity.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity) {
        C9251d.m38816e(ticketSalesAndroidHybridActivity, this.busProvider.get());
        C9251d.m38815d(ticketSalesAndroidHybridActivity, this.authenticationManagerProvider.get());
        C9251d.m38818h(ticketSalesAndroidHybridActivity, this.navigationListenerProvider.get());
        C9251d.m38813b(ticketSalesAndroidHybridActivity, this.analyticsHelperProvider.get());
        C9251d.m38817f(ticketSalesAndroidHybridActivity, this.crashHelperProvider.get());
        C9251d.m38812a(ticketSalesAndroidHybridActivity, this.adobeNotificationTrackingHelperProvider.get());
        C9251d.m38814c(ticketSalesAndroidHybridActivity, this.androidInjectorProvider.get());
        C20530d.m62062b(ticketSalesAndroidHybridActivity, this.timeProvider.get());
        injectVendomatic(ticketSalesAndroidHybridActivity, this.vendomaticProvider.get());
        injectProfileConfiguration(ticketSalesAndroidHybridActivity, this.profileConfigurationProvider.get());
        injectUniversalCheckoutDataManager(ticketSalesAndroidHybridActivity, this.universalCheckoutDataManagerProvider.get());
        injectTicketSalesAndroidHybridEnvironment(ticketSalesAndroidHybridActivity, this.ticketSalesAndroidHybridEnvironmentProvider.get());
    }
}