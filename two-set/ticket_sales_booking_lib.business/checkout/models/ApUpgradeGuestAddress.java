package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models;

import com.disney.wdpro.service.model.Address;
import java.io.Serializable;

/* loaded from: classes18.dex */
public final class ApUpgradeGuestAddress implements Serializable {
    private String city;
    private String country;
    private String line1;
    private String line2;
    private String line3;
    private String postalCode;
    private String stateOrProvince;

    private ApUpgradeGuestAddress() {
    }

    public static ApUpgradeGuestAddress fromAddress(Address address) {
        ApUpgradeGuestAddress apUpgradeGuestAddress = new ApUpgradeGuestAddress();
        if (address != null) {
            apUpgradeGuestAddress.line1 = address.getLine1();
            apUpgradeGuestAddress.line2 = address.getLine2();
            apUpgradeGuestAddress.line3 = address.getLine3();
            apUpgradeGuestAddress.city = address.getCity();
            apUpgradeGuestAddress.stateOrProvince = address.getStateOrProvince();
            apUpgradeGuestAddress.country = address.getCountry();
            apUpgradeGuestAddress.postalCode = address.getPostalCode();
        }
        return apUpgradeGuestAddress;
    }
}