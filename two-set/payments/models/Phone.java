package com.disney.wdpro.payments.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class Phone implements Serializable {
    private static final long serialVersionUID = 2709690201273349192L;
    private String countryCode;

    @SerializedName("digits")
    private String phoneNumber;

    public Phone(String str, String str2) {
        this.countryCode = str;
        this.phoneNumber = str2;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }
}