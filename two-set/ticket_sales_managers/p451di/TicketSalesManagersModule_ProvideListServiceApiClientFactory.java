package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClientImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class TicketSalesManagersModule_ProvideListServiceApiClientFactory implements InterfaceC30583e<ListServiceApiClient> {
    private final Provider<ListServiceApiClientImpl> listServiceApiClientProvider;
    private final TicketSalesManagersModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public TicketSalesManagersModule_ProvideListServiceApiClientFactory(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<ListServiceApiClientImpl> provider2) {
        this.module = ticketSalesManagersModule;
        this.proxyFactoryProvider = provider;
        this.listServiceApiClientProvider = provider2;
    }

    public static TicketSalesManagersModule_ProvideListServiceApiClientFactory create(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<ListServiceApiClientImpl> provider2) {
        return new TicketSalesManagersModule_ProvideListServiceApiClientFactory(ticketSalesManagersModule, provider, provider2);
    }

    public static ListServiceApiClient provideListServiceApiClient(TicketSalesManagersModule ticketSalesManagersModule, ProxyFactory proxyFactory, ListServiceApiClientImpl listServiceApiClientImpl) {
        return (ListServiceApiClient) C30587i.m94207e(ticketSalesManagersModule.provideListServiceApiClient(proxyFactory, listServiceApiClientImpl));
    }

    @Override // javax.inject.Provider
    public ListServiceApiClient get() {
        return provideListServiceApiClient(this.module, this.proxyFactoryProvider.get(), this.listServiceApiClientProvider.get());
    }
}