package com.disney.wdpro.geofence.service;

import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.geofence.service.event.GeofencingEventWrapper;
import dagger.MembersInjector;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes28.dex */
public final class GeofenceHandlerIntentService_MembersInjector implements MembersInjector<GeofenceHandlerIntentService> {
    private final Provider<Set<GeofenceHandler>> genericGeofenceHandlersProvider;
    private final Provider<Map<String, GeofenceHandler>> geofenceHandlersProvider;
    private final Provider<GeofenceManager> geofenceManagerProvider;
    private final Provider<GeofencingEventWrapper> geofencingEventProvider;

    public GeofenceHandlerIntentService_MembersInjector(Provider<Map<String, GeofenceHandler>> provider, Provider<Set<GeofenceHandler>> provider2, Provider<GeofenceManager> provider3, Provider<GeofencingEventWrapper> provider4) {
        this.geofenceHandlersProvider = provider;
        this.genericGeofenceHandlersProvider = provider2;
        this.geofenceManagerProvider = provider3;
        this.geofencingEventProvider = provider4;
    }

    public static MembersInjector<GeofenceHandlerIntentService> create(Provider<Map<String, GeofenceHandler>> provider, Provider<Set<GeofenceHandler>> provider2, Provider<GeofenceManager> provider3, Provider<GeofencingEventWrapper> provider4) {
        return new GeofenceHandlerIntentService_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectGenericGeofenceHandlers(GeofenceHandlerIntentService geofenceHandlerIntentService, Set<GeofenceHandler> set) {
        geofenceHandlerIntentService.genericGeofenceHandlers = set;
    }

    public static void injectGeofenceHandlers(GeofenceHandlerIntentService geofenceHandlerIntentService, Map<String, GeofenceHandler> map) {
        geofenceHandlerIntentService.geofenceHandlers = map;
    }

    public static void injectGeofenceManager(GeofenceHandlerIntentService geofenceHandlerIntentService, GeofenceManager geofenceManager) {
        geofenceHandlerIntentService.geofenceManager = geofenceManager;
    }

    public static void injectGeofencingEvent(GeofenceHandlerIntentService geofenceHandlerIntentService, GeofencingEventWrapper geofencingEventWrapper) {
        geofenceHandlerIntentService.geofencingEvent = geofencingEventWrapper;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GeofenceHandlerIntentService geofenceHandlerIntentService) {
        injectGeofenceHandlers(geofenceHandlerIntentService, this.geofenceHandlersProvider.get());
        injectGenericGeofenceHandlers(geofenceHandlerIntentService, this.genericGeofenceHandlersProvider.get());
        injectGeofenceManager(geofenceHandlerIntentService, this.geofenceManagerProvider.get());
        injectGeofencingEvent(geofenceHandlerIntentService, this.geofencingEventProvider.get());
    }
}