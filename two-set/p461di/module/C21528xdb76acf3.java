package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter;
import com.disney.wdpro.virtualqueue.p462ui.redeem.RedeemAdapter;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.RedeemFragmentModule_ProvidesRedeemAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21528xdb76acf3 implements InterfaceC30583e<RedeemAdapter.Factory> {
    private final Provider<BarcodeAdapter.Factory> barcodeAdapterFactoryProvider;
    private final RedeemFragmentModule module;

    public C21528xdb76acf3(RedeemFragmentModule redeemFragmentModule, Provider<BarcodeAdapter.Factory> provider) {
        this.module = redeemFragmentModule;
        this.barcodeAdapterFactoryProvider = provider;
    }

    public static C21528xdb76acf3 create(RedeemFragmentModule redeemFragmentModule, Provider<BarcodeAdapter.Factory> provider) {
        return new C21528xdb76acf3(redeemFragmentModule, provider);
    }

    public static RedeemAdapter.Factory providesRedeemAdapterFactory$virtual_queue_lib_release(RedeemFragmentModule redeemFragmentModule, BarcodeAdapter.Factory factory) {
        return (RedeemAdapter.Factory) C30587i.m94207e(redeemFragmentModule.providesRedeemAdapterFactory$virtual_queue_lib_release(factory));
    }

    @Override // javax.inject.Provider
    public RedeemAdapter.Factory get() {
        return providesRedeemAdapterFactory$virtual_queue_lib_release(this.module, this.barcodeAdapterFactoryProvider.get());
    }
}