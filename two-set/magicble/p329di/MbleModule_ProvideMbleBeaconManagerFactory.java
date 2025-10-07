package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.magicble.beacon.MbleBeaconManager;
import com.disney.wdpro.magicble.beacon.MbleBeaconManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvideMbleBeaconManagerFactory implements InterfaceC30583e<MbleBeaconManager> {
    private final Provider<MbleBeaconManagerImpl> implProvider;
    private final MbleModule module;

    public MbleModule_ProvideMbleBeaconManagerFactory(MbleModule mbleModule, Provider<MbleBeaconManagerImpl> provider) {
        this.module = mbleModule;
        this.implProvider = provider;
    }

    public static MbleModule_ProvideMbleBeaconManagerFactory create(MbleModule mbleModule, Provider<MbleBeaconManagerImpl> provider) {
        return new MbleModule_ProvideMbleBeaconManagerFactory(mbleModule, provider);
    }

    public static MbleBeaconManager provideMbleBeaconManager(MbleModule mbleModule, MbleBeaconManagerImpl mbleBeaconManagerImpl) {
        return (MbleBeaconManager) C30587i.m94207e(mbleModule.provideMbleBeaconManager(mbleBeaconManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleBeaconManager get() {
        return provideMbleBeaconManager(this.module, this.implProvider.get());
    }
}