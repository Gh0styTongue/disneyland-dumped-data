package com.disney.wdpro.geofence.storage.state;

import com.disney.wdpro.geofence.storage.Storage;
import com.disney.wdpro.geofence.util.analytics.GeofenceCrashHelper;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceStateManagerImpl_Factory implements InterfaceC30583e<GeofenceStateManagerImpl> {
    private final Provider<GeofenceCrashHelper> geofenceCrashHelperProvider;
    private final Provider<Storage> storageProvider;

    public GeofenceStateManagerImpl_Factory(Provider<Storage> provider, Provider<GeofenceCrashHelper> provider2) {
        this.storageProvider = provider;
        this.geofenceCrashHelperProvider = provider2;
    }

    public static GeofenceStateManagerImpl_Factory create(Provider<Storage> provider, Provider<GeofenceCrashHelper> provider2) {
        return new GeofenceStateManagerImpl_Factory(provider, provider2);
    }

    public static GeofenceStateManagerImpl newInstance(Storage storage, GeofenceCrashHelper geofenceCrashHelper) {
        return new GeofenceStateManagerImpl(storage, geofenceCrashHelper);
    }

    @Override // javax.inject.Provider
    public GeofenceStateManagerImpl get() {
        return newInstance(this.storageProvider.get(), this.geofenceCrashHelperProvider.get());
    }
}