package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient;
import com.disney.wdpro.ticket_sales_managers.TicketSalesBookingApiClientImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class TicketSalesManagersModule_ProvideBookingApiClientFactory implements InterfaceC30583e<BookingApiClient> {
    private final Provider<TicketSalesBookingApiClientImpl> bookingApiClientProvider;
    private final TicketSalesManagersModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public TicketSalesManagersModule_ProvideBookingApiClientFactory(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<TicketSalesBookingApiClientImpl> provider2) {
        this.module = ticketSalesManagersModule;
        this.proxyFactoryProvider = provider;
        this.bookingApiClientProvider = provider2;
    }

    public static TicketSalesManagersModule_ProvideBookingApiClientFactory create(TicketSalesManagersModule ticketSalesManagersModule, Provider<ProxyFactory> provider, Provider<TicketSalesBookingApiClientImpl> provider2) {
        return new TicketSalesManagersModule_ProvideBookingApiClientFactory(ticketSalesManagersModule, provider, provider2);
    }

    public static BookingApiClient provideBookingApiClient(TicketSalesManagersModule ticketSalesManagersModule, ProxyFactory proxyFactory, TicketSalesBookingApiClientImpl ticketSalesBookingApiClientImpl) {
        return (BookingApiClient) C30587i.m94207e(ticketSalesManagersModule.provideBookingApiClient(proxyFactory, ticketSalesBookingApiClientImpl));
    }

    @Override // javax.inject.Provider
    public BookingApiClient get() {
        return provideBookingApiClient(this.module, this.proxyFactoryProvider.get(), this.bookingApiClientProvider.get());
    }
}