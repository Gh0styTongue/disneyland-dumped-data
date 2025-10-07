package com.disney.wdpro.payments.models;

/* loaded from: classes15.dex */
public class WalletVersion {
    public String status;
    public String versionId;

    public WalletVersion(String str, String str2) {
        this.versionId = str;
        this.status = str2;
    }

    public String getStatus() {
        return this.status;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}