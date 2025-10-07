package com.disney.wdpro.general_ticket_sales_ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment_MembersInjector;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class GeneralTicketSalesOrderSummaryFragment_MembersInjector implements MembersInjector<GeneralTicketSalesOrderSummaryFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<InterfaceC9336k> locationMonitorProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider2;
    private final Provider<C9248i> vendomaticProvider;

    public GeneralTicketSalesOrderSummaryFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9248i> provider8, Provider<ResidentOfferManager> provider9, Provider<InterfaceC9336k> provider10) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.residentOfferManagerProvider = provider7;
        this.vendomaticProvider = provider8;
        this.residentOfferManagerProvider2 = provider9;
        this.locationMonitorProvider = provider10;
    }

    public static MembersInjector<GeneralTicketSalesOrderSummaryFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9248i> provider8, Provider<ResidentOfferManager> provider9, Provider<InterfaceC9336k> provider10) {
        return new GeneralTicketSalesOrderSummaryFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static void injectLocationMonitor(GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment, InterfaceC9336k interfaceC9336k) {
        generalTicketSalesOrderSummaryFragment.locationMonitor = interfaceC9336k;
    }

    public static void injectResidentOfferManager(GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment, ResidentOfferManager residentOfferManager) {
        generalTicketSalesOrderSummaryFragment.residentOfferManager = residentOfferManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment) {
        C9308e.m38895d(generalTicketSalesOrderSummaryFragment, this.busProvider.get());
        C9308e.m38892a(generalTicketSalesOrderSummaryFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(generalTicketSalesOrderSummaryFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(generalTicketSalesOrderSummaryFragment, this.crashHelperProvider.get());
        C9308e.m38897g(generalTicketSalesOrderSummaryFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(generalTicketSalesOrderSummaryFragment, this.androidInjectorProvider.get());
        BaseOrderSummaryFragment_MembersInjector.injectResidentOfferManager(generalTicketSalesOrderSummaryFragment, this.residentOfferManagerProvider.get());
        BaseOrderSummaryFragment_MembersInjector.injectVendomatic(generalTicketSalesOrderSummaryFragment, this.vendomaticProvider.get());
        injectResidentOfferManager(generalTicketSalesOrderSummaryFragment, this.residentOfferManagerProvider2.get());
        injectLocationMonitor(generalTicketSalesOrderSummaryFragment, this.locationMonitorProvider.get());
    }
}