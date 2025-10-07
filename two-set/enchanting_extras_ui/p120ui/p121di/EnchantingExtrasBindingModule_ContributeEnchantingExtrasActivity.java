package com.disney.wdpro.enchanting_extras_ui.p120ui.p121di;

import com.disney.wdpro.enchanting_extras_ui.p120ui.activities.EnchantingExtrasActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {EnchantingExtrasActivitySubcomponent.class})
/* loaded from: classes25.dex */
public abstract class EnchantingExtrasBindingModule_ContributeEnchantingExtrasActivity {

    @Subcomponent
    public interface EnchantingExtrasActivitySubcomponent extends InterfaceC27136c<EnchantingExtrasActivity> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<EnchantingExtrasActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<EnchantingExtrasActivity> create(@BindsInstance EnchantingExtrasActivity enchantingExtrasActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(EnchantingExtrasActivity enchantingExtrasActivity);
    }

    private EnchantingExtrasBindingModule_ContributeEnchantingExtrasActivity() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(EnchantingExtrasActivitySubcomponent.Factory factory);
}