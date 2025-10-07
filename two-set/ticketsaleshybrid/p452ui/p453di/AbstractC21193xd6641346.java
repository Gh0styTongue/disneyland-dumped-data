package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import com.disney.wdpro.ticketsaleshybrid.p452ui.fragment.TicketSalesHybridFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {TicketSalesHybridFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeTicketSalesHybridFragment */
/* loaded from: classes19.dex */
public abstract class AbstractC21193xd6641346 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeTicketSalesHybridFragment$TicketSalesHybridFragmentSubcomponent */
    public interface TicketSalesHybridFragmentSubcomponent extends InterfaceC27136c<TicketSalesHybridFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeTicketSalesHybridFragment$TicketSalesHybridFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<TicketSalesHybridFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<TicketSalesHybridFragment> create(@BindsInstance TicketSalesHybridFragment ticketSalesHybridFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(TicketSalesHybridFragment ticketSalesHybridFragment);
    }

    private AbstractC21193xd6641346() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(TicketSalesHybridFragmentSubcomponent.Factory factory);
}