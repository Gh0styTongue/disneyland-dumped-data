package com.disney.wdpro.magicble.beacon.helper;

import com.disney.wdpro.magicble.common.vendo.MbleVendoCastAreaConfig;
import com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/helper/MbleBeaconAdvertisingHelper;", "", "vendoConfigProvider", "Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;", "mbleLocalStorageManager", "Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;", "mbleCoreManager", "Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;", "(Lcom/disney/wdpro/magicble/common/vendo/MbleVendoConfigProvider;Lcom/disney/wdpro/magicble/manager/MbleLocalStorageManager;Lcom/disney/wdpro/mblecore/manager/MbleCoreManager;)V", "getDisableAdvertisingHoursMillis", "", "isAdvertisingDisabledForHours", "", "currentTime", "isAdvertisingDisabledInCastArea", "startAdvertising", "", "stopAdvertising", "updateCastAreaLastScanTimestamp", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleBeaconAdvertisingHelper {
    private final MbleCoreManager mbleCoreManager;
    private final MbleLocalStorageManager mbleLocalStorageManager;
    private final MbleVendoConfigProvider vendoConfigProvider;

    @Inject
    public MbleBeaconAdvertisingHelper(MbleVendoConfigProvider vendoConfigProvider, MbleLocalStorageManager mbleLocalStorageManager, MbleCoreManager mbleCoreManager) {
        Intrinsics.checkNotNullParameter(vendoConfigProvider, "vendoConfigProvider");
        Intrinsics.checkNotNullParameter(mbleLocalStorageManager, "mbleLocalStorageManager");
        Intrinsics.checkNotNullParameter(mbleCoreManager, "mbleCoreManager");
        this.vendoConfigProvider = vendoConfigProvider;
        this.mbleLocalStorageManager = mbleLocalStorageManager;
        this.mbleCoreManager = mbleCoreManager;
    }

    private final boolean isAdvertisingDisabledForHours(long currentTime) {
        return currentTime - this.mbleLocalStorageManager.getCastAreaLastScanTimestamp() < getDisableAdvertisingHoursMillis();
    }

    public final long getDisableAdvertisingHoursMillis() {
        if (this.vendoConfigProvider.getMbleVendoCastAreaConfig() != null) {
            return TimeUnit.HOURS.toMillis(r3.getDisableAdvertForHours());
        }
        return 0L;
    }

    public final boolean isAdvertisingDisabledInCastArea(long currentTime) {
        MbleVendoCastAreaConfig mbleVendoCastAreaConfig = this.vendoConfigProvider.getMbleVendoCastAreaConfig();
        return (mbleVendoCastAreaConfig == null || mbleVendoCastAreaConfig.getDisableAdvertForHours() == 0 || mbleVendoCastAreaConfig.getBeacons() == null || mbleVendoCastAreaConfig.getBeacons().isEmpty() || !isAdvertisingDisabledForHours(currentTime)) ? false : true;
    }

    public final void startAdvertising() {
        this.mbleCoreManager.startAdvertising(3);
    }

    public final void stopAdvertising() {
        this.mbleCoreManager.stopAdvertising(-2);
    }

    public final void updateCastAreaLastScanTimestamp() {
        this.mbleLocalStorageManager.updateCastAreaLastScanTimestamp();
    }
}