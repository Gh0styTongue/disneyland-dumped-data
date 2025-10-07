package com.disney.wdpro.lambdareportinglib.work;

import ck.C6187a;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.work.b */
/* loaded from: classes29.dex */
public final class C13478b implements InterfaceC30583e<C13477a> {
    private final Provider<C6187a> analyticsRepositoryProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<CoroutineContext> coroutineContextProvider;

    public C13478b(Provider<C6187a> provider, Provider<CoroutineContext> provider2, Provider<AuthenticationManager> provider3) {
        this.analyticsRepositoryProvider = provider;
        this.coroutineContextProvider = provider2;
        this.authenticationManagerProvider = provider3;
    }

    /* renamed from: a */
    public static C13478b m55927a(Provider<C6187a> provider, Provider<CoroutineContext> provider2, Provider<AuthenticationManager> provider3) {
        return new C13478b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13477a m55928c(C6187a c6187a, CoroutineContext coroutineContext, AuthenticationManager authenticationManager) {
        return new C13477a(c6187a, coroutineContext, authenticationManager);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13477a get() {
        return m55928c(this.analyticsRepositoryProvider.get(), this.coroutineContextProvider.get(), this.authenticationManagerProvider.get());
    }
}