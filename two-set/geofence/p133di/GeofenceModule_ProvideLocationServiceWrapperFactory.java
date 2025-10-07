package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.location.LocationServiceWrapper;
import com.disney.wdpro.geofence.location.LocationServiceWrapperImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideLocationServiceWrapperFactory implements InterfaceC30583e<LocationServiceWrapper> {
    private final Provider<LocationServiceWrapperImpl> locationServiceProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideLocationServiceWrapperFactory(GeofenceModule geofenceModule, Provider<LocationServiceWrapperImpl> provider) {
        this.module = geofenceModule;
        this.locationServiceProvider = provider;
    }

    public static GeofenceModule_ProvideLocationServiceWrapperFactory create(GeofenceModule geofenceModule, Provider<LocationServiceWrapperImpl> provider) {
        return new GeofenceModule_ProvideLocationServiceWrapperFactory(geofenceModule, provider);
    }

    public static LocationServiceWrapper provideLocationServiceWrapper(GeofenceModule geofenceModule, LocationServiceWrapperImpl locationServiceWrapperImpl) {
        return (LocationServiceWrapper) C30587i.m94207e(geofenceModule.provideLocationServiceWrapper(locationServiceWrapperImpl));
    }

    @Override // javax.inject.Provider
    public LocationServiceWrapper get() {
        return provideLocationServiceWrapper(this.module, this.locationServiceProvider.get());
    }
}