package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActionsImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class DetailFragmentModule_ProvidePeekViewActionsFactory implements InterfaceC30583e<PeekViewActions> {
    private final DetailFragmentModule module;
    private final Provider<PeekViewActionsImpl> peekViewActionsImplProvider;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public DetailFragmentModule_ProvidePeekViewActionsFactory(DetailFragmentModule detailFragmentModule, Provider<ProxyFactory> provider, Provider<PeekViewActionsImpl> provider2) {
        this.module = detailFragmentModule;
        this.proxyFactoryProvider = provider;
        this.peekViewActionsImplProvider = provider2;
    }

    public static DetailFragmentModule_ProvidePeekViewActionsFactory create(DetailFragmentModule detailFragmentModule, Provider<ProxyFactory> provider, Provider<PeekViewActionsImpl> provider2) {
        return new DetailFragmentModule_ProvidePeekViewActionsFactory(detailFragmentModule, provider, provider2);
    }

    public static PeekViewActions providePeekViewActions(DetailFragmentModule detailFragmentModule, ProxyFactory proxyFactory, PeekViewActionsImpl peekViewActionsImpl) {
        return (PeekViewActions) C30587i.m94207e(detailFragmentModule.providePeekViewActions(proxyFactory, peekViewActionsImpl));
    }

    @Override // javax.inject.Provider
    public PeekViewActions get() {
        return providePeekViewActions(this.module, this.proxyFactoryProvider.get(), this.peekViewActionsImplProvider.get());
    }
}