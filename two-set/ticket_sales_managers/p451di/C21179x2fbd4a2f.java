package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersModule_ProvideGeneralTicketSalesCheckoutManagerFactory */
/* loaded from: classes19.dex */
public final class C21179x2fbd4a2f implements InterfaceC30583e<GeneralTicketSalesCheckoutManager> {
    private final Provider<GeneralTicketSalesCheckoutManagerImpl> implProvider;
    private final TicketSalesManagersModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C21179x2fbd4a2f(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<GeneralTicketSalesCheckoutManagerImpl> provider2) {
        this.module = ticketSalesManagersModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static C21179x2fbd4a2f create(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<GeneralTicketSalesCheckoutManagerImpl> provider2) {
        return new C21179x2fbd4a2f(ticketSalesManagersModule, provider, provider2);
    }

    public static GeneralTicketSalesCheckoutManager provideGeneralTicketSalesCheckoutManager(TicketSalesManagersModule ticketSalesManagersModule, ProxyFactory proxyFactory, GeneralTicketSalesCheckoutManagerImpl generalTicketSalesCheckoutManagerImpl) {
        return (GeneralTicketSalesCheckoutManager) C30587i.m94207e(ticketSalesManagersModule.provideGeneralTicketSalesCheckoutManager(proxyFactory, generalTicketSalesCheckoutManagerImpl));
    }

    @Override // javax.inject.Provider
    public GeneralTicketSalesCheckoutManager get() {
        return provideGeneralTicketSalesCheckoutManager(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}