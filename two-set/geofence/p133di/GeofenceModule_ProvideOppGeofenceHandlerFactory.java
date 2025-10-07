package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.handler.CascadeGeofenceHandler;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideOppGeofenceHandlerFactory implements InterfaceC30583e<GeofenceHandler> {
    private final Provider<CascadeGeofenceHandler> cascadeGeofenceHandlerProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideOppGeofenceHandlerFactory(GeofenceModule geofenceModule, Provider<CascadeGeofenceHandler> provider) {
        this.module = geofenceModule;
        this.cascadeGeofenceHandlerProvider = provider;
    }

    public static GeofenceModule_ProvideOppGeofenceHandlerFactory create(GeofenceModule geofenceModule, Provider<CascadeGeofenceHandler> provider) {
        return new GeofenceModule_ProvideOppGeofenceHandlerFactory(geofenceModule, provider);
    }

    public static GeofenceHandler provideOppGeofenceHandler(GeofenceModule geofenceModule, CascadeGeofenceHandler cascadeGeofenceHandler) {
        return (GeofenceHandler) C30587i.m94207e(geofenceModule.provideOppGeofenceHandler(cascadeGeofenceHandler));
    }

    @Override // javax.inject.Provider
    public GeofenceHandler get() {
        return provideOppGeofenceHandler(this.module, this.cascadeGeofenceHandlerProvider.get());
    }
}