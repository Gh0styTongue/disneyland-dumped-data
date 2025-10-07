package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideMbleDataManagerImplFactory implements InterfaceC30583e<MbleDataManager> {
    private final Provider<MbleDataManagerImpl> implProvider;
    private final MbleCoreModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public MbleCoreModule_ProvideMbleDataManagerImplFactory(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<MbleDataManagerImpl> provider2) {
        this.module = mbleCoreModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static MbleCoreModule_ProvideMbleDataManagerImplFactory create(MbleCoreModule mbleCoreModule, Provider<ProxyFactory> provider, Provider<MbleDataManagerImpl> provider2) {
        return new MbleCoreModule_ProvideMbleDataManagerImplFactory(mbleCoreModule, provider, provider2);
    }

    public static MbleDataManager provideMbleDataManagerImpl(MbleCoreModule mbleCoreModule, ProxyFactory proxyFactory, MbleDataManagerImpl mbleDataManagerImpl) {
        return (MbleDataManager) C30587i.m94207e(mbleCoreModule.provideMbleDataManagerImpl(proxyFactory, mbleDataManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleDataManager get() {
        return provideMbleDataManagerImpl(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}