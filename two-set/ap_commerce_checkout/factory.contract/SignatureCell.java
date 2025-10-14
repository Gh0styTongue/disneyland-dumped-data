package com.disney.wdpro.ap_commerce_checkout.factory.contract;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;

/* loaded from: classes23.dex */
public class SignatureCell extends BaseCell {
    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.BaseCell, com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell
    public void create(BaseFragment baseFragment, Contract contract, LinearLayout linearLayout) {
        TextView textView;
        String appearanceKey;
        textView = new TextView(baseFragment.getContext());
        if (isMonthlyContractSigned()) {
            textView.setText(contract.getAttributes().getAcceptedTextKey().getContent());
            textView.setTextSize(contract.getAttributes().getAcceptedTextKey().getStyle().getSizeKey());
            appearanceKey = contract.getAttributes().getAcceptedTextKey().getStyle().getAppearanceKey();
        } else {
            textView.setText(contract.getAttributes().getUnaceptedTextKey().getContent());
            textView.setTextSize(contract.getAttributes().getUnaceptedTextKey().getStyle().getSizeKey());
            appearanceKey = contract.getAttributes().getUnaceptedTextKey().getStyle().getAppearanceKey();
        }
        appearanceKey.getClass();
        switch (appearanceKey) {
            case "Italic":
                textView.setTypeface(null, 2);
                break;
            case "Bold":
                textView.setTypeface(null, 1);
                break;
            case "Plain":
                textView.setTypeface(null, 0);
                break;
        }
        linearLayout.addView(textView);
    }
}