package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import com.disney.wdpro.ticketsaleshybrid.p452ui.activities.TicketSalesAndroidHybridActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {TicketSalesAndroidHybridActivitySubcomponent.class})
/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeTicketSalesAndroidHybridActivity */
/* loaded from: classes19.dex */
public abstract class AbstractC21192xd73be160 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeTicketSalesAndroidHybridActivity$TicketSalesAndroidHybridActivitySubcomponent */
    public interface TicketSalesAndroidHybridActivitySubcomponent extends InterfaceC27136c<TicketSalesAndroidHybridActivity> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeTicketSalesAndroidHybridActivity$TicketSalesAndroidHybridActivitySubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<TicketSalesAndroidHybridActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<TicketSalesAndroidHybridActivity> create(@BindsInstance TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity);
    }

    private AbstractC21192xd73be160() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(TicketSalesAndroidHybridActivitySubcomponent.Factory factory);
}