package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.payments.models.enums.IssuerNameEnum;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes15.dex */
public class BaseCardDetails implements Serializable {
    private static final long serialVersionUID = -2235910031794807510L;
    protected Double amount;
    protected Map<String, String> confirmation;
    protected String confirmationCode;
    protected Boolean failedUnlock;
    protected boolean failedWalletSave;
    protected IssuerNameEnum issuer;
    protected String issuerAuthCode;

    @SerializedName(alternate = {"savedToProfile"}, value = "saveToProfile")
    protected boolean saveToProfile;
    protected Integer status;
    protected CardTypeEnum type;

    protected BaseCardDetails() {
        this.saveToProfile = false;
    }

    public Boolean failedToUnlock() {
        return this.failedUnlock;
    }

    public Double getAmount() {
        return this.amount;
    }

    public Map<String, String> getConfirmation() {
        return this.confirmation;
    }

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    public IssuerNameEnum getIssuer() {
        return this.issuer;
    }

    public String getIssuerAuthCode() {
        return this.issuerAuthCode;
    }

    public Integer getStatus() {
        return this.status;
    }

    public CardTypeEnum getType() {
        return this.type;
    }

    public boolean isFailedWalletSave() {
        return this.failedWalletSave;
    }

    public boolean isSaveToProfile() {
        return this.saveToProfile;
    }

    public void setAmount(Double d10) {
        this.amount = d10;
    }

    public void setConfirmation(Map<String, String> map) {
        this.confirmation = map;
    }

    public void setConfirmationCode(String str) {
        this.confirmationCode = str;
    }

    public void setFailedWalletSave(boolean z10) {
        this.failedWalletSave = z10;
    }

    public void setIssuer(IssuerNameEnum issuerNameEnum) {
        this.issuer = issuerNameEnum;
    }

    public void setIssuerAuthCode(String str) {
        this.issuerAuthCode = str;
    }

    public void setSaveToProfile(boolean z10) {
        this.saveToProfile = z10;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public BaseCardDetails(Double d10, boolean z10, String str, String str2, Map<String, String> map) {
        this.amount = d10;
        this.saveToProfile = z10;
        this.confirmationCode = str;
        this.issuerAuthCode = str2;
        this.confirmation = map;
    }
}