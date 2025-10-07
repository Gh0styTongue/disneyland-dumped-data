package com.disney.wdpro.lambdareportinglib;

import android.content.Context;
import ck.C6187a;
import javax.inject.Provider;
import kotlinx.coroutines.InterfaceC30065h0;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.a */
/* loaded from: classes29.dex */
public final class C13462a implements InterfaceC30583e<LambdaReportingManager> {
    private final Provider<C6187a> analyticsRepositoryProvider;
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC30065h0> coroutineScopeProvider;

    public C13462a(Provider<Context> provider, Provider<C6187a> provider2, Provider<InterfaceC30065h0> provider3) {
        this.contextProvider = provider;
        this.analyticsRepositoryProvider = provider2;
        this.coroutineScopeProvider = provider3;
    }

    /* renamed from: a */
    public static C13462a m55859a(Provider<Context> provider, Provider<C6187a> provider2, Provider<InterfaceC30065h0> provider3) {
        return new C13462a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static LambdaReportingManager m55860c(Context context, C6187a c6187a, InterfaceC30065h0 interfaceC30065h0) {
        return new LambdaReportingManager(context, c6187a, interfaceC30065h0);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LambdaReportingManager get() {
        return m55860c(this.contextProvider.get(), this.analyticsRepositoryProvider.get(), this.coroutineScopeProvider.get());
    }
}