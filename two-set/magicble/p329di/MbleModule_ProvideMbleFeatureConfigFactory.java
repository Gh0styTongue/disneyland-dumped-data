package com.disney.wdpro.magicble.p329di;

import android.content.Context;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.magicble.common.MbleFeatureConfig;
import com.disney.wdpro.magicble.manager.MbleLocalStorageManager;
import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import com.google.gson.Gson;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes13.dex */
public final class MbleModule_ProvideMbleFeatureConfigFactory implements InterfaceC30583e<MbleCoreFeatureConfig> {
    private final Provider<AuthenticationManager> authenticationManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Gson> gsonProvider;
    private final Provider<MbleFeatureConfig> mbleFeatureConfigProvider;
    private final Provider<MbleLocalStorageManager> mbleLocalStorageManagerProvider;
    private final MbleModule module;
    private final Provider<C9350r> timeProvider;
    private final Provider<C9248i> vendomaticProvider;

    public MbleModule_ProvideMbleFeatureConfigFactory(MbleModule mbleModule, Provider<AuthenticationManager> provider, Provider<Gson> provider2, Provider<C9248i> provider3, Provider<C9350r> provider4, Provider<MbleLocalStorageManager> provider5, Provider<MbleFeatureConfig> provider6, Provider<Context> provider7) {
        this.module = mbleModule;
        this.authenticationManagerProvider = provider;
        this.gsonProvider = provider2;
        this.vendomaticProvider = provider3;
        this.timeProvider = provider4;
        this.mbleLocalStorageManagerProvider = provider5;
        this.mbleFeatureConfigProvider = provider6;
        this.contextProvider = provider7;
    }

    public static MbleModule_ProvideMbleFeatureConfigFactory create(MbleModule mbleModule, Provider<AuthenticationManager> provider, Provider<Gson> provider2, Provider<C9248i> provider3, Provider<C9350r> provider4, Provider<MbleLocalStorageManager> provider5, Provider<MbleFeatureConfig> provider6, Provider<Context> provider7) {
        return new MbleModule_ProvideMbleFeatureConfigFactory(mbleModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MbleCoreFeatureConfig provideMbleFeatureConfig(MbleModule mbleModule, AuthenticationManager authenticationManager, Gson gson, C9248i c9248i, C9350r c9350r, MbleLocalStorageManager mbleLocalStorageManager, MbleFeatureConfig mbleFeatureConfig, Context context) {
        return (MbleCoreFeatureConfig) C30587i.m94207e(mbleModule.provideMbleFeatureConfig(authenticationManager, gson, c9248i, c9350r, mbleLocalStorageManager, mbleFeatureConfig, context));
    }

    @Override // javax.inject.Provider
    public MbleCoreFeatureConfig get() {
        return provideMbleFeatureConfig(this.module, this.authenticationManagerProvider.get(), this.gsonProvider.get(), this.vendomaticProvider.get(), this.timeProvider.get(), this.mbleLocalStorageManagerProvider.get(), this.mbleFeatureConfigProvider.get(), this.contextProvider.get());
    }
}