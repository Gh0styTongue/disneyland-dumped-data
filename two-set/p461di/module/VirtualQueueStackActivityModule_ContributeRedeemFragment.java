package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.RedeemFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {RedeemFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule_ContributeRedeemFragment {

    @Subcomponent(modules = {RedeemFragmentModule.class})
    public interface RedeemFragmentSubcomponent extends InterfaceC27136c<RedeemFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<RedeemFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<RedeemFragment> create(@BindsInstance RedeemFragment redeemFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(RedeemFragment redeemFragment);
    }

    private VirtualQueueStackActivityModule_ContributeRedeemFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(RedeemFragmentSubcomponent.Factory factory);
}