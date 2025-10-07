package com.wdpr.p479ee.p480ra.rahybrid;

import android.webkit.WebView;

/* renamed from: com.wdpr.ee.ra.rahybrid.a */
/* loaded from: classes21.dex */
public final /* synthetic */ class RunnableC26966a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f71757b;

    /* renamed from: c */
    public final /* synthetic */ String f71758c;

    public /* synthetic */ RunnableC26966a(WebView webView, String str) {
        webView = webView;
        str = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71756a.notifyWebViewFinishTimeOut(webView, str);
    }
}