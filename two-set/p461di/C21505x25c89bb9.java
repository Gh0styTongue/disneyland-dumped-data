package com.disney.wdpro.virtualqueue.core.p461di;

import androidx.view.AbstractC3817t0;
import com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQViewModelsModule_ProvideHubLandingViewModel$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21505x25c89bb9 implements InterfaceC30583e<AbstractC3817t0> {
    private final Provider<HubLandingViewModel> modelProvider;
    private final VQViewModelsModule module;

    public C21505x25c89bb9(VQViewModelsModule vQViewModelsModule, Provider<HubLandingViewModel> provider) {
        this.module = vQViewModelsModule;
        this.modelProvider = provider;
    }

    public static C21505x25c89bb9 create(VQViewModelsModule vQViewModelsModule, Provider<HubLandingViewModel> provider) {
        return new C21505x25c89bb9(vQViewModelsModule, provider);
    }

    public static AbstractC3817t0 provideHubLandingViewModel$virtual_queue_lib_release(VQViewModelsModule vQViewModelsModule, HubLandingViewModel hubLandingViewModel) {
        return (AbstractC3817t0) C30587i.m94207e(vQViewModelsModule.provideHubLandingViewModel$virtual_queue_lib_release(hubLandingViewModel));
    }

    @Override // javax.inject.Provider
    public AbstractC3817t0 get() {
        return provideHubLandingViewModel$virtual_queue_lib_release(this.module, this.modelProvider.get());
    }
}