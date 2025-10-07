package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderWarningFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {TicketSalesOrderWarningFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesOrderWarningFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11984xd4df62f7 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesOrderWarningFragment$TicketSalesOrderWarningFragmentSubcomponent */
    public interface TicketSalesOrderWarningFragmentSubcomponent extends InterfaceC27136c<TicketSalesOrderWarningFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeTicketSalesOrderWarningFragment$TicketSalesOrderWarningFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<TicketSalesOrderWarningFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<TicketSalesOrderWarningFragment> create(@BindsInstance TicketSalesOrderWarningFragment ticketSalesOrderWarningFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(TicketSalesOrderWarningFragment ticketSalesOrderWarningFragment);
    }

    private AbstractC11984xd4df62f7() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(TicketSalesOrderWarningFragmentSubcomponent.Factory factory);
}