package com.disney.wdpro.photopass_plus.activities;

import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.base_sales_ui_lib.providers.DLRCommerceCheckoutResourceProvider;
import com.disney.wdpro.bookingservices.model.Currency;
import com.disney.wdpro.bookingservices.model.PhotopassCheckoutBody;
import com.disney.wdpro.bookingservices.model.PolicyItem;
import com.disney.wdpro.bookingservices.model.Price;
import com.disney.wdpro.commercecheckout.p076ui.activities.CheckoutActivity;
import com.disney.wdpro.commercecheckout.p076ui.config.CheckoutConfig;
import com.disney.wdpro.commercecheckout.p076ui.config.ExitCtaAction;
import com.disney.wdpro.commercecheckout.p076ui.factory.ConfirmationPresenterSection;
import com.disney.wdpro.commercecheckout.p076ui.factory.ReviewAndPurchasePresenterSection;
import com.disney.wdpro.commercecheckout.p076ui.fragments.AnalyticsConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.ConfirmationConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.ReviewAndPurchaseConfiguration;
import com.disney.wdpro.commercecheckout.p076ui.fragments.modules.providers.CommerceCheckoutResourceProvider;
import com.disney.wdpro.commercecheckout.p076ui.fragments.modules.providers.WdwCommerceCheckoutResourceProvider;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes15.dex */
final class CommerceCheckoutIntentProvider {
    private static final SimpleDateFormat BRICK_DATE_FORMAT = new SimpleDateFormat("EEEE, MMM dd, yyyy");
    private static final String BRICK_SELECTED_DATE_FORMAT = "EEEE, MMM dd, yyyy";
    private static final String LINE_BREAK_FORMAT = "%n%n";
    private static final int ONE_SELECTED_DAY = 1;
    private static final String PHOTO_PASS_STEM = "commerce/photopass/";

    private CommerceCheckoutIntentProvider() {
    }

    private static CheckoutConfig buildCheckoutConfig(Context context, SelectedTicketProducts selectedTicketProducts, Calendar calendar, CapturedMediaInfo capturedMediaInfo, String str, String str2, PhotopassCheckoutBody.AnalyticsContextData analyticsContextData, boolean z10) {
        String guestMediaId = capturedMediaInfo != null ? capturedMediaInfo.getGuestMediaId() : null;
        ArrayList arrayListM69268i = Lists.m69268i();
        List<PolicyItem> listBuildImportantDetails = buildImportantDetails(selectedTicketProducts);
        for (int i10 = 0; i10 < selectedTicketProducts.getNumberOfAllAgesTickets(); i10++) {
            arrayListM69268i.add(new PhotopassCheckoutBody.TicketOrderItem(selectedTicketProducts.getAllAgesProductInstanceId().get(), selectedTicketProducts.getDtiStoreId(), selectedTicketProducts.getAllAgesCategoryId().get(), guestMediaId, transformPrice(selectedTicketProducts.getCombinedTotal()), transformPrice(selectedTicketProducts.getCombinedTax()), listBuildImportantDetails));
        }
        return new CheckoutConfig.Builder().setCheckoutBody(new PhotopassCheckoutBody(selectedTicketProducts.getDestinationId().getId(), false, selectedTicketProducts.getWebStoreId().getId(), arrayListM69268i, analyticsContextData)).setSellableOnDate(calendar).setReviewAndPurchaseConfiguration(getReviewAndPurchaseConfiguration()).setConfirmationConfiguration(getConfirmationConfiguration()).setCommerceCheckoutResourceProvider(getCommerceCheckoutResourceProvider(context, selectedTicketProducts, str, capturedMediaInfo, str2)).setAnalyticsConfiguration(getAnalyticsConfiguration(z10)).build();
    }

    private static ExitCtaAction buildExitCtaAction(Context context) {
        return new ExitCtaAction.Builder().setText(context.getString(C18785R.string.order_confirmation_go_to_gallery)).setActionForAnalytics(PhotoPassAnalyticsConstants.PHOTO_PASS_ACTION_RETURN_GALLERY).build();
    }

    private static List<PolicyItem> buildImportantDetails(SelectedTicketProducts selectedTicketProducts) {
        ArrayList arrayList = new ArrayList();
        AbstractC22726b3<Policy> it = selectedTicketProducts.getMatchingPolicies(ImmutableSet.m69130of(PolicyGroup.TERMS_OF_USE), ImmutableSet.m69130of(PolicyGroup.PolicySubGroup.MATCH_ALL)).iterator();
        while (it.hasNext()) {
            String str = it.next().getPolicyDescriptionMap().get(PolicyGroup.PolicyDescriptionKey.TERMS_OF_USE_DESCRIPTION);
            if (str != null) {
                arrayList.add(new PolicyItem("", str.replace("\\\\", ""), null));
            }
        }
        return arrayList;
    }

    private static AnalyticsConfiguration getAnalyticsConfiguration(boolean z10) {
        return new AnalyticsConfiguration("PhotoPass", PHOTO_PASS_STEM, z10);
    }

