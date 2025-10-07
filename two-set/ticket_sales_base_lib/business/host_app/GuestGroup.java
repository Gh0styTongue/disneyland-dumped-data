package com.disney.wdpro.ticket_sales_base_lib.business.host_app;

import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;

/* loaded from: classes18.dex */
public enum GuestGroup {
    DLR(WebStoreId.DLR_MOBILE, "80008297"),
    WDW(WebStoreId.WDW_MOBILE, "80007798"),
    WDW_FLORIDA(null, null),
    DLR_SOUTH_CALIFORNIA(null, null);

    private String destinationId;
    private WebStoreId webStoreId;

    GuestGroup(WebStoreId webStoreId, String str) {
        this.webStoreId = webStoreId;
        this.destinationId = str;
    }

    public String getDestinationId() {
        return this.destinationId;
    }

    public WebStoreId getWebStoreId() {
        return this.webStoreId;
    }
}