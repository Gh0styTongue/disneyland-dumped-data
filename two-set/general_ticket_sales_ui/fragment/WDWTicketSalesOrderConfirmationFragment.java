package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.SelectedProductsUIHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.ThemeParkPricePerTicketCreator;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation;
import com.disney.wdpro.base_sales_ui_lib.views.CreditCardInformation;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.providers.GeneralBrickTitleCreator;
import com.disney.wdpro.support.calendar.DisneyCalendarView;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentUsed;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.utils.StringUtils;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import p1117yn.C33668c;

/* loaded from: classes28.dex */
public class WDWTicketSalesOrderConfirmationFragment extends TicketSalesOrderConfirmationFragment {
    private static final String ANALYTICS_TICKET_SALES_M_PURCHASE_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_ORDER_PENDING_DEFAULT = "1";
    private static final float RELATIVE_SIZE_SPAN_PROPORTION = 1.6f;
    private LinearLayout accessibilityConfirmationCodeLayout;
    private CreditCardInformation ccInfo;
    private LinearLayout orderConfirmationCalendarLayout;
    private TextView orderConfirmationCodeHeader;
    private TextView orderConfirmationCodeText;
    private TextView orderDate;
    private TextView orderPlacedHeader;
    private TextView orderPlacedText;

    @Inject
    protected ResidentOfferManager residentOfferManager;
    private ViewGroup selectedProductsHeader;
    private View selectedProductsView;
    private TextView whatsNextButton;
    private TextView whatsNextHeader;
    private View whatsNextSeparator;
    private TextView whatsNextText;
    private TextView willCallDescription;
    private TextView willCallHeader;
    private View willCallSeparator;

