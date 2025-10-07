package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.ticket_sales_base_lib.business.TicketSalesEnvironment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.TicketSalesHttpHeader;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes18.dex */
public final class ProductAssemblerApiClient_Factory implements InterfaceC30583e<ProductAssemblerApiClient> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C13345q> httpApiClientProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<TicketSalesEnvironment> ticketSalesEnvironmentProvider;
    private final Provider<TicketSalesHttpHeader> ticketSalesHttpHeaderProvider;
    private final Provider<C9248i> vendomaticProvider;

    public ProductAssemblerApiClient_Factory(Provider<C13345q> provider, Provider<TicketSalesEnvironment> provider2, Provider<C9314j> provider3, Provider<TicketSalesHttpHeader> provider4, Provider<InterfaceC8682n> provider5, Provider<C9248i> provider6) {
        this.httpApiClientProvider = provider;
        this.ticketSalesEnvironmentProvider = provider2;
        this.parkAppConfigurationProvider = provider3;
        this.ticketSalesHttpHeaderProvider = provider4;
        this.crashHelperProvider = provider5;
        this.vendomaticProvider = provider6;
    }

    public static ProductAssemblerApiClient_Factory create(Provider<C13345q> provider, Provider<TicketSalesEnvironment> provider2, Provider<C9314j> provider3, Provider<TicketSalesHttpHeader> provider4, Provider<InterfaceC8682n> provider5, Provider<C9248i> provider6) {
        return new ProductAssemblerApiClient_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ProductAssemblerApiClient newInstance(C13345q c13345q, TicketSalesEnvironment ticketSalesEnvironment, C9314j c9314j, TicketSalesHttpHeader ticketSalesHttpHeader, InterfaceC8682n interfaceC8682n, C9248i c9248i) {
        return new ProductAssemblerApiClient(c13345q, ticketSalesEnvironment, c9314j, ticketSalesHttpHeader, interfaceC8682n, c9248i);
    }

    @Override // javax.inject.Provider
    public ProductAssemblerApiClient get() {
        return newInstance(this.httpApiClientProvider.get(), this.ticketSalesEnvironmentProvider.get(), this.parkAppConfigurationProvider.get(), this.ticketSalesHttpHeaderProvider.get(), this.crashHelperProvider.get(), this.vendomaticProvider.get());
    }
}