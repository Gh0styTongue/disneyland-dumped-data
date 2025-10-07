package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.ticket_sales_base_lib.ResponseEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.DataStatus;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;

/* loaded from: classes19.dex */
public class PurchaseTicketOrderEvent extends ResponseEvent<DataStatus> {
    private long ticketOrderFormId;

    public PurchaseTicketOrderEvent(TicketOrderForm ticketOrderForm, DataStatus dataStatus) {
        this.ticketOrderFormId = ticketOrderForm == null ? -1L : ticketOrderForm.getFormId();
        super.setResult((PurchaseTicketOrderEvent) dataStatus);
    }

    public long getTicketOrderFormId() {
        return this.ticketOrderFormId;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.ResponseEvent
    public boolean isSuccess() {
        return getPayload() == DataStatus.SUCCESS;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.ResponseEvent
    public void setResult(boolean z10) {
        throw new UnsupportedOperationException("Use setResult(DataStatus)");
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.ResponseEvent
    public void setResult(C13352x<DataStatus> c13352x) {
        throw new UnsupportedOperationException("Use setResult(DataStatus)");
    }
}