package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ServiceBaseUrlApiClient;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;
import p1138z9.InterfaceC33948a;

/* loaded from: classes19.dex */
public final class TicketSalesManagersModule_ProvideServiceBaseUrlApiClientFactory implements InterfaceC30583e<ServiceBaseUrlApiClient> {
    private final TicketSalesManagersModule module;
    private final Provider<InterfaceC33948a> remoteConfigEnvironmentProvider;

    public TicketSalesManagersModule_ProvideServiceBaseUrlApiClientFactory(TicketSalesManagersModule ticketSalesManagersModule, Provider<InterfaceC33948a> provider) {
        this.module = ticketSalesManagersModule;
        this.remoteConfigEnvironmentProvider = provider;
    }

    public static TicketSalesManagersModule_ProvideServiceBaseUrlApiClientFactory create(TicketSalesManagersModule ticketSalesManagersModule, Provider<InterfaceC33948a> provider) {
        return new TicketSalesManagersModule_ProvideServiceBaseUrlApiClientFactory(ticketSalesManagersModule, provider);
    }

    public static ServiceBaseUrlApiClient provideServiceBaseUrlApiClient(TicketSalesManagersModule ticketSalesManagersModule, InterfaceC33948a interfaceC33948a) {
        return (ServiceBaseUrlApiClient) C30587i.m94207e(ticketSalesManagersModule.provideServiceBaseUrlApiClient(interfaceC33948a));
    }

    @Override // javax.inject.Provider
    public ServiceBaseUrlApiClient get() {
        return provideServiceBaseUrlApiClient(this.module, this.remoteConfigEnvironmentProvider.get());
    }
}