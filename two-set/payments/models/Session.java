package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.SessionTypeEnum;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class Session implements Serializable {
    private static final long serialVersionUID = 3998923467259334100L;
    private Map<String, Object> clientSettings;
    private final Content content;

    @SerializedName("currency")
    private final String currencyCode;
    private Map<String, Boolean> errors;
    private Map<String, Object> financialSettings;
    private Guest guestProfile;

    /* renamed from: id */
    private String f41243id;
    private Product product;
    private String threeDomainSecureJwt;
    private SessionTypeEnum type;
    private String walletJwt;

    public Session(String str, SessionTypeEnum sessionTypeEnum, String str2, Product product, Guest guest, Map<String, Object> map, Map<String, Object> map2, Content content, String str3, Map<String, Boolean> map3) {
        this.clientSettings = new HashMap();
        this.financialSettings = new HashMap();
        new HashMap();
        this.f41243id = str;
        this.type = sessionTypeEnum;
        this.currencyCode = str2;
        this.product = product;
        this.guestProfile = guest;
        this.clientSettings = map;
        this.financialSettings = map2;
        this.content = content;
        this.threeDomainSecureJwt = str3;
        this.errors = map3;
    }

    public Map<String, Object> getClientSettings() {
        return this.clientSettings;
    }

    public Content getContent() {
        return this.content;
    }

    public Map<String, Boolean> getErrors() {
        return this.errors;
    }

    public Map<String, Object> getFinancialSettings() {
        return this.financialSettings;
    }

    public String getId() {
        return this.f41243id;
    }

    public Product getProduct() {
        return this.product;
    }

    public String getThreeDomainSecureJwt() {
        return this.threeDomainSecureJwt;
    }

    public SessionTypeEnum getType() {
        return this.type;
    }

    public Guest getUser() {
        return this.guestProfile;
    }

    public String getWalletJwt() {
        return this.walletJwt;
    }

    public void setId(String str) {
        this.f41243id = str;
    }

    public void setOrder(Product product) {
        this.product = product;
    }

    public void setThreeDomainSecureJwt(String str) {
        this.threeDomainSecureJwt = str;
    }

    public void setType(SessionTypeEnum sessionTypeEnum) {
        this.type = sessionTypeEnum;
    }

    public void setUser(Guest guest) {
        this.guestProfile = guest;
    }

    public void setWalletJwt(String str) {
        this.walletJwt = str;
    }
}