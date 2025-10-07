package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.google.common.base.Optional;
import java.io.Serializable;

/* loaded from: classes18.dex */
public class AboutElement implements Serializable {
    private static final long serialVersionUID = 1;
    private final String content;
    private final Optional<String> title;

    public AboutElement(String str, String str2) {
        this.title = Optional.fromNullable(str);
        this.content = str2;
    }

    public String getContent() {
        return this.content;
    }

    public Optional<String> getTitle() {
        return this.title;
    }
}