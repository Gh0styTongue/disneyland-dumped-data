package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.GeofenceManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGeofenceManagerFactory implements InterfaceC30583e<GeofenceManager> {
    private final Provider<GeofenceManagerImpl> geofenceManagerProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideGeofenceManagerFactory(GeofenceModule geofenceModule, Provider<GeofenceManagerImpl> provider) {
        this.module = geofenceModule;
        this.geofenceManagerProvider = provider;
    }

    public static GeofenceModule_ProvideGeofenceManagerFactory create(GeofenceModule geofenceModule, Provider<GeofenceManagerImpl> provider) {
        return new GeofenceModule_ProvideGeofenceManagerFactory(geofenceModule, provider);
    }

    public static GeofenceManager provideGeofenceManager(GeofenceModule geofenceModule, GeofenceManagerImpl geofenceManagerImpl) {
        return (GeofenceManager) C30587i.m94207e(geofenceModule.provideGeofenceManager(geofenceManagerImpl));
    }

    @Override // javax.inject.Provider
    public GeofenceManager get() {
        return provideGeofenceManager(this.module, this.geofenceManagerProvider.get());
    }
}