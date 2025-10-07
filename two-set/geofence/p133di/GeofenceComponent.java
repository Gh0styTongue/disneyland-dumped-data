package com.disney.wdpro.geofence.p133di;

import com.disney.wdpro.geofence.broadcast.BootCompleteReceiver;
import com.disney.wdpro.geofence.service.GeofenceHandlerIntentService;
import com.disney.wdpro.geofence.service.GeofenceIntentService;
import dagger.Subcomponent;

@Subcomponent
/* loaded from: classes28.dex */
public interface GeofenceComponent {
    void inject(BootCompleteReceiver bootCompleteReceiver);

    void inject(GeofenceHandlerIntentService geofenceHandlerIntentService);

    void inject(GeofenceIntentService geofenceIntentService);
}