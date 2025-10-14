package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.APRenewalOrderSummaryFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {APRenewalOrderSummaryFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPRenewalOrderSummaryFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8695x5df64ac6 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPRenewalOrderSummaryFragment$APRenewalOrderSummaryFragmentSubcomponent */
    public interface APRenewalOrderSummaryFragmentSubcomponent extends InterfaceC27136c<APRenewalOrderSummaryFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPRenewalOrderSummaryFragment$APRenewalOrderSummaryFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<APRenewalOrderSummaryFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<APRenewalOrderSummaryFragment> create(@BindsInstance APRenewalOrderSummaryFragment aPRenewalOrderSummaryFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(APRenewalOrderSummaryFragment aPRenewalOrderSummaryFragment);
    }

    private AbstractC8695x5df64ac6() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(APRenewalOrderSummaryFragmentSubcomponent.Factory factory);
}