package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.base.BaseResidencyValidationFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {BaseResidencyValidationFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeBaseResidencyValidationFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8698x5c6e8da7 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeBaseResidencyValidationFragment$BaseResidencyValidationFragmentSubcomponent */
    public interface BaseResidencyValidationFragmentSubcomponent extends InterfaceC27136c<BaseResidencyValidationFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeBaseResidencyValidationFragment$BaseResidencyValidationFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<BaseResidencyValidationFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<BaseResidencyValidationFragment> create(@BindsInstance BaseResidencyValidationFragment baseResidencyValidationFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(BaseResidencyValidationFragment baseResidencyValidationFragment);
    }

    private AbstractC8698x5c6e8da7() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(BaseResidencyValidationFragmentSubcomponent.Factory factory);
}