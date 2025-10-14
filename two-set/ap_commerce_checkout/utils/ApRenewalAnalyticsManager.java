package com.disney.wdpro.ap_commerce_checkout.utils;

import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager;

/* loaded from: classes23.dex */
public class ApRenewalAnalyticsManager extends AnalyticsManager {
    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getConfirmationNextAction() {
        return "TktsAndPass";
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getConfirmationState() {
        return TicketSalesAnalyticsConstants.ANNUAL_PASSES_STATE_PURCHASE_CONFIRMATION;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getOrderSummaryState() {
        return TicketSalesAnalyticsConstants.ANNUAL_PASS_STATE_CONFIRM_AND_PURCHASE;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getPurchaseAction() {
        return "Purchase";
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getViewAndSignAgreementState() {
        return TicketSalesAnalyticsConstants.ANNUAL_PASS_RENEWALS_STATE_SIGN_AGREEMENT;
    }
}