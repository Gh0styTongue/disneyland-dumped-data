package com.disney.wdpro.magicble.geofence;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleGenericGeofenceHandler_Factory implements InterfaceC30583e<MbleGenericGeofenceHandler> {
    private final Provider<Gson> gsonProvider;
    private final Provider<MbleCoreManager> mbleCoreManagerProvider;
    private final Provider<MbleGeofenceManager> mbleGeofenceManagerProvider;
    private final Provider<MbleLocalStorageManager> mbleLocalStorageManagerProvider;
    private final Provider<MbleSecretConfig> mbleSecretConfigProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleGenericGeofenceHandler_Factory(Provider<MbleCoreManager> provider, Provider<C9248i> provider2, Provider<MbleSecretConfig> provider3, Provider<MbleGeofenceManager> provider4, Provider<Gson> provider5, Provider<C9350r> provider6, Provider<MbleLocalStorageManager> provider7) {
        this.mbleCoreManagerProvider = provider;
        this.vendomaticProvider = provider2;
        this.mbleSecretConfigProvider = provider3;
        this.mbleGeofenceManagerProvider = provider4;
        this.gsonProvider = provider5;
        this.timeProvider = provider6;
        this.mbleLocalStorageManagerProvider = provider7;
    }

    public static MbleGenericGeofenceHandler_Factory create(Provider<MbleCoreManager> provider, Provider<C9248i> provider2, Provider<MbleSecretConfig> provider3, Provider<MbleGeofenceManager> provider4, Provider<Gson> provider5, Provider<C9350r> provider6, Provider<MbleLocalStorageManager> provider7) {
        return new MbleGenericGeofenceHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MbleGenericGeofenceHandler newInstance(MbleCoreManager mbleCoreManager, C9248i c9248i, MbleSecretConfig mbleSecretConfig, MbleGeofenceManager mbleGeofenceManager, Gson gson, C9350r c9350r, MbleLocalStorageManager mbleLocalStorageManager) {
        return new MbleGenericGeofenceHandler(mbleCoreManager, c9248i, mbleSecretConfig, mbleGeofenceManager, gson, c9350r, mbleLocalStorageManager);
    }

    @Override // javax.inject.Provider
    public MbleGenericGeofenceHandler get() {
        return newInstance(this.mbleCoreManagerProvider.get(), this.vendomaticProvider.get(), this.mbleSecretConfigProvider.get(), this.mbleGeofenceManagerProvider.get(), this.gsonProvider.get(), this.timeProvider.get(), this.mbleLocalStorageManagerProvider.get());
    }
}