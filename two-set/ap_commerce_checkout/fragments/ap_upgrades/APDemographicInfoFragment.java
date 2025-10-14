package com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.ApPassHolderDemographicDataManager;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.views.APRegistrationAddressFormView;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.base_sales_ui_lib.interfaces.BaseSalesActions;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.profile_ui.p421ui.input.CanadaProvincePickerTextField;
import com.disney.wdpro.profile_ui.p421ui.input.CountryPickerTextField;
import com.disney.wdpro.profile_ui.p421ui.input.StatePickerTextField;
import com.disney.wdpro.profile_ui.p421ui.views.AddressFormView;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.input.AbstractFloatLabelTextField;
import com.disney.wdpro.support.input.DatePickerTextField;
import com.disney.wdpro.support.input.FloatLabelTextField;
import com.disney.wdpro.support.input.PickerTextField;
import com.disney.wdpro.support.input.filter.C20831d;
import com.disney.wdpro.support.input.validation.C20845d;
import com.disney.wdpro.support.input.validation.C20847f;
import com.disney.wdpro.support.input.validation.InterfaceC20846e;
import com.disney.wdpro.support.international_phone_numbers.InternationalPhoneNumbersView;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.support.util.C20949r;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AffiliationType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DemographicData;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes23.dex */
public class APDemographicInfoFragment extends SalesBaseFragment {
    private static final int ADDRESS_MAX_LENGTH = 30;
    private static final float CERO_POINT_FOUR = 0.4f;
    private static final String EMPTY_STRING = "";
    private static final int FIRST_LAST_NAME_MAX_LENGTH = 35;
    private static final boolean IS_TRANSACTIONAL = true;
    private static final String KEY_ADDRESS_NOT_PRE_POPULATED = "key.default.address.notprepopulated";
    private static final String KEY_ASSIGNED_ENTITLEMENT_ID = "key.assigned.entitlement.id";
    private static final String KEY_DEFAULT_BIRTHDATE = "key.default.birthdate";
    private static final String KEY_NAME_TITLES = "key.name.titles";
    private static final int MAX_FILTER_ADDRESS = 30;
    private static final int MAX_FILTER_CITY = 28;
    private static final int MAX_FILTER_ZIP = 6;
    private static final boolean RETRY_ALLOWED = true;
    private static final String UNITED_STATES = "United States";

