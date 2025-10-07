package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.google.common.base.Optional;

/* loaded from: classes18.dex */
public interface TicketEntitlement {
    String getBarcodeId();

    String getGuestName();

    String getParticipantId();

    Optional<DisplayNameMap.DisplayName> getTicketCaption();

    Optional<DisplayNameMap.DisplayName> getTicketName();

    Optional<DisplayNameMap.DisplayName> getTicketSubCaption();
}