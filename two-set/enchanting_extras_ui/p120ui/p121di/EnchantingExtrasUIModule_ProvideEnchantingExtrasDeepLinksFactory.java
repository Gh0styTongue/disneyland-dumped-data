package com.disney.wdpro.enchanting_extras_ui.p120ui.p121di;

import android.content.Context;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* loaded from: classes25.dex */
public final class EnchantingExtrasUIModule_ProvideEnchantingExtrasDeepLinksFactory implements InterfaceC30583e<InterfaceC9289f> {
    private final Provider<Context> contextProvider;
    private final EnchantingExtrasUIModule module;

    public EnchantingExtrasUIModule_ProvideEnchantingExtrasDeepLinksFactory(EnchantingExtrasUIModule enchantingExtrasUIModule, Provider<Context> provider) {
        this.module = enchantingExtrasUIModule;
        this.contextProvider = provider;
    }

    public static EnchantingExtrasUIModule_ProvideEnchantingExtrasDeepLinksFactory create(EnchantingExtrasUIModule enchantingExtrasUIModule, Provider<Context> provider) {
        return new EnchantingExtrasUIModule_ProvideEnchantingExtrasDeepLinksFactory(enchantingExtrasUIModule, provider);
    }

    public static InterfaceC9289f provideEnchantingExtrasDeepLinks(EnchantingExtrasUIModule enchantingExtrasUIModule, Context context) {
        return (InterfaceC9289f) C30587i.m94207e(enchantingExtrasUIModule.provideEnchantingExtrasDeepLinks(context));
    }

    @Override // javax.inject.Provider
    public InterfaceC9289f get() {
        return provideEnchantingExtrasDeepLinks(this.module, this.contextProvider.get());
    }
}