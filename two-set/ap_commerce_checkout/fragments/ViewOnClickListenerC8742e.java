package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;

/* renamed from: com.disney.wdpro.ap_commerce_checkout.fragments.e */
/* loaded from: classes23.dex */
public final /* synthetic */ class ViewOnClickListenerC8742e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TicketSalesAnalyticsHelper f29270b;

    public /* synthetic */ ViewOnClickListenerC8742e(TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        ticketSalesAnalyticsHelper = ticketSalesAnalyticsHelper;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f29269a.lambda$createTicketBrickUiHelper$4(ticketSalesAnalyticsHelper, view);
    }
}