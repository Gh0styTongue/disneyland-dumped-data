package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.DetailFragmentModule_ProvidesPartyListAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21513x166026a8 implements InterfaceC30583e<PartyListAdapter.Factory> {
    private final DetailFragmentModule module;
    private final Provider<PartyGuestAdapter.Factory> partyGuestAdapterFactoryProvider;

    public C21513x166026a8(DetailFragmentModule detailFragmentModule, Provider<PartyGuestAdapter.Factory> provider) {
        this.module = detailFragmentModule;
        this.partyGuestAdapterFactoryProvider = provider;
    }

    public static C21513x166026a8 create(DetailFragmentModule detailFragmentModule, Provider<PartyGuestAdapter.Factory> provider) {
        return new C21513x166026a8(detailFragmentModule, provider);
    }

    public static PartyListAdapter.Factory providesPartyListAdapterFactory$virtual_queue_lib_release(DetailFragmentModule detailFragmentModule, PartyGuestAdapter.Factory factory) {
        return (PartyListAdapter.Factory) C30587i.m94207e(detailFragmentModule.providesPartyListAdapterFactory$virtual_queue_lib_release(factory));
    }

    @Override // javax.inject.Provider
    public PartyListAdapter.Factory get() {
        return providesPartyListAdapterFactory$virtual_queue_lib_release(this.module, this.partyGuestAdapterFactoryProvider.get());
    }
}