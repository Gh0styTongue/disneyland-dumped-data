package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes21.dex */
public class HybridWebContentSyncConfig implements Parcelable {
    public static final Parcelable.Creator<HybridWebContentSyncConfig> CREATOR = new Parcelable.Creator<HybridWebContentSyncConfig>() { // from class: com.wdpr.ee.ra.rahybrid.model.HybridWebContentSyncConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HybridWebContentSyncConfig createFromParcel(Parcel parcel) {
            return new HybridWebContentSyncConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HybridWebContentSyncConfig[] newArray(int i10) {
            return new HybridWebContentSyncConfig[i10];
        }
    };
    private String localManifestName;
    private String publicKey;
    private String remoteContentUrl;

    public HybridWebContentSyncConfig() {
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof HybridWebContentSyncConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HybridWebContentSyncConfig)) {
            return false;
        }
        HybridWebContentSyncConfig hybridWebContentSyncConfig = (HybridWebContentSyncConfig) obj;
        if (!hybridWebContentSyncConfig.canEqual(this)) {
            return false;
        }
        String remoteContentUrl = getRemoteContentUrl();
        String remoteContentUrl2 = hybridWebContentSyncConfig.getRemoteContentUrl();
        if (remoteContentUrl != null ? !remoteContentUrl.equals(remoteContentUrl2) : remoteContentUrl2 != null) {
            return false;
        }
        String localManifestName = getLocalManifestName();
        String localManifestName2 = hybridWebContentSyncConfig.getLocalManifestName();
        if (localManifestName != null ? !localManifestName.equals(localManifestName2) : localManifestName2 != null) {
            return false;
        }
        String publicKey = getPublicKey();
        String publicKey2 = hybridWebContentSyncConfig.getPublicKey();
        return publicKey != null ? publicKey.equals(publicKey2) : publicKey2 == null;
    }

    public String getLocalManifestName() {
        return this.localManifestName;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRemoteContentUrl() {
        return this.remoteContentUrl;
    }

    public int hashCode() {
        String remoteContentUrl = getRemoteContentUrl();
        int iHashCode = remoteContentUrl == null ? 43 : remoteContentUrl.hashCode();
        String localManifestName = getLocalManifestName();
        int i10 = (iHashCode + 59) * 59;
        int iHashCode2 = localManifestName == null ? 43 : localManifestName.hashCode();
        String publicKey = getPublicKey();
        return ((i10 + iHashCode2) * 59) + (publicKey != null ? publicKey.hashCode() : 43);
    }

    public void setLocalManifestName(String str) {
        this.localManifestName = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setRemoteContentUrl(String str) {
        this.remoteContentUrl = str;
    }

    public String toString() {
        return "HybridWebContentSyncConfig(remoteContentUrl=" + getRemoteContentUrl() + ", localManifestName=" + getLocalManifestName() + ", publicKey=" + getPublicKey() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.remoteContentUrl);
        parcel.writeString(this.localManifestName);
        parcel.writeString(this.publicKey);
    }

    protected HybridWebContentSyncConfig(Parcel parcel) {
        this.remoteContentUrl = parcel.readString();
        this.localManifestName = parcel.readString();
        this.publicKey = parcel.readString();
    }
}