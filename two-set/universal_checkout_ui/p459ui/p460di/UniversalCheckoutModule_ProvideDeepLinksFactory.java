package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import android.content.Context;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class UniversalCheckoutModule_ProvideDeepLinksFactory implements InterfaceC30583e<InterfaceC9289f> {
    private final Provider<Context> contextProvider;
    private final UniversalCheckoutModule module;
    private final Provider<UniversalCheckoutEnvironment> universalCheckoutEnvironmentProvider;

    public UniversalCheckoutModule_ProvideDeepLinksFactory(UniversalCheckoutModule universalCheckoutModule, Provider<Context> provider, Provider<UniversalCheckoutEnvironment> provider2) {
        this.module = universalCheckoutModule;
        this.contextProvider = provider;
        this.universalCheckoutEnvironmentProvider = provider2;
    }

    public static UniversalCheckoutModule_ProvideDeepLinksFactory create(UniversalCheckoutModule universalCheckoutModule, Provider<Context> provider, Provider<UniversalCheckoutEnvironment> provider2) {
        return new UniversalCheckoutModule_ProvideDeepLinksFactory(universalCheckoutModule, provider, provider2);
    }

    public static InterfaceC9289f provideDeepLinks(UniversalCheckoutModule universalCheckoutModule, Context context, UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        return (InterfaceC9289f) C30587i.m94207e(universalCheckoutModule.provideDeepLinks(context, universalCheckoutEnvironment));
    }

    @Override // javax.inject.Provider
    public InterfaceC9289f get() {
        return provideDeepLinks(this.module, this.contextProvider.get(), this.universalCheckoutEnvironmentProvider.get());
    }
}