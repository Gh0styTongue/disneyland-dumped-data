package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter;
import com.disney.wdpro.virtualqueue.p462ui.redeem.QRCodeHelper;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.virtualqueue.core.di.module.RedeemFragmentModule_ProvidesBarcodeAdapterFactory$virtual_queue_lib_releaseFactory */
/* loaded from: classes20.dex */
public final class C21527x9e9e10e1 implements InterfaceC30583e<BarcodeAdapter.Factory> {
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final RedeemFragmentModule module;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<QRCodeHelper> qrCodeHelperProvider;

    public C21527x9e9e10e1(RedeemFragmentModule redeemFragmentModule, Provider<PicassoUtils> provider, Provider<LinkedGuestUtils> provider2, Provider<FacilityUtils> provider3, Provider<QRCodeHelper> provider4) {
        this.module = redeemFragmentModule;
        this.picassoUtilsProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
        this.facilityUtilsProvider = provider3;
        this.qrCodeHelperProvider = provider4;
    }

    public static C21527x9e9e10e1 create(RedeemFragmentModule redeemFragmentModule, Provider<PicassoUtils> provider, Provider<LinkedGuestUtils> provider2, Provider<FacilityUtils> provider3, Provider<QRCodeHelper> provider4) {
        return new C21527x9e9e10e1(redeemFragmentModule, provider, provider2, provider3, provider4);
    }

    public static BarcodeAdapter.Factory providesBarcodeAdapterFactory$virtual_queue_lib_release(RedeemFragmentModule redeemFragmentModule, PicassoUtils picassoUtils, LinkedGuestUtils linkedGuestUtils, FacilityUtils facilityUtils, QRCodeHelper qRCodeHelper) {
        return (BarcodeAdapter.Factory) C30587i.m94207e(redeemFragmentModule.providesBarcodeAdapterFactory$virtual_queue_lib_release(picassoUtils, linkedGuestUtils, facilityUtils, qRCodeHelper));
    }

    @Override // javax.inject.Provider
    public BarcodeAdapter.Factory get() {
        return providesBarcodeAdapterFactory$virtual_queue_lib_release(this.module, this.picassoUtilsProvider.get(), this.linkedGuestUtilsProvider.get(), this.facilityUtilsProvider.get(), this.qrCodeHelperProvider.get());
    }
}