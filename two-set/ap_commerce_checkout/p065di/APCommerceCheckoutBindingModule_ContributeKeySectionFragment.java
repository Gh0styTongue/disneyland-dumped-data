package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.KeySectionFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {KeySectionFragmentSubcomponent.class})
/* loaded from: classes23.dex */
public abstract class APCommerceCheckoutBindingModule_ContributeKeySectionFragment {

    @Subcomponent
    public interface KeySectionFragmentSubcomponent extends InterfaceC27136c<KeySectionFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<KeySectionFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<KeySectionFragment> create(@BindsInstance KeySectionFragment keySectionFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(KeySectionFragment keySectionFragment);
    }

    private APCommerceCheckoutBindingModule_ContributeKeySectionFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(KeySectionFragmentSubcomponent.Factory factory);
}