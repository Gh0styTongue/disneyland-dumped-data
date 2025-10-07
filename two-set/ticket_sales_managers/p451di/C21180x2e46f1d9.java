package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManager;
import com.disney.wdpro.ticket_sales_managers.TicketSalesFragmentDataManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersModule_ProvideTicketSalesFragmentManagerFactory */
/* loaded from: classes19.dex */
public final class C21180x2e46f1d9 implements InterfaceC30583e<TicketSalesFragmentDataManager> {
    private final TicketSalesManagersModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;
    private final Provider<TicketSalesFragmentDataManagerImpl> ticketSalesFragmentDataManagerProvider;

    public C21180x2e46f1d9(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<TicketSalesFragmentDataManagerImpl> provider2) {
        this.module = ticketSalesManagersModule;
        this.proxyFactoryProvider = provider;
        this.ticketSalesFragmentDataManagerProvider = provider2;
    }

    public static C21180x2e46f1d9 create(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<TicketSalesFragmentDataManagerImpl> provider2) {
        return new C21180x2e46f1d9(ticketSalesManagersModule, provider, provider2);
    }

    public static TicketSalesFragmentDataManager provideTicketSalesFragmentManager(TicketSalesManagersModule ticketSalesManagersModule, ProxyFactory proxyFactory, TicketSalesFragmentDataManagerImpl ticketSalesFragmentDataManagerImpl) {
        return (TicketSalesFragmentDataManager) C30587i.m94207e(ticketSalesManagersModule.provideTicketSalesFragmentManager(proxyFactory, ticketSalesFragmentDataManagerImpl));
    }

    @Override // javax.inject.Provider
    public TicketSalesFragmentDataManager get() {
        return provideTicketSalesFragmentManager(this.module, this.proxyFactoryProvider.get(), this.ticketSalesFragmentDataManagerProvider.get());
    }
}