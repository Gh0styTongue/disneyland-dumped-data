package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class TicketSalesFragmentDataManagerImpl_Factory implements InterfaceC30583e<TicketSalesFragmentDataManagerImpl> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<ProductAssemblerApiClient> productAssemblerApiClientProvider;
    private final Provider<ResidentOffersDataFactory> residentOffersDataFactoryProvider;
    private final Provider<C9248i> vendomaticProvider;

    public TicketSalesFragmentDataManagerImpl_Factory(Provider<ProductAssemblerApiClient> provider, Provider<InterfaceC8682n> provider2, Provider<C9248i> provider3, Provider<ResidentOffersDataFactory> provider4) {
        this.productAssemblerApiClientProvider = provider;
        this.crashHelperProvider = provider2;
        this.vendomaticProvider = provider3;
        this.residentOffersDataFactoryProvider = provider4;
    }

    public static TicketSalesFragmentDataManagerImpl_Factory create(Provider<ProductAssemblerApiClient> provider, Provider<InterfaceC8682n> provider2, Provider<C9248i> provider3, Provider<ResidentOffersDataFactory> provider4) {
        return new TicketSalesFragmentDataManagerImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static TicketSalesFragmentDataManagerImpl newInstance(ProductAssemblerApiClient productAssemblerApiClient, InterfaceC8682n interfaceC8682n, C9248i c9248i, ResidentOffersDataFactory residentOffersDataFactory) {
        return new TicketSalesFragmentDataManagerImpl(productAssemblerApiClient, interfaceC8682n, c9248i, residentOffersDataFactory);
    }

    @Override // javax.inject.Provider
    public TicketSalesFragmentDataManagerImpl get() {
        return newInstance(this.productAssemblerApiClientProvider.get(), this.crashHelperProvider.get(), this.vendomaticProvider.get(), this.residentOffersDataFactoryProvider.get());
    }
}