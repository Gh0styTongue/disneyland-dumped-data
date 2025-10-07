package com.disney.wdpro.payments.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class FraudParameter implements Serializable {
    private static final long serialVersionUID = -1560200574888453347L;
    private String group;
    private Map<String, String> params;

    public FraudParameter(String str, Map<String, String> map) {
        new HashMap();
        this.group = str;
        this.params = map;
    }

    public String getGroup() {
        return this.group;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public void setGroup(String str) {
        this.group = str;
    }
}