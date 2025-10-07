package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.manager.MbleAdvertisingManager;
import com.disney.wdpro.mblecore.manager.MbleAdvertisingManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.mblecore.di.MbleCoreModule_ProvidesMbleAdvertisingManager$magic_ble_core_lib_releaseFactory */
/* loaded from: classes2.dex */
public final class C16283x70813f52 implements InterfaceC30583e<MbleAdvertisingManager> {
    private final Provider<MbleAdvertisingManagerImpl> implProvider;
    private final MbleCoreModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C16283x70813f52(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<MbleAdvertisingManagerImpl> provider2) {
        this.module = mbleCoreModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static C16283x70813f52 create(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<MbleAdvertisingManagerImpl> provider2) {
        return new C16283x70813f52(mbleCoreModule, provider, provider2);
    }

    public static MbleAdvertisingManager providesMbleAdvertisingManager$magic_ble_core_lib_release(MbleCoreModule mbleCoreModule, ProxyFactory proxyFactory, MbleAdvertisingManagerImpl mbleAdvertisingManagerImpl) {
        return (MbleAdvertisingManager) C30587i.m94207e(mbleCoreModule.providesMbleAdvertisingManager$magic_ble_core_lib_release(proxyFactory, mbleAdvertisingManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleAdvertisingManager get() {
        return providesMbleAdvertisingManager$magic_ble_core_lib_release(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}