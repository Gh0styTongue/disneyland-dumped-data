package com.wdpr.p479ee.p480ra.rahybrid;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.disney.wdpro.commercecheckout.util.StringUtils;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewLifecycleInfoProvider;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridNavigationInteractor;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.FileChooserDelegable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.geolocation.GeoLocationPermissionPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecycleObservable;
import com.wdpr.p479ee.p480ra.rahybrid.util.DebuggableUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import com.wdpr.p479ee.p480ra.rahybrid.util.UserAgentUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes21.dex */
public class WebViewBridge {
    private static final String EVENT_ANALYTICS = "analyticsplugin.sendanalyticsdata";
    private static final String EVENT_CLOSE = "disneyRAWebViewBridgeClose";
    private static final String EVENT_ERROR = "disneyRAWebViewBridgeError";
    private static final String EVENT_READY = "disneyRAWebViewBridgeReady";
    public static final String JAVASCRIPT_DISNEY_PREFIX = "window.disney";
    private static final String JAVASCRIPT_INTERFACE_NAME = "disneyRAWebViewBridge";
    public static final String JAVASCRIPT_WINDOW_PREFIX = "window";
    private static final String TAG = "WebViewBridge";
    public static final String USER_AGENT = "DisneyRAWebView/Android";
    private final HashMap<String, CallbackHandler<?>> callbackHandlerMapping;
    private EntryPointsConfig entryPointsConfig;
    private List<String> pluginList;
    private final WebChromeClient webChromeClient;
    private final WebView webView;
    private CustomWebViewClient webViewClient;

