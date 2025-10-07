package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.virtualqueue.themer.VQUrlType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LottieLoader;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "setLoaderAnimationUrl", "", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class LottieLoader extends LottieAnimationView {
    public static final int $stable = 8;
    private final VirtualQueueThemer vqThemer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieLoader(Context context, VirtualQueueThemer vqThemer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.vqThemer = vqThemer;
    }

    public final void setLoaderAnimationUrl(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        VQUrlType vQUrlType = VQUrlType.CommonLoadingAnimUrl;
        if (VirtualQueueThemer.getUrl$default(virtualQueueThemer, vQUrlType, null, 2, null).length() > 0) {
            view.setAnimationFromUrl(VirtualQueueThemer.getUrl$default(this.vqThemer, vQUrlType, null, 2, null));
        }
    }
}