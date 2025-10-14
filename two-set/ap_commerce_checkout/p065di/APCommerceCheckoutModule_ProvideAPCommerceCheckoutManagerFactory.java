package com.disney.wdpro.ap_commerce_checkout.p065di;

import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManagerImpl;
import com.disney.wdpro.midichlorian.ProxyFactory;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes23.dex */
public final class APCommerceCheckoutModule_ProvideAPCommerceCheckoutManagerFactory implements InterfaceC30583e<APCommerceCheckoutManager> {
    private final Provider<APCommerceCheckoutManagerImpl> implProvider;
    private final APCommerceCheckoutModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;

    public APCommerceCheckoutModule_ProvideAPCommerceCheckoutManagerFactory(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<ProxyFactory> provider, Provider<APCommerceCheckoutManagerImpl> provider2) {
        this.module = aPCommerceCheckoutModule;
        this.proxyFactoryProvider = provider;
        this.implProvider = provider2;
    }

    public static APCommerceCheckoutModule_ProvideAPCommerceCheckoutManagerFactory create(APCommerceCheckoutModule aPCommerceCheckoutModule, Provider<ProxyFactory> provider, Provider<APCommerceCheckoutManagerImpl> provider2) {
        return new APCommerceCheckoutModule_ProvideAPCommerceCheckoutManagerFactory(aPCommerceCheckoutModule, provider, provider2);
    }

    public static APCommerceCheckoutManager provideAPCommerceCheckoutManager(APCommerceCheckoutModule aPCommerceCheckoutModule, ProxyFactory proxyFactory, APCommerceCheckoutManagerImpl aPCommerceCheckoutManagerImpl) {
        return (APCommerceCheckoutManager) C30587i.m94207e(aPCommerceCheckoutModule.provideAPCommerceCheckoutManager(proxyFactory, aPCommerceCheckoutManagerImpl));
    }

    @Override // javax.inject.Provider
    public APCommerceCheckoutManager get() {
        return provideAPCommerceCheckoutManager(this.module, this.proxyFactoryProvider.get(), this.implProvider.get());
    }
}