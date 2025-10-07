package com.disney.wdpro.magicble.beacon;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.magicble.beacon.detector.MbleBeaconDetector;
import com.disney.wdpro.magicble.beacon.helper.MbleBeaconAdvertisingHelper;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleBeaconNotifierImpl_Factory implements InterfaceC30583e<MbleBeaconNotifierImpl> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<MbleBeaconAdvertisingHelper> beaconAdvertisingHelperProvider;
    private final Provider<MbleBeaconDetector> beaconDetectorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<C9350r> timeProvider;

    public MbleBeaconNotifierImpl_Factory(Provider<Context> provider, Provider<AuthenticationManager> provider2, Provider<MbleBeaconDetector> provider3, Provider<MbleBeaconAdvertisingHelper> provider4, Provider<C9350r> provider5) {
        this.contextProvider = provider;
        this.authenticationManagerProvider = provider2;
        this.beaconDetectorProvider = provider3;
        this.beaconAdvertisingHelperProvider = provider4;
        this.timeProvider = provider5;
    }

    public static MbleBeaconNotifierImpl_Factory create(Provider<Context> provider, Provider<AuthenticationManager> provider2, Provider<MbleBeaconDetector> provider3, Provider<MbleBeaconAdvertisingHelper> provider4, Provider<C9350r> provider5) {
        return new MbleBeaconNotifierImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MbleBeaconNotifierImpl newInstance(Context context, AuthenticationManager authenticationManager, MbleBeaconDetector mbleBeaconDetector, MbleBeaconAdvertisingHelper mbleBeaconAdvertisingHelper, C9350r c9350r) {
        return new MbleBeaconNotifierImpl(context, authenticationManager, mbleBeaconDetector, mbleBeaconAdvertisingHelper, c9350r);
    }

    @Override // javax.inject.Provider
    public MbleBeaconNotifierImpl get() {
        return newInstance(this.contextProvider.get(), this.authenticationManagerProvider.get(), this.beaconDetectorProvider.get(), this.beaconAdvertisingHelperProvider.get(), this.timeProvider.get());
    }
}