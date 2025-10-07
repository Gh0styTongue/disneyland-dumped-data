package com.disney.wdpro.mblecore.api;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/ServicesConstants;", "", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface ServicesConstants {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/ServicesConstants$Companion;", "", "()V", "URL_PARAM_SWID", "", "getURL_PARAM_SWID", "()Ljava/lang/String;", "URL_PATH_GET_BLE_IDS_WITH_SWID", "getURL_PATH_GET_BLE_IDS_WITH_SWID", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String URL_PARAM_SWID = "swid";
        private static final String URL_PATH_GET_BLE_IDS_WITH_SWID = "vmtm/api/v0/ble-ids/by-guest/type/swid/value/";

        private Companion() {
        }

        public final String getURL_PARAM_SWID() {
            return URL_PARAM_SWID;
        }

        public final String getURL_PATH_GET_BLE_IDS_WITH_SWID() {
            return URL_PATH_GET_BLE_IDS_WITH_SWID;
        }
    }
}