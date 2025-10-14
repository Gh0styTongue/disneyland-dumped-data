package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.ap_commerce_checkout.ApUtils;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.p066ui.APConfirmationScreenUIHelper;
import com.disney.wdpro.ap_commerce_checkout.views.APCreditCardInformation;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.SafeLinkMovementMethod;
import com.disney.wdpro.base_sales_ui_lib.utils.StringNameBuilder;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation;
import com.disney.wdpro.base_sales_ui_lib.views.PassHolderViewItem;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.PaymentUsed;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.utils.SerializablePair;
import com.disney.wdpro.ticket_sales_base_lib.utils.StringUtils;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ConfirmationPolicy;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment;
import com.google.common.base.C22459j;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes23.dex */
public class APOrderConfirmationFragment extends BaseConfirmationManagerFragment {
    private static final String ANALYTICS_PRODUCT_STRING = "ANALYTICS_PRODUCT_STRING";
    private static final String ANALYTICS_TICKET_SALES_M_PURCHASE_DEFAULT = "1";
    private static final String ANALYTICS_TICKET_SALES_ORDER_PENDING_DEFAULT = "1";
    private static final int ANIMATION_DELAY = 500;
    private static final String DELIVERY_DESCRIPTION_CONFIRMATION_NUMBER = "{CONFIRMATION_NUMBER}";
    private static final String SAVE_PASSHOLDER_ITEMS = "SAVE_PASSHOLDER_ITEMS";
    private static final int ZERO = 0;
    private AffiliationType affiliationType;
    private String analyticsProductString;
    private APCreditCardInformation ccInfo;
    private LinearLayout confirmationContainerView;
    private TextView confirmationEmailTextView;
    private LinearLayout confirmationNumberAccessibilityContainer;
    private TextView orderConfirmationCodeHeader;
    private TextView orderConfirmationCodeText;
    private View orderConfirmationFinePrintSeparator;
    private TextView orderConfirmationFinePrintText;
    private LottieAnimationView orderConfirmationImageMickey;
    private LinearLayout orderConfirmationPolicyContainer;
    private View orderConfirmationPolicySeparator;
    private TextView orderDate;
    private ArrayList<SerializablePair<UserDataContainer, Optional<String>>> passHolderItems;
    private LinearLayout passHolderListView;
    private ViewGroup pendingOrderView;
    private TextView ticketInstructionsHeader;
    private View ticketInstructionsSeparator;
    private TextView ticketInstructionsText;
    private RelativeLayout ticketsAndPassesButton;
    private TextView ticketsAndPassesHeader;
    private View ticketsAndPassesSeparator;
    private TextView ticketsAndPassesText;
    private APConfirmationScreenUIHelper uiHelper;
    private TextView welcomeConfirmationText;

    protected static class APOrderConfirmationArgumentBuilder extends BaseConfirmationFragment.ArgumentBuilder {
        private String analyticsProductString;
        private ArrayList<SerializablePair<UserDataContainer, Optional<String>>> passHolderItems;

        protected APOrderConfirmationArgumentBuilder() {
        }

        public static APOrderConfirmationArgumentBuilder createInstance() {
            return new APOrderConfirmationArgumentBuilder();
        }

        @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment.ArgumentBuilder
        public Bundle build() {
            Bundle bundleBuild = super.build();
            bundleBuild.putSerializable(APOrderConfirmationFragment.SAVE_PASSHOLDER_ITEMS, this.passHolderItems);
            bundleBuild.putString(APOrderConfirmationFragment.ANALYTICS_PRODUCT_STRING, this.analyticsProductString);
            return bundleBuild;
        }

        public APOrderConfirmationArgumentBuilder withAnalyticsProductString(String str) {
            this.analyticsProductString = str;
            return this;
        }

        public APOrderConfirmationArgumentBuilder withPassHolderItems(ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayList) {
            this.passHolderItems = arrayList;
            return this;
        }
    }

