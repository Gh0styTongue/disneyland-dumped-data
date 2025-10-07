package com.disney.wdpro.enchanting_extras_ui.p120ui.p121di;

import com.disney.wdpro.enchanting_extras_ui.p120ui.fragment.DownScreenFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {DownScreenFragmentSubcomponent.class})
/* loaded from: classes25.dex */
public abstract class EnchantingExtrasBindingModule_ContributeDownScreenFragment {

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

    private EnchantingExtrasBindingModule_ContributeDownScreenFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(DownScreenFragmentSubcomponent.Factory factory);
}