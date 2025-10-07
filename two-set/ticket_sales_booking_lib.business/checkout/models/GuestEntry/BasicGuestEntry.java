package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry;

import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserData;
import java.util.List;

/* loaded from: classes18.dex */
class BasicGuestEntry implements IGuestEntry {
    private final String guid;
    private final List<String> itemsAssigned;
    private final PersonName name;
    private final String participantId;
    private final boolean primary;
    private final String swid;
    private final String xid;

    protected BasicGuestEntry(UserData userData, boolean z10, String str, List<String> list) {
        this(userData.getSwid().orNull(), userData.getGuid().orNull(), userData.getXid().orNull(), str, z10, userData.getName(), list);
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry
    public PersonName getName() {
        return this.name;
    }

    @Override // com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.GuestEntry.IGuestEntry
    public boolean isPrimary() {
        return this.primary;
    }

    private BasicGuestEntry(String str, String str2, String str3, String str4, boolean z10, PersonName personName, List<String> list) {
        this.swid = str;
        this.guid = str2;
        this.xid = str3;
        this.participantId = str4;
        this.name = personName;
        this.itemsAssigned = list;
        this.primary = z10;
    }
}