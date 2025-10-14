package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {APBaseOrderSummaryFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPBaseOrderSummaryFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8692x38f4c8d3 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPBaseOrderSummaryFragment$APBaseOrderSummaryFragmentSubcomponent */
    public interface APBaseOrderSummaryFragmentSubcomponent extends InterfaceC27136c<APBaseOrderSummaryFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPBaseOrderSummaryFragment$APBaseOrderSummaryFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<APBaseOrderSummaryFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<APBaseOrderSummaryFragment> create(@BindsInstance APBaseOrderSummaryFragment aPBaseOrderSummaryFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(APBaseOrderSummaryFragment aPBaseOrderSummaryFragment);
    }

    private AbstractC8692x38f4c8d3() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(APBaseOrderSummaryFragmentSubcomponent.Factory factory);
}