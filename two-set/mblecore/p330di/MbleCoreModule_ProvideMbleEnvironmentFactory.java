package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.common.MbleCoreEnvironment;
import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideMbleEnvironmentFactory implements InterfaceC30583e<MbleCoreEnvironment> {
    private final Provider<MbleCoreFeatureConfig> mbleFeatureConfigProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvideMbleEnvironmentFactory(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        this.module = mbleCoreModule;
        this.mbleFeatureConfigProvider = provider;
    }

    public static MbleCoreModule_ProvideMbleEnvironmentFactory create(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        return new MbleCoreModule_ProvideMbleEnvironmentFactory(mbleCoreModule, provider);
    }

    public static MbleCoreEnvironment provideMbleEnvironment(MbleCoreModule mbleCoreModule, MbleCoreFeatureConfig mbleCoreFeatureConfig) {
        return (MbleCoreEnvironment) C30587i.m94207e(mbleCoreModule.provideMbleEnvironment(mbleCoreFeatureConfig));
    }

    @Override // javax.inject.Provider
    public MbleCoreEnvironment get() {
        return provideMbleEnvironment(this.module, this.mbleFeatureConfigProvider.get());
    }
}