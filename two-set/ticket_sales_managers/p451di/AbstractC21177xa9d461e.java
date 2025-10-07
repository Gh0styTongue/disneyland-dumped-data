package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_managers.fragments.BaseSelectionVASFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {BaseSelectionVASFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseSelectionVASFragment */
/* loaded from: classes19.dex */
public abstract class AbstractC21177xa9d461e {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseSelectionVASFragment$BaseSelectionVASFragmentSubcomponent */
    public interface BaseSelectionVASFragmentSubcomponent extends InterfaceC27136c<BaseSelectionVASFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseSelectionVASFragment$BaseSelectionVASFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<BaseSelectionVASFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<BaseSelectionVASFragment> create(@BindsInstance BaseSelectionVASFragment baseSelectionVASFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(BaseSelectionVASFragment baseSelectionVASFragment);
    }

    private AbstractC21177xa9d461e() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(BaseSelectionVASFragmentSubcomponent.Factory factory);
}