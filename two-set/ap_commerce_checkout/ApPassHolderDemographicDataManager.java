package com.disney.wdpro.ap_commerce_checkout;

import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import com.disney.wdpro.commercecheckout.util.StringUtils;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.service.model.Profile;
import com.disney.wdpro.ticket_sales_base_lib.business.SettablePersonName;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserData;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DemographicData;
import com.disney.wdpro.ticket_sales_base_lib.utils.SerializablePair;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes23.dex */
public final class ApPassHolderDemographicDataManager implements APDemographicInfoFragment.DemographicDataResultHandler {
    private final APCommerceCheckoutManager apCommerceCheckoutManager;
    private HashMap<String, UserDataContainer> assignedEntitlementIdToUserDataContainerMap;
    private Set<String> assignedEntitlementIdsUsingMasterData;
    private UserDataContainer masterUser;
    private HashMultimap<NameFields, String> nameFieldsToAssignedEntitlementIdsNotEditable;
    private ArrayList<SerializablePair<UserDataContainer, Optional<String>>> passholderItemList;
    private Profile profile;
    private String purchaseSwid;
    private Optional<HashMap<String, AgeGroup>> ticketItemsEntitlementIdToAgeGroupMap;
    private Map<String, String> titleToGenderMap;
    private Map<UserDataContainer, Integer> userDataContainerToGuestNumberMap;
    private WebStoreId webStoreId;

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager$2 */
    static /* synthetic */ class C86872 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$WebStoreId */
        static final /* synthetic */ int[] f29117xb8e59ff4;

