package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProvider;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProviderImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueContentProvider$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21495xde8cff62 implements InterfaceC30583e<VirtualQueueContentProvider> {
    private final VQCommonModules module;
    private final Provider<ProxyFactory> proxyFactoryProvider;
    private final Provider<VirtualQueueContentProviderImpl> virtualQueueContentProvider;

    public C21495xde8cff62(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueContentProviderImpl> provider2) {
        this.module = vQCommonModules;
        this.proxyFactoryProvider = provider;
        this.virtualQueueContentProvider = provider2;
    }

    public static C21495xde8cff62 create(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueContentProviderImpl> provider2) {
        return new C21495xde8cff62(vQCommonModules, provider, provider2);
    }

    public static VirtualQueueContentProvider provideVirtualQueueContentProvider$virtual_queue_lib_release(VQCommonModules vQCommonModules, ProxyFactory proxyFactory, VirtualQueueContentProviderImpl virtualQueueContentProviderImpl) {
        return (VirtualQueueContentProvider) C30587i.m94207e(vQCommonModules.provideVirtualQueueContentProvider$virtual_queue_lib_release(proxyFactory, virtualQueueContentProviderImpl));
    }

    @Override // javax.inject.Provider
    public VirtualQueueContentProvider get() {
        return provideVirtualQueueContentProvider$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.virtualQueueContentProvider.get());
    }
}