package com.disney.wdpro.geofence.location;

import com.google.android.gms.location.Geofence;
import java.util.List;

/* loaded from: classes28.dex */
public interface LocationServiceWrapper {

    public interface LocationStatusCallback {
        void onError();

        void onSuccess();
    }

    void addGeofences(List<Geofence> list, LocationStatusCallback locationStatusCallback);

    void removeGeofences(List<String> list, LocationStatusCallback locationStatusCallback);
}