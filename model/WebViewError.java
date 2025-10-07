package com.wdpr.p479ee.p480ra.rahybrid.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes21.dex */
public class WebViewError implements Serializable, Parcelable {
    public static final int BLOCKED_URL_ERROR_CODE = 999;
    public static final Parcelable.Creator<WebViewError> CREATOR = new Parcelable.Creator<WebViewError>() { // from class: com.wdpr.ee.ra.rahybrid.model.WebViewError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewError createFromParcel(Parcel parcel) {
            return new WebViewError(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewError[] newArray(int i10) {
            return new WebViewError[i10];
        }
    };

    @SerializedName("errorCode")
    @Expose
    private Integer errorCode;

    @SerializedName("url")
    @Expose
    private String url;

    public static class BlockedErrorBuilder {
        private String url;

        BlockedErrorBuilder() {
        }

        public WebViewError build() {
            return WebViewError.newWebViewError(this.url);
        }

        public String toString() {
            return "WebViewError.BlockedErrorBuilder(url=" + this.url + ")";
        }

        public BlockedErrorBuilder url(String str) {
            this.url = str;
            return this;
        }
    }

    public static class WebViewErrorBuilder {
        private Integer errorCode;
        private String url;

        WebViewErrorBuilder() {
        }

        public WebViewError build() {
            return WebViewError.newWebViewError(this.errorCode, this.url);
        }

        public WebViewErrorBuilder errorCode(Integer num) {
            this.errorCode = num;
            return this;
        }

        public String toString() {
            return "WebViewError.WebViewErrorBuilder(errorCode=" + this.errorCode + ", url=" + this.url + ")";
        }

        public WebViewErrorBuilder url(String str) {
            this.url = str;
            return this;
        }
    }

    public WebViewError() {
    }

    public static BlockedErrorBuilder blockedErrorBuilder() {
        return new BlockedErrorBuilder();
    }

    public static WebViewError newWebViewError(Integer num, String str) {
        return new WebViewError(num, str);
    }

    public static WebViewErrorBuilder webViewErrorBuilder() {
        return new WebViewErrorBuilder();
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof WebViewError;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebViewError)) {
            return false;
        }
        WebViewError webViewError = (WebViewError) obj;
        if (!webViewError.canEqual(this)) {
            return false;
        }
        Integer errorCode = getErrorCode();
        Integer errorCode2 = webViewError.getErrorCode();
        if (errorCode != null ? !errorCode.equals(errorCode2) : errorCode2 != null) {
            return false;
        }
        String url = getUrl();
        String url2 = webViewError.getUrl();
        return url != null ? url.equals(url2) : url2 == null;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Integer errorCode = getErrorCode();
        int iHashCode = errorCode == null ? 43 : errorCode.hashCode();
        String url = getUrl();
        return ((iHashCode + 59) * 59) + (url != null ? url.hashCode() : 43);
    }

    public void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "WebViewError(errorCode=" + getErrorCode() + ", url=" + getUrl() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (this.errorCode == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.errorCode.intValue());
        }
        parcel.writeString(this.url);
    }

    public WebViewError(Integer num, String str) {
        this.errorCode = num;
        this.url = str;
    }

    public static WebViewError newWebViewError(String str) {
        return new WebViewError(999, str);
    }

    protected WebViewError(Parcel parcel) {
        this.errorCode = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        this.url = parcel.readString();
    }
}