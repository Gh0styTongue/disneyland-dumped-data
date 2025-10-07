package com.disney.wdpro.ticket_sales_base_lib.business.checkout;

import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.Avatar;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.ticket_sales_base_lib.business.SettablePersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DemographicData;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes18.dex */
public class UserDataContainer implements Serializable {
    private static final Set<String> CANADA_COUNTRIES_UPPERCASE_NAMES = ImmutableSet.m69132of("CA", "CANADA", "CAN");
    private static final String DEFAULT_COUNTRY = "US";
    private static final long serialVersionUID = 1;
    private final String accountCountryCode;
    private List<Address> addresses;
    private final Optional<AffiliationType> affiliationType;
    private final AgeGroup ageGroup;
    private final String assignedEntitlementId;
    private Avatar avatar;
    private Calendar birthDate;
    private String email;
    private String gender;
    private final Map<IdType, String> idTypeToIdMap;
    private final SettablePersonName personName;
    private List<Phone> phones;
    private final int ticketItemLocalId;

    public enum IdType {
        SWID("swid"),
        GUID("guid"),
        XID("xid"),
        LOCAL_ID("guestLocalId");

        private static final Map<String, IdType> LOOKUP = Maps.m69381r();

        /* renamed from: id */
        private final String f43901id;

        static {
            Iterator it = EnumSet.allOf(IdType.class).iterator();
            while (it.hasNext()) {
                IdType idType = (IdType) it.next();
                C22462m.m68691w(LOOKUP.put(idType.getId(), idType) == null, "User Id type needs to be unique");
            }
        }

        IdType(String str) {
            this.f43901id = str;
        }

        public static IdType findById(String str) {
            IdType idType = LOOKUP.get(str);
            if (idType == null) {
                return null;
            }
            return idType;
        }

        public String getId() {
            return this.f43901id;
        }
    }

    public static class UserDataContainerBuilder {
        private String accountCountryCode;
        private List<Address> addresses;
        private AffiliationType affiliationType;
        private AgeGroup ageGroup;
        private String assignedEntitlementId;
        private Avatar avatar;
        private Calendar birthDate;
        private String email;
        private String gender;
        private Map<IdType, String> idTypeToIdMap = Maps.m69381r();
        private SettablePersonName personName;
        private List<Phone> phones;
        private int ticketItemLocalId;

        public UserDataContainer build() {
            return new UserDataContainer(this);
        }

        public UserDataContainerBuilder setAccountCountryCode(String str) {
            this.accountCountryCode = str;
            return this;
        }

        public UserDataContainerBuilder setAddresses(List<Address> list) {
            this.addresses = list;
            return this;
        }

        public UserDataContainerBuilder setAffiliationType(AffiliationType affiliationType) {
            this.affiliationType = affiliationType;
            return this;
        }

        public UserDataContainerBuilder setAgeGroup(AgeGroup ageGroup) {
            this.ageGroup = ageGroup;
            return this;
        }

        public UserDataContainerBuilder setAssignedEntitlementId(String str) {
            this.assignedEntitlementId = str;
            return this;
        }

        public UserDataContainerBuilder setAvatar(Avatar avatar) {
            this.avatar = avatar;
            return this;
        }

        public UserDataContainerBuilder setBirthDate(Calendar calendar) {
            this.birthDate = calendar;
            return this;
        }

        public UserDataContainerBuilder setDemographicData(DemographicData demographicData) {
            if (demographicData.getName() != null) {
                this.personName = SettablePersonName.fromPersonName(demographicData.getName());
            }
            setEmail(demographicData.getEmail());
            setAddresses(Lists.m69271l(demographicData.getAddress()));
            setPhones(Lists.m69271l(demographicData.getPhone()));
            setBirthDate(demographicData.getBirthDate());
            return this;
        }

        public UserDataContainerBuilder setEmail(String str) {
            this.email = str;
            return this;
        }

        public UserDataContainerBuilder setGender(String str) {
            this.gender = str;
            return this;
        }

        public UserDataContainerBuilder setGuestLocalId(String str) {
            this.idTypeToIdMap.put(IdType.LOCAL_ID, C22466q.m68725e(str));
            return this;
        }

        public UserDataContainerBuilder setGuid(String str) {
            this.idTypeToIdMap.put(IdType.GUID, C22466q.m68725e(str));
            return this;
        }

        public UserDataContainerBuilder setIdWithType(IdType idType, String str) {
            this.idTypeToIdMap.put(idType, C22466q.m68725e(str));
            return this;
        }

        public UserDataContainerBuilder setPersonName(SettablePersonName settablePersonName) {
            this.personName = settablePersonName;
            return this;
        }

