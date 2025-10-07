package com.disney.wdpro.general_ticket_sales_ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.analytics.ResidentOffersAnalyticsUtils;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.SelectedProductsUIHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.SafeLinkMovementMethod;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation;
import com.disney.wdpro.base_sales_ui_lib.views.CreditCardInformation;
import com.disney.wdpro.base_sales_ui_lib.views.TicketEntitlementViewPager;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment;
import com.disney.wdpro.general_ticket_sales_ui.p131di.GeneralTicketSalesUiComponentProvider;
import com.disney.wdpro.general_ticket_sales_ui.p132ui.providers.GeneralBrickTitleCreator;
import com.disney.wdpro.support.calendar.DisneyCalendarView;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentUsed;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketEntitlement;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.utils.StringUtils;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ConfirmationPolicy;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import p1117yn.C33668c;

/* loaded from: classes28.dex */
public class DLRTicketSalesOrderConfirmationFragment extends TicketSalesOrderConfirmationFragment {
    private static final String ANALYTICS_TICKET_SALES_M_PURCHASE_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_ORDER_PENDING_DEFAULT = "1";
    private static final int NO_RESOURCE = -1;
    private LinearLayout accessibilityConfirmationCodeLayout;
    private LinearLayout calendarLegendsContainer;
    private CreditCardInformation ccInfo;
    private TextView makeFastPassSelection;
    private LinearLayout orderConfirmationCalendarLayout;
    private TextView orderConfirmationCodeHeader;
    private TextView orderConfirmationCodeText;
    private View orderConfirmationSeparator;
    private TextView orderConfirmationText;
    private TextView orderDate;
    private TextView orderPlacedHeader;
    private TextView orderPlacedText;

