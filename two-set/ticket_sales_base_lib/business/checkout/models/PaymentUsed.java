package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.io.Serializable;

/* loaded from: classes18.dex */
public class PaymentUsed implements Serializable {
    private static final long serialVersionUID = 1;

    @SuppressWarnings({"UWF_UNWRITTEN_FIELD"})
    private String cardSubType;

    @SuppressWarnings({"UWF_UNWRITTEN_FIELD"})
    private String cardType;

    @SuppressWarnings({"UWF_UNWRITTEN_FIELD"})
    private String maskedCardNumber;

    public String getCardSubType() {
        return this.cardSubType;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getMaskedCardNumber() {
        return this.maskedCardNumber;
    }
}