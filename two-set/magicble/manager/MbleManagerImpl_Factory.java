package com.disney.wdpro.magicble.manager;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.magicble.beacon.MbleBeaconManager;
import com.disney.wdpro.magicble.geofence.MbleGeofenceManager;
import com.disney.wdpro.magicble.settings.LocationRegionsSecretConfig;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.magicble.utils.analytics.MbleAnalyticsHelper;
import com.disney.wdpro.magicble.utils.analytics.MbleCrashHelper;
import com.disney.wdpro.magicble.utils.analytics.MbleEventHelper;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.google.gson.Gson;
import com.squareup.otto.StickyEventBus;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleManagerImpl_Factory implements InterfaceC30583e<MbleManagerImpl> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DisneyLocationRegionsMonitor> disneyLocationMonitorProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<LocationRegionsSecretConfig> locationRegionsSecretConfigProvider;
    private final Provider<MbleAnalyticsHelper> mbleAnalyticsHelperProvider;
    private final Provider<MbleBeaconManager> mbleBeaconManagerProvider;
    private final Provider<MbleCoreManager> mbleCoreManagerProvider;
    private final Provider<MbleCrashHelper> mbleCrashHelperProvider;
    private final Provider<MbleEventHelper> mbleEventHelperProvider;
    private final Provider<MbleGeofenceManager> mbleGeofenceManagerProvider;
    private final Provider<MbleLocalStorageManager> mbleLocalStorageManagerProvider;
    private final Provider<MbleSecretConfig> mbleSecretConfigProvider;
    private final Provider<StickyEventBus> stickyEventBusProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleManagerImpl_Factory(Provider<Context> provider, Provider<StickyEventBus> provider2, Provider<AuthenticationManager> provider3, Provider<MbleBeaconManager> provider4, Provider<MbleGeofenceManager> provider5, Provider<MbleCoreManager> provider6, Provider<MbleEventHelper> provider7, Provider<MbleCrashHelper> provider8, Provider<MbleAnalyticsHelper> provider9, Provider<C9248i> provider10, Provider<Gson> provider11, Provider<MbleSecretConfig> provider12, Provider<LocationRegionsSecretConfig> provider13, Provider<MbleLocalStorageManager> provider14, Provider<C9350r> provider15, Provider<DisneyLocationRegionsMonitor> provider16) {
        this.contextProvider = provider;
        this.stickyEventBusProvider = provider2;
        this.authenticationManagerProvider = provider3;
        this.mbleBeaconManagerProvider = provider4;
        this.mbleGeofenceManagerProvider = provider5;
        this.mbleCoreManagerProvider = provider6;
        this.mbleEventHelperProvider = provider7;
        this.mbleCrashHelperProvider = provider8;
        this.mbleAnalyticsHelperProvider = provider9;
        this.vendomaticProvider = provider10;
        this.gsonProvider = provider11;
        this.mbleSecretConfigProvider = provider12;
        this.locationRegionsSecretConfigProvider = provider13;
        this.mbleLocalStorageManagerProvider = provider14;
        this.timeProvider = provider15;
        this.disneyLocationMonitorProvider = provider16;
    }

    public static MbleManagerImpl_Factory create(Provider<Context> provider, Provider<StickyEventBus> provider2, Provider<AuthenticationManager> provider3, Provider<MbleBeaconManager> provider4, Provider<MbleGeofenceManager> provider5, Provider<MbleCoreManager> provider6, Provider<MbleEventHelper> provider7, Provider<MbleCrashHelper> provider8, Provider<MbleAnalyticsHelper> provider9, Provider<C9248i> provider10, Provider<Gson> provider11, Provider<MbleSecretConfig> provider12, Provider<LocationRegionsSecretConfig> provider13, Provider<MbleLocalStorageManager> provider14, Provider<C9350r> provider15, Provider<DisneyLocationRegionsMonitor> provider16) {
        return new MbleManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static MbleManagerImpl newInstance(Context context, StickyEventBus stickyEventBus, AuthenticationManager authenticationManager, MbleBeaconManager mbleBeaconManager, MbleGeofenceManager mbleGeofenceManager, MbleCoreManager mbleCoreManager, MbleEventHelper mbleEventHelper, MbleCrashHelper mbleCrashHelper, MbleAnalyticsHelper mbleAnalyticsHelper, C9248i c9248i, Gson gson, MbleSecretConfig mbleSecretConfig, LocationRegionsSecretConfig locationRegionsSecretConfig, MbleLocalStorageManager mbleLocalStorageManager, C9350r c9350r, DisneyLocationRegionsMonitor disneyLocationRegionsMonitor) {
        return new MbleManagerImpl(context, stickyEventBus, authenticationManager, mbleBeaconManager, mbleGeofenceManager, mbleCoreManager, mbleEventHelper, mbleCrashHelper, mbleAnalyticsHelper, c9248i, gson, mbleSecretConfig, locationRegionsSecretConfig, mbleLocalStorageManager, c9350r, disneyLocationRegionsMonitor);
    }

    @Override // javax.inject.Provider
    public MbleManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.stickyEventBusProvider.get(), this.authenticationManagerProvider.get(), this.mbleBeaconManagerProvider.get(), this.mbleGeofenceManagerProvider.get(), this.mbleCoreManagerProvider.get(), this.mbleEventHelperProvider.get(), this.mbleCrashHelperProvider.get(), this.mbleAnalyticsHelperProvider.get(), this.vendomaticProvider.get(), this.gsonProvider.get(), this.mbleSecretConfigProvider.get(), this.locationRegionsSecretConfigProvider.get(), this.mbleLocalStorageManagerProvider.get(), this.timeProvider.get(), this.disneyLocationMonitorProvider.get());
    }
}