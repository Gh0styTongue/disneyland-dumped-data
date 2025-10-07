package com.disney.wdpro.magicble.beacon;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconMonitor;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleBeaconManagerImpl_Factory implements InterfaceC30583e<MbleBeaconManagerImpl> {
    private final Provider<MaBeaconMonitor> beaconMonitorProvider;
    private final Provider<MaBeaconMonitor.BeaconMonitorNotifier> beaconNotifierProvider;

    public MbleBeaconManagerImpl_Factory(Provider<MaBeaconMonitor> provider, Provider<MaBeaconMonitor.BeaconMonitorNotifier> provider2) {
        this.beaconMonitorProvider = provider;
        this.beaconNotifierProvider = provider2;
    }

    public static MbleBeaconManagerImpl_Factory create(Provider<MaBeaconMonitor> provider, Provider<MaBeaconMonitor.BeaconMonitorNotifier> provider2) {
        return new MbleBeaconManagerImpl_Factory(provider, provider2);
    }

    public static MbleBeaconManagerImpl newInstance(MaBeaconMonitor maBeaconMonitor, MaBeaconMonitor.BeaconMonitorNotifier beaconMonitorNotifier) {
        return new MbleBeaconManagerImpl(maBeaconMonitor, beaconMonitorNotifier);
    }

    @Override // javax.inject.Provider
    public MbleBeaconManagerImpl get() {
        return newInstance(this.beaconMonitorProvider.get(), this.beaconNotifierProvider.get());
    }
}