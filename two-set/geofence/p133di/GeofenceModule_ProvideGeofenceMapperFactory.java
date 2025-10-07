package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.GeofenceMapper;
import com.disney.wdpro.geofence.GeofenceMapperImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGeofenceMapperFactory implements InterfaceC30583e<GeofenceMapper> {
    private final Provider<GeofenceMapperImpl> implProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideGeofenceMapperFactory(GeofenceModule geofenceModule, Provider<GeofenceMapperImpl> provider) {
        this.module = geofenceModule;
        this.implProvider = provider;
    }

    public static GeofenceModule_ProvideGeofenceMapperFactory create(GeofenceModule geofenceModule, Provider<GeofenceMapperImpl> provider) {
        return new GeofenceModule_ProvideGeofenceMapperFactory(geofenceModule, provider);
    }

    public static GeofenceMapper provideGeofenceMapper(GeofenceModule geofenceModule, GeofenceMapperImpl geofenceMapperImpl) {
        return (GeofenceMapper) C30587i.m94207e(geofenceModule.provideGeofenceMapper(geofenceMapperImpl));
    }

    @Override // javax.inject.Provider
    public GeofenceMapper get() {
        return provideGeofenceMapper(this.module, this.implProvider.get());
    }
}