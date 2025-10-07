package com.disney.wdpro.magicble.geofence;

import com.disney.wdpro.geofence.model.GeofenceWrapper;
import com.disney.wdpro.magicble.common.MbleGeofence;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/magicble/geofence/MbleGeofenceManager;", "", "getGeofenceRegions", "", "Lcom/disney/wdpro/magicble/common/MbleGeofence;", "registerGeofences", "Lcom/disney/wdpro/geofence/model/GeofenceWrapper;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public interface MbleGeofenceManager {
    List<MbleGeofence> getGeofenceRegions();

    List<GeofenceWrapper> registerGeofences();
}