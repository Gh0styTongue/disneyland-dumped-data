package com.disney.wdpro.lambdareportinglib.p142di;

import ck.C6187a;
import com.disney.wdpro.lambdareportinglib.repository.p143db.AnalyticsDatabase;
import com.disney.wdpro.photopass.services.apiclient.lambdareporting.LambdaReportingApiClient;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.di.f */
/* loaded from: classes29.dex */
public final class C13468f implements InterfaceC30583e<C6187a> {
    private final Provider<AnalyticsDatabase> analyticsDatabaseProvider;
    private final Provider<LambdaReportingApiClient> apiClientProvider;
    private final C13463a module;

    public C13468f(C13463a c13463a, Provider<AnalyticsDatabase> provider, Provider<LambdaReportingApiClient> provider2) {
        this.module = c13463a;
        this.analyticsDatabaseProvider = provider;
        this.apiClientProvider = provider2;
    }

    /* renamed from: a */
    public static C13468f m55880a(C13463a c13463a, Provider<AnalyticsDatabase> provider, Provider<LambdaReportingApiClient> provider2) {
        return new C13468f(c13463a, provider, provider2);
    }

    /* renamed from: c */
    public static C6187a m55881c(C13463a c13463a, AnalyticsDatabase analyticsDatabase, LambdaReportingApiClient lambdaReportingApiClient) {
        return (C6187a) C30587i.m94207e(c13463a.m55866e(analyticsDatabase, lambdaReportingApiClient));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6187a get() {
        return m55881c(this.module, this.analyticsDatabaseProvider.get(), this.apiClientProvider.get());
    }
}