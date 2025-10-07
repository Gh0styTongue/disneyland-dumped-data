package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.VirtualQueueConfirmationFragmentModule_ProvidesQueuesPositionsAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21541x58d6c93a implements InterfaceC30583e<QueuesPositionsAdapter.Factory> {
    private final VirtualQueueConfirmationFragmentModule module;
    private final Provider<PositionAdapter.Factory> positionAdapterFactoryProvider;
    private final Provider<VirtualQueueSecretTapAdapter.Factory> secretTapFactoryProvider;

    public C21541x58d6c93a(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<PositionAdapter.Factory> provider2) {
        this.module = virtualQueueConfirmationFragmentModule;
        this.secretTapFactoryProvider = provider;
        this.positionAdapterFactoryProvider = provider2;
    }

    public static C21541x58d6c93a create(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<PositionAdapter.Factory> provider2) {
        return new C21541x58d6c93a(virtualQueueConfirmationFragmentModule, provider, provider2);
    }

    public static QueuesPositionsAdapter.Factory providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, VirtualQueueSecretTapAdapter.Factory factory, PositionAdapter.Factory factory2) {
        return (QueuesPositionsAdapter.Factory) C30587i.m94207e(virtualQueueConfirmationFragmentModule.providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(factory, factory2));
    }

    @Override // javax.inject.Provider
    public QueuesPositionsAdapter.Factory get() {
        return providesQueuesPositionsAdapterFactory$virtual_queue_lib_release(this.module, this.secretTapFactoryProvider.get(), this.positionAdapterFactoryProvider.get());
    }
}