package com.disney.wdpro.ap_commerce_checkout.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.BookingStatus;
import com.disney.wdpro.ticket_sales_base_lib.utils.StringUtils;

/* loaded from: classes23.dex */
public class APCreditCardInformation extends BaseCreditCardInformation {
    private boolean isMonthlyPayment;

    public APCreditCardInformation(Context context) {
        super(context);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation
    protected String getContentDescriptionText(BookingStatus bookingStatus) {
        return getResources().getString(this.isMonthlyPayment ? C8689R.string.f29127x55473c2f : C8689R.string.ticket_sales_cd_price_and_payment_summary, DisplayPriceFormatter.formatAccessibilityPrice(getAmountPaid(), getContext()), getCCName(), StringUtils.separate(getCCNumber(), " "));
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.BaseCreditCardInformation
    protected CharSequence getContentText(BookingStatus bookingStatus) {
        if (this.isMonthlyPayment) {
            return getContext().getString(C8689R.string.f29127x55473c2f, DisplayPriceFormatter.formatDisplayPrice(getAmountPaid()).toString(), getCCName(), getCCNumber());
        }
        SpannableString displayPrice = DisplayPriceFormatter.formatDisplayPrice(getAmountPaid());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) displayPrice);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) getAmountPaid().getCurrency().getName());
        spannableStringBuilder.append((CharSequence) getContext().getString(C8689R.string.ticket_sales_order_confirmation_card_information, getCCNumber()));
        return spannableStringBuilder;
    }

    public void setIsMonthlyPayment(boolean z10) {
        this.isMonthlyPayment = z10;
    }

    public APCreditCardInformation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public APCreditCardInformation(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(21)
    public APCreditCardInformation(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}