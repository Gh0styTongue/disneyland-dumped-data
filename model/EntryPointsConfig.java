package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes21.dex */
public class EntryPointsConfig implements Parcelable {
    public static final Parcelable.Creator<EntryPointsConfig> CREATOR = new Parcelable.Creator<EntryPointsConfig>() { // from class: com.wdpr.ee.ra.rahybrid.model.EntryPointsConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EntryPointsConfig createFromParcel(Parcel parcel) {
            return new EntryPointsConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EntryPointsConfig[] newArray(int i10) {
            return new EntryPointsConfig[i10];
        }
    };

    /* renamed from: id */
    private String f71770id;
    private int readyMessageTimeoutInSec;
    private boolean reloadStartUrlOnTokenUpdate;
    private boolean requiresSSO;
    private String startUrl;
    private int webViewFinishTimeoutInSec;

    public EntryPointsConfig(Parcel parcel) {
        this.f71770id = parcel.readString();
        this.startUrl = parcel.readString();
        this.requiresSSO = parcel.readByte() != 0;
        this.reloadStartUrlOnTokenUpdate = parcel.readByte() != 0;
        this.webViewFinishTimeoutInSec = parcel.readInt();
        this.readyMessageTimeoutInSec = parcel.readInt();
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof EntryPointsConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EntryPointsConfig)) {
            return false;
        }
        EntryPointsConfig entryPointsConfig = (EntryPointsConfig) obj;
        if (!entryPointsConfig.canEqual(this) || getWebViewFinishTimeoutInSec() != entryPointsConfig.getWebViewFinishTimeoutInSec() || getReadyMessageTimeoutInSec() != entryPointsConfig.getReadyMessageTimeoutInSec() || isRequiresSSO() != entryPointsConfig.isRequiresSSO() || isReloadStartUrlOnTokenUpdate() != entryPointsConfig.isReloadStartUrlOnTokenUpdate()) {
            return false;
        }
        String id2 = getId();
        String id3 = entryPointsConfig.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String startUrl = getStartUrl();
        String startUrl2 = entryPointsConfig.getStartUrl();
        return startUrl != null ? startUrl.equals(startUrl2) : startUrl2 == null;
    }

    public String getId() {
        return this.f71770id;
    }

    public int getReadyMessageTimeoutInSec() {
        return this.readyMessageTimeoutInSec;
    }

    public String getStartUrl() {
        return this.startUrl;
    }

    public int getWebViewFinishTimeoutInSec() {
        return this.webViewFinishTimeoutInSec;
    }

    public int hashCode() {
        int webViewFinishTimeoutInSec = (((((getWebViewFinishTimeoutInSec() + 59) * 59) + getReadyMessageTimeoutInSec()) * 59) + (isRequiresSSO() ? 79 : 97)) * 59;
        int i10 = isReloadStartUrlOnTokenUpdate() ? 79 : 97;
        String id2 = getId();
        int i11 = (webViewFinishTimeoutInSec + i10) * 59;
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        String startUrl = getStartUrl();
        return ((i11 + iHashCode) * 59) + (startUrl != null ? startUrl.hashCode() : 43);
    }

    public boolean isReloadStartUrlOnTokenUpdate() {
        return this.reloadStartUrlOnTokenUpdate;
    }

    public boolean isRequiresSSO() {
        return this.requiresSSO;
    }

    public void setId(String str) {
        this.f71770id = str;
    }

    public void setReadyMessageTimeoutInSec(int i10) {
        this.readyMessageTimeoutInSec = i10;
    }

    public void setReloadStartUrlOnTokenUpdate(boolean z10) {
        this.reloadStartUrlOnTokenUpdate = z10;
    }

    public void setRequiresSSO(boolean z10) {
        this.requiresSSO = z10;
    }

    public void setStartUrl(String str) {
        this.startUrl = str;
    }

    public void setWebViewFinishTimeoutInSec(int i10) {
        this.webViewFinishTimeoutInSec = i10;
    }

    public boolean shouldReloadStartUrlOnTokenUpdate() {
        return this.reloadStartUrlOnTokenUpdate;
    }

    public boolean shouldRequireSSO() {
        return this.requiresSSO;
    }

    public String toString() {
        return "EntryPointsConfig(id=" + getId() + ", startUrl=" + getStartUrl() + ", webViewFinishTimeoutInSec=" + getWebViewFinishTimeoutInSec() + ", readyMessageTimeoutInSec=" + getReadyMessageTimeoutInSec() + ", requiresSSO=" + isRequiresSSO() + ", reloadStartUrlOnTokenUpdate=" + isReloadStartUrlOnTokenUpdate() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f71770id);
        parcel.writeString(this.startUrl);
        parcel.writeByte(this.requiresSSO ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.reloadStartUrlOnTokenUpdate ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.webViewFinishTimeoutInSec);
        parcel.writeInt(this.readyMessageTimeoutInSec);
    }

    public EntryPointsConfig() {
    }
}