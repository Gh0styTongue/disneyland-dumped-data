package com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels;

import android.content.Context;
import com.disney.wdpro.analytics.InterfaceC8682n;
import gn.C28201a;
import java.util.Set;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import mx.InterfaceC30583e;
import p507dn.C27221a;
import p568fn.InterfaceC27998b;

/* renamed from: com.disney.wdpro.ref_unify_messaging.ui.viewmodels.a */
/* loaded from: classes28.dex */
public final class C20048a implements InterfaceC30583e<SubscriptionListsViewModel> {
    private final Provider<C27221a> analyticsCacheUiPreferenceProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatcher> coroutineDispatcherProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C28201a> mobileNotificationApiClientProvider;
    private final Provider<Set<InterfaceC27998b>> subscriptionListsListenersProvider;

    public C20048a(Provider<Context> provider, Provider<C28201a> provider2, Provider<CoroutineDispatcher> provider3, Provider<C27221a> provider4, Provider<InterfaceC8682n> provider5, Provider<Set<InterfaceC27998b>> provider6) {
        this.contextProvider = provider;
        this.mobileNotificationApiClientProvider = provider2;
        this.coroutineDispatcherProvider = provider3;
        this.analyticsCacheUiPreferenceProvider = provider4;
        this.crashHelperProvider = provider5;
        this.subscriptionListsListenersProvider = provider6;
    }

    /* renamed from: a */
    public static C20048a m61457a(Provider<Context> provider, Provider<C28201a> provider2, Provider<CoroutineDispatcher> provider3, Provider<C27221a> provider4, Provider<InterfaceC8682n> provider5, Provider<Set<InterfaceC27998b>> provider6) {
        return new C20048a(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static SubscriptionListsViewModel m61458c(Context context, C28201a c28201a, CoroutineDispatcher coroutineDispatcher, C27221a c27221a, InterfaceC8682n interfaceC8682n, Set<InterfaceC27998b> set) {
        return new SubscriptionListsViewModel(context, c28201a, coroutineDispatcher, c27221a, interfaceC8682n, set);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SubscriptionListsViewModel get() {
        return m61458c(this.contextProvider.get(), this.mobileNotificationApiClientProvider.get(), this.coroutineDispatcherProvider.get(), this.analyticsCacheUiPreferenceProvider.get(), this.crashHelperProvider.get(), this.subscriptionListsListenersProvider.get());
    }
}