package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutModule_GetDemographicDataFragmentResultHandlerFactory */
/* loaded from: classes23.dex */
public final class C8703xe1aa1249 implements InterfaceC30583e<APDemographicInfoFragment.DemographicDataResultHandler> {
    private final Provider<ApPassHolderDemographicDataManager> dataManagerProvider;
    private final APCommerceCheckoutModule module;

    public C8703xe1aa1249(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<ApPassHolderDemographicDataManager> provider) {
        this.module = aPCommerceCheckoutModule;
        this.dataManagerProvider = provider;
    }

    public static C8703xe1aa1249 create(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<ApPassHolderDemographicDataManager> provider) {
        return new C8703xe1aa1249(aPCommerceCheckoutModule, provider);
    }

    public static APDemographicInfoFragment.DemographicDataResultHandler getDemographicDataFragmentResultHandler(APCommerceCheckoutModule aPCommerceCheckoutModule, ApPassHolderDemographicDataManager apPassHolderDemographicDataManager) {
        return (APDemographicInfoFragment.DemographicDataResultHandler) C30587i.m94207e(aPCommerceCheckoutModule.getDemographicDataFragmentResultHandler(apPassHolderDemographicDataManager));
    }

    @Override // javax.inject.Provider
    public APDemographicInfoFragment.DemographicDataResultHandler get() {
        return getDemographicDataFragmentResultHandler(this.module, this.dataManagerProvider.get());
    }
}