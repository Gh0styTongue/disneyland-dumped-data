package com.disney.wdpro.geofence.handler;

import android.content.Context;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class CascadeGeofenceHandler_Factory implements InterfaceC30583e<CascadeGeofenceHandler> {
    private final Provider<Context> contextProvider;

    public CascadeGeofenceHandler_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static CascadeGeofenceHandler_Factory create(Provider<Context> provider) {
        return new CascadeGeofenceHandler_Factory(provider);
    }

    public static CascadeGeofenceHandler newInstance(Context context) {
        return new CascadeGeofenceHandler(context);
    }

    @Override // javax.inject.Provider
    public CascadeGeofenceHandler get() {
        return newInstance(this.contextProvider.get());
    }
}