package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {TicketSalesOrderConfirmationFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesOrderConfirmationFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11983xba52df9a {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesOrderConfirmationFragment$TicketSalesOrderConfirmationFragmentSubcomponent */
    public interface TicketSalesOrderConfirmationFragmentSubcomponent extends InterfaceC27136c<TicketSalesOrderConfirmationFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesOrderConfirmationFragment$TicketSalesOrderConfirmationFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<TicketSalesOrderConfirmationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<TicketSalesOrderConfirmationFragment> create(@BindsInstance TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(TicketSalesOrderConfirmationFragment ticketSalesOrderConfirmationFragment);
    }

    private AbstractC11983xba52df9a() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(TicketSalesOrderConfirmationFragmentSubcomponent.Factory factory);
}