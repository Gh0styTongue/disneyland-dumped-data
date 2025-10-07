package com.disney.wdpro.httpclient;

import com.disney.wdpro.analytics.C8677i;
import com.disney.wdpro.analytics.C8681m;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.httpclient.authentication.model.LoginResponse;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/* renamed from: com.disney.wdpro.httpclient.a */
/* loaded from: classes23.dex */
public class C13322a {
    public static final String EVENT_INVALIDATE_TOKEN = "Invalidate Token";
    public static final String EVENT_RETRIEVE_TOKENS = "Retrieve Tokens";
    public static final String EVENT_SERVICE_REQUEST = "Service Request";
    public static final String EVENT_TOKEN_UPDATE = "Token Update";
    public static final String EVENT_USER_SIGN_OUT = "User Sign Out";
    private InterfaceC8682n crashHelper;
    private final String SSO_EVEN_TYPE = "SSOAction";
    private final String EVENT_ACCOUNT_SAVE_DATA = "Account save data";
    private final String EVENT_DELETE_ACCOUNT = "Delete Account";
    private final String ACTION_TYPE = "actionType";
    private final String TYPE_USER = "User";
    private final String TYPE_SYSTEM = "System";
    private final String COMPONENT = "component";
    private final String COMPONENT_OAUTH = "Oauth";
    private final String COMPONENT_ACCOUNT_MANAGER = "AccountManager";
    private final String CLIENT_ID = "client.id";
    private final String APP_SHORT_NAME = "appShortName";
    private final String DID_TRIED_TO_SIGNIN = "didTriedToSignIn";
    private final String HAS_TOKEN = "hasToken";
    private final String SIGNEE_STATUS = "signeeStatus";
    private final String STATUS_SIGNEDIN = "SignedIn";
    private final String STATUS_SIGNEDOUT = "SignedOut";
    private final String SIGNEE_STYLE = "signeeStyle";
    private final String STYLE_SSO = "SSO";
    private final String STYLE_MANUAL = "Manual";
    private final String SSO_ENABLED = "ssoEnabled";
    private final String TIME_TO_LIVE = "ttl";
    private final String TOKEN_TYPE = "token.type";
    private final String TOKEN_IS_VALID = "tokenIsValid";
    private final String USER_BAD_CREDENTIALS = "userBadCredentials";
    private final String ACCOUNT_LOCKED = "accountLocked";
    private final String ACCOUNT_SECURITY_LOCKED = "accountSecurityLocked";
    private final String SAVE_DATA_TYPE = "data.type";
    private final String LOGIN_REQUEST_TYPE = "loginRequestType";
    private final String LOGIN_WITH_REFRESH_TOKEN_REQUEST = "Login with refresh token Request";

    @Inject
    public C13322a(InterfaceC8682n interfaceC8682n) {
        this.crashHelper = interfaceC8682n;
    }

    /* renamed from: b */
    private void m55549b(String str, String str2, String str3, Map<String, String> map) {
        C8681m c8681mM37440d = new C8681m.a(str).m37439c("component", str2).m37439c("actionType", str3).m37437a(map).m37440d();
        this.crashHelper.recordCustomEvent("SSOAction", c8681mM37440d.m37435a(), new HashMap(c8681mM37440d.m37436b()));
    }

    /* renamed from: a */
    public void m55550a(String str, LoginResponse loginResponse, boolean z10) {
        C8677i c8677i = new C8677i(false);
        if (loginResponse != null) {
            c8677i.m37425c("didTriedToSignIn", Boolean.TRUE).m37425c("ttl", loginResponse.getAccessTokenTTL()).m37424b("hasToken", loginResponse.getAccessToken() != null ? 1 : 0).m37424b("accountLocked", loginResponse.isAccountLocked() ? 1 : 0).m37424b("accountSecurityLocked", loginResponse.isAccountSecurityLocked() ? 1 : 0).m37424b("userBadCredentials", loginResponse.hasWrongCredentials() ? 1 : 0).m37425c("loginRequestType", "Login with refresh token Request").m37425c("signeeStyle", z10 ? "SSO" : "Manual").m37425c("signeeStatus", loginResponse.isAuthenticated() ? "SignedIn" : "SignedOut");
        }
        m55549b(str, "Oauth", z10 ? "System" : "User", c8677i.m37428f());
    }

    /* renamed from: c */
    public void m55551c(String str, String str2, boolean z10) {
        m55549b("Account save data", "AccountManager", "System", new C8677i(false).m37425c("data.type", str2).m37425c("com.disney.account.applications_data", str).m37424b("ssoEnabled", z10 ? 1 : 0).m37428f());
    }

    /* renamed from: d */
    public void m55552d(String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        int i10 = 0;
        C8677i c8677iM37425c = new C8677i(false).m37424b("ssoEnabled", z11 ? 1 : 0).m37424b("hasToken", z10 ? 1 : 0).m37425c("client.id", str2).m37425c("token.type", str3).m37425c("ttl", str4);
        if (str4 != null && Long.parseLong(str4) < System.currentTimeMillis()) {
            i10 = 1;
        }
        m55549b(str, "AccountManager", "System", c8677iM37425c.m37424b("tokenIsValid", i10).m37428f());
    }
}