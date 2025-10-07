package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CommerceGlobalRepository;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridUIModule_ProvideCommerceGlobalRepositoryFactory */
/* loaded from: classes19.dex */
public final class C21194x2f6fac95 implements InterfaceC30583e<CommerceGlobalRepository> {
    private final Provider<Database> databaseProvider;
    private final TicketSalesAndroidHybridUIModule module;

    public C21194x2f6fac95(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Provider<Database> provider) {
        this.module = ticketSalesAndroidHybridUIModule;
        this.databaseProvider = provider;
    }

    public static C21194x2f6fac95 create(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Provider<Database> provider) {
        return new C21194x2f6fac95(ticketSalesAndroidHybridUIModule, provider);
    }

    public static CommerceGlobalRepository provideCommerceGlobalRepository(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Database database) {
        return (CommerceGlobalRepository) C30587i.m94207e(ticketSalesAndroidHybridUIModule.provideCommerceGlobalRepository(database));
    }

    @Override // javax.inject.Provider
    public CommerceGlobalRepository get() {
        return provideCommerceGlobalRepository(this.module, this.databaseProvider.get());
    }
}