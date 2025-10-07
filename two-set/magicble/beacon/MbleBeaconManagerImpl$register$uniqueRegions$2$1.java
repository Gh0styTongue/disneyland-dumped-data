package com.disney.wdpro.magicble.beacon;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m92038d2 = {"com/disney/wdpro/magicble/beacon/MbleBeaconManagerImpl$register$uniqueRegions$2$1", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;", "uniqueIdentifier", "", "getUniqueIdentifier", "()Ljava/lang/String;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleBeaconManagerImpl$register$uniqueRegions$2$1 implements MaBeaconRegion {
    MbleBeaconManagerImpl$register$uniqueRegions$2$1() {
    }

    @Override // com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion
    public String getUniqueIdentifier() {
        return mbleBeacon.getUuid();
    }
}