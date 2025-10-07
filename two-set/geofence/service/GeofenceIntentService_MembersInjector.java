package com.disney.wdpro.geofence.service;

import com.disney.wdpro.geofence.GeofenceManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class GeofenceIntentService_MembersInjector implements MembersInjector<GeofenceIntentService> {
    private final Provider<GeofenceManager> geofenceManagerProvider;

    public GeofenceIntentService_MembersInjector(Provider<GeofenceManager> provider) {
        this.geofenceManagerProvider = provider;
    }

    public static MembersInjector<GeofenceIntentService> create(Provider<GeofenceManager> provider) {
        return new GeofenceIntentService_MembersInjector(provider);
    }

    public static void injectGeofenceManager(GeofenceIntentService geofenceIntentService, GeofenceManager geofenceManager) {
        geofenceIntentService.geofenceManager = geofenceManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeofenceIntentService geofenceIntentService) {
        injectGeofenceManager(geofenceIntentService, this.geofenceManagerProvider.get());
    }
}