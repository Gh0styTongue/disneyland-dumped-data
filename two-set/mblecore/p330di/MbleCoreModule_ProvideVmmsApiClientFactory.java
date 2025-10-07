package com.disney.wdpro.mblecore.p330di;

import com.disney.wdpro.mblecore.api.VmmsApiClient;
import com.disney.wdpro.mblecore.api.VmmsApiClientImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes2.dex */
public final class MbleCoreModule_ProvideVmmsApiClientFactory implements InterfaceC30583e<VmmsApiClient> {
    private final Provider<VmmsApiClientImpl> implProvider;
    private final MbleCoreModule module;

    public MbleCoreModule_ProvideVmmsApiClientFactory(MbleCoreModule mbleCoreModule, Provider<VmmsApiClientImpl> provider) {
        this.module = mbleCoreModule;
        this.implProvider = provider;
    }

    public static MbleCoreModule_ProvideVmmsApiClientFactory create(MbleCoreModule mbleCoreModule, Provider<VmmsApiClientImpl> provider) {
        return new MbleCoreModule_ProvideVmmsApiClientFactory(mbleCoreModule, provider);
    }

    public static VmmsApiClient provideVmmsApiClient(MbleCoreModule mbleCoreModule, VmmsApiClientImpl vmmsApiClientImpl) {
        return (VmmsApiClient) C30587i.m94207e(mbleCoreModule.provideVmmsApiClient(vmmsApiClientImpl));
    }

    @Override // javax.inject.Provider
    public VmmsApiClient get() {
        return provideVmmsApiClient(this.module, this.implProvider.get());
    }
}