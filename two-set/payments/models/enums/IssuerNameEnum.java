package com.disney.wdpro.payments.models.enums;

/* loaded from: classes15.dex */
public enum IssuerNameEnum {
    AMX,
    MAS,
    VIS,
    DNN,
    JCB,
    DIN,
    SV,
    GC,
    CUP,
    KTTW,
    KTTMCARD;

    public static IssuerNameEnum fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}