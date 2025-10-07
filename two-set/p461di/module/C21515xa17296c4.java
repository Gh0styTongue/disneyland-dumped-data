package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.DetailFragmentModule_ProvidesQueuesPositionsAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21515xa17296c4 implements InterfaceC30583e<QueuesPositionsAdapter.Factory> {
    private final DetailFragmentModule module;
    private final Provider<PositionAdapter.Factory> positionAdapterFactoryProvider;
    private final Provider<VirtualQueueSecretTapAdapter.Factory> secretTapFactoryProvider;

    public C21515xa17296c4(DetailFragmentModule detailFragmentModule, Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<PositionAdapter.Factory> provider2) {
        this.module = detailFragmentModule;
        this.secretTapFactoryProvider = provider;
        this.positionAdapterFactoryProvider = provider2;
    }

    public static C21515xa17296c4 create(DetailFragmentModule detailFragmentModule, Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<PositionAdapter.Factory> provider2) {
        return new C21515xa17296c4(detailFragmentModule, provider, provider2);
    }

    public static QueuesPositionsAdapter.Factory providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(DetailFragmentModule detailFragmentModule, VirtualQueueSecretTapAdapter.Factory factory, PositionAdapter.Factory factory2) {
        return (QueuesPositionsAdapter.Factory) C30587i.m94207e(detailFragmentModule.providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(factory, factory2));
    }

    @Override // javax.inject.Provider
    public QueuesPositionsAdapter.Factory get() {
        return providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(this.module, this.secretTapFactoryProvider.get(), this.positionAdapterFactoryProvider.get());
    }
}