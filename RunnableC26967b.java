package com.wdpr.p479ee.p480ra.rahybrid;

import android.webkit.WebView;

/* renamed from: com.wdpr.ee.ra.rahybrid.b */
/* loaded from: classes21.dex */
public final /* synthetic */ class RunnableC26967b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f71760b;

    /* renamed from: c */
    public final /* synthetic */ String f71761c;

    public /* synthetic */ RunnableC26967b(WebView webView, String str) {
        webView = webView;
        str = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71759a.notifyPageReadyTimeOut(webView, str);
    }
}