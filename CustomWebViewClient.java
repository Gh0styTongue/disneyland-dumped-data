package com.wdpr.p479ee.p480ra.rahybrid;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.CustomWebViewClient;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewLifecycleInfoProvider;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.ProxyConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.WebServerConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridNavigationInteractor;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecycleObservable;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStoreFactory;
import com.wdpr.p479ee.p480ra.rahybrid.server.AjaxWriteHandler.AjaxInterceptJavascriptInterface;
import com.wdpr.p479ee.p480ra.rahybrid.server.AjaxWriteHandler.WriteHandlingWebResourceRequest;
import com.wdpr.p479ee.p480ra.rahybrid.server.HybridContentServer;
import com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.PersistentCookieJar;
import com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.cache.SetCookieCache;
import com.wdpr.p479ee.p480ra.rahybrid.server.PersistenceCookieJar.persistence.SharedPrefsCookiePersistor;
import com.wdpr.p479ee.p480ra.rahybrid.util.CookiesAndHeadersUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import com.wdpr.p479ee.p480ra.rahybrid.util.UrlLoadingTracker;
import com.wdpr.p479ee.p480ra.rahybrid.util.WriteHandlingUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpCookie;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Instrumented
/* loaded from: classes21.dex */
public class CustomWebViewClient extends WebViewClient {
    private static final int CONNECTION_TIME_OUT_IN_SEC = 120;
    private static final String CONTENT_ENCODING = "content-encoding";
    private static final String CONTENT_TYPE = "content-type";
    private static final String EVENT_READY = "disneyRAWebViewBridgeReady";
    public static final String INTERCEPTION = "interception";
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final int KEEP_ALIVE_DURATION = 600;
    private static final int MAX_CONNECTIONS = 5;
    private static final int MAX_REQUESTS = 5;
    private static final int MAX_REQUESTS_PER_HOST = 5;
    private static final String NO_MESSAGE = "No Message";
    private static final int ONE_SEC_IN_MS = 1000;
    private static final int READ_TIME_OUT_IN_SEC = 120;
    private static final String TAG = "CustomWebViewClient";
    private PersistentCookieJar cookieJar;
    private OkHttpClient customOkHttpClient;
    private EntryPointsConfig entryPointsConfig;
    private boolean hasFinish;
    public boolean hasPageReady;
    private boolean hasPageStartedState;
    public HybridNavigationInteractor navigationInteractor;
    private OkHttpClient okHttpClient;
    private WebViewClient otherClient;
    private int pageReadyTimeoutInSec;
    private Handler timeoutHandlerForPageReady;
    private Handler timeoutHandlerForWebViewFinish;
    private WebServer webServer;
    private WebViewBridge webViewBridge;
    private int webViewFinishTimeoutInSec;
    private List<WebViewLifecycleObservable> webViewLifecycleObservableList;
    boolean whitelisted;
    public UrlLoadingTracker urlTracker = new UrlLoadingTracker();
    private boolean useCustomOkHttpClient = false;
    private Map<String, String> ajaxRequestContents = new ConcurrentHashMap();
    private int currentState = 2000;

    /* renamed from: com.wdpr.ee.ra.rahybrid.CustomWebViewClient$2 */
    class C269602 extends CallbackHandler<String> {
        final /* synthetic */ String val$url;
        final /* synthetic */ WebView val$view;

        C269602(WebView webView, String str) {
            this.val$view = webView;
            this.val$url = str;
        }

