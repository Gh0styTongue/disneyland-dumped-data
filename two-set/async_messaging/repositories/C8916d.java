package com.disney.wdpro.async_messaging.repositories;

import android.content.Context;
import com.disney.wdpro.async_messaging.analytics.C8909b;
import com.disney.wdpro.async_messaging.analytics.C8911d;
import javax.inject.Provider;
import mx.InterfaceC30583e;
import p699k9.C29553b;
import p699k9.InterfaceC29554c;
import p768n9.InterfaceC30634g;

/* renamed from: com.disney.wdpro.async_messaging.repositories.d */
/* loaded from: classes24.dex */
public final class C8916d implements InterfaceC30583e<C8915c> {
    private final Provider<C8909b> campaignProvider;
    private final Provider<C29553b> configurationProvider;
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC29554c> environmentProvider;
    private final Provider<C8911d> liveChatAnalyticsProvider;
    private final Provider<InterfaceC30634g> livePersonProvider;

    public C8916d(Provider<Context> provider, Provider<InterfaceC29554c> provider2, Provider<InterfaceC30634g> provider3, Provider<C8911d> provider4, Provider<C29553b> provider5, Provider<C8909b> provider6) {
        this.contextProvider = provider;
        this.environmentProvider = provider2;
        this.livePersonProvider = provider3;
        this.liveChatAnalyticsProvider = provider4;
        this.configurationProvider = provider5;
        this.campaignProvider = provider6;
    }

    /* renamed from: a */
    public static C8916d m37889a(Provider<Context> provider, Provider<InterfaceC29554c> provider2, Provider<InterfaceC30634g> provider3, Provider<C8911d> provider4, Provider<C29553b> provider5, Provider<C8909b> provider6) {
        return new C8916d(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static C8915c m37890c(Context context, InterfaceC29554c interfaceC29554c, InterfaceC30634g interfaceC30634g, C8911d c8911d, C29553b c29553b, C8909b c8909b) {
        return new C8915c(context, interfaceC29554c, interfaceC30634g, c8911d, c29553b, c8909b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8915c get() {
        return m37890c(this.contextProvider.get(), this.environmentProvider.get(), this.livePersonProvider.get(), this.liveChatAnalyticsProvider.get(), this.configurationProvider.get(), this.campaignProvider.get());
    }
}