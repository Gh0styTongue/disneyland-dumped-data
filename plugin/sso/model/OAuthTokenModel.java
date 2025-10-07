package com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.model;

/* loaded from: classes21.dex */
public class OAuthTokenModel {
    private String accessToken;
    private String refreshToken;

    public OAuthTokenModel(String str, String str2) {
        this.accessToken = str;
        this.refreshToken = str2;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof OAuthTokenModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OAuthTokenModel)) {
            return false;
        }
        OAuthTokenModel oAuthTokenModel = (OAuthTokenModel) obj;
        if (!oAuthTokenModel.canEqual(this)) {
            return false;
        }
        String accessToken = getAccessToken();
        String accessToken2 = oAuthTokenModel.getAccessToken();
        if (accessToken != null ? !accessToken.equals(accessToken2) : accessToken2 != null) {
            return false;
        }
        String refreshToken = getRefreshToken();
        String refreshToken2 = oAuthTokenModel.getRefreshToken();
        return refreshToken != null ? refreshToken.equals(refreshToken2) : refreshToken2 == null;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String accessToken = getAccessToken();
        int iHashCode = accessToken == null ? 43 : accessToken.hashCode();
        String refreshToken = getRefreshToken();
        return ((iHashCode + 59) * 59) + (refreshToken != null ? refreshToken.hashCode() : 43);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public String toString() {
        return "OAuthTokenModel(accessToken=" + getAccessToken() + ", refreshToken=" + getRefreshToken() + ")";
    }
}