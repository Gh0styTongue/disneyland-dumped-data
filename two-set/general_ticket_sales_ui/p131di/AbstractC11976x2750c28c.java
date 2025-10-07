package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.activities.DLRTicketSalesActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DLRTicketSalesActivitySubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeDLRTicketSalesActivity */
/* loaded from: classes28.dex */
public abstract class AbstractC11976x2750c28c {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeDLRTicketSalesActivity$DLRTicketSalesActivitySubcomponent */
    public interface DLRTicketSalesActivitySubcomponent extends InterfaceC27136c<DLRTicketSalesActivity> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeDLRTicketSalesActivity$DLRTicketSalesActivitySubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<DLRTicketSalesActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<DLRTicketSalesActivity> create(@BindsInstance DLRTicketSalesActivity dLRTicketSalesActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(DLRTicketSalesActivity dLRTicketSalesActivity);
    }

    private AbstractC11976x2750c28c() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DLRTicketSalesActivitySubcomponent.Factory factory);
}