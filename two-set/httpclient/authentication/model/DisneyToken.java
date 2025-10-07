package com.disney.wdpro.httpclient.authentication.model;

/* loaded from: classes23.dex */
public class DisneyToken {
    private final String ttl;
    private final String type;
    private final String value;

    public DisneyToken(String str, String str2, String str3) {
        this.type = str;
        this.value = str2;
        this.ttl = str3;
    }

    public String getTTL() {
        return this.ttl;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }
}