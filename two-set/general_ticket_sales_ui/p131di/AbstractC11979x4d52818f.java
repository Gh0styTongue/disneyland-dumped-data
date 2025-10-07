package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.GeneralTicketSalesFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {GeneralTicketSalesFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11979x4d52818f {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesFragment$GeneralTicketSalesFragmentSubcomponent */
    public interface GeneralTicketSalesFragmentSubcomponent extends InterfaceC27136c<GeneralTicketSalesFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeGeneralTicketSalesFragment$GeneralTicketSalesFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<GeneralTicketSalesFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<GeneralTicketSalesFragment> create(@BindsInstance GeneralTicketSalesFragment generalTicketSalesFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(GeneralTicketSalesFragment generalTicketSalesFragment);
    }

    private AbstractC11979x4d52818f() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(GeneralTicketSalesFragmentSubcomponent.Factory factory);
}