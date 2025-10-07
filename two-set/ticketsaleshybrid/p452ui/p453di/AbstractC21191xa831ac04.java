package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import com.disney.wdpro.ticketsaleshybrid.p452ui.fragment.DownScreenFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DownScreenFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeDownScreenFragment */
/* loaded from: classes19.dex */
public abstract class AbstractC21191xa831ac04 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeDownScreenFragment$DownScreenFragmentSubcomponent */
    public interface DownScreenFragmentSubcomponent extends InterfaceC27136c<DownScreenFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridBindingModule_ContributeDownScreenFragment$DownScreenFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<DownScreenFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<DownScreenFragment> create(@BindsInstance DownScreenFragment downScreenFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(DownScreenFragment downScreenFragment);
    }

    private AbstractC21191xa831ac04() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DownScreenFragmentSubcomponent.Factory factory);
}