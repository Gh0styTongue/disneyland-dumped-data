package com.disney.wdpro.payments.models;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class StoredCardBalance implements Serializable {
    private static final long serialVersionUID = 1;
    protected Double amount;
    protected boolean error;
    protected String reason;

    protected StoredCardBalance() {
        this.error = false;
    }

    public Double getAmount() {
        return this.amount;
    }

    public String getReason() {
        return this.reason;
    }

    public Boolean hasError() {
        return Boolean.valueOf(this.error);
    }

    public boolean isSaveToProfile() {
        return this.error;
    }

    public void setAmount(Double d10) {
        this.amount = d10;
    }

    public void setError(boolean z10) {
        this.error = z10;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public StoredCardBalance(Double d10, boolean z10) {
        this.amount = d10;
        this.error = z10;
    }

    public StoredCardBalance(Double d10, boolean z10, String str) {
        this.amount = d10;
        this.error = z10;
        this.reason = str;
    }
}