package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class ContentCopyData implements Serializable {
    private static final long serialVersionUID = 1;
    private Map<String, Map<String, String>> images;
    private Map<String, ?> CREDIT_CARD = new HashMap();
    private Map<String, ?> GIFT_CARD = new HashMap();
    private Map<String, ?> REWARDS_CARD = new HashMap();
    private Map<String, ?> DVIC = new HashMap();
    private Map<String, ?> globals = new HashMap();
    private Map<String, ?> creditCardBrand = new HashMap();
    private Map<String, ?> globalErrors = new HashMap();
    private Map<String, ?> validationErrors = new HashMap();
    private Map<String, ?> mobileSdk = new HashMap();
    private Map<String, ?> walletMerge = new HashMap();

    public ContentCopyData(Map<String, Map<String, String>> map) {
        this.images = new HashMap();
        this.images = map;
    }

    public Map<String, ?> getCREDIT_CARD() {
        return this.CREDIT_CARD;
    }

    public Map<String, ?> getCreditCardBrand() {
        return this.creditCardBrand;
    }

    public Map<String, ?> getDVIC() {
        return this.DVIC;
    }

    public Map<String, ?> getGIFT_CARD() {
        return this.GIFT_CARD;
    }

    public Map<String, ?> getGlobalErrors() {
        return this.globalErrors;
    }

    public Map<String, ?> getGlobals() {
        return this.globals;
    }

    public Map<String, Map<String, String>> getImages() {
        return this.images;
    }

    public Map<String, ?> getMobileSdk() {
        return this.mobileSdk;
    }

    public Map<String, ?> getREWARDS_CARD() {
        return this.REWARDS_CARD;
    }

    public Map<String, ?> getValidationErrors() {
        return this.validationErrors;
    }

    public Map<String, ?> getWalletMerge() {
        return this.walletMerge;
    }

    public void setCREDIT_CARD(Map<String, ?> map) {
        this.CREDIT_CARD = map;
    }

    public void setCreditCardBrand(Map<String, ?> map) {
        this.creditCardBrand = map;
    }

    public void setDVIC(Map<String, ?> map) {
        this.DVIC = map;
    }

    public void setGIFT_CARD(Map<String, ?> map) {
        this.GIFT_CARD = map;
    }

    public void setGlobalErrors(Map<String, ?> map) {
        this.globalErrors = map;
    }

    public void setGlobals(Map<String, ?> map) {
        this.globals = map;
    }

    public void setImages(Map<String, Map<String, String>> map) {
        this.images = map;
    }

    public void setMobileSdk(Map<String, ?> map) {
        this.mobileSdk = map;
    }

    public void setREWARDS_CARD(Map<String, ?> map) {
        this.REWARDS_CARD = map;
    }

    public void setValidationErrors(Map<String, ?> map) {
        this.validationErrors = map;
    }

    public void setWalletMerge(Map<String, ?> map) {
        this.walletMerge = map;
    }
}