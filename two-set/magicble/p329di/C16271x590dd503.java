package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor;
import com.disney.wdpro.magicble.beacon.MbleBeaconNotifierImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.magicble.di.MbleModule_ProvideMbleBeaconNotifier$magic_ble_lib_releaseFactory */
/* loaded from: classes13.dex */
public final class C16271x590dd503 implements InterfaceC30583e<MaBeaconMonitor.BeaconMonitorNotifier> {
    private final Provider<MbleBeaconNotifierImpl> implProvider;
    private final MbleModule module;

    public C16271x590dd503(MbleModule mbleModule, Provider<MbleBeaconNotifierImpl> provider) {
        this.module = mbleModule;
        this.implProvider = provider;
    }

    public static C16271x590dd503 create(MbleModule mbleModule, Provider<MbleBeaconNotifierImpl> provider) {
        return new C16271x590dd503(mbleModule, provider);
    }

    public static MaBeaconMonitor.BeaconMonitorNotifier provideMbleBeaconNotifier$magic_ble_lib_release(MbleModule mbleModule, MbleBeaconNotifierImpl mbleBeaconNotifierImpl) {
        return (MaBeaconMonitor.BeaconMonitorNotifier) C30587i.m94207e(mbleModule.provideMbleBeaconNotifier$magic_ble_lib_release(mbleBeaconNotifierImpl));
    }

    @Override // javax.inject.Provider
    public MaBeaconMonitor.BeaconMonitorNotifier get() {
        return provideMbleBeaconNotifier$magic_ble_lib_release(this.module, this.implProvider.get());
    }
}