package com.disney.wdpro.geofence.p133di;

import android.content.Context;
import com.google.android.gms.location.GeofencingClient;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGeofencingClientFactory implements InterfaceC30583e<GeofencingClient> {
    private final Provider<Context> contextProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideGeofencingClientFactory(GeofenceModule geofenceModule, Provider<Context> provider) {
        this.module = geofenceModule;
        this.contextProvider = provider;
    }

    public static GeofenceModule_ProvideGeofencingClientFactory create(GeofenceModule geofenceModule, Provider<Context> provider) {
        return new GeofenceModule_ProvideGeofencingClientFactory(geofenceModule, provider);
    }

    public static GeofencingClient provideGeofencingClient(GeofenceModule geofenceModule, Context context) {
        return (GeofencingClient) C30587i.m94207e(geofenceModule.provideGeofencingClient(context));
    }

    @Override // javax.inject.Provider
    public GeofencingClient get() {
        return provideGeofencingClient(this.module, this.contextProvider.get());
    }
}