package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder;

import com.google.common.base.Optional;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes18.dex */
public interface OrderItemComponent extends Serializable {
    public static final long serialVersionUID = 1;

    Optional<String> getCalendarId();

    String getItemName();

    Set<String> getProductInstanceIds();

    int getQuantity();
}