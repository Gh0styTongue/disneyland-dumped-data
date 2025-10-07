package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.service.business.UserApiClient;
import javax.inject.Provider;
import mx.InterfaceC30583e;
import p1034wa.C32862a;

/* loaded from: classes28.dex */
public final class AvatarApiClientImpl_Factory implements InterfaceC30583e<AvatarApiClientImpl> {
    private final Provider<C32862a> avatarDAOProvider;
    private final Provider<UserApiClient> userApiClientProvider;

    public AvatarApiClientImpl_Factory(Provider<C32862a> provider, Provider<UserApiClient> provider2) {
        this.avatarDAOProvider = provider;
        this.userApiClientProvider = provider2;
    }

    public static AvatarApiClientImpl_Factory create(Provider<C32862a> provider, Provider<UserApiClient> provider2) {
        return new AvatarApiClientImpl_Factory(provider, provider2);
    }

    public static AvatarApiClientImpl newInstance(C32862a c32862a, UserApiClient userApiClient) {
        return new AvatarApiClientImpl(c32862a, userApiClient);
    }

    @Override // javax.inject.Provider
    public AvatarApiClientImpl get() {
        return newInstance(this.avatarDAOProvider.get(), this.userApiClientProvider.get());
    }
}