package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.httpclient.C13345q;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes18.dex */
public final class ListServiceApiClientImpl_Factory implements InterfaceC30583e<ListServiceApiClientImpl> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C13345q> httpApiClientProvider;
    private final Provider<ServiceBaseUrlApiClient> serviceBaseUrlApiClientProvider;

    public ListServiceApiClientImpl_Factory(Provider<C13345q> provider, Provider<ServiceBaseUrlApiClient> provider2, Provider<InterfaceC8682n> provider3) {
        this.httpApiClientProvider = provider;
        this.serviceBaseUrlApiClientProvider = provider2;
        this.crashHelperProvider = provider3;
    }

    public static ListServiceApiClientImpl_Factory create(Provider<C13345q> provider, Provider<ServiceBaseUrlApiClient> provider2, Provider<InterfaceC8682n> provider3) {
        return new ListServiceApiClientImpl_Factory(provider, provider2, provider3);
    }

    public static ListServiceApiClientImpl newInstance(C13345q c13345q, ServiceBaseUrlApiClient serviceBaseUrlApiClient, InterfaceC8682n interfaceC8682n) {
        return new ListServiceApiClientImpl(c13345q, serviceBaseUrlApiClient, interfaceC8682n);
    }

    @Override // javax.inject.Provider
    public ListServiceApiClientImpl get() {
        return newInstance(this.httpApiClientProvider.get(), this.serviceBaseUrlApiClientProvider.get(), this.crashHelperProvider.get());
    }
}