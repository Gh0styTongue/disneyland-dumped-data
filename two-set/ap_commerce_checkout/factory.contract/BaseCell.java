package com.disney.wdpro.ap_commerce_checkout.factory.contract;

import android.widget.LinearLayout;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;

/* loaded from: classes23.dex */
public abstract class BaseCell implements Cell {
    public static final String STYLE_BOLD = "Bold";
    public static final String STYLE_ITALIC = "Italic";
    public static final String STYLE_NORMAL = "Plain";
    private boolean isMonthlyContractSigned;

    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell
    public void create(BaseFragment baseFragment, Contract contract, LinearLayout linearLayout) {
    }

    public boolean isMonthlyContractSigned() {
        return this.isMonthlyContractSigned;
    }

    @Override // com.disney.wdpro.ap_commerce_checkout.factory.contract.Cell
    public void setMonthlyContractSigned(boolean z10) {
        this.isMonthlyContractSigned = z10;
    }
}