package com.disney.wdpro.geofence;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import java.util.List;

/* loaded from: classes28.dex */
public interface GeofenceManager {

    public interface GeofenceStatusCallback {
        void onError();

        void onSuccess();
    }

    void cascadeEnterGeofence(String str, String str2, GeofenceStatusCallback geofenceStatusCallback);

    void cascadeExitGeofence(String str, String str2, GeofenceStatusCallback geofenceStatusCallback);

    GeofenceWrapper getGeofenceByInternalId(String str);

    void registerGeofences(String str, List<GeofenceWrapper> list, GeofenceStatusCallback geofenceStatusCallback);

    void removeGeofences(String str, List<GeofenceWrapper> list, GeofenceStatusCallback geofenceStatusCallback);

    void removeRunningGeofencesAndDeleteGroup(String str, GeofenceStatusCallback geofenceStatusCallback);

    void restoreSavedGeofences();
}