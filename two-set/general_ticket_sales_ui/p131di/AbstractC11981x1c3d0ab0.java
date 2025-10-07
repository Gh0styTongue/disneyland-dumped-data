package com.disney.wdpro.general_ticket_sales_ui.p131di;

import com.disney.wdpro.general_ticket_sales_ui.fragment.MaxPassSalesDownFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {MaxPassSalesDownFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeMaxPassSalesDownFragment */
/* loaded from: classes28.dex */
public abstract class AbstractC11981x1c3d0ab0 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeMaxPassSalesDownFragment$MaxPassSalesDownFragmentSubcomponent */
    public interface MaxPassSalesDownFragmentSubcomponent extends InterfaceC27136c<MaxPassSalesDownFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.general_ticket_sales_ui.di.GeneralTicketSalesUIBindingModule_ContributeMaxPassSalesDownFragment$MaxPassSalesDownFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<MaxPassSalesDownFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<MaxPassSalesDownFragment> create(@BindsInstance MaxPassSalesDownFragment maxPassSalesDownFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(MaxPassSalesDownFragment maxPassSalesDownFragment);
    }

    private AbstractC11981x1c3d0ab0() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(MaxPassSalesDownFragmentSubcomponent.Factory factory);
}