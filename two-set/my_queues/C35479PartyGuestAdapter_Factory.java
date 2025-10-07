package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.content.Context;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.ui.my_queues.PartyGuestAdapter_Factory, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C35479PartyGuestAdapter_Factory implements InterfaceC30583e<PartyGuestAdapter> {
    private final Provider<Context> contextProvider;
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<C9314j> parkAppConfigurationProvider;
    private final Provider<VQPageType> vqPageTypeProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public C35479PartyGuestAdapter_Factory(Provider<Context> provider, Provider<VirtualQueueThemer> provider2, Provider<VQPageType> provider3, Provider<C9314j> provider4, Provider<LinkedGuestUtils> provider5) {
        this.contextProvider = provider;
        this.vqThemerProvider = provider2;
        this.vqPageTypeProvider = provider3;
        this.parkAppConfigurationProvider = provider4;
        this.linkedGuestUtilsProvider = provider5;
    }

    public static C35479PartyGuestAdapter_Factory create(Provider<Context> provider, Provider<VirtualQueueThemer> provider2, Provider<VQPageType> provider3, Provider<C9314j> provider4, Provider<LinkedGuestUtils> provider5) {
        return new C35479PartyGuestAdapter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PartyGuestAdapter newInstance(Context context, VirtualQueueThemer virtualQueueThemer, VQPageType vQPageType, C9314j c9314j, LinkedGuestUtils linkedGuestUtils) {
        return new PartyGuestAdapter(context, virtualQueueThemer, vQPageType, c9314j, linkedGuestUtils);
    }

    @Override // javax.inject.Provider
    public PartyGuestAdapter get() {
        return newInstance(this.contextProvider.get(), this.vqThemerProvider.get(), this.vqPageTypeProvider.get(), this.parkAppConfigurationProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}