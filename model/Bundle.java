package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes21.dex */
public class Bundle implements Parcelable {
    public static final Parcelable.Creator<Bundle> CREATOR = new Parcelable.Creator<Bundle>() { // from class: com.wdpr.ee.ra.rahybrid.model.Bundle.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bundle createFromParcel(Parcel parcel) {
            return new Bundle(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bundle[] newArray(int i10) {
            return new Bundle[i10];
        }
    };

    @SerializedName("webContentSync")
    private HybridWebContentSyncConfig webContentSyncConfig;

    @SerializedName("webServer")
    private WebServerConfig webServerConfig;

    public Bundle() {
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bundle)) {
            return false;
        }
        Bundle bundle = (Bundle) obj;
        if (!bundle.canEqual(this)) {
            return false;
        }
        WebServerConfig webServerConfig = getWebServerConfig();
        WebServerConfig webServerConfig2 = bundle.getWebServerConfig();
        if (webServerConfig != null ? !webServerConfig.equals(webServerConfig2) : webServerConfig2 != null) {
            return false;
        }
        HybridWebContentSyncConfig webContentSyncConfig = getWebContentSyncConfig();
        HybridWebContentSyncConfig webContentSyncConfig2 = bundle.getWebContentSyncConfig();
        return webContentSyncConfig != null ? webContentSyncConfig.equals(webContentSyncConfig2) : webContentSyncConfig2 == null;
    }

    public HybridWebContentSyncConfig getWebContentSyncConfig() {
        return this.webContentSyncConfig;
    }

    public WebServerConfig getWebServerConfig() {
        return this.webServerConfig;
    }

    public int hashCode() {
        WebServerConfig webServerConfig = getWebServerConfig();
        int iHashCode = webServerConfig == null ? 43 : webServerConfig.hashCode();
        HybridWebContentSyncConfig webContentSyncConfig = getWebContentSyncConfig();
        return ((iHashCode + 59) * 59) + (webContentSyncConfig != null ? webContentSyncConfig.hashCode() : 43);
    }

    public void setWebContentSyncConfig(HybridWebContentSyncConfig hybridWebContentSyncConfig) {
        this.webContentSyncConfig = hybridWebContentSyncConfig;
    }

    public void setWebServerConfig(WebServerConfig webServerConfig) {
        this.webServerConfig = webServerConfig;
    }

    public String toString() {
        return "Bundle(webServerConfig=" + getWebServerConfig() + ", webContentSyncConfig=" + getWebContentSyncConfig() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.webServerConfig, i10);
        parcel.writeParcelable(this.webContentSyncConfig, i10);
    }

    protected Bundle(Parcel parcel) {
        this.webServerConfig = (WebServerConfig) parcel.readParcelable(WebServerConfig.class.getClassLoader());
        this.webContentSyncConfig = (HybridWebContentSyncConfig) parcel.readParcelable(HybridWebContentSyncConfig.class.getClassLoader());
    }
}