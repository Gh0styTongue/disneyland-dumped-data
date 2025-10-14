package com.disney.wdpro.ap_commerce_checkout.p065di;

import android.content.Context;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import com.disney.wdpro.commons.C9350r;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutModule_GetDemographicDataFragmentConfiguratorFactory */
/* loaded from: classes23.dex */
public final class C8702x997f029 implements InterfaceC30583e<APDemographicInfoFragment.DemographicDataFragmentConfigurator> {
    private final Provider<Context> contextProvider;
    private final Provider<ApPassHolderDemographicDataManager> dataManagerProvider;
    private final APCommerceCheckoutModule module;
    private final Provider<C9350r> timeProvider;

    public C8702x997f029(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<ApPassHolderDemographicDataManager> provider, Provider<C9350r> provider2, Provider<Context> provider3) {
        this.module = aPCommerceCheckoutModule;
        this.dataManagerProvider = provider;
        this.timeProvider = provider2;
        this.contextProvider = provider3;
    }

    public static C8702x997f029 create(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<ApPassHolderDemographicDataManager> provider, Provider<C9350r> provider2, Provider<Context> provider3) {
        return new C8702x997f029(aPCommerceCheckoutModule, provider, provider2, provider3);
    }

    public static APDemographicInfoFragment.DemographicDataFragmentConfigurator getDemographicDataFragmentConfigurator(APCommerceCheckoutModule aPCommerceCheckoutModule, ApPassHolderDemographicDataManager apPassHolderDemographicDataManager, C9350r c9350r, Context context) {
        return (APDemographicInfoFragment.DemographicDataFragmentConfigurator) C30587i.m94207e(aPCommerceCheckoutModule.getDemographicDataFragmentConfigurator(apPassHolderDemographicDataManager, c9350r, context));
    }

    @Override // javax.inject.Provider
    public APDemographicInfoFragment.DemographicDataFragmentConfigurator get() {
        return getDemographicDataFragmentConfigurator(this.module, this.dataManagerProvider.get(), this.timeProvider.get(), this.contextProvider.get());
    }
}