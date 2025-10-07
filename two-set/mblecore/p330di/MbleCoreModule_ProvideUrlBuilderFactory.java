package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.api.UrlBuilder;
import com.disney.wdpro.mblecore.api.UrlBuilderImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideUrlBuilderFactory implements InterfaceC30583e<UrlBuilder> {
    private final Provider<UrlBuilderImpl> implProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvideUrlBuilderFactory(MbleCoreModule mbleCoreModule, Provider<UrlBuilderImpl> provider) {
        this.module = mbleCoreModule;
        this.implProvider = provider;
    }

    public static MbleCoreModule_ProvideUrlBuilderFactory create(MbleCoreModule mbleCoreModule, Provider<UrlBuilderImpl> provider) {
        return new MbleCoreModule_ProvideUrlBuilderFactory(mbleCoreModule, provider);
    }

    public static UrlBuilder provideUrlBuilder(MbleCoreModule mbleCoreModule, UrlBuilderImpl urlBuilderImpl) {
        return (UrlBuilder) C30587i.m94207e(mbleCoreModule.provideUrlBuilder(urlBuilderImpl));
    }

    @Override // javax.inject.Provider
    public UrlBuilder get() {
        return provideUrlBuilder(this.module, this.implProvider.get());
    }
}