package com.disney.wdpro.geofence.location;

import android.app.PendingIntent;
import android.content.Context;
import com.disney.wdpro.geofence.util.analytics.GeofenceCrashHelper;
import com.google.android.gms.location.GeofencingClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class LocationServiceWrapperImpl_Factory implements InterfaceC30583e<LocationServiceWrapperImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<GeofenceCrashHelper> geofenceCrashHelperProvider;
    private final Provider<GeofencingClient> geofencingClientProvider;
    private final Provider<PendingIntent> pendingIntentProvider;

    public LocationServiceWrapperImpl_Factory(Provider<Context> provider, Provider<GeofencingClient> provider2, Provider<PendingIntent> provider3, Provider<GeofenceCrashHelper> provider4) {
        this.contextProvider = provider;
        this.geofencingClientProvider = provider2;
        this.pendingIntentProvider = provider3;
        this.geofenceCrashHelperProvider = provider4;
    }

    public static LocationServiceWrapperImpl_Factory create(Provider<Context> provider, Provider<GeofencingClient> provider2, Provider<PendingIntent> provider3, Provider<GeofenceCrashHelper> provider4) {
        return new LocationServiceWrapperImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static LocationServiceWrapperImpl newInstance(Context context, GeofencingClient geofencingClient, PendingIntent pendingIntent, GeofenceCrashHelper geofenceCrashHelper) {
        return new LocationServiceWrapperImpl(context, geofencingClient, pendingIntent, geofenceCrashHelper);
    }

    @Override // javax.inject.Provider
    public LocationServiceWrapperImpl get() {
        return newInstance(this.contextProvider.get(), this.geofencingClientProvider.get(), this.pendingIntentProvider.get(), this.geofenceCrashHelperProvider.get());
    }
}