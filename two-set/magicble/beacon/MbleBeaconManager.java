package com.disney.wdpro.magicble.beacon;

import com.disney.wdpro.magicble.beacon.model.MbleBeacon;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/MbleBeaconManager;", "", "register", "", "beaconList", "", "Lcom/disney/wdpro/magicble/beacon/model/MbleBeacon;", "unregister", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public interface MbleBeaconManager {
    void register(List<MbleBeacon> beaconList);

    void unregister();
}