    @Inject
    protected ResidentOfferManager residentOfferManager;
    private View selectedTicketInnerBrickView;
    private ViewGroup selectedTicketOuterBrickView;
    private TicketEntitlementViewPager selectedTicketsViewPager;
    private List<TicketEntitlement> ticketEntitlements;
    private TextView ticketInstructionsHeader;
    private View ticketInstructionsSeparator;
    private TextView ticketInstructionsText;
    private RelativeLayout ticketsAndPassesButton;
    private LinearLayout ticketsAndPassesContainer;
    private TextView ticketsAndPassesHeader;
    private View ticketsAndPassesSeparator;
    private TextView ticketsAndPassesText;
    private TextView ticketsViewPagerIndex;

    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment$5 */
    static /* synthetic */ class C119915 {
        static final /* synthetic */ int[] $SwitchMap$com$disney$wdpro$base_sales_ui_lib$PurchaseFlowType;

        static {
            int[] iArr = new int[PurchaseFlowType.values().length];
            $SwitchMap$com$disney$wdpro$base_sales_ui_lib$PurchaseFlowType = iArr;
            try {
                iArr[PurchaseFlowType.PURCHASE_STANDALONE_FP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private String buildConfirmationPolicy(List<ConfirmationPolicy> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<ConfirmationPolicy> it = list.iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().getPolicyContent().iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next());
            }
        }
        return sb2.toString();
    }

    private String createCommaVisualIds(PurchaseConfirmation purchaseConfirmation) {
        if (!purchaseConfirmation.getTicketEntitlements().isPresent()) {
            return null;
        }
        AbstractC22726b3<TicketEntitlement> it = purchaseConfirmation.getTicketEntitlements().get().iterator();
        StringBuilder sb2 = new StringBuilder();
        if (it.hasNext()) {
            sb2.append(it.next().getBarcodeId());
            while (it.hasNext()) {
                sb2.append(",");
                sb2.append(it.next().getBarcodeId());
            }
        }
        return sb2.toString();
    }

    public static final DLRTicketSalesOrderConfirmationFragment newInstance(SelectedTicketProducts selectedTicketProducts, Long l10) {
        DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment = new DLRTicketSalesOrderConfirmationFragment();
        dLRTicketSalesOrderConfirmationFragment.setArguments(BaseConfirmationFragment.ArgumentBuilder.createInstance().withSelectedTicket(selectedTicketProducts).withTicketOrderForm(l10).build());
        return dLRTicketSalesOrderConfirmationFragment;
    }

    private void setMakeFastPassSelectionButton() {
        if (this.productCategoryDetails.getProductCategoryType() != ProductCategoryType.MAX_PASS || this.confirmation.getOrderStatus() != BookingStatus.BOOKED) {
            this.makeFastPassSelection.setVisibility(8);
            return;
        }
        this.makeFastPassSelection.setVisibility(0);
        this.makeFastPassSelection.setText(this.buyMoreTickets ? C11971R.string.ticket_sales_confirmation_btn_continue : C11971R.string.ticket_sales_order_confirmation_make_fast_pass_selection);
        this.makeFastPassSelection.setContentDescription(this.buyMoreTickets ? getString(C11971R.string.continue_text) : getString(C11971R.string.f32637xf9ee19d2));
        this.makeFastPassSelection.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment = DLRTicketSalesOrderConfirmationFragment.this;
                if (dLRTicketSalesOrderConfirmationFragment.buyMoreTickets) {
                    ((TicketSalesOrderConfirmationFragment) dLRTicketSalesOrderConfirmationFragment).actionListener.onBuyMoreTickets(dLRTicketSalesOrderConfirmationFragment.sessionId);
                } else {
                    dLRTicketSalesOrderConfirmationFragment.setNextButtonAction();
                }
            }
        });
    }

    private void trackConfirmationPage(Map<String, String> map) {
        if (!this.residentOfferManager.shouldHandleResidentOffer()) {
            this.ticketSalesAnalyticsHelper.trackStateWithSTEM(this.analyticsManager.getConfirmationState(), getClass().getSimpleName(), map);
        } else {
            ResidentOffersAnalyticsUtils.addConfirmationScreenContextAnalytics(map, this.residentOfferManager);
            ResidentOffersAnalyticsUtils.trackStateConfirmationScreen(map, this.ticketSalesAnalyticsHelper, this.analyticsManager, getClass().getSimpleName(), this.residentOfferManager);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        return new SelectedProductsUIHelper(null, ticketSalesAnalyticsHelper, new GeneralBrickTitleCreator(), ((TicketSalesOrderConfirmationFragment) this).actionListener.getPricePerViewCreator(), this.residentOfferManager);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return InterfaceC8679k.IGNORE;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseCreditCardInformation getCCInfo() {
        return this.ccInfo;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.ConfirmationTitles getConfirmationTitles(PurchaseConfirmation purchaseConfirmation) {
        return new BaseConfirmationManagerFragment.ConfirmationTitles(C11971R.string.dlr_ticket_sales_order_confirmation_admission_flow_title, C11971R.string.ticket_sales_order_pending_title);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected CharSequence getDeliveryInstructionsBodySpanned(String str, String str2) {
        return str;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected View getTicketBrickView() {
        if (this.selectedTicketInnerBrickView == null) {
            View selectedProductView = getSelectedProductView(getLayoutInflater(), this.selectedTicketOuterBrickView);
            this.selectedTicketInnerBrickView = selectedProductView;
            this.selectedTicketOuterBrickView.addView(selectedProductView);
        }
        return this.selectedTicketInnerBrickView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return null;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setMakeFastPassSelectionButton();
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((GeneralTicketSalesUiComponentProvider) context.getApplicationContext()).getGeneralTicketSalesUiComponent().inject(this);
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment, com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ticketEntitlements = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C11971R.layout.dlr_ticket_sales_fragment_order_confirmation, viewGroup, false);
        this.selectedTicketOuterBrickView = (ViewGroup) viewInflate.findViewById(C11971R.id.order_confirmation_pending_order_ticket_brick);
        this.orderPlacedHeader = (TextView) viewInflate.findViewById(C11971R.id.order_placed_header);
        this.orderPlacedText = (TextView) viewInflate.findViewById(C11971R.id.order_placed_text);
        this.ticketInstructionsHeader = (TextView) viewInflate.findViewById(C11971R.id.ticket_instructions_header);
        this.ticketInstructionsText = (TextView) viewInflate.findViewById(C11971R.id.ticket_instructions_text);
        this.ticketInstructionsSeparator = viewInflate.findViewById(C11971R.id.ticket_instructions_separator);
        this.orderDate = (TextView) viewInflate.findViewById(C11971R.id.confirmation_date_value);
        this.makeFastPassSelection = (TextView) viewInflate.findViewById(C11971R.id.btn_make_fast_pass_selection);
        this.accessibilityConfirmationCodeLayout = (LinearLayout) viewInflate.findViewById(C11971R.id.accessibility_confirmation_code_layout);
        this.orderConfirmationCodeHeader = (TextView) viewInflate.findViewById(C11971R.id.order_confirmation_code_header);
        this.orderConfirmationCodeText = (TextView) viewInflate.findViewById(C11971R.id.order_confirmation_code_text);
        this.ticketsAndPassesButton = (RelativeLayout) viewInflate.findViewById(C11971R.id.btn_tickets_and_passes);
        this.ticketsAndPassesSeparator = viewInflate.findViewById(C11971R.id.tickets_and_passes_separator);
        this.ticketsAndPassesHeader = (TextView) viewInflate.findViewById(C11971R.id.tickets_and_passes_header);
        this.ticketsAndPassesText = (TextView) viewInflate.findViewById(C11971R.id.tickets_and_passes_text);
        this.ticketsAndPassesButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DLRTicketSalesOrderConfirmationFragment.this.getActivity().setResult(-1);
                DLRTicketSalesOrderConfirmationFragment.this.setNextButtonAction();
            }
        });
        this.orderConfirmationSeparator = viewInflate.findViewById(C11971R.id.fine_print_text_separator);
        this.orderConfirmationText = (TextView) viewInflate.findViewById(C11971R.id.order_confirmation_text);
        this.selectedTicketsViewPager = (TicketEntitlementViewPager) viewInflate.findViewById(C11971R.id.order_confirmation_tickets_view_pager);
        this.ticketsViewPagerIndex = (TextView) viewInflate.findViewById(C11971R.id.ticket_view_pager_index);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(C11971R.id.confirmation_calendar_layout);
        this.orderConfirmationCalendarLayout = linearLayout;
        this.calendarLegendsContainer = (LinearLayout) linearLayout.findViewById(C11971R.id.good_to_go_days_calendar_legends);
        this.selectedTicketsViewPager.setData(this.ticketEntitlements, Ints.m69754c(getResources().getIntArray(C11971R.array.confirmation_ticket_header_background_colors_array)));
        this.selectedTicketsViewPager.addOnPageChangeListener(new ViewPager.InterfaceC5168i() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment.2
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC5168i
            public void onPageScrollStateChanged(int i10) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC5168i
            public void onPageScrolled(int i10, float f10, int i11) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC5168i
            public void onPageSelected(int i10) {
                DLRTicketSalesOrderConfirmationFragment.this.ticketsViewPagerIndex.setText(DLRTicketSalesOrderConfirmationFragment.this.getActivity().getResources().getString(C11971R.string.tickets_view_pager_index, Integer.valueOf(i10 + 1), Integer.valueOf(DLRTicketSalesOrderConfirmationFragment.this.ticketEntitlements.size())));
            }
        });
        this.ccInfo = (CreditCardInformation) viewInflate.findViewById(C11971R.id.credit_card_information);
        this.ticketsAndPassesContainer = (LinearLayout) viewInflate.findViewById(C11971R.id.tickets_and_passes_container);
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
                ((DisneyCalendarView) next.second).setOnDateSelectedListener(new DisneyCalendarView.InterfaceC20586e() { // from class: com.disney.wdpro.general_ticket_sales_ui.fragment.DLRTicketSalesOrderConfirmationFragment.4
                    @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
                    public boolean onDateSelected(Calendar calendar, C33668c c33668c) {
                        return false;
                    }

                    @Override // com.disney.wdpro.support.calendar.DisneyCalendarView.InterfaceC20586e
                    public void onNonSelectableDateTapped() {
                        DLRTicketSalesOrderConfirmationFragment.this.getView().findViewById(C11971R.id.ticket_instructions_header).sendAccessibilityEvent(8);
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
        if (C119915.$SwitchMap$com$disney$wdpro$base_sales_ui_lib$PurchaseFlowType[this.purchaseFlowType.ordinal()] == 1) {
            if (purchaseConfirmation.getOrderStatus() != BookingStatus.BOOKED) {
                Objects.toString(purchaseConfirmation.getOrderStatus());
            }
            this.selectedTicketsViewPager.setVisibility(8);
            this.selectedTicketOuterBrickView.setVisibility(0);
            this.ticketsAndPassesContainer.setVisibility(8);
            return;
        }
        if (purchaseConfirmation.getOrderStatus() != BookingStatus.BOOKED) {
            this.selectedTicketOuterBrickView.setVisibility(0);
            this.selectedTicketsViewPager.setVisibility(8);
            return;
        }
        if (purchaseConfirmation.getTicketEntitlements().isPresent()) {
            this.ticketEntitlements.addAll(purchaseConfirmation.getTicketEntitlements().get());
        }
        if (purchaseConfirmation.getConfirmationPolicy().isPresent() || purchaseConfirmation.getFinePrint().isPresent()) {
            this.orderConfirmationSeparator.setVisibility(0);
            this.orderConfirmationText.setVisibility(0);
            this.orderConfirmationText.setMovementMethod(SafeLinkMovementMethod.getInstance());
            if (purchaseConfirmation.getConfirmationPolicy().isPresent()) {
                this.orderConfirmationText.setText(Html.fromHtml(buildConfirmationPolicy(purchaseConfirmation.getConfirmationPolicy().get())));
            } else {
                this.orderConfirmationText.setText(Html.fromHtml(purchaseConfirmation.getFinePrint().get()));
            }
        }
        this.selectedTicketsViewPager.notifyDataSetChanged();
        this.ticketsViewPagerIndex.setText(getActivity().getResources().getString(C11971R.string.tickets_view_pager_index, 1, Integer.valueOf(this.ticketEntitlements.size())));
        this.selectedTicketsViewPager.setVisibility(0);
        this.selectedTicketOuterBrickView.setVisibility(8);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void sendAnalyticsOrderConfirmationState(PurchaseConfirmation purchaseConfirmation, SelectedTicketProducts selectedTicketProducts) {
        int numberOfAdultTickets = selectedTicketProducts.getNumberOfAdultTickets();
        int numberOfChildTickets = selectedTicketProducts.getNumberOfChildTickets();
        int numberOfAllAgesTickets = selectedTicketProducts.getNumberOfAllAgesTickets();
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        if (this.purchaseFlowType == PurchaseFlowType.PURCHASE_STANDALONE_FP) {
            defaultContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductStringWithEvar36(selectedTicketProducts));
        } else {
            defaultContext.put("&&products", TicketSalesAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        }
        defaultContext.put("&&currencyCode", selectedTicketProducts.getCombinedSubtotal().get().getCurrency().getCurrencyCode());
        int i10 = numberOfAdultTickets + numberOfAllAgesTickets;
        defaultContext.put("party.size", String.valueOf(i10 + numberOfChildTickets));
        defaultContext.put("party.makeup", String.format(TicketSalesAnalyticsConstants.TICKET_SALES_VALUE_PARTY_MAKEUP, Integer.valueOf(i10), Integer.valueOf(numberOfChildTickets)));
        defaultContext.put(TicketSalesAnalyticsConstants.TICKET_SALES_KEY_TICKET_DAYS, String.valueOf(selectedTicketProducts.getNumberOfSelectedDays()));
        if (this.residentOfferManager.isResidentOffersEnabled()) {
            defaultContext.put("store", TicketSalesAnalyticsConstants.TICKET_SALES_VALUE_STORE_RESIDENT_OFFER_DLR);
        } else {
            defaultContext.put("store", "Consumer");
        }
        Optional<PaymentUsed> paymentUsed = purchaseConfirmation.getPaymentUsed();
        defaultContext.put("paymentmethod", paymentUsed.isPresent() ? C22466q.m68725e(paymentUsed.get().getCardSubType()) : "");
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.PENDED) {
            defaultContext.put("orderpending", "1");
            defaultContext.put("m.purchaseid", purchaseConfirmation.getOrderId());
        } else {
            defaultContext.put("m.purchaseid", formatConfirmationNumbers(purchaseConfirmation));
            String strCreateCommaVisualIds = createCommaVisualIds(purchaseConfirmation);
            if (!C22466q.m68722b(strCreateCommaVisualIds)) {
                defaultContext.put("visualid", strCreateCommaVisualIds);
            }
        }
        defaultContext.put("m.purchase", "1");
        defaultContext.put("affiliation", selectedTicketProducts.getDiscountGroupType());
        trackConfirmationPage(defaultContext);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void setConfirmationDate(CharSequence charSequence) {
        this.orderDate.setText(charSequence);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected void trackNextAction() {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(getSelectedTicketProducts()));
        this.ticketSalesAnalyticsHelper.trackAction(this.analyticsManager.getConfirmationNextAction(), defaultContext);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateConfirmationNumberUi(String str) {
        String string = getString(C11971R.string.ticket_sales_order_confirmation_code_header);
        this.accessibilityConfirmationCodeLayout.setContentDescription(((Object) string) + "\n" + StringUtils.separate(C22466q.m68725e(str), getString(C11971R.string.ticket_sales_non_breaking_space)));
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationCodeHeader, string), BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationCodeText, C22466q.m68721a(str)), null);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateDeliveryInstructionsUi(CharSequence charSequence, CharSequence charSequence2, String str) {
        if (charSequence == null) {
            charSequence = PurchaseFlowType.PURCHASE_STANDALONE_FP.equals(this.purchaseFlowType) ? getString(C11971R.string.f32629x4b6b0d6d) : getString(C11971R.string.f32628x2d500e2d);
        }
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.ticketInstructionsHeader, charSequence), BaseConfirmationManagerFragment.TextViewPair.create(this.ticketInstructionsText, charSequence2), this.ticketInstructionsSeparator);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateNextCallToActionUi(PurchaseConfirmation purchaseConfirmation) {
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.BOOKED) {
            this.ticketsAndPassesButton.setVisibility(0);
            this.ticketsAndPassesSeparator.setVisibility(0);
            this.ticketsAndPassesHeader.setVisibility(0);
            this.ticketsAndPassesText.setVisibility(0);
            return;
        }
        this.ticketsAndPassesButton.setVisibility(8);
        this.ticketsAndPassesSeparator.setVisibility(8);
        this.ticketsAndPassesHeader.setVisibility(8);
        this.ticketsAndPassesText.setVisibility(8);
    }

    @Override // com.disney.wdpro.general_ticket_sales_ui.fragment.TicketSalesOrderConfirmationFragment
    protected void updateOrderPlacedUiWithText(String str, String str2) {
        this.orderPlacedHeader.setText(str);
        this.orderPlacedText.setText(str2);
    }

    public static final DLRTicketSalesOrderConfirmationFragment newInstance(SelectedTicketProducts selectedTicketProducts, Long l10, boolean z10, String str) {
        DLRTicketSalesOrderConfirmationFragment dLRTicketSalesOrderConfirmationFragment = new DLRTicketSalesOrderConfirmationFragment();
        dLRTicketSalesOrderConfirmationFragment.setArguments(TicketSalesOrderConfirmationFragment.TicketSalesOrderConfirmationArgumentBuilder.createInstance().withBuyMoreTickets(z10).withSessionId(str).withSelectedTicket(selectedTicketProducts).withTicketOrderForm(l10).build());
        return dLRTicketSalesOrderConfirmationFragment;
    }
}