package com.disney.wdpro.general_ticket_sales_ui.utils;

import com.disney.wdpro.base_sales_ui_lib.EntitlementType;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.C22462m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes28.dex */
public class EntitlementUpgradeAnalyticsManager extends AnalyticsManager {

    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.utils.EntitlementUpgradeAnalyticsManager$1 */
    static /* synthetic */ class C120311 {
        static final /* synthetic */ int[] $SwitchMap$com$disney$wdpro$base_sales_ui_lib$EntitlementType;

        static {
            int[] iArr = new int[EntitlementType.values().length];
            $SwitchMap$com$disney$wdpro$base_sales_ui_lib$EntitlementType = iArr;
            try {
                iArr[EntitlementType.THEME_PARK_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$disney$wdpro$base_sales_ui_lib$EntitlementType[EntitlementType.ANNUAL_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getConfirmationNextAction() {
        return TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_MAKE_FP_SELECTION;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getConfirmationState() {
        return TicketSalesAnalyticsConstants.TICKET_SALES_STATE_CONFIRMATION_DIGITAL_BUNDLE;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getOrderSummaryState() {
        return TicketSalesAnalyticsConstants.TICKET_SALES_STATE_ORDER_SUMMARY_DIGITAL_BUNDLE;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getPurchaseAction() {
        return TicketSalesAnalyticsConstants.TICKET_SALES_ACTION_PURCHASE_DIGITAL_BUNDLE;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public String getViewAndSignAgreementState() {
        return null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.utils.AnalyticsManager
    public Map<String, String> populateOrderSummaryTrackStateContext(SelectedTicketProducts selectedTicketProducts, List<TicketUpgradeEntitlement> list, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper, String str) {
        int i10 = 0;
        C22462m.m68673e(selectedTicketProducts != null, "Selected ticket products cannot be null.");
        C22462m.m68673e(list != null, "Entitlements cannot be null.");
        Map<String, String> mapPopulateOrderSummaryTrackStateContext = super.populateOrderSummaryTrackStateContext(selectedTicketProducts, list, ticketSalesAnalyticsHelper, str);
        Iterator<TicketUpgradeEntitlement> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = C120311.$SwitchMap$com$disney$wdpro$base_sales_ui_lib$EntitlementType[it.next().getEntitlementType().ordinal()];
            if (i12 == 1) {
                i11++;
            } else if (i12 == 2) {
                i10++;
            }
        }
        mapPopulateOrderSummaryTrackStateContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_PASSES, String.valueOf(i10));
        mapPopulateOrderSummaryTrackStateContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TOTAL_TICKETS, String.valueOf(i11));
        return mapPopulateOrderSummaryTrackStateContext;
    }
}