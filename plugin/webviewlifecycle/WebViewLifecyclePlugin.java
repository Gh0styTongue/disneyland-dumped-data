package com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewLifecycleInfoProvider;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes21.dex */
public class WebViewLifecyclePlugin extends Plugin implements WebViewLifecycleObservable, WebViewErrorObservable {

    /* renamed from: ID */
    public static final String f71787ID = "WebViewLifecyclePlugin";
    private List<Integer> loadingStateTrackerList;
    private WebViewLifecyclePluginListener webViewLifecyclePluginListener;

    public WebViewLifecyclePlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.loadingStateTrackerList = new ArrayList();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71787ID;
    }

    public void setWebViewLifecyclePluginListener(WebViewLifecyclePluginListener webViewLifecyclePluginListener) {
        this.webViewLifecyclePluginListener = webViewLifecyclePluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewErrorObservable
    public void updateWebViewDisabled() {
        WebViewLifecyclePluginListener webViewLifecyclePluginListener = this.webViewLifecyclePluginListener;
        if (webViewLifecyclePluginListener != null) {
            webViewLifecyclePluginListener.onDisabled();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecycleObservable
    @SuppressLint({"SwitchIntDef"})
    public void updateWebViewStateChange(WebViewLifecycleInfoProvider webViewLifecycleInfoProvider) {
        RAHybridLog.m85711d(f71787ID, "updateWebViewStateChange() URL : " + webViewLifecycleInfoProvider.getUrl());
        if (this.webViewLifecyclePluginListener != null) {
            WebView webView = webViewLifecycleInfoProvider.getWebView();
            String url = webViewLifecycleInfoProvider.getUrl();
            switch (webViewLifecycleInfoProvider.getLifeCycleState()) {
                case 2001:
                    this.loadingStateTrackerList.clear();
                    this.webViewLifecyclePluginListener.onStart(webView, url);
                    break;
                case 2002:
                    int progressValue = webViewLifecycleInfoProvider.getProgressValue();
                    if (!this.loadingStateTrackerList.contains(Integer.valueOf(progressValue))) {
                        this.loadingStateTrackerList.add(Integer.valueOf(progressValue));
                        this.webViewLifecyclePluginListener.onLoading(webView, progressValue, url);
                        break;
                    }
                    break;
                case 2003:
                    this.webViewLifecyclePluginListener.onFinish(webView, url);
                    break;
                case 2004:
                    this.webViewLifecyclePluginListener.onReady(webView, webViewLifecycleInfoProvider.getReadyJSONResponse(), url);
                    break;
                case 2005:
                    this.webViewLifecyclePluginListener.onCancel(webView, webViewLifecycleInfoProvider.getCancelType(), url);
                    break;
                case 2006:
                    this.webViewLifecyclePluginListener.onError(webView, webViewLifecycleInfoProvider.getErrorType(), webViewLifecycleInfoProvider.getErrorCode(), webViewLifecycleInfoProvider.getDescription(), url);
                    break;
                case 2007:
                    this.webViewLifecyclePluginListener.onTimeout(webView, webViewLifecycleInfoProvider.getTimeoutType(), webViewLifecycleInfoProvider.getDescription(), url);
                    break;
            }
        }
    }
}