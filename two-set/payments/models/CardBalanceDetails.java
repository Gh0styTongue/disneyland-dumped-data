package com.disney.wdpro.payments.models;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes15.dex */
public class CardBalanceDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private Map<String, StoredCardBalance> balances;
    private String currency;

    public CardBalanceDetails(String str, Map<String, StoredCardBalance> map) {
        setCurrency(str);
        this.balances = map;
    }

    public Map<String, StoredCardBalance> getBalances() {
        return this.balances;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setBalances(Map<String, StoredCardBalance> map) {
        this.balances = map;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }
}