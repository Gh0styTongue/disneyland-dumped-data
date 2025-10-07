package com.disney.wdpro.geofence.handler;

import android.content.Context;
import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.geofence.service.GeofenceIntentService;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes28.dex */
public class CascadeGeofenceHandler implements GeofenceHandler {
    private final Context context;

    @Inject
    public CascadeGeofenceHandler(Context context) {
        this.context = context;
    }

    @Override // com.disney.wdpro.geofence.handler.GeofenceHandler
    public void onHandleGeofence(GeofenceAction geofenceAction) {
        GeofenceWrapper geofence = geofenceAction.getGeofence();
        if (geofenceAction.getTransition() == 1) {
            GeofenceIntentService.enqueueOnEnterGeofence(this.context, geofence.getGroupId(), geofence.getId());
        } else if (geofenceAction.getTransition() == 2) {
            GeofenceIntentService.enqueueOnExitGeofence(this.context, geofence.getGroupId(), geofence.getId());
        }
    }
}