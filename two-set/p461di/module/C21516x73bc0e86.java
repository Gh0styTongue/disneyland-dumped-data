package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActionsImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.HubLandingFragmentModule_ProvidePeekViewActions$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21516x73bc0e86 implements InterfaceC30583e<PeekViewActions> {
    private final HubLandingFragmentModule module;
    private final Provider<PeekViewActionsImpl> peekViewActionsImplProvider;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public C21516x73bc0e86(HubLandingFragmentModule hubLandingFragmentModule, Provider<ProxyFactory> provider, Provider<PeekViewActionsImpl> provider2) {
        this.module = hubLandingFragmentModule;
        this.proxyFactoryProvider = provider;
        this.peekViewActionsImplProvider = provider2;
    }

    public static C21516x73bc0e86 create(HubLandingFragmentModule hubLandingFragmentModule, Provider<ProxyFactory> provider, Provider<PeekViewActionsImpl> provider2) {
        return new C21516x73bc0e86(hubLandingFragmentModule, provider, provider2);
    }

    public static PeekViewActions providePeekViewActions$virtual_queue_lib_release(HubLandingFragmentModule hubLandingFragmentModule, ProxyFactory proxyFactory, PeekViewActionsImpl peekViewActionsImpl) {
        return (PeekViewActions) C30587i.m94207e(hubLandingFragmentModule.providePeekViewActions$virtual_queue_lib_release(proxyFactory, peekViewActionsImpl));
    }

    @Override // javax.inject.Provider
    public PeekViewActions get() {
        return providePeekViewActions$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.peekViewActionsImplProvider.get());
    }
}