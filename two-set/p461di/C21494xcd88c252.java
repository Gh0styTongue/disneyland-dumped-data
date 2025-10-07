package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi;
import com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApiImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueApi$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21494xcd88c252 implements InterfaceC30583e<VirtualQueueServiceApi> {
    private final VQCommonModules module;
    private final Provider<ProxyFactory> proxyFactoryProvider;
    private final Provider<VirtualQueueServiceApiImpl> virtualQueueApiProvider;

    public C21494xcd88c252(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueServiceApiImpl> provider2) {
        this.module = vQCommonModules;
        this.proxyFactoryProvider = provider;
        this.virtualQueueApiProvider = provider2;
    }

    public static C21494xcd88c252 create(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueServiceApiImpl> provider2) {
        return new C21494xcd88c252(vQCommonModules, provider, provider2);
    }

    public static VirtualQueueServiceApi provideVirtualQueueApi$virtual_queue_lib_release(VQCommonModules vQCommonModules, ProxyFactory proxyFactory, VirtualQueueServiceApiImpl virtualQueueServiceApiImpl) {
        return (VirtualQueueServiceApi) C30587i.m94207e(vQCommonModules.provideVirtualQueueApi$virtual_queue_lib_release(proxyFactory, virtualQueueServiceApiImpl));
    }

    @Override // javax.inject.Provider
    public VirtualQueueServiceApi get() {
        return provideVirtualQueueApi$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.virtualQueueApiProvider.get());
    }
}