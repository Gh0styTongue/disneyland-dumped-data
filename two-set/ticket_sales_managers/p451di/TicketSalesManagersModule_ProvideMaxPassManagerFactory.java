package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.ticket_sales_managers.MaxPassManager;
import com.disney.wdpro.ticket_sales_managers.MaxPassManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class TicketSalesManagersModule_ProvideMaxPassManagerFactory implements InterfaceC30583e<MaxPassManager> {
    private final Provider<MaxPassManagerImpl> maxPassManagerImplProvider;
    private final TicketSalesManagersModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public TicketSalesManagersModule_ProvideMaxPassManagerFactory(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<MaxPassManagerImpl> provider2) {
        this.module = ticketSalesManagersModule;
        this.proxyFactoryProvider = provider;
        this.maxPassManagerImplProvider = provider2;
    }

    public static TicketSalesManagersModule_ProvideMaxPassManagerFactory create(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<MaxPassManagerImpl> provider2) {
        return new TicketSalesManagersModule_ProvideMaxPassManagerFactory(ticketSalesManagersModule, provider, provider2);
    }

    public static MaxPassManager provideMaxPassManager(TicketSalesManagersModule ticketSalesManagersModule, ProxyFactory proxyFactory, MaxPassManagerImpl maxPassManagerImpl) {
        return (MaxPassManager) C30587i.m94207e(ticketSalesManagersModule.provideMaxPassManager(proxyFactory, maxPassManagerImpl));
    }

    @Override // javax.inject.Provider
    public MaxPassManager get() {
        return provideMaxPassManager(this.module, this.proxyFactoryProvider.get(), this.maxPassManagerImplProvider.get());
    }
}