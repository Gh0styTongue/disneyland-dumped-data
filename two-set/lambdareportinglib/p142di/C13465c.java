package com.disney.wdpro.lambdareportinglib.p142di;

import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.InterfaceC30065h0;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.di.c */
/* loaded from: classes29.dex */
public final class C13465c implements InterfaceC30583e<InterfaceC30065h0> {
    private final Provider<CoroutineContext> coroutineContextProvider;
    private final C13463a module;

    public C13465c(C13463a c13463a, Provider<CoroutineContext> provider) {
        this.module = c13463a;
        this.coroutineContextProvider = provider;
    }

    /* renamed from: a */
    public static C13465c m55871a(C13463a c13463a, Provider<CoroutineContext> provider) {
        return new C13465c(c13463a, provider);
    }

    /* renamed from: c */
    public static InterfaceC30065h0 m55872c(C13463a c13463a, CoroutineContext coroutineContext) {
        return (InterfaceC30065h0) C30587i.m94207e(c13463a.m55863b(coroutineContext));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC30065h0 get() {
        return m55872c(this.module, this.coroutineContextProvider.get());
    }
}