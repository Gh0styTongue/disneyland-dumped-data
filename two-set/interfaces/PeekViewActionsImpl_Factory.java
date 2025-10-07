package com.disney.wdpro.virtualqueue.core.interfaces;

import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PeekViewActionsImpl_Factory implements InterfaceC30583e<PeekViewActionsImpl> {

    private static final class InstanceHolder {
        private static final PeekViewActionsImpl_Factory INSTANCE = new PeekViewActionsImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static PeekViewActionsImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PeekViewActionsImpl newInstance() {
        return new PeekViewActionsImpl();
    }

    @Override // javax.inject.Provider
    public PeekViewActionsImpl get() {
        return newInstance();
    }
}