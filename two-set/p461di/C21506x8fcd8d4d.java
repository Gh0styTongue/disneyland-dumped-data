package com.disney.wdpro.virtualqueue.core.p461di;

import androidx.view.AbstractC3817t0;
import com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.VQViewModelsModule_ProvidePartyViewModel$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21506x8fcd8d4d implements InterfaceC30583e<AbstractC3817t0> {
    private final Provider<PartyViewModel> modelProvider;
    private final VQViewModelsModule module;

    public C21506x8fcd8d4d(VQViewModelsModule vQViewModelsModule, Provider<PartyViewModel> provider) {
        this.module = vQViewModelsModule;
        this.modelProvider = provider;
    }

    public static C21506x8fcd8d4d create(VQViewModelsModule vQViewModelsModule, Provider<PartyViewModel> provider) {
        return new C21506x8fcd8d4d(vQViewModelsModule, provider);
    }

    public static AbstractC3817t0 providePartyViewModel$virtual_queue_lib_release(VQViewModelsModule vQViewModelsModule, PartyViewModel partyViewModel) {
        return (AbstractC3817t0) C30587i.m94207e(vQViewModelsModule.providePartyViewModel$virtual_queue_lib_release(partyViewModel));
    }

    @Override // javax.inject.Provider
    public AbstractC3817t0 get() {
        return providePartyViewModel$virtual_queue_lib_release(this.module, this.modelProvider.get());
    }
}