    /* renamed from: com.wdpr.ee.ra.rahybrid.WebViewBridge$2 */
    static /* synthetic */ class C269632 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class Builder {
        private HashMap<String, CallbackHandler<?>> callbackHandlerMapping = new HashMap<>();
        private HybridWebConfig config;
        private EntryPointsConfig entryPointsConfig;
        private FileChooserDelegable fileChooserDelegable;
        private GeoLocationPermissionPluginListener geoLocationPermissionPluginListener;
        private HybridNavigationInteractor navigationInteractor;
        private WebChromeClient webChromeClient;
        private WebServer webServer;
        private WebView webView;
        private WebViewClient webViewClient;
        private List<WebViewLifecycleObservable> webViewLifecycleObservableList;
        private boolean whitelisted;

        public Builder addWebViewAnalyticsHandler(CallbackHandler callbackHandler) {
            this.callbackHandlerMapping.put(WebViewBridge.EVENT_ANALYTICS.toLowerCase(Locale.ROOT), callbackHandler);
            return this;
        }

        public Builder addWebViewCloseHandler(CallbackHandler callbackHandler) {
            this.callbackHandlerMapping.put(WebViewBridge.EVENT_CLOSE.toLowerCase(Locale.ROOT), callbackHandler);
            return this;
        }

        public Builder addWebViewCustomHandler(String str, CallbackHandler callbackHandler) {
            this.callbackHandlerMapping.put(str.toLowerCase(Locale.ROOT), callbackHandler);
            return this;
        }

        public Builder addWebViewErrorHandler(CallbackHandler callbackHandler) {
            this.callbackHandlerMapping.put(WebViewBridge.EVENT_ERROR.toLowerCase(Locale.ROOT), callbackHandler);
            return this;
        }

        public Builder addWebViewReadyHandler(CallbackHandler callbackHandler) {
            this.callbackHandlerMapping.put(WebViewBridge.EVENT_READY.toLowerCase(Locale.ROOT), callbackHandler);
            return this;
        }

        public WebViewBridge build() {
            WebView webView = this.webView;
            if (webView == null) {
                throw new IllegalStateException("WebView Object cannot be null");
            }
            WebViewClient webViewClient = this.webViewClient;
            if (webViewClient != null) {
                webView.setWebViewClient(webViewClient);
            }
            WebChromeClient webChromeClient = this.webChromeClient;
            if (webChromeClient != null) {
                this.webView.setWebChromeClient(webChromeClient);
            }
            return new WebViewBridge(this.webView, this.entryPointsConfig, this.webViewClient, this.webChromeClient, this.callbackHandlerMapping, this.whitelisted, this.webViewLifecycleObservableList, this.navigationInteractor, this.webServer, this.fileChooserDelegable, this.geoLocationPermissionPluginListener);
        }

        public Builder setEntryPointsConfig(EntryPointsConfig entryPointsConfig) {
            this.entryPointsConfig = entryPointsConfig;
            return this;
        }

        public Builder setFileChooserDelegable(FileChooserDelegable fileChooserDelegable) {
            this.fileChooserDelegable = fileChooserDelegable;
            return this;
        }

        public Builder setGeoLocationPermissionPluginListener(GeoLocationPermissionPluginListener geoLocationPermissionPluginListener) {
            this.geoLocationPermissionPluginListener = geoLocationPermissionPluginListener;
            return this;
        }

        public Builder setNavigationInteractor(HybridNavigationInteractor hybridNavigationInteractor) {
            this.navigationInteractor = hybridNavigationInteractor;
            return this;
        }

        public Builder setWebChromeClient(WebChromeClient webChromeClient) {
            this.webChromeClient = webChromeClient;
            return this;
        }

        public Builder setWebServer(WebServer webServer) {
            this.webServer = webServer;
            return this;
        }

        public Builder setWebView(WebView webView) {
            this.webView = webView;
            return this;
        }

        public Builder setWebViewClient(WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
            return this;
        }

        public Builder setWebViewLifecycleObservableList(List<WebViewLifecycleObservable> list) {
            this.webViewLifecycleObservableList = list;
            return this;
        }

        public Builder setWhiteListed(boolean z10) {
            this.whitelisted = z10;
            return this;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m85704a(WebViewBridge webViewBridge, String str, String str2, String[] strArr) {
        webViewBridge.getClass();
        if (str == null) {
            throw new IllegalStateException("Missing methodName argument");
        }
        JavaScriptMethod javaScriptMethod = new JavaScriptMethod(str2, str, strArr);
        String javaScriptString = str2 == null ? javaScriptMethod.getJavaScriptString() : javaScriptMethod.buildJavaScriptString();
        RAHybridLog.m85711d(TAG, "evaluateJavascript:" + javaScriptString);
        webViewBridge.webView.evaluateJavascript(javaScriptString, new ValueCallback() { // from class: com.wdpr.ee.ra.rahybrid.d
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                RAHybridLog.m85711d(WebViewBridge.TAG, (String) obj);
            }
        });
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void configureWebView(WebView webView, final CustomWebViewClient customWebViewClient, WebChromeClient webChromeClient, final FileChooserDelegable fileChooserDelegable, final GeoLocationPermissionPluginListener geoLocationPermissionPluginListener) {
        webView.setWebViewClient(customWebViewClient);
        if (webChromeClient != null) {
            webView.setWebChromeClient(webChromeClient);
        } else {
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.wdpr.ee.ra.rahybrid.WebViewBridge.1
                @Override // android.webkit.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
                    String str = "onConsoleMessage: " + consoleMessage.message().substring(0, consoleMessage.message().length() <= 100000 ? consoleMessage.message().length() : 100000) + " , From line: " + consoleMessage.lineNumber() + StringUtils.OF_WITH_SPACE + consoleMessage.sourceId();
                    int i10 = C269632.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[messageLevel.ordinal()];
                    if (i10 == 1) {
                        RAHybridLog.m85715v(WebViewBridge.TAG, str);
                    } else if (i10 == 2) {
                        RAHybridLog.m85711d(WebViewBridge.TAG, str);
                    } else if (i10 == 3) {
                        RAHybridLog.m85714i(WebViewBridge.TAG, str);
                    } else if (i10 == 4) {
                        RAHybridLog.m85716w(WebViewBridge.TAG, str);
                    } else if (i10 == 5) {
                        RAHybridLog.m85712e(WebViewBridge.TAG, str);
                    }
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    GeoLocationPermissionPluginListener geoLocationPermissionPluginListener2 = geoLocationPermissionPluginListener;
                    if (geoLocationPermissionPluginListener2 != null) {
                        geoLocationPermissionPluginListener2.onGeolocationPermissionsShowPrompt(str, callback);
                    }
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView2, int i10) {
                    super.onProgressChanged(webView2, i10);
                    if (customWebViewClient.hasPageStartedState()) {
                        customWebViewClient.postStateChange(new WebViewLifecycleInfoProvider.Builder(webView2, webView2.getUrl()).setLifeCycleState(2002).setProgressValue(i10).build());
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    FileChooserDelegable fileChooserDelegable2 = fileChooserDelegable;
                    return fileChooserDelegable2 == null ? super.onShowFileChooser(webView2, valueCallback, fileChooserParams) : fileChooserDelegable2.onShowFileChooser(valueCallback);
                }
            });
        }
        WebView.setWebContentsDebuggingEnabled(DebuggableUtil.isAppDebuggable(webView.getContext()));
        webView.addJavascriptInterface(this, JAVASCRIPT_INTERFACE_NAME);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUserAgentString(UserAgentUtil.buildUserAgentString(webView));
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setLayerType(2, null);
    }

