package com.disney.wdpro.universal_checkout_ui.models;

import com.google.common.base.Optional;
import java.io.Serializable;

/* loaded from: classes20.dex */
public class JWTModel implements Serializable {
    private static final long serialVersionUID = -2680941841030155102L;
    private Optional<Data> data = Optional.absent();

    public class Data implements Serializable {
        private static final long serialVersionUID = -2527340200761770560L;
        private Optional<Token> token = Optional.absent();
        private Optional<String> jwt = Optional.absent();

        public Data() {
        }

        public String getJwt() {
            return this.jwt.orNull();
        }

        public Token getToken() {
            return this.token.orNull();
        }
    }

    public class Token implements Serializable {
        private static final long serialVersionUID = 801592674382183241L;
        private int refreshTtl;
        private int ttl;
        private Optional<String> swid = Optional.absent();
        private Optional<String> scope = Optional.absent();
        private Optional<String> authenticator = Optional.absent();
        private Optional<String> sessionTransferKey = Optional.absent();
        private Optional<String> accessToken = Optional.absent();
        private Optional<String> refreshToken = Optional.absent();
        private Optional<String> highTrustExpiresIn = Optional.absent();
        private Optional<String> initialGrantInChainTime = Optional.absent();

        public Token() {
        }

        public String getAccessToken() {
            return this.accessToken.orNull();
        }

        public String getAuthenticator() {
            return this.authenticator.orNull();
        }

        public String getHighTrustExpiresIn() {
            return this.highTrustExpiresIn.orNull();
        }

        public String getInitialGrantInChainTime() {
            return this.initialGrantInChainTime.orNull();
        }

        public String getRefreshToken() {
            return this.refreshToken.orNull();
        }

        public int getRefreshTtl() {
            return this.refreshTtl;
        }

        public String getScope() {
            return this.scope.orNull();
        }

        public String getSessionTransferKey() {
            return this.sessionTransferKey.orNull();
        }

        public String getSwid() {
            return this.swid.orNull();
        }

        public int getTtl() {
            return this.ttl;
        }
    }

    public Data getData() {
        return this.data.orNull();
    }
}