        public UserDataContainerBuilder setPhones(List<Phone> list) {
            this.phones = list;
            return this;
        }

        public UserDataContainerBuilder setSwid(String str) {
            this.idTypeToIdMap.put(IdType.SWID, C22466q.m68725e(str));
            return this;
        }

        public UserDataContainerBuilder setTicketItemLocalId(int i10) {
            this.ticketItemLocalId = i10;
            return this;
        }

        public UserDataContainerBuilder setXid(String str) {
            this.idTypeToIdMap.put(IdType.XID, C22466q.m68725e(str));
            return this;
        }

        public UserDataContainerBuilder setIdWithType(IdWithType idWithType) {
            if (idWithType != null) {
                this.idTypeToIdMap.put(idWithType.getType(), C22466q.m68725e(idWithType.getId()));
            }
            return this;
        }
    }

    public UserDataContainer(UserDataContainerBuilder userDataContainerBuilder) {
        this.idTypeToIdMap = userDataContainerBuilder.idTypeToIdMap;
        this.email = C22466q.m68725e(userDataContainerBuilder.email);
        this.phones = userDataContainerBuilder.phones;
        this.ticketItemLocalId = userDataContainerBuilder.ticketItemLocalId;
        this.accountCountryCode = C22466q.m68725e(userDataContainerBuilder.accountCountryCode);
        this.avatar = userDataContainerBuilder.avatar;
        this.birthDate = userDataContainerBuilder.birthDate;
        if (userDataContainerBuilder.personName != null) {
            this.personName = userDataContainerBuilder.personName;
        } else {
            this.personName = new SettablePersonName(null, null, null, null, null);
        }
        this.assignedEntitlementId = userDataContainerBuilder.assignedEntitlementId;
        this.gender = userDataContainerBuilder.gender;
        this.ageGroup = userDataContainerBuilder.ageGroup;
        this.affiliationType = Optional.fromNullable(userDataContainerBuilder.affiliationType);
        if (userDataContainerBuilder.addresses == null) {
            this.addresses = Lists.m69268i();
        } else {
            this.addresses = Lists.m69269j(userDataContainerBuilder.addresses);
        }
        setAddress(this.addresses.isEmpty() ? null : this.addresses.get(0));
    }

    private static boolean isCanadianAccount(UserDataContainer userDataContainer) {
        String accountCountryCode = userDataContainer.getAccountCountryCode();
        return !C22466q.m68722b(accountCountryCode) && CANADA_COUNTRIES_UPPERCASE_NAMES.contains(accountCountryCode.toUpperCase(Locale.US));
    }

    public static boolean isUserFromCanada(UserDataContainer userDataContainer) {
        if (userDataContainer == null) {
            return false;
        }
        return isUserWithCanadaAddress(userDataContainer) || isCanadianAccount(userDataContainer);
    }

