package com.disney.wdpro.lambdareportinglib.p142di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.photopass.services.apiclient.lambdareporting.LambdaReportingApiClient;
import com.disney.wdpro.photopass.services.apiclient.lambdareporting.LambdaReportingApiClientImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.di.g */
/* loaded from: classes29.dex */
public final class C13469g implements InterfaceC30583e<LambdaReportingApiClient> {
    private final Provider<LambdaReportingApiClientImpl> apiClientProvider;
    private final C13463a module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C13469g(C13463a c13463a, Provider<ProxyFactory> provider, Provider<LambdaReportingApiClientImpl> provider2) {
        this.module = c13463a;
        this.proxyFactoryProvider = provider;
        this.apiClientProvider = provider2;
    }

    /* renamed from: a */
    public static C13469g m55883a(C13463a c13463a, Provider<ProxyFactory> provider, Provider<LambdaReportingApiClientImpl> provider2) {
        return new C13469g(c13463a, provider, provider2);
    }

    /* renamed from: c */
    public static LambdaReportingApiClient m55884c(C13463a c13463a, ProxyFactory proxyFactory, LambdaReportingApiClientImpl lambdaReportingApiClientImpl) {
        return (LambdaReportingApiClient) C30587i.m94207e(c13463a.m55867f(proxyFactory, lambdaReportingApiClientImpl));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LambdaReportingApiClient get() {
        return m55884c(this.module, this.proxyFactoryProvider.get(), this.apiClientProvider.get());
    }
}