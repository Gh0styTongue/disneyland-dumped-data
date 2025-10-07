package com.disney.wdpro.magicble.manager;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleLocalStorageManagerImpl_Factory implements InterfaceC30583e<MbleLocalStorageManagerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<C9350r> timeProvider;

    public MbleLocalStorageManagerImpl_Factory(Provider<Context> provider, Provider<C9350r> provider2) {
        this.contextProvider = provider;
        this.timeProvider = provider2;
    }

    public static MbleLocalStorageManagerImpl_Factory create(Provider<Context> provider, Provider<C9350r> provider2) {
        return new MbleLocalStorageManagerImpl_Factory(provider, provider2);
    }

    public static MbleLocalStorageManagerImpl newInstance(Context context, C9350r c9350r) {
        return new MbleLocalStorageManagerImpl(context, c9350r);
    }

    @Override // javax.inject.Provider
    public MbleLocalStorageManagerImpl get() {
        return newInstance(this.contextProvider.get(), this.timeProvider.get());
    }
}