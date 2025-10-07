package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.MyQueueFragmentModule_ProvidesPartyListAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21524x522a3df4 implements InterfaceC30583e<PartyListAdapter.Factory> {
    private final MyQueueFragmentModule module;
    private final Provider<PartyGuestAdapter.Factory> partyGuestAdapterFactoryProvider;

    public C21524x522a3df4(MyQueueFragmentModule myQueueFragmentModule, Provider<PartyGuestAdapter.Factory> provider) {
        this.module = myQueueFragmentModule;
        this.partyGuestAdapterFactoryProvider = provider;
    }

    public static C21524x522a3df4 create(MyQueueFragmentModule myQueueFragmentModule, Provider<PartyGuestAdapter.Factory> provider) {
        return new C21524x522a3df4(myQueueFragmentModule, provider);
    }

    public static PartyListAdapter.Factory providesPartyListAdapterFactory$virtual_queue_lib_release(MyQueueFragmentModule myQueueFragmentModule, PartyGuestAdapter.Factory factory) {
        return (PartyListAdapter.Factory) C30587i.m94207e(myQueueFragmentModule.providesPartyListAdapterFactory$virtual_queue_lib_release(factory));
    }

    @Override // javax.inject.Provider
    public PartyListAdapter.Factory get() {
        return providesPartyListAdapterFactory$virtual_queue_lib_release(this.module, this.partyGuestAdapterFactoryProvider.get());
    }
}