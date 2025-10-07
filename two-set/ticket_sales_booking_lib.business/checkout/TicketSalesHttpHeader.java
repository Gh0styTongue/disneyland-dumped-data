package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.bookingservices.api.BookingApiClientImpl;
import com.disney.wdpro.commons.C9314j;
import javax.annotation.Nonnull;
import javax.inject.Inject;

/* loaded from: classes18.dex */
public class TicketSalesHttpHeader {

    @Nonnull
    private final String httpHeader;

    @Inject
    public TicketSalesHttpHeader(C9314j c9314j) {
        StringBuilder sb2 = new StringBuilder(c9314j.m38908h() + "/" + c9314j.m38906f());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" ");
        sb3.append(System.getProperty(BookingApiClientImpl.HTTP_AGENT));
        sb2.append(sb3.toString());
        this.httpHeader = sb2.toString();
    }

    @Nonnull
    public String getHttpHeader() {
        return this.httpHeader;
    }
}