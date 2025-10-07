package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.WDWTicketSalesOrderConfirmationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {WDWTicketSalesOrderConfirmationFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeWDWTicketSalesOrderConfirmationFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11986xf175e696 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeWDWTicketSalesOrderConfirmationFragment$WDWTicketSalesOrderConfirmationFragmentSubcomponent */
    public interface WDWTicketSalesOrderConfirmationFragmentSubcomponent extends InterfaceC27136c<WDWTicketSalesOrderConfirmationFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeWDWTicketSalesOrderConfirmationFragment$WDWTicketSalesOrderConfirmationFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<WDWTicketSalesOrderConfirmationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<WDWTicketSalesOrderConfirmationFragment> create(@BindsInstance WDWTicketSalesOrderConfirmationFragment wDWTicketSalesOrderConfirmationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(WDWTicketSalesOrderConfirmationFragment wDWTicketSalesOrderConfirmationFragment);
    }

    private AbstractC11986xf175e696() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(WDWTicketSalesOrderConfirmationFragmentSubcomponent.Factory factory);
}