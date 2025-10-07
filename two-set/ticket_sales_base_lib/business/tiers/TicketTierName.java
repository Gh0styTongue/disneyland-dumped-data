package com.disney.wdpro.ticket_sales_base_lib.business.tiers;

/* loaded from: classes18.dex */
public enum TicketTierName {
    VALUE,
    REGULAR,
    PEAK,
    DISABLED;

    private static final String JSON_KEY = "tier";

    public static String getJsonKey() {
        return JSON_KEY;
    }
}