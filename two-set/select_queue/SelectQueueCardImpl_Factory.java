package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class SelectQueueCardImpl_Factory implements InterfaceC30583e<SelectQueueCardImpl> {

    private static final class InstanceHolder {
        private static final SelectQueueCardImpl_Factory INSTANCE = new SelectQueueCardImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static SelectQueueCardImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SelectQueueCardImpl newInstance() {
        return new SelectQueueCardImpl();
    }

    @Override // javax.inject.Provider
    public SelectQueueCardImpl get() {
        return newInstance();
    }
}