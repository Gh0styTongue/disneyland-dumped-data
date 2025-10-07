package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.payments.models.enums.IssuerNameEnum;
import com.disney.wdpro.payments.models.enums.WalletEntryIdentifierTypeEnum;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class CardToken implements Serializable {
    private static final long serialVersionUID = 6833983025565485979L;
    private Address billingAddress;
    private String cardArtName;
    private String cardProductName;
    private String cardholderName;
    private Double creditLimit;

    @SerializedName("masked")
    private String displayNumber;
    private String expiration;
    private boolean isDisneyVisa;
    private boolean isWalletDefault;
    private IssuerNameEnum issuer;
    private Double remainingBalance;
    public Boolean removable = Boolean.TRUE;
    private String securityCode;
    private String source;
    private String token;
    private String tokenVault;
    private CardTypeEnum type;
    public WalletEntryIdentifierTypeEnum walletEntryIdType;
    public String walletEntryIdValue;

    public CardToken(String str, CardTypeEnum cardTypeEnum) {
        this.token = str;
        this.type = cardTypeEnum;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public String getCardArtName() {
        return this.cardArtName;
    }

    public String getCardProductName() {
        return this.cardProductName;
    }

    public String getCardholderName() {
        return this.cardholderName;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public String getDisplayNumber() {
        return this.displayNumber;
    }

    public String getExpiration() {
        return this.expiration;
    }

    public IssuerNameEnum getIssuer() {
        return this.issuer;
    }

    public Double getRemainingBalance() {
        return this.remainingBalance;
    }

    public String getSecurityCode() {
        return this.securityCode;
    }

    public String getSource() {
        return this.source;
    }

    public String getToken() {
        return this.token;
    }

    public String getTokenVault() {
        return this.tokenVault;
    }

    public CardTypeEnum getType() {
        return this.type;
    }

    public WalletEntryIdentifierTypeEnum getWalletEntryIdType() {
        return this.walletEntryIdType;
    }

    public String getWalletEntryIdValue() {
        return this.walletEntryIdValue;
    }

    public boolean isDisneyVisa() {
        return this.isDisneyVisa;
    }

    public boolean isWalletDefault() {
        return this.isWalletDefault;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public void setCardArtName(String str) {
        this.cardArtName = str;
    }

    public void setCardProductName(String str) {
        this.cardProductName = str;
    }

    public void setCardholderName(String str) {
        this.cardholderName = str;
    }

    public void setCreditLimit(Double d10) {
        this.creditLimit = d10;
    }

    public void setDisneyVisa(boolean z10) {
        this.isDisneyVisa = z10;
    }

    public void setDisplayNumber(String str) {
        this.displayNumber = str;
    }

    public void setExpiration(String str) {
        this.expiration = str;
    }

    public void setIssuer(IssuerNameEnum issuerNameEnum) {
        this.issuer = issuerNameEnum;
    }

    public void setRemainingBalance(Double d10) {
        this.remainingBalance = d10;
    }

    public void setSecurityCode(String str) {
        this.securityCode = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTokenVault(String str) {
        this.tokenVault = str;
    }

    public void setType(CardTypeEnum cardTypeEnum) {
        this.type = cardTypeEnum;
    }

    public void setWalletEntryIdType(WalletEntryIdentifierTypeEnum walletEntryIdentifierTypeEnum) {
        this.walletEntryIdType = walletEntryIdentifierTypeEnum;
    }

    public void setWalletEntryIdValue(String str) {
        this.walletEntryIdValue = str;
    }

    public CardToken(String str, CardTypeEnum cardTypeEnum, String str2) {
        this.token = str;
        this.type = cardTypeEnum;
        this.securityCode = str2;
    }

    public CardToken(String str, IssuerNameEnum issuerNameEnum, String str2, CardTypeEnum cardTypeEnum, String str3, boolean z10, String str4) {
        this.token = str;
        this.issuer = issuerNameEnum;
        this.displayNumber = str2;
        this.type = cardTypeEnum;
        this.isDisneyVisa = z10;
        this.cardholderName = str3;
        this.cardProductName = str4;
    }

    public CardToken(String str, IssuerNameEnum issuerNameEnum, String str2, CardTypeEnum cardTypeEnum, String str3, String str4, boolean z10, String str5, Address address) {
        this.token = str;
        this.issuer = issuerNameEnum;
        this.displayNumber = str2;
        this.type = cardTypeEnum;
        this.isDisneyVisa = z10;
        this.cardProductName = str5;
        setCardholderName(str4);
        setBillingAddress(address);
        setExpiration(str3);
    }
}