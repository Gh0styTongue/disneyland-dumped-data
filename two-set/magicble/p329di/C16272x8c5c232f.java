package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.magicble.geofence.MbleGeofenceManager;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.magicble.di.MbleModule_ProvidesMbleGeofenceManager$magic_ble_lib_releaseFactory */
/* loaded from: classes13.dex */
public final class C16272x8c5c232f implements InterfaceC30583e<MbleGeofenceManager> {
    private final Provider<MbleGeofenceManagerImpl> implProvider;
    private final MbleModule module;

    public C16272x8c5c232f(MbleModule mbleModule, Provider<MbleGeofenceManagerImpl> provider) {
        this.module = mbleModule;
        this.implProvider = provider;
    }

    public static C16272x8c5c232f create(MbleModule mbleModule, Provider<MbleGeofenceManagerImpl> provider) {
        return new C16272x8c5c232f(mbleModule, provider);
    }

    public static MbleGeofenceManager providesMbleGeofenceManager$magic_ble_lib_release(MbleModule mbleModule, MbleGeofenceManagerImpl mbleGeofenceManagerImpl) {
        return (MbleGeofenceManager) C30587i.m94207e(mbleModule.providesMbleGeofenceManager$magic_ble_lib_release(mbleGeofenceManagerImpl));
    }

    @Override // javax.inject.Provider
    public MbleGeofenceManager get() {
        return providesMbleGeofenceManager$magic_ble_lib_release(this.module, this.implProvider.get());
    }
}