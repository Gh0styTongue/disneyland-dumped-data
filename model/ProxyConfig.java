package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes21.dex */
public class ProxyConfig implements Parcelable {
    public static final Parcelable.Creator<ProxyConfig> CREATOR = new Parcelable.Creator<ProxyConfig>() { // from class: com.wdpr.ee.ra.rahybrid.model.ProxyConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyConfig createFromParcel(Parcel parcel) {
            return new ProxyConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProxyConfig[] newArray(int i10) {
            return new ProxyConfig[i10];
        }
    };
    private String prefix;
    private Integer timeout;
    private String url;

    public ProxyConfig() {
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof ProxyConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProxyConfig)) {
            return false;
        }
        ProxyConfig proxyConfig = (ProxyConfig) obj;
        if (!proxyConfig.canEqual(this)) {
            return false;
        }
        Integer timeout = getTimeout();
        Integer timeout2 = proxyConfig.getTimeout();
        if (timeout != null ? !timeout.equals(timeout2) : timeout2 != null) {
            return false;
        }
        String prefix = getPrefix();
        String prefix2 = proxyConfig.getPrefix();
        if (prefix != null ? !prefix.equals(prefix2) : prefix2 != null) {
            return false;
        }
        String url = getUrl();
        String url2 = proxyConfig.getUrl();
        return url != null ? url.equals(url2) : url2 == null;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Integer timeout = getTimeout();
        int iHashCode = timeout == null ? 43 : timeout.hashCode();
        String prefix = getPrefix();
        int i10 = (iHashCode + 59) * 59;
        int iHashCode2 = prefix == null ? 43 : prefix.hashCode();
        String url = getUrl();
        return ((i10 + iHashCode2) * 59) + (url != null ? url.hashCode() : 43);
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setTimeout(Integer num) {
        this.timeout = num;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "ProxyConfig(prefix=" + getPrefix() + ", url=" + getUrl() + ", timeout=" + getTimeout() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.prefix);
        parcel.writeString(this.url);
        parcel.writeValue(this.timeout);
    }

    protected ProxyConfig(Parcel parcel) {
        this.prefix = parcel.readString();
        this.url = parcel.readString();
        this.timeout = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}