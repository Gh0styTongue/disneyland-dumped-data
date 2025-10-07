package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.magicble.common.vendo.MbleVendoConfigProvider;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvideMbleVendoConfigProviderFactory implements InterfaceC30583e<MbleVendoConfigProvider> {
    private final Provider<Gson> gsonProvider;
    private final MbleModule module;
    private final Provider<C9248i> vendomaticProvider;

    public MbleModule_ProvideMbleVendoConfigProviderFactory(MbleModule mbleModule, Provider<C9248i> provider, Provider<Gson> provider2) {
        this.module = mbleModule;
        this.vendomaticProvider = provider;
        this.gsonProvider = provider2;
    }

    public static MbleModule_ProvideMbleVendoConfigProviderFactory create(MbleModule mbleModule, Provider<C9248i> provider, Provider<Gson> provider2) {
        return new MbleModule_ProvideMbleVendoConfigProviderFactory(mbleModule, provider, provider2);
    }

    public static MbleVendoConfigProvider provideMbleVendoConfigProvider(MbleModule mbleModule, C9248i c9248i, Gson gson) {
        return (MbleVendoConfigProvider) C30587i.m94207e(mbleModule.provideMbleVendoConfigProvider(c9248i, gson));
    }

    @Override // javax.inject.Provider
    public MbleVendoConfigProvider get() {
        return provideMbleVendoConfigProvider(this.module, this.vendomaticProvider.get(), this.gsonProvider.get());
    }
}