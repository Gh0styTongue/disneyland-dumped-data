package com.disney.wdpro.geofence.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.geofence.GeofenceManager;
import com.disney.wdpro.geofence.p133di.GeofenceComponentProvider;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public class BootCompleteReceiver extends BroadcastReceiver {

    @Inject
    protected GeofenceManager geofenceManager;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context.getApplicationContext() instanceof GeofenceComponentProvider) {
            ((GeofenceComponentProvider) context.getApplicationContext()).getGeofenceComponent().inject(this);
            this.geofenceManager.restoreSavedGeofences();
        }
    }
}