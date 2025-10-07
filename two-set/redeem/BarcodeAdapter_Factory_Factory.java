package com.disney.wdpro.virtualqueue.p462ui.redeem;

import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes20.dex */
public final class BarcodeAdapter_Factory_Factory implements InterfaceC30583e<BarcodeAdapter.Factory> {
    private final Provider<FacilityUtils> facilityUtilsProvider;
    private final Provider<LinkedGuestUtils> linkedGuestUtilsProvider;
    private final Provider<PicassoUtils> picassoUtilsProvider;
    private final Provider<QRCodeHelper> qrCodeHelperProvider;

    public BarcodeAdapter_Factory_Factory(Provider<PicassoUtils> provider, Provider<LinkedGuestUtils> provider2, Provider<FacilityUtils> provider3, Provider<QRCodeHelper> provider4) {
        this.picassoUtilsProvider = provider;
        this.linkedGuestUtilsProvider = provider2;
        this.facilityUtilsProvider = provider3;
        this.qrCodeHelperProvider = provider4;
    }

    public static BarcodeAdapter_Factory_Factory create(Provider<PicassoUtils> provider, Provider<LinkedGuestUtils> provider2, Provider<FacilityUtils> provider3, Provider<QRCodeHelper> provider4) {
        return new BarcodeAdapter_Factory_Factory(provider, provider2, provider3, provider4);
    }

    public static BarcodeAdapter.Factory newInstance(PicassoUtils picassoUtils, LinkedGuestUtils linkedGuestUtils, FacilityUtils facilityUtils, QRCodeHelper qRCodeHelper) {
        return new BarcodeAdapter.Factory(picassoUtils, linkedGuestUtils, facilityUtils, qRCodeHelper);
    }

    @Override // javax.inject.Provider
    public BarcodeAdapter.Factory get() {
        return newInstance(this.picassoUtilsProvider.get(), this.linkedGuestUtilsProvider.get(), this.facilityUtilsProvider.get(), this.qrCodeHelperProvider.get());
    }
}