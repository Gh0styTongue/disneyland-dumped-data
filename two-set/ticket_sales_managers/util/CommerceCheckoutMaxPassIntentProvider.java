package com.disney.wdpro.ticket_sales_managers.util;

import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.base_sales_ui_lib.EntitlementType;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.bookingservices.model.PolicyItem;
import com.disney.wdpro.bookingservices.model.maxpass.MaxPassCardInfo;
import com.disney.wdpro.bookingservices.model.maxpass.MaxPassCheckoutBody;
import com.disney.wdpro.bookingservices.model.maxpass.MaxPassOrderItem;
import com.disney.wdpro.commercecheckout.p076ui.activities.CheckoutLauncher;
import com.disney.wdpro.commercecheckout.p076ui.config.CheckoutConfig;
import com.disney.wdpro.commercecheckout.p076ui.config.ExitCtaAction;
import com.disney.wdpro.commercecheckout.p076ui.factory.ConfirmationPresenterSection;
import com.disney.wdpro.commercecheckout.p076ui.factory.ReviewAndPurchasePresenterSection;
import com.disney.wdpro.commercecheckout.p076ui.fragments.AnalyticsConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.ConfirmationConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.ReviewAndPurchaseConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.modules.providers.DlrCommerceCheckoutResourceProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyDescription;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProduct;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProductGroup;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class CommerceCheckoutMaxPassIntentProvider {
    private int maxEntitlementsToUpgrade;

    @Inject
    public CommerceCheckoutMaxPassIntentProvider() {
    }

    private CheckoutConfig buildCheckoutConfig(MaxPassProductGroup maxPassProductGroup, Context context, ImmutableSortedSet<TicketUpgradeEntitlement> immutableSortedSet, Calendar calendar, boolean z10) {
        return new CheckoutConfig.Builder().setReviewAndPurchaseConfiguration(getReviewAndPurchaseConfiguration()).setConfirmationConfiguration(getConfirmationConfiguration()).setAnalyticsConfiguration(getAnalyticsConfiguration(z10)).setCheckoutBody(createMaxPassCheckoutBody(maxPassProductGroup, immutableSortedSet)).setSellableOnDate(calendar).setCommerceCheckoutResourceProvider(DlrCommerceCheckoutResourceProvider.getCommerceResourceProvider(context).setReviewAndPurchaseTitle(context.getString(C21167R.string.review_and_purchase_title)).setPurchaseButtonText(context.getString(C21167R.string.purchase_button_text)).setShowTicketBrickAgeGroup(true).build()).build();
    }

    private ExitCtaAction buildExitCtaAction(ImmutableSortedSet<TicketUpgradeEntitlement> immutableSortedSet) {
        return new ExitCtaAction.Builder().setTextResource(immutableSortedSet.size() > this.maxEntitlementsToUpgrade ? C21167R.string.continue_button : C21167R.string.ticket_sales_order_confirmation_make_fast_pass_selection).setActionForAnalytics("MyTickets").build();
    }

    private MaxPassCheckoutBody createMaxPassCheckoutBody(MaxPassProductGroup maxPassProductGroup, ImmutableSortedSet<TicketUpgradeEntitlement> immutableSortedSet) {
        if (maxPassProductGroup.getMaxPassProductList().isEmpty()) {
            throw new IllegalArgumentException("The MaxPass product list should not be empty");
        }
        List<MaxPassOrderItem> listCreateMaxPassOrderItemList = createMaxPassOrderItemList(maxPassProductGroup, immutableSortedSet);
        MaxPassCardInfo maxPassCardInfo = new MaxPassCardInfo(maxPassProductGroup.getTitleHtml(), maxPassProductGroup.getSubTitleHtml(), maxPassProductGroup.getPricePerItem(), maxPassProductGroup.getCurrency(), 1);
        Iterator<MaxPassProduct> it = maxPassProductGroup.getMaxPassProductList().iterator();
        while (it.hasNext()) {
            for (Policy policy : it.next().getPolicyList()) {
                if (PolicyGroup.TERMS_OF_USE.equals(policy.getGroup())) {
                    for (PolicyDescription policyDescription : policy.getDescriptions().values()) {
                        maxPassCardInfo.addPolicy(policyDescription.getKey(), new PolicyItem("", policyDescription.getText(), null));
                    }
                }
            }
        }
        return new MaxPassCheckoutBody(maxPassProductGroup.getDestinationId(), maxPassProductGroup.getStoreId(), WebStoreId.DLR_MOBILE.name(), listCreateMaxPassOrderItemList, Maps.m69381r(), maxPassCardInfo);
    }

    private List<MaxPassOrderItem> createMaxPassOrderItemList(MaxPassProductGroup maxPassProductGroup, ImmutableSortedSet<TicketUpgradeEntitlement> immutableSortedSet) {
        ArrayList arrayListM69268i = Lists.m69268i();
        int i10 = 0;
        MaxPassProduct maxPassProduct = maxPassProductGroup.getMaxPassProductList().get(0);
        AbstractC22726b3<TicketUpgradeEntitlement> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            TicketUpgradeEntitlement next = it.next();
            arrayListM69268i.add(new MaxPassOrderItem.Builder(maxPassProduct.getProductInstanceId(), next.getTicketAssignmentLabel(), 1).withProductSKU(maxPassProduct.getProductSKU()).withPerItemSubtotal(maxPassProductGroup.getPricePerItem()).setAnnualPass(EntitlementType.ANNUAL_PASS.equals(next.getEntitlementType())).withAgeGroup(AgeGroup.ALL_AGES.name()).withEntitlementId(next.getEntitlementId()).build());
            i10++;
            if (i10 >= this.maxEntitlementsToUpgrade) {
                break;
            }
        }
        return arrayListM69268i;
    }

    private AnalyticsConfiguration getAnalyticsConfiguration(boolean z10) {
        return new AnalyticsConfiguration(TicketSalesAnalyticsConstants.STANDALONE_FP_SALES_FLOW, TicketSalesAnalyticsConstants.STANDALONE_FP_SALES_APP_CHECKOUT, z10);
    }

    private ConfirmationConfiguration getConfirmationConfiguration() {
        return new ConfirmationConfiguration.Builder().addSection(ConfirmationPresenterSection.MAX_PASS_TICKET_BRICK).addSection(ConfirmationPresenterSection.ORDER_PENDING).addSection(ConfirmationPresenterSection.CONGRATULATIONS).addSection(ConfirmationPresenterSection.MAX_PASS_USABILITY_INFO).addSection(ConfirmationPresenterSection.PRICE_AND_PAYMENT_INFO).addSection(ConfirmationPresenterSection.MAX_PASS_EXIT_CTA).withResetEntryPoint().build();
    }

    private C8666f getExitNavigationIntent() {
        return null;
    }

    private ReviewAndPurchaseConfiguration getReviewAndPurchaseConfiguration() {
        ReviewAndPurchaseConfiguration.Builder builderWithErrorBannerRetryButton = new ReviewAndPurchaseConfiguration.Builder().withAssignTickets(true).withResetEntryPoint().withResidencyValidation(true).withResetFlowEnabled().withErrorBannerRetryButton();
        builderWithErrorBannerRetryButton.addSection(ReviewAndPurchasePresenterSection.MAXPASS_CARD_SUMMARY);
        builderWithErrorBannerRetryButton.addSection(ReviewAndPurchasePresenterSection.MAXPASS_GUESTS);
        builderWithErrorBannerRetryButton.addSection(ReviewAndPurchasePresenterSection.PAYMENT_WIDGET);
        builderWithErrorBannerRetryButton.addSection(ReviewAndPurchasePresenterSection.MAX_PASS_TOTAL);
        return builderWithErrorBannerRetryButton.build();
    }

    public Intent getIntent(MaxPassProductGroup maxPassProductGroup, Context context, ImmutableSortedSet<TicketUpgradeEntitlement> immutableSortedSet, int i10, Calendar calendar, boolean z10) {
        this.maxEntitlementsToUpgrade = i10;
        return new CheckoutLauncher(context, buildCheckoutConfig(maxPassProductGroup, context, immutableSortedSet, calendar, z10), buildExitCtaAction(immutableSortedSet)).buildCheckoutIntent();
    }
}