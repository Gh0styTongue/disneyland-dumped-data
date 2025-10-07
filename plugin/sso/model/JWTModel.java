package com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.model;

import com.disney.p063id.android.Guest;
import com.disney.p063id.android.tracker.OneIDTrackerEvent;
import com.disney.wdpro.dinecheckin.services.checkin.model.CheckInServiceConstantsKt;
import com.disney.wdpro.flutter.park.badging.NotificationCenterDocumentsChangeListener;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes21.dex */
public class JWTModel {

    @SerializedName("data")
    private Data data;

    @SerializedName("error")
    private Error error;

    public class Data {

        @SerializedName(Guest.ETAG)
        private String etag;

        @SerializedName("extra_data")
        private String extraData;

        @SerializedName("jwt")
        private String jwt;

        @SerializedName("token")
        private Token token;

        public class Token {

            @SerializedName(com.disney.p063id.android.Token.ACCESS_TOKEN)
            private String accessToken;

            @SerializedName("authenticator")
            private String authenticator;

            @SerializedName("created")
            private String created;

            @SerializedName(NotificationCenterDocumentsChangeListener.EXP_CHANNEL_NAME)
            private long exp;

            @SerializedName("expires")
            private String expires;

            @SerializedName("high_trust_exp")
            private long highTrustExp;

            @SerializedName("high_trust_expires_in")
            private long highTrustExpiresIn;

            @SerializedName("iat")
            private long iat;

            @SerializedName(OneIDTrackerEvent.EVENT_PARAM_ID_TOKEN)
            private String idToken;

            @SerializedName("initial_grant_in_chain_time")
            private long initialGrantInChainTime;

            @SerializedName("lastChecked")
            private String lastChecked;

            @SerializedName("refresh_exp")
            private long refreshExp;

            @SerializedName("refresh_expires")
            private String refreshExpires;

            @SerializedName("refresh_token")
            private String refreshToken;

            @SerializedName("refresh_ttl")
            private long refreshTtl;

            @SerializedName("sessionTransferKey")
            private String sessionTransferKey;

            @SerializedName("swid")
            private String swid;

            @SerializedName("ttl")
            private long ttl;

            public Token() {
            }

            public String getAccessToken() {
                return this.accessToken;
            }

            public String getAuthenticator() {
                return this.authenticator;
            }

            public String getCreated() {
                return this.created;
            }

            public long getExp() {
                return this.exp;
            }

            public String getExpires() {
                return this.expires;
            }

            public long getHighTrustExp() {
                return this.highTrustExp;
            }

            public long getHighTrustExpiresIn() {
                return this.highTrustExpiresIn;
            }

            public long getIat() {
                return this.iat;
            }

            public String getIdToken() {
                return this.idToken;
            }

            public long getInitialGrantInChainTime() {
                return this.initialGrantInChainTime;
            }

            public String getLastChecked() {
                return this.lastChecked;
            }

            public long getRefreshExp() {
                return this.refreshExp;
            }

            public String getRefreshExpires() {
                return this.refreshExpires;
            }

            public String getRefreshToken() {
                return this.refreshToken;
            }

            public long getRefreshTtl() {
                return this.refreshTtl;
            }

            public String getSessionTransferKey() {
                return this.sessionTransferKey;
            }

            public String getSwid() {
                return this.swid;
            }

            public long getTtl() {
                return this.ttl;
            }

            public void setAccessToken(String str) {
                this.accessToken = str;
            }

            public void setAuthenticator(String str) {
                this.authenticator = str;
            }

            public void setCreated(String str) {
                this.created = str;
            }

            public void setExp(long j10) {
                this.exp = j10;
            }

            public void setExpires(String str) {
                this.expires = str;
            }

            public void setHighTrustExp(long j10) {
                this.highTrustExp = j10;
            }

            public void setHighTrustExpiresIn(long j10) {
                this.highTrustExpiresIn = j10;
            }

            public void setIat(long j10) {
                this.iat = j10;
            }

            public void setIdToken(String str) {
                this.idToken = str;
            }

            public void setInitialGrantInChainTime(long j10) {
                this.initialGrantInChainTime = j10;
            }

            public void setLastChecked(String str) {
                this.lastChecked = str;
            }

            public void setRefreshExp(long j10) {
                this.refreshExp = j10;
            }

            public void setRefreshExpires(String str) {
                this.refreshExpires = str;
            }

            public void setRefreshToken(String str) {
                this.refreshToken = str;
            }

            public void setRefreshTtl(long j10) {
                this.refreshTtl = j10;
            }

            public void setSessionTransferKey(String str) {
                this.sessionTransferKey = str;
            }

            public void setSwid(String str) {
                this.swid = str;
            }

            public void setTtl(long j10) {
                this.ttl = j10;
            }
        }

        public Data() {
        }

        public String getEtag() {
            return this.etag;
        }

        public String getExtraData() {
            return this.extraData;
        }

        public String getJwt() {
            return this.jwt;
        }

        public Token getToken() {
            return this.token;
        }

        public void setEtag(String str) {
            this.etag = str;
        }

        public void setExtraData(String str) {
            this.extraData = str;
        }

        public void setJwt(String str) {
            this.jwt = str;
        }

        public void setToken(Token token) {
            this.token = token;
        }
    }

    public class Error {

        @SerializedName("conversationId")
        private String conversationId;

        @SerializedName("correlationId")
        private String correlationId;

        @SerializedName("keyCategory")
        private String keyCategory;

        @SerializedName("errors")
        private List<Error_> mErrors = null;

        class Error_ {

            @SerializedName("category")
            private String category;

            @SerializedName(CheckInServiceConstantsKt.PROPERTY_CODE)
            private String code;

            @SerializedName("errorId")
            private String errorId;

            @SerializedName("inputName")
            private String inputName;

            @SerializedName("timestamp")
            private String timestamp;

            Error_() {
            }

            public String getCategory() {
                return this.category;
            }

            public String getCode() {
                return this.code;
            }

            public String getErrorId() {
                return this.errorId;
            }

            public String getInputName() {
                return this.inputName;
            }

            public String getTimestamp() {
                return this.timestamp;
            }

            public void setCategory(String str) {
                this.category = str;
            }

            public void setCode(String str) {
                this.code = str;
            }

            public void setErrorId(String str) {
                this.errorId = str;
            }

            public void setInputName(String str) {
                this.inputName = str;
            }

            public void setTimestamp(String str) {
                this.timestamp = str;
            }
        }

        public Error() {
        }

        public String getConversationId() {
            return this.conversationId;
        }

        public String getCorrelationId() {
            return this.correlationId;
        }

        public List<Error_> getErrors() {
            return this.mErrors;
        }

        public String getKeyCategory() {
            return this.keyCategory;
        }

        public void setConversationId(String str) {
            this.conversationId = str;
        }

        public void setCorrelationId(String str) {
            this.correlationId = str;
        }

        public void setErrors(List<Error_> list) {
            this.mErrors = list;
        }

        public void setKeyCategory(String str) {
            this.keyCategory = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public Error getError() {
        return this.error;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setError(Error error) {
        this.error = error;
    }
}