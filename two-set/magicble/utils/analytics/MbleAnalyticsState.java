package com.disney.wdpro.magicble.utils.analytics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/analytics/MbleAnalyticsState;", "", "optIn", "", "geofenceState", "", "vmmsApiFailCode", "startAdvReason", "startAdvFailReason", "stopAdvReason", "(ZLjava/lang/Integer;IIII)V", "getGeofenceState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOptIn", "()Z", "getStartAdvFailReason", "()I", "getStartAdvReason", "getStopAdvReason", "getVmmsApiFailCode", "getFormattedString", "", "Companion", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleAnalyticsState {
    private final Integer geofenceState;
    private final boolean optIn;
    private final int startAdvFailReason;
    private final int startAdvReason;
    private final int stopAdvReason;
    private final int vmmsApiFailCode;
    private static final String MBLE_INIT_DATA_OPTIN_KEY = "mOptIn";
    private static final String MBLE_INIT_DATA_GEO_KEY = "mGeo";
    private static final String MBLE_INIT_DATA_API_FAIL_CODE_KEY = "mApiFailCode";
    private static final String MBLE_INIT_DATA_START_ADV_KEY = "mStartAdv";
    private static final String MBLE_INIT_DATA_START_ADV_FAIL_KEY = "mStartAdvFailReason";
    private static final String MBLE_INIT_DATA_STOP_ADV_KEY = "mStopAdv";
    private static final String MBLE_INIT_DATA_SEPARATOR = ",";
    private static final int MBLE_STATE_DATA_DEFAULT_VALUE = -1;
    private static final int MBLE_STATE_DATA_DEFAULT_GEO_VALUE = -2;

    public MbleAnalyticsState(boolean z10, Integer num, int i10, int i11, int i12, int i13) {
        this.optIn = z10;
        this.geofenceState = num;
        this.vmmsApiFailCode = i10;
        this.startAdvReason = i11;
        this.startAdvFailReason = i12;
        this.stopAdvReason = i13;
    }

    public final String getFormattedString() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = this.optIn;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(MBLE_INIT_DATA_OPTIN_KEY + ":%d,", Arrays.copyOf(new Object[]{Integer.valueOf(z10 ? 1 : 0)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        sb2.append(str);
        Integer num = this.geofenceState;
        int i10 = MBLE_STATE_DATA_DEFAULT_GEO_VALUE;
        if (num != null && num.intValue() == i10) {
            sb2.append(MBLE_INIT_DATA_SEPARATOR);
        } else {
            String str2 = String.format(MBLE_INIT_DATA_GEO_KEY + ":%d,", Arrays.copyOf(new Object[]{this.geofenceState}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            sb2.append(str2);
        }
        int i11 = this.vmmsApiFailCode;
        int i12 = MBLE_STATE_DATA_DEFAULT_VALUE;
        if (i11 == i12) {
            sb2.append(MBLE_INIT_DATA_SEPARATOR);
        } else {
            String str3 = String.format(MBLE_INIT_DATA_API_FAIL_CODE_KEY + ":%d,", Arrays.copyOf(new Object[]{Integer.valueOf(this.vmmsApiFailCode)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            sb2.append(str3);
        }
        if (this.startAdvReason == i12) {
            sb2.append(MBLE_INIT_DATA_SEPARATOR);
        } else {
            String str4 = String.format(MBLE_INIT_DATA_START_ADV_KEY + ":%d,", Arrays.copyOf(new Object[]{Integer.valueOf(this.startAdvReason)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            sb2.append(str4);
        }
        if (this.startAdvFailReason == i12) {
            sb2.append(MBLE_INIT_DATA_SEPARATOR);
        } else {
            String str5 = String.format(MBLE_INIT_DATA_START_ADV_FAIL_KEY + ":%d,", Arrays.copyOf(new Object[]{Integer.valueOf(this.startAdvFailReason)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            sb2.append(str5);
        }
        if (this.stopAdvReason != i12) {
            String str6 = String.format(MBLE_INIT_DATA_STOP_ADV_KEY + ":%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.stopAdvReason)}, 1));
            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            sb2.append(str6);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public final Integer getGeofenceState() {
        return this.geofenceState;
    }

    public final boolean getOptIn() {
        return this.optIn;
    }

    public final int getStartAdvFailReason() {
        return this.startAdvFailReason;
    }

    public final int getStartAdvReason() {
        return this.startAdvReason;
    }

    public final int getStopAdvReason() {
        return this.stopAdvReason;
    }

    public final int getVmmsApiFailCode() {
        return this.vmmsApiFailCode;
    }

    public /* synthetic */ MbleAnalyticsState(boolean z10, Integer num, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i14 & 2) != 0 ? Integer.valueOf(MBLE_STATE_DATA_DEFAULT_GEO_VALUE) : num, (i14 & 4) != 0 ? MBLE_STATE_DATA_DEFAULT_VALUE : i10, (i14 & 8) != 0 ? MBLE_STATE_DATA_DEFAULT_VALUE : i11, (i14 & 16) != 0 ? MBLE_STATE_DATA_DEFAULT_VALUE : i12, (i14 & 32) != 0 ? MBLE_STATE_DATA_DEFAULT_VALUE : i13);
    }
}