        /* renamed from: a */
        public static /* synthetic */ void m85703a(C269602 c269602, WebView webView, String str, String str2) {
            c269602.getClass();
            CustomWebViewClient.this.postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str).setLifeCycleState(2004).setReadyJSONResponse(str2).build());
        }

        @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
        public void onMessage(String str, final String str2) {
            CustomWebViewClient.this.hasPageReady = true;
            final WebView webView = this.val$view;
            final String str3 = this.val$url;
            webView.post(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.c
                @Override // java.lang.Runnable
                public final void run() {
                    CustomWebViewClient.C269602.m85703a(this.f71762a, webView, str3, str2);
                }
            });
        }
    }

    CustomWebViewClient(WebView webView, WebViewClient webViewClient, WebViewBridge webViewBridge, EntryPointsConfig entryPointsConfig, boolean z10, HybridNavigationInteractor hybridNavigationInteractor) {
        this.webViewBridge = webViewBridge;
        if (webViewClient instanceof CustomWebViewClient) {
            this.otherClient = ((CustomWebViewClient) webViewClient).otherClient;
        } else {
            this.otherClient = webViewClient;
        }
        this.entryPointsConfig = entryPointsConfig;
        this.whitelisted = z10;
        this.navigationInteractor = hybridNavigationInteractor;
        setupProxyHttpClient(webView);
    }

    private void cancelPageReadyTimeoutHandler() {
        if (this.timeoutHandlerForPageReady != null) {
            this.timeoutHandlerForPageReady = null;
        }
    }

    private void cancelWebViewFinishTimeoutHandler() {
        if (this.timeoutHandlerForWebViewFinish != null) {
            this.timeoutHandlerForWebViewFinish = null;
            this.hasFinish = true;
        }
    }

    private String formatPrefix(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.startsWith("/") ? "" : "/");
        sb2.append(str);
        sb2.append(str.endsWith("/") ? "" : "/");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.webkit.WebResourceResponse handleRequestNatively(java.lang.String r11, com.wdpr.p479ee.p480ra.rahybrid.server.AjaxWriteHandler.WriteHandlingWebResourceRequest r12) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wdpr.p479ee.p480ra.rahybrid.CustomWebViewClient.handleRequestNatively(java.lang.String, com.wdpr.ee.ra.rahybrid.server.AjaxWriteHandler.WriteHandlingWebResourceRequest):android.webkit.WebResourceResponse");
    }

    private WebResourceResponse injectIntercept(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, Context context) {
        Uri url = webResourceRequest.getUrl();
        if (this.entryPointsConfig == null || !url.toString().equalsIgnoreCase(this.entryPointsConfig.getStartUrl())) {
            return webResourceResponse;
        }
        String strName = webResourceResponse.getEncoding() == null ? StandardCharsets.UTF_8.name() : webResourceResponse.getEncoding();
        String mimeType = webResourceResponse.getMimeType();
        return new WebResourceResponse(mimeType, strName, injectInterceptToStream(context, webResourceResponse.getData(), mimeType, strName));
    }

    private InputStream injectInterceptToStream(Context context, InputStream inputStream, String str, String str2) throws UnsupportedEncodingException {
        try {
            byte[] bArrConsumeInputStream = WriteHandlingUtil.consumeInputStream(inputStream);
            if (str.equals("text/html")) {
                bArrConsumeInputStream = AjaxInterceptJavascriptInterface.enableIntercept(context, bArrConsumeInputStream).getBytes(str2);
            }
            return new ByteArrayInputStream(bArrConsumeInputStream);
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    private void injectPrintFunction(WebView webView) {
        RAHybridLog.m85711d(TAG, "Injecting java script function to handle window.print into the WebView");
        webView.loadUrl("javascript:window.print = function() { disneyRAWebViewBridge.postMessage('PrintPlugin.print', null, null) }");
    }

    private void setCustomHTTPHeaders(Request.Builder builder) {
        for (Map.Entry<String, String> entry : CookiesAndHeadersUtil.gatherHTTPHeaders(PluginStoreFactory.getPluginStore()).entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }
    }

    private void setHTTPCookies(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null) {
            List<HttpCookie> listGatherCookies = CookiesAndHeadersUtil.gatherCookies(PluginStoreFactory.getPluginStore());
            Iterator<HttpCookie> it = listGatherCookies.iterator();
            while (it.hasNext()) {
                it.next().setDomain(httpUrl.host());
            }
            this.cookieJar.saveFromResponse(httpUrl, CookiesAndHeadersUtil.convertHTTPCookieToOKHTTPCookie(httpUrl, listGatherCookies));
        }
    }

    private void setHttpClientLoadTimeOut(ProxyConfig proxyConfig) {
        Integer timeout = proxyConfig.getTimeout();
        if (timeout == null) {
            this.useCustomOkHttpClient = false;
            return;
        }
        this.useCustomOkHttpClient = true;
        OkHttpClient.Builder builderNewBuilder = this.okHttpClient.newBuilder();
        long jIntValue = timeout.intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.customOkHttpClient = builderNewBuilder.connectTimeout(jIntValue, timeUnit).readTimeout(timeout.intValue(), timeUnit).build();
    }

    private void setWebResourceRequestHTTPHeaders(WriteHandlingWebResourceRequest writeHandlingWebResourceRequest, Request.Builder builder) {
        Map<String, String> requestHeaders = writeHandlingWebResourceRequest.getRequestHeaders();
        if (requestHeaders != null) {
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    private void setupProxyHttpClient(WebView webView) {
        this.cookieJar = new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(webView.getContext().getApplicationContext()));
        ConnectionPool connectionPool = new ConnectionPool(5, 600L, TimeUnit.MILLISECONDS);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(5);
        dispatcher.setMaxRequestsPerHost(5);
        OkHttpClient.Builder builderConnectionPool = new OkHttpClient.Builder().dispatcher(dispatcher).cookieJar(this.cookieJar).connectionPool(connectionPool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.okHttpClient = builderConnectionPool.connectTimeout(120L, timeUnit).readTimeout(120L, timeUnit).build();
        webView.addJavascriptInterface(new AjaxInterceptJavascriptInterface(this), INTERCEPTION);
    }

    private void startWebViewLoadTimeoutHandlers(final WebView webView, final String str) {
        if (this.timeoutHandlerForWebViewFinish != null && this.webViewFinishTimeoutInSec > 0) {
            this.timeoutHandlerForWebViewFinish.postDelayed(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71756a.notifyWebViewFinishTimeOut(webView, str);
                }
            }, this.webViewFinishTimeoutInSec * 1000);
        }
        if (this.timeoutHandlerForPageReady == null || this.pageReadyTimeoutInSec <= 0) {
            return;
        }
        this.timeoutHandlerForPageReady.postDelayed(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f71759a.notifyPageReadyTimeOut(webView, str);
            }
        }, this.pageReadyTimeoutInSec * 1000);
    }

    public void addAjaxRequest(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.ajaxRequestContents.put(str, str2);
    }

    public ProxyConfig getProxyConfigThatHandlesRequest(Uri uri, WebServerConfig webServerConfig) {
        String path = uri.getPath();
        if (path != null && webServerConfig != null && webServerConfig.getProxyConfigs() != null && webServerConfig.getProxyConfigs().size() > 0) {
            for (ProxyConfig proxyConfig : webServerConfig.getProxyConfigs()) {
                if (isRequestMatchesPrefix(path, proxyConfig.getPrefix())) {
                    RAHybridLog.m85711d(TAG, "proxy configs match requestUri: " + uri);
                    return proxyConfig;
                }
            }
        }
        RAHybridLog.m85716w(TAG, "ProxyConfig not found for requestUri: " + uri);
        return null;
    }

    public void handleErrorOnBelowAndroidM(WebView webView, int i10, String str, String str2) {
        String str3 = String.format(webView.getContext().getString(C26961R.string.error_msg_for_web_view_http_status_code), Integer.valueOf(i10), str2, str);
        RAHybridLog.m85712e("handleErrorOn22Or21", str3);
        if (this.urlTracker.checkIfErrorIsMainUrlAndAddIfNeeded(str2)) {
            postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str2).setLifeCycleState(2006).setErrorType(4002).setErrorCode(i10).setDescription(str3).build());
        }
    }

    public WebResourceResponse handleProxyRequest(WriteHandlingWebResourceRequest writeHandlingWebResourceRequest, ProxyConfig proxyConfig) {
        String method = writeHandlingWebResourceRequest.getMethod();
        String str = TAG;
        RAHybridLog.m85711d(str, "handleProxyRequest() Method: " + method);
        String string = writeHandlingWebResourceRequest.getUrl().toString();
        String prefix = proxyConfig.getPrefix();
        String strSubstring = string.substring(string.indexOf(prefix) + prefix.length());
        String url = proxyConfig.getUrl();
        if (!url.endsWith("/") && !strSubstring.startsWith("/")) {
            url = url + "/";
        }
        String str2 = url + strSubstring;
        RAHybridLog.m85711d(str, "Remote URL : " + str2);
        return handleRequestNatively(str2, writeHandlingWebResourceRequest);
    }

    boolean hasPageStartedState() {
        return this.hasPageStartedState;
    }

    public void initializeWebViewLoadTimeOutHandlers(EntryPointsConfig entryPointsConfig) {
        if (entryPointsConfig != null) {
            int webViewFinishTimeoutInSec = entryPointsConfig.getWebViewFinishTimeoutInSec();
            if (webViewFinishTimeoutInSec > 0) {
                this.webViewFinishTimeoutInSec = webViewFinishTimeoutInSec;
                this.timeoutHandlerForWebViewFinish = new Handler();
            }
            int readyMessageTimeoutInSec = entryPointsConfig.getReadyMessageTimeoutInSec();
            if (readyMessageTimeoutInSec > 0) {
                this.pageReadyTimeoutInSec = readyMessageTimeoutInSec;
                this.timeoutHandlerForPageReady = new Handler();
            }
        }
    }

    public boolean isRequestMatchesPrefix(String str, String str2) {
        return str.matches("^" + formatPrefix(str2) + ".*");
    }

    public void notifyOnBackPressedInternal() {
        this.urlTracker.notifyOnBackPressed();
    }

    public void notifyPageReadyTimeOut(WebView webView, String str) {
        if (this.hasPageReady) {
            return;
        }
        postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str).setLifeCycleState(2007).setTimeoutType(5001).setDescription("Did not receive ready message in " + this.pageReadyTimeoutInSec + " Seconds for URL: " + str).build());
        cancelPageReadyTimeoutHandler();
    }

    public void notifyWebViewFinishTimeOut(WebView webView, String str) {
        if (this.hasFinish) {
            return;
        }
        postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str).setLifeCycleState(2007).setTimeoutType(2002).setDescription("Did not finish loading URL in " + this.webViewFinishTimeoutInSec + " Seconds for URL: " + str).build());
        cancelWebViewFinishTimeoutHandler();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        injectPrintFunction(webView);
        cancelWebViewFinishTimeoutHandler();
        RAHybridLog.m85711d("onPageFinished", "client notified of error-free load");
        RAHybridLog.m85711d("onPageFinished", "url: " + str);
        postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str).setLifeCycleState(2003).build());
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        RAHybridLog.m85711d("onPageStarted", str);
        super.onPageStarted(webView, str, bitmap);
        this.webViewBridge.addWebViewCustomHandler(EVENT_READY, new C269602(webView, str));
        this.urlTracker.addUrlCurrentlyLoadingToStateHistory(str);
        postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str).setLifeCycleState(2001).build());
        startWebViewLoadTimeoutHandlers(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        String str3 = String.format(webView.getContext().getString(C26961R.string.error_msg_for_web_view_http_status_code), Integer.valueOf(i10), str2, str);
        RAHybridLog.m85712e("onReceivedError", str3);
        if (this.urlTracker.checkIfErrorIsMainUrlAndAddIfNeeded(str2)) {
            postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, str2).setLifeCycleState(2006).setErrorType(4002).setErrorCode(i10).setDescription(str3).build());
        }
        handleErrorOnBelowAndroidM(webView, i10, str, str2);
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String string = webResourceRequest.getUrl().toString();
        String str = String.format(webView.getContext().getString(C26961R.string.error_msg_for_web_view_http_status_code), Integer.valueOf(webResourceResponse.getStatusCode()), string, webResourceResponse.getReasonPhrase());
        RAHybridLog.m85712e("onReceivedHttpError", str);
        if (this.urlTracker.checkIfErrorIsMainUrlAndAddIfNeeded(string) || webResourceRequest.isForMainFrame()) {
            postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, string).setLifeCycleState(2006).setErrorType(4002).setErrorCode(webResourceResponse.getStatusCode()).setDescription(str).build());
            RAHybridLog.m85712e("onReceivedHttpError", "client notified of http error");
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.otherClient;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    void postStateChange(WebViewLifecycleInfoProvider webViewLifecycleInfoProvider) {
        List<WebViewLifecycleObservable> list;
        int lifeCycleState = webViewLifecycleInfoProvider.getLifeCycleState();
        if ((webViewLifecycleInfoProvider.shouldTransitionedAllow(this.currentState, lifeCycleState) || lifeCycleState == 2002 || lifeCycleState == 2007) && (list = this.webViewLifecycleObservableList) != null) {
            this.currentState = lifeCycleState;
            if (lifeCycleState == 2001) {
                this.hasPageStartedState = true;
            } else if (lifeCycleState == 2003 || lifeCycleState == 2004 || lifeCycleState == 2006 || lifeCycleState == 2005) {
                this.hasPageStartedState = false;
            }
            Iterator<WebViewLifecycleObservable> it = list.iterator();
            while (it.hasNext()) {
                it.next().updateWebViewStateChange(webViewLifecycleInfoProvider);
            }
        }
    }

    public void setEntryPointsConfig(EntryPointsConfig entryPointsConfig) {
        this.entryPointsConfig = entryPointsConfig;
    }

    public void setWebServer(WebServer webServer) {
        this.webServer = webServer;
        if (webServer == null || webServer.getWebServerConfig() == null) {
            return;
        }
        String preloadUrl = webServer.getWebServerConfig().getPreloadUrl();
        if (TextUtils.isEmpty(preloadUrl)) {
            return;
        }
        Request.Builder builderMethod = new Request.Builder().url(preloadUrl).method(HybridContentServer.WebRequestMethodType.OPTIONS, null);
        OkHttpClient okHttpClient = this.okHttpClient;
        Request requestBuild = builderMethod == null ? builderMethod.build() : OkHttp3Instrumentation.build(builderMethod);
        (okHttpClient == null ? okHttpClient.newCall(requestBuild) : OkHttp3Instrumentation.newCall(okHttpClient, requestBuild)).enqueue(new Callback() { // from class: com.wdpr.ee.ra.rahybrid.CustomWebViewClient.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
            }
        });
    }

    void setWebViewLifecycleObservableList(List<WebViewLifecycleObservable> list) {
        this.webViewLifecycleObservableList = list;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseShouldInterceptRequest;
        String str;
        if (this.webServer != null) {
            ProxyConfig proxyConfigThatHandlesRequest = getProxyConfigThatHandlesRequest(webResourceRequest.getUrl(), this.webServer.getWebServerConfig());
            if (proxyConfigThatHandlesRequest != null) {
                setHttpClientLoadTimeOut(proxyConfigThatHandlesRequest);
                Uri url = webResourceRequest.getUrl();
                synchronized (this) {
                    try {
                        str = null;
                        for (String str2 : this.ajaxRequestContents.keySet()) {
                            if (str2.equalsIgnoreCase(url.getPath())) {
                                str = this.ajaxRequestContents.get(str2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return handleProxyRequest(new WriteHandlingWebResourceRequest(webResourceRequest, str, url), proxyConfigThatHandlesRequest);
            }
            String host = webResourceRequest.getUrl().getHost();
            Objects.requireNonNull(host);
            if (host.equalsIgnoreCase(this.webServer.getWebServerConfig().getHostName()) && (webResourceResponseShouldInterceptRequest = this.webServer.shouldInterceptRequest(webResourceRequest)) != null && webResourceResponseShouldInterceptRequest.getStatusCode() == 200) {
                return injectIntercept(webResourceRequest, webResourceResponseShouldInterceptRequest, webView.getContext());
            }
        }
        WebViewClient webViewClient = this.otherClient;
        return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.navigationInteractor.decidePolicy(webResourceRequest.getUrl().toString()) == 0;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string = webResourceRequest.getUrl().toString();
        String str = String.format(webView.getContext().getString(C26961R.string.error_msg_for_web_view_http_status_code), Integer.valueOf(webResourceError.getErrorCode()), string, webResourceError.getDescription());
        RAHybridLog.m85712e("onReceivedError", str);
        if (this.urlTracker.checkIfErrorIsMainUrlAndAddIfNeeded(string) || webResourceRequest.isForMainFrame()) {
            postStateChange(new WebViewLifecycleInfoProvider.Builder(webView, string).setLifeCycleState(2006).setErrorType(4002).setErrorCode(webResourceError.getErrorCode()).setDescription(str).build());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}