package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideMbleCoreTogglesFactory implements InterfaceC30583e<MbleCoreToggles> {
    private final Provider<MbleCoreFeatureConfig> mbleFeatureConfigProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvideMbleCoreTogglesFactory(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        this.module = mbleCoreModule;
        this.mbleFeatureConfigProvider = provider;
    }

    public static MbleCoreModule_ProvideMbleCoreTogglesFactory create(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        return new MbleCoreModule_ProvideMbleCoreTogglesFactory(mbleCoreModule, provider);
    }

    public static MbleCoreToggles provideMbleCoreToggles(MbleCoreModule mbleCoreModule, MbleCoreFeatureConfig mbleCoreFeatureConfig) {
        return (MbleCoreToggles) C30587i.m94207e(mbleCoreModule.provideMbleCoreToggles(mbleCoreFeatureConfig));
    }

    @Override // javax.inject.Provider
    public MbleCoreToggles get() {
        return provideMbleCoreToggles(this.module, this.mbleFeatureConfigProvider.get());
    }
}