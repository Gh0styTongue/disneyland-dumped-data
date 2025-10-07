package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyListAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PartyListAdapter_Factory_Factory implements InterfaceC30583e<PartyListAdapter.Factory> {
    private final Provider<PartyGuestAdapter.Factory> partyGuestAdapterFactoryProvider;

    public PartyListAdapter_Factory_Factory(Provider<PartyGuestAdapter.Factory> provider) {
        this.partyGuestAdapterFactoryProvider = provider;
    }

    public static PartyListAdapter_Factory_Factory create(Provider<PartyGuestAdapter.Factory> provider) {
        return new PartyListAdapter_Factory_Factory(provider);
    }

    public static PartyListAdapter.Factory newInstance(PartyGuestAdapter.Factory factory) {
        return new PartyListAdapter.Factory(factory);
    }

    @Override // javax.inject.Provider
    public PartyListAdapter.Factory get() {
        return newInstance(this.partyGuestAdapterFactoryProvider.get());
    }
}