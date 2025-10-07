package com.disney.wdpro.universal_checkout_ui.p459ui.managers;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.service.business.UserApiClient;
import com.disney.wdpro.service.business.itinerary.ItineraryApiClient;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class UniversalCheckoutDataManagerImpl_Factory implements InterfaceC30583e<UniversalCheckoutDataManagerImpl> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<InterfaceC8682n> crashHelperProvider;
    private final Provider<UniversalCheckoutEnvironment> environmentProvider;
    private final Provider<ItineraryApiClient> itineraryApiClientProvider;
    private final Provider<ProfileManager> profileManagerProvider;
    private final Provider<UserApiClient> userApiClientProvider;

    public UniversalCheckoutDataManagerImpl_Factory(Provider<ItineraryApiClient> provider, Provider<UserApiClient> provider2, Provider<ProfileManager> provider3, Provider<AuthenticationManager> provider4, Provider<UniversalCheckoutEnvironment> provider5, Provider<InterfaceC8682n> provider6) {
        this.itineraryApiClientProvider = provider;
        this.userApiClientProvider = provider2;
        this.profileManagerProvider = provider3;
        this.authenticationManagerProvider = provider4;
        this.environmentProvider = provider5;
        this.crashHelperProvider = provider6;
    }

    public static UniversalCheckoutDataManagerImpl_Factory create(Provider<ItineraryApiClient> provider, Provider<UserApiClient> provider2, Provider<ProfileManager> provider3, Provider<AuthenticationManager> provider4, Provider<UniversalCheckoutEnvironment> provider5, Provider<InterfaceC8682n> provider6) {
        return new UniversalCheckoutDataManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static UniversalCheckoutDataManagerImpl newInstance(ItineraryApiClient itineraryApiClient, UserApiClient userApiClient, ProfileManager profileManager, AuthenticationManager authenticationManager, UniversalCheckoutEnvironment universalCheckoutEnvironment, InterfaceC8682n interfaceC8682n) {
        return new UniversalCheckoutDataManagerImpl(itineraryApiClient, userApiClient, profileManager, authenticationManager, universalCheckoutEnvironment, interfaceC8682n);
    }

    @Override // javax.inject.Provider
    public UniversalCheckoutDataManagerImpl get() {
        return newInstance(this.itineraryApiClientProvider.get(), this.userApiClientProvider.get(), this.profileManagerProvider.get(), this.authenticationManagerProvider.get(), this.environmentProvider.get(), this.crashHelperProvider.get());
    }
}