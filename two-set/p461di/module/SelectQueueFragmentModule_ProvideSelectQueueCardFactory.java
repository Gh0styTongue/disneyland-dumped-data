package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCard;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class SelectQueueFragmentModule_ProvideSelectQueueCardFactory implements InterfaceC30583e<SelectQueueCard> {
    private final SelectQueueFragmentModule module;

    public SelectQueueFragmentModule_ProvideSelectQueueCardFactory(SelectQueueFragmentModule selectQueueFragmentModule) {
        this.module = selectQueueFragmentModule;
    }

    public static SelectQueueFragmentModule_ProvideSelectQueueCardFactory create(SelectQueueFragmentModule selectQueueFragmentModule) {
        return new SelectQueueFragmentModule_ProvideSelectQueueCardFactory(selectQueueFragmentModule);
    }

    public static SelectQueueCard provideSelectQueueCard(SelectQueueFragmentModule selectQueueFragmentModule) {
        return (SelectQueueCard) C30587i.m94207e(selectQueueFragmentModule.provideSelectQueueCard());
    }

    @Override // javax.inject.Provider
    public SelectQueueCard get() {
        return provideSelectQueueCard(this.module);
    }
}