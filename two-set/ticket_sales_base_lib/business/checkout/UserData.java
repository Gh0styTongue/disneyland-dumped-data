package com.disney.wdpro.ticket_sales_base_lib.business.checkout;

import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.ticket_sales_base_lib.utils.DateUtils;
import com.google.common.base.C22459j;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Calendar;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF"})
/* loaded from: classes18.dex */
public class UserData implements Serializable {
    public static final int MINIMUM_AGE_FOR_EMAIL_PHONE_DEMOGRAPHIC_INFORMATION = 18;
    private static final long serialVersionUID = 1;
    private final Address address;
    private final Calendar birthdate;
    private final String email;
    private final String gender;
    private final String guestLocalId;
    private final String guid;
    private final PersonName name;
    private final Phone phone;
    private final String swid;
    private final String xid;

    UserData(String str, PersonName personName, Address address, Phone phone, String str2, String str3, String str4, String str5, Calendar calendar, String str6) {
        this.name = personName;
        this.swid = str;
        this.address = address;
        this.phone = phone;
        this.email = str2;
        this.guestLocalId = str3;
        this.guid = str4;
        this.xid = str5;
        this.birthdate = calendar;
        this.gender = str6;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof UserData)) {
            UserData userData = (UserData) obj;
            boolean zM68660a = C22459j.m68660a(this.swid, userData.swid);
            boolean zM68660a2 = C22459j.m68660a(this.guestLocalId, userData.guestLocalId);
            boolean zM68660a3 = C22459j.m68660a(this.guid, userData.guid);
            if (zM68660a2 && zM68660a && zM68660a3) {
                return true;
            }
        }
        return false;
    }

    public Address getAddress() {
        return this.address;
    }

    public Optional<Calendar> getBirthdate() {
        return Optional.fromNullable(this.birthdate);
    }

    public Optional<String> getEmail() {
        return Optional.fromNullable(this.email);
    }

    public Optional<String> getGender() {
        return Optional.fromNullable(this.gender);
    }

    public Optional<String> getGuid() {
        return Optional.fromNullable(this.guid);
    }

    public PersonName getName() {
        return this.name;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public Optional<String> getSwid() {
        return Optional.fromNullable(this.swid);
    }

    public Optional<String> getXid() {
        return Optional.fromNullable(this.xid);
    }

    public int hashCode() {
        return C22459j.m68661b(this.swid, this.guestLocalId, this.guid);
    }

    public boolean isUserDemographicDataAvailable() {
        Address address;
        Calendar calendar;
        if (!C22466q.m68722b(this.name.getTitle().isPresent() ? this.name.getTitle().get() : null)) {
            if (!C22466q.m68722b(this.name.getFirstName().isPresent() ? this.name.getFirstName().get() : null)) {
                if (!C22466q.m68722b(this.name.getLastName().isPresent() ? this.name.getLastName().get() : null) && (address = this.address) != null && !C22466q.m68722b(address.getCountry()) && !C22466q.m68722b(this.address.getLine1()) && !C22466q.m68722b(this.address.getCity()) && !C22466q.m68722b(this.address.getStateOrProvince()) && !C22466q.m68722b(this.address.getPostalCode()) && (calendar = this.birthdate) != null && this.gender != null) {
                    if (!DateUtils.isRequiredAge(calendar, 18)) {
                        return true;
                    }
                    Phone phone = this.phone;
                    if (phone != null && !C22466q.m68722b(phone.getNumber()) && !C22466q.m68722b(this.email)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}