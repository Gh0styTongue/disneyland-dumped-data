package com.disney.wdpro.ticket_sales_managers.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes19.dex */
public final class BaseConfirmationManagerFragment_MembersInjector implements MembersInjector<BaseConfirmationManagerFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public BaseConfirmationManagerFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.vendomaticProvider = provider7;
    }

    public static MembersInjector<BaseConfirmationManagerFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<C9248i> provider7) {
        return new BaseConfirmationManagerFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectVendomatic(BaseConfirmationManagerFragment baseConfirmationManagerFragment, C9248i c9248i) {
        baseConfirmationManagerFragment.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseConfirmationManagerFragment baseConfirmationManagerFragment) {
        C9308e.m38895d(baseConfirmationManagerFragment, this.busProvider.get());
        C9308e.m38892a(baseConfirmationManagerFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(baseConfirmationManagerFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(baseConfirmationManagerFragment, this.crashHelperProvider.get());
        C9308e.m38897g(baseConfirmationManagerFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(baseConfirmationManagerFragment, this.androidInjectorProvider.get());
        injectVendomatic(baseConfirmationManagerFragment, this.vendomaticProvider.get());
    }
}