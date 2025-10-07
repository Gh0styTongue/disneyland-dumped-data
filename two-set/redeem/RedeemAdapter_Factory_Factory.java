package com.disney.wdpro.virtualqueue.p462ui.redeem;

import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter;
import com.disney.wdpro.virtualqueue.p462ui.redeem.RedeemAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class RedeemAdapter_Factory_Factory implements InterfaceC30583e<RedeemAdapter.Factory> {
    private final Provider<BarcodeAdapter.Factory> barcodeAdapterFactoryProvider;

    public RedeemAdapter_Factory_Factory(Provider<BarcodeAdapter.Factory> provider) {
        this.barcodeAdapterFactoryProvider = provider;
    }

    public static RedeemAdapter_Factory_Factory create(Provider<BarcodeAdapter.Factory> provider) {
        return new RedeemAdapter_Factory_Factory(provider);
    }

    public static RedeemAdapter.Factory newInstance(BarcodeAdapter.Factory factory) {
        return new RedeemAdapter.Factory(factory);
    }

    @Override // javax.inject.Provider
    public RedeemAdapter.Factory get() {
        return newInstance(this.barcodeAdapterFactoryProvider.get());
    }
}