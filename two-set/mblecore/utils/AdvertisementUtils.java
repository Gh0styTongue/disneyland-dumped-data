package com.disney.wdpro.mblecore.utils;

import android.bluetooth.BluetoothAdapter;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/utils/AdvertisementUtils;", "", "()V", "LOG_TAG", "", "isBluetoothEnabled", "", "showLog", "", "message", "mbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "timestampToDateTime", "timestamp", "", "format", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class AdvertisementUtils {
    public static final AdvertisementUtils INSTANCE = new AdvertisementUtils();
    private static final String LOG_TAG = "MBLECore";

    private AdvertisementUtils() {
    }

    public static /* synthetic */ String timestampToDateTime$default(AdvertisementUtils advertisementUtils, long j10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "MMMM dd,yyyy HH:mm:ss";
        }
        return advertisementUtils.timestampToDateTime(j10, str);
    }

    public final boolean isBluetoothEnabled() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }

    public final void showLog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showLog(message, null);
    }

    public final String timestampToDateTime(long timestamp, String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = new SimpleDateFormat(format).format(new Date(timestamp * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "sdf.format(date)");
        return str;
    }

    public final void showLog(String message, MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (mbleCoreLogger != null) {
            mbleCoreLogger.logD(message);
        }
    }
}