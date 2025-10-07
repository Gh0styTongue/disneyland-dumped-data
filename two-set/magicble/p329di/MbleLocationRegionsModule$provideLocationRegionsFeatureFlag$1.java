package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionFeatureFlags;
import com.disney.wdpro.magicble.settings.LocationRegionsSecretConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m92038d2 = {"com/disney/wdpro/magicble/di/MbleLocationRegionsModule$provideLocationRegionsFeatureFlag$1", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionFeatureFlags;", "isEnabled", "", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleLocationRegionsModule$provideLocationRegionsFeatureFlag$1 implements DisneyLocationRegionFeatureFlags {
    final /* synthetic */ LocationRegionsSecretConfig $locationRegionsSecretConfig;

    MbleLocationRegionsModule$provideLocationRegionsFeatureFlag$1(LocationRegionsSecretConfig locationRegionsSecretConfig) {
        locationRegionsSecretConfig = locationRegionsSecretConfig;
    }

    @Override // com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionFeatureFlags
    public boolean isEnabled() {
        return MbleUtils.INSTANCE.isLocationServicesEnabled(vendomatic, locationRegionsSecretConfig);
    }
}