package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class State implements Serializable {
    private static final long serialVersionUID = 1;
    private final String code;
    private final String name;

    public State(String str, String str2) {
        this.name = str;
        this.code = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}