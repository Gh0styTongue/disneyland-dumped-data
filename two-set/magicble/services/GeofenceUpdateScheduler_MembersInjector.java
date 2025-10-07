package com.disney.wdpro.magicble.services;

import android.content.Context;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManager;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes13.dex */
public final class GeofenceUpdateScheduler_MembersInjector implements MembersInjector<GeofenceUpdateScheduler> {
    private final Provider<Context> contextProvider;
    private final Provider<InterfaceC9336k> locationMonitorProvider;
    private final Provider<MbleGeofenceManager> mbleGeofenceManagerProvider;
    private final Provider<MbleSecretConfig> mbleSecretConfigProvider;
    private final Provider<C9248i> vendomaticProvider;

    public GeofenceUpdateScheduler_MembersInjector(Provider<InterfaceC9336k> provider, Provider<MbleGeofenceManager> provider2, Provider<C9248i> provider3, Provider<MbleSecretConfig> provider4, Provider<Context> provider5) {
        this.locationMonitorProvider = provider;
        this.mbleGeofenceManagerProvider = provider2;
        this.vendomaticProvider = provider3;
        this.mbleSecretConfigProvider = provider4;
        this.contextProvider = provider5;
    }

    public static MembersInjector<GeofenceUpdateScheduler> create(Provider<InterfaceC9336k> provider, Provider<MbleGeofenceManager> provider2, Provider<C9248i> provider3, Provider<MbleSecretConfig> provider4, Provider<Context> provider5) {
        return new GeofenceUpdateScheduler_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectContext(GeofenceUpdateScheduler geofenceUpdateScheduler, Context context) {
        geofenceUpdateScheduler.context = context;
    }

    public static void injectLocationMonitor(GeofenceUpdateScheduler geofenceUpdateScheduler, InterfaceC9336k interfaceC9336k) {
        geofenceUpdateScheduler.locationMonitor = interfaceC9336k;
    }

    public static void injectMbleGeofenceManager(GeofenceUpdateScheduler geofenceUpdateScheduler, MbleGeofenceManager mbleGeofenceManager) {
        geofenceUpdateScheduler.mbleGeofenceManager = mbleGeofenceManager;
    }

    public static void injectMbleSecretConfig(GeofenceUpdateScheduler geofenceUpdateScheduler, MbleSecretConfig mbleSecretConfig) {
        geofenceUpdateScheduler.mbleSecretConfig = mbleSecretConfig;
    }

    public static void injectVendomatic(GeofenceUpdateScheduler geofenceUpdateScheduler, C9248i c9248i) {
        geofenceUpdateScheduler.vendomatic = c9248i;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeofenceUpdateScheduler geofenceUpdateScheduler) {
        injectLocationMonitor(geofenceUpdateScheduler, this.locationMonitorProvider.get());
        injectMbleGeofenceManager(geofenceUpdateScheduler, this.mbleGeofenceManagerProvider.get());
        injectVendomatic(geofenceUpdateScheduler, this.vendomaticProvider.get());
        injectMbleSecretConfig(geofenceUpdateScheduler, this.mbleSecretConfigProvider.get());
        injectContext(geofenceUpdateScheduler, this.contextProvider.get());
    }
}