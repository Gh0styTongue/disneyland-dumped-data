package com.wdpr.p479ee.p480ra.rahybrid.model;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes21.dex */
public class EntryPointDetails implements Serializable {
    private String entryPointId;
    private Map<String, String> urlTokens;

    public String getEntryPointId() {
        return this.entryPointId;
    }

    public Map<String, String> getUrlTokens() {
        return this.urlTokens;
    }

    public void setEntryPointId(String str) {
        this.entryPointId = str;
    }

    public void setUrlTokens(Map<String, String> map) {
        this.urlTokens = map;
    }
}