package com.disney.wdpro.general_ticket_sales_ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment_MembersInjector;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.payments.models.PaymentsEnvironment;
import com.disney.wdpro.profile_ui.ProfileConfiguration;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment_MembersInjector;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class GeneralTicketSalesFragment_MembersInjector implements MembersInjector<GeneralTicketSalesFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<PaymentsEnvironment> paymentsEnvironmentProvider;
    private final Provider<ProfileConfiguration> profileConfigurationProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9350r> timeProvider2;
    private final Provider<C9350r> timeProvider3;
    private final Provider<UniversalCheckoutDataManager> universalCheckoutDataManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public GeneralTicketSalesFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9350r> provider8, Provider<C9350r> provider9, Provider<C9350r> provider10, Provider<C9248i> provider11, Provider<PaymentsEnvironment> provider12, Provider<ProfileConfiguration> provider13, Provider<UniversalCheckoutDataManager> provider14) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.residentOfferManagerProvider = provider7;
        this.timeProvider = provider8;
        this.timeProvider2 = provider9;
        this.timeProvider3 = provider10;
        this.vendomaticProvider = provider11;
        this.paymentsEnvironmentProvider = provider12;
        this.profileConfigurationProvider = provider13;
        this.universalCheckoutDataManagerProvider = provider14;
    }

    public static MembersInjector<GeneralTicketSalesFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9350r> provider8, Provider<C9350r> provider9, Provider<C9350r> provider10, Provider<C9248i> provider11, Provider<PaymentsEnvironment> provider12, Provider<ProfileConfiguration> provider13, Provider<UniversalCheckoutDataManager> provider14) {
        return new GeneralTicketSalesFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectPaymentsEnvironment(GeneralTicketSalesFragment generalTicketSalesFragment, PaymentsEnvironment paymentsEnvironment) {
        generalTicketSalesFragment.paymentsEnvironment = paymentsEnvironment;
    }

    public static void injectProfileConfiguration(GeneralTicketSalesFragment generalTicketSalesFragment, ProfileConfiguration profileConfiguration) {
        generalTicketSalesFragment.profileConfiguration = profileConfiguration;
    }

    public static void injectTime(GeneralTicketSalesFragment generalTicketSalesFragment, C9350r c9350r) {
        generalTicketSalesFragment.time = c9350r;
    }

    public static void injectUniversalCheckoutDataManager(GeneralTicketSalesFragment generalTicketSalesFragment, UniversalCheckoutDataManager universalCheckoutDataManager) {
        generalTicketSalesFragment.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public static void injectVendomatic(GeneralTicketSalesFragment generalTicketSalesFragment, C9248i c9248i) {
        generalTicketSalesFragment.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeneralTicketSalesFragment generalTicketSalesFragment) {
        C9308e.m38895d(generalTicketSalesFragment, this.busProvider.get());
        C9308e.m38892a(generalTicketSalesFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(generalTicketSalesFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(generalTicketSalesFragment, this.crashHelperProvider.get());
        C9308e.m38897g(generalTicketSalesFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(generalTicketSalesFragment, this.androidInjectorProvider.get());
        BaseSelectionFragment_MembersInjector.injectResidentOfferManager(generalTicketSalesFragment, this.residentOfferManagerProvider.get());
        BaseSelectionFragment_MembersInjector.injectTime(generalTicketSalesFragment, this.timeProvider.get());
        BaseSelectionVASFragment_MembersInjector.injectTime(generalTicketSalesFragment, this.timeProvider2.get());
        injectTime(generalTicketSalesFragment, this.timeProvider3.get());
        injectVendomatic(generalTicketSalesFragment, this.vendomaticProvider.get());
        injectPaymentsEnvironment(generalTicketSalesFragment, this.paymentsEnvironmentProvider.get());
        injectProfileConfiguration(generalTicketSalesFragment, this.profileConfigurationProvider.get());
        injectUniversalCheckoutDataManager(generalTicketSalesFragment, this.universalCheckoutDataManagerProvider.get());
    }
}