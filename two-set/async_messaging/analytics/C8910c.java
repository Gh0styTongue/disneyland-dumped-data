package com.disney.wdpro.async_messaging.analytics;

import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.async_messaging.analytics.c */
/* loaded from: classes24.dex */
public final class C8910c implements InterfaceC30583e<C8909b> {

    /* renamed from: com.disney.wdpro.async_messaging.analytics.c$a */
    private static final class a {
        private static final C8910c INSTANCE = new C8910c();

        private a() {
        }
    }

    /* renamed from: a */
    public static C8910c m37804a() {
        return a.INSTANCE;
    }

    /* renamed from: c */
    public static C8909b m37805c() {
        return new C8909b();
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8909b get() {
        return m37805c();
    }
}