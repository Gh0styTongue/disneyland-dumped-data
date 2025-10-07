package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.handler.GeofenceHandler;
import java.util.Set;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGenericGeofenceHandlerSetFactory implements InterfaceC30583e<Set<GeofenceHandler>> {
    private final GeofenceModule module;

    public GeofenceModule_ProvideGenericGeofenceHandlerSetFactory(GeofenceModule geofenceModule) {
        this.module = geofenceModule;
    }

    public static GeofenceModule_ProvideGenericGeofenceHandlerSetFactory create(GeofenceModule geofenceModule) {
        return new GeofenceModule_ProvideGenericGeofenceHandlerSetFactory(geofenceModule);
    }

    public static Set<GeofenceHandler> provideGenericGeofenceHandlerSet(GeofenceModule geofenceModule) {
        return (Set) C30587i.m94207e(geofenceModule.provideGenericGeofenceHandlerSet());
    }

    @Override // javax.inject.Provider
    public Set<GeofenceHandler> get() {
        return provideGenericGeofenceHandlerSet(this.module);
    }
}