package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry;

import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserData;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ApUpgradeGuestAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes18.dex */
public final class ApUpgradesGuestEntry extends BasicGuestEntry {
    private final ApUpgradeGuestAddress address;
    private final int age;
    private final String birthDate;
    private final String emailAddress;
    private final String gender;
    private final Phone phoneNumber;
    private final String profileLink;

    public ApUpgradesGuestEntry(UserData userData, boolean z10, String str, List<String> list) {
        super(userData, z10, str, list);
        this.address = ApUpgradeGuestAddress.fromAddress(userData.getAddress());
        this.phoneNumber = userData.getPhone();
        this.emailAddress = userData.getEmail().orNull();
        this.profileLink = "";
        this.birthDate = getBirthDate(userData);
        this.age = getAge(userData);
        this.gender = userData.getGender().get();
    }

    private int getAge(UserData userData) {
        if (!userData.getBirthdate().isPresent()) {
            return -1;
        }
        Calendar calendar = userData.getBirthdate().get();
        Calendar calendar2 = Calendar.getInstance();
        int i10 = calendar2.get(1) - calendar.get(1);
        return calendar2.get(6) < calendar.get(6) ? i10 - 1 : i10;
    }

    private String getBirthDate(UserData userData) {
        return userData.getBirthdate().isPresent() ? new SimpleDateFormat("yyyy-MM-dd").format(userData.getBirthdate().get().getTime()) : "";
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.BasicGuestEntry, com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry
    public /* bridge */ /* synthetic */ PersonName getName() {
        return super.getName();
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.BasicGuestEntry, com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry
    public /* bridge */ /* synthetic */ boolean isPrimary() {
        return super.isPrimary();
    }
}