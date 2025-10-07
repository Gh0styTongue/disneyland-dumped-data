package com.disney.wdpro.magicble.beacon.detector;

import android.content.Context;
import com.disney.wdpro.magicble.beacon.helper.MbleBeaconAdvertisingHelper;
import com.disney.wdpro.magicble.beacon.identifier.MbleCastBeaconIdentifier;
import com.disney.wdpro.magicble.beacon.identifier.MbleDetectedBeaconIdentifier;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleBeaconDetector_Factory implements InterfaceC30583e<MbleBeaconDetector> {
    private final Provider<MbleBeaconAdvertisingHelper> beaconAdvertisingHelperProvider;
    private final Provider<MbleCastBeaconIdentifier> castBeaconIdentifierProvider;
    private final Provider<Context> contextProvider;
    private final Provider<MbleDetectedBeaconIdentifier> detectedBeaconIdentifierProvider;

    public MbleBeaconDetector_Factory(Provider<Context> provider, Provider<MbleBeaconAdvertisingHelper> provider2, Provider<MbleDetectedBeaconIdentifier> provider3, Provider<MbleCastBeaconIdentifier> provider4) {
        this.contextProvider = provider;
        this.beaconAdvertisingHelperProvider = provider2;
        this.detectedBeaconIdentifierProvider = provider3;
        this.castBeaconIdentifierProvider = provider4;
    }

    public static MbleBeaconDetector_Factory create(Provider<Context> provider, Provider<MbleBeaconAdvertisingHelper> provider2, Provider<MbleDetectedBeaconIdentifier> provider3, Provider<MbleCastBeaconIdentifier> provider4) {
        return new MbleBeaconDetector_Factory(provider, provider2, provider3, provider4);
    }

    public static MbleBeaconDetector newInstance(Context context, MbleBeaconAdvertisingHelper mbleBeaconAdvertisingHelper, MbleDetectedBeaconIdentifier mbleDetectedBeaconIdentifier, MbleCastBeaconIdentifier mbleCastBeaconIdentifier) {
        return new MbleBeaconDetector(context, mbleBeaconAdvertisingHelper, mbleDetectedBeaconIdentifier, mbleCastBeaconIdentifier);
    }

    @Override // javax.inject.Provider
    public MbleBeaconDetector get() {
        return newInstance(this.contextProvider.get(), this.beaconAdvertisingHelperProvider.get(), this.detectedBeaconIdentifierProvider.get(), this.castBeaconIdentifierProvider.get());
    }
}