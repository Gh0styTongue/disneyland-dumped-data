package com.disney.wdpro.geofence.util;

/* loaded from: classes28.dex */
public class GeofenceUtils {
    public static final String GEOFENCE_CASCADE_HANDLER = "GEOFENCE_CASCADE_HANDLER";
    public static final String GEOFENCE_STORAGE_ID = "geofence_lib_storage";
    private static final String SPLIT = "=GEOFENCE=";

    public static String concatId(String str, String str2) {
        return str + SPLIT + str2;
    }

    public static String[] splitGeofenceId(String str) {
        return str.split(SPLIT);
    }
}