package com.disney.wdpro.httpclient.authentication;

import android.content.Context;
import com.disney.wdpro.httpclient.C13322a;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes23.dex */
public final class DisneyAccountManager_Factory implements InterfaceC30583e<DisneyAccountManager> {
    private final Provider<AuthConfig> authConfigProvider;
    private final Provider<AuthenticatorListener> authListenerProvider;
    private final Provider<C13322a> authenticationAnalyticsHelperProvider;
    private final Provider<Context> contextProvider;
    private final Provider<UserDataStorage> userDataStorageProvider;

    public DisneyAccountManager_Factory(Provider<Context> provider, Provider<AuthConfig> provider2, Provider<AuthenticatorListener> provider3, Provider<C13322a> provider4, Provider<UserDataStorage> provider5) {
        this.contextProvider = provider;
        this.authConfigProvider = provider2;
        this.authListenerProvider = provider3;
        this.authenticationAnalyticsHelperProvider = provider4;
        this.userDataStorageProvider = provider5;
    }

    public static DisneyAccountManager_Factory create(Provider<Context> provider, Provider<AuthConfig> provider2, Provider<AuthenticatorListener> provider3, Provider<C13322a> provider4, Provider<UserDataStorage> provider5) {
        return new DisneyAccountManager_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DisneyAccountManager newInstance(Context context, AuthConfig authConfig, AuthenticatorListener authenticatorListener, C13322a c13322a, UserDataStorage userDataStorage) {
        return new DisneyAccountManager(context, authConfig, authenticatorListener, c13322a, userDataStorage);
    }

    @Override // javax.inject.Provider
    public DisneyAccountManager get() {
        return newInstance(this.contextProvider.get(), this.authConfigProvider.get(), this.authListenerProvider.get(), this.authenticationAnalyticsHelperProvider.get(), this.userDataStorageProvider.get());
    }
}