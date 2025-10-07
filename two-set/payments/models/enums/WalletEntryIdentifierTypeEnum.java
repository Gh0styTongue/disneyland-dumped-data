package com.disney.wdpro.payments.models.enums;

/* loaded from: classes15.dex */
public enum WalletEntryIdentifierTypeEnum {
    INSTANT_CARD_APPLICATION("InstantCardApplication"),
    CARD("Card"),
    ACCOUNT_CARD("AccountCard");

    private final String value;

    WalletEntryIdentifierTypeEnum(String str) {
        this.value = str;
    }

    public static WalletEntryIdentifierTypeEnum fromValue(String str) {
        for (WalletEntryIdentifierTypeEnum walletEntryIdentifierTypeEnum : values()) {
            if (walletEntryIdentifierTypeEnum.value.equals(str)) {
                return walletEntryIdentifierTypeEnum;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}