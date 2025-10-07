package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.VirtualQueueConfirmationFragmentModule_ProvidesPartyListAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21539x6fa0e99e implements InterfaceC30583e<PartyListAdapter.Factory> {
    private final VirtualQueueConfirmationFragmentModule module;
    private final Provider<PartyGuestAdapter.Factory> partyGuestAdapterFactoryProvider;

    public C21539x6fa0e99e(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<PartyGuestAdapter.Factory> provider) {
        this.module = virtualQueueConfirmationFragmentModule;
        this.partyGuestAdapterFactoryProvider = provider;
    }

    public static C21539x6fa0e99e create(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, Provider<PartyGuestAdapter.Factory> provider) {
        return new C21539x6fa0e99e(virtualQueueConfirmationFragmentModule, provider);
    }

    public static PartyListAdapter.Factory providesPartyListAdapterFactory$virtual_queue_lib_release(VirtualQueueConfirmationFragmentModule virtualQueueConfirmationFragmentModule, PartyGuestAdapter.Factory factory) {
        return (PartyListAdapter.Factory) C30587i.m94207e(virtualQueueConfirmationFragmentModule.providesPartyListAdapterFactory$virtual_queue_lib_release(factory));
    }

    @Override // javax.inject.Provider
    public PartyListAdapter.Factory get() {
        return providesPartyListAdapterFactory$virtual_queue_lib_release(this.module, this.partyGuestAdapterFactoryProvider.get());
    }
}