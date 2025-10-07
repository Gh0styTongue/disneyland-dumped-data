package com.disney.wdpro.general_ticket_sales_ui.calendar.delta;

import java.util.Calendar;

/* loaded from: classes28.dex */
public class PriceCell {
    private final Calendar date;
    private final String price;
    private int priority;
    private final String tierName;

    public PriceCell(Calendar calendar, String str, String str2, int i10) {
        this.date = calendar;
        this.tierName = str;
        this.price = str2;
        this.priority = i10;
    }

    public Calendar getDate() {
        return this.date;
    }

    public String getPrice() {
        return this.price;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getTierName() {
        return this.tierName;
    }
}