package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideMbleUserInfoFactory implements InterfaceC30583e<MbleUserInfo> {
    private final Provider<MbleCoreFeatureConfig> mbleFeatureConfigProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvideMbleUserInfoFactory(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        this.module = mbleCoreModule;
        this.mbleFeatureConfigProvider = provider;
    }

    public static MbleCoreModule_ProvideMbleUserInfoFactory create(MbleCoreModule mbleCoreModule, Provider<MbleCoreFeatureConfig> provider) {
        return new MbleCoreModule_ProvideMbleUserInfoFactory(mbleCoreModule, provider);
    }

    public static MbleUserInfo provideMbleUserInfo(MbleCoreModule mbleCoreModule, MbleCoreFeatureConfig mbleCoreFeatureConfig) {
        return (MbleUserInfo) C30587i.m94207e(mbleCoreModule.provideMbleUserInfo(mbleCoreFeatureConfig));
    }

    @Override // javax.inject.Provider
    public MbleUserInfo get() {
        return provideMbleUserInfo(this.module, this.mbleFeatureConfigProvider.get());
    }
}