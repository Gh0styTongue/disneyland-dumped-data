package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

/* loaded from: classes18.dex */
public enum SupportedPaymentType {
    CREDIT_CARD(true),
    ALIPAY(false);

    private final boolean validationRequiredBeforeBooking;

    SupportedPaymentType(boolean z10) {
        this.validationRequiredBeforeBooking = z10;
    }

    public boolean isValidationRequiredBeforeBooking() {
        return this.validationRequiredBeforeBooking;
    }
}