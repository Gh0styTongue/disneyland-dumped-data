package com.disney.wdpro.geofence;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.google.android.gms.location.Geofence;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes28.dex */
public class GeofenceMapperImpl implements GeofenceMapper {
    @Inject
    public GeofenceMapperImpl() {
    }

    @Override // com.disney.wdpro.geofence.GeofenceMapper
    public List<Geofence> mapGeofenceWrapperToGeofence(List<GeofenceWrapper> list) {
        ArrayList arrayList = new ArrayList();
        for (GeofenceWrapper geofenceWrapper : list) {
            Geofence.Builder expirationDuration = new Geofence.Builder().setRequestId(geofenceWrapper.getInternalId()).setCircularRegion(geofenceWrapper.getLat(), geofenceWrapper.getLng(), geofenceWrapper.getRadius()).setTransitionTypes(geofenceWrapper.getTransition()).setExpirationDuration(geofenceWrapper.getExpiration());
            if (geofenceWrapper.getLoitering() > 0) {
                expirationDuration.setLoiteringDelay(geofenceWrapper.getLoitering());
            }
            arrayList.add(expirationDuration.build());
        }
        return arrayList;
    }
}