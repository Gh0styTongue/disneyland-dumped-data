package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesEnvironment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.TicketSalesHttpHeader;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class TicketSalesBookingApiClientImpl_Factory implements InterfaceC30583e<TicketSalesBookingApiClientImpl> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C13345q> httpApiClientProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<TicketSalesEnvironment> ticketSalesEnvironmentProvider;
    private final Provider<TicketSalesHttpHeader> ticketSalesHttpHeaderProvider;

    public TicketSalesBookingApiClientImpl_Factory(Provider<C13345q> provider, Provider<TicketSalesEnvironment> provider2, Provider<C9314j> provider3, Provider<TicketSalesHttpHeader> provider4, Provider<InterfaceC8682n> provider5) {
        this.httpApiClientProvider = provider;
        this.ticketSalesEnvironmentProvider = provider2;
        this.parkAppConfigurationProvider = provider3;
        this.ticketSalesHttpHeaderProvider = provider4;
        this.crashHelperProvider = provider5;
    }

    public static TicketSalesBookingApiClientImpl_Factory create(Provider<C13345q> provider, Provider<TicketSalesEnvironment> provider2, Provider<C9314j> provider3, Provider<TicketSalesHttpHeader> provider4, Provider<InterfaceC8682n> provider5) {
        return new TicketSalesBookingApiClientImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static TicketSalesBookingApiClientImpl newInstance(C13345q c13345q, TicketSalesEnvironment ticketSalesEnvironment, C9314j c9314j, TicketSalesHttpHeader ticketSalesHttpHeader, InterfaceC8682n interfaceC8682n) {
        return new TicketSalesBookingApiClientImpl(c13345q, ticketSalesEnvironment, c9314j, ticketSalesHttpHeader, interfaceC8682n);
    }

    @Override // javax.inject.Provider
    public TicketSalesBookingApiClientImpl get() {
        return newInstance(this.httpApiClientProvider.get(), this.ticketSalesEnvironmentProvider.get(), this.parkAppConfigurationProvider.get(), this.ticketSalesHttpHeaderProvider.get(), this.crashHelperProvider.get());
    }
}