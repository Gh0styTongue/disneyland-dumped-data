package com.disney.wdpro.httpclient;

import com.disney.wdpro.analytics.InterfaceC8682n;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.httpclient.b */
/* loaded from: classes23.dex */
public final class C13328b implements InterfaceC30583e<C13322a> {
    private final Provider<InterfaceC8682n> crashHelperProvider;

    public C13328b(Provider<InterfaceC8682n> provider) {
        this.crashHelperProvider = provider;
    }

    /* renamed from: a */
    public static C13328b m55574a(Provider<InterfaceC8682n> provider) {
        return new C13328b(provider);
    }

    /* renamed from: c */
    public static C13322a m55575c(InterfaceC8682n interfaceC8682n) {
        return new C13322a(interfaceC8682n);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13322a get() {
        return m55575c(this.crashHelperProvider.get());
    }
}