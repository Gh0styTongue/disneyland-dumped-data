package com.disney.wdpro.magicble.geofence;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.magicble.settings.MbleSecretConfig;
import com.disney.wdpro.mblecore.manager.MbleCoreManager;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleGeofenceHandler_Factory implements InterfaceC30583e<MbleGeofenceHandler> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<MbleCoreManager> mbleCoreManagerProvider;
    private final Provider<MbleLocalStorageManager> mbleLocalStorageManagerProvider;
    private final Provider<MbleSecretConfig> mbleSecretConfigProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleGeofenceHandler_Factory(Provider<C9248i> provider, Provider<Context> provider2, Provider<MbleSecretConfig> provider3, Provider<MbleCoreManager> provider4, Provider<Gson> provider5, Provider<C9350r> provider6, Provider<AuthenticationManager> provider7, Provider<MbleLocalStorageManager> provider8) {
        this.vendomaticProvider = provider;
        this.contextProvider = provider2;
        this.mbleSecretConfigProvider = provider3;
        this.mbleCoreManagerProvider = provider4;
        this.gsonProvider = provider5;
        this.timeProvider = provider6;
        this.authenticationManagerProvider = provider7;
        this.mbleLocalStorageManagerProvider = provider8;
    }

    public static MbleGeofenceHandler_Factory create(Provider<C9248i> provider, Provider<Context> provider2, Provider<MbleSecretConfig> provider3, Provider<MbleCoreManager> provider4, Provider<Gson> provider5, Provider<C9350r> provider6, Provider<AuthenticationManager> provider7, Provider<MbleLocalStorageManager> provider8) {
        return new MbleGeofenceHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static MbleGeofenceHandler newInstance(C9248i c9248i, Context context, MbleSecretConfig mbleSecretConfig, MbleCoreManager mbleCoreManager, Gson gson, C9350r c9350r, AuthenticationManager authenticationManager, MbleLocalStorageManager mbleLocalStorageManager) {
        return new MbleGeofenceHandler(c9248i, context, mbleSecretConfig, mbleCoreManager, gson, c9350r, authenticationManager, mbleLocalStorageManager);
    }

    @Override // javax.inject.Provider
    public MbleGeofenceHandler get() {
        return newInstance(this.vendomaticProvider.get(), this.contextProvider.get(), this.mbleSecretConfigProvider.get(), this.mbleCoreManagerProvider.get(), this.gsonProvider.get(), this.timeProvider.get(), this.authenticationManagerProvider.get(), this.mbleLocalStorageManagerProvider.get());
    }
}