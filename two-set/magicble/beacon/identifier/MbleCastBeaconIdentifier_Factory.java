package com.disney.wdpro.magicble.beacon.identifier;

import com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleCastBeaconIdentifier_Factory implements InterfaceC30583e<MbleCastBeaconIdentifier> {
    private final Provider<MbleVendoConfigProvider> vendoConfigProvider;

    public MbleCastBeaconIdentifier_Factory(Provider<MbleVendoConfigProvider> provider) {
        this.vendoConfigProvider = provider;
    }

    public static MbleCastBeaconIdentifier_Factory create(Provider<MbleVendoConfigProvider> provider) {
        return new MbleCastBeaconIdentifier_Factory(provider);
    }

    public static MbleCastBeaconIdentifier newInstance(MbleVendoConfigProvider mbleVendoConfigProvider) {
        return new MbleCastBeaconIdentifier(mbleVendoConfigProvider);
    }

    @Override // javax.inject.Provider
    public MbleCastBeaconIdentifier get() {
        return newInstance(this.vendoConfigProvider.get());
    }
}