package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class Country implements Serializable {
    private static final long serialVersionUID = 1;
    private final String iso2;
    private final String iso3;
    private final String name;
    private final String phonePrefix;
    private final boolean postalRequired;

    public Country(String str, String str2, String str3, String str4, boolean z10) {
        this.name = str;
        this.iso2 = str2;
        this.iso3 = str3;
        this.phonePrefix = str4;
        this.postalRequired = z10;
    }

    public String getIso2() {
        return this.iso2;
    }

    public String getIso3() {
        return this.iso3;
    }

    public String getName() {
        return this.name;
    }

    public String getPhonePrefix() {
        return this.phonePrefix;
    }

    public boolean isPostalRequired() {
        return this.postalRequired;
    }

    public String toString() {
        return this.name;
    }
}