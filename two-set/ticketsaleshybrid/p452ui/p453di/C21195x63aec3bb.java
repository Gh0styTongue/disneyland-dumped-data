package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CommerceGlobalRepository;
import com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManager;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridUIModule_ProvideGlobalResourceManagerFactory */
/* loaded from: classes19.dex */
public final class C21195x63aec3bb implements InterfaceC30583e<GlobalResourceManager> {
    private final TicketSalesAndroidHybridUIModule module;
    private final Provider<CommerceGlobalRepository> repositoryProvider;

    public C21195x63aec3bb(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Provider<CommerceGlobalRepository> provider) {
        this.module = ticketSalesAndroidHybridUIModule;
        this.repositoryProvider = provider;
    }

    public static C21195x63aec3bb create(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, Provider<CommerceGlobalRepository> provider) {
        return new C21195x63aec3bb(ticketSalesAndroidHybridUIModule, provider);
    }

    public static GlobalResourceManager provideGlobalResourceManager(TicketSalesAndroidHybridUIModule ticketSalesAndroidHybridUIModule, CommerceGlobalRepository commerceGlobalRepository) {
        return (GlobalResourceManager) C30587i.m94207e(ticketSalesAndroidHybridUIModule.provideGlobalResourceManager(commerceGlobalRepository));
    }

    @Override // javax.inject.Provider
    public GlobalResourceManager get() {
        return provideGlobalResourceManager(this.module, this.repositoryProvider.get());
    }
}