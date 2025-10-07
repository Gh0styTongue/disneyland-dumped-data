package com.disney.wdpro.universal_checkout_ui.p459ui.plugins;

import android.webkit.WebView;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;

/* loaded from: classes20.dex */
public class UCWebViewLifecyclePlugin extends WebViewLifecyclePlugin implements WebViewLifecyclePluginListener {

    /* renamed from: Id */
    public static final String f45088Id = "UCWebViewLifecyclePlugin";
    private static final int LOADING_COMPLETE = 100;
    private static final String TAG = "UCWebViewLifecyclePlugin";
    private boolean isUCEnabled;
    protected UCWebViewLifecyclePluginListener ucWebViewLifecyclePluginListener;

    public interface UCWebViewLifecyclePluginListener {
        void onDisabledWebView();

        void onFinishLoadingScreen(String str, boolean z10);

        void onInterceptUrlStart();

        void onLoadingInProgressScreen(String str, int i10);

        void onStartLoadingScreen(String str);

        void onTimeoutCalled();
    }

    public UCWebViewLifecyclePlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        setWebViewLifecyclePluginListener(this);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePlugin, com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "UCWebViewLifecyclePlugin";
    }

    public void init(UCWebViewLifecyclePluginListener uCWebViewLifecyclePluginListener, boolean z10) {
        this.ucWebViewLifecyclePluginListener = uCWebViewLifecyclePluginListener;
        this.isUCEnabled = z10;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onCancel(WebView webView, int i10, String str) {
        RAHybridLog.m85711d(TAG, "onCancel() Cancelled because of : " + i10 + ", URL : " + str);
        this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(str, false);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onDisabled() {
        RAHybridLog.m85712e(TAG, "onDisabled()");
        this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(null, false);
        this.ucWebViewLifecyclePluginListener.onDisabledWebView();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onError(WebView webView, int i10, int i11, String str, String str2) {
        RAHybridLog.m85712e(TAG, "onError() Type: " + i10 + ", Error Code: " + i11 + ", Description: " + str + ", URL : " + str2);
        this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(str2, false);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onFinish(WebView webView, String str) {
        RAHybridLog.m85711d(TAG, "onFinish() URL : " + str);
        if (str.contains("checkout-booking") || str.contains(HybridUtilities.BUNDLE_HOST_NAME)) {
            return;
        }
        this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(str, true);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onLoading(WebView webView, int i10, String str) {
        RAHybridLog.m85711d(TAG, "onLoading() progress : " + i10 + ", URL : " + str);
        if (i10 != 100) {
            this.ucWebViewLifecyclePluginListener.onLoadingInProgressScreen(str, i10);
        } else {
            if (str.contains("checkout-booking") || str.contains(HybridUtilities.BUNDLE_HOST_NAME)) {
                return;
            }
            this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(str, false);
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onReady(WebView webView, String str, String str2) {
        RAHybridLog.m85711d(TAG, "onReady() JSON Response: " + str + ", URL : " + str2);
        this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(str2, false);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onStart(WebView webView, String str) {
        RAHybridLog.m85711d(TAG, "onStart() URL : " + str);
        this.ucWebViewLifecyclePluginListener.onStartLoadingScreen(str);
        if ((this.isUCEnabled || !(str.contains(Constants.SECURE_CHECKOUT) || str.contains("checkout-booking") || str.contains(HybridUtilities.BUNDLE_HOST_NAME))) && !str.contains(Constants.MY_PLANS_LINK)) {
            return;
        }
        this.ucWebViewLifecyclePluginListener.onInterceptUrlStart();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle.WebViewLifecyclePluginListener
    public void onTimeout(WebView webView, int i10, String str, String str2) {
        RAHybridLog.m85712e(TAG, "onTimeout() time : " + i10 + ", Description : " + str + ", URL : " + str2);
        this.ucWebViewLifecyclePluginListener.onFinishLoadingScreen(str2, false);
        this.ucWebViewLifecyclePluginListener.onTimeoutCalled();
    }
}