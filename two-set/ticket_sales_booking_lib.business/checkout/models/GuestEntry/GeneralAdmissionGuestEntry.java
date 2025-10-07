package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry;

import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserData;
import java.util.List;

/* loaded from: classes18.dex */
public final class GeneralAdmissionGuestEntry extends BasicGuestEntry {
    private static final String CANADA_BOOKING_SERVICE_COUNTRY_CODE = "CAN";
    private static final String CANADA_PROFILE_COUNTRY_CODE = "CA";
    private final Address guestAddress;
    private final String guestName;
    private final Phone guestPhone;

    public GeneralAdmissionGuestEntry(UserData userData, boolean z10, String str, List<String> list, String str2) {
        super(userData, z10, str, list);
        this.guestName = str2;
        Address address = userData.getAddress();
        this.guestAddress = address != null ? processCanadaCountryCode(address) : address;
        Phone phone = userData.getPhone();
        this.guestPhone = phone != null ? processCanadaCountryCode(phone) : phone;
    }

    private Address processCanadaCountryCode(Address address) {
        Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
        if ("CA".equals(address.getCountry())) {
            addressBuilder.setCountry(CANADA_BOOKING_SERVICE_COUNTRY_CODE);
        } else {
            addressBuilder.setCountry(address.getCountry());
        }
        addressBuilder.setAddressId(address.getId());
        addressBuilder.setCity(address.getCity());
        addressBuilder.setLine1(address.getLine1());
        addressBuilder.setLine2(address.getLine2());
        addressBuilder.setLine3(address.getLine3());
        addressBuilder.setPostalCode(address.getPostalCode());
        addressBuilder.setStateOrProvince(address.getStateOrProvince());
        addressBuilder.setType(address.getType());
        return new Address(addressBuilder);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.BasicGuestEntry, com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry
    public /* bridge */ /* synthetic */ PersonName getName() {
        return super.getName();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.BasicGuestEntry, com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry
    public /* bridge */ /* synthetic */ boolean isPrimary() {
        return super.isPrimary();
    }

    private Phone processCanadaCountryCode(Phone phone) {
        if ("CA".equals(phone.getCountryCode())) {
            phone.setCountryCode(CANADA_BOOKING_SERVICE_COUNTRY_CODE);
        }
        return phone;
    }
}