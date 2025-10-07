package com.disney.wdpro.payments.models;

import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public class CheckoutPreviewResponse {
    public DefaultCredit defaultCredit;
    public boolean hasDvic;
    public boolean hasUnconsentedWalletCards;
    public boolean oneClickEligible;
    public LinkedHashMap<String, Boolean> supportedTenders;

    public CheckoutPreviewResponse(LinkedHashMap<String, Boolean> linkedHashMap, DefaultCredit defaultCredit, boolean z10, boolean z11) {
        this.supportedTenders = linkedHashMap;
        this.defaultCredit = defaultCredit;
        this.hasDvic = z10;
        this.oneClickEligible = z11;
    }

    public DefaultCredit getDefaultCredit() {
        return this.defaultCredit;
    }

    public LinkedHashMap<String, Boolean> getSupportedTenders() {
        return this.supportedTenders;
    }

    public boolean isHasDvic() {
        return this.hasDvic;
    }

    public boolean isOneClickEligible() {
        return this.oneClickEligible;
    }

    public void setDefaultCredit(DefaultCredit defaultCredit) {
        this.defaultCredit = defaultCredit;
    }

    public void setHasDvic(boolean z10) {
        this.hasDvic = z10;
    }

    public void setOneClickEligible(boolean z10) {
        this.oneClickEligible = z10;
    }

    public void setSupportedTenders(LinkedHashMap<String, Boolean> linkedHashMap) {
        this.supportedTenders = linkedHashMap;
    }
}