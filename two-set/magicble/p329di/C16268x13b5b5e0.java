package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionsAnalyticsProvider;
import com.disney.wdpro.magicble.locationservices.DisneyLocationRegionParkAppAnalytics;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.magicble.di.MbleLocationRegionsModule_ProvideLocationRegionsAnalyticsProvider$magic_ble_lib_releaseFactory */
/* loaded from: classes13.dex */
public final class C16268x13b5b5e0 implements InterfaceC30583e<LocationRegionsAnalyticsProvider> {
    private final Provider<DisneyLocationRegionParkAppAnalytics> analyticsProvider;
    private final MbleLocationRegionsModule module;

    public C16268x13b5b5e0(MbleLocationRegionsModule mbleLocationRegionsModule, Provider<DisneyLocationRegionParkAppAnalytics> provider) {
        this.module = mbleLocationRegionsModule;
        this.analyticsProvider = provider;
    }

    public static C16268x13b5b5e0 create(MbleLocationRegionsModule mbleLocationRegionsModule, Provider<DisneyLocationRegionParkAppAnalytics> provider) {
        return new C16268x13b5b5e0(mbleLocationRegionsModule, provider);
    }

    public static LocationRegionsAnalyticsProvider provideLocationRegionsAnalyticsProvider$magic_ble_lib_release(MbleLocationRegionsModule mbleLocationRegionsModule, DisneyLocationRegionParkAppAnalytics disneyLocationRegionParkAppAnalytics) {
        return (LocationRegionsAnalyticsProvider) C30587i.m94207e(mbleLocationRegionsModule.provideLocationRegionsAnalyticsProvider$magic_ble_lib_release(disneyLocationRegionParkAppAnalytics));
    }

    @Override // javax.inject.Provider
    public LocationRegionsAnalyticsProvider get() {
        return provideLocationRegionsAnalyticsProvider$magic_ble_lib_release(this.module, this.analyticsProvider.get());
    }
}