package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCard;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.SelectQueueFragmentModule_ProvideSelectQueueCardAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21533x34518f36 implements InterfaceC30583e<SelectQueueCardAdapter.Factory> {
    private final SelectQueueFragmentModule module;
    private final Provider<QueueStateManagement> queueStateManagementProvider;
    private final Provider<SelectQueueCard> selectQueueCardImplProvider;

    public C21533x34518f36(SelectQueueFragmentModule selectQueueFragmentModule, Provider<SelectQueueCard> provider, Provider<QueueStateManagement> provider2) {
        this.module = selectQueueFragmentModule;
        this.selectQueueCardImplProvider = provider;
        this.queueStateManagementProvider = provider2;
    }

    public static C21533x34518f36 create(SelectQueueFragmentModule selectQueueFragmentModule, Provider<SelectQueueCard> provider, Provider<QueueStateManagement> provider2) {
        return new C21533x34518f36(selectQueueFragmentModule, provider, provider2);
    }

    public static SelectQueueCardAdapter.Factory provideSelectQueueCardAdapterFactory$virtual_queue_lib_release(SelectQueueFragmentModule selectQueueFragmentModule, SelectQueueCard selectQueueCard, QueueStateManagement queueStateManagement) {
        return (SelectQueueCardAdapter.Factory) C30587i.m94207e(selectQueueFragmentModule.provideSelectQueueCardAdapterFactory$virtual_queue_lib_release(selectQueueCard, queueStateManagement));
    }

    @Override // javax.inject.Provider
    public SelectQueueCardAdapter.Factory get() {
        return provideSelectQueueCardAdapterFactory$virtual_queue_lib_release(this.module, this.selectQueueCardImplProvider.get(), this.queueStateManagementProvider.get());
    }
}