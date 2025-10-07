package com.disney.wdpro.ticket_sales_managers.fragments;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseSelectionFragment_MembersInjector;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes19.dex */
public final class BaseSelectionVASFragment_MembersInjector implements MembersInjector<BaseSelectionVASFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<ResidentOfferManager> residentOfferManagerProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9350r> timeProvider2;

    public BaseSelectionVASFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9350r> provider8, Provider<C9350r> provider9) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.residentOfferManagerProvider = provider7;
        this.timeProvider = provider8;
        this.timeProvider2 = provider9;
    }

    public static MembersInjector<BaseSelectionVASFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<ResidentOfferManager> provider7, Provider<C9350r> provider8, Provider<C9350r> provider9) {
        return new BaseSelectionVASFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectTime(BaseSelectionVASFragment baseSelectionVASFragment, C9350r c9350r) {
        baseSelectionVASFragment.time = c9350r;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseSelectionVASFragment baseSelectionVASFragment) {
        C9308e.m38895d(baseSelectionVASFragment, this.busProvider.get());
        C9308e.m38892a(baseSelectionVASFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(baseSelectionVASFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(baseSelectionVASFragment, this.crashHelperProvider.get());
        C9308e.m38897g(baseSelectionVASFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(baseSelectionVASFragment, this.androidInjectorProvider.get());
        BaseSelectionFragment_MembersInjector.injectResidentOfferManager(baseSelectionVASFragment, this.residentOfferManagerProvider.get());
        BaseSelectionFragment_MembersInjector.injectTime(baseSelectionVASFragment, this.timeProvider.get());
        injectTime(baseSelectionVASFragment, this.timeProvider2.get());
    }
}