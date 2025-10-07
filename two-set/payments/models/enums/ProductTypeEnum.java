package com.disney.wdpro.payments.models.enums;

/* loaded from: classes15.dex */
public enum ProductTypeEnum {
    RESERVATION("reservation"),
    MATERIAL("material");

    private String type;

    ProductTypeEnum(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getType();
    }
}