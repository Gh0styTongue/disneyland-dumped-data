package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {APOrderConfirmationFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPOrderConfirmationFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8694xe3cd37d9 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPOrderConfirmationFragment$APOrderConfirmationFragmentSubcomponent */
    public interface APOrderConfirmationFragmentSubcomponent extends InterfaceC27136c<APOrderConfirmationFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPOrderConfirmationFragment$APOrderConfirmationFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<APOrderConfirmationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<APOrderConfirmationFragment> create(@BindsInstance APOrderConfirmationFragment aPOrderConfirmationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(APOrderConfirmationFragment aPOrderConfirmationFragment);
    }

    private AbstractC8694xe3cd37d9() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(APOrderConfirmationFragmentSubcomponent.Factory factory);
}