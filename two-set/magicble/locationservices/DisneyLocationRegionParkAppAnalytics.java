package com.disney.wdpro.magicble.locationservices;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionAnalyticConstants;
import com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionsAnalytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/magicble/locationservices/DisneyLocationRegionParkAppAnalytics;", "Lcom/disney/wdpro/locationservices/location_regions/analytics/LocationRegionsAnalytics;", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "<init>", "(Lcom/disney/wdpro/analytics/n;)V", "Lcom/disney/wdpro/locationservices/location_regions/analytics/LocationRegionAnalyticConstants$Values$PermissionStatus;", "permissionStatus", "", "trackLocationServicesStarted", "(Lcom/disney/wdpro/locationservices/location_regions/analytics/LocationRegionAnalyticConstants$Values$PermissionStatus;)V", "Lcom/disney/wdpro/analytics/n;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class DisneyLocationRegionParkAppAnalytics implements LocationRegionsAnalytics {
    private final InterfaceC8682n crashHelper;

    @Inject
    public DisneyLocationRegionParkAppAnalytics(InterfaceC8682n crashHelper) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        this.crashHelper = crashHelper;
    }

    @Override // com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionsAnalytics
    public void trackLocationServicesStarted(LocationRegionAnalyticConstants.Values.PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "permissionStatus");
        this.crashHelper.recordCustomEvent(LocationRegionAnalyticConstants.INSTANCE.getEVENT_TYPE(), LocationRegionAnalyticConstants.Events.INSTANCE.getLOCATION_SERVICES_STARTED(), MapsKt.mutableMapOf(TuplesKt.m92045to(LocationRegionAnalyticConstants.Attributes.INSTANCE.getLOCATION_PERMISSION_STATUS(), permissionStatus)));
    }
}