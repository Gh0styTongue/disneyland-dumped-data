package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.APRenewalOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.KeySectionFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.SalesLegalCopyBaseFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.StringLegalCopyFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_sales.ApSalesOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.ApUpgradesOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.base.BaseResidencyValidationFragment;
import dagger.Module;

@Module
/* loaded from: classes23.dex */
public abstract class APCommerceCheckoutBindingModule {
    abstract APBaseOrderSummaryFragment contributeAPBaseOrderSummaryFragment();

    abstract APDemographicInfoFragment contributeAPDemographicInfoFragment();

    abstract APOrderConfirmationFragment contributeAPOrderConfirmationFragment();

    abstract APRenewalOrderSummaryFragment contributeAPRenewalOrderSummaryFragment();

    abstract ApSalesOrderSummaryFragment contributeApSalesOrderSummaryFragment();

    abstract ApUpgradesOrderSummaryFragment contributeApUpgradesOrderSummaryFragment();

    abstract BaseResidencyValidationFragment contributeBaseResidencyValidationFragment();

    abstract KeySectionFragment contributeKeySectionFragment();

    abstract SalesLegalCopyBaseFragment contributeSalesLegalCopyBaseFragment();

    abstract StringLegalCopyFragment contributeStringLegalCopyFragment();

    abstract ViewAndSignAgreementFragment contributeViewAndSignAgreementFragment();
}