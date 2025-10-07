package com.disney.wdpro.geofence;

import com.disney.wdpro.geofence.location.LocationServiceWrapper;
import com.disney.wdpro.geofence.storage.state.GeofenceStateManager;
import com.disney.wdpro.geofence.util.analytics.GeofenceCrashHelper;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceManagerImpl_Factory implements InterfaceC30583e<GeofenceManagerImpl> {
    private final Provider<GeofenceCrashHelper> geofenceCrashHelperProvider;
    private final Provider<GeofenceMapper> geofenceMapperProvider;
    private final Provider<GeofenceStateManager> geofenceStateManagerProvider;
    private final Provider<LocationServiceWrapper> locationServiceProvider;

    public GeofenceManagerImpl_Factory(Provider<LocationServiceWrapper> provider, Provider<GeofenceStateManager> provider2, Provider<GeofenceMapper> provider3, Provider<GeofenceCrashHelper> provider4) {
        this.locationServiceProvider = provider;
        this.geofenceStateManagerProvider = provider2;
        this.geofenceMapperProvider = provider3;
        this.geofenceCrashHelperProvider = provider4;
    }

    public static GeofenceManagerImpl_Factory create(Provider<LocationServiceWrapper> provider, Provider<GeofenceStateManager> provider2, Provider<GeofenceMapper> provider3, Provider<GeofenceCrashHelper> provider4) {
        return new GeofenceManagerImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static GeofenceManagerImpl newInstance(LocationServiceWrapper locationServiceWrapper, GeofenceStateManager geofenceStateManager, GeofenceMapper geofenceMapper, GeofenceCrashHelper geofenceCrashHelper) {
        return new GeofenceManagerImpl(locationServiceWrapper, geofenceStateManager, geofenceMapper, geofenceCrashHelper);
    }

    @Override // javax.inject.Provider
    public GeofenceManagerImpl get() {
        return newInstance(this.locationServiceProvider.get(), this.geofenceStateManagerProvider.get(), this.geofenceMapperProvider.get(), this.geofenceCrashHelperProvider.get());
    }
}