package com.disney.wdpro.ticket_sales_booking_lib.business.checkout;

import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.models.DeliveryOption;
import com.google.gson.JsonParseException;
import java.io.IOException;

/* loaded from: classes18.dex */
public class SupportedDeliveryOptionsApiClient {
    private final C13345q client;

    public SupportedDeliveryOptionsApiClient(C13345q c13345q) {
        this.client = c13345q;
    }

    DeliveryOption fetchSupportedDeliveryOptions(String str) throws JsonParseException, IOException {
        return (DeliveryOption) this.client.m55668c(str, DeliveryOption.class).m55672b().m55523m().m55535y(DeliveryOption.getDecoder()).m55521i().m55683c();
    }
}