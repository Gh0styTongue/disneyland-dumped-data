package com.disney.wdpro.geofence.util.analytics;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.config.C9248i;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceCrashHelper_Factory implements InterfaceC30583e<GeofenceCrashHelper> {
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<C9248i> vendomaticProvider;

    public GeofenceCrashHelper_Factory(Provider<InterfaceC8682n> provider, Provider<C9248i> provider2) {
        this.crashHelperProvider = provider;
        this.vendomaticProvider = provider2;
    }

    public static GeofenceCrashHelper_Factory create(Provider<InterfaceC8682n> provider, Provider<C9248i> provider2) {
        return new GeofenceCrashHelper_Factory(provider, provider2);
    }

    public static GeofenceCrashHelper newInstance(InterfaceC8682n interfaceC8682n, C9248i c9248i) {
        return new GeofenceCrashHelper(interfaceC8682n, c9248i);
    }

    @Override // javax.inject.Provider
    public GeofenceCrashHelper get() {
        return newInstance(this.crashHelperProvider.get(), this.vendomaticProvider.get());
    }
}