    private static boolean isUserWithCanadaAddress(UserDataContainer userDataContainer) {
        for (Address address : userDataContainer.getAddresses()) {
            if (address != null) {
                String country = address.getCountry();
                if (!C22466q.m68722b(country) && CANADA_COUNTRIES_UPPERCASE_NAMES.contains(country.toUpperCase(Locale.US))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static UserDataContainerBuilder newBuilder() {
        return new UserDataContainerBuilder();
    }

    private Address setAddressWithAffiliation(Address address) {
        if (!isStateEnforcementApplied()) {
            return address;
        }
        Address.AddressBuilder addressBuilder = address != null ? new Address.AddressBuilder(address) : new Address.AddressBuilder();
        if (this.affiliationType.isPresent()) {
            addressBuilder.setStateOrProvince(this.affiliationType.get().getStateOrProvinceCode());
            if (AffiliationType.FL_RESIDENT.getId().equals(this.affiliationType.get().getId()) || AffiliationType.SOCAL_RESIDENT.getId().equals(this.affiliationType.get().getId()) || AffiliationType.CAL_RESIDENT.getId().equals(this.affiliationType.get().getId())) {
                addressBuilder.setCountry("US");
            }
        }
        return addressBuilder.build();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof UserDataContainer)) {
            UserDataContainer userDataContainer = (UserDataContainer) obj;
            Map<IdType, String> map = this.idTypeToIdMap;
            IdType idType = IdType.SWID;
            String str = map.get(idType);
            String str2 = userDataContainer.idTypeToIdMap.get(idType);
            Map<IdType, String> map2 = this.idTypeToIdMap;
            IdType idType2 = IdType.GUID;
            String str3 = map2.get(idType2);
            String str4 = userDataContainer.idTypeToIdMap.get(idType2);
            Map<IdType, String> map3 = this.idTypeToIdMap;
            IdType idType3 = IdType.XID;
            String str5 = map3.get(idType3);
            String str6 = userDataContainer.idTypeToIdMap.get(idType3);
            if (C22466q.m68722b(str) && C22466q.m68722b(str2) && C22466q.m68722b(str3) && C22466q.m68722b(str4) && C22466q.m68722b(str5) && C22466q.m68722b(str6) && C22466q.m68722b(this.assignedEntitlementId) && C22466q.m68722b(userDataContainer.assignedEntitlementId)) {
                Map<IdType, String> map4 = this.idTypeToIdMap;
                IdType idType4 = IdType.LOCAL_ID;
                return C22459j.m68660a(map4.get(idType4), userDataContainer.idTypeToIdMap.get(idType4));
            }
            boolean zM68660a = C22459j.m68660a(str, str2);
            boolean zM68660a2 = C22459j.m68660a(str3, str4);
            boolean zM68660a3 = C22459j.m68660a(str5, str6);
            boolean zM68660a4 = C22459j.m68660a(this.assignedEntitlementId, userDataContainer.assignedEntitlementId);
            if (zM68660a && zM68660a2 && zM68660a3 && zM68660a4) {
                return true;
            }
        }
        return false;
    }

    public String getAccountCountryCode() {
        return this.accountCountryCode;
    }

    public List<Address> getAddresses() {
        ArrayList arrayListM69268i = Lists.m69268i();
        List<Address> list = this.addresses;
        if (list != null) {
            arrayListM69268i.addAll(list);
        }
        return arrayListM69268i;
    }

    public Optional<AffiliationType> getAffiliationType() {
        return this.affiliationType;
    }

    public AgeGroup getAgeGroup() {
        return this.ageGroup;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public Optional<Calendar> getBirthDate() {
        return Optional.fromNullable(this.birthDate);
    }

    public String getEmail() {
        return this.email;
    }

    public SettablePersonName getPersonName() {
        return this.personName;
    }

    public List<Phone> getPhones() {
        ArrayList arrayListM69268i = Lists.m69268i();
        List<Phone> list = this.phones;
        if (list != null) {
            arrayListM69268i.addAll(list);
        }
        return arrayListM69268i;
    }

    public String getSwid() {
        return this.idTypeToIdMap.get(IdType.SWID);
    }

    public int getTicketItemLocalId() {
        return this.ticketItemLocalId;
    }

    public UserData getUserDataFromContainer() {
        C22462m.m68673e(this.personName != null, "name == null");
        List<Address> list = this.addresses;
        Phone phone = null;
        Address address = (list == null || list.isEmpty()) ? null : this.addresses.get(0);
        List<Phone> list2 = this.phones;
        if (list2 != null && !list2.isEmpty()) {
            phone = this.phones.get(0);
        }
        return new UserData(this.idTypeToIdMap.get(IdType.SWID), this.personName, address, phone, this.email, this.idTypeToIdMap.get(IdType.LOCAL_ID), this.idTypeToIdMap.get(IdType.GUID), this.idTypeToIdMap.get(IdType.XID), this.birthDate, this.gender);
    }

    public String getXid() {
        return this.idTypeToIdMap.get(IdType.XID);
    }

    public String getassignedEntitlementId() {
        return this.assignedEntitlementId;
    }

    public int hashCode() {
        String str = this.idTypeToIdMap.get(IdType.SWID);
        String str2 = this.idTypeToIdMap.get(IdType.GUID);
        String str3 = this.idTypeToIdMap.get(IdType.XID);
        return (C22466q.m68722b(str) && C22466q.m68722b(str2) && C22466q.m68722b(str3) && C22466q.m68722b(this.assignedEntitlementId)) ? C22459j.m68661b(this.idTypeToIdMap.get(IdType.LOCAL_ID)) : C22459j.m68661b(str, str2, str3, this.assignedEntitlementId);
    }

    public boolean isStateEnforcementApplied() {
        return this.affiliationType.isPresent() && this.affiliationType.get().isRegionSpecificAffiliation();
    }

    public void setAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = Lists.m69268i();
        }
        this.addresses.add(0, setAddressWithAffiliation(address));
    }

    public void setBirthDate(Calendar calendar) {
        this.birthDate = calendar;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFirstName(String str) {
        this.personName.setFirstName(str);
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setLastName(String str) {
        this.personName.setLastName(str);
    }

    public void setMiddleName(String str) {
        this.personName.setMiddleName(str);
    }

    public void setPhone(Phone phone) {
        if (this.phones == null) {
            this.phones = Lists.m69268i();
        }
        this.phones.add(0, phone);
    }

    public void setSuffix(String str) {
        this.personName.setSuffix(str);
    }

    public void setTitle(String str) {
        this.personName.setTitle(str);
    }
}