package com.disney.wdpro.httpclient.authentication;

import com.disney.wdpro.httpclient.HttpApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes23.dex */
public final class AuthenticationApiClient_Factory implements InterfaceC30583e<AuthenticationApiClient> {
    private final Provider<AuthConfig> authConfigProvider;
    private final Provider<HttpApiClient> clientProvider;
    private final Provider<AuthEnvironment> environmentProvider;

    public AuthenticationApiClient_Factory(Provider<HttpApiClient> provider, Provider<AuthEnvironment> provider2, Provider<AuthConfig> provider3) {
        this.clientProvider = provider;
        this.environmentProvider = provider2;
        this.authConfigProvider = provider3;
    }

    public static AuthenticationApiClient_Factory create(Provider<HttpApiClient> provider, Provider<AuthEnvironment> provider2, Provider<AuthConfig> provider3) {
        return new AuthenticationApiClient_Factory(provider, provider2, provider3);
    }

    public static AuthenticationApiClient newInstance(HttpApiClient httpApiClient, AuthEnvironment authEnvironment, AuthConfig authConfig) {
        return new AuthenticationApiClient(httpApiClient, authEnvironment, authConfig);
    }

    @Override // javax.inject.Provider
    public AuthenticationApiClient get() {
        return newInstance(this.clientProvider.get(), this.environmentProvider.get(), this.authConfigProvider.get());
    }
}