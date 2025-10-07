package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.geofence.handler.GeofenceHandler;
import com.disney.wdpro.magicble.geofence.MbleGenericGeofenceHandler;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvideMbleGenericGeofenceHandlerFactory implements InterfaceC30583e<GeofenceHandler> {
    private final Provider<MbleGenericGeofenceHandler> handlerProvider;
    private final MbleModule module;

    public MbleModule_ProvideMbleGenericGeofenceHandlerFactory(MbleModule mbleModule, Provider<MbleGenericGeofenceHandler> provider) {
        this.module = mbleModule;
        this.handlerProvider = provider;
    }

    public static MbleModule_ProvideMbleGenericGeofenceHandlerFactory create(MbleModule mbleModule, Provider<MbleGenericGeofenceHandler> provider) {
        return new MbleModule_ProvideMbleGenericGeofenceHandlerFactory(mbleModule, provider);
    }

    public static GeofenceHandler provideMbleGenericGeofenceHandler(MbleModule mbleModule, MbleGenericGeofenceHandler mbleGenericGeofenceHandler) {
        return (GeofenceHandler) C30587i.m94207e(mbleModule.provideMbleGenericGeofenceHandler(mbleGenericGeofenceHandler));
    }

    @Override // javax.inject.Provider
    public GeofenceHandler get() {
        return provideMbleGenericGeofenceHandler(this.module, this.handlerProvider.get());
    }
}