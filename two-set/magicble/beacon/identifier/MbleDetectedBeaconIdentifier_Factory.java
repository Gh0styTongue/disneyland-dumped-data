package com.disney.wdpro.magicble.beacon.identifier;

import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleDetectedBeaconIdentifier_Factory implements InterfaceC30583e<MbleDetectedBeaconIdentifier> {

    private static final class InstanceHolder {
        private static final MbleDetectedBeaconIdentifier_Factory INSTANCE = new MbleDetectedBeaconIdentifier_Factory();

        private InstanceHolder() {
        }
    }

    public static MbleDetectedBeaconIdentifier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MbleDetectedBeaconIdentifier newInstance() {
        return new MbleDetectedBeaconIdentifier();
    }

    @Override // javax.inject.Provider
    public MbleDetectedBeaconIdentifier get() {
        return newInstance();
    }
}