package com.disney.wdpro.payments.models.enums;

/* loaded from: classes15.dex */
public enum WalletIdentifierTypeEnum {
    SWID("Swid"),
    CID("Cid");

    private final String value;

    WalletIdentifierTypeEnum(String str) {
        this.value = str;
    }

    public static WalletIdentifierTypeEnum fromValue(String str) {
        for (WalletIdentifierTypeEnum walletIdentifierTypeEnum : values()) {
            if (walletIdentifierTypeEnum.value.equals(str)) {
                return walletIdentifierTypeEnum;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}