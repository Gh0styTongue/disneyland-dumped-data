package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import java.io.Serializable;

/* loaded from: classes18.dex */
public final class Guest implements Serializable {
    private static final long serialVersionUID = 1;
    private final String guestName;

    public Guest(String str) {
        C22462m.m68673e(!C22466q.m68722b(str), "guestName null or empty");
        this.guestName = str;
    }

    public String getGuestName() {
        return this.guestName;
    }
}