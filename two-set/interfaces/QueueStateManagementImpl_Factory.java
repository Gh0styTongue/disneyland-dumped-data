package com.disney.wdpro.virtualqueue.core.interfaces;

import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class QueueStateManagementImpl_Factory implements InterfaceC30583e<QueueStateManagementImpl> {

    private static final class InstanceHolder {
        private static final QueueStateManagementImpl_Factory INSTANCE = new QueueStateManagementImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static QueueStateManagementImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static QueueStateManagementImpl newInstance() {
        return new QueueStateManagementImpl();
    }

    @Override // javax.inject.Provider
    public QueueStateManagementImpl get() {
        return newInstance();
    }
}