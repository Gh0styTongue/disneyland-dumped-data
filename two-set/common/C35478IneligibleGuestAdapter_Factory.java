package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.ui.common.IneligibleGuestAdapter_Factory, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C35478IneligibleGuestAdapter_Factory implements InterfaceC30583e<IneligibleGuestAdapter> {
    private final Provider<Context> contextProvider;
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<VirtualQueueThemer> vqThemerProvider;

    public C35478IneligibleGuestAdapter_Factory(Provider<Context> provider, Provider<VirtualQueueThemer> provider2, Provider<LinkedGuestUtils> provider3) {
        this.contextProvider = provider;
        this.vqThemerProvider = provider2;
        this.linkedGuestUtilsProvider = provider3;
    }

    public static C35478IneligibleGuestAdapter_Factory create(Provider<Context> provider, Provider<VirtualQueueThemer> provider2, Provider<LinkedGuestUtils> provider3) {
        return new C35478IneligibleGuestAdapter_Factory(provider, provider2, provider3);
    }

    public static IneligibleGuestAdapter newInstance(Context context, VirtualQueueThemer virtualQueueThemer, LinkedGuestUtils linkedGuestUtils) {
        return new IneligibleGuestAdapter(context, virtualQueueThemer, linkedGuestUtils);
    }

    @Override // javax.inject.Provider
    public IneligibleGuestAdapter get() {
        return newInstance(this.contextProvider.get(), this.vqThemerProvider.get(), this.linkedGuestUtilsProvider.get());
    }
}