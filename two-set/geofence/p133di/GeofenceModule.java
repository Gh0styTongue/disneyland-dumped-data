package com.disney.wdpro.geofence.p133di;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.commons.utils.C9374k;
import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.GeofenceManagerImpl;
import com.disney.wdpro.geofence.GeofenceMapper;
import com.disney.wdpro.geofence.GeofenceMapperImpl;
import com.disney.wdpro.geofence.handler.CascadeGeofenceHandler;
import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.geofence.location.LocationServiceWrapper;
import com.disney.wdpro.geofence.location.LocationServiceWrapperImpl;
import com.disney.wdpro.geofence.service.GeofenceHandlerBroadcastReceiver;
import com.disney.wdpro.geofence.service.event.GeofencingEventPlayServicesImpl;
import com.disney.wdpro.geofence.service.event.GeofencingEventWrapper;
import com.disney.wdpro.geofence.storage.LocalStorageSharedPreference;
import com.disney.wdpro.geofence.storage.Storage;
import com.disney.wdpro.geofence.storage.state.GeofenceStateManager;
import com.disney.wdpro.geofence.storage.state.GeofenceStateManagerImpl;
import com.disney.wdpro.geofence.util.GeofenceUtils;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.LocationServices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import java.util.Collections;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
/* loaded from: classes28.dex */
public class GeofenceModule {
    public static final String GEOFENCING_CLIENT_INJECT_NAME = "geofencing_client";
    public static final String GSON_SHARED_PREF_INJECT_NAME = "gson_shared_pref_inject_name";
    public static final String LOCATION_API_GEOFENCE_INTENT_INJECT_NAME = "location_api_geofence_intent";

    @Provides
    Set<GeofenceHandler> provideGenericGeofenceHandlerSet() {
        return Collections.EMPTY_SET;
    }

    @Provides
    @Singleton
    public GeofenceManager provideGeofenceManager(GeofenceManagerImpl geofenceManagerImpl) {
        return geofenceManagerImpl;
    }

    @Provides
    @Singleton
    GeofenceMapper provideGeofenceMapper(GeofenceMapperImpl geofenceMapperImpl) {
        return geofenceMapperImpl;
    }

    @Provides
    @Singleton
    @Named(LOCATION_API_GEOFENCE_INTENT_INJECT_NAME)
    public PendingIntent provideGeofencePendingIntent(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) GeofenceHandlerBroadcastReceiver.class), C9374k.INSTANCE.m39188a());
    }

    @Provides
    @Named(GEOFENCING_CLIENT_INJECT_NAME)
    public GeofencingClient provideGeofencingClient(Context context) {
        return LocationServices.getGeofencingClient(context);
    }

    @Provides
    public GeofencingEventWrapper provideGeofencingEventWrapper() {
        return new GeofencingEventPlayServicesImpl();
    }

    @Provides
    @Singleton
    @Named(GSON_SHARED_PREF_INJECT_NAME)
    Gson provideGsonLocalStorage() {
        return new GsonBuilder().setDateFormat(0, 0).create();
    }

    @Provides
    @Singleton
    @Named(GeofenceUtils.GEOFENCE_STORAGE_ID)
    public Storage provideLocalStorage(Context context, @Named(GSON_SHARED_PREF_INJECT_NAME) Gson gson) {
        return new LocalStorageSharedPreference(context, gson, "com.disney.wdpro.geofence.storage");
    }

    @Provides
    public LocationServiceWrapper provideLocationServiceWrapper(LocationServiceWrapperImpl locationServiceWrapperImpl) {
        return locationServiceWrapperImpl;
    }

    @Provides
    @Singleton
    public GeofenceHandler provideOppGeofenceHandler(CascadeGeofenceHandler cascadeGeofenceHandler) {
        return cascadeGeofenceHandler;
    }

    @Provides
    @Singleton
    GeofenceStateManager provideStorageGeofences(GeofenceStateManagerImpl geofenceStateManagerImpl) {
        return geofenceStateManagerImpl;
    }
}