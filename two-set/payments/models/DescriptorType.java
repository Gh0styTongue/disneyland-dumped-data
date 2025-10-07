package com.disney.wdpro.payments.models;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class DescriptorType implements Serializable {
    private static final long serialVersionUID = 12343;
    protected String key;
    protected String value;

    public DescriptorType(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}