package com.disney.wdpro.ap_commerce_checkout.views;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes23.dex */
public class APRegistrationAddressFormView extends RegistrationAddressFormView {
    public APRegistrationAddressFormView(Context context) {
        this(context, null, 0);
    }

    public void updateViewsForAccessibility(boolean z10) {
        clearFocus();
        this.addressCountryPickerField.setImportantForAccessibility(z10 ? 2 : 1);
        this.addressLineOneField.setImportantForAccessibility(z10 ? 2 : 1);
        this.addressLineTwoField.setImportantForAccessibility(z10 ? 2 : 1);
        this.addressLineThreeField.setImportantForAccessibility(z10 ? 2 : 1);
        this.cityField.setImportantForAccessibility(z10 ? 2 : 1);
        this.statePickerField.setImportantForAccessibility(z10 ? 2 : 1);
        this.stateOrTerritoryField.setImportantForAccessibility(z10 ? 2 : 1);
        this.countyField.setImportantForAccessibility(z10 ? 2 : 1);
        this.provincePickerField.setImportantForAccessibility(z10 ? 2 : 1);
        this.zipField.setImportantForAccessibility(z10 ? 2 : 1);
        this.internationalPhoneNumbersView.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public APRegistrationAddressFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public APRegistrationAddressFormView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}