package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.friendsservices.FriendEnvironment;
import com.disney.wdpro.friendsservices.XIdProvider;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.authentication.AuthEnvironment;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes28.dex */
public final class FriendApiClientImpl_Factory implements InterfaceC30583e<FriendApiClientImpl> {
    private final Provider<AuthEnvironment> authEnvProvider;
    private final Provider<AuthenticationManager> authManagerProvider;
    private final Provider<AvatarApiClient> avatarApiClientProvider;
    private final Provider<C13345q> clientProvider;
    private final Provider<FriendEnvironment> friendEnvProvider;
    private final Provider<C9350r> timeProvider;
    private final Provider<XIdProvider> xidProvider;

    public FriendApiClientImpl_Factory(Provider<AuthenticationManager> provider, Provider<C13345q> provider2, Provider<XIdProvider> provider3, Provider<AuthEnvironment> provider4, Provider<FriendEnvironment> provider5, Provider<AvatarApiClient> provider6, Provider<C9350r> provider7) {
        this.authManagerProvider = provider;
        this.clientProvider = provider2;
        this.xidProvider = provider3;
        this.authEnvProvider = provider4;
        this.friendEnvProvider = provider5;
        this.avatarApiClientProvider = provider6;
        this.timeProvider = provider7;
    }

    public static FriendApiClientImpl_Factory create(Provider<AuthenticationManager> provider, Provider<C13345q> provider2, Provider<XIdProvider> provider3, Provider<AuthEnvironment> provider4, Provider<FriendEnvironment> provider5, Provider<AvatarApiClient> provider6, Provider<C9350r> provider7) {
        return new FriendApiClientImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static FriendApiClientImpl newInstance(AuthenticationManager authenticationManager, C13345q c13345q, XIdProvider xIdProvider, AuthEnvironment authEnvironment, FriendEnvironment friendEnvironment, AvatarApiClient avatarApiClient, C9350r c9350r) {
        return new FriendApiClientImpl(authenticationManager, c13345q, xIdProvider, authEnvironment, friendEnvironment, avatarApiClient, c9350r);
    }

    @Override // javax.inject.Provider
    public FriendApiClientImpl get() {
        return newInstance(this.authManagerProvider.get(), this.clientProvider.get(), this.xidProvider.get(), this.authEnvProvider.get(), this.friendEnvProvider.get(), this.avatarApiClientProvider.get(), this.timeProvider.get());
    }
}