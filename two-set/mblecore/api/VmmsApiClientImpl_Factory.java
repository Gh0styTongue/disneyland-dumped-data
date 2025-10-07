package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class VmmsApiClientImpl_Factory implements InterfaceC30583e<VmmsApiClientImpl> {
    private final Provider<HttpApiClient> httpApiClientProvider;
    private final Provider<UrlBuilder> urlBuilderProvider;
    private final Provider<MbleUserInfo> userInfoProvider;

    public VmmsApiClientImpl_Factory(Provider<UrlBuilder> provider, Provider<HttpApiClient> provider2, Provider<MbleUserInfo> provider3) {
        this.urlBuilderProvider = provider;
        this.httpApiClientProvider = provider2;
        this.userInfoProvider = provider3;
    }

    public static VmmsApiClientImpl_Factory create(Provider<UrlBuilder> provider, Provider<HttpApiClient> provider2, Provider<MbleUserInfo> provider3) {
        return new VmmsApiClientImpl_Factory(provider, provider2, provider3);
    }

    public static VmmsApiClientImpl newInstance(UrlBuilder urlBuilder, HttpApiClient httpApiClient, MbleUserInfo mbleUserInfo) {
        return new VmmsApiClientImpl(urlBuilder, httpApiClient, mbleUserInfo);
    }

    @Override // javax.inject.Provider
    public VmmsApiClientImpl get() {
        return newInstance(this.urlBuilderProvider.get(), this.httpApiClientProvider.get(), this.userInfoProvider.get());
    }
}