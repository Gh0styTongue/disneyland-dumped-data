package com.disney.wdpro.general_ticket_sales_ui.fragment;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment_MembersInjector;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class DLRTicketSalesOrderConfirmationFragment_MembersInjector implements MembersInjector<DLRTicketSalesOrderConfirmationFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public DLRTicketSalesOrderConfirmationFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7, Provider<ResidentOfferManager> provider8) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.vendomaticProvider = provider7;
        this.residentOfferManagerProvider = provider8;
    }

    public static MembersInjector<DLRTicketSalesOrderConfirmationFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7, Provider<ResidentOfferManager> provider8) {
        return new DLRTicketSalesOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectResidentOfferManager(DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment, ResidentOfferManager residentOfferManager) {
        dLRTicketSalesOrderConfirmationFragment.residentOfferManager = residentOfferManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment) {
        C9308e.m38895d(dLRTicketSalesOrderConfirmationFragment, this.busProvider.get());
        C9308e.m38892a(dLRTicketSalesOrderConfirmationFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(dLRTicketSalesOrderConfirmationFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(dLRTicketSalesOrderConfirmationFragment, this.crashHelperProvider.get());
        C9308e.m38897g(dLRTicketSalesOrderConfirmationFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(dLRTicketSalesOrderConfirmationFragment, this.androidInjectorProvider.get());
        BaseConfirmationManagerFragment_MembersInjector.injectVendomatic(dLRTicketSalesOrderConfirmationFragment, this.vendomaticProvider.get());
        injectResidentOfferManager(dLRTicketSalesOrderConfirmationFragment, this.residentOfferManagerProvider.get());
    }
}