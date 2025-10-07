package com.disney.wdpro.queueit;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.disney.wdpro.profile_ui.wallet.WalletWebAnalytics;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* renamed from: com.disney.wdpro.queueit.s */
/* loaded from: classes16.dex */
public class C19479s implements InterfaceC19461a {
    private Uri queue;
    private Uri target;
    private String userId;

    /* renamed from: e */
    private boolean m61124e(WebView webView, Uri uri, AbstractC19478r abstractC19478r) {
        if (m61126g(uri)) {
            abstractC19478r.mo61040a();
            return true;
        }
        if (m61128i(uri)) {
            abstractC19478r.mo61043d();
            return true;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    /* renamed from: f */
    private boolean m61125f(Uri uri) {
        return uri.getPath().startsWith("/what-is-this.html");
    }

    /* renamed from: g */
    private boolean m61126g(Uri uri) {
        if (m61127h(uri)) {
            return uri.getHost().equals(WalletWebAnalytics.STATUS_CLOSE);
        }
        return false;
    }

    /* renamed from: h */
    private boolean m61127h(Uri uri) {
        return uri.getScheme().equals("queueit");
    }

    /* renamed from: i */
    private boolean m61128i(Uri uri) {
        if (m61127h(uri)) {
            return uri.getHost().equals("restartSession");
        }
        return false;
    }

    /* renamed from: j */
    private boolean m61129j(Uri uri) {
        return uri.getHost().equalsIgnoreCase(this.target.getHost()) && uri.getPath().equals(this.target.getPath());
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19461a
    /* renamed from: a */
    public void mo61016a(String str) {
        this.userId = str;
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19461a
    /* renamed from: b */
    public void mo61017b(Uri uri) {
        this.target = uri;
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19461a
    /* renamed from: c */
    public boolean mo61018c(String str, WebView webView, AbstractC19478r abstractC19478r) {
        LogInstrumentation.m79030v("QueueITEngine", "URI loading: " + str);
        Uri uriM61120a = Uri.parse(str);
        if (uriM61120a.getScheme() == null || !(uriM61120a.getScheme().equals("http") || uriM61120a.getScheme().equals("https"))) {
            return m61124e(webView, uriM61120a, abstractC19478r);
        }
        if (m61125f(uriM61120a)) {
            return true;
        }
        String host = uriM61120a.getHost();
        String host2 = this.queue.getHost();
        boolean z10 = (host == null || host2 == null || !host2.equals(host)) ? false : true;
        if (z10) {
            boolean zM61122c = AbstractC19475o.m61122c(uriM61120a, this.userId);
            if (zM61122c) {
                uriM61120a = AbstractC19475o.m61120a(uriM61120a, this.userId);
                LogInstrumentation.m79030v("QueueITEngine", "URL intercepting: " + uriM61120a);
            }
            abstractC19478r.mo61042c(uriM61120a.toString());
            if (zM61122c) {
                webView.loadUrl(uriM61120a.toString());
                return true;
            }
        }
        if (m61129j(uriM61120a)) {
            abstractC19478r.mo61041b(uriM61120a.getQueryParameter("queueittoken"));
            return true;
        }
        if (z10) {
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uriM61120a));
        return true;
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19461a
    /* renamed from: d */
    public void mo61019d(Uri uri) {
        this.queue = uri;
    }

    @Override // com.disney.wdpro.queueit.InterfaceC19461a
    public String getUserId() {
        return this.userId;
    }
}