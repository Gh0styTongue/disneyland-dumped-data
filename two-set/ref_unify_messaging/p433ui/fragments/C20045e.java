package com.disney.wdpro.ref_unify_messaging.p433ui.fragments;

import androidx.view.C3821v0;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* renamed from: com.disney.wdpro.ref_unify_messaging.ui.fragments.e */
/* loaded from: classes28.dex */
public final class C20045e implements MembersInjector<SubscriptionListsFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C3821v0.c> viewModelFactoryProvider;

    /* renamed from: b */
    public static void m61435b(SubscriptionListsFragment subscriptionListsFragment, C3821v0.c cVar) {
        subscriptionListsFragment.viewModelFactory = cVar;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SubscriptionListsFragment subscriptionListsFragment) {
        C9308e.m38895d(subscriptionListsFragment, this.busProvider.get());
        C9308e.m38892a(subscriptionListsFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(subscriptionListsFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(subscriptionListsFragment, this.crashHelperProvider.get());
        C9308e.m38897g(subscriptionListsFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(subscriptionListsFragment, this.androidInjectorProvider.get());
        m61435b(subscriptionListsFragment, this.viewModelFactoryProvider.get());
    }
}