    private static CommerceCheckoutResourceProvider getCommerceCheckoutResourceProvider(Context context, SelectedTicketProducts selectedTicketProducts, String str, CapturedMediaInfo capturedMediaInfo, String str2) {
        String title;
        String subCaption;
        String caption;
        String strConcat = str.concat(LINE_BREAK_FORMAT).concat(context.getString(C18785R.string.photo_pass_order_confirmation_message));
        boolean zIsDLR = WebStoreId.isDLR(selectedTicketProducts.getWebStoreId());
        DisplayNames displayNames = selectedTicketProducts.getTicketDisplayNames().get();
        if (displayNames.getTicketTitle().isPresent()) {
            DisplayNames.TicketTitle ticketTitle = displayNames.getTicketTitle().get();
            DisplayNameMap.Type type = DisplayNameMap.Type.PLAIN_TEXT;
            title = ticketTitle.getTitle(type);
            caption = ticketTitle.getCaption(type);
            subCaption = ticketTitle.getSubCaption(type);
        } else {
            title = null;
            subCaption = null;
            caption = null;
        }
        String str3 = (capturedMediaInfo == null || selectedTicketProducts.getNumberOfSelectedDays().intValue() != 1) ? "" : BRICK_DATE_FORMAT.format(Long.valueOf(capturedMediaInfo.getCaptureDate().getTime()));
        CommerceCheckoutResourceProvider.Builder commerceResourceProvider = zIsDLR ? DLRCommerceCheckoutResourceProvider.getCommerceResourceProvider(context) : WdwCommerceCheckoutResourceProvider.getCommerceResourceProvider(context);
        if (!str2.isEmpty()) {
            commerceResourceProvider.setTermsAndConditionsCheck(context.getString(C18785R.string.photopass_terms_and_conditions_check).concat(str2));
        }
        return commerceResourceProvider.setPhotopassSummaryTagline(caption).setImportantDetailsHeader(context.getString(C18785R.string.photopass_commerce_checkout_important_details_header)).setBookedHeader(context.getString(C18785R.string.ticket_sales_order_confirmation_title)).setPhotopassSummaryTitle(title).setPhotopassSummaryDescription(subCaption).setOrderPendingHeader(context.getString(C18785R.string.ticket_sales_order_confirmation_pending_header)).setOrderPendingText(context.getString(C18785R.string.order_confirmation_pending_text)).setShowRefundableDisclaimer(false).setCongratulationsSubheader(context.getString(C18785R.string.order_confirmation_number)).setCongratulationsText(strConcat).setShowDeliveryMethodDescription(true).setReviewAndPurchaseTitle(context.getString(C18785R.string.photopass_commerce_checkout_review_and_purchase_title)).setPurchaseButtonText(context.getString(C18785R.string.purchase_button_text)).setConfirmationFinePrintDeltaDefault(!zIsDLR).setConfirmationFinePrintDLR(zIsDLR).setLoadingMessages(getLoadingMessages(context)).setPhotopassSummaryDate(str3).build();
    }

    private static ConfirmationConfiguration getConfirmationConfiguration() {
        return new ConfirmationConfiguration.Builder().addSection(ConfirmationPresenterSection.PHOTOPASS_SUMMARY).addSection(ConfirmationPresenterSection.ORDER_PENDING).addSection(ConfirmationPresenterSection.CONGRATULATIONS).addSection(ConfirmationPresenterSection.TICKET_INSTRUCTIONS).addSection(ConfirmationPresenterSection.PRICE_AND_PAYMENT_INFO).addSection(ConfirmationPresenterSection.MY_PHOTOS_EXIT_CTA).build();
    }

    static Intent getIntent(Context context, SelectedTicketProducts selectedTicketProducts, Calendar calendar, String str, CapturedMediaInfo capturedMediaInfo, String str2, PhotopassCheckoutBody.AnalyticsContextData analyticsContextData, boolean z10) {
        return CheckoutActivity.createIntent(context, buildCheckoutConfig(context, selectedTicketProducts, calendar, capturedMediaInfo, str2, str, analyticsContextData, z10), buildExitCtaAction(context), null);
    }

    private static List<String> getLoadingMessages(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getString(C18785R.string.order_summary_purchase_spinner_text_purchasing));
        arrayList.add(context.getString(C18785R.string.order_summary_purchase_spinner_text_verifying_order));
        return arrayList;
    }

    private static ReviewAndPurchaseConfiguration getReviewAndPurchaseConfiguration() {
        return new ReviewAndPurchaseConfiguration.Builder().withAssignTickets(true).withResetEntryPoint().withResidencyValidation(true).withResetFlowEnabled().withErrorBannerRetryButton().addSection(ReviewAndPurchasePresenterSection.PHOTOPASS_SUMMARY).addSection(ReviewAndPurchasePresenterSection.PAYMENT_WIDGET).addSection(ReviewAndPurchasePresenterSection.TOTAL).build();
    }

    private static Price transformPrice(Optional<com.disney.wdpro.ticket_sales_base_lib.business.Price> optional) {
        if (optional.isPresent()) {
            return new Price(Currency.USD, optional.get().getValue());
        }
        return null;
    }
}