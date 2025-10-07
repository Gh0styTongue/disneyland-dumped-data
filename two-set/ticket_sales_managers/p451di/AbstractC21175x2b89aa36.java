package com.disney.wdpro.ticket_sales_managers.p451di;

import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {BaseConfirmationManagerFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseConfirmationManagerFragment */
/* loaded from: classes19.dex */
public abstract class AbstractC21175x2b89aa36 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseConfirmationManagerFragment$BaseConfirmationManagerFragmentSubcomponent */
    public interface BaseConfirmationManagerFragmentSubcomponent extends InterfaceC27136c<BaseConfirmationManagerFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticket_sales_managers.di.TicketSalesManagersBindingModule_ContributeBaseConfirmationManagerFragment$BaseConfirmationManagerFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<BaseConfirmationManagerFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<BaseConfirmationManagerFragment> create(@BindsInstance BaseConfirmationManagerFragment baseConfirmationManagerFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(BaseConfirmationManagerFragment baseConfirmationManagerFragment);
    }

    private AbstractC21175x2b89aa36() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(BaseConfirmationManagerFragmentSubcomponent.Factory factory);
}