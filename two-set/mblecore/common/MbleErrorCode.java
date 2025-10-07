package com.disney.wdpro.mblecore.common;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/common/MbleErrorCode;", "", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface MbleErrorCode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/common/MbleErrorCode$Companion;", "", "()V", "MBLE_ADVERTISING_FAILED_ERROR", "", "getMBLE_ADVERTISING_FAILED_ERROR", "()I", "MBLE_ADVERTISING_NO_DATA_ERROR", "getMBLE_ADVERTISING_NO_DATA_ERROR", "MBLE_BLUETOOTH_NOT_ENABLED_ERROR", "getMBLE_BLUETOOTH_NOT_ENABLED_ERROR", "MBLE_INVALID_SWID_ERROR", "getMBLE_INVALID_SWID_ERROR", "MBLE_START_ADVERTISING_NOT_ALLOWED_ERROR", "getMBLE_START_ADVERTISING_NOT_ALLOWED_ERROR", "MBLE_TOKEN_NOT_FETCHED_ERROR", "getMBLE_TOKEN_NOT_FETCHED_ERROR", "MBLE_TOKEN_NOT_SAVED_ERROR", "getMBLE_TOKEN_NOT_SAVED_ERROR", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        private static final int MBLE_BLUETOOTH_NOT_ENABLED_ERROR = 0;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int MBLE_TOKEN_NOT_FETCHED_ERROR = 2;
        private static final int MBLE_ADVERTISING_FAILED_ERROR = 3;
        private static final int MBLE_ADVERTISING_NO_DATA_ERROR = 4;
        private static final int MBLE_START_ADVERTISING_NOT_ALLOWED_ERROR = 5;
        private static final int MBLE_INVALID_SWID_ERROR = 6;
        private static final int MBLE_TOKEN_NOT_SAVED_ERROR = 20;

        private Companion() {
        }

        public final int getMBLE_ADVERTISING_FAILED_ERROR() {
            return MBLE_ADVERTISING_FAILED_ERROR;
        }

        public final int getMBLE_ADVERTISING_NO_DATA_ERROR() {
            return MBLE_ADVERTISING_NO_DATA_ERROR;
        }

        public final int getMBLE_BLUETOOTH_NOT_ENABLED_ERROR() {
            return MBLE_BLUETOOTH_NOT_ENABLED_ERROR;
        }

        public final int getMBLE_INVALID_SWID_ERROR() {
            return MBLE_INVALID_SWID_ERROR;
        }

        public final int getMBLE_START_ADVERTISING_NOT_ALLOWED_ERROR() {
            return MBLE_START_ADVERTISING_NOT_ALLOWED_ERROR;
        }

        public final int getMBLE_TOKEN_NOT_FETCHED_ERROR() {
            return MBLE_TOKEN_NOT_FETCHED_ERROR;
        }

        public final int getMBLE_TOKEN_NOT_SAVED_ERROR() {
            return MBLE_TOKEN_NOT_SAVED_ERROR;
        }
    }
}