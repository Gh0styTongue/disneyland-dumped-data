package com.disney.wdpro.ticket_sales_booking_lib.business.calendar;

import com.google.common.base.Optional;
import java.io.Serializable;

/* loaded from: classes18.dex */
public class Name implements Serializable {
    private static final long serialVersionUID = 1;
    private final String html;
    private final String text;

    public Name(String str, String str2) {
        this.html = str2;
        this.text = str;
    }

    public Optional<String> getHtml() {
        return Optional.fromNullable(this.html);
    }

    public Optional<String> getText() {
        return Optional.fromNullable(this.text);
    }
}