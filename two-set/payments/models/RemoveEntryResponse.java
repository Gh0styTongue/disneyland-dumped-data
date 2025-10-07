package com.disney.wdpro.payments.models;

/* loaded from: classes15.dex */
public class RemoveEntryResponse {
    public String conversationId;
    public String correlationId;
    public String deliveryDateTime;
    public String durationMillis;
    public String receivedDateTime;
    public String requestDateTime;
    public String status;
    public String systemCode;
    public String tripMillis;
    public WalletVersion version;
    public WalletEntry walletEntry;
    public WalletIdentifier walletIdentifier;

    public RemoveEntryResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, WalletIdentifier walletIdentifier, WalletEntry walletEntry, WalletVersion walletVersion) {
        this.systemCode = str;
        this.correlationId = str2;
        this.conversationId = str3;
        this.status = str4;
        this.requestDateTime = str5;
        this.receivedDateTime = str6;
        this.deliveryDateTime = str7;
        this.tripMillis = str8;
        this.durationMillis = str9;
        this.walletIdentifier = walletIdentifier;
        this.walletEntry = walletEntry;
        this.version = walletVersion;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getCorrelationId() {
        return this.correlationId;
    }

    public String getDeliveryDateTime() {
        return this.deliveryDateTime;
    }

    public String getDurationMillis() {
        return this.durationMillis;
    }

    public String getReceivedDateTime() {
        return this.receivedDateTime;
    }

    public String getRequestDateTime() {
        return this.requestDateTime;
    }

    public String getStatus() {
        return this.status;
    }

    public String getSystemCode() {
        return this.systemCode;
    }

    public String getTripMillis() {
        return this.tripMillis;
    }

    public WalletVersion getVersion() {
        return this.version;
    }

    public WalletEntry getWalletEntry() {
        return this.walletEntry;
    }

    public WalletIdentifier getWalletIdentifier() {
        return this.walletIdentifier;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setCorrelationId(String str) {
        this.correlationId = str;
    }

    public void setDeliveryDateTime(String str) {
        this.deliveryDateTime = str;
    }

    public void setDurationMillis(String str) {
        this.durationMillis = str;
    }

    public void setReceivedDateTime(String str) {
        this.receivedDateTime = str;
    }

    public void setRequestDateTime(String str) {
        this.requestDateTime = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSystemCode(String str) {
        this.systemCode = str;
    }

    public void setTripMillis(String str) {
        this.tripMillis = str;
    }

    public void setVersion(WalletVersion walletVersion) {
        this.version = walletVersion;
    }

    public void setWalletEntry(WalletEntry walletEntry) {
        this.walletEntry = walletEntry;
    }

    public void setWalletIdentifier(WalletIdentifier walletIdentifier) {
        this.walletIdentifier = walletIdentifier;
    }
}