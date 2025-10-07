package com.wdpr.p479ee.p480ra.rahybrid;

import android.webkit.WebView;
import com.wdpr.p479ee.p480ra.rahybrid.CustomWebViewClient;

/* renamed from: com.wdpr.ee.ra.rahybrid.c */
/* loaded from: classes21.dex */
public final /* synthetic */ class RunnableC26968c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f71763b;

    /* renamed from: c */
    public final /* synthetic */ String f71764c;

    /* renamed from: d */
    public final /* synthetic */ String f71765d;

    public /* synthetic */ RunnableC26968c(WebView webView, String str, String str2) {
        webView = webView;
        str3 = str;
        str2 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomWebViewClient.C269602.m85703a(this.f71762a, webView, str3, str2);
    }
}