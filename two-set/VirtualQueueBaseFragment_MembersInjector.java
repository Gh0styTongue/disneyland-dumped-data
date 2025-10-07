package com.disney.wdpro.virtualqueue.core;

import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9308e;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.squareup.otto.StickyEventBus;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

/* loaded from: classes20.dex */
public final class VirtualQueueBaseFragment_MembersInjector implements MembersInjector<VirtualQueueBaseFragment> {
    private final Provider<InterfaceC8679k> analyticsHelperProvider;
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<AuthenticationManager> authenticationManagerProvider2;
    private final Provider<StickyEventBus> busProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C8667g.b> navigationListenerProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueBaseFragment_MembersInjector(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9) {
        this.busProvider = provider;
        this.analyticsHelperProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.crashHelperProvider = provider4;
        this.navigationListenerProvider = provider5;
        this.androidInjectorProvider = provider6;
        this.virtualQueueRepositoryProvider = provider7;
        this.vqThemerProvider = provider8;
        this.authenticationManagerProvider2 = provider9;
    }

    public static MembersInjector<VirtualQueueBaseFragment> create(Provider<StickyEventBus> provider, Provider<InterfaceC8679k> provider2, Provider<AuthenticationManager> provider3, Provider<InterfaceC8682n> provider4, Provider<C8667g.b> provider5, Provider<DispatchingAndroidInjector<Object>> provider6, Provider<VirtualQueueRepository> provider7, Provider<VirtualQueueThemer> provider8, Provider<AuthenticationManager> provider9) {
        return new VirtualQueueBaseFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static void injectAuthenticationManager(VirtualQueueBaseFragment virtualQueueBaseFragment, AuthenticationManager authenticationManager) {
        virtualQueueBaseFragment.authenticationManager = authenticationManager;
    }

    public static void injectVirtualQueueRepository(VirtualQueueBaseFragment virtualQueueBaseFragment, VirtualQueueRepository virtualQueueRepository) {
        virtualQueueBaseFragment.virtualQueueRepository = virtualQueueRepository;
    }

    public static void injectVqThemer(VirtualQueueBaseFragment virtualQueueBaseFragment, VirtualQueueThemer virtualQueueThemer) {
        virtualQueueBaseFragment.vqThemer = virtualQueueThemer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VirtualQueueBaseFragment virtualQueueBaseFragment) {
        C9308e.m38895d(virtualQueueBaseFragment, this.busProvider.get());
        C9308e.m38892a(virtualQueueBaseFragment, this.analyticsHelperProvider.get());
        C9308e.m38894c(virtualQueueBaseFragment, this.authenticationManagerProvider.get());
        C9308e.m38896e(virtualQueueBaseFragment, this.crashHelperProvider.get());
        C9308e.m38897g(virtualQueueBaseFragment, this.navigationListenerProvider.get());
        C9308e.m38893b(virtualQueueBaseFragment, this.androidInjectorProvider.get());
        injectVirtualQueueRepository(virtualQueueBaseFragment, this.virtualQueueRepositoryProvider.get());
        injectVqThemer(virtualQueueBaseFragment, this.vqThemerProvider.get());
        injectAuthenticationManager(virtualQueueBaseFragment, this.authenticationManagerProvider2.get());
    }
}