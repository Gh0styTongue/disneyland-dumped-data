package com.disney.wdpro.photopass_plus.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsHelper;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManager;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.manager.ProfileManager;
import com.disney.wdpro.base_sales_ui_lib.p070ui.FocusAwareListeners;
import com.disney.wdpro.base_sales_ui_lib.utils.FlipCardAnimationUtils;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceActions;
import com.disney.wdpro.photopass_plus.accessibility.PhotoPassOrderSummaryAccessibilityHelperImpl;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsConstants;
import com.disney.wdpro.photopass_plus.analytics.PhotoPassAnalyticsUtil;
import com.disney.wdpro.photopass_plus.checkout.errors.BookingApiErrorMessageProviderPP;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.utils.PhotoPassOrderSummaryHelper;
import com.disney.wdpro.photopass_plus.utils.StringsProvider;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderFormBuilder;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_managers.CreateTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.PurchaseTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment;
import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import com.squareup.otto.Subscribe;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes15.dex */
public final class PhotoPassOrderSummaryFragment extends BaseOrderSummaryManagersFragment {
    private PhotoPassPaywallFragment.PayWallActions actionListener;
    private BookingApiErrorMessageInterface bookingApiErrorMessageProvider;
    private CheckBox expirationPolicyCheckBox;
    private PhotoPassOrderSummaryHelper photoPassOrderSummaryHelper;
    private Map<SupportedPaymentType, Integer> purchaseButtonCaptionMap = Maps.m69380q(SupportedPaymentType.class);
    private Map<SupportedPaymentType, List<Integer>> purchaseSpinnerMessageResourceList = Maps.m69380q(SupportedPaymentType.class);
    private StringsProvider stringsProvider;

    public static PhotoPassOrderSummaryFragment newInstance(SelectedTicketProducts selectedTicketProducts, int i10, HashMap<SupportedPaymentType, Class<?>> map) {
        PhotoPassOrderSummaryFragment photoPassOrderSummaryFragment = new PhotoPassOrderSummaryFragment();
        BaseOrderSummaryFragment.ArgumentBuilder argumentBuilderCreateInstance = BaseOrderSummaryFragment.ArgumentBuilder.createInstance();
        argumentBuilderCreateInstance.withAnalyticsConstant("PhotoPass");
        argumentBuilderCreateInstance.withSelectedTicket(selectedTicketProducts);
        argumentBuilderCreateInstance.withViewLocation(i10);
        argumentBuilderCreateInstance.withSellableOnDate(selectedTicketProducts.getSellableOnDate().orNull());
        argumentBuilderCreateInstance.withSupportedPaymentTypes(map);
        argumentBuilderCreateInstance.withTermsAndConditionsCheckBoxHelper(new PhotoPassOrderSummaryAccessibilityHelperImpl());
        photoPassOrderSummaryFragment.setArguments(argumentBuilderCreateInstance.build());
        return photoPassOrderSummaryFragment;
    }

    private void populatePurchaseButtonCaptionMap() {
        this.purchaseButtonCaptionMap.put(SupportedPaymentType.CREDIT_CARD, Integer.valueOf(this.stringsProvider.getCustomResId(C18785R.string.order_summary_purchase)));
        this.purchaseButtonCaptionMap.put(SupportedPaymentType.ALIPAY, Integer.valueOf(this.stringsProvider.getCustomResId(C18785R.string.order_summary_purchase)));
        if (SupportedPaymentType.values().length != this.purchaseButtonCaptionMap.size()) {
            throw new IllegalStateException("Not all supported payment types are mapped for purchase button caption string id");
        }
    }

    private void populatePurchaseSpinnerMessageResourceList() {
        this.purchaseSpinnerMessageResourceList.put(SupportedPaymentType.CREDIT_CARD, new ArrayList(Arrays.asList(Integer.valueOf(this.stringsProvider.getCustomResId(C18785R.string.order_summary_purchase_spinner_text_purchasing)), Integer.valueOf(C18785R.string.order_summary_purchase_spinner_text_verifying_order))));
        this.purchaseSpinnerMessageResourceList.put(SupportedPaymentType.ALIPAY, null);
        if (SupportedPaymentType.values().length != this.purchaseSpinnerMessageResourceList.size()) {
            throw new IllegalStateException("Not all supported payment types are mapped for purchase spinner message resource list id");
        }
    }

