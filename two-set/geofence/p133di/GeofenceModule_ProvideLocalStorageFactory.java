package com.disney.wdpro.geofence.p133di;

import android.content.Context;
import com.disney.wdpro.geofence.storage.Storage;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceModule_ProvideLocalStorageFactory implements InterfaceC30583e<Storage> {
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final GeofenceModule module;

    public GeofenceModule_ProvideLocalStorageFactory(GeofenceModule geofenceModule, Provider<Context> provider, Provider<Gson> provider2) {
        this.module = geofenceModule;
        this.contextProvider = provider;
        this.gsonProvider = provider2;
    }

    public static GeofenceModule_ProvideLocalStorageFactory create(GeofenceModule geofenceModule, Provider<Context> provider, Provider<Gson> provider2) {
        return new GeofenceModule_ProvideLocalStorageFactory(geofenceModule, provider, provider2);
    }

    public static Storage provideLocalStorage(GeofenceModule geofenceModule, Context context, Gson gson) {
        return (Storage) C30587i.m94207e(geofenceModule.provideLocalStorage(context, gson));
    }

    @Override // javax.inject.Provider
    public Storage get() {
        return provideLocalStorage(this.module, this.contextProvider.get(), this.gsonProvider.get());
    }
}