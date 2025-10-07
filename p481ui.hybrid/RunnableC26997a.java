package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid;

import android.print.PrintManager;
import android.webkit.WebView;

/* renamed from: com.wdpr.ee.ra.rahybrid.ui.hybrid.a */
/* loaded from: classes21.dex */
public final /* synthetic */ class RunnableC26997a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f71790b;

    /* renamed from: c */
    public final /* synthetic */ String f71791c;

    /* renamed from: d */
    public final /* synthetic */ PrintManager f71792d;

    public /* synthetic */ RunnableC26997a(WebView webView, String str, PrintManager printManager) {
        webView = webView;
        str2 = str;
        printManager = printManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HybridInteractor.m85710a(this.f71789a, webView, str2, printManager);
    }
}