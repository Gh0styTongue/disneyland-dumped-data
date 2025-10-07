package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import dagger.Lazy;
import javax.inject.Provider;
import mx.C30582d;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueLifeCycle_Factory implements InterfaceC30583e<VirtualQueueLifeCycle> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<C9248i> vendomaticProvider;

    public VirtualQueueLifeCycle_Factory(Provider<AuthenticationManager> provider, Provider<C9248i> provider2) {
        this.authenticationManagerProvider = provider;
        this.vendomaticProvider = provider2;
    }

    public static VirtualQueueLifeCycle_Factory create(Provider<AuthenticationManager> provider, Provider<C9248i> provider2) {
        return new VirtualQueueLifeCycle_Factory(provider, provider2);
    }

    public static VirtualQueueLifeCycle newInstance(Lazy<AuthenticationManager> lazy, Lazy<C9248i> lazy2) {
        return new VirtualQueueLifeCycle(lazy, lazy2);
    }

    @Override // javax.inject.Provider
    public VirtualQueueLifeCycle get() {
        return newInstance(C30582d.m94189a(this.authenticationManagerProvider), C30582d.m94189a(this.vendomaticProvider));
    }
}