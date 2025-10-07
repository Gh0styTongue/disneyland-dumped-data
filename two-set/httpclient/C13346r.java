package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.authentication.AuthConfig;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.httpclient.r */
/* loaded from: classes23.dex */
public final class C13346r implements InterfaceC30583e<C13345q> {
    private final Provider<AuthConfig> authConfigProvider;
    private final Provider<AuthenticationManager> authManagerProvider;
    private final Provider<HttpApiClient> httpClientApiProvider;

    public C13346r(Provider<AuthenticationManager> provider, Provider<HttpApiClient> provider2, Provider<AuthConfig> provider3) {
        this.authManagerProvider = provider;
        this.httpClientApiProvider = provider2;
        this.authConfigProvider = provider3;
    }

    /* renamed from: a */
    public static C13346r m55676a(Provider<AuthenticationManager> provider, Provider<HttpApiClient> provider2, Provider<AuthConfig> provider3) {
        return new C13346r(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C13345q m55677c(AuthenticationManager authenticationManager, HttpApiClient httpApiClient, AuthConfig authConfig) {
        return new C13345q(authenticationManager, httpApiClient, authConfig);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13345q get() {
        return m55677c(this.authManagerProvider.get(), this.httpClientApiProvider.get(), this.authConfigProvider.get());
    }
}