package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.WalletIdentifierTypeEnum;

/* loaded from: classes15.dex */
public class WalletIdentifier {
    public WalletIdentifierTypeEnum idType;
    public String idValue;

    public WalletIdentifier(WalletIdentifierTypeEnum walletIdentifierTypeEnum, String str) {
        this.idType = walletIdentifierTypeEnum;
        this.idValue = str;
    }

    public WalletIdentifierTypeEnum getIdType() {
        return this.idType;
    }

    public String getIdValue() {
        return this.idValue;
    }

    public void setIdType(WalletIdentifierTypeEnum walletIdentifierTypeEnum) {
        this.idType = walletIdentifierTypeEnum;
    }

    public void setIdValue(String str) {
        this.idValue = str;
    }
}