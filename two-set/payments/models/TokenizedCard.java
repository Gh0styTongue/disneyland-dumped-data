package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.payments.models.enums.IssuerNameEnum;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class TokenizedCard implements Serializable {
    private static final long serialVersionUID = -6229692727139583336L;
    private String cardProductName;

    @SerializedName("masked")
    private String displayNumber;
    private boolean isDisneyVisa;
    private Boolean isWalletDefault;
    private IssuerNameEnum issuer;
    private String token;
    private CardTypeEnum type;

    public TokenizedCard(String str, String str2, IssuerNameEnum issuerNameEnum, boolean z10, CardTypeEnum cardTypeEnum, String str3, Boolean bool) {
        this.token = str;
        this.displayNumber = str2;
        this.issuer = issuerNameEnum;
        this.isDisneyVisa = z10;
        this.type = cardTypeEnum;
        this.cardProductName = str3;
        this.isWalletDefault = bool;
    }

    public String getCardProductName() {
        return this.cardProductName;
    }

    public String getDisplayCardNumber() {
        return this.displayNumber;
    }

    public String getDisplayNumber() {
        return this.displayNumber;
    }

    public Boolean getIsWalletDefault() {
        return this.isWalletDefault;
    }

    public IssuerNameEnum getIssuer() {
        return this.issuer;
    }

    public String getToken() {
        return this.token;
    }

    public CardTypeEnum getType() {
        return this.type;
    }

    public boolean isDisneyVisa() {
        return this.isDisneyVisa;
    }

    public void setCardProductName(String str) {
        this.cardProductName = str;
    }

    public void setDisneyVisa(boolean z10) {
        this.isDisneyVisa = z10;
    }

    public void setDisplayCardNumber(String str) {
        this.displayNumber = str;
    }

    public void setDisplayNumber(String str) {
        this.displayNumber = str;
    }

    public void setIsWalletDefault(Boolean bool) {
        this.isWalletDefault = bool;
    }

    public void setIssuer(IssuerNameEnum issuerNameEnum) {
        this.issuer = issuerNameEnum;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(CardTypeEnum cardTypeEnum) {
        this.type = cardTypeEnum;
    }
}