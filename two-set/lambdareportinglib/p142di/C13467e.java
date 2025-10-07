package com.disney.wdpro.lambdareportinglib.p142di;

import android.content.Context;
import com.disney.wdpro.lambdareportinglib.repository.p143db.AnalyticsDatabase;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.di.e */
/* loaded from: classes29.dex */
public final class C13467e implements InterfaceC30583e<AnalyticsDatabase> {
    private final Provider<Context> contextProvider;
    private final C13463a module;

    public C13467e(C13463a c13463a, Provider<Context> provider) {
        this.module = c13463a;
        this.contextProvider = provider;
    }

    /* renamed from: a */
    public static C13467e m55877a(C13463a c13463a, Provider<Context> provider) {
        return new C13467e(c13463a, provider);
    }

    /* renamed from: c */
    public static AnalyticsDatabase m55878c(C13463a c13463a, Context context) {
        return (AnalyticsDatabase) C30587i.m94207e(c13463a.m55865d(context));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AnalyticsDatabase get() {
        return m55878c(this.module, this.contextProvider.get());
    }
}