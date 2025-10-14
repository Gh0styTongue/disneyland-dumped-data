package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.di.APCommerceCheckoutModule_ProvideApPassHolderDemographicDataManagerFactory */
/* loaded from: classes23.dex */
public final class C8704x9fbf5662 implements InterfaceC30583e<ApPassHolderDemographicDataManager> {
    private final Provider<APCommerceCheckoutManager> apCommerceCheckoutManagerProvider;
    private final APCommerceCheckoutModule module;

    public C8704x9fbf5662(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<APCommerceCheckoutManager> provider) {
        this.module = aPCommerceCheckoutModule;
        this.apCommerceCheckoutManagerProvider = provider;
    }

    public static C8704x9fbf5662 create(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<APCommerceCheckoutManager> provider) {
        return new C8704x9fbf5662(aPCommerceCheckoutModule, provider);
    }

    public static ApPassHolderDemographicDataManager provideApPassHolderDemographicDataManager(APCommerceCheckoutModule aPCommerceCheckoutModule, APCommerceCheckoutManager aPCommerceCheckoutManager) {
        return (ApPassHolderDemographicDataManager) C30587i.m94207e(aPCommerceCheckoutModule.provideApPassHolderDemographicDataManager(aPCommerceCheckoutManager));
    }

    @Override // javax.inject.Provider
    public ApPassHolderDemographicDataManager get() {
        return provideApPassHolderDemographicDataManager(this.module, this.apCommerceCheckoutManagerProvider.get());
    }
}