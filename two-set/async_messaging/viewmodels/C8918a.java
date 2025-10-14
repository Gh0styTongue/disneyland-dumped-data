package com.disney.wdpro.async_messaging.viewmodels;

import android.content.Context;
import com.disney.wdpro.async_messaging.analytics.C8911d;
import com.disney.wdpro.async_messaging.repositories.InterfaceC8913a;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import mx.InterfaceC30583e;
import p699k9.InterfaceC29554c;
import p753m9.InterfaceC30476a;

/* renamed from: com.disney.wdpro.async_messaging.viewmodels.a */
/* loaded from: classes24.dex */
public final class C8918a implements InterfaceC30583e<LiveChatViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC29554c> environmentProvider;
    private final Provider<CoroutineDispatcher> ioDispatcherProvider;
    private final Provider<InterfaceC30476a> jsonWebTokenManagerProvider;
    private final Provider<C8911d> liveChatAnalyticsProvider;
    private final Provider<InterfaceC8913a> liveChatRepositoryProvider;

    public C8918a(Provider<InterfaceC8913a> provider, Provider<InterfaceC30476a> provider2, Provider<C8911d> provider3, Provider<Context> provider4, Provider<InterfaceC29554c> provider5, Provider<CoroutineDispatcher> provider6) {
        this.liveChatRepositoryProvider = provider;
        this.jsonWebTokenManagerProvider = provider2;
        this.liveChatAnalyticsProvider = provider3;
        this.contextProvider = provider4;
        this.environmentProvider = provider5;
        this.ioDispatcherProvider = provider6;
    }

    /* renamed from: a */
    public static C8918a m37919a(Provider<InterfaceC8913a> provider, Provider<InterfaceC30476a> provider2, Provider<C8911d> provider3, Provider<Context> provider4, Provider<InterfaceC29554c> provider5, Provider<CoroutineDispatcher> provider6) {
        return new C8918a(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static LiveChatViewModel m37920c(InterfaceC8913a interfaceC8913a, InterfaceC30476a interfaceC30476a, C8911d c8911d, Context context, InterfaceC29554c interfaceC29554c, CoroutineDispatcher coroutineDispatcher) {
        return new LiveChatViewModel(interfaceC8913a, interfaceC30476a, c8911d, context, interfaceC29554c, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LiveChatViewModel get() {
        return m37920c(this.liveChatRepositoryProvider.get(), this.jsonWebTokenManagerProvider.get(), this.liveChatAnalyticsProvider.get(), this.contextProvider.get(), this.environmentProvider.get(), this.ioDispatcherProvider.get());
    }
}