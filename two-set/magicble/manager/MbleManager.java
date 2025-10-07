package com.disney.wdpro.magicble.manager;

import com.disney.wdpro.locationservices.location_regions.configuration.LocationRegionsConfiguration;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/magicble/manager/MbleManager;", "", "init", "", "initLocationRegions", "locationRegionConfig", "Lcom/disney/wdpro/locationservices/location_regions/configuration/LocationRegionsConfiguration;", "startLocationTracking", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public interface MbleManager {
    void init();

    void initLocationRegions(LocationRegionsConfiguration locationRegionConfig);

    void startLocationTracking();
}