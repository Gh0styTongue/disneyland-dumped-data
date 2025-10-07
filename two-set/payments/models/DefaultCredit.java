package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.IssuerNameEnum;

/* loaded from: classes15.dex */
public class DefaultCredit {
    public boolean isDisneyVisa;
    public IssuerNameEnum issuer;
    public boolean verify;

    public DefaultCredit(IssuerNameEnum issuerNameEnum, boolean z10, boolean z11) {
        this.issuer = issuerNameEnum;
        this.isDisneyVisa = z10;
        this.verify = z11;
    }

    public IssuerNameEnum getIssuer() {
        return this.issuer;
    }

    public boolean isDisneyVisa() {
        return this.isDisneyVisa;
    }

    public boolean isVerify() {
        return this.verify;
    }

    public void setDisneyVisa(boolean z10) {
        this.isDisneyVisa = z10;
    }

    public void setIssuer(IssuerNameEnum issuerNameEnum) {
        this.issuer = issuerNameEnum;
    }

    public void setVerify(boolean z10) {
        this.verify = z10;
    }
}