    private void populatePurchaseStringsBasedOnSupportedPayment() {
        populatePurchaseButtonCaptionMap();
        populatePurchaseSpinnerMessageResourceList();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void assignTicketToPurchaser(SelectedTicketProducts selectedTicketProducts) {
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        C22462m.m68691w(ticketOrderForm.getTicketCount() > 0, "No tickets found in ticket order.");
        ticketOrderForm.assignTicket(0, ticketOrderForm.getPurchaser().get());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected TicketOrderForm buildOrder(TicketSalesCheckoutManager ticketSalesCheckoutManager, SelectedTicketProducts selectedTicketProducts) {
        TicketOrderFormBuilder ticketOrderFormBuilderNewTicketOrderFormBuilder = ticketSalesCheckoutManager.newTicketOrderFormBuilder(selectedTicketProducts.getWebStoreId(), selectedTicketProducts.getProductCategoryType());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < selectedTicketProducts.getNumberOfAllAgesTickets(); i10++) {
            CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
            arrayList.add(new TicketItem.TicketItemBuilder().withProductInstanceId(selectedTicketProducts.getAllAgesProductInstanceId().get()).withSku(selectedTicketProducts.getAllAgesATSCode().get()).withPricing(selectedTicketProducts.getAllAgesPricing()).withCategoryId(selectedTicketProducts.getAllAgesCategoryId().get()).withDtiStoreId(selectedTicketProducts.getDtiStoreId()).withMediaId(captureMediaInfo != null ? captureMediaInfo.getGuestMediaId() : null).build());
        }
        ticketOrderFormBuilderNewTicketOrderFormBuilder.addTickets(arrayList);
        ticketOrderFormBuilderNewTicketOrderFormBuilder.setSessionId(selectedTicketProducts.getSessionId());
        ticketOrderFormBuilderNewTicketOrderFormBuilder.setPurchaserSwid(this.authenticationManager.getUserSwid());
        ticketOrderFormBuilderNewTicketOrderFormBuilder.setDestinationId(selectedTicketProducts.getDestinationId());
        ticketOrderFormBuilderNewTicketOrderFormBuilder.setSellableOnDate(selectedTicketProducts.getSellableOnDate().orNull());
        return ticketOrderFormBuilderNewTicketOrderFormBuilder.build();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected TicketBrickUiHelper createTicketBrickUiHelper(FlipCardAnimationUtils.FlippedViewVisibilityNotifier flippedViewVisibilityNotifier, TicketSalesAnalyticsHelper ticketSalesAnalyticsHelper) {
        PhotoPassTicketBrickUiHelper photoPassTicketBrickUiHelper = new PhotoPassTicketBrickUiHelper(null, ticketSalesAnalyticsHelper);
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            photoPassTicketBrickUiHelper.withCaptureMediaInfo(captureMediaInfo);
        }
        return photoPassTicketBrickUiHelper;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected int getCommonErrorMessageResource() {
        return this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_common_error_message);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected int getConnectionLostMessageResource() {
        return C18785R.string.photo_pass_plus_purchase_lost_connection_message;
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    protected BookingApiErrorMessageInterface getErrorMessageProvider() {
        return this.bookingApiErrorMessageProvider;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected int getNotAdultErrorMessageResource() {
        return this.stringsProvider.getCustomResId(C18785R.string.photo_pass_plus_error_not_adult_message);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected int getPurchaseButtonMessageResource(SupportedPaymentType supportedPaymentType) {
        return this.purchaseButtonCaptionMap.get(supportedPaymentType).intValue();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected List<Integer> getPurchaseSpinnerMessageResourceList(SupportedPaymentType supportedPaymentType) {
        return this.purchaseSpinnerMessageResourceList.get(supportedPaymentType);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return getText(this.stringsProvider.getCustomResId(C18785R.string.pp_order_summary_title));
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.bookingApiErrorMessageProvider = new BookingApiErrorMessageProviderPP(getActivity(), this.formatters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (PhotoPassPaywallFragment.PayWallActions) activity;
            this.stringsProvider = (StringsProvider) activity;
            populatePurchaseStringsBasedOnSupportedPayment();
            ((ExperienceActions) activity).trackOrderSummaryAction();
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement PayWallActions, StringsProvider and ExperienceActions");
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onCreateTicketOrderEvent(CreateTicketOrderEvent createTicketOrderEvent) {
        super.onCreateTicketOrderEvent(createTicketOrderEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    @Subscribe
    public void onFetchUserIdentificationProfileAndPayment(ProfileManager.UserIdProfileAndPaymentEvent userIdProfileAndPaymentEvent) {
        super.onFetchUserIdentificationProfileAndPayment(userIdProfileAndPaymentEvent);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onPurchaseTicketOrderEvent(PurchaseTicketOrderEvent purchaseTicketOrderEvent) {
        super.onPurchaseTicketOrderEvent(purchaseTicketOrderEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.TicketSalesTermsAndConditionsFragment.OnTermsAndConditionsAcceptedCallback
    public void onTermsAndConditionsAccepted(boolean z10) {
        super.onTermsAndConditionsAccepted(z10);
        CheckBox checkBox = this.expirationPolicyCheckBox;
        if (checkBox != null) {
            checkBox.setChecked(true);
        }
        updatePurchaseButtonVisualState();
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void populateExpirationPolicyCheckContainer(LinearLayout linearLayout) {
        SelectedTicketProducts selectedTicketProducts;
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo == null || captureMediaInfo.getCaptureDate() == null || (selectedTicketProducts = this.selectedTicketProducts) == null || selectedTicketProducts.getProductCategoryType() == null) {
            return;
        }
        PhotoPassOrderSummaryHelper photoPassOrderSummaryHelper = new PhotoPassOrderSummaryHelper(getActivity(), captureMediaInfo, this.selectedTicketProducts);
        this.photoPassOrderSummaryHelper = photoPassOrderSummaryHelper;
        if (photoPassOrderSummaryHelper.isExpirationPolicyCheckBoxRequired()) {
            String expirationPolicyCheckBoxLabel = this.photoPassOrderSummaryHelper.getExpirationPolicyCheckBoxLabel();
            View viewInflate = getActivity().getLayoutInflater().inflate(C18785R.layout.ticket_sales_fragment_expiration_policy_check, (ViewGroup) linearLayout, false);
            this.expirationPolicyCheckBox = (CheckBox) viewInflate.findViewById(C18785R.id.expiration_policy_check_box);
            ((TextView) viewInflate.findViewById(C18785R.id.expiration_policy_text_view)).setText(expirationPolicyCheckBoxLabel);
            this.expirationPolicyCheckBox.setOnClickListener(FocusAwareListeners.newViewClickListener());
            this.expirationPolicyCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderSummaryFragment.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    if (compoundButton.isPressed()) {
                        ((BaseOrderSummaryFragment) PhotoPassOrderSummaryFragment.this).termsAndConditionsHelper.onExpirationPolicyCheckChange(z10);
                    }
                }
            });
            this.expirationPolicyCheckBox.setContentDescription(expirationPolicyCheckBoxLabel);
            this.expirationPolicyCheckBox.setVisibility(4);
            if (isABHideCheckboxTestEnabled()) {
                return;
            }
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackCCAddedManually() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", "PhotoPass");
        this.analyticsHelper.mo37405b("photopass.addcardmanually", mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackCCRemove() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", "PhotoPass");
        this.analyticsHelper.mo37405b("photopass.replacecard", mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackCreateOrderError(String str, String str2, Integer num) {
        trackOrderError(str, str2, "failed.service", PhotoPassAnalyticsConstants.PHOTO_PASS_KEY_ERROR_ON_CREATE_ORDER, "error.statuscode", num);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackOrderSummaryState(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("&&products", PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        mapMo37420q.put("link.category", "PhotoPass");
        mapMo37420q.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        mapMo37420q.put("&&events", String.format("event34:%1$s,scView:%1$s", this.ticketSalesCheckoutManager.getOrderId(Long.valueOf(getTicketOrderForm().getFormId()))));
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            mapMo37420q.put("experienceid", captureMediaInfo.getExperienceId());
            mapMo37420q.put("location", captureMediaInfo.getLocation());
            mapMo37420q.put("search.window", String.valueOf(captureMediaInfo.getSearchWindow()));
            mapMo37420q.put("assetid", captureMediaInfo.getAssetId());
            mapMo37420q.put("photo.type", captureMediaInfo.getMediaCategory());
            String str = simpleDateFormat.format(captureMediaInfo.getCaptureDate());
            String str2 = simpleDateFormat2.format(captureMediaInfo.getCaptureDate());
            mapMo37420q.put("search.date", str);
            mapMo37420q.put("search.time", str2);
        }
        this.analyticsHelper.mo37406c(PhotoPassAnalyticsConstants.PHOTO_PASS_STATE_ORDER_SUMMARY, PhotoPassOrderSummaryFragment.class.getSimpleName(), mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackPurchase(SelectedTicketProducts selectedTicketProducts) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("&&products", PhotoPassAnalyticsUtil.getAnalyticsProductString(selectedTicketProducts));
        mapMo37420q.put("link.category", "PhotoPass");
        mapMo37420q.put("store", PhotoPassAnalyticsUtil.getAnalyticsStoreName());
        CapturedMediaInfo captureMediaInfo = this.actionListener.getCaptureMediaInfo();
        if (captureMediaInfo != null) {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma", locale);
            mapMo37420q.put("experienceid", captureMediaInfo.getExperienceId());
            mapMo37420q.put("location", captureMediaInfo.getLocation());
            mapMo37420q.put("search.window", String.valueOf(captureMediaInfo.getSearchWindow()));
            mapMo37420q.put("assetid", captureMediaInfo.getAssetId());
            mapMo37420q.put("photo.type", captureMediaInfo.getMediaCategory());
            String str = simpleDateFormat.format(captureMediaInfo.getCaptureDate());
            String str2 = simpleDateFormat2.format(captureMediaInfo.getCaptureDate());
            mapMo37420q.put("search.date", str);
            mapMo37420q.put("search.time", str2);
        }
        this.analyticsHelper.mo37405b("photopass.purchase", mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackPurchaseOrderError(String str, String str2, Integer num) {
        trackOrderError(str, str2, "failed.service", PhotoPassAnalyticsConstants.PHOTO_PASS_KEY_ERROR_ON_PURCHASE_ORDER, "error.statuscode", num);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackScanCC() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", "PhotoPass");
        this.analyticsHelper.mo37405b("photopass.scancard", mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void trackUserProfilePaymentError(String str, String str2, Integer num) {
        trackOrderError(str, str2, "failed.service", PhotoPassAnalyticsConstants.PHOTO_PASS_KEY_ERROR_ON_FETCH_PROFILE_AND_PAYMENT, "error.statuscode", num);
    }
}