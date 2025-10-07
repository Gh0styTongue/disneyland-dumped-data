package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class LinkedGuestUtils_Factory implements InterfaceC30583e<LinkedGuestUtils> {
    private final Provider<Context> contextProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public LinkedGuestUtils_Factory(Provider<Context> provider, Provider<C9314j> provider2) {
        this.contextProvider = provider;
        this.parkAppConfigurationProvider = provider2;
    }

    public static LinkedGuestUtils_Factory create(Provider<Context> provider, Provider<C9314j> provider2) {
        return new LinkedGuestUtils_Factory(provider, provider2);
    }

    public static LinkedGuestUtils newInstance(Context context, C9314j c9314j) {
        return new LinkedGuestUtils(context, c9314j);
    }

    @Override // javax.inject.Provider
    public LinkedGuestUtils get() {
        return newInstance(this.contextProvider.get(), this.parkAppConfigurationProvider.get());
    }
}