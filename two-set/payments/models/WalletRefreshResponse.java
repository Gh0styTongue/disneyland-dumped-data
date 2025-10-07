package com.disney.wdpro.payments.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class WalletRefreshResponse implements Serializable {

    @SerializedName("tokensOnFile")
    private List<CardToken> cardsOnFile;
    private Map<String, Boolean> errors;
    private Map<String, Integer> walletCardCount;

    public WalletRefreshResponse(List<CardToken> list, Map<String, Integer> map) {
        this.cardsOnFile = list;
        this.walletCardCount = map;
    }

    public List<CardToken> getCardsOnFile() {
        return this.cardsOnFile;
    }

    public Map<String, Boolean> getErrors() {
        return this.errors;
    }

    public Map<String, Integer> getWalletCardCount() {
        return this.walletCardCount;
    }

    public void setCardsOnFile(List<CardToken> list) {
        this.cardsOnFile = list;
    }

    public void setErrors(Map<String, Boolean> map) {
        this.errors = map;
    }

    public void setWalletCardCount(Map<String, Integer> map) {
        this.walletCardCount = map;
    }
}