    /* renamed from: US */
    private static final String f29259US = "US";
    private static final String USER_DATA_CONTAINER = "key.default.birthdate.userdatacontainer";
    private DemographicDataFragmentActions actionListener;
    private APRegistrationAddressFormView addressFormView;
    private Button btnAddGuest;
    private CheckBox checkboxUseMasterUserData;
    private DemographicDataFragmentConfigurator configurator;
    private FloatLabelTextField countyTextField;
    private String defaultBirthDate;
    private FormCopySectionChangeListener formCopySectionChangeListener;
    private FormTextWatcher formTextWatcher;
    private String guestAssignedEntitlementId;
    private InternationalPhoneNumbersView internationalPhoneNumbersView;
    private boolean isAddressNotPrePopulated;
    private String[] nameTitles;
    private DatePickerTextField pickerBirthday;
    private DemographicDataResultHandler resultHandler;
    private TextView subTitle;
    private FloatLabelTextField textAddressLine1;
    private FloatLabelTextField textAddressLine2;
    private FloatLabelTextField textAddressLine3;
    private CanadaProvincePickerTextField textCanadaProvince;
    private FloatLabelTextField textCity;
    private CountryPickerTextField textCountry;
    private FloatLabelTextField textEmail;
    private FloatLabelTextField textFirstName;
    private FloatLabelTextField textLastName;
    private FloatLabelTextField textPhone;
    private StatePickerTextField textState;
    private FloatLabelTextField textTerritory;
    private FloatLabelTextField textZip;
    private boolean userEditedThePage;
    private DemographicData validatedDemographicData;
    private DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.1
        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            APDemographicInfoFragment.this.userEditedThePage = true;
            if (!APDemographicInfoFragment.this.pickerBirthday.validate()) {
                APDemographicInfoFragment aPDemographicInfoFragment = APDemographicInfoFragment.this;
                aPDemographicInfoFragment.showAlert(null, aPDemographicInfoFragment.getString(C8689R.string.ap_commerce_demographic_info_fragment_birth_date_error_msg), false, false, APDemographicInfoFragment.this.getString(C8689R.string.common_ok), null, null);
            }
            APDemographicInfoFragment.this.setUiState();
        }
    };
    private View.OnClickListener saveUserInput = new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            APDemographicInfoFragment aPDemographicInfoFragment = APDemographicInfoFragment.this;
            if (aPDemographicInfoFragment.validateTextSize(30, aPDemographicInfoFragment.textAddressLine1, APDemographicInfoFragment.this.textAddressLine2, APDemographicInfoFragment.this.textAddressLine3)) {
                DemographicData.DemographicDataBuilder demographicDataBuilder = DemographicData.DemographicDataBuilder.getInstance();
                demographicDataBuilder.withName(new PersonName(CheckoutConstants.GENERIC_TITLE, APDemographicInfoFragment.this.textFirstName.getText(), (String) null, APDemographicInfoFragment.this.textLastName.getText(), (String) null)).withBirthdate(APDemographicInfoFragment.this.getCalenderFromDatePicker()).withAddress(APDemographicInfoFragment.this.addressFormView.getCurrentAddressInput("BILLING")).withEmail(APDemographicInfoFragment.this.shouldEnablePhoneEmail() ? APDemographicInfoFragment.this.textEmail.getText() : "").withPhone(new Phone("", APDemographicInfoFragment.this.shouldEnablePhoneEmail() ? APDemographicInfoFragment.this.textPhone.getText() : "", Phone.TYPE_HOME, Boolean.TRUE)).withShouldUseMasterData(APDemographicInfoFragment.this.configurator != null && APDemographicInfoFragment.this.checkboxUseMasterUserData.isChecked());
                APDemographicInfoFragment.this.validatedDemographicData = demographicDataBuilder.build();
                APDemographicInfoFragment.this.onAddGuestClick();
                return;
            }
            String string = APDemographicInfoFragment.this.getString(C8689R.string.addresses_character_limit_error_message);
            if (APDemographicInfoFragment.this.textAddressLine3.isShown()) {
                string = APDemographicInfoFragment.this.getString(C8689R.string.addresses_character_limit_error_message_line3_visible);
            }
            Banner.m62482g(string, APDemographicInfoFragment.this.getActivity()).m62517y();
        }
    };
    private final CompoundButton.OnCheckedChangeListener useMasterDataCheckboxListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.3
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                APDemographicInfoFragment.this.setCopySectionTextWatchers(false);
                DemographicData masterData = APDemographicInfoFragment.this.configurator.getMasterData();
                APDemographicInfoFragment.this.fillAddress(masterData.getAddress());
                APDemographicInfoFragment.this.setStateOrProvince(masterData.getAddress());
                APDemographicInfoFragment.this.addressFormView.setBillingPhone(masterData.getPhone() != null ? masterData.getPhone().getNumber() : "");
                APDemographicInfoFragment.this.textEmail.setText(C22466q.m68725e(masterData.getEmail()));
                APDemographicInfoFragment.this.setCopySectionTextWatchers(true);
            }
            APDemographicInfoFragment.this.setAddressFormAccessibility(z10);
            APDemographicInfoFragment.this.userEditedThePage = true;
            APDemographicInfoFragment.this.setUiState();
        }
    };

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment$4 */
    static /* synthetic */ class C87314 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ap_commerce_checkout$ApPassHolderDemographicDataManager$NameFields */
        static final /* synthetic */ int[] f29260x29087225;

        static {
            int[] iArr = new int[ApPassHolderDemographicDataManager.NameFields.values().length];
            f29260x29087225 = iArr;
            try {
                iArr[ApPassHolderDemographicDataManager.NameFields.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29260x29087225[ApPassHolderDemographicDataManager.NameFields.LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class APDemographicInfoArgumentBuilder {
        private String assignedEntitlementId;
        private String defaultBirthday;
        private boolean isAddressNotPrePopulated;
        private String[] titles;
        private UserDataContainer userDataContainer;

        public static APDemographicInfoArgumentBuilder createInstance() {
            return new APDemographicInfoArgumentBuilder();
        }

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putString(APDemographicInfoFragment.KEY_ASSIGNED_ENTITLEMENT_ID, this.assignedEntitlementId);
            bundle.putStringArray(APDemographicInfoFragment.KEY_NAME_TITLES, this.titles);
            bundle.putString(APDemographicInfoFragment.KEY_DEFAULT_BIRTHDATE, this.defaultBirthday);
            bundle.putSerializable(APDemographicInfoFragment.USER_DATA_CONTAINER, this.userDataContainer);
            bundle.putBoolean(APDemographicInfoFragment.KEY_ADDRESS_NOT_PRE_POPULATED, this.isAddressNotPrePopulated);
            return bundle;
        }

        public APDemographicInfoArgumentBuilder withAddressNotPrePopulated(boolean z10) {
            this.isAddressNotPrePopulated = z10;
            return this;
        }

        public APDemographicInfoArgumentBuilder withAssignedEntitlementId(String str) {
            this.assignedEntitlementId = str;
            return this;
        }

        public APDemographicInfoArgumentBuilder withDefaultBirthdate(String str) {
            this.defaultBirthday = str;
            return this;
        }

        public APDemographicInfoArgumentBuilder withNameTitles(String[] strArr) {
            this.titles = strArr;
            return this;
        }

        public APDemographicInfoArgumentBuilder withUserDataContainer(UserDataContainer userDataContainer) {
            this.userDataContainer = userDataContainer;
            return this;
        }
    }

    public interface DemographicDataFragmentActions extends BaseSalesActions {
        DemographicDataFragmentConfigurator getFragmentConfigurator();

        DemographicDataResultHandler getResultHandler();
    }

    public interface DemographicDataFragmentConfigurator {
        Optional<AffiliationType> getAffiliationType(String str);

        DemographicData getMasterData();

        DemographicData getPrePopulateDemographicData(String str);

        Optional<String> getRegionRestrictedStateCode(String str);

        Optional<String> getSubTitle(String str);

        WebStoreId getWebStoreId();

        boolean isFirstNameEditable(String str);

        boolean isLastNameEditable(String str);

        boolean isPhoneEmailApplicable(Calendar calendar, String str);

        boolean isSyncMaster(String str);

        boolean isTitleEditable(String str);

        void setUserDataContainer(UserDataContainer userDataContainer);

        boolean showSyncMasterCheckbox(String str);

        boolean validateAge(Calendar calendar, String str);
    }

    public interface DemographicDataResultHandler {
        void onDataCaptured(DemographicData demographicData, String str);
    }

    private final class FormCopySectionChangeListener extends FormTextWatcher implements AddressFormView.AddressFormChangeListener {
        @Override // com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.APDemographicInfoFragment.FormTextWatcher, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            APDemographicInfoFragment.this.checkboxUseMasterUserData.setChecked(false);
            super.afterTextChanged(editable);
        }

        @Override // com.disney.wdpro.profile_ui.ui.views.AddressFormView.AddressFormChangeListener
        public void onAddressChanged(boolean z10) {
            APDemographicInfoFragment.this.checkboxUseMasterUserData.setChecked(false);
            super.afterTextChanged(null);
        }

        private FormCopySectionChangeListener() {
            super();
        }
    }

    private class FormTextWatcher implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            APDemographicInfoFragment.this.userEditedThePage = true;
            APDemographicInfoFragment.this.setUiState();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        private FormTextWatcher() {
        }
    }

    public APDemographicInfoFragment() {
        this.formCopySectionChangeListener = new FormCopySectionChangeListener();
        this.formTextWatcher = new FormTextWatcher();
    }

    private void addTextChangedListener(EditText editText) {
        if (editText.getVisibility() == 0) {
            editText.addTextChangedListener(this.formCopySectionChangeListener);
        } else {
            editText.removeTextChangedListener(this.formCopySectionChangeListener);
        }
    }

    private String appendAsterisk(String str) {
        return str.replace("*", "") + "*";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillAddress(Address address) {
        if (address != null) {
            this.addressFormView.populateWithExistingAddress(address, null);
        }
    }

    private void fillNameField(PersonName personName, ApPassHolderDemographicDataManager.NameFields nameFields) {
        int i10 = C87314.f29260x29087225[nameFields.ordinal()];
        if (i10 == 1) {
            this.textFirstName.setText(personName.getFirstName().isPresent() ? personName.getFirstName().get() : "");
        } else {
            if (i10 != 2) {
                return;
            }
            this.textLastName.setText(personName.getLastName().isPresent() ? personName.getLastName().get() : "");
        }
    }

    private String getButtonText() {
        return isFormCompleted() ? getString(C8689R.string.ticket_sales_demographic_info_fragment_add_guest_button_edit) : getString(C8689R.string.ticket_sales_demographic_info_fragment_add_guest_button_add);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Calendar getCalenderFromDatePicker() {
        if (!hasText(this.pickerBirthday)) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.pickerBirthday.getDatePickerDialog().getDatePicker().getYear(), this.pickerBirthday.getDatePickerDialog().getDatePicker().getMonth(), this.pickerBirthday.getDatePickerDialog().getDatePicker().getDayOfMonth());
        return calendar;
    }

    private boolean hasText(AbstractFloatLabelTextField abstractFloatLabelTextField) {
        return !C22466q.m68722b(abstractFloatLabelTextField.getEditText().getText().toString());
    }

    private boolean isFormCompleted() {
        return this.userEditedThePage && hasText(this.textFirstName) && hasText(this.textLastName) && validateTextSize(35, this.textFirstName, this.textLastName) && this.pickerBirthday.isValid() && validateAddress() && validatePhoneAndEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(Object obj) {
        this.textTerritory.setEmptyAllowed(false);
        this.countyTextField.setEmptyAllowed(false);
        this.textCanadaProvince.setEmptyAllowed(false);
        this.textState.setEmptyAllowed(false);
        addTextChangedListener(this.textTerritory.getEditText());
        addTextChangedListener(this.countyTextField.getEditText());
        addTextChangedListener(this.textCanadaProvince.getEditText());
        addTextChangedListener(this.textState.getEditText());
        if (this.textCountry.getText().toString().equals(UNITED_STATES)) {
            this.textZip.getEditText().setInputType(2);
        } else {
            this.textAddressLine3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view, boolean z10) {
        if (z10 || this.pickerBirthday.isValid()) {
            return;
        }
        this.pickerBirthday.showOneTimeError(getString(C8689R.string.ap_commerce_date_of_birth_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(DialogInterface dialogInterface) {
        this.pickerBirthday.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreateView$3(String str) {
        Calendar calenderFromDatePicker;
        if (str.isEmpty() || (calenderFromDatePicker = getCalenderFromDatePicker()) == null) {
            return false;
        }
        DemographicDataFragmentConfigurator demographicDataFragmentConfigurator = this.configurator;
        if (demographicDataFragmentConfigurator == null) {
            return true;
        }
        return demographicDataFragmentConfigurator.validateAge(calenderFromDatePicker, this.guestAssignedEntitlementId);
    }

    public static APDemographicInfoFragment newInstance(String str, String[] strArr, String str2, UserDataContainer userDataContainer) {
        APDemographicInfoFragment aPDemographicInfoFragment = new APDemographicInfoFragment();
        aPDemographicInfoFragment.setArguments(APDemographicInfoArgumentBuilder.createInstance().withAssignedEntitlementId(str).withDefaultBirthdate(str2).withNameTitles(strArr).withUserDataContainer(userDataContainer).build());
        return aPDemographicInfoFragment;
    }

    private void prefillDemographicData() {
        DemographicDataFragmentConfigurator demographicDataFragmentConfigurator = this.configurator;
        if (demographicDataFragmentConfigurator == null) {
            return;
        }
        this.userEditedThePage = true;
        if (demographicDataFragmentConfigurator.getSubTitle(this.guestAssignedEntitlementId).isPresent()) {
            this.subTitle.setVisibility(0);
            this.subTitle.setText(this.configurator.getSubTitle(this.guestAssignedEntitlementId).get());
            this.subTitle.setContentDescription(this.configurator.getSubTitle(this.guestAssignedEntitlementId).get().replace(getString(C8689R.string.child_subtitle), getString(C8689R.string.ap_commerce_demographic_child_subtitle)));
        }
        DemographicData prePopulateDemographicData = this.configurator.getPrePopulateDemographicData(this.guestAssignedEntitlementId);
        if (prePopulateDemographicData != null) {
            fillNameField(prePopulateDemographicData.getName(), ApPassHolderDemographicDataManager.NameFields.TITLE);
            fillNameField(prePopulateDemographicData.getName(), ApPassHolderDemographicDataManager.NameFields.FIRST_NAME);
            fillNameField(prePopulateDemographicData.getName(), ApPassHolderDemographicDataManager.NameFields.LAST_NAME);
            if (prePopulateDemographicData.getBirthDate() != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(prePopulateDemographicData.getBirthDate().getTime());
                this.pickerBirthday.m62932x(calendar);
            } else {
                setDefaultPickerDate();
            }
            fillAddress(prePopulateDemographicData.getAddress());
            if (this.isAddressNotPrePopulated) {
                this.textAddressLine1.setText("");
                this.textAddressLine2.setText("");
                this.textCity.setText("");
                this.textState.setText("");
                this.textZip.setText("");
            }
            Phone phone = prePopulateDemographicData.getPhone();
            this.addressFormView.setBillingPhone(phone != null ? phone.getNumber() : "");
            this.textEmail.setText(C22466q.m68725e(prePopulateDemographicData.getEmail()));
        }
        setStateOrProvince(null);
        this.textFirstName.setEnabled(this.configurator.isFirstNameEditable(this.guestAssignedEntitlementId));
        this.textLastName.setEnabled(this.configurator.isLastNameEditable(this.guestAssignedEntitlementId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressFormAccessibility(boolean z10) {
        if (C20932b.m63194q(getContext()).m63205v()) {
            this.textCountry.setEnabled(!z10);
            this.textAddressLine1.setEnabled(!z10);
            this.textAddressLine2.setEnabled(!z10);
            this.textAddressLine3.setEnabled(!z10);
            this.textCity.setEnabled(!z10);
            this.textState.setEnabled(!z10);
            this.textZip.setEnabled(!z10);
            this.addressFormView.setAlpha(z10 ? CERO_POINT_FOUR : 1.0f);
            this.addressFormView.updateViewsForAccessibility(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopySectionTextWatchers(boolean z10) {
        if (z10) {
            this.addressFormView.setAddressChangeListener(this.formCopySectionChangeListener);
            this.textEmail.getEditText().addTextChangedListener(this.formCopySectionChangeListener);
        } else {
            this.addressFormView.setAddressChangeListener(null);
            this.textEmail.getEditText().removeTextChangedListener(this.formCopySectionChangeListener);
        }
    }

    private void setDefaultPickerDate() {
        if (this.defaultBirthDate == null) {
            return;
        }
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new SimpleDateFormat(getString(C8689R.string.register_calendar_default_date_format), Locale.ENGLISH).parse(this.defaultBirthDate));
            this.pickerBirthday.setDefaultDate(calendar);
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateOrProvince(Address address) {
        if (this.configurator == null) {
            return;
        }
        Address.AddressBuilder addressBuilder = address != null ? new Address.AddressBuilder(address) : new Address.AddressBuilder();
        Optional<String> regionRestrictedStateCode = this.configurator.getRegionRestrictedStateCode(this.guestAssignedEntitlementId);
        if (regionRestrictedStateCode.isPresent()) {
            addressBuilder.setStateOrProvince(regionRestrictedStateCode.get());
            if (this.configurator.getAffiliationType(this.guestAssignedEntitlementId).isPresent()) {
                AffiliationType affiliationType = this.configurator.getAffiliationType(this.guestAssignedEntitlementId).get();
                if (AffiliationType.FL_RESIDENT.getId().equals(affiliationType.getId()) || AffiliationType.SOCAL_RESIDENT.getId().equals(affiliationType.getId()) || AffiliationType.CAL_RESIDENT.getId().equals(affiliationType.getId())) {
                    addressBuilder.setCountry("US");
                }
            }
            fillAddress(addressBuilder.build());
            this.textState.setEnabled(false);
            this.textCountry.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiState() {
        this.textPhone.setVisibility(shouldEnablePhoneEmail() ? 0 : 8);
        this.textEmail.setVisibility(shouldEnablePhoneEmail() ? 0 : 8);
        this.internationalPhoneNumbersView.m62957h(shouldEnablePhoneEmail());
        this.textFirstName.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_first_name));
        this.textLastName.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_last_name));
        if (!validateTextSize(35, this.textFirstName, this.textLastName) && this.textFirstName.hasFocus()) {
            this.textFirstName.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_exceeded_limit));
            this.textFirstName.showNotValid(true);
        }
        if (!validateTextSize(35, this.textFirstName, this.textLastName) && this.textLastName.hasFocus()) {
            this.textLastName.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_exceeded_limit));
            this.textLastName.showNotValid(true);
        }
        this.btnAddGuest.setEnabled(isFormCompleted());
        if (!isFormCompleted()) {
            this.btnAddGuest.setContentDescription(getString(C8689R.string.ap_commerce_demographic_guest_disabled_button));
        } else {
            Button button = this.btnAddGuest;
            button.setContentDescription(button.getText());
        }
    }

    private void setValidationMessages() {
        this.textAddressLine1.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_address_line1));
        this.textAddressLine2.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_address_line1));
        this.textAddressLine3.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_address_line1));
        this.textCity.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_error_city));
        this.textState.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_select_your_state));
        this.textCanadaProvince.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_select_your_province));
        this.textZip.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_valid_zip));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldEnablePhoneEmail() {
        DemographicDataFragmentConfigurator demographicDataFragmentConfigurator = this.configurator;
        if (demographicDataFragmentConfigurator == null) {
            return true;
        }
        return demographicDataFragmentConfigurator.isPhoneEmailApplicable(getCalenderFromDatePicker(), this.guestAssignedEntitlementId);
    }

    private boolean validateAddress() {
        return this.textAddressLine1.validate() && this.textAddressLine2.validate() && this.textAddressLine3.validate() && this.textCity.validate() && this.textZip.validate() && validateStateTerritoryProvinceCounty();
    }

    private boolean validatePhoneAndEmail() {
        if (shouldEnablePhoneEmail()) {
            return this.textEmail.isValid() && this.textPhone.isValid();
        }
        return true;
    }

    private boolean validateStateTerritoryProvinceCounty() {
        return this.textTerritory.getVisibility() == 0 ? this.textTerritory.isValid() : this.countyTextField.getVisibility() == 0 ? this.countyTextField.isValid() : this.textCanadaProvince.getVisibility() == 0 ? this.textCanadaProvince.isValid() : this.textState.isValid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean validateTextSize(int i10, FloatLabelTextField... floatLabelTextFieldArr) {
        int length = 0;
        for (FloatLabelTextField floatLabelTextField : Arrays.asList(floatLabelTextFieldArr)) {
            if (floatLabelTextField.getText() != null) {
                length += floatLabelTextField.getText().length();
            }
        }
        return length <= i10;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return null;
    }

    protected String getGuestAssignedEntitlementId() {
        return this.guestAssignedEntitlementId;
    }

    protected DemographicDataResultHandler getResultHandler() {
        return this.resultHandler;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment
    protected CharSequence getTitle() {
        return isFormCompleted() ? getString(C8689R.string.ticket_sales_demographic_info_fragment_title_edit) : getString(C8689R.string.ticket_sales_demographic_info_fragment_title_add);
    }

    protected DemographicData getValidatedDemographicData() {
        return this.validatedDemographicData;
    }

    protected void navigateStepBack() {
        C20949r.m63299c(this.btnAddGuest);
        this.actionListener.navigateOneStepBack();
    }

    protected void onAddGuestClick() {
        this.resultHandler.onDataCaptured(this.validatedDemographicData, this.guestAssignedEntitlementId);
        navigateStepBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        UserDataContainer userDataContainer;
        super.onAttach(activity);
        try {
            DemographicDataFragmentActions demographicDataFragmentActions = (DemographicDataFragmentActions) activity;
            this.actionListener = demographicDataFragmentActions;
            DemographicDataResultHandler resultHandler = demographicDataFragmentActions.getResultHandler();
            this.resultHandler = resultHandler;
            C22462m.m68685q(resultHandler, "DemographicInfoFragment instantiated without a result handler.");
            this.configurator = this.actionListener.getFragmentConfigurator();
            if (getArguments() == null || (userDataContainer = (UserDataContainer) getArguments().getSerializable(USER_DATA_CONTAINER)) == null) {
                return;
            }
            this.configurator.setUserDataContainer(userDataContainer);
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.getClass().getName() + " must implement " + DemographicDataFragmentActions.class.getSimpleName());
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.guestAssignedEntitlementId = arguments.getString(KEY_ASSIGNED_ENTITLEMENT_ID);
            this.nameTitles = arguments.getStringArray(KEY_NAME_TITLES);
            this.defaultBirthDate = arguments.getString(KEY_DEFAULT_BIRTHDATE);
            this.isAddressNotPrePopulated = arguments.getBoolean(KEY_ADDRESS_NOT_PRE_POPULATED);
        }
        if (this.guestAssignedEntitlementId == null) {
            this.guestAssignedEntitlementId = Integer.toString(-1);
        }
        String[] strArr = this.nameTitles;
        C22462m.m68691w((strArr == null || strArr.length == 0) ? false : true, "You must supply the name titles to use this fragment.");
        DemographicDataFragmentConfigurator demographicDataFragmentConfigurator = this.configurator;
        if (demographicDataFragmentConfigurator != null) {
            this.ticketSalesAnalyticsHelper.initHelper(demographicDataFragmentConfigurator.getWebStoreId());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C8689R.layout.ap_commerce_demographic_info_fragment, viewGroup, false);
        this.subTitle = (TextView) viewInflate.findViewById(C8689R.id.txt_subTitle);
        this.textFirstName = (FloatLabelTextField) viewInflate.findViewById(C8689R.id.first_name_text_field);
        this.textLastName = (FloatLabelTextField) viewInflate.findViewById(C8689R.id.last_name_text_field);
        C20831d c20831d = new C20831d();
        this.textFirstName.addFilter(c20831d);
        this.textLastName.addFilter(c20831d);
        APRegistrationAddressFormView aPRegistrationAddressFormView = (APRegistrationAddressFormView) viewInflate.findViewById(C8689R.id.address_form_view);
        this.addressFormView = aPRegistrationAddressFormView;
        this.textAddressLine1 = (FloatLabelTextField) aPRegistrationAddressFormView.findViewById(C8689R.id.txt_address_line_first);
        this.textAddressLine2 = (FloatLabelTextField) this.addressFormView.findViewById(C8689R.id.txt_address_line_second);
        this.textAddressLine3 = (FloatLabelTextField) this.addressFormView.findViewById(C8689R.id.txt_address_line_third);
        this.textCity = (FloatLabelTextField) this.addressFormView.findViewById(C8689R.id.txt_city);
        StatePickerTextField statePickerTextField = (StatePickerTextField) this.addressFormView.findViewById(C8689R.id.txt_state);
        this.textState = statePickerTextField;
        statePickerTextField.setClearButtonEnable(false);
        this.textCountry = (CountryPickerTextField) this.addressFormView.findViewById(C8689R.id.txt_country);
        this.textZip = (FloatLabelTextField) this.addressFormView.findViewById(C8689R.id.txt_zip);
        CanadaProvincePickerTextField canadaProvincePickerTextField = (CanadaProvincePickerTextField) this.addressFormView.findViewById(C8689R.id.txt_canada_province);
        this.textCanadaProvince = canadaProvincePickerTextField;
        canadaProvincePickerTextField.setClearButtonEnable(false);
        this.textTerritory = (FloatLabelTextField) this.addressFormView.findViewById(C8689R.id.txt_territory);
        this.countyTextField = (FloatLabelTextField) this.addressFormView.findViewById(C8689R.id.txt_county);
        this.internationalPhoneNumbersView = (InternationalPhoneNumbersView) this.addressFormView.findViewById(C8689R.id.international_form_view);
        this.countyTextField.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_accessibility_valid_county));
        this.textTerritory.setErrorMessage(getString(C8689R.string.ap_commerce_demographic_accessibility_error_enter_your_state));
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(6)};
        InputFilter[] inputFilterArr2 = {new InputFilter.LengthFilter(28)};
        InputFilter[] inputFilterArr3 = {new InputFilter.LengthFilter(30)};
        this.textZip.getEditText().setFilters(inputFilterArr);
        this.textCity.getEditText().setFilters(inputFilterArr2);
        this.textAddressLine1.getEditText().setFilters(inputFilterArr3);
        this.textAddressLine2.getEditText().setFilters(inputFilterArr3);
        this.textAddressLine3.getEditText().setFilters(inputFilterArr3);
        setValidationMessages();
        C20847f c20847f = new C20847f();
        this.textCity.addValidator(c20847f);
        this.textState.addValidator(c20847f);
        this.textTerritory.addValidator(c20847f);
        this.countyTextField.addValidator(c20847f);
        this.textCountry.addOnEntryChangeListener(new PickerTextField.InterfaceC20821a() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.a
            @Override // com.disney.wdpro.support.input.PickerTextField.InterfaceC20821a
            public final void onSelectionChanged(Object obj) {
                this.f29261a.lambda$onCreateView$0(obj);
            }
        });
        FloatLabelTextField floatLabelTextField = this.textTerritory;
        floatLabelTextField.setLabel(appendAsterisk(floatLabelTextField.getLabel()));
        FloatLabelTextField floatLabelTextField2 = this.countyTextField;
        floatLabelTextField2.setLabel(appendAsterisk(floatLabelTextField2.getLabel()));
        CanadaProvincePickerTextField canadaProvincePickerTextField2 = this.textCanadaProvince;
        canadaProvincePickerTextField2.setLabel(appendAsterisk(canadaProvincePickerTextField2.getLabel()));
        StatePickerTextField statePickerTextField2 = this.textState;
        statePickerTextField2.setLabel(appendAsterisk(statePickerTextField2.getLabel()));
        DatePickerTextField datePickerTextField = (DatePickerTextField) viewInflate.findViewById(C8689R.id.birthday_picker);
        this.pickerBirthday = datePickerTextField;
        datePickerTextField.setMaxDate(Calendar.getInstance());
        this.pickerBirthday.m62931m(this.onDateSetListener);
        this.pickerBirthday.setClearButtonEnable(false);
        this.pickerBirthday.setIsNotValidShownOnFocus(true);
        this.pickerBirthday.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f29262a.lambda$onCreateView$1(view, z10);
            }
        });
        this.pickerBirthday.getDatePickerDialog().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f29263a.lambda$onCreateView$2(dialogInterface);
            }
        });
        this.checkboxUseMasterUserData = (CheckBox) viewInflate.findViewById(C8689R.id.ap_commerce_contact_and_residence_info_check_box);
        DemographicDataFragmentConfigurator demographicDataFragmentConfigurator = this.configurator;
        if (demographicDataFragmentConfigurator != null && demographicDataFragmentConfigurator.getMasterData() != null && this.configurator.showSyncMasterCheckbox(this.guestAssignedEntitlementId)) {
            this.checkboxUseMasterUserData.setVisibility(0);
            PersonName name = this.configurator.getMasterData().getName();
            C22462m.m68691w(name != null && name.getFirstName().isPresent(), "You must provide master user name and atleasr first name of the master user to user the sync with master checkbox functionality.");
            this.checkboxUseMasterUserData.setText(String.format(getString(C8689R.string.ap_commerce_demographic_info_fragment_same_as_master_user), name.getFirstName().get(), name.getLastName().isPresent() ? name.getLastName().get() : ""));
            this.checkboxUseMasterUserData.setChecked(this.configurator.isSyncMaster(this.guestAssignedEntitlementId));
            this.checkboxUseMasterUserData.setContentDescription(getString(C8689R.string.ap_commerce_demographic_guest_contact_information_checkbox, name.getFirstName().get(), name.getLastName().get()));
            this.checkboxUseMasterUserData.setOnCheckedChangeListener(this.useMasterDataCheckboxListener);
        }
        FloatLabelTextField floatLabelTextField3 = (FloatLabelTextField) viewInflate.findViewById(C8689R.id.fltf_mobile_phone_number);
        this.textPhone = floatLabelTextField3;
        floatLabelTextField3.setEmptyAllowed(false);
        FloatLabelTextField floatLabelTextField4 = (FloatLabelTextField) viewInflate.findViewById(C8689R.id.email_text_field);
        this.textEmail = floatLabelTextField4;
        floatLabelTextField4.addValidator(new C20845d(getString(C8689R.string.regex_china_email)));
        this.textEmail.setErrorMessage(getString(C8689R.string.email_error_message));
        prefillDemographicData();
        this.pickerBirthday.addValidator(new InterfaceC20846e() { // from class: com.disney.wdpro.ap_commerce_checkout.fragments.ap_upgrades.d
            @Override // com.disney.wdpro.support.input.validation.InterfaceC20846e
            public final boolean validate(String str) {
                return this.f29264a.lambda$onCreateView$3(str);
            }
        });
        Button button = (Button) viewInflate.findViewById(C8689R.id.btn_add_guest);
        this.btnAddGuest = button;
        button.setText(getButtonText());
        this.btnAddGuest.setOnClickListener(this.saveUserInput);
        this.textFirstName.getEditText().addTextChangedListener(this.formTextWatcher);
        this.textLastName.getEditText().addTextChangedListener(this.formTextWatcher);
        this.pickerBirthday.getEditText().addTextChangedListener(this.formTextWatcher);
        setCopySectionTextWatchers(true);
        setUiState();
        return viewInflate;
    }
}