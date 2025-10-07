package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class ValidationRules implements Serializable {
    private static final long serialVersionUID = 1;
    private ValidationObj address;
    private ValidationObj billingInfo;

    public ValidationRules(ValidationObj validationObj, ValidationObj validationObj2) {
        this.billingInfo = validationObj;
        this.address = validationObj2;
    }

    public ValidationObj getAddress() {
        return this.address;
    }

    public ValidationObj getBillingInfo() {
        return this.billingInfo;
    }
}