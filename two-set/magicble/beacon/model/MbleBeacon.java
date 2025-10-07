package com.disney.wdpro.magicble.beacon.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/magicble/beacon/model/MbleBeacon;", "", AnalyticsAttribute.UUID_ATTRIBUTE, "", "major", "", "minor", "(Ljava/lang/String;II)V", "getMajor", "()I", "getMinor", "getUuid", "()Ljava/lang/String;", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MbleBeacon {
    private final int major;
    private final int minor;
    private final String uuid;

    public MbleBeacon(String uuid, int i10, int i11) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.major = i10;
        this.minor = i11;
    }

    public static /* synthetic */ MbleBeacon copy$default(MbleBeacon mbleBeacon, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mbleBeacon.uuid;
        }
        if ((i12 & 2) != 0) {
            i10 = mbleBeacon.major;
        }
        if ((i12 & 4) != 0) {
            i11 = mbleBeacon.minor;
        }
        return mbleBeacon.copy(str, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    public final MbleBeacon copy(String uuid, int major, int minor) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new MbleBeacon(uuid, major, minor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MbleBeacon)) {
            return false;
        }
        MbleBeacon mbleBeacon = (MbleBeacon) other;
        return Intrinsics.areEqual(this.uuid, mbleBeacon.uuid) && this.major == mbleBeacon.major && this.minor == mbleBeacon.minor;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((this.uuid.hashCode() * 31) + Integer.hashCode(this.major)) * 31) + Integer.hashCode(this.minor);
    }

    public String toString() {
        return "MbleBeacon(uuid=" + this.uuid + ", major=" + this.major + ", minor=" + this.minor + ")";
    }

    public /* synthetic */ MbleBeacon(String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? -1 : i10, (i12 & 4) != 0 ? -1 : i11);
    }
}