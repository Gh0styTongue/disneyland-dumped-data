package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.TicketOrder;
import com.disney.wdpro.ap_commerce_checkout.errors.BookingApiErrorMessageProviderAPRenewal;
import com.disney.wdpro.ap_commerce_checkout.fragments.APRenewalOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment;
import com.disney.wdpro.ap_commerce_checkout.p065di.APCommerceCheckoutComponent;
import com.disney.wdpro.ap_commerce_checkout.p065di.APCommerceCheckoutProvider;
import com.disney.wdpro.ap_commerce_checkout.p066ui.APTicketBrickUiHelper;
import com.disney.wdpro.ap_commerce_checkout.p066ui.StringLegalCopyConfig;
import com.disney.wdpro.base_sales_ui_lib.PurchaseFlowType;
import com.disney.wdpro.base_sales_ui_lib.TicketSalesConstants;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManager;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.p070ui.FocusAwareListeners;
import com.disney.wdpro.base_sales_ui_lib.p070ui.NonUnderlinedClickableSpan;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.SafeLinkMovementMethod;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.utils.URLSpanNoUnderline;
import com.disney.wdpro.base_sales_ui_lib.views.NorgieView;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderFormBuilder;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyDescription;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyImpl;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment;
import com.google.common.base.C22456g;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes23.dex */
public abstract class APBaseOrderSummaryFragment extends BaseOrderSummaryManagersFragment implements ViewAndSignAgreementFragment.OnAgreementSignedCallback, APTicketBrickUiHelper.TicketOrderProvider {
    private static final String ANALYTICS_PRODUCT_STRING = "ANALYTICS_PRODUCT_STRING";
    private static final String FAKE_TERMS_AND_CONDITIONS_ID = "fake-terms-and-conditions-id";
    private static final String PAYMENT_PLAN = "AP_ORDER_SUMMARY_PAYMENT_PLAN";
    private static final String TICKET_ITEMS = "AP_ORDER_SUMMARY_TICKET_ITEMS";
    protected APRenewalOrderSummaryFragment.APRenewalOrderSummaryActions actionListener;
    private ImageView agreementSignedCheckMark;
    private TextView agreementSignedTextView;
    protected String analyticsProductString;
    protected APCommerceCheckoutManager apCommerceCheckoutManager;
    private BookingApiErrorMessageInterface bookingApiErrorMessageProvider;
    protected View consentOpacityLayer;
    private TextView monthlyPaymentAgreement;
    private ViewGroup monthlyPaymentAgreementGroup;
    protected View monthlyPaymentOpacityLayer;
    protected ApPassHolderDemographicDataManager passHolderDemographicDataManager;
    protected ViewGroup passholderDetailsViewGroup;
    protected TextView passholderErrorMessage;
    protected boolean paymentPlan;
    protected ViewGroup signatureConsentGroup;
    protected HashMap<String, PersonName> ticketItemEntitlementIdToNameMap;
    protected ArrayList<TicketItem> ticketItems;
    private TextView viewAndSignButton;
    protected final View.OnClickListener opacityLayerClickListener = new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.d
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f29268a.lambda$new$0(view);
        }
    };
    protected View.OnClickListener detailsClickListener = new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment.6
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C22462m.m68673e(view instanceof NorgieView, "details click listener can only be applied to Norgie View");
            NorgieView norgieView = (NorgieView) view;
            if (!norgieView.isDetailsOpen()) {
                norgieView.setImportantForAccessibility(2);
                norgieView.setFocusable(false);
                norgieView.setTitle(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_passholder_norgie_title));
                norgieView.setTitleContentDescription(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_passholder_norgie_title));
                norgieView.setContentDescription(APBaseOrderSummaryFragment.this.getString(C8689R.string.ticekt_sales_review_and_purchase_view_details_accessibility));
                return;
            }
            norgieView.setImportantForAccessibility(1);
            norgieView.setFocusable(true);
            norgieView.setTitle(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_passholder_norgie_title_open_state));
            norgieView.setTitleContentDescription(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_passholder_norgie_title_open_state));
            C20511d c20511d = new C20511d(APBaseOrderSummaryFragment.this.getContext());
            c20511d.m62027f(norgieView.getTitle().toString());
            c20511d.m62031j(norgieView.getDetails1().toString());
            c20511d.m62031j(norgieView.getDetails2().toString());
            norgieView.setContentDescription(c20511d.toString().substring(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_passholder_norgie_title_open_state).length() + 1, c20511d.toString().length()));
            APBaseOrderSummaryFragment.this.trackNorgieAnalyticsAction();
        }
    };

    protected static class ApBaseOrderSummaryArgumentBuilder extends BaseOrderSummaryFragment.ArgumentBuilder<ApBaseOrderSummaryArgumentBuilder> {
        private String analyticsProductString;
        private boolean paymentPlan;
        private ArrayList<TicketItem> ticketItems;

        protected ApBaseOrderSummaryArgumentBuilder() {
        }

        public static ApBaseOrderSummaryArgumentBuilder createNewInstance() {
            return new ApBaseOrderSummaryArgumentBuilder();
        }

        @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment.ArgumentBuilder
        public Bundle build() {
            Bundle bundleBuild = super.build();
            bundleBuild.putBoolean(APBaseOrderSummaryFragment.PAYMENT_PLAN, this.paymentPlan);
            bundleBuild.putSerializable(APBaseOrderSummaryFragment.TICKET_ITEMS, this.ticketItems);
            bundleBuild.putString(APBaseOrderSummaryFragment.ANALYTICS_PRODUCT_STRING, this.analyticsProductString);
            return bundleBuild;
        }

        public ApBaseOrderSummaryArgumentBuilder withAnalyticsProductString(String str) {
            this.analyticsProductString = str;
            return this;
        }

        public ApBaseOrderSummaryArgumentBuilder withPaymentPlan(boolean z10) {
            this.paymentPlan = z10;
            return this;
        }

        public ApBaseOrderSummaryArgumentBuilder withTicketItems(ArrayList<TicketItem> arrayList) {
            this.ticketItems = arrayList;
            return this;
        }
    }

    protected final class PriceInfoHelper {
        private String cdPauseDelimiter;
        private StringBuilder contentDescription = new StringBuilder();
        private LayoutInflater inflater;
        private LinearLayout priceInfo;

        public PriceInfoHelper(LinearLayout linearLayout, LayoutInflater layoutInflater, String str) {
            this.priceInfo = linearLayout;
            this.inflater = layoutInflater;
            this.cdPauseDelimiter = str;
        }

        private View createPriceView(CharSequence charSequence, CharSequence charSequence2) {
            ViewGroup viewGroup = (ViewGroup) this.inflater.inflate(C8689R.layout.ap_price_item_layout, (ViewGroup) this.priceInfo, false);
            TextView textView = (TextView) viewGroup.findViewById(C8689R.id.ap_price_text);
            TextView textView2 = (TextView) viewGroup.findViewById(C8689R.id.ap_price_value);
            textView.setText(charSequence);
            if (charSequence.equals(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_ticket_value_label))) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(APBaseOrderSummaryFragment.this.getString(C8689R.string.ticket_sales_cd_hyphen));
                spannableStringBuilder.append(charSequence2);
                textView2.setText(spannableStringBuilder);
            } else {
                textView2.setText(charSequence2);
            }
            StringBuilder sb2 = this.contentDescription;
            sb2.append(this.cdPauseDelimiter);
            sb2.append(charSequence);
            sb2.append(this.cdPauseDelimiter);
            if (charSequence.equals(APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_ticket_value_label))) {
                charSequence2 = APBaseOrderSummaryFragment.this.getString(C8689R.string.ap_commerce_subtract_word) + ((Object) charSequence2);
            }
            sb2.append(charSequence2);
            return viewGroup;
        }

        private View createTotalView(CharSequence charSequence, CharSequence charSequence2) {
            ViewGroup viewGroup = (ViewGroup) this.inflater.inflate(C8689R.layout.ap_commerce_total_price_item_layout, (ViewGroup) this.priceInfo, false);
            TextView textView = (TextView) viewGroup.findViewById(C8689R.id.ap_total_price_text);
            TextView textView2 = (TextView) viewGroup.findViewById(C8689R.id.ap_total_price_value);
            textView.setText(charSequence);
            textView2.setText(charSequence2);
            StringBuilder sb2 = this.contentDescription;
            sb2.append(this.cdPauseDelimiter);
            sb2.append(charSequence);
            sb2.append(this.cdPauseDelimiter);
            sb2.append(charSequence2);
            return viewGroup;
        }

        public void addPriceItemIfExist(int i10, Price price) {
            if (price != null) {
                this.priceInfo.addView(createPriceView(APBaseOrderSummaryFragment.this.getString(i10), DisplayPriceFormatter.formatDisplayPrice(price)));
            }
        }

        public void addPriceSummaryFooter(boolean z10, Price price) {
            if (price == null) {
                return;
            }
            String name = price.getCurrency().getName();
            ViewGroup viewGroup = (ViewGroup) this.inflater.inflate(C8689R.layout.ap_commerce_price_summary_footer, (ViewGroup) this.priceInfo, false);
            TextView textView = (TextView) viewGroup.findViewById(C8689R.id.text_prices_are_in_currency);
            textView.setText(APBaseOrderSummaryFragment.this.getString(C8689R.string.ticket_sales_prices_are_in_currency, name));
            TextView textView2 = (TextView) viewGroup.findViewById(C8689R.id.ap_first_payment_notice);
            textView2.setVisibility(z10 ? 0 : 8);
            this.priceInfo.addView(viewGroup);
            if (textView2.getVisibility() == 0) {
                this.contentDescription.append(this.cdPauseDelimiter);
                this.contentDescription.append(textView2.getText());
            }
            StringBuilder sb2 = this.contentDescription;
            sb2.append(this.cdPauseDelimiter);
            sb2.append(textView.getText());
        }

        public void addTotalPriceItemIfExist(int i10, Price price) {
            if (price != null) {
                this.priceInfo.addView(createTotalView(APBaseOrderSummaryFragment.this.getString(i10), DisplayPriceFormatter.formatDisplayPrice(price)));
            }
        }

        public StringBuilder getContentDescription() {
            return this.contentDescription;
        }
    }

    private void createEntitlementIdToNameMap() {
        this.ticketItemEntitlementIdToNameMap = Maps.m69381r();
        Iterator<TicketItem> it = this.ticketItems.iterator();
        while (it.hasNext()) {
            TicketItem next = it.next();
            this.ticketItemEntitlementIdToNameMap.put(next.getEntitlementId(), next.getGuestName().orNull());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableList<Policy> getFlexTermsAndConditionsPolicies() {
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        String flexPassTermsAndCondition = this.apCommerceCheckoutManager.getFlexPassTermsAndCondition(getTicketOrderForm().getFormId());
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        linkedHashMapM69385v.put(FAKE_TERMS_AND_CONDITIONS_ID, new PolicyDescription(FAKE_TERMS_AND_CONDITIONS_ID, FAKE_TERMS_AND_CONDITIONS_ID, null, flexPassTermsAndCondition != null ? flexPassTermsAndCondition.toString() : "", "WDPRO Mobile"));
        c22583aBuilder.mo69026a(new PolicyImpl(PolicyGroup.GUEST_POLICY, PolicyGroup.PolicySubGroup.MOBILE_RESTRICTION, linkedHashMapM69385v));
        return c22583aBuilder.m69053m();
    }

    private void inflateAndSetElectronicallySignedText() {
        this.agreementSignedTextView = (TextView) this.monthlyPaymentAgreementGroup.findViewById(C8689R.id.ap_commerce_electronically_signed_text);
        this.agreementSignedCheckMark = (ImageView) this.monthlyPaymentAgreementGroup.findViewById(C8689R.id.ap_checkmark_takeover_view);
        this.agreementSignedTextView.setOnClickListener(FocusAwareListeners.newViewClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TicketOrderForm ticketOrderForm = APBaseOrderSummaryFragment.this.getTicketOrderForm();
                APBaseOrderSummaryFragment aPBaseOrderSummaryFragment = APBaseOrderSummaryFragment.this;
                aPBaseOrderSummaryFragment.actionListener.showMonthlyPaymentAgreement(aPBaseOrderSummaryFragment, ticketOrderForm);
            }
        }));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(getString(C8689R.string.ap_commerce_electronically_signed_text_brackets), new StyleSpan(1), 33);
        spannableStringBuilder.append((CharSequence) (getString(C8689R.string.ticket_sales_non_breaking_space) + (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId()) ? getString(C8689R.string.ap_commerce_electronically_signed_text_wdw) : getString(C8689R.string.ap_commerce_electronically_signed_text_dlr))));
        spannableStringBuilder.append(getString(C8689R.string.ap_commerce_electronically_signed_link), FocusAwareListeners.newClickableSpan(new NonUnderlinedClickableSpan() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment.5
            @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.NonUnderlinedClickableSpan, android.text.style.ClickableSpan
            public void onClick(View view) {
            }
        }), 33);
        this.agreementSignedTextView.setText(spannableStringBuilder);
        this.agreementSignedTextView.setHighlightColor(0);
        this.agreementSignedTextView.setMovementMethod(SafeLinkMovementMethod.getInstance());
        this.agreementSignedTextView.setContentDescription(C22456g.m68633k(getString(C8689R.string.ticket_sales_comma)).m68638g(spannableStringBuilder, getString(C8689R.string.ap_commerce_cd_pronounce_button), new Object[0]));
    }

    private void inflateMonthlyPaymentAgreementSection(View view, LayoutInflater layoutInflater) {
        if (this.paymentPlan) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C8689R.id.monthly_payment_agreement_container);
            frameLayout.removeAllViews();
            frameLayout.setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(C8689R.layout.ap_commerce_monthly_payment_agreement, (ViewGroup) frameLayout, true);
            this.monthlyPaymentAgreementGroup = viewGroup;
            this.monthlyPaymentAgreement = (TextView) viewGroup.findViewById(C8689R.id.monthly_payment_agreement);
            TextView textView = (TextView) this.monthlyPaymentAgreementGroup.findViewById(C8689R.id.btn_view_and_sign);
            this.viewAndSignButton = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f29258a.lambda$inflateMonthlyPaymentAgreementSection$3(view2);
                }
            });
            View viewFindViewById = this.monthlyPaymentAgreementGroup.findViewById(C8689R.id.ap_mothly_payment_opacity_layer);
            this.monthlyPaymentOpacityLayer = viewFindViewById;
            viewFindViewById.setOnClickListener(this.opacityLayerClickListener);
            inflateAndSetElectronicallySignedText();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createTicketBrickUiHelper$4(TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper, View view) {
        Map<String, String> defaultContext = ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        ticketSalesAnalyticsHelper.trackAction("ImportantDetails", defaultContext);
        this.actionListener.showLegalCopyScreen(StringLegalCopyConfig.builder().title(getString(C8689R.string.ap_commerce_important_details)).legalStringCopy(this.selectedTicketProducts.getPolicy(SelectedTicketProducts.PolicyUILocation.ORDER_SUMMARY_IMPORTANT_DETAILS).toString()).ticketOrderForm(getTicketOrderForm()).hideScreenHeader().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$inflateMonthlyPaymentAgreementSection$3(View view) {
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        Set<TicketOrderForm.ValidationReasons> setValidateForContractGeneration = ticketOrderForm.validateForContractGeneration(this.supportedPaymentTypeMap.keySet());
        if (!setValidateForContractGeneration.isEmpty()) {
            displayValidationError(this.validationErrorHolder.getValidationError(setValidateForContractGeneration));
            return;
        }
        applySelectedCardToOrder();
        Phone billingPhone = getBillingPhone();
        if (billingPhone != null) {
            ticketOrderForm.setPaymentBillingPhone(billingPhone);
        }
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        this.ticketSalesAnalyticsHelper.trackAction("ViewAgreement", defaultContext);
        this.actionListener.showMonthlyPaymentAgreement(this, ticketOrderForm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        getAndShowTopError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$populateSignatureConsent$1(View view) {
        getTicketOrderForm().acceptElectronicSignatureConsent(((CheckBox) view).isChecked());
        setUiState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$populateSignatureConsent$2(View view) {
        String string;
        String string2;
        if (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId())) {
            string = getString(C8689R.string.ap_commerce_electronic_signature_consent_wdw);
            string2 = getString(C8689R.string.ap_commerce_electronic_signature_consent_title_wdw);
        } else if (WebStoreId.isDLR(this.selectedTicketProducts.getWebStoreId())) {
            string = getString(C8689R.string.ap_commerce_electronic_signature_consent_dlr);
            string2 = getString(C8689R.string.ap_commerce_electronic_signature_consent_title_dlr);
        } else {
            this.selectedTicketProducts.getWebStoreId();
            string = "";
            string2 = "";
        }
        this.actionListener.showLegalCopyScreen(StringLegalCopyConfig.builder().title(string2).legalStringCopy(string).ticketOrderForm(getTicketOrderForm()).enableSaveAndShare().build());
    }

    private void populateSignatureConsent(View view, LayoutInflater layoutInflater) {
        if (this.paymentPlan) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C8689R.id.electronic_signature_consent_container);
            frameLayout.setVisibility(0);
            this.signatureConsentGroup = (ViewGroup) layoutInflater.inflate(C8689R.layout.ap_commerce_consent_to_use_electronic_signatures, (ViewGroup) frameLayout, true);
            CheckBox checkBox = (CheckBox) frameLayout.findViewById(C8689R.id.electronic_signature_check_box);
            checkBox.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f29265a.lambda$populateSignatureConsent$1(view2);
                }
            });
            TextView textView = (TextView) this.signatureConsentGroup.findViewById(C8689R.id.electronic_signature_link);
            String string = getString(C8689R.string.ap_commerce_electronic_signature_consent_text_link);
            textView.setText(getString(C8689R.string.ap_commerce_electronic_signature_consent_text, string));
            textView.setOnClickListener(FocusAwareListeners.newViewClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f29267a.lambda$populateSignatureConsent$2(view2);
                }
            }));
            String string2 = textView.getText().toString();
            SpannableString spannableString = new SpannableString(textView.getText());
            spannableString.setSpan(FocusAwareListeners.newClickableSpan(new NonUnderlinedClickableSpan() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment.1
                @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.NonUnderlinedClickableSpan, android.text.style.ClickableSpan
                public void onClick(View view2) {
                }
            }), string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
            textView.setText(spannableString);
            textView.setHighlightColor(0);
            textView.setMovementMethod(SafeLinkMovementMethod.getInstance());
            C20932b.m63187f(textView, spannableString.toString());
            checkBox.setContentDescription(string);
            View viewFindViewById = this.signatureConsentGroup.findViewById(C8689R.id.ap_commerce_consent_to_use_electronic_signatures_opacity_layer);
            this.consentOpacityLayer = viewFindViewById;
            viewFindViewById.setOnClickListener(this.opacityLayerClickListener);
        }
    }

    private boolean updateMonthlyAgreementUiState(boolean z10) {
        if (!this.paymentPlan) {
            return z10;
        }
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        if (ticketOrderForm == null || !ticketOrderForm.isMonthlyContractSigned()) {
            this.viewAndSignButton.setVisibility(0);
            this.agreementSignedTextView.setVisibility(8);
            this.agreementSignedCheckMark.setVisibility(8);
        } else {
            this.viewAndSignButton.setVisibility(8);
            this.agreementSignedTextView.setVisibility(0);
            this.agreementSignedCheckMark.setVisibility(0);
        }
        boolean z11 = z10 && ticketOrderForm != null && ticketOrderForm.isElectronicSignatureConsentAccepted();
        if (z11) {
            this.monthlyPaymentAgreement.setText(getString(C8689R.string.ap_commerce_monthly_payment_agreement_text_active));
            this.viewAndSignButton.setContentDescription(getString(C8689R.string.f29125xb0ce5c6e));
            this.viewAndSignButton.setEnabled(true);
            this.monthlyPaymentOpacityLayer.setVisibility(8);
            return z11;
        }
        this.monthlyPaymentAgreement.setText(getString(C8689R.string.ap_commerce_monthly_payment_agreement_text_inactive));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(C8689R.string.f29125xb0ce5c6e));
        sb2.append(getString(C8689R.string.ticket_sales_non_breaking_space));
        sb2.append(getString(C8689R.string.ap_commerce_monthly_payment_agreement_text_inactive));
        this.viewAndSignButton.setContentDescription(sb2);
        this.viewAndSignButton.setEnabled(false);
        this.monthlyPaymentOpacityLayer.setVisibility(0);
        return z11;
    }

    private boolean updateSignatureConsentOpacity(boolean z10) {
        boolean z11 = z10 && isCVVlengthGood();
        View view = this.consentOpacityLayer;
        if (view != null) {
            view.setVisibility(z11 ? 8 : 0);
        }
        return z11;
    }

    private boolean updateTotalSectionOpaque(boolean z10) {
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        if (this.paymentPlan) {
            z10 = z10 && ticketOrderForm != null && ticketOrderForm.isElectronicSignatureConsentAccepted() && ticketOrderForm.isMonthlyContractSigned();
        }
        View view = this.priceOpacityLayer;
        if (view != null) {
            view.setVisibility(z10 ? 8 : 0);
        }
        return z10;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected TicketOrderForm buildOrder(TicketSalesCheckoutManager ticketSalesCheckoutManager, SelectedTicketProducts selectedTicketProducts) {
        TicketOrderFormBuilder ticketOrderFormBuilderNewTicketOrderFormBuilder = ticketSalesCheckoutManager.newTicketOrderFormBuilder(getWebStoreId(), this.productCategoryDetails.getProductCategoryType());
        if (selectedTicketProducts == null || this.purchaseFlowType != PurchaseFlowType.PURCHASE_ANNUAL_PASS_RENEWAL) {
            ticketSalesCheckoutManager.populateOrderBuilder(ticketOrderFormBuilderNewTicketOrderFormBuilder, selectedTicketProducts, this.authenticationManager.getUserSwid());
        } else {
            ticketOrderFormBuilderNewTicketOrderFormBuilder.addTickets(this.ticketItems).setSessionId(selectedTicketProducts.getSessionId()).setPurchaserSwid(this.authenticationManager.getUserSwid()).setDestinationId(selectedTicketProducts.getDestinationId()).setPaymentPlan(this.paymentPlan).setSellableOnDate(this.sellableOnDate);
        }
        return ticketOrderFormBuilderNewTicketOrderFormBuilder.build();
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void createOrderOnServer() {
        if (getTicketOrderForm() == null || this.apCommerceCheckoutManager.getSafeOrderId(Long.valueOf(getTicketOrderForm().getFormId())) == null) {
            this.apCommerceCheckoutManager.createTicketOrder(getTicketOrderForm(), this.productCategoryDetails);
            startProgressCreateOrder();
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, final TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        return APTicketBrickUiHelper.from(getContext()).paymentPlanProvider(this).importantAnnualPassDetailsClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29269a.lambda$createTicketBrickUiHelper$4(ticketSalesAnalyticsHelper, view);
            }
        }).build();
    }

    protected void getAndShowTopError() {
        Set<TicketOrderForm.ValidationReasons> setValidateForContractGeneration = getTicketOrderForm().validateForContractGeneration(this.supportedPaymentTypeMap.keySet());
        if (setValidateForContractGeneration.isEmpty()) {
            return;
        }
        displayValidationError(this.validationErrorHolder.getValidationError(setValidateForContractGeneration));
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    protected BookingApiErrorMessageInterface getErrorMessageProvider() {
        return this.bookingApiErrorMessageProvider;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected ImmutableList<Policy> getTermsAndConditionsPolicies(Set<PolicyGroup> set, Set<PolicyGroup.PolicySubGroup> set2) {
        ImmutableList.C22583a c22583aBuilder = ImmutableList.builder();
        CharSequence policy = this.selectedTicketProducts.getPolicy(SelectedTicketProducts.PolicyUILocation.ORDER_SUMMARY_TERMS_AND_CONDITIONS);
        LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
        linkedHashMapM69385v.put(FAKE_TERMS_AND_CONDITIONS_ID, new PolicyDescription(FAKE_TERMS_AND_CONDITIONS_ID, FAKE_TERMS_AND_CONDITIONS_ID, null, policy != null ? policy.toString() : "", "WDPRO Mobile"));
        c22583aBuilder.mo69026a(new PolicyImpl(PolicyGroup.GUEST_POLICY, PolicyGroup.PolicySubGroup.MOBILE_RESTRICTION, linkedHashMapM69385v));
        return c22583aBuilder.m69053m();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected SpannableString getTermsAndConditionsString(BaseOrderSummaryFragment.SpannableCallback spannableCallback) {
        String string;
        String string2 = getContext().getString(C8689R.string.ticket_sales_terms_of_conditions_ticket_sales);
        String string3 = getContext().getString(C8689R.string.ap_commerce_terms_and_conditions_check, string2);
        if (C22466q.m68722b(this.apCommerceCheckoutManager.getFlexPassTermsAndCondition(getTicketOrderForm().getFormId()))) {
            string = null;
        } else {
            string2 = getActivity().getString(C8689R.string.ticket_sales_terms_of_conditions_ticket_sales);
            string3 = getActivity().getString(C8689R.string.ap_commerce_terms_and_conditions_flex_pass_check, string2);
            string = getContext().getString(C8689R.string.ap_commerce_terms_and_conditions_flex_pass);
        }
        URLSpanNoUnderline uRLSpanNoUnderline = new URLSpanNoUnderline(string3) { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment.2
            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public void onClick(View view) {
                ((BaseOrderSummaryFragment) APBaseOrderSummaryFragment.this).termsAndConditionsHelper.showTermsAndConditionsScreen();
            }
        };
        SpannableString spannableString = new SpannableString(string3);
        spannableString.setSpan(uRLSpanNoUnderline, string3.indexOf(string2), string3.indexOf(string2) + string2.length(), 33);
        if (!C22466q.m68722b(string)) {
            spannableString.setSpan(new URLSpanNoUnderline(string3) { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment.3
                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                public void onClick(View view) {
                    ((BaseOrderSummaryFragment) APBaseOrderSummaryFragment.this).termsAndConditionsHelper.showTermsAndConditionsScreen(APBaseOrderSummaryFragment.this.getFlexTermsAndConditionsPolicies());
                }
            }, string3.indexOf(string), string3.indexOf(string) + string.length(), 33);
        }
        return spannableString;
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.ui.APTicketBrickUiHelper.TicketOrderProvider
    public TicketOrder getTicketOrder() {
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        if (ticketOrderForm == null) {
            return null;
        }
        return this.apCommerceCheckoutManager.getTicketOrder(ticketOrderForm.getFormId(), ticketOrderForm.getProductCategoryType());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getText(C8689R.string.ap_commerce_order_summary_title);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void moveToConfirmationScreen() {
        this.actionListener.showOrderConfirmationScreen(this.selectedTicketProducts, Long.valueOf(getTicketOrderForm().getFormId()), this.passHolderDemographicDataManager.getPassholderItemList());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.bookingApiErrorMessageProvider = new BookingApiErrorMessageProviderAPRenewal(getContext(), this.formatters);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ViewAndSignAgreementFragment.OnAgreementSignedCallback
    public void onAgreementSigned(boolean z10) {
        getTicketOrderForm().signMonthlyContract(z10);
        getActivity().getSupportFragmentManager().m19739h1();
        trackOrderSummaryState(this.selectedTicketProducts);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (APRenewalOrderSummaryFragment.APRenewalOrderSummaryActions) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.getClass().getName() + " must implement " + APRenewalOrderSummaryFragment.APRenewalOrderSummaryActions.class.getSimpleName());
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws IllegalArgumentException {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.productCategoryDetails = (ProductCategoryDetails) bundle.getSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS);
            this.paymentPlan = bundle.getBoolean(PAYMENT_PLAN);
            this.ticketItems = (ArrayList) bundle.getSerializable(TICKET_ITEMS);
            this.analyticsProductString = bundle.getString(ANALYTICS_PRODUCT_STRING);
        } else if (arguments != null) {
            this.productCategoryDetails = (ProductCategoryDetails) arguments.getSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS);
            this.paymentPlan = arguments.getBoolean(PAYMENT_PLAN);
            this.ticketItems = (ArrayList) arguments.getSerializable(TICKET_ITEMS);
            this.analyticsProductString = arguments.getString(ANALYTICS_PRODUCT_STRING);
        }
        APCommerceCheckoutComponent aPCommerceCheckoutComponent = ((APCommerceCheckoutProvider) getActivity().getApplication()).getAPCommerceCheckoutComponent();
        this.apCommerceCheckoutManager = aPCommerceCheckoutComponent.getAPCommerceCheckoutManager();
        this.passHolderDemographicDataManager = aPCommerceCheckoutComponent.getApPassHolderDemographicDataManager();
        createEntitlementIdToNameMap();
        verifyProductType();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater.inflate(C8689R.layout.ap_commerce_fragment_passholders_details, (ViewGroup) viewOnCreateView.findViewById(C8689R.id.order_summary_assign_purchaser_container), true);
        this.passholderDetailsViewGroup = (ViewGroup) viewOnCreateView.findViewById(C8689R.id.passholders_view_group);
        this.passholderErrorMessage = (TextView) viewOnCreateView.findViewById(C8689R.id.passholders_txt_error);
        populateSignatureConsent(viewOnCreateView, layoutInflater);
        inflateMonthlyPaymentAgreementSection(viewOnCreateView, layoutInflater);
        this.priceOpacityLayer.setOnClickListener(this.opacityLayerClickListener);
        return viewOnCreateView;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void onPaymentMethodsUpdated() {
        super.onPaymentMethodsUpdated();
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        if (ticketOrderForm != null) {
            ticketOrderForm.signMonthlyContract(false);
        }
        setUiState();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(PAYMENT_PLAN, this.paymentPlan);
        bundle.putSerializable(TICKET_ITEMS, this.ticketItems);
        bundle.putSerializable(TicketSalesConstants.KEY_ARG_PRODUCT_CATEGORY_DETAILS, this.productCategoryDetails);
        bundle.putString(ANALYTICS_PRODUCT_STRING, this.analyticsProductString);
    }

    protected abstract void populateFullPaymentView(PriceInfoHelper priceInfoHelper);

    protected abstract void populateMonthlyPaymentView(PriceInfoHelper priceInfoHelper);

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void populatePriceView(View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C8689R.id.footer_price_container);
        frameLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        LinearLayout linearLayout = (LinearLayout) layoutInflaterFrom.inflate(C8689R.layout.ap_commerce_fragment_price_footer, (ViewGroup) frameLayout, false);
        PriceInfoHelper priceInfoHelper = new PriceInfoHelper(linearLayout, layoutInflaterFrom, getString(C8689R.string.ticket_sales_comma));
        if (this.paymentPlan) {
            populateMonthlyPaymentView(priceInfoHelper);
        } else {
            if (WebStoreId.isWDW(getWebStoreId())) {
                view.findViewById(C8689R.id.price_summary_title).setVisibility(8);
            }
            populateFullPaymentView(priceInfoHelper);
        }
        frameLayout.addView(linearLayout);
        frameLayout.setContentDescription(priceInfoHelper.getContentDescription());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void populateTicketAssignList(SelectedTicketProducts selectedTicketProducts, TicketSalesConfigManager ticketSalesConfigManager) {
        renderPassHolderItems();
        getTicketOrderForm().setDemographicDataAvailableForAllGuests(this.passHolderDemographicDataManager.hasDemographicDataForAllGuests());
    }

    protected abstract void renderPassHolderItems();

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void setUiState() {
        updateTotalSectionOpaque(updateMonthlyAgreementUiState(updateSignatureConsentOpacity(setUiStateDelegate())));
    }

    protected abstract boolean setUiStateDelegate();

    protected abstract void trackNorgieAnalyticsAction();

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackOrderSummaryState(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("&&products", this.analyticsProductString);
        defaultContext.put("party.size", String.valueOf(selectedTicketProducts.getGenericTickets().size()));
        this.ticketSalesAnalyticsHelper.trackStateWithSTEM(this.analyticsManager.getOrderSummaryState(), getClass().getSimpleName(), defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackPurchase(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> defaultContext = this.ticketSalesAnalyticsHelper.getDefaultContext();
        defaultContext.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(selectedTicketProducts));
        defaultContext.put("&&products", this.analyticsProductString);
        this.ticketSalesAnalyticsHelper.trackAction(this.analyticsManager.getPurchaseAction(), defaultContext);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void validateForm() {
    }

    protected abstract void verifyProductType() throws IllegalArgumentException;
}