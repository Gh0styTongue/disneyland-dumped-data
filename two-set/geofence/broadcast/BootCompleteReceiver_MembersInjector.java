package com.disney.wdpro.geofence.broadcast;

import com.disney.wdpro.geofence.GeofenceManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class BootCompleteReceiver_MembersInjector implements MembersInjector<BootCompleteReceiver> {
    private final Provider<GeofenceManager> geofenceManagerProvider;

    public BootCompleteReceiver_MembersInjector(Provider<GeofenceManager> provider) {
        this.geofenceManagerProvider = provider;
    }

    public static MembersInjector<BootCompleteReceiver> create(Provider<GeofenceManager> provider) {
        return new BootCompleteReceiver_MembersInjector(provider);
    }

    public static void injectGeofenceManager(BootCompleteReceiver bootCompleteReceiver, GeofenceManager geofenceManager) {
        bootCompleteReceiver.geofenceManager = geofenceManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BootCompleteReceiver bootCompleteReceiver) {
        injectGeofenceManager(bootCompleteReceiver, this.geofenceManagerProvider.get());
    }
}