package com.disney.wdpro.lambdareportinglib.p142di;

import kotlin.coroutines.CoroutineContext;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.lambdareportinglib.di.b */
/* loaded from: classes29.dex */
public final class C13464b implements InterfaceC30583e<CoroutineContext> {
    private final C13463a module;

    public C13464b(C13463a c13463a) {
        this.module = c13463a;
    }

    /* renamed from: a */
    public static C13464b m55868a(C13463a c13463a) {
        return new C13464b(c13463a);
    }

    /* renamed from: c */
    public static CoroutineContext m55869c(C13463a c13463a) {
        return (CoroutineContext) C30587i.m94207e(c13463a.m55862a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return m55869c(this.module);
    }
}