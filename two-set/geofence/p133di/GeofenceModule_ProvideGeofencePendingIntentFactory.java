package com.disney.wdpro.geofence.p133di;

import android.app.PendingIntent;
import android.content.Context;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGeofencePendingIntentFactory implements InterfaceC30583e<PendingIntent> {
    private final Provider<Context> contextProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideGeofencePendingIntentFactory(GeofenceModule geofenceModule, Provider<Context> provider) {
        this.module = geofenceModule;
        this.contextProvider = provider;
    }

    public static GeofenceModule_ProvideGeofencePendingIntentFactory create(GeofenceModule geofenceModule, Provider<Context> provider) {
        return new GeofenceModule_ProvideGeofencePendingIntentFactory(geofenceModule, provider);
    }

    public static PendingIntent provideGeofencePendingIntent(GeofenceModule geofenceModule, Context context) {
        return (PendingIntent) C30587i.m94207e(geofenceModule.provideGeofencePendingIntent(context));
    }

    @Override // javax.inject.Provider
    public PendingIntent get() {
        return provideGeofencePendingIntent(this.module, this.contextProvider.get());
    }
}