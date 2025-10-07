package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class ValidationObj implements Serializable {
    private static final long serialVersionUID = 1;
    private ValidationSet validations;

    public ValidationObj(ValidationSet validationSet) {
        this.validations = validationSet;
    }

    public ValidationSet getValidations() {
        return this.validations;
    }
}