package com.disney.wdpro.geofence;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.google.android.gms.location.Geofence;
import java.util.List;

/* loaded from: classes28.dex */
public interface GeofenceMapper {
    List<Geofence> mapGeofenceWrapperToGeofence(List<GeofenceWrapper> list);
}