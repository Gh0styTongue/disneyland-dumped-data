package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import dagger.Subcomponent;

@Subcomponent
/* loaded from: classes23.dex */
public interface APCommerceCheckoutComponent {
    APCommerceCheckoutManager getAPCommerceCheckoutManager();

    ApPassHolderDemographicDataManager getApPassHolderDemographicDataManager();

    APDemographicInfoFragment.DemographicDataFragmentConfigurator getDemographicDataFragmentConfigurator();

    APDemographicInfoFragment.DemographicDataResultHandler getDemographicDataFragmentResultHandler();

    void inject(APOrderConfirmationFragment aPOrderConfirmationFragment);
}