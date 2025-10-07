package com.disney.wdpro.payments.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes15.dex */
public class Guest implements Serializable {
    private static final long serialVersionUID = -5253795881722963761L;

    @SerializedName("billingAddress")
    private Address address;

    @SerializedName("billingAddresses")
    private List<Address> addressList;

    @SerializedName("tokensOnFile")
    private List<CardToken> cardsOnFile;

    @SerializedName("phoneCountryCode")
    private String countryCode;
    private String email;
    private String firstName;
    private boolean hasUnconsentedWalletCards;
    private String lastName;

    @SerializedName("mi")
    private String middleInitial;
    private String phone;
    private String swid;
    private LinkedHashMap<String, Integer> walletCardCount;

    public Guest(String str, String str2, String str3, Address address, String str4, String str5, String str6, String str7, List<CardToken> list, boolean z10, LinkedHashMap<String, Integer> linkedHashMap) {
        this.firstName = str;
        this.middleInitial = str2;
        this.lastName = str3;
        this.address = address;
        this.email = str4;
        this.phone = str5;
        this.countryCode = str6;
        this.swid = str7;
        this.cardsOnFile = list;
        this.hasUnconsentedWalletCards = z10;
        this.walletCardCount = linkedHashMap;
    }

    public boolean doesHaveUnconsentedWalletCards() {
        return this.hasUnconsentedWalletCards;
    }

    public Address getAddress() {
        return this.address;
    }

    public List<Address> getAddressList() {
        return this.addressList;
    }

    public List<CardToken> getCardsOnFile() {
        return this.cardsOnFile;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getSwid() {
        return this.swid;
    }

    public LinkedHashMap<String, Integer> getWalletCardCount() {
        return this.walletCardCount;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddressList(List<Address> list) {
        this.addressList = list;
    }

    public void setCardsOnFile(List<CardToken> list) {
        this.cardsOnFile = list;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setHasUnconsentedWalletCards(boolean z10) {
        this.hasUnconsentedWalletCards = z10;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setMiddleInitial(String str) {
        this.middleInitial = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setSwid(String str) {
        this.swid = str;
    }

    public void setWalletCardCount(LinkedHashMap<String, Integer> linkedHashMap) {
        this.walletCardCount = linkedHashMap;
    }
}