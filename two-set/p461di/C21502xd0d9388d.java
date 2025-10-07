package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import android.location.LocationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQCommonModules_ProvideVirtualQueueRegions$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21502xd0d9388d implements InterfaceC30583e<VirtualQueueRegions> {
    private final Provider<Context> contextProvider;
    private final Provider<DisneyLocationRegionsMonitor> disneyLocationMonitorProvider;
    private final Provider<LocationManager> locationManagerProvider;
    private final VQCommonModules module;

    public C21502xd0d9388d(VQCommonModules vQCommonModules, Provider<DisneyLocationRegionsMonitor> provider, Provider<Context> provider2, Provider<LocationManager> provider3) {
        this.module = vQCommonModules;
        this.disneyLocationMonitorProvider = provider;
        this.contextProvider = provider2;
        this.locationManagerProvider = provider3;
    }

    public static C21502xd0d9388d create(VQCommonModules vQCommonModules, Provider<DisneyLocationRegionsMonitor> provider, Provider<Context> provider2, Provider<LocationManager> provider3) {
        return new C21502xd0d9388d(vQCommonModules, provider, provider2, provider3);
    }

    public static VirtualQueueRegions provideVirtualQueueRegions$virtual_queue_lib_release(VQCommonModules vQCommonModules, DisneyLocationRegionsMonitor disneyLocationRegionsMonitor, Context context, LocationManager locationManager) {
        return (VirtualQueueRegions) C30587i.m94207e(vQCommonModules.provideVirtualQueueRegions$virtual_queue_lib_release(disneyLocationRegionsMonitor, context, locationManager));
    }

    @Override // javax.inject.Provider
    public VirtualQueueRegions get() {
        return provideVirtualQueueRegions$virtual_queue_lib_release(this.module, this.disneyLocationMonitorProvider.get(), this.contextProvider.get(), this.locationManagerProvider.get());
    }
}