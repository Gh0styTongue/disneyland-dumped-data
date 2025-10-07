package com.disney.wdpro.magicble.common.vendo;

import com.disney.wdpro.magicble.beacon.model.MbleBeacon;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/magicble/common/vendo/MbleVendoCastAreaConfig;", "", "beacons", "", "Lcom/disney/wdpro/magicble/beacon/model/MbleBeacon;", "disableAdvertForHours", "", "(Ljava/util/List;I)V", "getBeacons", "()Ljava/util/List;", "getDisableAdvertForHours", "()I", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MbleVendoCastAreaConfig {
    private final List<MbleBeacon> beacons;
    private final int disableAdvertForHours;

    public MbleVendoCastAreaConfig(List<MbleBeacon> list, int i10) {
        this.beacons = list;
        this.disableAdvertForHours = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MbleVendoCastAreaConfig copy$default(MbleVendoCastAreaConfig mbleVendoCastAreaConfig, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mbleVendoCastAreaConfig.beacons;
        }
        if ((i11 & 2) != 0) {
            i10 = mbleVendoCastAreaConfig.disableAdvertForHours;
        }
        return mbleVendoCastAreaConfig.copy(list, i10);
    }

    public final List<MbleBeacon> component1() {
        return this.beacons;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDisableAdvertForHours() {
        return this.disableAdvertForHours;
    }

    public final MbleVendoCastAreaConfig copy(List<MbleBeacon> beacons, int disableAdvertForHours) {
        return new MbleVendoCastAreaConfig(beacons, disableAdvertForHours);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MbleVendoCastAreaConfig)) {
            return false;
        }
        MbleVendoCastAreaConfig mbleVendoCastAreaConfig = (MbleVendoCastAreaConfig) other;
        return Intrinsics.areEqual(this.beacons, mbleVendoCastAreaConfig.beacons) && this.disableAdvertForHours == mbleVendoCastAreaConfig.disableAdvertForHours;
    }

    public final List<MbleBeacon> getBeacons() {
        return this.beacons;
    }

    public final int getDisableAdvertForHours() {
        return this.disableAdvertForHours;
    }

    public int hashCode() {
        List<MbleBeacon> list = this.beacons;
        return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.disableAdvertForHours);
    }

    public String toString() {
        return "MbleVendoCastAreaConfig(beacons=" + this.beacons + ", disableAdvertForHours=" + this.disableAdvertForHours + ")";
    }
}