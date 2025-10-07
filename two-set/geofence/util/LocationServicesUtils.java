package com.disney.wdpro.geofence.util;

import android.content.Context;
import androidx.core.content.C3296a;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes28.dex */
public class LocationServicesUtils {
    private LocationServicesUtils() {
    }

    public static boolean isLocationServiceAvailable(Context context) {
        if (C3296a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            LogUtils.m50244e("Location permission is not accepted by the user.");
            return false;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        try {
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
            if (iIsGooglePlayServicesAvailable == 0) {
                return true;
            }
            googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}