    private void addPolicyToView(ConfirmationPolicy confirmationPolicy) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = confirmationPolicy.getPolicyContent().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        TextView textView = new TextView(getContext());
        textView.setText(Html.fromHtml(sb2.toString()));
        textView.setTextAppearance(C8689R.style.TWDCFont_Light_C2_G);
        this.orderConfirmationPolicyContainer.addView(textView);
    }

    private String buildStringName(PersonName personName) {
        return new StringNameBuilder(personName).needTitle().needFirstName().needMiddleName().needLastName().needSuffix().buildStringName();
    }

    private void initializeUiHelper() {
        this.uiHelper = new APConfirmationScreenUIHelper(getContext(), getSelectedTicketProducts(), Boolean.valueOf(this.confirmation.isGuestOnMonthlyPlan()));
    }

    public static final APOrderConfirmationFragment newInstance(SelectedTicketProducts selectedTicketProducts, Long l10, ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayList, String str) {
        APOrderConfirmationFragment aPOrderConfirmationFragment = new APOrderConfirmationFragment();
        aPOrderConfirmationFragment.setArguments(APOrderConfirmationArgumentBuilder.createInstance().withPassHolderItems(arrayList).withAnalyticsProductString(str).withSelectedTicket(selectedTicketProducts).withTicketOrderForm(l10).build());
        return aPOrderConfirmationFragment;
    }

    private void setTextCopy() {
        if (this.purchaseFlowType == PurchaseFlowType.PURCHASE_ANNUAL_PASS_RENEWAL) {
            this.ticketsAndPassesText.setText(C8689R.string.ap_renewals_confirmation_order_tickets_and_passes_text);
        } else {
            this.ticketsAndPassesText.setText(C8689R.string.ap_confirmation_order_tickets_and_passes_text);
        }
    }

    private void updatePassHoldersList() {
        String string;
        this.passHolderListView.removeAllViews();
        Iterator<SerializablePair<UserDataContainer, Optional<String>>> it = this.passHolderItems.iterator();
        while (it.hasNext()) {
            SerializablePair<UserDataContainer, Optional<String>> next = it.next();
            PassHolderViewItem passHolderViewItem = new PassHolderViewItem(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, getResources().getDimensionPixelOffset(C8689R.dimen.margin_normal), 0, 0);
            passHolderViewItem.getChildAt(0).setLayoutParams(layoutParams);
            passHolderViewItem.setPassholderDetailsVisibility(8);
            this.affiliationType = null;
            if (C22459j.m68660a(this.authenticationManager.getUserSwid(), next.first.getSwid())) {
                string = getString(C8689R.string.ap_commerce_suffix_me);
                if (next.first.getAffiliationType().isPresent()) {
                    this.affiliationType = next.first.getAffiliationType().get();
                }
            } else {
                string = "";
            }
            String string2 = getString(C8689R.string.ap_commerce_passholder_name, buildStringName(next.first.getPersonName()), string);
            String strMo68585or = next.second.mo68585or((Optional<String>) getString(C8689R.string.empty_string));
            passHolderViewItem.setPassholderName(string2);
            passHolderViewItem.setAnnualPassName(strMo68585or);
            passHolderViewItem.setGuestInformationContentDescription(string2, strMo68585or);
            if (this.uiHelper.shouldDisplayGuestAvatar()) {
                passHolderViewItem.setAvatar(next.first.getAvatar().getImageAvatar(), C8689R.drawable.default_avatar);
            }
            passHolderViewItem.setPassholderNameAppearance(C8689R.style.TWDCFont_Heavy_B1_D);
            passHolderViewItem.setAnnualPassNameAppearance(C8689R.style.TWDCFont_Light_B2_D);
            this.passHolderListView.addView(passHolderViewItem);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        return new TicketBrickUiHelper() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment.4
            @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper
            public View createSelectedProductsView(LayoutInflater layoutInflater, ViewGroup viewGroup, SelectedTicketProducts selectedTicketProducts) {
                return new View(APOrderConfirmationFragment.this.getActivity());
            }

            @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper
            public void populateSelectedTicketHeader(TicketSalesConfigManager ticketSalesConfigManager, View view, boolean z10, String str, boolean z11) {
            }
        };
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return InterfaceC8679k.IGNORE;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseCreditCardInformation getCCInfo() {
        this.ccInfo.setIsMonthlyPayment(this.confirmation.isGuestOnMonthlyPlan());
        return this.ccInfo;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.ConfirmationTitles getConfirmationTitles(PurchaseConfirmation purchaseConfirmation) {
        return new BaseConfirmationManagerFragment.ConfirmationTitles(WebStoreId.isWDW(getSelectedTicketProducts().getWebStoreId()) ? C8689R.string.ap_commerce_order_confirmation_title_wdw : C8689R.string.ap_commerce_order_confirmation_title_dlr, C8689R.string.ticket_sales_order_pending_title);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected CharSequence getDeliveryInstructionsBodySpanned(String str, String str2) {
        return str;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected BaseConfirmationManagerFragment.OrderPlacedUiHelper getOrderPlacedHelper() {
        return new BaseConfirmationManagerFragment.OrderPlacedUiHelper() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment.2
            @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment.OrderPlacedUiHelper
            public void updateOrderPlacedUi(PurchaseConfirmation purchaseConfirmation) {
            }
        };
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment
    protected View getTicketBrickView() {
        return null;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return null;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.passHolderItems = (ArrayList) bundle.getSerializable(SAVE_PASSHOLDER_ITEMS);
            return;
        }
        Bundle arguments = getArguments();
        this.passHolderItems = (ArrayList) arguments.getSerializable(SAVE_PASSHOLDER_ITEMS);
        this.analyticsProductString = arguments.getString(ANALYTICS_PRODUCT_STRING);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        View viewInflate = layoutInflater.inflate(C8689R.layout.ap_fragment_order_confirmation, viewGroup, false);
        this.pendingOrderView = (ViewGroup) viewInflate.findViewById(C8689R.id.ap_commerce_order_confirmation_pending_order);
        this.welcomeConfirmationText = (TextView) viewInflate.findViewById(C8689R.id.confirmation_welcome_text_view);
        this.confirmationNumberAccessibilityContainer = (LinearLayout) viewInflate.findViewById(C8689R.id.accessibility_container_confirmation_number);
        this.confirmationEmailTextView = (TextView) viewInflate.findViewById(C8689R.id.confirmation_email_text_view);
        this.ticketInstructionsHeader = (TextView) viewInflate.findViewById(C8689R.id.ticket_instructions_header);
        this.ticketInstructionsText = (TextView) viewInflate.findViewById(C8689R.id.ticket_instructions_text);
        this.ticketInstructionsSeparator = viewInflate.findViewById(C8689R.id.ticket_instructions_separator);
        this.orderDate = (TextView) viewInflate.findViewById(C8689R.id.confirmation_date_value);
        this.orderConfirmationImageMickey = (LottieAnimationView) viewInflate.findViewById(C8689R.id.order_confirmation_animated_mickey);
        this.orderConfirmationCodeHeader = (TextView) viewInflate.findViewById(C8689R.id.order_confirmation_code_header);
        this.orderConfirmationCodeText = (TextView) viewInflate.findViewById(C8689R.id.order_confirmation_code_text);
        if (WebStoreId.isWDW(getSelectedTicketProducts().getWebStoreId())) {
            this.orderConfirmationImageMickey.setAnimation("animated_mickey_wdw.json");
            i10 = C8689R.drawable.ap_tickets_and_passes_wdw;
        } else {
            this.orderConfirmationImageMickey.setAnimation("animated_mickey_dlr.json");
            i10 = C8689R.drawable.ap_tickets_and_passes_dlr;
        }
        this.ticketsAndPassesButton = (RelativeLayout) viewInflate.findViewById(C8689R.id.btn_tickets_and_passes);
        this.ticketsAndPassesSeparator = viewInflate.findViewById(C8689R.id.tickets_and_passes_separator);
        this.ticketsAndPassesHeader = (TextView) viewInflate.findViewById(C8689R.id.tickets_and_passes_header);
        this.ticketsAndPassesText = (TextView) viewInflate.findViewById(C8689R.id.tickets_and_passes_text);
        this.confirmationContainerView = (LinearLayout) viewInflate.findViewById(C8689R.id.ap_commerce_logo_container);
        this.ticketsAndPassesButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                APOrderConfirmationFragment.this.getActivity().setResult(-1);
                APOrderConfirmationFragment.this.setNextButtonAction();
            }
        });
        this.orderConfirmationFinePrintSeparator = viewInflate.findViewById(C8689R.id.fine_print_text_separator);
        TextView textView = (TextView) viewInflate.findViewById(C8689R.id.order_confirmation_fine_print_text);
        this.orderConfirmationFinePrintText = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SelectedTicketProducts selectedTicketProducts = getSelectedTicketProducts();
        SelectedTicketProducts.PolicyUILocation policyUILocation = SelectedTicketProducts.PolicyUILocation.ORDER_SUMMARY_IMPORTANT_DETAILS;
        if (selectedTicketProducts.getPolicy(policyUILocation) != null) {
            this.orderConfirmationFinePrintText.setText(Html.fromHtml(getSelectedTicketProducts().getPolicy(policyUILocation).toString()));
            this.orderConfirmationFinePrintSeparator.setVisibility(0);
            this.orderConfirmationFinePrintText.setVisibility(0);
        }
        this.orderConfirmationPolicySeparator = viewInflate.findViewById(C8689R.id.policy_text_separator);
        this.orderConfirmationPolicyContainer = (LinearLayout) viewInflate.findViewById(C8689R.id.order_confirmation_policy_linear);
        this.ccInfo = (APCreditCardInformation) viewInflate.findViewById(C8689R.id.credit_card_information);
        this.passHolderListView = (LinearLayout) viewInflate.findViewById(C8689R.id.ap_commerce_passholder_list);
        ((TextView) viewInflate.findViewById(C8689R.id.ap_ticket_and_passes_icon)).setCompoundDrawablesWithIntrinsicBounds(0, i10, 0, 0);
        setTextCopy();
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        new Handler().postDelayed(new Runnable() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APOrderConfirmationFragment.1
            @Override // java.lang.Runnable
            public void run() {
                APOrderConfirmationFragment.this.orderConfirmationImageMickey.playAnimation();
            }
        }, 500L);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseConfirmationFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable(SAVE_PASSHOLDER_ITEMS, this.passHolderItems);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void renderRemainingUi(PurchaseConfirmation purchaseConfirmation) {
        if (purchaseConfirmation.getOrderStatus() != BookingStatus.BOOKED) {
            this.confirmationContainerView.setVisibility(8);
            this.pendingOrderView.setVisibility(0);
            return;
        }
        if (this.uiHelper.shouldDisplayWelcomeText()) {
            this.welcomeConfirmationText.setText(getString(C8689R.string.ap_sales_confirmation_welcome_text));
        }
        if (purchaseConfirmation.getFinePrint().isPresent()) {
            this.orderConfirmationFinePrintText.setText(Html.fromHtml(purchaseConfirmation.getFinePrint().get()));
            this.orderConfirmationFinePrintText.setMovementMethod(SafeLinkMovementMethod.getInstance());
            this.orderConfirmationFinePrintSeparator.setVisibility(0);
            this.orderConfirmationFinePrintText.setVisibility(0);
        }
        this.confirmationContainerView.setVisibility(0);
        this.pendingOrderView.setVisibility(8);
        if (purchaseConfirmation.getConfirmationPolicy().isPresent()) {
            this.orderConfirmationPolicySeparator.setVisibility(0);
            Iterator<ConfirmationPolicy> it = purchaseConfirmation.getConfirmationPolicy().get().iterator();
            while (it.hasNext()) {
                addPolicyToView(it.next());
            }
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void sendAnalyticsOrderConfirmationState(PurchaseConfirmation purchaseConfirmation, SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", this.analyticsProductString);
        defaultContext.put("&&currencyCode", selectedTicketProducts.getCombinedSubtotal().get().getCurrency().getCurrencyCode());
        defaultContext.put("booking.partysize", String.valueOf(selectedTicketProducts.getGenericTickets().entries().size()));
        defaultContext.put("store", "Consumer");
        Optional<PaymentUsed> paymentUsed = purchaseConfirmation.getPaymentUsed();
        String strM68725e = paymentUsed.isPresent() ? C22466q.m68725e(paymentUsed.get().getCardSubType()) : "";
        defaultContext.put("affiliation", String.valueOf(this.affiliationType));
        defaultContext.put("paymentmethod", strM68725e);
        if (purchaseConfirmation.getOrderStatus() == BookingStatus.PENDED) {
            defaultContext.put("orderpending", "1");
            defaultContext.put("m.purchaseid", purchaseConfirmation.getOrderId());
        } else {
            defaultContext.put("m.purchaseid", purchaseConfirmation.getOrderId());
            defaultContext.put("ap.confirmation", formatConfirmationNumbers(purchaseConfirmation));
        }
        defaultContext.put("m.purchase", "1");
        if (selectedTicketProducts.getTotalMonthlyPrice().isPresent() && purchaseConfirmation.isGuestOnMonthlyPlan()) {
            defaultContext.put("s.list1", selectedTicketProducts.getTotalMonthlyPrice().get().getDisplayPrice());
        }
        String residentValidationEntryValue = this.profileManager.getResidentValidationEntryValue();
        if (!C22466q.m68722b(residentValidationEntryValue)) {
            defaultContext.put("resident.validation", residentValidationEntryValue);
        }
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(this.analyticsManager.getConfirmationState(), getClass().getSimpleName(), defaultContext);
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
    protected void updateConfirmationNumberUi(String str) throws InvalidParameterException {
        initializeUiHelper();
        int welcomeConfirmationResource = ApUtils.getWelcomeConfirmationResource(this.productCategoryDetails.getProductCategoryType());
        if (welcomeConfirmationResource != -1) {
            this.welcomeConfirmationText.setText(getString(welcomeConfirmationResource));
        }
        String string = getString(C8689R.string.ap_order_confirmation_code_header);
        String string2 = getString(C8689R.string.ap_commerce_email_confirmation_title);
        this.confirmationEmailTextView.setText(string2);
        StringBuilder sb2 = new StringBuilder(string2);
        sb2.append("\n");
        sb2.append((CharSequence) string);
        sb2.append("\n");
        sb2.append(StringUtils.separate(C22466q.m68725e(str), getString(C8689R.string.ticket_sales_non_breaking_space)));
        this.confirmationNumberAccessibilityContainer.setContentDescription(sb2);
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationCodeHeader, string), BaseConfirmationManagerFragment.TextViewPair.create(this.orderConfirmationCodeText, C22466q.m68721a(str)), null);
        updatePassHoldersList();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateDeliveryInstructionsUi(CharSequence charSequence, CharSequence charSequence2, String str) {
        if (this.purchaseFlowType == PurchaseFlowType.PURCHASE_ANNUAL_PASS_RENEWAL) {
            if (WebStoreId.isWDW(getSelectedTicketProducts().getWebStoreId())) {
                if (charSequence == null) {
                    charSequence = getString(C8689R.string.ap_commerce_renewals_confirmation_delivery_instructions_header);
                }
                if (charSequence2 == null) {
                    String confirmationDeliveryInstructions = this.uiHelper.getConfirmationDeliveryInstructions(WebStoreId.isWDW(getSelectedTicketProducts().getWebStoreId()) ? getString(C8689R.string.ap_commerce_renewals_magic_band) : getString(C8689R.string.ap_commerce_renewals_card));
                    if (!C22466q.m68722b(confirmationDeliveryInstructions)) {
                        charSequence2 = confirmationDeliveryInstructions;
                    }
                }
                if (charSequence2 != null && charSequence2.toString().contains(DELIVERY_DESCRIPTION_CONFIRMATION_NUMBER)) {
                    charSequence2 = charSequence2.toString().replace(DELIVERY_DESCRIPTION_CONFIRMATION_NUMBER, str);
                }
            } else {
                charSequence = getString(C8689R.string.ap_commerce_renewals_confirmation_delivery_instructions_header);
                String confirmationDeliveryInstructions2 = this.uiHelper.getConfirmationDeliveryInstructions(WebStoreId.isWDW(getSelectedTicketProducts().getWebStoreId()) ? getString(C8689R.string.ap_commerce_renewals_magic_band) : getString(C8689R.string.ap_commerce_renewals_card));
                if (!C22466q.m68722b(confirmationDeliveryInstructions2)) {
                    charSequence2 = confirmationDeliveryInstructions2;
                }
            }
        }
        updateHeaderBodyUi(BaseConfirmationManagerFragment.TextViewPair.create(this.ticketInstructionsHeader, charSequence), BaseConfirmationManagerFragment.TextViewPair.create(this.ticketInstructionsText, charSequence2), this.ticketInstructionsSeparator);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updateNextCallToActionUi(PurchaseConfirmation purchaseConfirmation) {
        if (this.uiHelper.shouldDisplayTicketAndPassesSection(purchaseConfirmation.getOrderStatus())) {
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

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseConfirmationManagerFragment
    protected void updatePricePaymentSummaryUi(PurchaseConfirmation purchaseConfirmation) {
        getCCInfo().updateCCInfo(purchaseConfirmation.getPaymentUsed().orNull(), purchaseConfirmation.isGuestOnMonthlyPlan() ? purchaseConfirmation.getMonthlyAmount() : purchaseConfirmation.getAmountPaid(), purchaseConfirmation.getOrderStatus(), this.vendomatic.m38778o0());
    }
}