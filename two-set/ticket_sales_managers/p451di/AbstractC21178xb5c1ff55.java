package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_managers.fragments.MaxPassLearnMoreFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {MaxPassLearnMoreFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeMaxPassLearnMoreFragment */
/* loaded from: classes19.dex */
public abstract class AbstractC21178xb5c1ff55 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeMaxPassLearnMoreFragment$MaxPassLearnMoreFragmentSubcomponent */
    public interface MaxPassLearnMoreFragmentSubcomponent extends InterfaceC27136c<MaxPassLearnMoreFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeMaxPassLearnMoreFragment$MaxPassLearnMoreFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<MaxPassLearnMoreFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<MaxPassLearnMoreFragment> create(@BindsInstance MaxPassLearnMoreFragment maxPassLearnMoreFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(MaxPassLearnMoreFragment maxPassLearnMoreFragment);
    }

    private AbstractC21178xb5c1ff55() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(MaxPassLearnMoreFragmentSubcomponent.Factory factory);
}