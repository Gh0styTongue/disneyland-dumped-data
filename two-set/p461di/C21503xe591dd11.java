package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.dash.couchbase.InterfaceC9400d;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueThemer$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21503xe591dd11 implements InterfaceC30583e<VirtualQueueThemer> {
    private final Provider<InterfaceC9400d> cbEnvironmentProvider;
    private final Provider<Context> contextProvider;
    private final VQCommonModules module;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<VirtualQueueRepository> virtualQueueRepositoryProvider;

    public C21503xe591dd11(VQCommonModules vQCommonModules, Provider<C9314j> provider, Provider<VirtualQueueRepository> provider2, Provider<InterfaceC9400d> provider3, Provider<Context> provider4) {
        this.module = vQCommonModules;
        this.parkAppConfigurationProvider = provider;
        this.virtualQueueRepositoryProvider = provider2;
        this.cbEnvironmentProvider = provider3;
        this.contextProvider = provider4;
    }

    public static C21503xe591dd11 create(VQCommonModules vQCommonModules, Provider<C9314j> provider, Provider<VirtualQueueRepository> provider2, Provider<InterfaceC9400d> provider3, Provider<Context> provider4) {
        return new C21503xe591dd11(vQCommonModules, provider, provider2, provider3, provider4);
    }

    public static VirtualQueueThemer provideVirtualQueueThemer$virtual_queue_lib_release(VQCommonModules vQCommonModules, C9314j c9314j, VirtualQueueRepository virtualQueueRepository, InterfaceC9400d interfaceC9400d, Context context) {
        return (VirtualQueueThemer) C30587i.m94207e(vQCommonModules.provideVirtualQueueThemer$virtual_queue_lib_release(c9314j, virtualQueueRepository, interfaceC9400d, context));
    }

    @Override // javax.inject.Provider
    public VirtualQueueThemer get() {
        return provideVirtualQueueThemer$virtual_queue_lib_release(this.module, this.parkAppConfigurationProvider.get(), this.virtualQueueRepositoryProvider.get(), this.cbEnvironmentProvider.get(), this.contextProvider.get());
    }
}