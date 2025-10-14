package com.disney.wdpro.ap_commerce_checkout.fragments;

import androidx.fragment.app.Fragment;
import com.disney.wdpro.ap_commerce_checkout.ApUtils;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment;
import com.disney.wdpro.ap_commerce_checkout.p066ui.StringLegalCopyConfig;
import com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment;
import com.disney.wdpro.base_sales_ui_lib.manager.ProfileManager;
import com.disney.wdpro.base_sales_ui_lib.utils.TicketSalesAnalyticsUtil;
import com.disney.wdpro.base_sales_ui_lib.views.PassHolderViewItem;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.ticket_sales_base_lib.FetchFPTicketEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes23.dex */
public final class APRenewalOrderSummaryFragment extends APBaseOrderSummaryFragment {

    public interface APRenewalOrderSummaryActions extends BaseOrderSummaryFragment.BaseOrderSummaryActions {
        void showLegalCopyScreen(StringLegalCopyConfig stringLegalCopyConfig);

        void showMonthlyPaymentAgreement(Fragment fragment, TicketOrderForm ticketOrderForm);

        void showOrderConfirmationScreen(SelectedTicketProducts selectedTicketProducts, Long l10, ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayList);
    }

    private String constructPhoneNumber(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C22466q.m68725e(str));
        if (!C22466q.m68722b(str)) {
            sb2.append(" ");
        }
        sb2.append(C22466q.m68725e(str2));
        return sb2.toString();
    }

    public static APRenewalOrderSummaryFragment newInstance(ArrayList<TicketItem> arrayList, SelectedTicketProducts selectedTicketProducts, HashMap<SupportedPaymentType, Class<?>> map, boolean z10, String str) {
        APRenewalOrderSummaryFragment aPRenewalOrderSummaryFragment = new APRenewalOrderSummaryFragment();
        aPRenewalOrderSummaryFragment.setArguments(APBaseOrderSummaryFragment.ApBaseOrderSummaryArgumentBuilder.createNewInstance().withPaymentPlan(z10).withAnalyticsProductString(str).withTicketItems(arrayList).withSelectedTicket(selectedTicketProducts).withViewLocation(Integer.MIN_VALUE).withSellableOnDate(selectedTicketProducts.getSellableOnDate().orNull()).withSupportedPaymentTypes(map).build());
        return aPRenewalOrderSummaryFragment;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.BaseOrderSummaryFragment
    protected void assignTicketToPurchaser(SelectedTicketProducts selectedTicketProducts) {
        TicketOrderForm ticketOrderForm = getTicketOrderForm();
        C22462m.m68691w(ticketOrderForm.getTicketCount() > 0, "No tickets found in ticket order.");
        if (selectedTicketProducts.getNumberOfAdultTickets() <= 0 || ticketOrderForm.getUserDataContainerForTicketIndex(0) != null) {
            return;
        }
        ticketOrderForm.assignTicket(0, ticketOrderForm.getPurchaser().get());
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
        super.onFetchUserIdentificationProfileAndPayment(userIdProfileAndPaymentEvent);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.fragments.BaseOrderSummaryManagersFragment
    @Subscribe
    public void onPurchaseTicketOrderEvent(PurchaseTicketOrderEvent purchaseTicketOrderEvent) {
        super.onPurchaseTicketOrderEvent(purchaseTicketOrderEvent);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void populateFullPaymentView(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper) throws IllegalArgumentException {
        Pricing pricing = this.apCommerceCheckoutManager.getPricing(Long.valueOf(getTicketOrderForm().getFormId()));
        priceInfoHelper.addPriceItemIfExist(WebStoreId.isWDW(getWebStoreId()) ? C8689R.string.ap_commerce_wdw_price_label : C8689R.string.ap_commerce_dlr_price_label, pricing.getSubtotal().get());
        if (pricing.getTax().isPresent() && pricing.getTax().get().getValue().compareTo(BigDecimal.ZERO) != 0) {
            priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_tax_label, pricing.getTax().get());
        }
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_total_payment_due, pricing.getTotal());
        priceInfoHelper.addPriceSummaryFooter(false, pricing.getTotal());
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void populateMonthlyPaymentView(APBaseOrderSummaryFragment.PriceInfoHelper priceInfoHelper) throws IllegalArgumentException {
        Pricing pricing = this.apCommerceCheckoutManager.getPricing(Long.valueOf(getTicketOrderForm().getFormId()));
        priceInfoHelper.addPriceItemIfExist(WebStoreId.isWDW(getWebStoreId()) ? C8689R.string.ap_commerce_wdw_price_label : C8689R.string.ap_commerce_dlr_price_label, pricing.getSubtotal().get());
        if (pricing.getTax().isPresent() && pricing.getTax().get().getValue().compareTo(BigDecimal.ZERO) != 0) {
            priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_tax_label, pricing.getTax().get());
            priceInfoHelper.addPriceItemIfExist(C8689R.string.ap_commerce_total_order_price_label, pricing.getTotal());
        }
        Optional<TotalDepositDue> totalDepositDueAmount = this.apCommerceCheckoutManager.getTotalDepositDueAmount(Long.valueOf(getTicketOrderForm().getFormId()));
        Optional<MonthlyPaymentAmount> monthlyPaymentAmount = this.apCommerceCheckoutManager.getMonthlyPaymentAmount(Long.valueOf(getTicketOrderForm().getFormId()));
        if (!totalDepositDueAmount.isPresent() || !monthlyPaymentAmount.isPresent()) {
            throw new IllegalStateException(" We are in payment plan but the required data is not present.");
        }
        priceInfoHelper.addTotalPriceItemIfExist(C8689R.string.ap_commerce_due_now_label, totalDepositDueAmount.get().getTotal());
        priceInfoHelper.addTotalPriceItemIfExist(WebStoreId.isWDW(getWebStoreId()) ? C8689R.string.ap_commerce_wdw_due_monthly : C8689R.string.ap_commerce_dlr_due_monthly, monthlyPaymentAmount.get().getPrice());
        priceInfoHelper.addPriceSummaryFooter(true, monthlyPaymentAmount.get().getPrice());
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void renderPassHolderItems() {
        this.passholderDetailsViewGroup.removeAllViews();
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> passholderItemList = this.passHolderDemographicDataManager.getPassholderItemList();
        for (int i10 = 0; i10 < passholderItemList.size(); i10++) {
            SerializablePair<UserDataContainer, Optional<String>> serializablePair = passholderItemList.get(i10);
            PassHolderViewItem passHolderViewItem = new PassHolderViewItem(getContext());
            passHolderViewItem.showPassHolderDetailsView();
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
            sb2.append(getString(phone != null ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
            sb2.append(constructPhoneNumber(getCountryDialCode(), ApUtils.buildStringPhone(phone, getContext())));
            sb2.append(getString(!C22466q.m68722b(serializablePair.first.getEmail()) ? C8689R.string.two_empty_lines : C8689R.string.empty_string));
            sb2.append(C22466q.m68725e(serializablePair.first.getEmail()));
            C20511d c20511d = new C20511d(getContext());
            c20511d.m62027f(C22466q.m68725e(ApUtils.buildStringBirthDate(serializablePair.first.getBirthDate())));
            c20511d.m62031j(C22466q.m68725e(C22466q.m68725e(ApUtils.buildStringAddressContentDescription(address, getString(C8689R.string.ticket_sales_non_breaking_space)))));
            c20511d.m62031j(C22466q.m68725e(ApUtils.buildStringPhone(phone, getContext())));
            c20511d.m62031j(C22466q.m68725e(serializablePair.first.getEmail()));
            String string3 = getString(C8689R.string.ap_commerce_passholder_details2, constructPhoneNumber(getString(C8689R.string.us_dial_code), this.ticketSalesUIComponent.getHostContext().getAPRenewalsHelpDeskPhoneNumber()));
            passHolderViewItem.setPassholderDetails(string2, sb2, string3);
            passHolderViewItem.setPassholderDetailsContentDescription(string2, c20511d.toString(), string3);
            if (WebStoreId.isWDW(this.selectedTicketProducts.getWebStoreId())) {
                passHolderViewItem.setAvatar(serializablePair.first.getAvatar().getImageAvatar(), C8689R.drawable.default_avatar);
            } else {
                passHolderViewItem.hideAvatar();
            }
            passHolderViewItem.setPassholderNameAppearance(C8689R.style.TWDCFont_Heavy_B1_D);
            passHolderViewItem.setAnnualPassNameAppearance(C8689R.style.TWDCFont_Light_B2_D);
            passHolderViewItem.getPassholderDetails().setOnClickListener(this.detailsClickListener);
            this.passholderDetailsViewGroup.addView(passHolderViewItem);
            getTicketOrderForm().assignTicket(i10, serializablePair.first);
        }
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected boolean setUiStateDelegate() {
        return true;
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void trackNorgieAnalyticsAction() {
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put("link.category", TicketSalesAnalyticsUtil.getAnalyticsLinkCategory(this.selectedTicketProducts));
        this.analyticsHelper.mo37405b("ViewGuestDetails", mapMo37420q);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.APBaseOrderSummaryFragment
    protected void verifyProductType() {
        C22462m.m68673e(this.selectedTicketProducts.getProductCategoryType() == ProductCategoryType.ANNUAL_PASS_RENEWALS, APRenewalOrderSummaryFragment.class.getSimpleName() + " can only be launched with ProductCategoryType: ANNUAL_PASS_RENEWALS.");
    }
}