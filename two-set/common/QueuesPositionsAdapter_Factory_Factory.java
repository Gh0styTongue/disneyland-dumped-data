package com.disney.wdpro.virtualqueue.p462ui.common;

import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class QueuesPositionsAdapter_Factory_Factory implements InterfaceC30583e<QueuesPositionsAdapter.Factory> {
    private final Provider<PositionAdapter.Factory> positionAdapterFactoryProvider;
    private final Provider<VirtualQueueSecretTapAdapter.Factory> secretTapAdapterFactoryProvider;

    public QueuesPositionsAdapter_Factory_Factory(Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<PositionAdapter.Factory> provider2) {
        this.secretTapAdapterFactoryProvider = provider;
        this.positionAdapterFactoryProvider = provider2;
    }

    public static QueuesPositionsAdapter_Factory_Factory create(Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<PositionAdapter.Factory> provider2) {
        return new QueuesPositionsAdapter_Factory_Factory(provider, provider2);
    }

    public static QueuesPositionsAdapter.Factory newInstance(VirtualQueueSecretTapAdapter.Factory factory, PositionAdapter.Factory factory2) {
        return new QueuesPositionsAdapter.Factory(factory, factory2);
    }

    @Override // javax.inject.Provider
    public QueuesPositionsAdapter.Factory get() {
        return newInstance(this.secretTapAdapterFactoryProvider.get(), this.positionAdapterFactoryProvider.get());
    }
}