package com.disney.wdpro.ap_commerce_checkout.fragments.ap_sales;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.APCommerceCheckoutManager;
import com.disney.wdpro.ap_commerce_checkout.ApUtils;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.ApUpgradesOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.fragments.base.BaseResidencyValidationFragment;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.manager.ProfileManager;
import com.disney.wdpro.base_sales_ui_lib.views.PassHolderViewItem;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.ticket_sales_base_lib.FetchFPTicketEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount;
import com.disney.wdpro.ticket_sales_base_lib.utils.SerializablePair;
import com.disney.wdpro.ticket_sales_managers.CreateTicketOrderEvent;
import com.disney.wdpro.ticket_sales_managers.PurchaseTicketOrderEvent;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes23.dex */
public final class ApSalesOrderSummaryFragment extends BaseResidencyValidationFragment {
    private ApUpgradesOrderSummaryFragment.ApUpgradesOrderSummaryFragmentActions actionListener;
    private final View.OnClickListener showAddDemographicInfoScreen = new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_sales.ApSalesOrderSummaryFragment.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UserDataContainer userDataContainer = (UserDataContainer) view.getTag();
            ApSalesOrderSummaryFragment.this.actionListener.showDemographicInfoScreen(userDataContainer.getassignedEntitlementId(), ApSalesOrderSummaryFragment.this.getTicketOrderForm().getFormId(), ApSalesOrderSummaryFragment.this.getWebStoreId(), userDataContainer);
        }
    };

    private void addSubtotalIfNeeded(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper, Pricing pricing) {
        if (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId())) {
            priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_wdw_price_label, pricing.getSubtotal().orNull());
            priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_tax_label, pricing.getTax().orNull());
        }
    }

    private View getEditGuestInfoTextView(UserDataContainer userDataContainer) {
        View viewInflate = View.inflate(getContext(), C8689R.layout.ap_commerce_edit_passholder_details, null);
        TextView textView = (TextView) viewInflate.findViewById(C8689R.id.editPassholderDetailTextView);
        textView.setTag(userDataContainer);
        textView.setOnClickListener(this.showAddDemographicInfoScreen);
        return viewInflate;
    }

    public static ApSalesOrderSummaryFragment newInstance(ArrayList<TicketItem> arrayList, SelectedTicketProducts selectedTicketProducts, HashMap<SupportedPaymentType, Class<?>> map, boolean z10, String str) {
        ApSalesOrderSummaryFragment apSalesOrderSummaryFragment = new ApSalesOrderSummaryFragment();
        apSalesOrderSummaryFragment.setArguments(APBaseOrderSummaryFragment.ApBaseOrderSummaryArgumentBuilder.createNewInstance().withPaymentPlan(z10).withAnalyticsProductString(str).withTicketItems(arrayList).withSelectedTicket(selectedTicketProducts).withViewLocation(Integer.MIN_VALUE).withSellableOnDate(selectedTicketProducts.getSellableOnDate().orNull()).withSupportedPaymentTypes(map).build());
        return apSalesOrderSummaryFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void assignTicketToPurchaser(SelectedTicketProducts selectedTicketProducts) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment, com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.actionListener = (ApUpgradesOrderSummaryFragment.ApUpgradesOrderSummaryFragmentActions) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.getClass().getName() + " must implement " + ApUpgradesOrderSummaryFragment.ApUpgradesOrderSummaryFragmentActions.class.getSimpleName());
        }
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onCreateTicketOrderEvent(CreateTicketOrderEvent createTicketOrderEvent) {
        if (createTicketOrderEvent.isSuccess()) {
            this.passHolderDemographicDataManager.setPassholderItemList(this.apCommerceCheckoutManager.getPassHolderItems(getTicketOrderForm(), this.ticketItems, this.productCategoryDetails.getProductCategoryType()), getTicketOrderForm().getPurchaserSwid(), getWebStoreId(), this.apCommerceCheckoutManager.getTitleToGenderMap(getTicketOrderForm().getFormId()), Optional.absent());
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
        addSubtotalIfNeeded(priceInfoHelper, pricing);
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_total_payment_due, pricing.getTotal());
        priceInfoHelper.addPriceSummaryFooter(false, pricing.getTotal());
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void populateMonthlyPaymentView(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper) throws IllegalArgumentException {
        long formId = getTicketOrderForm().getFormId();
        Pricing pricing = this.apCommerceCheckoutManager.getPricing(Long.valueOf(formId));
        addSubtotalIfNeeded(priceInfoHelper, pricing);
        priceInfoHelper.addPriceItemIfExist(WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId()) ? C8689R.string.ap_commerce_total_order_price_label : C8689R.string.ap_commerce_dlr_price_label, pricing.getTotal());
        Optional<TotalDepositDue> totalDepositDueAmount = this.apCommerceCheckoutManager.getTotalDepositDueAmount(Long.valueOf(formId));
        if (totalDepositDueAmount.isPresent()) {
            priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_now_label, totalDepositDueAmount.get().getTotal());
        }
        Optional<MonthlyPaymentAmount> monthlyPaymentAmount = this.apCommerceCheckoutManager.getMonthlyPaymentAmount(Long.valueOf(formId));
        if (monthlyPaymentAmount.isPresent()) {
            priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_monthly, monthlyPaymentAmount.get().getPrice());
            priceInfoHelper.addPriceSummaryFooter(true, monthlyPaymentAmount.get().getPrice());
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void renderPassHolderItems() {
        ApSalesOrderSummaryFragment apSalesOrderSummaryFragment;
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
            Address address = !serializablePair.first.getAddresses().isEmpty() ? serializablePair.first.getAddresses().get(0) : null;
            Phone phone = serializablePair.first.getPhones().isEmpty() ? null : serializablePair.first.getPhones().get(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C22466q.m68725e(ApUtils.buildStringBirthDate(serializablePair.first.getBirthDate())));
            sb2.append(getString(address != null ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
            sb2.append(C22466q.m68725e(ApUtils.buildStringAddress(address)));
            sb2.append(getString(phone != null ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
            sb2.append(C22466q.m68725e(ApUtils.buildStringPhone(phone, getContext())));
            sb2.append(getString(!C22466q.m68722b(serializablePair.first.getEmail()) ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
            sb2.append(C22466q.m68725e(serializablePair.first.getEmail()));
            C20511d c20511d = new C20511d(getContext());
            c20511d.m62027f(C22466q.m68725e(ApUtils.buildStringBirthDate(serializablePair.first.getBirthDate())));
            c20511d.m62031j(C22466q.m68725e(C22466q.m68725e(ApUtils.buildStringAddressContentDescription(address, getString(C8689R.string.ticket_sales_non_breaking_space)))));
            c20511d.m62031j(C22466q.m68725e(ApUtils.buildStringPhone(phone, getContext())));
            c20511d.m62031j(C22466q.m68725e(serializablePair.first.getEmail()));
            passHolderViewItem.setPassholderDetails(string2, sb2, getString(C8689R.string.empty_string));
            passHolderViewItem.setPassholderDetailsContentDescription(string2, c20511d.toString(), getString(C8689R.string.empty_string));
            if (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId())) {
                passHolderViewItem.setAvatar(serializablePair.first.getAvatar().getImageAvatar(), C8689R.drawable.default_avatar);
            }
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
            }
            this.passholderDetailsViewGroup.addView(passHolderViewItem);
            getTicketOrderForm().assignTicketWithTicketItemLocalId(i10, serializablePair.first);
        }
        if (this.passHolderDemographicDataManager.hasDuplicateDemographicBasicInfo()) {
            apSalesOrderSummaryFragment = this;
            apSalesOrderSummaryFragment.displayErrors(getResources().getString(C8689R.string.error_dialog_title), getResources().getString(C8689R.string.ap_commerce_assign_multi_pass_to_same_user_message), BaseOrderSummaryFragment.FragmentStateOnError.KEEP_OPEN, false, false, getString(C8689R.string.common_ok), null);
        } else {
            apSalesOrderSummaryFragment = this;
        }
        apSalesOrderSummaryFragment.passholderErrorMessage.setVisibility(apSalesOrderSummaryFragment.passHolderDemographicDataManager.hasDemographicDataForAllGuests() ? 8 : 0);
        apSalesOrderSummaryFragment.setUiStateDelegate();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected boolean setUiStateDelegate() {
        return this.passHolderDemographicDataManager.hasDemographicDataForAllGuests();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void trackNorgieAnalyticsAction() {
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void verifyProductType() {
        C22462m.m68673e(this.selectedTicketProducts.getProductCategoryType() == ProductCategoryType.ANNUAL_PASS_SALES, "ApSalesOrderSummaryFragment can only be launched with ProductCategoryType: ANNUAL_PASS_SALES.");
    }
}