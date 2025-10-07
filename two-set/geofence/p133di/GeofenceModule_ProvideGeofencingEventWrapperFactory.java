package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.service.event.GeofencingEventWrapper;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGeofencingEventWrapperFactory implements InterfaceC30583e<GeofencingEventWrapper> {
    private final GeofenceModule module;

    public GeofenceModule_ProvideGeofencingEventWrapperFactory(GeofenceModule geofenceModule) {
        this.module = geofenceModule;
    }

    public static GeofenceModule_ProvideGeofencingEventWrapperFactory create(GeofenceModule geofenceModule) {
        return new GeofenceModule_ProvideGeofencingEventWrapperFactory(geofenceModule);
    }

    public static GeofencingEventWrapper provideGeofencingEventWrapper(GeofenceModule geofenceModule) {
        return (GeofencingEventWrapper) C30587i.m94207e(geofenceModule.provideGeofencingEventWrapper());
    }

    @Override // javax.inject.Provider
    public GeofencingEventWrapper get() {
        return provideGeofencingEventWrapper(this.module);
    }
}