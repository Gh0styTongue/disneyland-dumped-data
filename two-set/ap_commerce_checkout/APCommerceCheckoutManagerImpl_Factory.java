package com.disney.wdpro.ap_commerce_checkout;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.ListServiceApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import com.disney.wdpro.ticket_sales_managers.BookingApiSessionStore;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManagerImpl;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes23.dex */
public final class APCommerceCheckoutManagerImpl_Factory implements InterfaceC30583e<APCommerceCheckoutManagerImpl> {
    private final Provider<Context> appContextProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<GeneralTicketSalesCheckoutManagerImpl.Creator> creatorProvider;
    private final Provider<ListServiceApiClient> listServiceApiClientProvider;
    private final Provider<ProductAssemblerApiClient> productAssemblerApiClientProvider;
    private final Provider<BookingApiSessionStore> sessionStoreProvider;
    private final Provider<C9248i> vendomaticProvider;

    public APCommerceCheckoutManagerImpl_Factory(Provider<Context> provider, Provider<GeneralTicketSalesCheckoutManagerImpl.Creator> provider2, Provider<BookingApiSessionStore> provider3, Provider<InterfaceC8682n> provider4, Provider<ProductAssemblerApiClient> provider5, Provider<ListServiceApiClient> provider6, Provider<C9248i> provider7) {
        this.appContextProvider = provider;
        this.creatorProvider = provider2;
        this.sessionStoreProvider = provider3;
        this.crashHelperProvider = provider4;
        this.productAssemblerApiClientProvider = provider5;
        this.listServiceApiClientProvider = provider6;
        this.vendomaticProvider = provider7;
    }

    public static APCommerceCheckoutManagerImpl_Factory create(Provider<Context> provider, Provider<GeneralTicketSalesCheckoutManagerImpl.Creator> provider2, Provider<BookingApiSessionStore> provider3, Provider<InterfaceC8682n> provider4, Provider<ProductAssemblerApiClient> provider5, Provider<ListServiceApiClient> provider6, Provider<C9248i> provider7) {
        return new APCommerceCheckoutManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static APCommerceCheckoutManagerImpl newInstance(Context context, GeneralTicketSalesCheckoutManagerImpl.Creator creator, BookingApiSessionStore bookingApiSessionStore, InterfaceC8682n interfaceC8682n, ProductAssemblerApiClient productAssemblerApiClient, ListServiceApiClient listServiceApiClient, C9248i c9248i) {
        return new APCommerceCheckoutManagerImpl(context, creator, bookingApiSessionStore, interfaceC8682n, productAssemblerApiClient, listServiceApiClient, c9248i);
    }

    @Override // javax.inject.Provider
    public APCommerceCheckoutManagerImpl get() {
        return newInstance(this.appContextProvider.get(), this.creatorProvider.get(), this.sessionStoreProvider.get(), this.crashHelperProvider.get(), this.productAssemblerApiClientProvider.get(), this.listServiceApiClientProvider.get(), this.vendomaticProvider.get());
    }
}