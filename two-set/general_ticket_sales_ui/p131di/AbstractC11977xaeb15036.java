package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DLRTicketSalesOrderConfirmationFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeDLRTicketSalesOrderConfirmationFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11977xaeb15036 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeDLRTicketSalesOrderConfirmationFragment$DLRTicketSalesOrderConfirmationFragmentSubcomponent */
    public interface DLRTicketSalesOrderConfirmationFragmentSubcomponent extends InterfaceC27136c<DLRTicketSalesOrderConfirmationFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeDLRTicketSalesOrderConfirmationFragment$DLRTicketSalesOrderConfirmationFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<DLRTicketSalesOrderConfirmationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<DLRTicketSalesOrderConfirmationFragment> create(@BindsInstance DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment);
    }

    private AbstractC11977xaeb15036() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DLRTicketSalesOrderConfirmationFragmentSubcomponent.Factory factory);
}