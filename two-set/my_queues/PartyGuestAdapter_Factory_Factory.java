package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PartyGuestAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class PartyGuestAdapter_Factory_Factory implements InterfaceC30583e<PartyGuestAdapter.Factory> {
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;

    public PartyGuestAdapter_Factory_Factory(Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        this.parkAppConfigurationProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
    }

    public static PartyGuestAdapter_Factory_Factory create(Provider<C9314j> provider, Provider<LinkedGuestUtils> provider2) {
        return new PartyGuestAdapter_Factory_Factory(provider, provider2);
    }

    public static PartyGuestAdapter.Factory newInstance(C9314j c9314j, LinkedGuestUtils linkedGuestUtils) {
        return new PartyGuestAdapter.Factory(c9314j, linkedGuestUtils);
    }

    @Override // javax.inject.Provider
    public PartyGuestAdapter.Factory get() {
        return newInstance(this.parkAppConfigurationProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}