package com.disney.wdpro.virtualqueue.service;

import android.content.SharedPreferences;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.model.VirtualQueueEnvironment;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class VirtualQueueServiceApiImpl_Factory implements InterfaceC30583e<VirtualQueueServiceApiImpl> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<VirtualQueueEnvironment> environmentProvider;
    private final Provider<C13345q> oAuthApiClientProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<VirtualQueueRegions> vqRegionsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public VirtualQueueServiceApiImpl_Factory(Provider<C13345q> provider, Provider<VirtualQueueEnvironment> provider2, Provider<SharedPreferences> provider3, Provider<VirtualQueueRegions> provider4, Provider<C9314j> provider5, Provider<VirtualQueueThemer> provider6, Provider<AuthenticationManager> provider7) {
        this.oAuthApiClientProvider = provider;
        this.environmentProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.vqRegionsProvider = provider4;
        this.parkAppConfigurationProvider = provider5;
        this.vqThemerProvider = provider6;
        this.authenticationManagerProvider = provider7;
    }

    public static VirtualQueueServiceApiImpl_Factory create(Provider<C13345q> provider, Provider<VirtualQueueEnvironment> provider2, Provider<SharedPreferences> provider3, Provider<VirtualQueueRegions> provider4, Provider<C9314j> provider5, Provider<VirtualQueueThemer> provider6, Provider<AuthenticationManager> provider7) {
        return new VirtualQueueServiceApiImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static VirtualQueueServiceApiImpl newInstance(C13345q c13345q, VirtualQueueEnvironment virtualQueueEnvironment, SharedPreferences sharedPreferences, VirtualQueueRegions virtualQueueRegions, C9314j c9314j, VirtualQueueThemer virtualQueueThemer, AuthenticationManager authenticationManager) {
        return new VirtualQueueServiceApiImpl(c13345q, virtualQueueEnvironment, sharedPreferences, virtualQueueRegions, c9314j, virtualQueueThemer, authenticationManager);
    }

    @Override // javax.inject.Provider
    public VirtualQueueServiceApiImpl get() {
        return newInstance(this.oAuthApiClientProvider.get(), this.environmentProvider.get(), this.sharedPreferencesProvider.get(), this.vqRegionsProvider.get(), this.parkAppConfigurationProvider.get(), this.vqThemerProvider.get(), this.authenticationManagerProvider.get());
    }
}