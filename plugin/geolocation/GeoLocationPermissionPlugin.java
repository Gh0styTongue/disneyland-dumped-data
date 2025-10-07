package com.wdpr.p479ee.p480ra.rahybrid.plugin.geolocation;

import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;

/* loaded from: classes21.dex */
public class GeoLocationPermissionPlugin extends Plugin {

    /* renamed from: ID */
    public static final String f71776ID = "GeoLocationPermissionPlugin";
    private GeoLocationPermissionPluginListener geoLocationPermissionPluginListener;

    public GeoLocationPermissionPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }

    public GeoLocationPermissionPluginListener getGeoLocationPermissionPluginListener() {
        return this.geoLocationPermissionPluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71776ID;
    }

    public void setGeoLocationPermissionPluginListener(GeoLocationPermissionPluginListener geoLocationPermissionPluginListener) {
        this.geoLocationPermissionPluginListener = geoLocationPermissionPluginListener;
    }
}