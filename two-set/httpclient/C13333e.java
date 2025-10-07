package com.disney.wdpro.httpclient;

import android.content.Context;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.httpclient.e */
/* loaded from: classes23.dex */
public final class C13333e implements InterfaceC30583e<ConnectivityInterceptor> {
    private final Provider<Context> contextProvider;

    public C13333e(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    /* renamed from: a */
    public static C13333e m55641a(Provider<Context> provider) {
        return new C13333e(provider);
    }

    /* renamed from: c */
    public static ConnectivityInterceptor m55642c(Context context) {
        return new ConnectivityInterceptor(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConnectivityInterceptor get() {
        return m55642c(this.contextProvider.get());
    }
}