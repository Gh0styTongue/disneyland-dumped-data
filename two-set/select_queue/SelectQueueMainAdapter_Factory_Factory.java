package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class SelectQueueMainAdapter_Factory_Factory implements InterfaceC30583e<SelectQueueMainAdapter.Factory> {
    private final Provider<VirtualQueueSecretTapAdapter.Factory> secretTapAdapterFactoryProvider;
    private final Provider<SelectQueueCardAdapter.Factory> selectQueueCardAdapterFactoryProvider;

    public SelectQueueMainAdapter_Factory_Factory(Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<SelectQueueCardAdapter.Factory> provider2) {
        this.secretTapAdapterFactoryProvider = provider;
        this.selectQueueCardAdapterFactoryProvider = provider2;
    }

    public static SelectQueueMainAdapter_Factory_Factory create(Provider<VirtualQueueSecretTapAdapter.Factory> provider, Provider<SelectQueueCardAdapter.Factory> provider2) {
        return new SelectQueueMainAdapter_Factory_Factory(provider, provider2);
    }

    public static SelectQueueMainAdapter.Factory newInstance(VirtualQueueSecretTapAdapter.Factory factory, SelectQueueCardAdapter.Factory factory2) {
        return new SelectQueueMainAdapter.Factory(factory, factory2);
    }

    @Override // javax.inject.Provider
    public SelectQueueMainAdapter.Factory get() {
        return newInstance(this.secretTapAdapterFactoryProvider.get(), this.selectQueueCardAdapterFactoryProvider.get());
    }
}