package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.universal_checkout_ui.p459ui.fragments.DownScreenFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DownScreenFragmentSubcomponent.class})
/* loaded from: classes20.dex */
public abstract class UniversalCheckoutBindingModule_ContributeDownScreenFragment {

    @Subcomponent
    public interface DownScreenFragmentSubcomponent extends InterfaceC27136c<DownScreenFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<DownScreenFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<DownScreenFragment> create(@BindsInstance DownScreenFragment downScreenFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(DownScreenFragment downScreenFragment);
    }

    private UniversalCheckoutBindingModule_ContributeDownScreenFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DownScreenFragmentSubcomponent.Factory factory);
}