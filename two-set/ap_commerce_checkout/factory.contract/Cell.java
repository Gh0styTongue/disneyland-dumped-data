package com.disney.wdpro.ap_commerce_checkout.factory.contract;

import android.widget.LinearLayout;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;

/* loaded from: classes23.dex */
public interface Cell {
    void create(BaseFragment baseFragment, Contract contract, LinearLayout linearLayout);

    void setMonthlyContractSigned(boolean z10);
}