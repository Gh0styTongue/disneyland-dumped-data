package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.magicble.common.vendo.MbleVendoBeaconConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.google.gson.Gson;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m92038d2 = {"com/disney/wdpro/magicble/di/MbleModule$provideMbleFeatureConfig$mbleCoreToggles$1", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "getRefreshTokenListTimePeriodHours", "", "getUpdateTokenTimePeriodMins", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleModule$provideMbleFeatureConfig$mbleCoreToggles$1 implements MbleCoreToggles {
    final /* synthetic */ Gson $gson;

    MbleModule$provideMbleFeatureConfig$mbleCoreToggles$1(Gson gson) {
        gson = gson;
    }

    @Override // com.disney.wdpro.mblecore.common.MbleCoreToggles
    public int getRefreshTokenListTimePeriodHours() {
        Integer numM38765k = vendomatic.m38765k();
        if (numM38765k == null) {
            return 0;
        }
        return numM38765k.intValue();
    }

    @Override // com.disney.wdpro.mblecore.common.MbleCoreToggles
    public int getUpdateTokenTimePeriodMins() {
        MbleVendoBeaconConfig mbleVendoConfig = MbleUtils.INSTANCE.parseMbleVendoConfig(vendomatic, gson);
        if (mbleVendoConfig != null) {
            return mbleVendoConfig.getUpdateTokenTimePeriodMins();
        }
        return 0;
    }
}