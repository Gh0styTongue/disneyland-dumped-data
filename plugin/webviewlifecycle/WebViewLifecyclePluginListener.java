package com.wdpr.p479ee.p480ra.rahybrid.plugin.webviewlifecycle;

import android.webkit.WebView;

/* loaded from: classes21.dex */
public interface WebViewLifecyclePluginListener {
    void onCancel(WebView webView, int i10, String str);

    void onDisabled();

    void onError(WebView webView, int i10, int i11, String str, String str2);

    void onFinish(WebView webView, String str);

    void onLoading(WebView webView, int i10, String str);

    void onReady(WebView webView, String str, String str2);

    void onStart(WebView webView, String str);

    void onTimeout(WebView webView, int i10, String str, String str2);
}