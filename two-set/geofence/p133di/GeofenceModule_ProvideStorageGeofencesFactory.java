package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.storage.state.GeofenceStateManager;
import com.disney.wdpro.geofence.storage.state.GeofenceStateManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideStorageGeofencesFactory implements InterfaceC30583e<GeofenceStateManager> {
    private final Provider<GeofenceStateManagerImpl> implProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideStorageGeofencesFactory(GeofenceModule geofenceModule, Provider<GeofenceStateManagerImpl> provider) {
        this.module = geofenceModule;
        this.implProvider = provider;
    }

    public static GeofenceModule_ProvideStorageGeofencesFactory create(GeofenceModule geofenceModule, Provider<GeofenceStateManagerImpl> provider) {
        return new GeofenceModule_ProvideStorageGeofencesFactory(geofenceModule, provider);
    }

    public static GeofenceStateManager provideStorageGeofences(GeofenceModule geofenceModule, GeofenceStateManagerImpl geofenceStateManagerImpl) {
        return (GeofenceStateManager) C30587i.m94207e(geofenceModule.provideStorageGeofences(geofenceStateManagerImpl));
    }

    @Override // javax.inject.Provider
    public GeofenceStateManager get() {
        return provideStorageGeofences(this.module, this.implProvider.get());
    }
}