package com.disney.wdpro.ap_commerce_checkout.factory.contract;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.utils.StringDisplayFormatter;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.TextKey;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes23.dex */
public class TextViewCell extends BaseCell {
    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.BaseCell, com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell
    public void create(BaseFragment baseFragment, Contract contract, LinearLayout linearLayout) {
        SpannableString spannableString;
        List<TextKey> listAsList = Arrays.asList(contract.getAttributes().getCellTextKey());
        TextView textView = new TextView(baseFragment.getContext());
        for (TextKey textKey : listAsList) {
            spannableString = new SpannableString(textKey.getContent());
            String appearanceKey = textKey.getStyle().getAppearanceKey();
            appearanceKey.getClass();
            switch (appearanceKey) {
                case "Italic":
                    spannableString.setSpan(new StyleSpan(2), 0, textKey.getContent().length(), 33);
                    break;
                case "Bold":
                    spannableString.setSpan(new StyleSpan(1), 0, textKey.getContent().length(), 33);
                    break;
                case "Plain":
                    spannableString.setSpan(new StyleSpan(0), 0, textKey.getContent().length(), 33);
                    break;
            }
            spannableString.setSpan(new AbsoluteSizeSpan(textKey.getStyle().getSizeKey(), true), 0, textKey.getContent().length(), 33);
            textView.append(spannableString);
        }
        textView.setContentDescription(StringDisplayFormatter.buildTermsAndConditionsPolicyStringContentDescription(textView.getText().toString().replace("Tel#", "telephone number")));
        linearLayout.addView(textView);
    }
}