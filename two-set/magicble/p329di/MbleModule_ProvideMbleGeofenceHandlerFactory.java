package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.magicble.geofence.MbleGeofenceHandler;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvideMbleGeofenceHandlerFactory implements InterfaceC30583e<GeofenceHandler> {
    private final Provider<MbleGeofenceHandler> handlerProvider;
    private final MbleModule module;

    public MbleModule_ProvideMbleGeofenceHandlerFactory(MbleModule mbleModule, Provider<MbleGeofenceHandler> provider) {
        this.module = mbleModule;
        this.handlerProvider = provider;
    }

    public static MbleModule_ProvideMbleGeofenceHandlerFactory create(MbleModule mbleModule, Provider<MbleGeofenceHandler> provider) {
        return new MbleModule_ProvideMbleGeofenceHandlerFactory(mbleModule, provider);
    }

    public static GeofenceHandler provideMbleGeofenceHandler(MbleModule mbleModule, MbleGeofenceHandler mbleGeofenceHandler) {
        return (GeofenceHandler) C30587i.m94207e(mbleModule.provideMbleGeofenceHandler(mbleGeofenceHandler));
    }

    @Override // javax.inject.Provider
    public GeofenceHandler get() {
        return provideMbleGeofenceHandler(this.module, this.handlerProvider.get());
    }
}