package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.activities.TicketSalesHybridActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {TicketSalesHybridActivitySubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesHybridActivity */
/* loaded from: classes28.dex */
public abstract class AbstractC11982xba78a204 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesHybridActivity$TicketSalesHybridActivitySubcomponent */
    public interface TicketSalesHybridActivitySubcomponent extends InterfaceC27136c<TicketSalesHybridActivity> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesHybridActivity$TicketSalesHybridActivitySubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<TicketSalesHybridActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<TicketSalesHybridActivity> create(@BindsInstance TicketSalesHybridActivity ticketSalesHybridActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(TicketSalesHybridActivity ticketSalesHybridActivity);
    }

    private AbstractC11982xba78a204() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(TicketSalesHybridActivitySubcomponent.Factory factory);
}