package com.disney.wdpro.magicble.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/magicble/common/MbleGeofence;", "", "regionId", "", "lat", "", "lon", "radius", "", "(Ljava/lang/String;DDJ)V", "getLat", "()D", "getLon", "getRadius", "()J", "getRegionId", "()Ljava/lang/String;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleGeofence {
    private final double lat;
    private final double lon;
    private final long radius;
    private final String regionId;

    public MbleGeofence(String regionId, double d10, double d11, long j10) {
        Intrinsics.checkNotNullParameter(regionId, "regionId");
        this.regionId = regionId;
        this.lat = d10;
        this.lon = d11;
        this.radius = j10;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final long getRadius() {
        return this.radius;
    }

    public final String getRegionId() {
        return this.regionId;
    }
}