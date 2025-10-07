package com.disney.wdpro.virtualqueue.core.p461di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider;
import com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProviderImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueDashboardProvider$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21496x930a8d67 implements InterfaceC30583e<VirtualQueueDashboardProvider> {
    private final VQCommonModules module;
    private final Provider<ProxyFactory> proxyFactoryProvider;
    private final Provider<VirtualQueueDashboardProviderImpl> virtualQueueDashboardProvider;

    public C21496x930a8d67(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueDashboardProviderImpl> provider2) {
        this.module = vQCommonModules;
        this.proxyFactoryProvider = provider;
        this.virtualQueueDashboardProvider = provider2;
    }

    public static C21496x930a8d67 create(VQCommonModules vQCommonModules, Provider<ProxyFactory> provider, Provider<VirtualQueueDashboardProviderImpl> provider2) {
        return new C21496x930a8d67(vQCommonModules, provider, provider2);
    }

    public static VirtualQueueDashboardProvider provideVirtualQueueDashboardProvider$virtual_queue_lib_release(VQCommonModules vQCommonModules, ProxyFactory proxyFactory, VirtualQueueDashboardProviderImpl virtualQueueDashboardProviderImpl) {
        return (VirtualQueueDashboardProvider) C30587i.m94207e(vQCommonModules.provideVirtualQueueDashboardProvider$virtual_queue_lib_release(proxyFactory, virtualQueueDashboardProviderImpl));
    }

    @Override // javax.inject.Provider
    public VirtualQueueDashboardProvider get() {
        return provideVirtualQueueDashboardProvider$virtual_queue_lib_release(this.module, this.proxyFactoryProvider.get(), this.virtualQueueDashboardProvider.get());
    }
}