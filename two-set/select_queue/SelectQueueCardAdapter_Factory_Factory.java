package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class SelectQueueCardAdapter_Factory_Factory implements InterfaceC30583e<SelectQueueCardAdapter.Factory> {
    private final Provider<QueueStateManagement> queueStateManagementProvider;
    private final Provider<SelectQueueCard> selectQueueCardImplProvider;

    public SelectQueueCardAdapter_Factory_Factory(Provider<SelectQueueCard> provider, Provider<QueueStateManagement> provider2) {
        this.selectQueueCardImplProvider = provider;
        this.queueStateManagementProvider = provider2;
    }

    public static SelectQueueCardAdapter_Factory_Factory create(Provider<SelectQueueCard> provider, Provider<QueueStateManagement> provider2) {
        return new SelectQueueCardAdapter_Factory_Factory(provider, provider2);
    }

    public static SelectQueueCardAdapter.Factory newInstance(SelectQueueCard selectQueueCard, QueueStateManagement queueStateManagement) {
        return new SelectQueueCardAdapter.Factory(selectQueueCard, queueStateManagement);
    }

    @Override // javax.inject.Provider
    public SelectQueueCardAdapter.Factory get() {
        return newInstance(this.selectQueueCardImplProvider.get(), this.queueStateManagementProvider.get());
    }
}