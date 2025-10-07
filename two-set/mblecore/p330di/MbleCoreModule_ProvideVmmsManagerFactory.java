package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.api.VmmsManager;
import com.disney.wdpro.mblecore.api.VmmsManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideVmmsManagerFactory implements InterfaceC30583e<VmmsManager> {
    private final Provider<VmmsManagerImpl> implProvider;
    private final MbleCoreModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public MbleCoreModule_ProvideVmmsManagerFactory(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<VmmsManagerImpl> provider2) {
        this.module = mbleCoreModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static MbleCoreModule_ProvideVmmsManagerFactory create(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<VmmsManagerImpl> provider2) {
        return new MbleCoreModule_ProvideVmmsManagerFactory(mbleCoreModule, provider, provider2);
    }

    public static VmmsManager provideVmmsManager(MbleCoreModule mbleCoreModule, ProxyFactory proxyFactory, VmmsManagerImpl vmmsManagerImpl) {
        return (VmmsManager) C30587i.m94207e(mbleCoreModule.provideVmmsManager(proxyFactory, vmmsManagerImpl));
    }

    @Override // javax.inject.Provider
    public VmmsManager get() {
        return provideVmmsManager(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}