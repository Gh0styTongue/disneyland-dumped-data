package com.disney.wdpro.ticket_sales_managers.fragments;

import android.os.Bundle;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorType;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.httpclient.C13323a0;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.DirtyWordFoundException;
import com.disney.wdpro.ticket_sales_managers.C21167R;
import com.disney.wdpro.ticket_sales_managers.CreateTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager;
import com.disney.wdpro.ticket_sales_managers.PurchaseTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.p451di.TicketSalesManagersProvider;
import com.google.common.base.C22466q;
import com.squareup.otto.Subscribe;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes19.dex */
public abstract class BaseOrderSummaryManagersFragment extends BaseOrderSummaryFragment {
    protected GeneralTicketSalesCheckoutManager ticketSalesCheckoutManager;

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected final TicketOrderForm buildNewOrderForm() {
        return buildOrder(this.ticketSalesCheckoutManager, this.selectedTicketProducts);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected final void cancelOldOrders() {
        SelectedTicketProducts selectedTicketProducts = this.selectedTicketProducts;
        if (selectedTicketProducts != null) {
            this.ticketSalesCheckoutManager.cancelOldOrders(selectedTicketProducts.getSessionId(), this.selectedTicketProducts.getSellableOnDate().orNull());
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void createOrderOnServer() {
        if (this.ticketSalesCheckoutManager.getSafeOrderId(Long.valueOf(getTicketOrderForm().getFormId())) == null) {
            this.ticketSalesCheckoutManager.createTicketOrder(getTicketOrderForm(), this.productCategoryDetails);
            startProgressCreateOrder();
        }
    }

    protected abstract BookingApiErrorMessageInterface getErrorMessageProvider();

    protected boolean isBookingStatusValidToNavigateToConfirmationScreen(BookingStatus bookingStatus) {
        return bookingStatus == BookingStatus.BOOKED || bookingStatus == BookingStatus.PENDED;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ticketSalesCheckoutManager = ((TicketSalesManagersProvider) getActivity().getApplication()).getTicketSalesManagersComponent().getTicketSalesCheckoutManager();
    }

    @Subscribe
    public void onCreateTicketOrderEvent(CreateTicketOrderEvent createTicketOrderEvent) {
        Integer numValueOf;
        List<C13323a0.a> errors;
        long jLongValue = createTicketOrderEvent.getOrderFormId().longValue();
        if (getTicketOrderForm() == null || getTicketOrderForm().getFormId() != jLongValue) {
            return;
        }
        stopProgressCreateOrder();
        if (isFragmentClosing()) {
            return;
        }
        if (createTicketOrderEvent.isSuccess()) {
            createTicketOrderEvent.getOrderFormId();
            renderTicketOrderForm();
            return;
        }
        String string = getString(C21167R.string.ticket_sales_try_again_title);
        String str = this.formatters.helpDeskPhoneNumberFormatter.format(getString(getCommonErrorMessageResource()));
        if (createTicketOrderEvent.getThrowable() == null || !(createTicketOrderEvent.getThrowable() instanceof UnSuccessStatusException)) {
            numValueOf = null;
        } else {
            C13323a0 error = ((UnSuccessStatusException) createTicketOrderEvent.getThrowable()).getError();
            if (error != null && (errors = error.getErrors()) != null && !errors.isEmpty()) {
                C13323a0.a aVar = errors.get(0);
                if (aVar.getSystemErrorCode() != null && aVar.getSystemErrorCode().equals("072102")) {
                    str = this.formatters.helpDeskPhoneNumberFormatter.format(getString(getNotAdultErrorMessageResource()));
                }
            }
            numValueOf = Integer.valueOf(((UnSuccessStatusException) createTicketOrderEvent.getThrowable()).getStatusCode());
        }
        String str2 = str;
        Integer num = numValueOf;
        displayErrors(string, str2, BaseOrderSummaryFragment.FragmentStateOnError.CLOSE, false, false, getString(C21167R.string.common_ok), null);
        trackCreateOrderError(string, str2, num);
        createTicketOrderEvent.getOrderFormId();
        createTicketOrderEvent.getThrowable();
    }

    @Subscribe
    public void onPurchaseTicketOrderEvent(PurchaseTicketOrderEvent purchaseTicketOrderEvent) {
        BaseOrderSummaryManagersFragment baseOrderSummaryManagersFragment;
        long ticketOrderFormId = purchaseTicketOrderEvent.getTicketOrderFormId();
        if (isVisible()) {
            getActivity().getWindow().clearFlags(128);
        }
        if (getTicketOrderForm() == null || getTicketOrderForm().getFormId() != ticketOrderFormId || isFragmentClosing() || !getActionListener().isInPurchaseFlow()) {
            return;
        }
        boolean z10 = true;
        if (purchaseTicketOrderEvent.isSuccess()) {
            purchaseTicketOrderEvent.getTicketOrderFormId();
            if (isBookingStatusValidToNavigateToConfirmationScreen(this.ticketSalesCheckoutManager.getCurrentBookingStatus(getTicketOrderForm()))) {
                baseOrderSummaryManagersFragment = this;
                z10 = false;
            } else {
                String string = getString(C21167R.string.ticket_sales_try_again_title);
                String string2 = this.purchaseFlowType == PurchaseFlowType.PURCHASE_STANDALONE_FP ? getString(C21167R.string.ticket_sales_max_pass_pending_error) : this.formatters.helpDeskPhoneNumberFormatter.format(getString(getCommonErrorMessageResource()));
                trackPurchaseOrderError(string, string2, (purchaseTicketOrderEvent.getThrowable() == null || !(purchaseTicketOrderEvent.getThrowable() instanceof UnSuccessStatusException)) ? null : Integer.valueOf(((UnSuccessStatusException) purchaseTicketOrderEvent.getThrowable()).getStatusCode()));
                baseOrderSummaryManagersFragment = this;
                baseOrderSummaryManagersFragment.displayErrors(string, string2, BaseOrderSummaryFragment.FragmentStateOnError.KEEP_OPEN, false, true, getString(C21167R.string.common_ok), null);
                purchaseTicketOrderEvent.getTicketOrderFormId();
            }
        } else {
            baseOrderSummaryManagersFragment = this;
            baseOrderSummaryManagersFragment.parseAndDisplayErrors(purchaseTicketOrderEvent.getThrowable(), BaseOrderSummaryFragment.FragmentStateOnError.KEEP_OPEN);
            purchaseTicketOrderEvent.getTicketOrderFormId();
            purchaseTicketOrderEvent.getThrowable();
        }
        baseOrderSummaryManagersFragment.clearCVV2FromSelectedPaymentMethod();
        if (z10) {
            baseOrderSummaryManagersFragment.stopProgressPurchaseTicketOrder();
            baseOrderSummaryManagersFragment.updateCCButtonVisibilities();
            baseOrderSummaryManagersFragment.setPurchaseTicketButtonVisibility(0, false);
        } else {
            baseOrderSummaryManagersFragment.moveToConfirmationScreen();
            baseOrderSummaryManagersFragment.getActionListener().cleanupData();
        }
        baseOrderSummaryManagersFragment.getActionListener().setIsInPurchaseFlow(false);
    }

    protected final void parseAndDisplayErrors(Throwable th2, BaseOrderSummaryFragment.FragmentStateOnError fragmentStateOnError) {
        BookingApiErrorMessageInterface.ErrorMessage message = getErrorMessageProvider().getMessage(BookingApiErrorType.UNKNOWN);
        String string = getString(C21167R.string.ticket_sales_try_again_title);
        String str = message.body;
        if (th2 != null) {
            if (th2 instanceof UnSuccessStatusException) {
                UnSuccessStatusException unSuccessStatusException = (UnSuccessStatusException) th2;
                C13323a0 error = unSuccessStatusException.getError();
                List<C13323a0.a> errors = error != null ? error.getErrors() : null;
                if (errors == null || errors.isEmpty()) {
                    String.format("Error Unknown: PurchaseTicketOrder() - HTTP Status: %s - Status Message: %s - Exception: %s - Exception Message: %s", Integer.valueOf(unSuccessStatusException.getStatusCode()), unSuccessStatusException.getStatusMessage(), unSuccessStatusException.toString(), unSuccessStatusException.getMessage());
                } else {
                    C13323a0.a aVar = errors.get(0);
                    String strM68725e = C22466q.m68725e(aVar.getMessage());
                    BookingApiErrorMessageInterface.ErrorMessage message2 = getErrorMessageProvider().getMessage(aVar);
                    String str2 = message2.title;
                    str = message2.body;
                    trackPurchaseOrderError(str2, str, Integer.valueOf(unSuccessStatusException.getStatusCode()));
                    for (C13323a0.a aVar2 : errors) {
                        BookingApiErrorMessageInterface.ErrorMessage message3 = getErrorMessageProvider().getMessage(aVar2);
                        String.format("Error: PurchaseTicketOrder() - Type: %s - Title: %s - Message: %s - Debug Description: %s Http Status code %s", aVar2.getTypeId(), message3.title, message3.body, strM68725e, Integer.valueOf(unSuccessStatusException.getStatusCode()));
                    }
                    string = str2;
                }
            } else if (th2 instanceof IOException) {
                string = getString(C21167R.string.ticket_sales_purchase_lost_connection_title);
                str = this.formatters.helpDeskPhoneNumberFormatter.format(getString(getConnectionLostMessageResource()));
                fragmentStateOnError = BaseOrderSummaryFragment.FragmentStateOnError.NAVIGATE_TO_HOME_SCREEN;
                String.format("Error IO: PurchaseTicketOrder() - Exception: %s - Exception Message: %s", th2.toString(), th2.getMessage());
            } else if (th2 instanceof DirtyWordFoundException) {
                str = this.formatters.helpDeskPhoneNumberFormatter.format(th2.getMessage());
            } else {
                String.format("Error Unknown: PurchaseTicketOrder() - Exception: %s - Exception Message: %s", th2.toString(), th2.getMessage());
            }
        }
        displayErrors(string, str, fragmentStateOnError, false, true, getString(C21167R.string.common_ok), null);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void purchaseTicketOrder(HashMap<SupportedPaymentType, Class<?>> map) {
        getTicketOrderForm().getProductCategoryType();
        this.ticketSalesCheckoutManager.purchaseTicketOrder(getTicketOrderForm(), map, this.productCategoryDetails);
    }

    protected void showGenericError() {
        displayErrors(getString(C21167R.string.ticket_sales_try_again_title), this.formatters.helpDeskPhoneNumberFormatter.format(getString(C21167R.string.ticket_sales_common_error_message)), BaseOrderSummaryFragment.FragmentStateOnError.CLOSE, false, false, getString(C21167R.string.common_ok), null);
    }
}