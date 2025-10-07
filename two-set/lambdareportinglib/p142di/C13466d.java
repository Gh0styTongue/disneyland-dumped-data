package com.disney.wdpro.lambdareportinglib.p142di;

import com.disney.wdpro.photopass.services.configuration.PhotoPassEnvironment;
import com.disney.wdpro.photopass.services.configuration.PhotoPassLambdaReportingURLProvider;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.di.d */
/* loaded from: classes29.dex */
public final class C13466d implements InterfaceC30583e<PhotoPassLambdaReportingURLProvider> {
    private final Provider<PhotoPassEnvironment> lambdaReportingEnvironmentProvider;
    private final C13463a module;

    public C13466d(C13463a c13463a, Provider<PhotoPassEnvironment> provider) {
        this.module = c13463a;
        this.lambdaReportingEnvironmentProvider = provider;
    }

    /* renamed from: a */
    public static C13466d m55874a(C13463a c13463a, Provider<PhotoPassEnvironment> provider) {
        return new C13466d(c13463a, provider);
    }

    /* renamed from: c */
    public static PhotoPassLambdaReportingURLProvider m55875c(C13463a c13463a, PhotoPassEnvironment photoPassEnvironment) {
        return (PhotoPassLambdaReportingURLProvider) C30587i.m94207e(c13463a.m55864c(photoPassEnvironment));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PhotoPassLambdaReportingURLProvider get() {
        return m55875c(this.module, this.lambdaReportingEnvironmentProvider.get());
    }
}