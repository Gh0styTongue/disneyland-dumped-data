package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.secommerce.util.DateTimeUtil;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.annotation.Nullable;

/* loaded from: classes18.dex */
public final class DemographicData implements Serializable {
    private final Address address;
    private final Calendar birthDate;
    private final String email;
    private final String guid;
    private final PersonName name;
    private final Phone phone;
    private final boolean shouldUseMasterData;

    public static final class DemographicDataBuilder {
        private Address address;
        private Calendar birthdate;
        private String email;
        private String guid;
        private PersonName name;
        private Phone phone;
        private boolean shouldUseMasterData;

        public static DemographicDataBuilder getInstance() {
            return new DemographicDataBuilder();
        }

        public static DemographicDataBuilder getInstanceFrom(DemographicData demographicData) {
            DemographicDataBuilder demographicDataBuilder = getInstance();
            if (demographicData != null) {
                demographicDataBuilder.withName(demographicData.getName());
                demographicDataBuilder.withBirthdate(demographicData.getBirthDate());
                demographicDataBuilder.withAddress(demographicData.getAddress());
                demographicDataBuilder.withPhone(demographicData.getPhone());
                demographicDataBuilder.withEmail(demographicData.getEmail());
                demographicDataBuilder.withShouldUseMasterData(demographicData.isUsingMasterData());
                demographicDataBuilder.withGuid(demographicData.getGuid());
            }
            return demographicDataBuilder;
        }

        public DemographicData build() {
            return new DemographicData(this);
        }

        public DemographicDataBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public DemographicDataBuilder withBirthdate(Calendar calendar) {
            this.birthdate = calendar;
            return this;
        }

        public DemographicDataBuilder withEmail(String str) {
            this.email = str;
            return this;
        }

        public DemographicDataBuilder withGuid(String str) {
            this.guid = str;
            return this;
        }

        public DemographicDataBuilder withName(PersonName personName) {
            this.name = personName;
            return this;
        }

        public DemographicDataBuilder withPhone(Phone phone) {
            this.phone = phone;
            return this;
        }

        public DemographicDataBuilder withShouldUseMasterData(boolean z10) {
            this.shouldUseMasterData = z10;
            return this;
        }
    }

    private String getAddressString(Address address) {
        StringBuilder sb2 = new StringBuilder();
        if (address == null) {
            sb2.append("null");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Line1: ");
        sb3.append(address.getLine1() != null ? address.getLine1() : "");
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(" Line2: ");
        sb4.append(address.getLine2() != null ? address.getLine2() : "");
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(" Line3: ");
        sb5.append(address.getLine3() != null ? address.getLine3() : "");
        sb2.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(" City: ");
        sb6.append(address.getCity() != null ? address.getCity() : "");
        sb2.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(" State: ");
        sb7.append(address.getStateOrProvince() != null ? address.getStateOrProvince() : "");
        sb2.append(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(" Country: ");
        sb8.append(address.getCountry() != null ? address.getCountry() : "");
        sb2.append(sb8.toString());
        return sb2.toString();
    }

    private String getNameString(PersonName personName) {
        StringBuilder sb2 = new StringBuilder();
        if (personName == null) {
            sb2.append("null");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Title: ");
        sb3.append(personName.getTitle().isPresent() ? personName.getTitle().get() : "");
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(" FirstName: ");
        sb4.append(personName.getFirstName().isPresent() ? personName.getFirstName().get() : "");
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(" LastName: ");
        sb5.append(personName.getLastName().isPresent() ? personName.getLastName().get() : "");
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    public Address getAddress() {
        return this.address;
    }

    public Calendar getBirthDate() {
        return this.birthDate;
    }

    public String getEmail() {
        return this.email;
    }

    @Nullable
    public String getGuid() {
        return this.guid;
    }

    public PersonName getName() {
        return this.name;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public boolean isUsingMasterData() {
        return this.shouldUseMasterData;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append("PersonName: " + getNameString(this.name));
        sb2.append("\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Birthdate: ");
        sb3.append(this.birthDate == null ? "null" : new SimpleDateFormat(DateTimeUtil.DATE_PATTERN_MM_dd_yyyy).format(this.birthDate.getTime()));
        sb2.append(sb3.toString());
        sb2.append("\n");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Address: ");
        Address address = this.address;
        sb4.append(address == null ? "null" : getAddressString(address));
        sb2.append(sb4.toString());
        sb2.append("\n");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Phone: ");
        Phone phone = this.phone;
        sb5.append(phone == null ? "null" : phone.getNumber());
        sb2.append(sb5.toString());
        sb2.append("\n");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Email: ");
        String str = this.email;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb2.append(sb6.toString());
        sb2.append("\n");
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Guid: ");
        String str2 = this.guid;
        sb7.append(str2 != null ? str2 : "null");
        sb2.append(sb7.toString());
        sb2.append("]");
        return sb2.toString();
    }

    private DemographicData(DemographicDataBuilder demographicDataBuilder) {
        this.name = demographicDataBuilder.name;
        this.birthDate = demographicDataBuilder.birthdate;
        this.address = demographicDataBuilder.address;
        this.phone = demographicDataBuilder.phone;
        this.email = demographicDataBuilder.email;
        this.shouldUseMasterData = demographicDataBuilder.shouldUseMasterData;
        this.guid = demographicDataBuilder.guid;
    }
}