package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.redeem.BarcodeAdapter;
import com.disney.wdpro.virtualqueue.p462ui.redeem.QRCodeHelper;
import com.disney.wdpro.virtualqueue.p462ui.redeem.RedeemAdapter;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0011¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/RedeemFragmentModule;", "", "()V", "providesBarcodeAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeAdapter$Factory;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "qrCodeHelper", "Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;", "providesBarcodeAdapterFactory$virtual_queue_lib_release", "providesRedeemAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/redeem/RedeemAdapter$Factory;", "barcodeAdapterFactory", "providesRedeemAdapterFactory$virtual_queue_lib_release", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public final class RedeemFragmentModule {
    public static final int $stable = 0;

    @Provides
    public final BarcodeAdapter.Factory providesBarcodeAdapterFactory$virtual_queue_lib_release(PicassoUtils picassoUtils, LinkedGuestUtils linkedGuestUtils, FacilityUtils facilityUtils, QRCodeHelper qrCodeHelper) {
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(qrCodeHelper, "qrCodeHelper");
        return new BarcodeAdapter.Factory(picassoUtils, linkedGuestUtils, facilityUtils, qrCodeHelper);
    }

    @Provides
    public final RedeemAdapter.Factory providesRedeemAdapterFactory$virtual_queue_lib_release(BarcodeAdapter.Factory barcodeAdapterFactory) {
        Intrinsics.checkNotNullParameter(barcodeAdapterFactory, "barcodeAdapterFactory");
        return new RedeemAdapter.Factory(barcodeAdapterFactory);
    }
}