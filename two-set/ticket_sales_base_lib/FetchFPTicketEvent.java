package com.disney.wdpro.ticket_sales_base_lib;

import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;

/* loaded from: classes18.dex */
public class FetchFPTicketEvent extends ResponseEvent<SelectedTicketProducts> {
    private final SelectedTicketProducts selectedTicketProducts;
    private final TicketOrderForm ticketOrderForm;

    public FetchFPTicketEvent(SelectedTicketProducts selectedTicketProducts, TicketOrderForm ticketOrderForm) {
        this.selectedTicketProducts = selectedTicketProducts;
        this.ticketOrderForm = ticketOrderForm;
        if (selectedTicketProducts != null) {
            setResult((FetchFPTicketEvent) selectedTicketProducts);
        }
    }

    public SelectedTicketProducts getSelectedTicketProducts() {
        return this.selectedTicketProducts;
    }

    public TicketOrderForm getTicketOrderForm() {
        return this.ticketOrderForm;
    }
}