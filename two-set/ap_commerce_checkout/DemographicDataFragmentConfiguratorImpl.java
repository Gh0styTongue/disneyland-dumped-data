package com.disney.wdpro.ap_commerce_checkout;

import android.content.Context;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserData;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DemographicData;
import com.disney.wdpro.ticket_sales_base_lib.utils.DateUtils;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import java.util.Calendar;

/* loaded from: classes23.dex */
public class DemographicDataFragmentConfiguratorImpl implements APDemographicInfoFragment.DemographicDataFragmentConfigurator {
    private final ApPassHolderDemographicDataManager apPassHolderDemographicDataManager;
    private final Context context;
    private final C9350r time;

    public DemographicDataFragmentConfiguratorImpl(Context context, ApPassHolderDemographicDataManager apPassHolderDemographicDataManager, C9350r c9350r) {
        this.apPassHolderDemographicDataManager = apPassHolderDemographicDataManager;
        this.time = c9350r;
        this.context = context;
    }

    private UserDataContainer getUserDataContainer(String str) {
        UserDataContainer userDataContainerFromAssignedEntitlementId = this.apPassHolderDemographicDataManager.getUserDataContainerFromAssignedEntitlementId(str);
        C22462m.m68691w(userDataContainerFromAssignedEntitlementId != null, "Guest in memory id doest not correspond to any user.");
        return userDataContainerFromAssignedEntitlementId;
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public Optional<AffiliationType> getAffiliationType(String str) {
        return getUserDataContainer(str).getAffiliationType();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public DemographicData getMasterData() {
        UserData masterUserData = this.apPassHolderDemographicDataManager.getMasterUserData();
        DemographicData.DemographicDataBuilder demographicDataBuilderWithAddress = DemographicData.DemographicDataBuilder.getInstance().withName(masterUserData.getName()).withPhone(masterUserData.getPhone()).withAddress(masterUserData.getAddress());
        if (masterUserData.getEmail().isPresent()) {
            demographicDataBuilderWithAddress.withEmail(masterUserData.getEmail().get());
        }
        return demographicDataBuilderWithAddress.build();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public DemographicData getPrePopulateDemographicData(String str) {
        UserData userDataFromContainer = getUserDataContainer(str).getUserDataFromContainer();
        DemographicData.DemographicDataBuilder demographicDataBuilder = DemographicData.DemographicDataBuilder.getInstance();
        demographicDataBuilder.withName(userDataFromContainer.getName());
        if (userDataFromContainer.getBirthdate().isPresent()) {
            demographicDataBuilder.withBirthdate(userDataFromContainer.getBirthdate().get());
        }
        if (this.apPassHolderDemographicDataManager.isMasterUser(str) && !userDataFromContainer.isUserDemographicDataAvailable()) {
            userDataFromContainer = this.apPassHolderDemographicDataManager.getUserDataFromProfileData();
        }
        demographicDataBuilder.withAddress(userDataFromContainer.getAddress());
        demographicDataBuilder.withPhone(userDataFromContainer.getPhone());
        if (userDataFromContainer.getEmail().isPresent()) {
            demographicDataBuilder.withEmail(userDataFromContainer.getEmail().get());
        }
        demographicDataBuilder.withShouldUseMasterData(this.apPassHolderDemographicDataManager.isUsingMasterData(str));
        return demographicDataBuilder.build();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public Optional<String> getRegionRestrictedStateCode(String str) {
        UserDataContainer userDataContainer = getUserDataContainer(str);
        return !userDataContainer.isStateEnforcementApplied() ? Optional.absent() : Optional.m68592of(userDataContainer.getAffiliationType().get().getStateOrProvinceCode());
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public Optional<String> getSubTitle(String str) {
        return Optional.m68592of(String.format(this.context.getString(C8689R.string.subtitle), Integer.valueOf(this.apPassHolderDemographicDataManager.getGuestNumber(str)), getUserDataContainer(str).getAgeGroup() == AgeGroup.CHILD ? this.context.getString(C8689R.string.child_subtitle) : this.context.getString(C8689R.string.adult_subtitle)));
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public WebStoreId getWebStoreId() {
        return this.apPassHolderDemographicDataManager.getWebStoreId();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean isFirstNameEditable(String str) {
        return !this.apPassHolderDemographicDataManager.isNameFieldNotEditable(ApPassHolderDemographicDataManager.NameFields.FIRST_NAME, str);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean isLastNameEditable(String str) {
        return !this.apPassHolderDemographicDataManager.isNameFieldNotEditable(ApPassHolderDemographicDataManager.NameFields.LAST_NAME, str);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean isPhoneEmailApplicable(Calendar calendar, String str) {
        if (calendar == null) {
            return false;
        }
        return DateUtils.isRequiredAge(calendar, 18);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean isSyncMaster(String str) {
        return this.apPassHolderDemographicDataManager.isUsingMasterData(str);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean isTitleEditable(String str) {
        return !this.apPassHolderDemographicDataManager.isNameFieldNotEditable(ApPassHolderDemographicDataManager.NameFields.TITLE, str);
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public void setUserDataContainer(UserDataContainer userDataContainer) {
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean showSyncMasterCheckbox(String str) {
        if (this.apPassHolderDemographicDataManager.isMasterUser(str)) {
            return false;
        }
        return this.apPassHolderDemographicDataManager.getMasterUserData().isUserDemographicDataAvailable();
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.DemographicDataFragmentConfigurator
    public boolean validateAge(Calendar calendar, String str) {
        if (calendar == null) {
            return false;
        }
        UserDataContainer userDataContainer = getUserDataContainer(str);
        Calendar calendarM39090h = this.time.m39090h();
        int i10 = calendarM39090h.get(1) - calendar.get(1);
        if (calendarM39090h.get(6) < calendar.get(6)) {
            i10--;
        }
        AgeGroup ageGroup = userDataContainer.getAgeGroup();
        return i10 >= ageGroup.getMinAge().intValue() && i10 <= ageGroup.getMaxAge().intValue();
    }
}