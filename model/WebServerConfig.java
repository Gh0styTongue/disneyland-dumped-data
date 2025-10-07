package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes21.dex */
public class WebServerConfig implements Parcelable {
    public static final Parcelable.Creator<WebServerConfig> CREATOR = new Parcelable.Creator<WebServerConfig>() { // from class: com.wdpr.ee.ra.rahybrid.model.WebServerConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebServerConfig createFromParcel(Parcel parcel) {
            return new WebServerConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebServerConfig[] newArray(int i10) {
            return new WebServerConfig[i10];
        }
    };

    @SerializedName("enableDeepLinking")
    private Boolean enableDeepLinking;

    @SerializedName("hostName")
    private String hostName;

    @SerializedName("preloadUrl")
    private String preloadUrl;

    @SerializedName("proxy")
    private List<ProxyConfig> proxyConfigs;

    @SerializedName("scheme")
    private String scheme;

    public WebServerConfig() {
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof WebServerConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebServerConfig)) {
            return false;
        }
        WebServerConfig webServerConfig = (WebServerConfig) obj;
        if (!webServerConfig.canEqual(this) || getEnableDeepLinking() != webServerConfig.getEnableDeepLinking()) {
            return false;
        }
        String scheme = getScheme();
        String scheme2 = webServerConfig.getScheme();
        if (scheme != null ? !scheme.equals(scheme2) : scheme2 != null) {
            return false;
        }
        String hostName = getHostName();
        String hostName2 = webServerConfig.getHostName();
        if (hostName != null ? !hostName.equals(hostName2) : hostName2 != null) {
            return false;
        }
        String preloadUrl = getPreloadUrl();
        String preloadUrl2 = webServerConfig.getPreloadUrl();
        if (preloadUrl != null ? !preloadUrl.equals(preloadUrl2) : preloadUrl2 != null) {
            return false;
        }
        List<ProxyConfig> proxyConfigs = getProxyConfigs();
        List<ProxyConfig> proxyConfigs2 = webServerConfig.getProxyConfigs();
        return proxyConfigs != null ? proxyConfigs.equals(proxyConfigs2) : proxyConfigs2 == null;
    }

    public boolean getEnableDeepLinking() {
        if (this.enableDeepLinking == null) {
            this.enableDeepLinking = Boolean.FALSE;
        }
        return this.enableDeepLinking.booleanValue();
    }

    public String getHostName() {
        return this.hostName;
    }

    public String getPreloadUrl() {
        return this.preloadUrl;
    }

    public List<ProxyConfig> getProxyConfigs() {
        return this.proxyConfigs;
    }

    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        int i10 = getEnableDeepLinking() ? 79 : 97;
        String scheme = getScheme();
        int iHashCode = ((i10 + 59) * 59) + (scheme == null ? 43 : scheme.hashCode());
        String hostName = getHostName();
        int iHashCode2 = (iHashCode * 59) + (hostName == null ? 43 : hostName.hashCode());
        String preloadUrl = getPreloadUrl();
        int i11 = iHashCode2 * 59;
        int iHashCode3 = preloadUrl == null ? 43 : preloadUrl.hashCode();
        List<ProxyConfig> proxyConfigs = getProxyConfigs();
        return ((i11 + iHashCode3) * 59) + (proxyConfigs != null ? proxyConfigs.hashCode() : 43);
    }

    public void setEnableDeepLinking(Boolean bool) {
        this.enableDeepLinking = bool;
    }

    public void setHostName(String str) {
        this.hostName = str;
    }

    public void setPreloadUrl(String str) {
        this.preloadUrl = str;
    }

    public void setProxyConfigs(List<ProxyConfig> list) {
        this.proxyConfigs = list;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public String toString() {
        return "WebServerConfig(scheme=" + getScheme() + ", hostName=" + getHostName() + ", preloadUrl=" + getPreloadUrl() + ", enableDeepLinking=" + getEnableDeepLinking() + ", proxyConfigs=" + getProxyConfigs() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.scheme);
        parcel.writeString(this.hostName);
        parcel.writeString(this.preloadUrl);
        Boolean bool = this.enableDeepLinking;
        parcel.writeByte((byte) (bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        parcel.writeTypedList(this.proxyConfigs);
    }

    protected WebServerConfig(Parcel parcel) {
        Boolean boolValueOf;
        this.scheme = parcel.readString();
        this.hostName = parcel.readString();
        this.preloadUrl = parcel.readString();
        byte b10 = parcel.readByte();
        if (b10 == 0) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(b10 == 1);
        }
        this.enableDeepLinking = boolValueOf;
        this.proxyConfigs = parcel.createTypedArrayList(ProxyConfig.CREATOR);
    }
}