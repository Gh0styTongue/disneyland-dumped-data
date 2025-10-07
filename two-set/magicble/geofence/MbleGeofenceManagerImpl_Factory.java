package com.disney.wdpro.magicble.geofence;

import android.content.Context;
import com.disney.wdpro.commons.config.C9248i;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleGeofenceManagerImpl_Factory implements InterfaceC30583e<MbleGeofenceManagerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleGeofenceManagerImpl_Factory(Provider<Context> provider, Provider<C9248i> provider2, Provider<Gson> provider3) {
        this.contextProvider = provider;
        this.vendomaticProvider = provider2;
        this.gsonProvider = provider3;
    }

    public static MbleGeofenceManagerImpl_Factory create(Provider<Context> provider, Provider<C9248i> provider2, Provider<Gson> provider3) {
        return new MbleGeofenceManagerImpl_Factory(provider, provider2, provider3);
    }

    public static MbleGeofenceManagerImpl newInstance(Context context, C9248i c9248i, Gson gson) {
        return new MbleGeofenceManagerImpl(context, c9248i, gson);
    }

    @Override // javax.inject.Provider
    public MbleGeofenceManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.vendomaticProvider.get(), this.gsonProvider.get());
    }
}