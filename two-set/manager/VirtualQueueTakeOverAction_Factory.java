package com.disney.wdpro.virtualqueue.core.manager;

import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueTakeOverAction_Factory implements InterfaceC30583e<VirtualQueueTakeOverAction> {

    private static final class InstanceHolder {
        private static final VirtualQueueTakeOverAction_Factory INSTANCE = new VirtualQueueTakeOverAction_Factory();

        private InstanceHolder() {
        }
    }

    public static VirtualQueueTakeOverAction_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VirtualQueueTakeOverAction newInstance() {
        return new VirtualQueueTakeOverAction();
    }

    @Override // javax.inject.Provider
    public VirtualQueueTakeOverAction get() {
        return newInstance();
    }
}