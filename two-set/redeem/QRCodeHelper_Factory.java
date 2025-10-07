package com.disney.wdpro.virtualqueue.p462ui.redeem;

import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class QRCodeHelper_Factory implements InterfaceC30583e<QRCodeHelper> {

    private static final class InstanceHolder {
        private static final QRCodeHelper_Factory INSTANCE = new QRCodeHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static QRCodeHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static QRCodeHelper newInstance() {
        return new QRCodeHelper();
    }

    @Override // javax.inject.Provider
    public QRCodeHelper get() {
        return newInstance();
    }
}