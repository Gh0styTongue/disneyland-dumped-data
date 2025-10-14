package com.disney.wdpro.ap_commerce_checkout.factory.contract;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;

/* loaded from: classes23.dex */
public class LinkCell extends BaseCell {
    private static final int LEADING_CHAR_COUNT = 3;
    private OnSectionKeyPressedCallback onSectionKeyPressedCallback;

    public interface OnSectionKeyPressedCallback {
        void onSectionKeyPressed(String str, Contract contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.BaseCell, com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell
    public void create(BaseFragment baseFragment, final Contract contract, LinearLayout linearLayout) {
        TextView textView;
        this.onSectionKeyPressedCallback = (OnSectionKeyPressedCallback) baseFragment;
        Context context = baseFragment.getContext();
        textView = new TextView(context);
        textView.setTextSize(contract.getAttributes().getStyleKey().getSizeKey());
        String appearanceKey = contract.getAttributes().getStyleKey().getAppearanceKey();
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
        textView.setText(contract.getAttributes().getContentKey());
        textView.setTextColor(context.getResources().getColor(C8689R.color.text_blue));
        int dimension = (int) context.getResources().getDimension(C8689R.dimen.ap_commerce_checkout_contract_break_padding);
        linearLayout.setPadding(0, dimension, 0, dimension);
        linearLayout.addView(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ap_commerce_checkout.factory.contract.LinkCell.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LinkCell.this.onSectionKeyPressedCallback.onSectionKeyPressed(contract.getAttributes().getContentKey().substring(3), contract);
            }
        });
    }
}