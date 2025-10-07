package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiClient;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManagerImpl;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class GeneralTicketSalesCheckoutManagerImpl_Creator_Factory implements InterfaceC30583e<GeneralTicketSalesCheckoutManagerImpl.Creator> {
    private final Provider<BookingApiClient> bookingApiClientProvider;

    public GeneralTicketSalesCheckoutManagerImpl_Creator_Factory(Provider<BookingApiClient> provider) {
        this.bookingApiClientProvider = provider;
    }

    public static GeneralTicketSalesCheckoutManagerImpl_Creator_Factory create(Provider<BookingApiClient> provider) {
        return new GeneralTicketSalesCheckoutManagerImpl_Creator_Factory(provider);
    }

    public static GeneralTicketSalesCheckoutManagerImpl.Creator newInstance(BookingApiClient bookingApiClient) {
        return new GeneralTicketSalesCheckoutManagerImpl.Creator(bookingApiClient);
    }

    @Override // javax.inject.Provider
    public GeneralTicketSalesCheckoutManagerImpl.Creator get() {
        return newInstance(this.bookingApiClientProvider.get());
    }
}