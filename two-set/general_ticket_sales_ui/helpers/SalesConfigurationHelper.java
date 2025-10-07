package com.disney.wdpro.general_ticket_sales_ui.helpers;

import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commercecheckout.p076ui.factory.ConfirmationPresenterSection;
import com.disney.wdpro.commercecheckout.p076ui.factory.ReviewAndPurchasePresenterSection;
import com.disney.wdpro.commercecheckout.p076ui.fragments.AnalyticsConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.ConfirmationConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.ReviewAndPurchaseConfiguration;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.universal_checkout_ui.analytics.UniversalCheckoutAnalyticsConfiguration;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public class SalesConfigurationHelper {

    @Inject
    C9248i vendomatic;

    @Inject
    SalesConfigurationHelper() {
    }

    public AnalyticsConfiguration getAnalyticsConfiguration(boolean z10) {
        return new AnalyticsConfiguration("TktSales", TicketSalesAnalyticsConstants.TICKET_SALES_STATE, z10);
    }

    public ConfirmationConfiguration getConfirmationConfiguration() {
        ConfirmationConfiguration.Builder builderAddSection = new ConfirmationConfiguration.Builder().addSection(ConfirmationPresenterSection.TICKET_BRICK).addSection(ConfirmationPresenterSection.ORDER_PENDING).addSection(ConfirmationPresenterSection.CONGRATULATIONS).addSection(ConfirmationPresenterSection.TICKET_INSTRUCTIONS).addSection(ConfirmationPresenterSection.BLOCKOUT_CALENDAR).addSection(ConfirmationPresenterSection.CONFIRMATION_EXIT_CTA).addSection(ConfirmationPresenterSection.PRICE_AND_PAYMENT_INFO).addSection(ConfirmationPresenterSection.FINE_PRINT);
        builderAddSection.withResetEntryPoint();
        return builderAddSection.build();
    }

    public ReviewAndPurchaseConfiguration getReviewAndPurchaseConfiguration() {
        ReviewAndPurchaseConfiguration.Builder builderAddSection = new ReviewAndPurchaseConfiguration.Builder().withAssignTickets(true).withResetEntryPoint().withResetFlowEnabled().withSalesChatButton(this.vendomatic.m38811z1()).addSection(ReviewAndPurchasePresenterSection.SUMMARY).addSection(ReviewAndPurchasePresenterSection.ASSIGN_GUEST);
        builderAddSection.addSection(ReviewAndPurchasePresenterSection.PAYMENT_WIDGET);
        builderAddSection.addSection(ReviewAndPurchasePresenterSection.TOTAL);
        return builderAddSection.build();
    }

    public UniversalCheckoutAnalyticsConfiguration getUCAnalyticsConfiguration() {
        return new UniversalCheckoutAnalyticsConfiguration("TktSales", TicketSalesAnalyticsConstants.TICKET_SALES_STATE);
    }
}