        static {
            int[] iArr = new int[WebStoreId.values().length];
            f29117xb8e59ff4 = iArr;
            try {
                iArr[WebStoreId.WDW_MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29117xb8e59ff4[WebStoreId.DLR_MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class DemographicBasicInfo {
        final String birthDate;
        final String categoryType;
        final SettablePersonName name;

        DemographicBasicInfo(String str, SettablePersonName settablePersonName, String str2) {
            this.categoryType = str;
            this.name = settablePersonName;
            this.birthDate = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && DemographicBasicInfo.class == obj.getClass()) {
                DemographicBasicInfo demographicBasicInfo = (DemographicBasicInfo) obj;
                if (this.categoryType.equals(demographicBasicInfo.categoryType) && this.name.equals(demographicBasicInfo.name) && this.birthDate.equals(demographicBasicInfo.birthDate)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.categoryType.hashCode() + this.name.hashCode() + this.birthDate.hashCode();
        }
    }

    public enum NameFields {
        TITLE,
        FIRST_NAME,
        LAST_NAME
    }

    public ApPassHolderDemographicDataManager(APCommerceCheckoutManager aPCommerceCheckoutManager) {
        this.apCommerceCheckoutManager = aPCommerceCheckoutManager;
    }

    private void addNamesFromTicketItems(HashMap<String, PersonName> map) {
        Iterator<SerializablePair<UserDataContainer, Optional<String>>> it = this.passholderItemList.iterator();
        while (it.hasNext()) {
            SerializablePair<UserDataContainer, Optional<String>> next = it.next();
            PersonName personName = map.get(next.first.getassignedEntitlementId());
            if (personName != null) {
                EnumMap<NameFields, Boolean> enumMapFillName = fillName(next.first, personName);
                NameFields nameFields = NameFields.TITLE;
                if (enumMapFillName.get(nameFields).booleanValue()) {
                    this.nameFieldsToAssignedEntitlementIdsNotEditable.put(nameFields, next.first.getassignedEntitlementId());
                }
                NameFields nameFields2 = NameFields.FIRST_NAME;
                if (enumMapFillName.get(nameFields2).booleanValue()) {
                    this.nameFieldsToAssignedEntitlementIdsNotEditable.put(nameFields2, next.first.getassignedEntitlementId());
                }
                NameFields nameFields3 = NameFields.LAST_NAME;
                if (enumMapFillName.get(nameFields3).booleanValue()) {
                    this.nameFieldsToAssignedEntitlementIdsNotEditable.put(nameFields3, next.first.getassignedEntitlementId());
                }
            }
        }
    }

    private void fillAddress(UserDataContainer userDataContainer, Profile profile) {
        if (profile.getAddresses().isEmpty() || profile.getShippingAddress() == null) {
            return;
        }
        Address shippingAddress = profile.getShippingAddress();
        Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
        addressBuilder.setLine1(shippingAddress.getLine1());
        addressBuilder.setLine2(shippingAddress.getLine2());
        addressBuilder.setLine3(shippingAddress.getLine3());
        addressBuilder.setCity(shippingAddress.getCity());
        addressBuilder.setStateOrProvince(shippingAddress.getStateOrProvince());
        addressBuilder.setCountry(shippingAddress.getCountry());
        addressBuilder.setPostalCode(shippingAddress.getPostalCode());
        userDataContainer.setAddress(addressBuilder.build());
    }

    private void fillBirthDate(UserDataContainer userDataContainer, Profile profile) {
        if (profile == null || profile.getDateOfBirth() == null) {
            return;
        }
        userDataContainer.setBirthDate(StringUtils.getCalendarFromStringDate(profile.getDateOfBirth()));
    }

    private EnumMap<NameFields, Boolean> fillName(UserDataContainer userDataContainer, PersonName personName) {
        EnumMap<NameFields, Boolean> enumMapM69380q = Maps.m69380q(NameFields.class);
        NameFields nameFields = NameFields.TITLE;
        Boolean bool = Boolean.FALSE;
        enumMapM69380q.put((EnumMap<NameFields, Boolean>) nameFields, (NameFields) bool);
        NameFields nameFields2 = NameFields.FIRST_NAME;
        enumMapM69380q.put((EnumMap<NameFields, Boolean>) nameFields2, (NameFields) bool);
        NameFields nameFields3 = NameFields.LAST_NAME;
        enumMapM69380q.put((EnumMap<NameFields, Boolean>) nameFields3, (NameFields) bool);
        if (personName != null) {
            if (personName.getTitle().isPresent() && !C22466q.m68722b(personName.getTitle().get())) {
                userDataContainer.setTitle(personName.getTitle().get());
                enumMapM69380q.put((EnumMap<NameFields, Boolean>) nameFields, (NameFields) Boolean.TRUE);
            }
            if (personName.getFirstName().isPresent() && !C22466q.m68722b(personName.getFirstName().get())) {
                userDataContainer.setFirstName(personName.getFirstName().get());
                enumMapM69380q.put((EnumMap<NameFields, Boolean>) nameFields2, (NameFields) Boolean.TRUE);
            }
            if (personName.getLastName().isPresent() && !C22466q.m68722b(personName.getLastName().get())) {
                userDataContainer.setLastName(personName.getLastName().get());
                enumMapM69380q.put((EnumMap<NameFields, Boolean>) nameFields3, (NameFields) Boolean.TRUE);
            }
        }
        return enumMapM69380q;
    }

    private UserDataContainer getMasterUser() {
        int i10 = C86872.f29117xb8e59ff4[this.webStoreId.ordinal()];
        if (i10 == 1) {
            UserDataContainer userDataContainerFromSWID = getUserDataContainerFromSWID(this.purchaseSwid);
            return userDataContainerFromSWID == null ? this.passholderItemList.get(0).first : userDataContainerFromSWID;
        }
        if (i10 == 2) {
            return this.passholderItemList.get(0).first;
        }
        throw new UnsupportedOperationException("Ap functionality not supported in WDW and DLR Parks only.");
    }

    private UserDataContainer getUserDataContainerFromSWID(String str) {
        Iterator<SerializablePair<UserDataContainer, Optional<String>>> it = this.passholderItemList.iterator();
        while (it.hasNext()) {
            SerializablePair<UserDataContainer, Optional<String>> next = it.next();
            String swid = next.first.getSwid();
            if (swid != null && swid.equals(str)) {
                return next.first;
            }
        }
        return null;
    }

    private void sortPassHolderItems() {
        Collections.sort(this.passholderItemList, Ordering.allEqual().nullsLast().compound(new Comparator<SerializablePair<UserDataContainer, Optional<String>>>() { // from class: com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager.1
            @Override // java.util.Comparator
            public int compare(SerializablePair<UserDataContainer, Optional<String>> serializablePair, SerializablePair<UserDataContainer, Optional<String>> serializablePair2) {
                int iCompare = Ordering.allEqual().nullsLast().compare(serializablePair.first.getSwid(), serializablePair2.first.getSwid());
                if (iCompare != 0) {
                    return iCompare;
                }
                boolean zM68660a = C22459j.m68660a(ApPassHolderDemographicDataManager.this.purchaseSwid, serializablePair.first.getSwid());
                boolean zM68660a2 = C22459j.m68660a(ApPassHolderDemographicDataManager.this.purchaseSwid, serializablePair2.first.getSwid());
                int i10 = 0;
                if (zM68660a) {
                    if (!zM68660a2) {
                        i10 = -1;
                    }
                } else if (zM68660a2) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    return i10;
                }
                return Ordering.natural().nullsLast().compare(ApUtils.buildStringName(serializablePair.first.getPersonName()), ApUtils.buildStringName(serializablePair2.first.getPersonName()));
            }
        }));
    }

    public int getGuestNumber(String str) {
        return this.userDataContainerToGuestNumberMap.get(getUserDataContainerFromAssignedEntitlementId(str)).intValue();
    }

    public UserData getMasterUserData() {
        return this.masterUser.getUserDataFromContainer();
    }

    public ArrayList<SerializablePair<UserDataContainer, Optional<String>>> getPassholderItemList() {
        return this.passholderItemList;
    }

    public UserDataContainer getUserDataContainerFromAssignedEntitlementId(String str) {
        return this.assignedEntitlementIdToUserDataContainerMap.get(str);
    }

    public UserData getUserDataFromProfileData() {
        UserDataContainer userDataContainerBuild = new UserDataContainer.UserDataContainerBuilder().build();
        Profile profile = this.profile;
        if (profile != null) {
            fillName(userDataContainerBuild, profile.getName());
            fillAddress(userDataContainerBuild, this.profile);
            fillBirthDate(userDataContainerBuild, this.profile);
            userDataContainerBuild.setPhone(this.profile.getMobilePhone() != null ? this.profile.getMobilePhone() : this.profile.getHomePhone());
            userDataContainerBuild.setEmail(this.profile.getEmail());
        }
        return userDataContainerBuild.getUserDataFromContainer();
    }

    public WebStoreId getWebStoreId() {
        return this.webStoreId;
    }

    public boolean hasDemographicDataForAllGuests() {
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayList = this.passholderItemList;
        if (arrayList == null) {
            return false;
        }
        Iterator<SerializablePair<UserDataContainer, Optional<String>>> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!it.next().first.getUserDataFromContainer().isUserDemographicDataAvailable()) {
                return false;
            }
        }
        return true;
    }

    public boolean hasDuplicateDemographicBasicInfo() {
        ArrayList<SerializablePair<UserDataContainer, Optional<String>>> passholderItemList = getPassholderItemList();
        if (passholderItemList == null) {
            return false;
        }
        HashSet hashSetM69460g = Sets.m69460g();
        Iterator<SerializablePair<UserDataContainer, Optional<String>>> it = passholderItemList.iterator();
        while (it.hasNext()) {
            SerializablePair<UserDataContainer, Optional<String>> next = it.next();
            UserDataContainer userDataContainer = next.first;
            String strMo68585or = next.second.mo68585or((Optional<String>) "");
            if (!userDataContainer.getUserDataFromContainer().isUserDemographicDataAvailable()) {
                return false;
            }
            if (!hashSetM69460g.add(new DemographicBasicInfo(strMo68585or, userDataContainer.getPersonName(), ApUtils.buildStringBirthDate(userDataContainer.getBirthDate())))) {
                return true;
            }
        }
        return false;
    }

    public boolean isMasterUser(String str) {
        return str.equals(this.masterUser.getassignedEntitlementId());
    }

    public boolean isNameFieldNotEditable(NameFields nameFields, String str) {
        return this.nameFieldsToAssignedEntitlementIdsNotEditable.containsEntry(nameFields, str);
    }

    public boolean isUsingMasterData(String str) {
        return this.assignedEntitlementIdsUsingMasterData.contains(str);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataResultHandler
    public void onDataCaptured(DemographicData demographicData, String str) {
        UserDataContainer userDataContainerFromAssignedEntitlementId = getUserDataContainerFromAssignedEntitlementId(str);
        C22462m.m68685q(userDataContainerFromAssignedEntitlementId, "No user data container found corresponding to entitlementId: " + str);
        userDataContainerFromAssignedEntitlementId.setTitle(demographicData.getName().getTitle().get());
        userDataContainerFromAssignedEntitlementId.setFirstName(demographicData.getName().getFirstName().get());
        userDataContainerFromAssignedEntitlementId.setLastName(demographicData.getName().getLastName().get());
        String str2 = this.titleToGenderMap.get(demographicData.getName().getTitle().get());
        C22462m.m68685q(str2, "No Gender found corresponding to title: " + demographicData.getName().getTitle());
        userDataContainerFromAssignedEntitlementId.setGender(str2);
        userDataContainerFromAssignedEntitlementId.setBirthDate(demographicData.getBirthDate());
        userDataContainerFromAssignedEntitlementId.setAddress(demographicData.getAddress());
        Phone phone = userDataContainerFromAssignedEntitlementId.getUserDataFromContainer().getPhone();
        userDataContainerFromAssignedEntitlementId.setPhone(phone == null ? new Phone(demographicData.getPhone().getId(), demographicData.getPhone().getNumber(), demographicData.getPhone().getType(), demographicData.getPhone().getIsPreferred()) : new Phone(phone.getId(), demographicData.getPhone().getNumber(), phone.getType(), phone.getIsPreferred()));
        userDataContainerFromAssignedEntitlementId.setEmail(demographicData.getEmail());
        if (isMasterUser(str)) {
            onMasterUserDataUpdated();
        } else {
            setUseMasterData(str, demographicData.isUsingMasterData());
        }
    }

    public void onMasterUserDataUpdated() {
        Iterator<String> it = this.assignedEntitlementIdsUsingMasterData.iterator();
        while (it.hasNext()) {
            UserDataContainer userDataContainerFromAssignedEntitlementId = getUserDataContainerFromAssignedEntitlementId(it.next());
            userDataContainerFromAssignedEntitlementId.setAddress(this.masterUser.getAddresses().get(0));
            userDataContainerFromAssignedEntitlementId.setPhone(this.masterUser.getPhones().get(0));
            userDataContainerFromAssignedEntitlementId.setEmail(this.masterUser.getEmail());
        }
    }

    public void setPassholderItemList(ArrayList<SerializablePair<UserDataContainer, Optional<String>>> arrayList, String str, WebStoreId webStoreId, Map<String, String> map, Optional<HashMap<String, PersonName>> optional) {
        this.passholderItemList = arrayList;
        this.purchaseSwid = str;
        this.webStoreId = webStoreId;
        this.titleToGenderMap = map;
        this.assignedEntitlementIdsUsingMasterData = Sets.m69460g();
        this.nameFieldsToAssignedEntitlementIdsNotEditable = HashMultimap.create();
        if (optional.isPresent()) {
            addNamesFromTicketItems(optional.get());
        }
        sortPassHolderItems();
        this.assignedEntitlementIdToUserDataContainerMap = Maps.m69381r();
        this.userDataContainerToGuestNumberMap = Maps.m69381r();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            SerializablePair<UserDataContainer, Optional<String>> serializablePair = arrayList.get(i10);
            this.assignedEntitlementIdToUserDataContainerMap.put(serializablePair.first.getassignedEntitlementId(), serializablePair.first);
            i10++;
            this.userDataContainerToGuestNumberMap.put(serializablePair.first, Integer.valueOf(i10));
        }
        this.masterUser = getMasterUser();
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setUseMasterData(String str, boolean z10) {
        if (z10) {
            this.assignedEntitlementIdsUsingMasterData.add(str);
        } else {
            this.assignedEntitlementIdsUsingMasterData.remove(str);
        }
    }
}