package com.disney.wdpro.geofence.service.event;

import android.content.Intent;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.util.List;

/* loaded from: classes28.dex */
public class GeofencingEventPlayServicesImpl implements GeofencingEventWrapper {
    private GeofencingEvent event;

    @Override // com.disney.wdpro.geofence.service.event.GeofencingEventWrapper
    public int getErrorCode() {
        return this.event.getErrorCode();
    }

    @Override // com.disney.wdpro.geofence.service.event.GeofencingEventWrapper
    public int getGeofenceTransition() {
        return this.event.getGeofenceTransition();
    }

    @Override // com.disney.wdpro.geofence.service.event.GeofencingEventWrapper
    public List<Geofence> getTriggeringGeofences() {
        return this.event.getTriggeringGeofences();
    }

    @Override // com.disney.wdpro.geofence.service.event.GeofencingEventWrapper
    public boolean hasError() {
        return this.event.hasError();
    }

    @Override // com.disney.wdpro.geofence.service.event.GeofencingEventWrapper
    public GeofencingEventWrapper init(Intent intent) {
        this.event = GeofencingEvent.fromIntent(intent);
        return this;
    }
}