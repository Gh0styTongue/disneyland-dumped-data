package com.disney.wdpro.virtualqueue.regions;

import android.content.Context;
import android.location.LocationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueRegions_Factory implements InterfaceC30583e<VirtualQueueRegions> {
    private final Provider<Context> contextProvider;
    private final Provider<DisneyLocationRegionsMonitor> disneyLocationMonitorProvider;
    private final Provider<LocationManager> locationManagerProvider;

    public VirtualQueueRegions_Factory(Provider<DisneyLocationRegionsMonitor> provider, Provider<Context> provider2, Provider<LocationManager> provider3) {
        this.disneyLocationMonitorProvider = provider;
        this.contextProvider = provider2;
        this.locationManagerProvider = provider3;
    }

    public static VirtualQueueRegions_Factory create(Provider<DisneyLocationRegionsMonitor> provider, Provider<Context> provider2, Provider<LocationManager> provider3) {
        return new VirtualQueueRegions_Factory(provider, provider2, provider3);
    }

    public static VirtualQueueRegions newInstance(DisneyLocationRegionsMonitor disneyLocationRegionsMonitor, Context context, LocationManager locationManager) {
        return new VirtualQueueRegions(disneyLocationRegionsMonitor, context, locationManager);
    }

    @Override // javax.inject.Provider
    public VirtualQueueRegions get() {
        return newInstance(this.disneyLocationMonitorProvider.get(), this.contextProvider.get(), this.locationManagerProvider.get());
    }
}