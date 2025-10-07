package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.data.MbleTokenManager;
import com.disney.wdpro.mblecore.data.MbleTokenManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.mblecore.di.MbleCoreModule_ProvidesMbleTokenManager$magic_ble_core_lib_releaseFactory */
/* loaded from: classes2.dex */
public final class C16285x4b16a49d implements InterfaceC30583e<MbleTokenManager> {
    private final Provider<MbleTokenManagerImpl> implProvider;
    private final MbleCoreModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C16285x4b16a49d(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<MbleTokenManagerImpl> provider2) {
        this.module = mbleCoreModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static C16285x4b16a49d create(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<MbleTokenManagerImpl> provider2) {
        return new C16285x4b16a49d(mbleCoreModule, provider, provider2);
    }

    public static MbleTokenManager providesMbleTokenManager$magic_ble_core_lib_release(MbleCoreModule mbleCoreModule, ProxyFactory proxyFactory, MbleTokenManagerImpl mbleTokenManagerImpl) {
        return (MbleTokenManager) C30587i.m94207e(mbleCoreModule.providesMbleTokenManager$magic_ble_core_lib_release(proxyFactory, mbleTokenManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleTokenManager get() {
        return providesMbleTokenManager$magic_ble_core_lib_release(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}