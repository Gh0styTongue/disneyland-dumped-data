package com.disney.wdpro.payments.business;

import com.disney.wdpro.httpclient.HttpApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes15.dex */
public final class NodePaymentApiClient_Factory implements InterfaceC30583e<NodePaymentApiClient> {
    private final Provider<String> baseUrlProvider;
    private final Provider<String> baseWalletURLProvider;
    private final Provider<String> clientVersionProvider;
    private final Provider<HttpApiClient> httpApiClientProvider;

    public NodePaymentApiClient_Factory(Provider<HttpApiClient> provider, Provider<String> provider2, Provider<String> provider3, Provider<String> provider4) {
        this.httpApiClientProvider = provider;
        this.baseUrlProvider = provider2;
        this.baseWalletURLProvider = provider3;
        this.clientVersionProvider = provider4;
    }

    public static NodePaymentApiClient_Factory create(Provider<HttpApiClient> provider, Provider<String> provider2, Provider<String> provider3, Provider<String> provider4) {
        return new NodePaymentApiClient_Factory(provider, provider2, provider3, provider4);
    }

    public static NodePaymentApiClient newInstance(HttpApiClient httpApiClient, String str, String str2, String str3) {
        return new NodePaymentApiClient(httpApiClient, str, str2, str3);
    }

    @Override // javax.inject.Provider
    public NodePaymentApiClient get() {
        return newInstance(this.httpApiClientProvider.get(), this.baseUrlProvider.get(), this.baseWalletURLProvider.get(), this.clientVersionProvider.get());
    }
}