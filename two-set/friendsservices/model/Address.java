package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006/"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Address;", "Ljava/io/Serializable;", "addressLine1", "", "addressLine2", "addressLine3", "city", "country", "postalCode", "state", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine1", "()Ljava/lang/String;", "setAddressLine1", "(Ljava/lang/String;)V", "getAddressLine2", "setAddressLine2", "getAddressLine3", "setAddressLine3", "getCity", "setCity", "getCountry", "setCountry", "getPostalCode", "setPostalCode", "getState", "setState", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final /* data */ class Address implements Serializable {
    public static final String TYPE_BILLING = "BILLING";
    public static final String TYPE_SHIPPING = "shipping";
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
    private String postalCode;
    private String state;
    private String type;

    public Address() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = address.addressLine1;
        }
        if ((i10 & 2) != 0) {
            str2 = address.addressLine2;
        }
        if ((i10 & 4) != 0) {
            str3 = address.addressLine3;
        }
        if ((i10 & 8) != 0) {
            str4 = address.city;
        }
        if ((i10 & 16) != 0) {
            str5 = address.country;
        }
        if ((i10 & 32) != 0) {
            str6 = address.postalCode;
        }
        if ((i10 & 64) != 0) {
            str7 = address.state;
        }
        if ((i10 & 128) != 0) {
            str8 = address.type;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return address.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddressLine3() {
        return this.addressLine3;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Address copy(String addressLine1, String addressLine2, String addressLine3, String city, String country, String postalCode, String state, String type) {
        return new Address(addressLine1, addressLine2, addressLine3, city, country, postalCode, state, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(this.addressLine1, address.addressLine1) && Intrinsics.areEqual(this.addressLine2, address.addressLine2) && Intrinsics.areEqual(this.addressLine3, address.addressLine3) && Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.state, address.state) && Intrinsics.areEqual(this.type, address.type);
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressLine3() {
        return this.addressLine3;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine3;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postalCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.type;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setAddressLine1(String str) {
        this.addressLine1 = str;
    }

    public final void setAddressLine2(String str) {
        this.addressLine2 = str;
    }

    public final void setAddressLine3(String str) {
        this.addressLine3 = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "Address(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", addressLine3=" + this.addressLine3 + ", city=" + this.city + ", country=" + this.country + ", postalCode=" + this.postalCode + ", state=" + this.state + ", type=" + this.type + ")";
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.addressLine3 = str3;
        this.city = str4;
        this.country = str5;
        this.postalCode = str6;
        this.state = str7;
        this.type = str8;
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8);
    }
}