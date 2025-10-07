package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import javax.inject.Inject;

/* loaded from: classes18.dex */
public class ServiceBaseUrlApiClient {
    private String serviceBaseUrl;

    @Inject
    public ServiceBaseUrlApiClient(String str) {
        this.serviceBaseUrl = str;
    }

    public String getServiceBaseUrl() {
        return this.serviceBaseUrl;
    }
}