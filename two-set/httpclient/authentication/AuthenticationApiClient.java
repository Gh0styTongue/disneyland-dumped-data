package com.disney.wdpro.httpclient.authentication;

import android.accounts.AuthenticatorException;
import com.disney.wdpro.httpclient.C13330c;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.httpclient.authentication.model.LoginResponse;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.io.IOException;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes23.dex */
public class AuthenticationApiClient {
    private final AuthConfig authConfig;
    private final HttpApiClient client;
    private final AuthEnvironment environment;

    private static class LoginRequest {
        private String loginValue;
        private String password;

        public LoginRequest(String str, String str2) {
            this.loginValue = str;
            this.password = str2;
        }
    }

    private static class LoginWithRefreshTokenRequest {
        private String refreshToken;

        public LoginWithRefreshTokenRequest(String str) {
            this.refreshToken = str;
        }
    }

    private class PublicAuthenticationInterceptor extends C13330c {
        private final String clientId;

        public PublicAuthenticationInterceptor(AuthenticationManager authenticationManager, String str) {
            super(authenticationManager, "com.disney.android.public", null);
            this.clientId = str;
        }

        @Override // com.disney.wdpro.httpclient.C13330c
        protected String getToken(String str, String str2) throws AuthenticatorException {
            try {
                Optional<String> optionalPeekAuthToken = this.authManager.peekAuthToken(this.clientId, str);
                return optionalPeekAuthToken.isPresent() ? optionalPeekAuthToken.get() : this.authManager.getPublicToken(this.clientId);
            } catch (Exception e10) {
                throw new AuthenticatorException(e10);
            }
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13353y
        public /* bridge */ /* synthetic */ void interceptException(IOException iOException) {
            super.interceptException(iOException);
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13353y
        public /* bridge */ /* synthetic */ void responseBodyEnd() {
            super.responseBodyEnd();
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13353y
        public /* bridge */ /* synthetic */ void responseBodyStart() {
            super.responseBodyStart();
        }
    }

    @Inject
    public AuthenticationApiClient(HttpApiClient httpApiClient, AuthEnvironment authEnvironment, AuthConfig authConfig) {
        this.environment = (AuthEnvironment) C22462m.m68685q(authEnvironment, "The AuthEnvironment cannot be null.");
        C22462m.m68684p(authEnvironment.getAuthzServiceUrl());
        C22462m.m68684p(authEnvironment.getProfileServiceBaseUrl());
        C22462m.m68684p(authEnvironment.getAuthzClientId());
        this.client = (HttpApiClient) C22462m.m68684p(httpApiClient);
        this.authConfig = (AuthConfig) C22462m.m68684p(authConfig);
    }

    @Deprecated
    public LoginResponse loginWithRefreshToken(AuthenticationManager authenticationManager, String str, String str2, String str3) throws JSONException, IOException {
        PublicAuthenticationInterceptor publicAuthenticationInterceptor = new PublicAuthenticationInterceptor(authenticationManager, str);
        HttpApiClient.C13320c c13320cM55535y = this.client.m55506i(this.environment.getProfileServiceBaseUrl(), LoginResponse.class).m55518f("v4/clients").m55519g(str).m55518f("guests/login/refreshToken").m55523m().m55536z(publicAuthenticationInterceptor).m55534x(publicAuthenticationInterceptor).m55528r(LoginResponse.class).m55526p(new LoginWithRefreshTokenRequest(str2)).m55535y(new InterfaceC13334f.a());
        if (!C22466q.m68722b(str3)) {
            c13320cM55535y.m55531u("generateJwt", str3);
        }
        return (LoginResponse) c13320cM55535y.m55521i().m55683c();
    }

    public JSONObject publicAuthentication(String str) throws JSONException, IOException {
        return (JSONObject) this.client.m55506i(this.environment.getAuthzServiceUrl(), JSONObject.class).m55519g("token").m55526p("grant_type=assertion&assertion_type=public&client_id=" + str).m55524n().m55535y(new InterfaceC13334f.b()).m55521i().m55683c();
    }
}