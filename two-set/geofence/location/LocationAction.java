package com.disney.wdpro.geofence.location;

import com.disney.wdpro.geofence.location.LocationServiceWrapper;
import com.google.android.gms.location.Geofence;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes28.dex */
public class LocationAction {
    private final LocationServiceWrapper.LocationStatusCallback callback;
    private final List<Geofence> geofences;
    private final List<String> ids;
    private final int locationActionMethod;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationActionMethod {
        public static final int ADD = 0;
        public static final int REMOVE = 1;
    }

    public LocationAction(int i10, List<Geofence> list, LocationServiceWrapper.LocationStatusCallback locationStatusCallback) {
        this.locationActionMethod = i10;
        this.geofences = list;
        this.callback = locationStatusCallback;
        this.ids = null;
    }

    LocationServiceWrapper.LocationStatusCallback getCallback() {
        return this.callback;
    }

    public List<Geofence> getGeofences() {
        return this.geofences;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public int getLocationActionMethod() {
        return this.locationActionMethod;
    }

    public LocationAction(int i10, LocationServiceWrapper.LocationStatusCallback locationStatusCallback, List<String> list) {
        this.locationActionMethod = i10;
        this.geofences = null;
        this.callback = locationStatusCallback;
        this.ids = list;
    }
}