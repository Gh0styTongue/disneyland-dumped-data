package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.activities.WDWTicketSalesActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {WDWTicketSalesActivitySubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeWDWTicketSalesActivity */
/* loaded from: classes28.dex */
public abstract class AbstractC11985x449f202c {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeWDWTicketSalesActivity$WDWTicketSalesActivitySubcomponent */
    public interface WDWTicketSalesActivitySubcomponent extends InterfaceC27136c<WDWTicketSalesActivity> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeWDWTicketSalesActivity$WDWTicketSalesActivitySubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<WDWTicketSalesActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<WDWTicketSalesActivity> create(@BindsInstance WDWTicketSalesActivity wDWTicketSalesActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(WDWTicketSalesActivity wDWTicketSalesActivity);
    }

    private AbstractC11985x449f202c() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(WDWTicketSalesActivitySubcomponent.Factory factory);
}