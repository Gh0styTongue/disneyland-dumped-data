package com.disney.wdpro.magicble.utils;

import android.content.Context;
import android.location.Location;
import androidx.core.app.NotificationCompat;
import androidx.core.content.C3296a;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.settings.SecretConfig;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.magicble.common.MbleGeofence;
import com.disney.wdpro.magicble.common.vendo.MbleVendoBeaconConfig;
import com.disney.wdpro.magicble.common.vendo.MbleVendoCastAreaConfig;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.settings.LocationRegionsSecretConfig;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.mblecore.common.MbleErrorCode;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\u001d\u0010$\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J%\u0010-\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*¢\u0006\u0004\b-\u0010.J%\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020+2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*¢\u0006\u0004\b0\u00101J-\u00106\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J-\u00108\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00107J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/MbleUtils;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_MESSAGE, "", "showLog", "(Ljava/lang/String;)V", "showInfoLog", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/google/gson/Gson;", "gson", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoBeaconConfig;", "parseMbleVendoConfig", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)Lcom/disney/wdpro/magicble/common/vendo/MbleVendoBeaconConfig;", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "parseMbleCastAreaVendoConfig", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;)Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "Landroid/content/Context;", "context", "", "isLocationPermissionGranted", "(Landroid/content/Context;)Z", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "isUserOptIn", "(Landroid/content/Context;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)Z", "Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;", "mbleSecretConfig", "isMagicBleFeatureEnabled", "(Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;)Z", "isAdvertiseOutsideGeofenceEnabled", "Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;", "locationRegionsSecretConfig", "isLocationServicesEnabled", "(Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;)Z", "isMagicBleFeatureEnabledAndDeviceOptIn", "(Landroid/content/Context;Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/magicble/settings/MbleSecretConfig;)Z", "Landroid/location/Location;", "location", "", "Lcom/disney/wdpro/magicble/common/MbleGeofence;", "geofenceRegionList", "isLocationWithinGeofence", "(Landroid/location/Location;Ljava/util/List;)Z", "mbleGeofence", "isGeofenceAreaWithinGeofence", "(Lcom/disney/wdpro/magicble/common/MbleGeofence;Ljava/util/List;)Z", "Lcom/disney/wdpro/commons/r;", "time", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "mbleLocalStorageManager", "isAdvertisingDisabledInCastArea", "(Lcom/disney/wdpro/commons/config/i;Lcom/google/gson/Gson;Lcom/disney/wdpro/commons/r;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;)Z", "isFastPingModeEnabled", "", "errorCode", "mapMbleCoreErrorCodeToDescription", "(I)Ljava/lang/String;", "LOG_TAG", "Ljava/lang/String;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes13.dex */
public final class MbleUtils {
    public static final MbleUtils INSTANCE = new MbleUtils();
    public static final String LOG_TAG = "MBLE";

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecretConfig.FeatureState.values().length];
            try {
                iArr[SecretConfig.FeatureState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecretConfig.FeatureState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecretConfig.FeatureState.REMOTE_CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MbleUtils() {
    }

    public final boolean isAdvertiseOutsideGeofenceEnabled(C9248i vendomatic, MbleSecretConfig mbleSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "mbleSecretConfig");
        INSTANCE.showLog("Advertise Outside Geofence State : " + mbleSecretConfig.getMagicBleAdvertiseOutsideGeofenceState());
        return mbleSecretConfig.getMagicBleAdvertiseOutsideGeofenceState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38688H0() : mbleSecretConfig.getMagicBleAdvertiseOutsideGeofenceState() == SecretConfig.FeatureState.ENABLED;
    }

    public final boolean isAdvertisingDisabledInCastArea(C9248i vendomatic, Gson gson, C9350r time, MbleLocalStorageManager mbleLocalStorageManager) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        MbleVendoCastAreaConfig mbleCastAreaVendoConfig = INSTANCE.parseMbleCastAreaVendoConfig(vendomatic, gson);
        if (mbleCastAreaVendoConfig != null && mbleCastAreaVendoConfig.getDisableAdvertForHours() != 0 && mbleCastAreaVendoConfig.getBeacons() != null && mbleCastAreaVendoConfig.getBeacons().size() != 0) {
            long castAreaLastScanTimestamp = mbleLocalStorageManager.getCastAreaLastScanTimestamp();
            if (castAreaLastScanTimestamp > 0 && time.m39090h().getTimeInMillis() - castAreaLastScanTimestamp < C9350r.m39065G(mbleCastAreaVendoConfig.getDisableAdvertForHours())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isFastPingModeEnabled(C9248i vendomatic, Gson gson, C9350r time, MbleLocalStorageManager mbleLocalStorageManager) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        return false;
    }

    public final boolean isGeofenceAreaWithinGeofence(MbleGeofence mbleGeofence, List<MbleGeofence> geofenceRegionList) {
        Intrinsics.checkNotNullParameter(mbleGeofence, "mbleGeofence");
        if (geofenceRegionList != null) {
            for (MbleGeofence mbleGeofence2 : geofenceRegionList) {
                if (mbleGeofence2 != null) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(mbleGeofence.getLat(), mbleGeofence.getLon(), mbleGeofence2.getLat(), mbleGeofence2.getLon(), fArr);
                    if (fArr[0] + mbleGeofence.getRadius() <= mbleGeofence2.getRadius()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isLocationPermissionGranted(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C3296a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public final boolean isLocationServicesEnabled(C9248i vendomatic, LocationRegionsSecretConfig locationRegionsSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(locationRegionsSecretConfig, "locationRegionsSecretConfig");
        int i10 = WhenMappings.$EnumSwitchMapping$0[locationRegionsSecretConfig.getLocationRegionsFeatureState().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return vendomatic.m38775n0();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isLocationWithinGeofence(Location location, List<MbleGeofence> geofenceRegionList) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (geofenceRegionList != null) {
            for (MbleGeofence mbleGeofence : geofenceRegionList) {
                if (mbleGeofence != null) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(location.getLatitude(), location.getLongitude(), mbleGeofence.getLat(), mbleGeofence.getLon(), fArr);
                    if (fArr[0] <= mbleGeofence.getRadius()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isMagicBleFeatureEnabled(C9248i vendomatic, MbleSecretConfig mbleSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "mbleSecretConfig");
        INSTANCE.showLog("MagicBle Feature State : " + mbleSecretConfig.getMagicBleFeatureState());
        return mbleSecretConfig.getMagicBleFeatureState() == SecretConfig.FeatureState.REMOTE_CONFIG ? vendomatic.m38694J0() : mbleSecretConfig.getMagicBleFeatureState() == SecretConfig.FeatureState.ENABLED;
    }

    public final boolean isMagicBleFeatureEnabledAndDeviceOptIn(Context context, C9248i vendomatic, MbleSecretConfig mbleSecretConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(mbleSecretConfig, "mbleSecretConfig");
        if (isMagicBleFeatureEnabled(vendomatic, mbleSecretConfig)) {
            return true;
        }
        INSTANCE.showInfoLog("Magic BLE feature is disabled.");
        return false;
    }

    public final boolean isUserOptIn(Context context, AuthenticationManager authenticationManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        return authenticationManager.isUserAuthenticated() && isLocationPermissionGranted(context);
    }

    public final String mapMbleCoreErrorCodeToDescription(int errorCode) {
        MbleErrorCode.Companion companion = MbleErrorCode.INSTANCE;
        return errorCode == companion.getMBLE_ADVERTISING_FAILED_ERROR() ? "ADVERTISING_FAILED_ERROR" : errorCode == companion.getMBLE_BLUETOOTH_NOT_ENABLED_ERROR() ? "BLUETOOTH_NOT_ENABLED_ERROR" : errorCode == companion.getMBLE_INVALID_SWID_ERROR() ? "INVALID_SWID_ERROR" : errorCode == companion.getMBLE_TOKEN_NOT_SAVED_ERROR() ? "TOKEN_NOT_SAVED_ERROR" : errorCode == companion.getMBLE_ADVERTISING_NO_DATA_ERROR() ? "ADVERTISING_NO_DATA_ERROR" : errorCode == companion.getMBLE_START_ADVERTISING_NOT_ALLOWED_ERROR() ? "START_ADVERTISING_NOT_ALLOWED_ERROR" : errorCode == companion.getMBLE_TOKEN_NOT_FETCHED_ERROR() ? "TOKEN_NOT_FETCHED_ERROR" : "UNKNOWN_ERROR";
    }

    public final MbleVendoCastAreaConfig parseMbleCastAreaVendoConfig(C9248i vendomatic, Gson gson) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        try {
            String strM38762j = vendomatic.m38762j();
            return (MbleVendoCastAreaConfig) (gson == null ? gson.fromJson(strM38762j, MbleVendoCastAreaConfig.class) : GsonInstrumentation.fromJson(gson, strM38762j, MbleVendoCastAreaConfig.class));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public final MbleVendoBeaconConfig parseMbleVendoConfig(C9248i vendomatic, Gson gson) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(gson, "gson");
        try {
            String strM38756h = vendomatic.m38756h();
            return (MbleVendoBeaconConfig) (gson == null ? gson.fromJson(strM38756h, MbleVendoBeaconConfig.class) : GsonInstrumentation.fromJson(gson, strM38756h, MbleVendoBeaconConfig.class));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public final void showInfoLog(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void showLog(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}