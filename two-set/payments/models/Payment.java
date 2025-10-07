package com.disney.wdpro.payments.models;

/* loaded from: classes15.dex */
public class Payment {
    private String amount;
    private String date;

    public Payment(String str, String str2) {
        setAmount(str);
        setDate(str2);
    }

    public String getAmount() {
        return this.amount;
    }

    public String getDate() {
        return this.date;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setDate(String str) {
        this.date = str;
    }
}