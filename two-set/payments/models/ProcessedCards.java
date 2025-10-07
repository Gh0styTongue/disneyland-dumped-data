package com.disney.wdpro.payments.models;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes15.dex */
public class ProcessedCards implements Serializable {
    private static final long serialVersionUID = -3020912484453988141L;
    private Map<String, BaseCardDetails> approved;
    private Map<String, BaseCardDetails> declined;
    private Map<String, ?> errors;
    private Map<String, BaseCardDetails> failed;
    private final String paidAmount;
    private final String remainingAmount;
    private String suggestedErrorKey;
    private String walletVersionId;

    public ProcessedCards(String str, String str2, Map<String, BaseCardDetails> map, Map<String, BaseCardDetails> map2, Map<String, ?> map3, String str3) {
        this.paidAmount = str;
        this.remainingAmount = str2;
        this.approved = map;
        this.declined = map2;
        this.errors = map3;
        this.walletVersionId = str3;
    }

    public Map<String, BaseCardDetails> getApproved() {
        return this.approved;
    }

    public Map<String, BaseCardDetails> getDeclined() {
        return this.declined;
    }

    public Map<String, ?> getErrors() {
        return this.errors;
    }

    public Map<String, BaseCardDetails> getFailed() {
        return this.failed;
    }

    public String getPaidAmount() {
        return this.paidAmount;
    }

    public String getRemainingAmount() {
        return this.remainingAmount;
    }

    public String getSuggestedErrorKey() {
        return this.suggestedErrorKey;
    }

    public String getWalletVersionId() {
        return this.walletVersionId;
    }

    public void setApproved(Map<String, BaseCardDetails> map) {
        this.approved = map;
    }

    public void setDeclined(Map<String, BaseCardDetails> map) {
        this.declined = map;
    }

    public void setErrors(Map<String, ?> map) {
        this.errors = map;
    }

    public void setFailed(Map<String, BaseCardDetails> map) {
        this.failed = map;
    }

    public void setSuggestedErrorKey(String str) {
        this.suggestedErrorKey = str;
    }
}