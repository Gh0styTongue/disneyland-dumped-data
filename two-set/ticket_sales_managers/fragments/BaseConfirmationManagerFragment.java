package com.disney.wdpro.ticket_sales_managers.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.DeliveryOption;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager;
import com.disney.wdpro.ticket_sales_managers.p451di.TicketSalesManagersComponent;
import com.disney.wdpro.ticket_sales_managers.p451di.TicketSalesManagersProvider;
import java.text.DateFormat;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public abstract class BaseConfirmationManagerFragment extends BaseConfirmationFragment {
    private static final String SAVE_ORDER_CONFIRMATION = "SAVE_ORDER_CONFIRMATION";
    protected PurchaseConfirmation confirmation;
    private GeneralTicketSalesCheckoutManager ticketSalesCheckoutManager;
    private TicketSalesManagersComponent ticketSalesManagersComponent;

    @Inject
    protected C9248i vendomatic;

    public static final class ConfirmationTitles {
        private final int bookedTitleResourceId;
        private final int pendingTitleResourceId;

        public ConfirmationTitles(int i10, int i11) {
            this.bookedTitleResourceId = i10;
            this.pendingTitleResourceId = i11;
        }
    }

    public interface NextCallToActionUiHelper {
        void updateNextCallToActionUi(PurchaseConfirmation purchaseConfirmation);
    }

    public interface OrderPlacedUiHelper {
        void updateOrderPlacedUi(PurchaseConfirmation purchaseConfirmation);
    }

    public static final class TextViewPair {
        private final CharSequence text;
        private final TextView textView;

        public TextViewPair(TextView textView, CharSequence charSequence) {
            this.textView = textView;
            this.text = charSequence;
        }

        public static TextViewPair create(TextView textView, CharSequence charSequence) {
            return new TextViewPair(textView, charSequence);
        }
    }

    private String formatDescription(String str) {
        return str.replaceAll("\\\\\\\\n", " <br /> ");
    }

    private void renderOrderConfirmation(PurchaseConfirmation purchaseConfirmation) {
        BookingStatus orderStatus = purchaseConfirmation.getOrderStatus();
        if (orderStatus != BookingStatus.BOOKED && orderStatus != BookingStatus.PENDED) {
            throw new IllegalStateException("Wrong Booking status: " + orderStatus);
        }
        setTitle(purchaseConfirmation);
        getOrderPlacedHelper().updateOrderPlacedUi(purchaseConfirmation);
        updateConfirmationNumberUi(purchaseConfirmation);
        updateDeliveryInstructionsUi(purchaseConfirmation);
        updateConfirmationDate();
        updatePricePaymentSummaryUi(purchaseConfirmation);
        updateNextCallToActionUi(purchaseConfirmation);
        renderRemainingUi(purchaseConfirmation);
    }

    private void setTitle(PurchaseConfirmation purchaseConfirmation) {
        ConfirmationTitles confirmationTitles = getConfirmationTitles(purchaseConfirmation);
        setTitle(getText(purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED ? confirmationTitles.bookedTitleResourceId : confirmationTitles.pendingTitleResourceId));
    }

    private void updateConfirmationDate() {
        setConfirmationDate(getString(C21167R.string.ticket_sales_order_confirmation_payment_date_value, DateFormat.getDateInstance(1).format(this.confirmation.getBookingDate().getTime())));
    }

    private void updateConfirmationNumberUi(PurchaseConfirmation purchaseConfirmation) {
        updateConfirmationNumberUi(purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED ? formatConfirmationNumbers(purchaseConfirmation) : null);
    }

    private void updateDeliveryInstructionsUi(PurchaseConfirmation purchaseConfirmation) {
        CharSequence deliveryInstructionsBodySpanned;
        String confirmationNumbers = formatConfirmationNumbers(purchaseConfirmation);
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED && purchaseConfirmation.getWillCallDeliveryMethodDescription().isPresent()) {
            DeliveryOption.DisplayDeliveryMethodDescription displayDeliveryMethodDescription = purchaseConfirmation.getWillCallDeliveryMethodDescription().get();
            String strTrim = displayDeliveryMethodDescription.getHeader().isPresent() ? Html.fromHtml(displayDeliveryMethodDescription.getHeader().get()).toString().trim() : null;
            deliveryInstructionsBodySpanned = displayDeliveryMethodDescription.getBody().isPresent() ? getDeliveryInstructionsBodySpanned(formatDescription(displayDeliveryMethodDescription.getBody().get()), confirmationNumbers) : null;
            charSequence = strTrim;
        } else {
            deliveryInstructionsBodySpanned = null;
        }
        updateDeliveryInstructionsUi(charSequence, deliveryInstructionsBodySpanned, confirmationNumbers);
    }

    protected final String formatConfirmationNumbers(PurchaseConfirmation purchaseConfirmation) {
        if (purchaseConfirmation.getConfirmationNumbers().isPresent()) {
            return TextUtils.join(", ", purchaseConfirmation.getConfirmationNumbers().get());
        }
        return null;
    }

    protected abstract BaseCreditCardInformation getCCInfo();

    protected abstract ConfirmationTitles getConfirmationTitles(PurchaseConfirmation purchaseConfirmation);

    protected abstract CharSequence getDeliveryInstructionsBodySpanned(String str, String str2);

    protected abstract OrderPlacedUiHelper getOrderPlacedHelper();

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.confirmation = (PurchaseConfirmation) bundle.getSerializable(SAVE_ORDER_CONFIRMATION);
        } else {
            this.confirmation = this.ticketSalesCheckoutManager.getPurchaseConfirmation(getTicketOrderFormId());
            getTicketOrderFormId();
            this.ticketSalesCheckoutManager.removeSessionFromStorage(getTicketOrderFormId().longValue());
        }
        renderOrderConfirmation(this.confirmation);
        sendAnalyticsOrderConfirmationState(this.confirmation, getSelectedTicketProducts());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((TicketSalesManagersProvider) activity.getApplication()).getTicketSalesManagersComponent().inject(this);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TicketSalesManagersComponent ticketSalesManagersComponent = ((TicketSalesManagersProvider) getActivity().getApplication()).getTicketSalesManagersComponent();
        this.ticketSalesManagersComponent = ticketSalesManagersComponent;
        this.ticketSalesCheckoutManager = ticketSalesManagersComponent.getTicketSalesCheckoutManager();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable(SAVE_ORDER_CONFIRMATION, this.confirmation);
    }

    protected abstract void renderRemainingUi(PurchaseConfirmation purchaseConfirmation);

    protected abstract void sendAnalyticsOrderConfirmationState(PurchaseConfirmation purchaseConfirmation, SelectedTicketProducts selectedTicketProducts);

    protected abstract void setConfirmationDate(CharSequence charSequence);

    protected abstract void updateConfirmationNumberUi(String str);

    protected abstract void updateDeliveryInstructionsUi(CharSequence charSequence, CharSequence charSequence2, String str);

    protected final void updateHeaderBodyUi(TextViewPair textViewPair, TextViewPair textViewPair2, View view) {
        boolean z10;
        if (textViewPair2.text != null) {
            if (textViewPair.text != null) {
                textViewPair.textView.setText(textViewPair.text);
                textViewPair.textView.setVisibility(0);
            } else {
                textViewPair.textView.setVisibility(8);
            }
            Spanned spannedFromHtml = Html.fromHtml(textViewPair2.text.toString(), 0);
            String strReplace = spannedFromHtml.toString().replace(getString(C21167R.string.ticket_sales_accessibility_fastpass_name), getString(C21167R.string.ticket_sales_accessibility_fastpass_name_divided));
            textViewPair2.textView.setText(spannedFromHtml);
            textViewPair2.textView.setContentDescription(strReplace);
            textViewPair2.textView.setMovementMethod(LinkMovementMethod.getInstance());
            textViewPair2.textView.setVisibility(0);
            z10 = true;
        } else {
            textViewPair2.textView.setVisibility(8);
            textViewPair.textView.setVisibility(8);
            z10 = false;
        }
        if (view != null) {
            if (z10) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    protected abstract void updateNextCallToActionUi(PurchaseConfirmation purchaseConfirmation);

    protected void updatePricePaymentSummaryUi(PurchaseConfirmation purchaseConfirmation) {
        getCCInfo().updateCCInfo(purchaseConfirmation.getPaymentUsed().orNull(), purchaseConfirmation.getAmountPaid(), purchaseConfirmation.getOrderStatus(), this.vendomatic.m38778o0());
    }
}