package com.disney.wdpro.enchanting_extras_ui.p120ui.p121di;

import com.disney.wdpro.enchanting_extras_ui.p120ui.fragment.EnchantingExtrasFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {EnchantingExtrasFragmentSubcomponent.class})
/* loaded from: classes25.dex */
public abstract class EnchantingExtrasBindingModule_ContributeEnchantingExtrasFragment {

    @Subcomponent
    public interface EnchantingExtrasFragmentSubcomponent extends InterfaceC27136c<EnchantingExtrasFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<EnchantingExtrasFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<EnchantingExtrasFragment> create(@BindsInstance EnchantingExtrasFragment enchantingExtrasFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(EnchantingExtrasFragment enchantingExtrasFragment);
    }

    private EnchantingExtrasBindingModule_ContributeEnchantingExtrasFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(EnchantingExtrasFragmentSubcomponent.Factory factory);
}