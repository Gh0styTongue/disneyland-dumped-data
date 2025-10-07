package com.disney.wdpro.httpclient.authentication.model;

import com.google.common.base.C22466q;

/* loaded from: classes23.dex */
public class AccessTokenStatus {
    public static final String INVALID_TOKEN_ERROR = "invalid_token";
    public static final String MISSING_TOKEN_ERROR = "missing_token";
    private final String accessToken;
    private final String error;
    private final int highTrustExpiresIn;
    private final int refreshTtl;
    private final int tokenTtl;

    public AccessTokenStatus(String str, int i10, int i11, int i12, String str2) {
        this.accessToken = str;
        this.tokenTtl = i10;
        this.refreshTtl = i11;
        this.highTrustExpiresIn = i12;
        this.error = str2;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getError() {
        return this.error;
    }

    public int getHighTrustExpiresIn() {
        return this.highTrustExpiresIn;
    }

    public int getRefreshTtl() {
        return this.refreshTtl;
    }

    public int getTokenTtl() {
        return this.tokenTtl;
    }

    public boolean hasError() {
        return !C22466q.m68722b(this.error);
    }

    public boolean isAccessTokenValid() {
        return this.tokenTtl > 0;
    }

    public boolean isHighTrust() {
        return this.highTrustExpiresIn > 0;
    }

    public boolean isRefreshTokenValid() {
        return this.refreshTtl > 0;
    }

    public AccessTokenStatus(String str, String str2) {
        this(str, 0, 0, 0, str2);
    }
}