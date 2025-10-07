package com.disney.wdpro.geofence.p133di;

import com.google.gson.Gson;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideGsonLocalStorageFactory implements InterfaceC30583e<Gson> {
    private final GeofenceModule module;

    public GeofenceModule_ProvideGsonLocalStorageFactory(GeofenceModule geofenceModule) {
        this.module = geofenceModule;
    }

    public static GeofenceModule_ProvideGsonLocalStorageFactory create(GeofenceModule geofenceModule) {
        return new GeofenceModule_ProvideGsonLocalStorageFactory(geofenceModule);
    }

    public static Gson provideGsonLocalStorage(GeofenceModule geofenceModule) {
        return (Gson) C30587i.m94207e(geofenceModule.provideGsonLocalStorage());
    }

    @Override // javax.inject.Provider
    public Gson get() {
        return provideGsonLocalStorage(this.module);
    }
}