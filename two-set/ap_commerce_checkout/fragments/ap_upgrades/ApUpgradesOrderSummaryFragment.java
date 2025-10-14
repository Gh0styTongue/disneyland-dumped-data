package com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.ApUtils;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.APRenewalOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.base.BaseResidencyValidationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.manager.ProfileManager;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.PassHolderViewItem;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.ticket_sales_base_lib.FetchFPTicketEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.utils.SerializablePair;
import com.disney.wdpro.ticket_sales_managers.CreateTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.PurchaseTicketOrderEvent;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes23.dex */
public final class ApUpgradesOrderSummaryFragment extends BaseResidencyValidationFragment {
    private static final int ADULT_AGE = 18;
    private static final String LOG_TAG = "ApUpgradesOrderSummaryFragment";
    private ApUpgradesOrderSummaryFragmentActions actionListener;
    private View priceOpacityLayer;
    private final View.OnClickListener showAddDemographicInfoScreen = new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.ApUpgradesOrderSummaryFragment.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UserDataContainer userDataContainer = (UserDataContainer) view.getTag();
            ApUpgradesOrderSummaryFragment.this.actionListener.showDemographicInfoScreen(userDataContainer.getassignedEntitlementId(), ApUpgradesOrderSummaryFragment.this.getTicketOrderForm().getFormId(), ApUpgradesOrderSummaryFragment.this.getWebStoreId(), userDataContainer);
            ApUpgradesOrderSummaryFragment.this.trackViewPassholderDetailsAnalytics(userDataContainer.getUserDataFromContainer().isUserDemographicDataAvailable() ? "EditPassholderDetails" : "AddGuestInfo");
        }
    };

    public interface ApUpgradesOrderSummaryFragmentActions extends APRenewalOrderSummaryFragment.APRenewalOrderSummaryActions {
        void showDemographicInfoScreen(String str, long j10, WebStoreId webStoreId, UserDataContainer userDataContainer);
    }

    private TicketItem getActualTicketItem(UserDataContainer userDataContainer) {
        Iterator<TicketItem> it = this.ticketItems.iterator();
        while (it.hasNext()) {
            TicketItem next = it.next();
            if (next.getEntitlementId().equals(userDataContainer.getassignedEntitlementId())) {
                return next;
            }
        }
        throw new IllegalStateException("Age Group for the actual entitlement is missed.");
    }

    private View getEditGuestInfoTextView(UserDataContainer userDataContainer) {
        View viewInflate = View.inflate(getContext(), C8689R.layout.ap_commerce_edit_passholder_details, null);
        TextView textView = (TextView) viewInflate.findViewById(C8689R.id.editPassholderDetailTextView);
        textView.setTag(userDataContainer);
        textView.setOnClickListener(this.showAddDemographicInfoScreen);
        return viewInflate;
    }

    public static ApUpgradesOrderSummaryFragment newInstance(ArrayList<TicketItem> arrayList, SelectedTicketProducts selectedTicketProducts, HashMap<SupportedPaymentType, Class<?>> map, boolean z10, String str) {
        ApUpgradesOrderSummaryFragment apUpgradesOrderSummaryFragment = new ApUpgradesOrderSummaryFragment();
        apUpgradesOrderSummaryFragment.setArguments(APBaseOrderSummaryFragment.ApBaseOrderSummaryArgumentBuilder.createNewInstance().withPaymentPlan(z10).withAnalyticsProductString(str).withTicketItems(arrayList).withSelectedTicket(selectedTicketProducts).withViewLocation(Integer.MIN_VALUE).withSellableOnDate(selectedTicketProducts.getSellableOnDate().orNull()).withSupportedPaymentTypes(map).build());
        return apUpgradesOrderSummaryFragment;
    }

    private void populateFullDLR(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper, Pricing pricing) {
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_dlr_price_label, pricing.getBaseTotalValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_ticket_value_label, pricing.getTotalTicketValue().get());
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_total_payment_due, pricing.getTotal());
        priceInfoHelper.addPriceSummaryFooter(false, pricing.getTotal());
    }

    private void populateFullWDW(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper, Pricing pricing) {
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_price_label, pricing.getBaseTotalValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_ticket_value_label, pricing.getTotalTicketValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.base_sales_subtotal_text, pricing.getSubtotal().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_tax_label, pricing.getTax().get());
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_total_payment_due, pricing.getTotal());
        priceInfoHelper.addPriceSummaryFooter(false, pricing.getTotal());
    }

    private void populateMonthlyDLR(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper, Pricing pricing) {
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_dlr_price_label, pricing.getBaseTotalValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_ticket_value_label, pricing.getTotalTicketValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_total_payment_due, pricing.getTotal());
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_now_label, this.apCommerceCheckoutManager.getTotalDepositDueAmount(Long.valueOf(getTicketOrderForm().getFormId())).get().getTotal());
        Price price = this.apCommerceCheckoutManager.getMonthlyPaymentAmount(Long.valueOf(getTicketOrderForm().getFormId())).get().getPrice();
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_monthly, price);
        priceInfoHelper.addPriceSummaryFooter(true, price);
    }

    private void populateMonthlyWDW(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper, Pricing pricing) {
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_price_label, pricing.getBaseTotalValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_ticket_value_label, pricing.getTotalTicketValue().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.base_sales_subtotal_text, pricing.getSubtotal().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_tax_label, pricing.getTax().get());
        priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_total_order_price_label, pricing.getTotal());
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_now_label, this.apCommerceCheckoutManager.getTotalDepositDueAmount(Long.valueOf(getTicketOrderForm().getFormId())).get().getTotal());
        Price price = this.apCommerceCheckoutManager.getMonthlyPaymentAmount(Long.valueOf(getTicketOrderForm().getFormId())).get().getPrice();
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_monthly, price);
        priceInfoHelper.addPriceSummaryFooter(true, price);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackViewPassholderDetailsAnalytics(String str) {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        this.analyticsHelper.mo37405b(str, mapMo37420q);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void assignTicketToPurchaser(SelectedTicketProducts selectedTicketProducts) {
    }

    public int getAge(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        int i10 = calendar2.get(1) - calendar.get(1);
        return calendar2.get(6) < calendar.get(6) ? i10 - 1 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (ApUpgradesOrderSummaryFragmentActions) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.getClass().getName() + " must implement " + ApUpgradesOrderSummaryFragmentActions.class.getSimpleName());
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onCreateTicketOrderEvent(CreateTicketOrderEvent createTicketOrderEvent) {
        if (createTicketOrderEvent.isSuccess()) {
            this.passHolderDemographicDataManager.setPassholderItemList(this.apCommerceCheckoutManager.getPassHolderItems(getTicketOrderForm(), this.ticketItems, this.productCategoryDetails.getProductCategoryType()), getTicketOrderForm().getPurchaserSwid(), getWebStoreId(), this.apCommerceCheckoutManager.getTitleToGenderMap(getTicketOrderForm().getFormId()), Optional.m68592of(this.ticketItemEntitlementIdToNameMap));
        }
        super.onCreateTicketOrderEvent(createTicketOrderEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    @Subscribe
    public void onFetchFPTicketAndOrderForm(FetchFPTicketEvent fetchFPTicketEvent) {
        super.onFetchFPTicketAndOrderForm(fetchFPTicketEvent);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    @Subscribe
    public void onFetchUserIdentificationProfileAndPayment(ProfileManager.UserIdProfileAndPaymentEvent userIdProfileAndPaymentEvent) {
        if (userIdProfileAndPaymentEvent.isSuccess()) {
            this.passHolderDemographicDataManager.setProfile(userIdProfileAndPaymentEvent.getProfile());
        }
        super.onFetchUserIdentificationProfileAndPayment(userIdProfileAndPaymentEvent);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.base.BaseResidencyValidationFragment
    @Subscribe
    public void onNeedValidateResidenceResponse(APCommerceCheckoutManager.ResidencyVerificationEvent residencyVerificationEvent) {
        super.onNeedValidateResidenceResponse(residencyVerificationEvent);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onPurchaseTicketOrderEvent(PurchaseTicketOrderEvent purchaseTicketOrderEvent) {
        super.onPurchaseTicketOrderEvent(purchaseTicketOrderEvent);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void populateFullPaymentView(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper) throws IllegalArgumentException {
        Pricing pricing = this.apCommerceCheckoutManager.getPricing(Long.valueOf(getTicketOrderForm().getFormId()));
        if (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId())) {
            populateFullWDW(priceInfoHelper, pricing);
        } else {
            populateFullDLR(priceInfoHelper, pricing);
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void populateMonthlyPaymentView(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper) throws IllegalArgumentException {
        Pricing pricing = this.apCommerceCheckoutManager.getPricing(Long.valueOf(getTicketOrderForm().getFormId()));
        if (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId())) {
            populateMonthlyWDW(priceInfoHelper, pricing);
        } else {
            populateMonthlyDLR(priceInfoHelper, pricing);
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void renderPassHolderItems() {
        ApUpgradesOrderSummaryFragment apUpgradesOrderSummaryFragment;
        this.passholderDetailsViewGroup.removeAllViews();
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> passholderItemList = this.passHolderDemographicDataManager.getPassholderItemList();
        for (int i10 = 0; i10 < passholderItemList.size(); i10++) {
            SerializablePair<UserDataContainer, Optional<String>> serializablePair = passholderItemList.get(i10);
            PassHolderViewItem passHolderViewItem = new PassHolderViewItem(getContext());
            String string = getString(C8689R.string.ap_commerce_passholder_name, ApUtils.buildStringName(serializablePair.first.getPersonName()), C22459j.m68660a(getTicketOrderForm().getPurchaserSwid(), serializablePair.first.getSwid()) ? getString(C8689R.string.ap_commerce_suffix_me) : "");
            String strMo68585or = serializablePair.second.mo68585or((Optional<String>) getString(C8689R.string.empty_string));
            passHolderViewItem.setPassholderName(string);
            passHolderViewItem.setAnnualPassName(strMo68585or);
            passHolderViewItem.setGuestInformationContentDescription(string, strMo68585or);
            String string2 = getString(C8689R.string.ap_commerce_passholder_norgie_title);
            Address address = serializablePair.first.getAddresses().get(0);
            Phone phone = serializablePair.first.getPhones().get(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C22466q.m68725e(ApUtils.buildStringBirthDate(serializablePair.first.getBirthDate())));
            sb2.append(getString(address != null ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
            sb2.append(C22466q.m68725e(ApUtils.buildStringAddress(address)));
            if (serializablePair.first.getBirthDate().isPresent() && getAge(serializablePair.first.getBirthDate().get()) >= 18) {
                sb2.append(getString(phone != null ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
                sb2.append(C22466q.m68725e(ApUtils.buildStringPhone(phone, getContext())));
                sb2.append(getString(!C22466q.m68722b(serializablePair.first.getEmail()) ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
                sb2.append(C22466q.m68725e(serializablePair.first.getEmail()));
            }
            C20511d c20511d = new C20511d(getContext());
            c20511d.m62027f(C22466q.m68725e(ApUtils.buildStringBirthDate(serializablePair.first.getBirthDate())));
            c20511d.m62031j(C22466q.m68725e(C22466q.m68725e(ApUtils.buildStringAddressContentDescription(address, getString(C8689R.string.ticket_sales_non_breaking_space)))));
            c20511d.m62031j(C22466q.m68725e(ApUtils.buildStringPhone(phone, getContext())));
            c20511d.m62031j(C22466q.m68725e(serializablePair.first.getEmail()));
            String string3 = WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId()) ? getString(C8689R.string.ap_commerce_passholder_details2_wdw) : getString(C8689R.string.ap_commerce_passholder_details2, this.ticketSalesUIComponent.getHostContext().getAPRenewalsHelpDeskPhoneNumber());
            passHolderViewItem.setPassholderDetails(string2, sb2, string3);
            passHolderViewItem.setPassholderDetailsContentDescription(string2, c20511d.toString(), string3);
            passHolderViewItem.setAvatar(serializablePair.first.getAvatar().getImageAvatar(), C8689R.drawable.default_avatar);
            passHolderViewItem.setPassholderNameAppearance(C8689R.style.TWDCFont_Heavy_B1_D);
            passHolderViewItem.setAnnualPassNameAppearance(C8689R.style.TWDCFont_Light_B2_D);
            passHolderViewItem.getPassholderDetails().setOnClickListener(this.detailsClickListener);
            passHolderViewItem.getAddGuestInfoButton().setTag(serializablePair.first);
            passHolderViewItem.getAddGuestInfoButton().setOnClickListener(this.showAddDemographicInfoScreen);
            if (serializablePair.first.getUserDataFromContainer().isUserDemographicDataAvailable()) {
                passHolderViewItem.getPassholderDetails().attachCustomView(getEditGuestInfoTextView(serializablePair.first));
                passHolderViewItem.showPassHolderDetailsView();
            } else {
                passHolderViewItem.showAddPassHolderView();
                passHolderViewItem.getAddGuestInfoButton().setText(C8689R.string.ap_commerce_add_passholder_info_button);
                passHolderViewItem.getAddGuestInfoButton().setContentDescription(getString(C8689R.string.ap_commerce_add_passholder_info_button));
            }
            this.passholderDetailsViewGroup.addView(passHolderViewItem);
            getTicketOrderForm().assignTicket(i10, serializablePair.first);
        }
        if (this.passHolderDemographicDataManager.hasDuplicateDemographicBasicInfo()) {
            apUpgradesOrderSummaryFragment = this;
            apUpgradesOrderSummaryFragment.displayErrors(getResources().getString(C8689R.string.error_dialog_title), getResources().getString(C8689R.string.ap_commerce_assign_multi_pass_to_same_user_message), BaseOrderSummaryFragment.FragmentStateOnError.KEEP_OPEN, false, false, getString(C8689R.string.common_ok), null);
        } else {
            apUpgradesOrderSummaryFragment = this;
        }
        apUpgradesOrderSummaryFragment.setUiStateDelegate();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected boolean setUiStateDelegate() {
        return this.passHolderDemographicDataManager.hasDemographicDataForAllGuests();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void trackNorgieAnalyticsAction() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        this.analyticsHelper.mo37405b("ViewPassholderDetails", mapMo37420q);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void verifyProductType() {
        C22462m.m68673e(this.selectedTicketProducts.getProductCategoryType() == ProductCategoryType.ANNUAL_PASS_UPGRADE, "ApUpgradesOrderSummaryFragmentActions can only be launched with ProductCategoryType: ANNUAL_PASS_UPGRADE ");
    }
}