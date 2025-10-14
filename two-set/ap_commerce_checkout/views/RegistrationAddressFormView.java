package com.disney.wdpro.ap_commerce_checkout.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.disney.wdpro.profile_ui.p421ui.views.AddressFormView;
import com.disney.wdpro.service.model.Address;
import java.util.Locale;

/* loaded from: classes23.dex */
public class RegistrationAddressFormView extends AddressFormView {
    private OnCountryChangedListener onCountryChangedListener;

    public interface OnCountryChangedListener {
        void onCountryChanged(String str);
    }

    public RegistrationAddressFormView(Context context) {
        this(context, null, 0);
    }

    private String replaceNullWithEmptyString(String str) {
        return (str == null || str.equals("null")) ? "" : str;
    }

    @Override // com.disney.wdpro.profile_ui.p421ui.views.AddressFormView
    protected void onCountryChanged(String str) {
        super.onCountryChanged(str);
        if (Locale.US.getCountry().equalsIgnoreCase(str)) {
            this.addressLineThreeField.setVisibility(8);
        } else if (!this.hideAddressLineThreeField) {
            this.addressLineThreeField.setVisibility(0);
        }
        OnCountryChangedListener onCountryChangedListener = this.onCountryChangedListener;
        if (onCountryChangedListener != null) {
            onCountryChangedListener.onCountryChanged(str);
        }
    }

    @Override // com.disney.wdpro.profile_ui.p421ui.views.AddressFormView
    public void populateWithExistingAddress(Address address, String str) {
        super.populateWithExistingAddress(address, str);
        if (address.getCountry() != null) {
            if (address.getStateOrProvince() != null) {
                Locale locale = Locale.US;
                if (locale.getCountry().equalsIgnoreCase(address.getCountry()) || locale.getISO3Country().equalsIgnoreCase(address.getCountry())) {
                    this.statePickerField.setSelectedStateByCode(address.getStateOrProvince());
                } else if (Locale.CANADA.getCountry().equalsIgnoreCase(address.getCountry())) {
                    this.provincePickerField.setSelectedProvinceByCode(address.getStateOrProvince());
                } else if (Locale.UK.getCountry().equalsIgnoreCase(address.getCountry())) {
                    this.countyField.setText(replaceNullWithEmptyString(address.getStateOrProvince()));
                } else {
                    this.stateOrTerritoryField.setText(replaceNullWithEmptyString(address.getStateOrProvince()));
                }
            }
            this.addressCountryPickerField.setSelectedCountryByCode(address.getCountry());
            onCountryChanged(address.getCountry());
        } else if (!TextUtils.isEmpty(str)) {
            this.addressCountryPickerField.setSelectedCountryByCode(str);
            onCountryChanged(str);
        }
        this.addressLineOneField.setText(replaceNullWithEmptyString(address.getLine1()));
        this.addressLineTwoField.setText(replaceNullWithEmptyString(address.getLine2()));
        this.addressLineThreeField.setText(replaceNullWithEmptyString(address.getLine3()));
        this.zipField.setText(replaceNullWithEmptyString(address.getPostalCode()));
        this.cityField.setText(replaceNullWithEmptyString(address.getCity()));
    }

    public void setOnCountryChangedListener(OnCountryChangedListener onCountryChangedListener) {
        this.onCountryChangedListener = onCountryChangedListener;
    }

    public void showAddressNotValid() {
        this.addressLineOneField.showNotValid(false);
    }

    public RegistrationAddressFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RegistrationAddressFormView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}