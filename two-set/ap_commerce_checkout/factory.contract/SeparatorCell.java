package com.disney.wdpro.ap_commerce_checkout.factory.contract;

import android.view.View;
import android.widget.LinearLayout;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;

/* loaded from: classes23.dex */
public class SeparatorCell extends BaseCell {
    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.BaseCell, com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell
    public void create(BaseFragment baseFragment, Contract contract, LinearLayout linearLayout) {
        View view = new View(baseFragment.getContext());
        view.setBackgroundColor(baseFragment.getResources().getColor(C8689R.color.hr_gray));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, contract.getAttributes().getStyleKey().getHeightKey()));
        int dimension = (int) baseFragment.getResources().getDimension(C8689R.dimen.ap_commerce_checkout_contract_padding);
        linearLayout.setPadding(0, dimension, 0, dimension);
        linearLayout.addView(view);
    }
}