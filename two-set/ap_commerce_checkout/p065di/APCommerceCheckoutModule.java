package com.disney.wdpro.ap_commerce_checkout.p065di;

import android.content.Context;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManagerImpl;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.DemographicDataFragmentConfiguratorImpl;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.midichlorian.ProxyFactory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(includes = {APCommerceCheckoutBindingModule.class})
/* loaded from: classes23.dex */
public class APCommerceCheckoutModule {
    @Provides
    @Singleton
    APDemographicInfoFragment.DemographicDataFragmentConfigurator getDemographicDataFragmentConfigurator(ApPassHolderDemographicDataManager apPassHolderDemographicDataManager, C9350r c9350r, Context context) {
        return new DemographicDataFragmentConfiguratorImpl(context, apPassHolderDemographicDataManager, c9350r);
    }

    @Provides
    @Singleton
    APDemographicInfoFragment.DemographicDataResultHandler getDemographicDataFragmentResultHandler(ApPassHolderDemographicDataManager apPassHolderDemographicDataManager) {
        return apPassHolderDemographicDataManager;
    }

    @Provides
    @Singleton
    APCommerceCheckoutManager provideAPCommerceCheckoutManager(ProxyFactory proxyFactory, APCommerceCheckoutManagerImpl aPCommerceCheckoutManagerImpl) {
        return (APCommerceCheckoutManager) proxyFactory.createProxy(aPCommerceCheckoutManagerImpl);
    }

    @Provides
    @Singleton
    ApPassHolderDemographicDataManager provideApPassHolderDemographicDataManager(APCommerceCheckoutManager aPCommerceCheckoutManager) {
        return new ApPassHolderDemographicDataManager(aPCommerceCheckoutManager);
    }
}