package com.disney.wdpro.ticket_sales_base_lib.business.checkout;

import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.TicketItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes18.dex */
public interface TicketOrderFormBuilder {
    TicketOrderFormBuilder addTickets(List<TicketItem> list);

    TicketOrderForm build();

    TicketOrderFormBuilder setDestinationId(DestinationId destinationId);

    TicketOrderFormBuilder setPaymentPlan(boolean z10);

    TicketOrderFormBuilder setPurchaserSwid(String str);

    TicketOrderFormBuilder setSellableOnDate(Calendar calendar);

    TicketOrderFormBuilder setSessionId(String str);

    TicketOrderFormBuilder setTicketDisplayName(@Nullable DisplayNames displayNames);
}