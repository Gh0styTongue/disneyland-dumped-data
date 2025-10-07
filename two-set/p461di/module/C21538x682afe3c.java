package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.VirtualQueueConfirmationFragmentModule_ProvidesPartyGuestAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21538x682afe3c implements InterfaceC30583e<PartyGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final VirtualQueueConfirmationFragmentModule module;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public C21538x682afe3c(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        this.module = virtualQueueConfirmationFragmentModule;
        this.parkAppConfigurationProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
    }

    public static C21538x682afe3c create(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        return new C21538x682afe3c(virtualQueueConfirmationFragmentModule, provider, provider2);
    }

    public static PartyGuestAdapter.Factory providesPartyGuestAdapterFactory$virtual_queue_lib_release(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, C9314j c9314j, LinkedGuestUtils linkedGuestUtils) {
        return (PartyGuestAdapter.Factory) C30587i.m94207e(virtualQueueConfirmationFragmentModule.providesPartyGuestAdapterFactory$virtual_queue_lib_release(c9314j, linkedGuestUtils));
    }

    @Override // javax.inject.Provider
    public PartyGuestAdapter.Factory get() {
        return providesPartyGuestAdapterFactory$virtual_queue_lib_release(this.module, this.parkAppConfigurationProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}