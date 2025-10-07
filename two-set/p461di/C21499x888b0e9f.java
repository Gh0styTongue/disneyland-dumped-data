package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueManager$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21499x888b0e9f implements InterfaceC30583e<VirtualQueueManager> {
    private final VQCommonModules module;
    private final Provider<ProxyFactory> proxyFactoryProvider;
    private final Provider<VirtualQueueManagerImpl> virtualQueueManagerProvider;

    public C21499x888b0e9f(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueManagerImpl> provider2) {
        this.module = vQCommonModules;
        this.proxyFactoryProvider = provider;
        this.virtualQueueManagerProvider = provider2;
    }

    public static C21499x888b0e9f create(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueManagerImpl> provider2) {
        return new C21499x888b0e9f(vQCommonModules, provider, provider2);
    }

    public static VirtualQueueManager provideVirtualQueueManager$virtual_queue_lib_release(VQCommonModules vQCommonModules, ProxyFactory proxyFactory, VirtualQueueManagerImpl virtualQueueManagerImpl) {
        return (VirtualQueueManager) C30587i.m94207e(vQCommonModules.provideVirtualQueueManager$virtual_queue_lib_release(proxyFactory, virtualQueueManagerImpl));
    }

    @Override // javax.inject.Provider
    public VirtualQueueManager get() {
        return provideVirtualQueueManager$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.virtualQueueManagerProvider.get());
    }
}