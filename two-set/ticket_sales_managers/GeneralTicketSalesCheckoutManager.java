package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.base_sales_ui_lib.checkout.manager.TicketSalesCheckoutManager;
import com.disney.wdpro.base_sales_ui_lib.maxpass.model.TicketUpgradeEntitlement;
import com.disney.wdpro.midichlorian.CacheContextModifier;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.ticket_sales_base_lib.FetchFPTicketEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedPaymentType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.PurchaseConfirmation;
import com.google.common.base.Optional;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes19.dex */
public interface GeneralTicketSalesCheckoutManager extends TicketSalesCheckoutManager, CacheContextModifier<GeneralTicketSalesCheckoutManager> {
    boolean cancelOldOrders(String str, Calendar calendar);

    @UIEvent
    CreateTicketOrderEvent createTicketOrder(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails);

    @UIEvent
    FetchFPTicketEvent fetchFPTicketsAndCreateUpgradeTicketOrder(TicketOrderForm ticketOrderForm, String str, DestinationId destinationId, WebStoreId webStoreId, AffiliationType affiliationType, String str2, ProductCategoryDetails productCategoryDetails, List<TicketUpgradeEntitlement> list, Calendar calendar);

    Optional<String> getCalendarIds(Long l10);

    BookingStatus getCurrentBookingStatus(TicketOrderForm ticketOrderForm) throws IllegalArgumentException;

    PurchaseConfirmation getPurchaseConfirmation(Long l10);

    @UIEvent
    PurchaseTicketOrderEvent purchaseTicketOrder(TicketOrderForm ticketOrderForm, HashMap<SupportedPaymentType, Class<?>> map, ProductCategoryDetails productCategoryDetails);

    void removeSessionFromStorage(long j10);
}