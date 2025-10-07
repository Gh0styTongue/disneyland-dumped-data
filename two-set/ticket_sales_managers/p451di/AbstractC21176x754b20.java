package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {BaseOrderSummaryManagersFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseOrderSummaryManagersFragment */
/* loaded from: classes19.dex */
public abstract class AbstractC21176x754b20 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseOrderSummaryManagersFragment$BaseOrderSummaryManagersFragmentSubcomponent */
    public interface BaseOrderSummaryManagersFragmentSubcomponent extends InterfaceC27136c<BaseOrderSummaryManagersFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseOrderSummaryManagersFragment$BaseOrderSummaryManagersFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<BaseOrderSummaryManagersFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<BaseOrderSummaryManagersFragment> create(@BindsInstance BaseOrderSummaryManagersFragment baseOrderSummaryManagersFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(BaseOrderSummaryManagersFragment baseOrderSummaryManagersFragment);
    }

    private AbstractC21176x754b20() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(BaseOrderSummaryManagersFragmentSubcomponent.Factory factory);
}