    private Class getGenericParametrizedType(CallbackHandler<?> callbackHandler) {
        Type genericSuperclass = callbackHandler.getClass().getGenericSuperclass();
        return genericSuperclass instanceof ParameterizedType ? (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : Object.class;
    }

    public void addWebViewCustomHandler(String str, CallbackHandler callbackHandler) {
        this.callbackHandlerMapping.put(str.toLowerCase(Locale.ROOT), callbackHandler);
    }

    public boolean canGoBack() {
        WebView webView = this.webView;
        return webView != null && webView.canGoBack();
    }

    public void evaluateJavascript(final String str, final String str2, final String[] strArr) {
        this.webView.post(new Runnable() { // from class: com.wdpr.ee.ra.rahybrid.e
            @Override // java.lang.Runnable
            public final void run() {
                WebViewBridge.m85704a(this.f71766a, str2, str, strArr);
            }
        });
    }

    public EntryPointsConfig getEntryPointsConfig() {
        return this.entryPointsConfig;
    }

    public List<String> getPluginList() {
        return this.pluginList;
    }

    public String getStartUrl() {
        return this.entryPointsConfig.getStartUrl();
    }

    public WebChromeClient getWebChromeClient() {
        return this.webChromeClient;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public WebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    public void goBack() {
        if (this.webView == null) {
            return;
        }
        CustomWebViewClient customWebViewClient = this.webViewClient;
        if (customWebViewClient != null) {
            customWebViewClient.notifyOnBackPressedInternal();
        }
        this.webView.goBack();
    }

    protected void invokeCallbackInternal(String str, Object obj) {
        CallbackHandler<?> callbackHandler = this.callbackHandlerMapping.get(str.toLowerCase(Locale.ROOT));
        if (callbackHandler != null) {
            try {
                callbackHandler.onMessage(str, getGenericParametrizedType(callbackHandler).cast(obj));
                return;
            } catch (Exception e10) {
                callbackHandler.onError(str, e10);
                return;
            }
        }
        RAHybridLog.m85711d(TAG, "No command mapper found to handle [" + str + "]");
    }

    @JavascriptInterface
    public void postMessage(String str, String str2, String str3) {
        RAHybridLog.m85711d(TAG, String.format("Received CommandName: %s, Message: %s, Callback: %s", str, str2, str3));
        CallbackHandler<?> callbackHandler = this.callbackHandlerMapping.get(str.toLowerCase(Locale.ROOT));
        if (callbackHandler != null) {
            callbackHandler.onMessage(str, str2);
        } else {
            RAHybridLog.m85711d(TAG, "No command mapper found to handle [" + str + "]");
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        evaluateJavascript(null, str3, null);
    }

    public void setEntryPointsConfig(EntryPointsConfig entryPointsConfig) {
        this.entryPointsConfig = entryPointsConfig;
    }

    public void setPluginList(Collection<String> collection) {
        this.pluginList = collection == null ? new LinkedList() : new LinkedList(collection);
    }

    public void setWhiteList(boolean z10) {
        this.webViewClient.whitelisted = z10;
    }

    private WebViewBridge(WebView webView, EntryPointsConfig entryPointsConfig, WebViewClient webViewClient, WebChromeClient webChromeClient, HashMap<String, CallbackHandler<?>> map, boolean z10, List<WebViewLifecycleObservable> list, HybridNavigationInteractor hybridNavigationInteractor, WebServer webServer, FileChooserDelegable fileChooserDelegable, GeoLocationPermissionPluginListener geoLocationPermissionPluginListener) {
        CustomWebViewClient customWebViewClient = new CustomWebViewClient(webView, webViewClient, this, entryPointsConfig, z10, hybridNavigationInteractor);
        customWebViewClient.setWebViewLifecycleObservableList(list);
        if (webServer != null) {
            customWebViewClient.setWebServer(webServer);
        }
        this.entryPointsConfig = entryPointsConfig;
        this.callbackHandlerMapping = map;
        this.webViewClient = customWebViewClient;
        this.webChromeClient = webChromeClient;
        this.webView = webView;
        configureWebView(webView, customWebViewClient, webChromeClient, fileChooserDelegable, geoLocationPermissionPluginListener);
    }
}