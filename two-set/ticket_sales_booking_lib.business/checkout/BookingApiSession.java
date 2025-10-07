package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.DeliveryOption;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.SupportedDeliveryOptions;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.GuestInOrder;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes18.dex */
public class BookingApiSession implements Serializable {
    private static final long serialVersionUID = 1;
    private BookingStatus bookingStatus = BookingStatus.UNKNOWN;
    private TicketOrderResponse createTicketOrderResponse;
    private SupportedDeliveryOptions deliveryOptions;
    private final long formId;
    private final String orderId;
    private TicketOrderResponse purchaseTicketOrderResponse;
    private HashMap<Integer, TicketOrderResponse.OrderItem> ticketItemLocalIdToServerLineItemMap;

    public BookingApiSession(TicketOrderResponse ticketOrderResponse, TicketOrderForm ticketOrderForm) {
        this.createTicketOrderResponse = ticketOrderResponse;
        this.orderId = ticketOrderResponse.getOrderId();
        this.formId = ticketOrderForm.getFormId();
    }

    public String getBookingTermsAndConditionsId() {
        return this.createTicketOrderResponse.getBookingTermsAndConditionsId();
    }

    public Optional<String> getCalendarIds() {
        return this.createTicketOrderResponse.getCalendarIds();
    }

    public TicketOrderResponse getCreateOrderResponse() {
        return this.createTicketOrderResponse;
    }

    public BookingStatus getCurrentBookingStatus() {
        return this.bookingStatus;
    }

    public long getFormId() {
        return this.formId;
    }

    @Nullable
    public Map<String, GuestInOrder> getGuestsInOrder() {
        return this.createTicketOrderResponse.getGuestsInOrder();
    }

    public String[] getNameTitles() {
        return this.createTicketOrderResponse.getNameTitles();
    }

    public String getOrderId() {
        return this.orderId;
    }

    @Nonnull
    public List<TicketOrderResponse.OrderItem> getOrderItems() {
        return this.createTicketOrderResponse.getOrderItems();
    }

    public TicketOrderResponse getPurchaseTicketOrderResponse() {
        return this.purchaseTicketOrderResponse;
    }

    public String getRemoteOrderItemIdForLocalTicketItem(TicketItem ticketItem) {
        return this.ticketItemLocalIdToServerLineItemMap.get(Integer.valueOf(ticketItem.getLocalId())).getOrderItemId();
    }

    public DeliveryOption getSelectedDeliveryOption() {
        return this.purchaseTicketOrderResponse.getSelectedDeliveryOption();
    }

    public String getTitleGender(String str) {
        return this.createTicketOrderResponse.getTitleGender(str);
    }

    public Map<String, String> getTitleToGenderMap() {
        return this.createTicketOrderResponse.getTitleToGenderMap();
    }

    public boolean mapOrderItemsToLocalTickets(TicketOrderForm ticketOrderForm) {
        int ticketCount;
        TicketOrderResponse createOrderResponse = getCreateOrderResponse();
        ImmutableList<TicketOrderResponse.OrderItem> orderItems = createOrderResponse.getOrderItems();
        if (orderItems == null || (ticketCount = ticketOrderForm.getTicketCount()) != createOrderResponse.getTicketsQuantity()) {
            return false;
        }
        this.ticketItemLocalIdToServerLineItemMap = Maps.m69381r();
        for (int i10 = 0; i10 < ticketOrderForm.getTicketCount(); i10++) {
            TicketItem ticket = ticketOrderForm.getTicket(i10);
            int localId = ticket.getLocalId();
            Iterator<TicketOrderResponse.OrderItem> it = orderItems.iterator();
            while (true) {
                if (it.hasNext()) {
                    TicketOrderResponse.OrderItem next = it.next();
                    if (!this.ticketItemLocalIdToServerLineItemMap.containsKey(Integer.valueOf(localId)) && next.getProductInstanceIds().contains(ticket.getProductInstanceId())) {
                        this.ticketItemLocalIdToServerLineItemMap.put(Integer.valueOf(localId), next);
                        break;
                    }
                }
            }
        }
        return this.ticketItemLocalIdToServerLineItemMap.size() == ticketCount;
    }

    public void setCurrentBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setPurchaseTicketOrderResponse(TicketOrderResponse ticketOrderResponse) {
        this.purchaseTicketOrderResponse = ticketOrderResponse;
    }
}