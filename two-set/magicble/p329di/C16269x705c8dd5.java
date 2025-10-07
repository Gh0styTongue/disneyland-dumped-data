package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionFeatureFlags;
import com.disney.wdpro.magicble.settings.LocationRegionsSecretConfig;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.magicble.di.MbleLocationRegionsModule_ProvideLocationRegionsFeatureFlag$magic_ble_lib_releaseFactory */
/* loaded from: classes13.dex */
public final class C16269x705c8dd5 implements InterfaceC30583e<DisneyLocationRegionFeatureFlags> {
    private final Provider<LocationRegionsSecretConfig> locationRegionsSecretConfigProvider;
    private final MbleLocationRegionsModule module;
    private final Provider<C9248i> vendomaticProvider;

    public C16269x705c8dd5(MbleLocationRegionsModule mbleLocationRegionsModule, Provider<C9248i> provider, Provider<LocationRegionsSecretConfig> provider2) {
        this.module = mbleLocationRegionsModule;
        this.vendomaticProvider = provider;
        this.locationRegionsSecretConfigProvider = provider2;
    }

    public static C16269x705c8dd5 create(MbleLocationRegionsModule mbleLocationRegionsModule, Provider<C9248i> provider, Provider<LocationRegionsSecretConfig> provider2) {
        return new C16269x705c8dd5(mbleLocationRegionsModule, provider, provider2);
    }

    public static DisneyLocationRegionFeatureFlags provideLocationRegionsFeatureFlag$magic_ble_lib_release(MbleLocationRegionsModule mbleLocationRegionsModule, C9248i c9248i, LocationRegionsSecretConfig locationRegionsSecretConfig) {
        return (DisneyLocationRegionFeatureFlags) C30587i.m94207e(mbleLocationRegionsModule.provideLocationRegionsFeatureFlag$magic_ble_lib_release(c9248i, locationRegionsSecretConfig));
    }

    @Override // javax.inject.Provider
    public DisneyLocationRegionFeatureFlags get() {
        return provideLocationRegionsFeatureFlag$magic_ble_lib_release(this.module, this.vendomaticProvider.get(), this.locationRegionsSecretConfigProvider.get());
    }
}