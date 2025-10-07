package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.newrelic.agent.android.api.p476v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import com.wdpr.p479ee.p480ra.rahybrid.C26961R;
import com.wdpr.p479ee.p480ra.rahybrid.CustomWebViewClient;
import com.wdpr.p479ee.p480ra.rahybrid.WebServer;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.CookiesAndHeadersUtil;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import com.wdpr.p479ee.p480ra.rahybrid.util.UserAgentUtil;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;

@Instrumented
/* loaded from: classes21.dex */
public class HybridFragment extends Fragment implements HybridDisplayLogic, TraceFieldInterface {
    public static final String TAG = "HybridFragment";
    public Trace _nr_trace;
    private HybridInteractorLogic interactor;
    private WebServer webServer;
    public WebView webView;

    @SuppressLint({"WebViewApiAvailability"})
    private boolean isWebViewSystemEnable() {
        return WebView.getCurrentWebViewPackage() != null;
    }

    public HybridInteractorLogic getInteractor() {
        return this.interactor;
    }

    public WebServer getWebServer() {
        return this.webServer;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public void loadCookies(EntryPointsConfig entryPointsConfig, List<HttpCookie> list) {
        RAHybridLog.m85711d(TAG, "loadCookies: Loading " + list.toString());
        Uri uri = Uri.parse(entryPointsConfig.getStartUrl());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        for (HttpCookie httpCookie : list) {
            if ("https".equals(uri.getScheme())) {
                httpCookie.setSecure(true);
            }
            if (httpCookie.getPath() == null) {
                httpCookie.setPath("/");
            }
            if (httpCookie.getDomain() == null) {
                httpCookie.setDomain(uri.getHost());
            } else if (uri.getHost() != null) {
                uri = Uri.parse(entryPointsConfig.getStartUrl().replace(uri.getHost(), httpCookie.getDomain()));
            }
            cookieManager.setCookie(uri.toString(), CookiesAndHeadersUtil.buildCookieString(httpCookie));
            cookieManager.flush();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridDisplayLogic
    public void loadUrl(EntryPointsConfig entryPointsConfig, List<HttpCookie> list, Map<String, String> map) {
        if (this.webView == null) {
            if (isWebViewSystemEnable()) {
                return;
            }
            HybridInteractorLogic hybridInteractorLogic = this.interactor;
            if (hybridInteractorLogic instanceof HybridInteractor) {
                ((WebViewLifecyclePlugin) ((HybridInteractor) hybridInteractorLogic).getPluginStore().getPlugin(WebViewLifecyclePlugin.f71787ID)).updateWebViewDisabled();
                return;
            }
            return;
        }
        HybridInteractorLogic hybridInteractorLogic2 = this.interactor;
        WebViewClient webViewClient = (hybridInteractorLogic2 == null || hybridInteractorLogic2.getNavigationInteractor() == null || this.interactor.getNavigationInteractor().getWebViewBridge() == null) ? null : this.interactor.getNavigationInteractor().getWebViewBridge().getWebViewClient();
        Uri uri = Uri.parse(entryPointsConfig.getStartUrl());
        String str = TAG;
        RAHybridLog.m85711d(str, "loadUrl: Loading " + uri.toString());
        if (list != null && !list.isEmpty()) {
            loadCookies(entryPointsConfig, list);
        }
        if (webViewClient instanceof CustomWebViewClient) {
            CustomWebViewClient customWebViewClient = (CustomWebViewClient) webViewClient;
            customWebViewClient.initializeWebViewLoadTimeOutHandlers(entryPointsConfig);
            customWebViewClient.setWebServer(this.webServer);
        }
        if (map == null || map.isEmpty()) {
            this.webView.loadUrl(uri.toString());
            return;
        }
        RAHybridLog.m85711d(str, "loadHTTPHeaders: Loading " + map.toString());
        this.webView.loadUrl(uri.toString(), map);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = null;
        try {
            TraceMachine.enterMethod(this._nr_trace, "HybridFragment#onCreateView", null);
        } catch (NoSuchFieldError unused) {
            TraceMachine.enterMethod(null, "HybridFragment#onCreateView", null);
        }
        if (isWebViewSystemEnable()) {
            viewInflate = layoutInflater.inflate(C26961R.layout.fragment_hybrid_fragment, viewGroup, false);
            this.webView = (WebView) viewInflate.findViewById(C26961R.id.hybrid_fragment_webview);
            setupWebView();
        } else {
            this.webView = null;
        }
        TraceMachine.exitMethod();
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        HybridInteractorLogic hybridInteractorLogic = this.interactor;
        if (hybridInteractorLogic != null) {
            hybridInteractorLogic.onViewCreated();
        }
    }

    public void sendBackButtonEvent() {
        this.interactor.navigationInteractor.getWebViewBridge().evaluateJavascript(null, "disney.nativeBridgeNotification.backButtonClicked", null);
    }

    public void setInteractor(HybridInteractorLogic hybridInteractorLogic) {
        this.interactor = hybridInteractorLogic;
    }

    public void setWebServer(WebServer webServer) {
        this.webServer = webServer;
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
    }

    public void setupWebView() {
        this.webView.getSettings().setUserAgentString(UserAgentUtil.buildUserAgentString(this.webView));
        this.webView.requestFocusFromTouch();
        HybridInteractorLogic hybridInteractorLogic = this.interactor;
        if (hybridInteractorLogic != null) {
            hybridInteractorLogic.webViewCreated(this.webView);
        }
    }
}