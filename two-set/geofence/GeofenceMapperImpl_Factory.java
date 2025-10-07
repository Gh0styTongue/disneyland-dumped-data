package com.disney.wdpro.geofence;

import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class GeofenceMapperImpl_Factory implements InterfaceC30583e<GeofenceMapperImpl> {

    private static final class InstanceHolder {
        private static final GeofenceMapperImpl_Factory INSTANCE = new GeofenceMapperImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static GeofenceMapperImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GeofenceMapperImpl newInstance() {
        return new GeofenceMapperImpl();
    }

    @Override // javax.inject.Provider
    public GeofenceMapperImpl get() {
        return newInstance();
    }
}