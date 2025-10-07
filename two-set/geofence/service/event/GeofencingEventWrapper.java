package com.disney.wdpro.geofence.service.event;

import android.content.Intent;
import com.google.android.gms.location.Geofence;
import java.util.List;

/* loaded from: classes28.dex */
public interface GeofencingEventWrapper {
    int getErrorCode();

    int getGeofenceTransition();

    List<Geofence> getTriggeringGeofences();

    boolean hasError();

    GeofencingEventWrapper init(Intent intent);
}