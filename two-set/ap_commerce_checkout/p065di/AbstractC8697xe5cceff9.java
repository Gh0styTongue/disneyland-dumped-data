package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.ApUpgradesOrderSummaryFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {ApUpgradesOrderSummaryFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeApUpgradesOrderSummaryFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8697xe5cceff9 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeApUpgradesOrderSummaryFragment$ApUpgradesOrderSummaryFragmentSubcomponent */
    public interface ApUpgradesOrderSummaryFragmentSubcomponent extends InterfaceC27136c<ApUpgradesOrderSummaryFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeApUpgradesOrderSummaryFragment$ApUpgradesOrderSummaryFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<ApUpgradesOrderSummaryFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<ApUpgradesOrderSummaryFragment> create(@BindsInstance ApUpgradesOrderSummaryFragment apUpgradesOrderSummaryFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(ApUpgradesOrderSummaryFragment apUpgradesOrderSummaryFragment);
    }

    private AbstractC8697xe5cceff9() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(ApUpgradesOrderSummaryFragmentSubcomponent.Factory factory);
}