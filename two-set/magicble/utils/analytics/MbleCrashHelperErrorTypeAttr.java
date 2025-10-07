package com.disney.wdpro.magicble.utils.analytics;

import com.disney.wdpro.opp.dine.util.crash_helper.OppCrashHelperErrorTypeAttr;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/magicble/utils/analytics/MbleCrashHelperErrorTypeAttr;", "", "()V", "BLUETOOTH_NOT_ENABLED_ERROR", "", "getBLUETOOTH_NOT_ENABLED_ERROR", "()Ljava/lang/String;", "HTTP_ERROR", "getHTTP_ERROR", "INVALID_SWID", "getINVALID_SWID", "START_ADVERTISING_NOT_ALLOWED", "getSTART_ADVERTISING_NOT_ALLOWED", "START_ADVERT_ERROR", "getSTART_ADVERT_ERROR", "TOKEN_LIST_FETCH_ERROR", "getTOKEN_LIST_FETCH_ERROR", "TOKEN_LIST_SAVE_ERROR", "getTOKEN_LIST_SAVE_ERROR", "UNKNOWN_ERROR", "getUNKNOWN_ERROR", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleCrashHelperErrorTypeAttr {
    public static final MbleCrashHelperErrorTypeAttr INSTANCE = new MbleCrashHelperErrorTypeAttr();
    private static final String UNKNOWN_ERROR = OppCrashHelperErrorTypeAttr.UNKNOWN_ERROR;
    private static final String TOKEN_LIST_FETCH_ERROR = "tokenListFetchError";
    private static final String START_ADVERT_ERROR = "startAdvertisingError";
    private static final String TOKEN_LIST_SAVE_ERROR = "tokenListSaveError";
    private static final String BLUETOOTH_NOT_ENABLED_ERROR = "bluetoothNotEnabled";
    private static final String START_ADVERTISING_NOT_ALLOWED = "startAdvertisingNotAllowed";
    private static final String INVALID_SWID = "invalidSWID";
    private static final String HTTP_ERROR = "HTTP Error";

    private MbleCrashHelperErrorTypeAttr() {
    }

    public final String getBLUETOOTH_NOT_ENABLED_ERROR() {
        return BLUETOOTH_NOT_ENABLED_ERROR;
    }

    public final String getHTTP_ERROR() {
        return HTTP_ERROR;
    }

    public final String getINVALID_SWID() {
        return INVALID_SWID;
    }

    public final String getSTART_ADVERTISING_NOT_ALLOWED() {
        return START_ADVERTISING_NOT_ALLOWED;
    }

    public final String getSTART_ADVERT_ERROR() {
        return START_ADVERT_ERROR;
    }

    public final String getTOKEN_LIST_FETCH_ERROR() {
        return TOKEN_LIST_FETCH_ERROR;
    }

    public final String getTOKEN_LIST_SAVE_ERROR() {
        return TOKEN_LIST_SAVE_ERROR;
    }

    public final String getUNKNOWN_ERROR() {
        return UNKNOWN_ERROR;
    }
}