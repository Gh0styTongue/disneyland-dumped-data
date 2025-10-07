package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.activities.GeneralTicketSalesActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {GeneralTicketSalesActivitySubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesActivity */
/* loaded from: classes28.dex */
public abstract class AbstractC11978x4cfb924e {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesActivity$GeneralTicketSalesActivitySubcomponent */
    public interface GeneralTicketSalesActivitySubcomponent extends InterfaceC27136c<GeneralTicketSalesActivity> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesActivity$GeneralTicketSalesActivitySubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<GeneralTicketSalesActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<GeneralTicketSalesActivity> create(@BindsInstance GeneralTicketSalesActivity generalTicketSalesActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(GeneralTicketSalesActivity generalTicketSalesActivity);
    }

    private AbstractC11978x4cfb924e() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(GeneralTicketSalesActivitySubcomponent.Factory factory);
}