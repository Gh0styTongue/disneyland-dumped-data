package com.disney.wdpro.magicble.common.vendo;

import com.disney.wdpro.commons.config.C9248i;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleDefaultVendoConfigProvider_Factory implements InterfaceC30583e<MbleDefaultVendoConfigProvider> {
    private final Provider<Gson> gsonProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleDefaultVendoConfigProvider_Factory(Provider<C9248i> provider, Provider<Gson> provider2) {
        this.vendomaticProvider = provider;
        this.gsonProvider = provider2;
    }

    public static MbleDefaultVendoConfigProvider_Factory create(Provider<C9248i> provider, Provider<Gson> provider2) {
        return new MbleDefaultVendoConfigProvider_Factory(provider, provider2);
    }

    public static MbleDefaultVendoConfigProvider newInstance(C9248i c9248i, Gson gson) {
        return new MbleDefaultVendoConfigProvider(c9248i, gson);
    }

    @Override // javax.inject.Provider
    public MbleDefaultVendoConfigProvider get() {
        return newInstance(this.vendomaticProvider.get(), this.gsonProvider.get());
    }
}