package com.disney.wdpro.payments.models;

import com.disney.wdpro.payments.models.enums.WalletEntryIdentifierTypeEnum;
import com.disney.wdpro.payments.models.enums.WalletIdentifierTypeEnum;

/* loaded from: classes15.dex */
public class RemoveWalletEntryRequest {
    public String token;
    public WalletEntry walletEntry;
    public WalletIdentifier walletIdentifier;
    public String wallet_api_key;

    public RemoveWalletEntryRequest(String str) {
        this.token = str;
    }

    public WalletEntry getWalletEntryIdentifier() {
        return this.walletEntry;
    }

    public WalletIdentifier getWalletIdentifier() {
        return this.walletIdentifier;
    }

    public void setWalletEntry(WalletEntry walletEntry) {
        this.walletEntry = walletEntry;
    }

    public void setWalletIdentifier(WalletIdentifier walletIdentifier) {
        this.walletIdentifier = walletIdentifier;
    }

    public RemoveWalletEntryRequest(WalletIdentifierTypeEnum walletIdentifierTypeEnum, String str, WalletEntryIdentifierTypeEnum walletEntryIdentifierTypeEnum, String str2, String str3) {
        this.walletIdentifier = new WalletIdentifier(walletIdentifierTypeEnum, str);
        this.walletEntry = new WalletEntry(walletEntryIdentifierTypeEnum, str2);
        this.wallet_api_key = str3;
    }
}