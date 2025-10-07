package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManagerImpl;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.universal_checkout_ui.ui.di.UniversalCheckoutModule_ProvideUniversalCheckoutDataManagerFactory */
/* loaded from: classes20.dex */
public final class C21455x2ae1259 implements InterfaceC30583e<UniversalCheckoutDataManager> {
    private final UniversalCheckoutModule module;
    private final Provider<ProxyFactory> proxyFactoryProvider;
    private final Provider<UniversalCheckoutDataManagerImpl> universalCheckoutDataManagerProvider;

    public C21455x2ae1259(UniversalCheckoutModule universalCheckoutModule, Provider<ProxyFactory> provider, Provider<UniversalCheckoutDataManagerImpl> provider2) {
        this.module = universalCheckoutModule;
        this.proxyFactoryProvider = provider;
        this.universalCheckoutDataManagerProvider = provider2;
    }

    public static C21455x2ae1259 create(UniversalCheckoutModule universalCheckoutModule, Provider<ProxyFactory> provider, Provider<UniversalCheckoutDataManagerImpl> provider2) {
        return new C21455x2ae1259(universalCheckoutModule, provider, provider2);
    }

    public static UniversalCheckoutDataManager provideUniversalCheckoutDataManager(UniversalCheckoutModule universalCheckoutModule, ProxyFactory proxyFactory, UniversalCheckoutDataManagerImpl universalCheckoutDataManagerImpl) {
        return (UniversalCheckoutDataManager) C30587i.m94207e(universalCheckoutModule.provideUniversalCheckoutDataManager(proxyFactory, universalCheckoutDataManagerImpl));
    }

    @Override // javax.inject.Provider
    public UniversalCheckoutDataManager get() {
        return provideUniversalCheckoutDataManager(this.module, this.proxyFactoryProvider.get(), this.universalCheckoutDataManagerProvider.get());
    }
}