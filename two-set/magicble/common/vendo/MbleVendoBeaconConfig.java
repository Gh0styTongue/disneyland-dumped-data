package com.disney.wdpro.magicble.common.vendo;

import com.disney.wdpro.magicble.beacon.model.MbleBeacon;
import com.disney.wdpro.magicble.common.MbleGeofence;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/magicble/common/vendo/MbleVendoBeaconConfig;", "", "geofences", "", "Lcom/disney/wdpro/magicble/common/MbleGeofence;", "updateTokenTimePeriodMins", "", "fastPingBeacons", "Lcom/disney/wdpro/magicble/beacon/model/MbleBeacon;", "fastPingTimePeriodMins", "(Ljava/util/List;ILjava/util/List;I)V", "getFastPingBeacons", "()Ljava/util/List;", "getFastPingTimePeriodMins", "()I", "getGeofences", "getUpdateTokenTimePeriodMins", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MbleVendoBeaconConfig {
    private final List<MbleBeacon> fastPingBeacons;
    private final int fastPingTimePeriodMins;
    private final List<MbleGeofence> geofences;
    private final int updateTokenTimePeriodMins;

    public MbleVendoBeaconConfig(List<MbleGeofence> geofences, int i10, List<MbleBeacon> list, int i11) {
        Intrinsics.checkNotNullParameter(geofences, "geofences");
        this.geofences = geofences;
        this.updateTokenTimePeriodMins = i10;
        this.fastPingBeacons = list;
        this.fastPingTimePeriodMins = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MbleVendoBeaconConfig copy$default(MbleVendoBeaconConfig mbleVendoBeaconConfig, List list, int i10, List list2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = mbleVendoBeaconConfig.geofences;
        }
        if ((i12 & 2) != 0) {
            i10 = mbleVendoBeaconConfig.updateTokenTimePeriodMins;
        }
        if ((i12 & 4) != 0) {
            list2 = mbleVendoBeaconConfig.fastPingBeacons;
        }
        if ((i12 & 8) != 0) {
            i11 = mbleVendoBeaconConfig.fastPingTimePeriodMins;
        }
        return mbleVendoBeaconConfig.copy(list, i10, list2, i11);
    }

    public final List<MbleGeofence> component1() {
        return this.geofences;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUpdateTokenTimePeriodMins() {
        return this.updateTokenTimePeriodMins;
    }

    public final List<MbleBeacon> component3() {
        return this.fastPingBeacons;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFastPingTimePeriodMins() {
        return this.fastPingTimePeriodMins;
    }

    public final MbleVendoBeaconConfig copy(List<MbleGeofence> geofences, int updateTokenTimePeriodMins, List<MbleBeacon> fastPingBeacons, int fastPingTimePeriodMins) {
        Intrinsics.checkNotNullParameter(geofences, "geofences");
        return new MbleVendoBeaconConfig(geofences, updateTokenTimePeriodMins, fastPingBeacons, fastPingTimePeriodMins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MbleVendoBeaconConfig)) {
            return false;
        }
        MbleVendoBeaconConfig mbleVendoBeaconConfig = (MbleVendoBeaconConfig) other;
        return Intrinsics.areEqual(this.geofences, mbleVendoBeaconConfig.geofences) && this.updateTokenTimePeriodMins == mbleVendoBeaconConfig.updateTokenTimePeriodMins && Intrinsics.areEqual(this.fastPingBeacons, mbleVendoBeaconConfig.fastPingBeacons) && this.fastPingTimePeriodMins == mbleVendoBeaconConfig.fastPingTimePeriodMins;
    }

    public final List<MbleBeacon> getFastPingBeacons() {
        return this.fastPingBeacons;
    }

    public final int getFastPingTimePeriodMins() {
        return this.fastPingTimePeriodMins;
    }

    public final List<MbleGeofence> getGeofences() {
        return this.geofences;
    }

    public final int getUpdateTokenTimePeriodMins() {
        return this.updateTokenTimePeriodMins;
    }

    public int hashCode() {
        int iHashCode = ((this.geofences.hashCode() * 31) + Integer.hashCode(this.updateTokenTimePeriodMins)) * 31;
        List<MbleBeacon> list = this.fastPingBeacons;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.fastPingTimePeriodMins);
    }

    public String toString() {
        return "MbleVendoBeaconConfig(geofences=" + this.geofences + ", updateTokenTimePeriodMins=" + this.updateTokenTimePeriodMins + ", fastPingBeacons=" + this.fastPingBeacons + ", fastPingTimePeriodMins=" + this.fastPingTimePeriodMins + ")";
    }
}