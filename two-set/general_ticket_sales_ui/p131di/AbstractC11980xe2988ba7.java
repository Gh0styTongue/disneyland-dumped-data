package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesOrderSummaryFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {GeneralTicketSalesOrderSummaryFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesOrderSummaryFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11980xe2988ba7 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesOrderSummaryFragment$GeneralTicketSalesOrderSummaryFragmentSubcomponent */
    public interface GeneralTicketSalesOrderSummaryFragmentSubcomponent extends InterfaceC27136c<GeneralTicketSalesOrderSummaryFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesOrderSummaryFragment$GeneralTicketSalesOrderSummaryFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<GeneralTicketSalesOrderSummaryFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<GeneralTicketSalesOrderSummaryFragment> create(@BindsInstance GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(GeneralTicketSalesOrderSummaryFragment generalTicketSalesOrderSummaryFragment);
    }

    private AbstractC11980xe2988ba7() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(GeneralTicketSalesOrderSummaryFragmentSubcomponent.Factory factory);
}