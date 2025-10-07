package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvideMbleLocalStorageManagerFactory implements InterfaceC30583e<MbleLocalStorageManager> {
    private final Provider<MbleLocalStorageManagerImpl> implProvider;
    private final MbleModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public MbleModule_ProvideMbleLocalStorageManagerFactory(MbleModule mbleModule, Provider<ProxyFactory> provider, Provider<MbleLocalStorageManagerImpl> provider2) {
        this.module = mbleModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static MbleModule_ProvideMbleLocalStorageManagerFactory create(MbleModule mbleModule, Provider<ProxyFactory> provider, Provider<MbleLocalStorageManagerImpl> provider2) {
        return new MbleModule_ProvideMbleLocalStorageManagerFactory(mbleModule, provider, provider2);
    }

    public static MbleLocalStorageManager provideMbleLocalStorageManager(MbleModule mbleModule, ProxyFactory proxyFactory, MbleLocalStorageManagerImpl mbleLocalStorageManagerImpl) {
        return (MbleLocalStorageManager) C30587i.m94207e(mbleModule.provideMbleLocalStorageManager(proxyFactory, mbleLocalStorageManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleLocalStorageManager get() {
        return provideMbleLocalStorageManager(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}