    public static WDWTicketSalesOrderConfirmationFragment newInstance(SelectedTicketProducts selectedTicketProducts, Long l10) {
        WDWTicketSalesOrderConfirmationFragment wDWTicketSalesOrderConfirmationFragment = new WDWTicketSalesOrderConfirmationFragment();
        wDWTicketSalesOrderConfirmationFragment.setArguments(BaseConfirmationFragment.ArgumentBuilder.createInstance().withSelectedTicket(selectedTicketProducts).withTicketOrderForm(l10).build());
        return wDWTicketSalesOrderConfirmationFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        return new SelectedProductsUIHelper(null, ticketSalesAnalyticsHelper, new GeneralBrickTitleCreator(), new ThemeParkPricePerTicketCreator(), this.residentOfferManager);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseCreditCardInformation getCCInfo() {
        return this.ccInfo;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.ConfirmationTitles getConfirmationTitles(PurchaseConfirmation purchaseConfirmation) {
        return new BaseConfirmationManagerFragment.ConfirmationTitles(C11971R.string.ticket_sales_order_confirmation_title, C11971R.string.ticket_sales_order_pending_title);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected CharSequence getDeliveryInstructionsBodySpanned(String str, String str2) {
        String string = getString(C11971R.string.ticket_sales_confirmation_number_placeholder);
        if (str2 == null) {
            return str;
        }
        if (str.contains(string)) {
            str = str.replace(string, str2);
        }
        StyleSpan styleSpan = new StyleSpan(1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(styleSpan, str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(RELATIVE_SIZE_SPAN_PROPORTION), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected View getTicketBrickView() {
        if (this.selectedProductsView == null) {
            View selectedProductView = getSelectedProductView(getLayoutInflater(), this.selectedProductsHeader);
            this.selectedProductsView = selectedProductView;
            this.selectedProductsHeader.addView(selectedProductView);
        }
        return this.selectedProductsView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((GeneralTicketSalesUiComponentProvider) context.getApplicationContext()).getGeneralTicketSalesUiComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C11971R.layout.wdw_ticket_sales_fragment_order_confirmation, viewGroup, false);
        this.selectedProductsHeader = (ViewGroup) viewInflate.findViewById(C11971R.id.order_confirmation_header);
        this.orderPlacedHeader = (TextView) viewInflate.findViewById(C11971R.id.order_placed_header);
        this.orderPlacedText = (TextView) viewInflate.findViewById(C11971R.id.order_placed_text);
        this.accessibilityConfirmationCodeLayout = (LinearLayout) viewInflate.findViewById(C11971R.id.accessibility_confirmation_code_layout);
        this.orderConfirmationCodeHeader = (TextView) viewInflate.findViewById(C11971R.id.order_confirmation_code_header);
        this.orderConfirmationCodeText = (TextView) viewInflate.findViewById(C11971R.id.order_confirmation_code_text);
        this.willCallHeader = (TextView) viewInflate.findViewById(C11971R.id.will_call_header);
        this.willCallDescription = (TextView) viewInflate.findViewById(C11971R.id.will_call_text);
        this.willCallSeparator = viewInflate.findViewById(C11971R.id.will_call_separator);
        this.orderDate = (TextView) viewInflate.findViewById(C11971R.id.confirmation_date_value);
        this.ccInfo = (CreditCardInformation) viewInflate.findViewById(C11971R.id.credit_card_information);
        this.orderConfirmationCalendarLayout = (LinearLayout) viewInflate.findViewById(C11971R.id.confirmation_calendar_layout);
        this.whatsNextHeader = (TextView) viewInflate.findViewById(C11971R.id.whats_next_header);
        this.whatsNextText = (TextView) viewInflate.findViewById(C11971R.id.whats_next_text);
        this.whatsNextButton = (TextView) viewInflate.findViewById(C11971R.id.btn_book_fast_pass);
        this.whatsNextSeparator = viewInflate.findViewById(C11971R.id.whats_next_separator);
        this.whatsNextButton.setContentDescription(getString(C11971R.string.ticket_sales_cd_button_postfix, getString(C11971R.string.ticket_sales_order_confirmation_book_fast_pass)));
        this.whatsNextButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.WDWTicketSalesOrderConfirmationFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WDWTicketSalesOrderConfirmationFragment.this.setNextButtonAction();
            }
        });
        return viewInflate;
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment
    protected void renderCalendars(PurchaseConfirmation purchaseConfirmation) {
        Iterator<Pair<TicketOrderResponse.OrderItem, DisneyCalendarView>> it = createCollectionOfCalendarViews(purchaseConfirmation).iterator();
        if (it.hasNext()) {
            Pair<TicketOrderResponse.OrderItem, DisneyCalendarView> next = it.next();
            if (next.second != null) {
                this.orderConfirmationCalendarLayout.setVisibility(0);
                FrameLayout frameLayout = (FrameLayout) this.orderConfirmationCalendarLayout.findViewById(C11971R.id.confirmation_calendar_container);
                ((DisneyCalendarView) next.second).setOnDateSelectedListener(new DisneyCalendarView.InterfaceC20586e() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.WDWTicketSalesOrderConfirmationFragment.2
                    @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
                    public boolean onDateSelected(Calendar calendar, C33668c c33668c) {
                        return false;
                    }

                    @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
                    public void onNonSelectableDateTapped() {
                        WDWTicketSalesOrderConfirmationFragment.this.getView().findViewById(C11971R.id.will_call_header).sendAccessibilityEvent(8);
                    }

                    @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
                    public void onSelectionCleared() {
                    }
                });
                frameLayout.addView((View) next.second);
            }
        }
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment
    protected void renderParkSpecificUi(PurchaseConfirmation purchaseConfirmation) {
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void sendAnalyticsOrderConfirmationState(PurchaseConfirmation purchaseConfirmation, SelectedTicketProducts selectedTicketProducts) {
        int numberOfAdultTickets = selectedTicketProducts.getNumberOfAdultTickets();
        int numberOfChildTickets = selectedTicketProducts.getNumberOfChildTickets();
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        defaultContext.put("&&currencyCode", selectedTicketProducts.getCombinedSubtotal().get().getCurrency().getCurrencyCode());
        defaultContext.put("party.size", String.valueOf(numberOfAdultTickets + numberOfChildTickets));
        defaultContext.put("party.makeup", String.format(TicketSalesAnalyticsConstants.TICKET_SALES_VALUE_PARTY_MAKEUP, Integer.valueOf(numberOfAdultTickets), Integer.valueOf(numberOfChildTickets)));
        defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TICKET_DAYS, String.valueOf(selectedTicketProducts.getNumberOfSelectedDays()));
        defaultContext.put("store", "Consumer");
        Optional<PaymentUsed> paymentUsed = purchaseConfirmation.getPaymentUsed();
        defaultContext.put("paymentmethod", paymentUsed.isPresent() ? C22466q.m68725e(paymentUsed.get().getCardSubType()) : "");
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.PENDED) {
            defaultContext.put("orderpending", "1");
            defaultContext.put("m.purchaseid", purchaseConfirmation.getOrderId());
        } else {
            defaultContext.put("m.purchaseid", formatConfirmationNumbers(purchaseConfirmation));
        }
        defaultContext.put("m.purchase", "1");
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(TicketSalesAnalyticsConstants.TICKET_SALES_STATE_CONFIRMATION, getClass().getSimpleName(), defaultContext);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void setConfirmationDate(CharSequence charSequence) {
        this.orderDate.setText(charSequence);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected void trackNextAction() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(getSelectedTicketProducts()));
        this.ticketSalesAnalyticsHelper.trackAction("ticketsales.bookfp", defaultContext);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateConfirmationNumberUi(String str) {
        String string = getString(C11971R.string.ticket_sales_order_confirmation_code_header);
        this.accessibilityConfirmationCodeLayout.setContentDescription(((Object) string) + "\n" + StringUtils.separate(C22466q.m68725e(str), getString(C11971R.string.ticket_sales_non_breaking_space)));
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationCodeHeader, string), BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationCodeText, C22466q.m68721a(str)), null);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateDeliveryInstructionsUi(CharSequence charSequence, CharSequence charSequence2, String str) {
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.willCallHeader, charSequence), BaseConfirmationManagerFragment.TextViewPair.create(this.willCallDescription, charSequence2), this.willCallSeparator);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateNextCallToActionUi(PurchaseConfirmation purchaseConfirmation) {
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED) {
            this.whatsNextHeader.setVisibility(0);
            this.whatsNextText.setVisibility(0);
            this.whatsNextButton.setVisibility(0);
            this.whatsNextSeparator.setVisibility(0);
            return;
        }
        this.whatsNextHeader.setVisibility(8);
        this.whatsNextText.setVisibility(8);
        this.whatsNextButton.setVisibility(8);
        this.whatsNextSeparator.setVisibility(8);
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment
    protected void updateOrderPlacedUiWithText(String str, String str2) {
        this.orderPlacedHeader.setText(str);
        this.orderPlacedText.setText(str2);
    }
}