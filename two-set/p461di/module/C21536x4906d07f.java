package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActionsImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.VirtualQueueConfirmationFragmentModule_ProvidePeekViewActions$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21536x4906d07f implements InterfaceC30583e<PeekViewActions> {
    private final VirtualQueueConfirmationFragmentModule module;
    private final Provider<PeekViewActionsImpl> peekViewActionsImplProvider;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C21536x4906d07f(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<ProxyFactory> provider, Provider<PeekViewActionsImpl> provider2) {
        this.module = virtualQueueConfirmationFragmentModule;
        this.proxyFactoryProvider = provider;
        this.peekViewActionsImplProvider = provider2;
    }

    public static C21536x4906d07f create(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<ProxyFactory> provider, Provider<PeekViewActionsImpl> provider2) {
        return new C21536x4906d07f(virtualQueueConfirmationFragmentModule, provider, provider2);
    }

    public static PeekViewActions providePeekViewActions$virtual_queue_lib_release(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, ProxyFactory proxyFactory, PeekViewActionsImpl peekViewActionsImpl) {
        return (PeekViewActions) C30587i.m94207e(virtualQueueConfirmationFragmentModule.providePeekViewActions$virtual_queue_lib_release(proxyFactory, peekViewActionsImpl));
    }

    @Override // javax.inject.Provider
    public PeekViewActions get() {
        return providePeekViewActions$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.peekViewActionsImplProvider.get());
    }
}