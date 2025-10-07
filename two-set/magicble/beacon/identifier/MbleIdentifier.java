package com.disney.wdpro.magicble.beacon.identifier;

import com.disney.wdpro.locationservices.ma_beacons.manager.definitions.MaBeaconRegion;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/identifier/MbleIdentifier;", "", "isNewBeacon", "", "beacon", "Lcom/disney/wdpro/locationservices/ma_beacons/manager/definitions/MaBeaconRegion;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public interface MbleIdentifier {
    boolean isNewBeacon(MaBeaconRegion beacon);
}