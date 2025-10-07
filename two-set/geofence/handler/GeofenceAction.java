package com.disney.wdpro.geofence.handler;

import com.disney.wdpro.geofence.model.GeofenceWrapper;

/* loaded from: classes28.dex */
public class GeofenceAction {
    private final GeofenceWrapper geofence;
    private final int transition;

    public GeofenceAction(int i10, GeofenceWrapper geofenceWrapper) {
        this.transition = i10;
        this.geofence = geofenceWrapper;
    }

    public GeofenceWrapper getGeofence() {
        return this.geofence;
    }

    public int getTransition() {
        return this.transition;
    }
}