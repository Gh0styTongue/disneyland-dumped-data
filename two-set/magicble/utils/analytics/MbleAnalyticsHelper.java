package com.disney.wdpro.magicble.utils.analytics;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.C3296a;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.magicble.utils.MbleUtils;
import java.net.ConnectException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u0000 /2\u00020\u0001:\u0001/B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u00060"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsHelper;", "", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/analytics/k;", "analyticsHelper", "Landroid/bluetooth/BluetoothManager;", "bluetoothManager", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/analytics/k;Landroid/bluetooth/BluetoothManager;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)V", "", "getBluetoothStatus", "()I", "", "getLocationPermissionStatus", "()Ljava/lang/String;", "getLowBatteryModeStatus", "action", "", "contextData", "", "trackMbleAction", "(Ljava/lang/String;Ljava/util/Map;)V", "createAnalyticsMap", "()Ljava/util/Map;", "", "isUserOptIn", "()Z", "Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsState;", "state", "trackMbleInitialized", "(Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsState;)V", "trackMbleOptOut", "()V", "", "throwable", "trackMbleVmmsApiFail", "(Ljava/lang/Throwable;)V", "errorCode", "trackMbleStartAdvertisingFailEvent", "(Ljava/lang/Integer;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/analytics/k;", "Landroid/bluetooth/BluetoothManager;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleAnalyticsHelper {
    private static final String ACTION_MAGIC_BLE_INIT = "MagicBLEInitialize";
    private static final String BLUETOOTH_KEY = "bluetooth";
    private static final int BT_STATE_DISABLED = 0;
    private static final int BT_STATE_ENABLED = 1;
    public static final int GEO_STATE_ADVERT_OUTSIDE_ENABLED = -1;
    public static final int GEO_STATE_IN = 1;
    public static final int GEO_STATE_OUTSIDE = 0;
    private static final String LOCATION_INFO_KEY = "location.info";
    private static final String LOCATION_PERMISSION_STATE_ALWAYS = "Always";
    private static final String LOCATION_PERMISSION_STATE_NEVER = "Never";
    private static final String LOW_BATTERY_KEY = "lowbattery";
    private static final int LOW_BATTERY_MODE_DISABLED = 0;
    private static final int LOW_BATTERY_MODE_ENABLED = 1;
    private static final String MAGIC_BLE_INIT_KEY = "magicble.initialize";
    public static final int START_ADVERT_CODE_APP_LAUNCH = 1;
    public static final int START_ADVERT_CODE_BEACON_SCAN = 3;
    public static final int START_ADVERT_CODE_FAST_PING = 4;
    public static final int START_ADVERT_CODE_GEO_ENTER = 2;
    public static final int START_ADVERT_CODE_UNKNOWN = 0;
    public static final int START_ADVERT_FAIL_REASON_UNKNOWN = 0;
    public static final int STOP_ADVERT_REASON_CAST_AREA = 3;
    public static final int STOP_ADVERT_REASON_DO_NOT_REPORT = -2;
    public static final int STOP_ADVERT_REASON_GEO_EXIT = 2;
    public static final int STOP_ADVERT_REASON_LOGOUT = 1;
    public static final int STOP_ADVERT_REASON_UNKNOWN = 0;
    private static final int VMMS_API_FAIL_REASON_CONNECTION_ERROR = 1;
    private static final int VMMS_API_FAIL_REASON_UNKNOWN = 0;
    private final InterfaceC8679k analyticsHelper;
    private final AuthenticationManager authenticationManager;
    private final BluetoothManager bluetoothManager;
    private final Context context;

    @Inject
    public MbleAnalyticsHelper(Context context, InterfaceC8679k analyticsHelper, BluetoothManager bluetoothManager, AuthenticationManager authenticationManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        this.context = context;
        this.analyticsHelper = analyticsHelper;
        this.bluetoothManager = bluetoothManager;
        this.authenticationManager = authenticationManager;
    }

    private final Map<String, String> createAnalyticsMap() {
        return new HashMap();
    }

    private final int getBluetoothStatus() {
        BluetoothAdapter adapter = this.bluetoothManager.getAdapter();
        return (adapter == null || !adapter.isEnabled()) ? 0 : 1;
    }

    private final String getLocationPermissionStatus() {
        return C3296a.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? "Always" : "Never";
    }

    private final int getLowBatteryModeStatus() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return intentRegisterReceiver != null ? intentRegisterReceiver.getBooleanExtra("battery_low", false) : false ? 1 : 0;
    }

    private final boolean isUserOptIn() {
        return MbleUtils.INSTANCE.isUserOptIn(this.context, this.authenticationManager);
    }

    private final void trackMbleAction(String action, Map<String, String> contextData) {
        contextData.put("bluetooth", String.valueOf(getBluetoothStatus()));
        contextData.put("location.info", getLocationPermissionStatus());
        contextData.put("lowbattery", String.valueOf(getLowBatteryModeStatus()));
        contextData.toString();
        this.analyticsHelper.mo37405b(action, contextData);
    }

    public final void trackMbleInitialized(MbleAnalyticsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Map<String, String> mapCreateAnalyticsMap = createAnalyticsMap();
        mapCreateAnalyticsMap.put(MAGIC_BLE_INIT_KEY, state.getFormattedString());
        trackMbleAction(ACTION_MAGIC_BLE_INIT, mapCreateAnalyticsMap);
    }

    public final void trackMbleOptOut() {
        Map<String, String> mapCreateAnalyticsMap = createAnalyticsMap();
        mapCreateAnalyticsMap.put(MAGIC_BLE_INIT_KEY, new MbleAnalyticsState(false, null, 0, 0, 0, 0, 62, null).getFormattedString());
        trackMbleAction(ACTION_MAGIC_BLE_INIT, mapCreateAnalyticsMap);
    }

    public final void trackMbleStartAdvertisingFailEvent(Integer errorCode) {
        Map<String, String> mapCreateAnalyticsMap = createAnalyticsMap();
        mapCreateAnalyticsMap.put(MAGIC_BLE_INIT_KEY, new MbleAnalyticsState(isUserOptIn(), null, 0, 0, errorCode != null ? errorCode.intValue() : 0, 0, 46, null).getFormattedString());
        trackMbleAction(ACTION_MAGIC_BLE_INIT, mapCreateAnalyticsMap);
    }

    public final void trackMbleVmmsApiFail(Throwable throwable) {
        int statusCode = 0;
        if (throwable != null) {
            throwable.printStackTrace();
            if (throwable instanceof UnSuccessStatusException) {
                statusCode = ((UnSuccessStatusException) throwable).getStatusCode();
            } else if (throwable instanceof TimeoutException) {
                statusCode = 408;
            } else if (throwable instanceof ConnectException) {
                statusCode = 1;
            }
        }
        Map<String, String> mapCreateAnalyticsMap = createAnalyticsMap();
        mapCreateAnalyticsMap.put(MAGIC_BLE_INIT_KEY, new MbleAnalyticsState(isUserOptIn(), null, statusCode, 0, 0, 0, 58, null).getFormattedString());
        trackMbleAction(ACTION_MAGIC_BLE_INIT, mapCreateAnalyticsMap);
    }
}