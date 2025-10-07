package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import android.content.Context;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridUIModule_ProvideTicketSalesAndroidHybridDeepLinksFactory */
/* loaded from: classes19.dex */
public final class C21196x67f60875 implements InterfaceC30583e<InterfaceC9289f> {
    private final Provider<Context> contextProvider;
    private final TicketSalesAndroidHybridUIModule module;

    public C21196x67f60875(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Provider<Context> provider) {
        this.module = ticketSalesAndroidHybridUIModule;
        this.contextProvider = provider;
    }

    public static C21196x67f60875 create(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Provider<Context> provider) {
        return new C21196x67f60875(ticketSalesAndroidHybridUIModule, provider);
    }

    public static InterfaceC9289f provideTicketSalesAndroidHybridDeepLinks(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Context context) {
        return (InterfaceC9289f) C30587i.m94207e(ticketSalesAndroidHybridUIModule.provideTicketSalesAndroidHybridDeepLinks(context));
    }

    @Override // javax.inject.Provider
    public InterfaceC9289f get() {
        return provideTicketSalesAndroidHybridDeepLinks(this.module, this.contextProvider.get());
    }
}