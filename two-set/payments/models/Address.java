package com.disney.wdpro.payments.models;

import com.disney.wdpro.service.business.APIConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes15.dex */
public class Address implements Serializable {
    private static final String empty = "";
    private static final long serialVersionUID = -8269529695793885072L;

    @SerializedName(APIConstants.UrlParams.LINE1)
    private String addressLine1;

    @SerializedName(APIConstants.UrlParams.LINE2)
    private String addressLine2;
    private String city;
    private String country;
    private String postalCode;

    @SerializedName("state")
    private String stateProvince;

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.postalCode = str;
        this.stateProvince = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
        this.country = str5;
        this.city = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Address address = (Address) obj;
            if (Objects.equals(this.postalCode, address.postalCode) && Objects.equals(this.stateProvince, address.stateProvince) && Objects.equals(this.addressLine1, address.addressLine1) && Objects.equals(this.addressLine2, address.addressLine2) && Objects.equals(this.country, address.country) && Objects.equals(this.city, address.city)) {
                return true;
            }
        }
        return false;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getStateProvince() {
        return this.stateProvince;
    }

    public int hashCode() {
        return Objects.hash(this.postalCode, this.stateProvince, this.addressLine1, this.addressLine2, this.country, this.city);
    }

    public boolean isEmpty() {
        return Objects.equals(this.postalCode, "") && Objects.equals(this.stateProvince, "") && Objects.equals(this.addressLine1, "") && Objects.equals(this.country, "") && Objects.equals(this.city, "");
    }

    public void setAddressLine1(String str) {
        this.addressLine1 = str;
    }

    public void setAddressLine2(String str) {
        this.addressLine2 = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public void setStateProvince(String str) {
        this.stateProvince = str;
    }
}