package com.disney.wdpro.ticket_sales_base_lib.business.product;

import java.io.Serializable;

/* loaded from: classes18.dex */
public class PolicyDescription implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: id */
    private String f43911id;
    private String key;
    private String text;
    private String type;
    private String usageType;

    public PolicyDescription(String str, String str2, String str3, String str4, String str5) {
        this.key = str;
        this.f43911id = str2;
        this.type = str3;
        this.text = str4;
        this.usageType = str5;
    }

    public String getId() {
        return this.f43911id;
    }

    public String getKey() {
        return this.key;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public String getUsageType() {
        return this.usageType;
    }
}