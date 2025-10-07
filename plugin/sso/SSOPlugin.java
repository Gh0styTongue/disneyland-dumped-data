package com.wdpr.p479ee.p480ra.rahybrid.plugin.sso;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.model.JWTModel;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.model.OAuthTokenModel;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import com.wdpr.p479ee.p480ra.rahybrid.util.PluginUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpCookie;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Instrumented
/* loaded from: classes21.dex */
public class SSOPlugin extends Plugin implements CookieInjectable, HTTPHeaderInjectable, NavigationActionDecidable, WebMessageSendable, WebMessageReceivable {
    private static final String DATE_TIME_ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String GET_ONEID_TOKEN_DATA = "getTokenData";

    /* renamed from: ID */
    public static final String f71780ID = "SSOPlugin";
    private static final String JWT_COOKIE_NAME = "jwtCookieName";
    private static final String LOGIN_URL_REGEX = "loginUrlRegEx";
    private static final String PEP_JWT_TOKEN_NAME = "pep_jwt_token";
    private static final String REFRESH_TOKEN_ROUTE_PARAM = "{refreshToken}";
    private static final String REPLACE_RETURN_URL_KEY = "replaceReturnUrlKey";
    private static final String SEND_ONEID_TOKEN_DATA = "sendTokenData";
    private static final String TIMEOUT_COOKIE_NAME = "SESSION_TIMEOUT";
    private static final int TIMEOUT_INTERVAL = 1800;
    private static final String TOKEN_URL = "tokenUrl";
    private String accessToken;
    private List<HttpCookie> cookieList;
    private SimpleDateFormat dateFormat;
    private EntryPointsConfig entryPointsConfig;
    private String extraData;
    private GetOneIDAccessTokenForSSOListener getOneIDAccessTokenForSSOListener;
    private Map<String, String> httpHeaderList;
    private String jwt;
    private String jwtCookieName;
    private String loginURLRegEx;
    private WebMessageSender messageSender;
    private String replaceReturnUrlKey;
    private RequestTokenForSSOListener requestTokenForSSOListener;
    private List<SSOTokenUpdateListener> ssoTokenUpdateListeners;
    private JWTModel.Data.Token token;
    private String tokenURL;

    public interface GetOneIDAccessTokenForSSOListener {
        void getOneIDAccessTokenForSSO(GetOneIDAccessTokenReadyForSSOListener getOneIDAccessTokenReadyForSSOListener);
    }

    public interface GetOneIDAccessTokenReadyForSSOListener {
        void onOneIDAccessTokenReadyForSSO(String str, String str2);
    }

    public interface RequestTokenForSSOListener {
        void requestTokenForSSO(RequestTokenReadyForSSOListener requestTokenReadyForSSOListener);
    }

    public interface RequestTokenReadyForSSOListener {
        void onJWTReadyForSSO(String str);

        void onOAuthTokenReadyForSSO(OAuthTokenModel oAuthTokenModel);
    }

    public interface SSOTokenUpdateListener {
        void onTokenUpdateFailure(SSOPlugin sSOPlugin, String str);

        void onTokenUpdateReady(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig);

        void onTokenUpdateSuccess(SSOPlugin sSOPlugin, EntryPointsConfig entryPointsConfig);
    }

