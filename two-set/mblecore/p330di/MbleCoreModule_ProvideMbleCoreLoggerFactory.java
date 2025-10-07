package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideMbleCoreLoggerFactory implements InterfaceC30583e<MbleCoreLogger> {
    private final Provider<MbleCoreFeatureConfig> mbleFeatureConfigProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvideMbleCoreLoggerFactory(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        this.module = mbleCoreModule;
        this.mbleFeatureConfigProvider = provider;
    }

    public static MbleCoreModule_ProvideMbleCoreLoggerFactory create(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        return new MbleCoreModule_ProvideMbleCoreLoggerFactory(mbleCoreModule, provider);
    }

    public static MbleCoreLogger provideMbleCoreLogger(MbleCoreModule mbleCoreModule, MbleCoreFeatureConfig mbleCoreFeatureConfig) {
        return (MbleCoreLogger) C30587i.m94207e(mbleCoreModule.provideMbleCoreLogger(mbleCoreFeatureConfig));
    }

    @Override // javax.inject.Provider
    public MbleCoreLogger get() {
        return provideMbleCoreLogger(this.module, this.mbleFeatureConfigProvider.get());
    }
}