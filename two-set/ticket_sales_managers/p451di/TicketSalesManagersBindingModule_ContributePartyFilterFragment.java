package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_managers.fragments.PartyFilterFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {PartyFilterFragmentSubcomponent.class})
/* loaded from: classes19.dex */
public abstract class TicketSalesManagersBindingModule_ContributePartyFilterFragment {

    @Subcomponent
    public interface PartyFilterFragmentSubcomponent extends InterfaceC27136c<PartyFilterFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<PartyFilterFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<PartyFilterFragment> create(@BindsInstance PartyFilterFragment partyFilterFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(PartyFilterFragment partyFilterFragment);
    }

    private TicketSalesManagersBindingModule_ContributePartyFilterFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(PartyFilterFragmentSubcomponent.Factory factory);
}