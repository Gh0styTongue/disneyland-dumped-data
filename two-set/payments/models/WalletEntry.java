package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.WalletEntryIdentifierTypeEnum;

/* loaded from: classes15.dex */
public class WalletEntry {
    public WalletEntryIdentifierTypeEnum idType;
    public String idValue;

    public WalletEntry(WalletEntryIdentifierTypeEnum walletEntryIdentifierTypeEnum, String str) {
        this.idType = walletEntryIdentifierTypeEnum;
        this.idValue = str;
    }

    public WalletEntryIdentifierTypeEnum getIdType() {
        return this.idType;
    }

    public String getIdValue() {
        return this.idValue;
    }

    public void setIdType(WalletEntryIdentifierTypeEnum walletEntryIdentifierTypeEnum) {
        this.idType = walletEntryIdentifierTypeEnum;
    }

    public void setIdValue(String str) {
        this.idValue = str;
    }
}