    public SSOPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.ssoTokenUpdateListeners = new LinkedList();
        this.cookieList = new ArrayList();
        this.httpHeaderList = new HashMap();
        if (pluginConfig == null || pluginConfig.getConfig() == null) {
            return;
        }
        Map<String, Object> config = pluginConfig.getConfig();
        this.tokenURL = PluginUtil.getConfigString(config, TOKEN_URL);
        this.loginURLRegEx = PluginUtil.getConfigString(config, LOGIN_URL_REGEX);
        this.replaceReturnUrlKey = PluginUtil.getConfigString(config, REPLACE_RETURN_URL_KEY);
        this.jwtCookieName = PluginUtil.getConfigString(config, JWT_COOKIE_NAME);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
    }

    /* renamed from: a */
    public static /* synthetic */ void m85706a(SSOPlugin sSOPlugin) {
        Iterator<SSOTokenUpdateListener> it = sSOPlugin.ssoTokenUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().onTokenUpdateReady(sSOPlugin, sSOPlugin.entryPointsConfig);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m85707b(SSOPlugin sSOPlugin, String str) {
        Iterator<SSOTokenUpdateListener> it = sSOPlugin.ssoTokenUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().onTokenUpdateFailure(sSOPlugin, str);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m85708c(SSOPlugin sSOPlugin) {
        Iterator<SSOTokenUpdateListener> it = sSOPlugin.ssoTokenUpdateListeners.iterator();
        while (it.hasNext()) {
            it.next().onTokenUpdateSuccess(sSOPlugin, sSOPlugin.entryPointsConfig);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m85709d(SSOPlugin sSOPlugin, String str) {
        sSOPlugin.getClass();
        if (TextUtils.isEmpty(str)) {
            RAHybridLog.m85712e("SSOPlugin", "JWT value is null or empty");
            sSOPlugin.notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode("JWT value is null or empty"));
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, TIMEOUT_INTERVAL);
        String str2 = sSOPlugin.dateFormat.format(calendar.getTime());
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(sSOPlugin.jwtCookieName)) {
            arrayList.add(new HttpCookie("pep_jwt_token", str));
        } else {
            arrayList.add(new HttpCookie(sSOPlugin.jwtCookieName, str));
        }
        arrayList.add(new HttpCookie("SESSION_TIMEOUT", str2));
        sSOPlugin.setCookies(arrayList);
        sSOPlugin.notifySuccessToSSOTokenUpdateListeners();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyErrorToSSOTokenUpdateListeners(final String str) {
        runOnUIThread(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.b
            @Override // java.lang.Runnable
            public final void run() {
                SSOPlugin.m85707b(this.f71782a, str);
            }
        });
    }

    private void notifyReadyToSSOTokenUpdateListeners() {
        runOnUIThread(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.a
            @Override // java.lang.Runnable
            public final void run() {
                SSOPlugin.m85706a(this.f71781a);
            }
        });
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCookiesIfJWTNotNullAndNotifySuccess(final String str) {
        runOnUIThread(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.d
            @Override // java.lang.Runnable
            public final void run() {
                SSOPlugin.m85709d(this.f71785a, str);
            }
        });
    }

    private void setGuestToken(String str, String str2) {
        this.accessToken = str;
        this.extraData = str2;
    }

    public void addSSOTokenUpdateListener(SSOTokenUpdateListener sSOTokenUpdateListener) {
        this.ssoTokenUpdateListeners.add(sSOTokenUpdateListener);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable
    public int decidePolicy(String str) {
        String str2;
        RAHybridLog.m85711d("SSOPlugin", "decidePolicy() loginUrl : " + str);
        if (str == null || str.length() == 0 || (str2 = this.loginURLRegEx) == null || !str.matches(str2)) {
            return 1;
        }
        this.jwt = null;
        if (TextUtils.isEmpty(this.replaceReturnUrlKey)) {
            this.entryPointsConfig.setStartUrl(str);
        } else {
            String strReplace = str.replace(this.replaceReturnUrlKey, "");
            try {
                this.entryPointsConfig.setStartUrl(URLDecoder.decode(strReplace, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                RAHybridLog.m85713e("SSOPlugin", "Failed to decode login callback url, " + strReplace, e10);
                this.entryPointsConfig.setStartUrl(str);
            }
        }
        notifyReadyToSSOTokenUpdateListeners();
        requestToken();
        return 0;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable
    public List<HttpCookie> getCookies() {
        return this.cookieList;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable
    public Map<String, String> getHTTPHeaders() {
        return this.httpHeaderList;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "SSOPlugin";
    }

    public String getJwt() {
        return this.jwt;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public WebMessageSender getMessageSender() {
        return this.messageSender;
    }

    public JWTModel.Data.Token getToken() {
        return this.token;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        HashMap map = new HashMap();
        map.put(GET_ONEID_TOKEN_DATA, new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.2
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                RAHybridLog.m85711d("SSOPlugin", "Received message from Web for Guest Access Token.");
                if (SSOPlugin.this.getOneIDAccessTokenForSSOListener != null) {
                    SSOPlugin.this.getOneIDAccessTokenForSSOListener.getOneIDAccessTokenForSSO(new GetOneIDAccessTokenReadyForSSOListener() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.2.1
                        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.GetOneIDAccessTokenReadyForSSOListener
                        public void onOneIDAccessTokenReadyForSSO(String str3, String str4) {
                            SSOPlugin.this.sendOneIDTokenData(str3, str4);
                        }
                    });
                } else {
                    RAHybridLog.m85712e("SSOPlugin", "Native app hasn't implemented getOneIDAccessTokenForSSOListener");
                    SSOPlugin.this.sendOneIDTokenData(null, null);
                }
            }
        });
        return map;
    }

    public void notifySuccessToSSOTokenUpdateListeners() {
        runOnUIThread(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.c
            @Override // java.lang.Runnable
            public final void run() {
                SSOPlugin.m85708c(this.f71784a);
            }
        });
    }

    public void processJWTResponse(Response response) {
        try {
            int iCode = response.code();
            ResponseBody responseBodyBody = response.body();
            if (iCode != 200 || responseBodyBody == null) {
                RAHybridLog.m85712e("SSOPlugin", "Error Http Status Code: " + iCode);
                notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode("Error Http Status Code: " + iCode));
                return;
            }
            JWTModel jWTModel = (JWTModel) GsonInstrumentation.fromJson(new Gson(), responseBodyBody.string(), JWTModel.class);
            if (jWTModel == null) {
                RAHybridLog.m85712e("SSOPlugin", "jwtModel is null");
                notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode("jwtModel is null"));
                return;
            }
            JWTModel.Data data = jWTModel.getData();
            if (data == null || data.getJwt() == null || data.getToken() == null) {
                RAHybridLog.m85712e("SSOPlugin", "jwtModel.data is null");
                notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode("jwtModel.data is null"));
                return;
            }
            RAHybridLog.m85711d("SSOPlugin", "data generated\n" + data);
            String jwt = data.getJwt();
            RAHybridLog.m85711d("SSOPlugin", "JWT generated");
            this.jwt = jwt;
            JWTModel.Data.Token token = data.getToken();
            RAHybridLog.m85711d("SSOPlugin", "New token generated");
            this.token = token;
            setCookiesIfJWTNotNullAndNotifySuccess(jwt);
        } catch (IOException e10) {
            e10.printStackTrace();
            RAHybridLog.m85712e("SSOPlugin", "onResponse: " + e10.getMessage());
            notifyErrorToSSOTokenUpdateListeners(Constants.MALFORMED_RESPONSE);
        }
    }

    public void requestToken() {
        RequestTokenForSSOListener requestTokenForSSOListener = this.requestTokenForSSOListener;
        if (requestTokenForSSOListener != null) {
            requestTokenForSSOListener.requestTokenForSSO(new RequestTokenReadyForSSOListener() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.1
                @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenReadyForSSOListener
                public void onJWTReadyForSSO(String str) {
                    SSOPlugin.this.setCookiesIfJWTNotNullAndNotifySuccess(str);
                }

                @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenReadyForSSOListener
                public void onOAuthTokenReadyForSSO(OAuthTokenModel oAuthTokenModel) {
                    URL url;
                    if (SSOPlugin.this.tokenURL == null) {
                        RAHybridLog.m85712e("SSOPlugin", "tokenURL not set");
                        SSOPlugin.this.notifyErrorToSSOTokenUpdateListeners(Constants.TOKEN_URL_NULL);
                        return;
                    }
                    try {
                        url = new URL(SSOPlugin.this.tokenURL.replace(SSOPlugin.REFRESH_TOKEN_ROUTE_PARAM, oAuthTokenModel.getRefreshToken()));
                    } catch (MalformedURLException e10) {
                        e10.printStackTrace();
                        SSOPlugin.this.notifyErrorToSSOTokenUpdateListeners(Constants.FAILED_TO_CREATE_REFRESH_AUTH_URL);
                        url = null;
                    }
                    new ProfileService(url).generateJWTWithAccessToken(oAuthTokenModel.getAccessToken(), new Callback() { // from class: com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.1.1
                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException iOException) {
                            SSOPlugin.this.notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode(iOException.getMessage()));
                        }

                        @Override // okhttp3.Callback
                        public void onResponse(Call call, Response response) {
                            SSOPlugin.this.processJWTResponse(response);
                        }
                    });
                }
            });
        } else {
            RAHybridLog.m85712e("SSOPlugin", "requestTokenForSSOListener is null");
            notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode("RequestTokenForSSOListener not set"));
        }
    }

    public void sendOneIDTokenData(String str, String str2) {
        WebMessageSender webMessageSender = this.messageSender;
        if (webMessageSender != null) {
            webMessageSender.send(SEND_ONEID_TOKEN_DATA, new String[]{str, str2});
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.CookieInjectable
    public void setCookies(List<HttpCookie> list) {
        this.cookieList.clear();
        if (list != null) {
            this.cookieList.addAll(list);
        }
    }

    public void setEntryPointsConfig(EntryPointsConfig entryPointsConfig) {
        if (entryPointsConfig == null) {
            notifyErrorToSSOTokenUpdateListeners(Constants.getSSOErrorCode("setEntryPointsConfig(): entryPointsConfig is null"));
        }
        this.entryPointsConfig = entryPointsConfig;
    }

    public void setGetOneIdAccessTokenForSSOListener(GetOneIDAccessTokenForSSOListener getOneIDAccessTokenForSSOListener) {
        this.getOneIDAccessTokenForSSOListener = getOneIDAccessTokenForSSOListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.HTTPHeaderInjectable
    public void setHTTPHeaders(Map<String, String> map) {
        this.httpHeaderList.clear();
        if (map != null) {
            this.httpHeaderList.putAll(map);
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender webMessageSender) {
        this.messageSender = webMessageSender;
    }

    public void setRequestTokenForSSOListener(RequestTokenForSSOListener requestTokenForSSOListener) {
        this.requestTokenForSSOListener = requestTokenForSSOListener;
    }
}