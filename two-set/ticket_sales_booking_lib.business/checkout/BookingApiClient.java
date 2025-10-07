package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryDetails;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ContractResponse;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder.TicketOrderResponse;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.Calendar;

/* loaded from: classes18.dex */
public interface BookingApiClient {
    @UIEvent
    CancelOrderEvent cancelOrder(String str, Calendar calendar, BookingApiSession bookingApiSession) throws IOException;

    TicketOrderResponse createOrderWithProducts(TicketOrderForm ticketOrderForm, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException;

    TicketOrderResponse expressCheckout(TicketOrderForm ticketOrderForm, BookingApiSession bookingApiSession, String str, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException;

    ContractResponse fetchContract(TicketOrderForm ticketOrderForm, BookingApiSession bookingApiSession, String str, String str2, ProductCategoryDetails productCategoryDetails) throws JsonParseException, IOException;

    TicketOrderResponse fetchOrder(String str, String str2, boolean z10, Calendar calendar, ProductCategoryType productCategoryType) throws IOException;
}