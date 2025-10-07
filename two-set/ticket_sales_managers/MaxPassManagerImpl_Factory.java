package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes19.dex */
public final class MaxPassManagerImpl_Factory implements InterfaceC30583e<MaxPassManagerImpl> {
    private final Provider<ProductAssemblerApiClient> productAssemblerApiClientProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MaxPassManagerImpl_Factory(Provider<ProductAssemblerApiClient> provider, Provider<C9248i> provider2) {
        this.productAssemblerApiClientProvider = provider;
        this.vendomaticProvider = provider2;
    }

    public static MaxPassManagerImpl_Factory create(Provider<ProductAssemblerApiClient> provider, Provider<C9248i> provider2) {
        return new MaxPassManagerImpl_Factory(provider, provider2);
    }

    public static MaxPassManagerImpl newInstance(ProductAssemblerApiClient productAssemblerApiClient, C9248i c9248i) {
        return new MaxPassManagerImpl(productAssemblerApiClient, c9248i);
    }

    @Override // javax.inject.Provider
    public MaxPassManagerImpl get() {
        return newInstance(this.productAssemblerApiClientProvider.get(), this.vendomaticProvider.get());
    }
}