package com.disney.wdpro.httpclient.authentication;

import com.disney.p063id.android.OneIDRecoveryContext;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/httpclient/authentication/AuthenticationDataProvider;", "", "isSSOEnabled", "", "isUserLoggedIn", "provideAccessToken", "", "provideAccessTokenStatus", "Lcom/disney/wdpro/httpclient/authentication/model/AccessTokenStatus;", OneIDRecoveryContext.ACCESS_TOKEN, "provideAuthZJwtToken", "provideRefreshToken", "provideUserSwid", "oauth-http-client_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes23.dex */
public interface AuthenticationDataProvider {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static boolean isSSOEnabled(AuthenticationDataProvider authenticationDataProvider) {
            return false;
        }

        public static boolean isUserLoggedIn(AuthenticationDataProvider authenticationDataProvider) {
            return false;
        }

        public static String provideAccessToken(AuthenticationDataProvider authenticationDataProvider) {
            return null;
        }

        public static AccessTokenStatus provideAccessTokenStatus(AuthenticationDataProvider authenticationDataProvider, String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            return null;
        }

        public static String provideAuthZJwtToken(AuthenticationDataProvider authenticationDataProvider) {
            return null;
        }

        public static String provideRefreshToken(AuthenticationDataProvider authenticationDataProvider) {
            return null;
        }

        public static String provideUserSwid(AuthenticationDataProvider authenticationDataProvider) {
            return null;
        }
    }

    boolean isSSOEnabled();

    boolean isUserLoggedIn();

    String provideAccessToken();

    AccessTokenStatus provideAccessTokenStatus(String accessToken);

    String provideAuthZJwtToken();

    String provideRefreshToken();

    String provideUserSwid();
}