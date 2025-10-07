package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.CreatePartyFragmentModule_ProvideIneligibleGuestAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21509x8ed38094 implements InterfaceC30583e<IneligibleGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final CreatePartyFragmentModule module;

    public C21509x8ed38094(CreatePartyFragmentModule createPartyFragmentModule, Provider<LinkedGuestUtils> provider) {
        this.module = createPartyFragmentModule;
        this.linkedGuestUtilsProvider = provider;
    }

    public static C21509x8ed38094 create(CreatePartyFragmentModule createPartyFragmentModule, Provider<LinkedGuestUtils> provider) {
        return new C21509x8ed38094(createPartyFragmentModule, provider);
    }

    public static IneligibleGuestAdapter.Factory provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(CreatePartyFragmentModule createPartyFragmentModule, LinkedGuestUtils linkedGuestUtils) {
        return (IneligibleGuestAdapter.Factory) C30587i.m94207e(createPartyFragmentModule.provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(linkedGuestUtils));
    }

    @Override // javax.inject.Provider
    public IneligibleGuestAdapter.Factory get() {
        return provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(this.module, this.linkedGuestUtilsProvider.get());
    }
}