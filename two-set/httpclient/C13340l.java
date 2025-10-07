package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.HttpApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;
import p1113yj.InterfaceC33655a;

/* renamed from: com.disney.wdpro.httpclient.l */
/* loaded from: classes23.dex */
public final class C13340l implements InterfaceC30583e<HttpApiClient> {
    private final Provider<InterfaceC33655a> akamaiManagerProvider;
    private final Provider<InterfaceC13334f> decoderProvider;
    private final Provider<AbstractC13341m> httpClientAdapterProvider;
    private final Provider<HttpApiClient.InterfaceC13319b> interceptorFactoryProvider;

    public C13340l(Provider<AbstractC13341m> provider, Provider<HttpApiClient.InterfaceC13319b> provider2, Provider<InterfaceC13334f> provider3, Provider<InterfaceC33655a> provider4) {
        this.httpClientAdapterProvider = provider;
        this.interceptorFactoryProvider = provider2;
        this.decoderProvider = provider3;
        this.akamaiManagerProvider = provider4;
    }

    /* renamed from: a */
    public static C13340l m55653a(Provider<AbstractC13341m> provider, Provider<HttpApiClient.InterfaceC13319b> provider2, Provider<InterfaceC13334f> provider3, Provider<InterfaceC33655a> provider4) {
        return new C13340l(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static HttpApiClient m55654c(AbstractC13341m abstractC13341m, HttpApiClient.InterfaceC13319b interfaceC13319b, InterfaceC13334f interfaceC13334f, InterfaceC33655a interfaceC33655a) {
        return new HttpApiClient(abstractC13341m, interfaceC13319b, interfaceC13334f, interfaceC33655a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public HttpApiClient get() {
        return m55654c(this.httpClientAdapterProvider.get(), this.interceptorFactoryProvider.get(), this.decoderProvider.get(), this.akamaiManagerProvider.get());
    }
}