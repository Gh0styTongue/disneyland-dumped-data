package com.disney.wdpro.ap_commerce_checkout;

import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.ticket_sales_base_lib.ResponseEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount;
import com.disney.wdpro.ticket_sales_base_lib.utils.SerializablePair;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ContractResponse;
import com.disney.wdpro.ticket_sales_managers.GeneralTicketSalesCheckoutManager;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes23.dex */
public interface APCommerceCheckoutManager extends GeneralTicketSalesCheckoutManager {

    public static class ContractEvent extends ResponseEvent<ContractResponse> {
    }

    public static class ResidencyVerificationEvent extends ResponseEvent<Boolean> {
    }

    @UIEvent
    ContractEvent fetchContract(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails);

    String getFlexPassTermsAndCondition(long j10);

    Optional<MonthlyPaymentAmount> getMonthlyPaymentAmount(Long l10) throws IllegalArgumentException;

    String[] getNameTitles(long j10);

    ArrayList<SerializablePair<UserDataContainer, Optional<String>>> getPassHolderItems(TicketOrderForm ticketOrderForm, List<TicketItem> list, ProductCategoryType productCategoryType) throws UnsupportedOperationException;

    Pricing getPricing(Long l10) throws IllegalArgumentException;

    TicketOrder getTicketOrder(long j10, ProductCategoryType productCategoryType);

    String getTitleGender(long j10, String str);

    Map<String, String> getTitleToGenderMap(long j10);

    Optional<TotalDepositDue> getTotalDepositDueAmount(Long l10) throws IllegalArgumentException;

    @UIEvent
    ResidencyVerificationEvent needsFLValidation(String str, ProfileManager profileManager, ArrayList<TicketItem> arrayList);

    boolean userNeedsToValidateResidency();
}