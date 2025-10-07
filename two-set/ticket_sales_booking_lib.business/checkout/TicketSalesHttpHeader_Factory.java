package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.commons.C9314j;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes18.dex */
public final class TicketSalesHttpHeader_Factory implements InterfaceC30583e<TicketSalesHttpHeader> {
    private final Provider<C9314j> parkAppConfigurationProvider;

    public TicketSalesHttpHeader_Factory(Provider<C9314j> provider) {
        this.parkAppConfigurationProvider = provider;
    }

    public static TicketSalesHttpHeader_Factory create(Provider<C9314j> provider) {
        return new TicketSalesHttpHeader_Factory(provider);
    }

    public static TicketSalesHttpHeader newInstance(C9314j c9314j) {
        return new TicketSalesHttpHeader(c9314j);
    }

    @Override // javax.inject.Provider
    public TicketSalesHttpHeader get() {
        return newInstance(this.parkAppConfigurationProvider.get());
    }
}