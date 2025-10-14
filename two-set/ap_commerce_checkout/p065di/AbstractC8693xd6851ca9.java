package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {APDemographicInfoFragmentSubcomponent.class})
/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPDemographicInfoFragment */
/* loaded from: classes23.dex */
public abstract class AbstractC8693xd6851ca9 {

    @Subcomponent
    /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPDemographicInfoFragment$APDemographicInfoFragmentSubcomponent */
    public interface APDemographicInfoFragmentSubcomponent extends InterfaceC27136c<APDemographicInfoFragment> {

        @Subcomponent.Factory
        /* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutBindingModule_ContributeAPDemographicInfoFragment$APDemographicInfoFragmentSubcomponent$Factory */
        public interface Factory extends InterfaceC27136c.a<APDemographicInfoFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<APDemographicInfoFragment> create(@BindsInstance APDemographicInfoFragment aPDemographicInfoFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(APDemographicInfoFragment aPDemographicInfoFragment);
    }

    private AbstractC8693xd6851ca9() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(APDemographicInfoFragmentSubcomponent.Factory factory);
}