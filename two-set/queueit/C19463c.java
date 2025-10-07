package com.disney.wdpro.queueit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.disney.wdpro.bookingservices.api.BookingApiClientImpl;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* renamed from: com.disney.wdpro.queueit.c */
/* loaded from: classes16.dex */
public class C19463c {

    @SuppressLint({"StaticFieldLeak"})
    private static WebView previousWebView;
    private final Activity _context;
    private final InterfaceC19462b broadcaster;
    private String queueUrl;
    private String targetUrl;
    private InterfaceC19461a uriOverrider;
    private String webViewUserAgent;
    private WebView webview;
    WebViewClient webviewClient = new a();
    private C19471k options = C19471k.m61109a();

    @Instrumented
    /* renamed from: com.disney.wdpro.queueit.c$a */
    class a extends WebViewClient {

        /* renamed from: com.disney.wdpro.queueit.c$a$a, reason: collision with other inner class name */
        class C34242a extends AbstractC19478r {
            C34242a() {
            }

            @Override // com.disney.wdpro.queueit.AbstractC19478r
            /* renamed from: a */
            protected void mo61040a() {
                C19463c.this.broadcaster.mo61023d();
                C19463c c19463c = C19463c.this;
                c19463c.m61033g(c19463c.webview);
            }

            @Override // com.disney.wdpro.queueit.AbstractC19478r
            /* renamed from: b */
            protected void mo61041b(String str) {
                C19463c.this.broadcaster.mo61020a(str);
                C19463c c19463c = C19463c.this;
                c19463c.m61033g(c19463c.webview);
            }

            @Override // com.disney.wdpro.queueit.AbstractC19478r
            /* renamed from: c */
            protected void mo61042c(String str) {
                C19463c.this.broadcaster.mo61022c(str);
            }

            @Override // com.disney.wdpro.queueit.AbstractC19478r
            /* renamed from: d */
            protected void mo61043d() {
                C19463c.this.broadcaster.mo61025f();
                C19463c c19463c = C19463c.this;
                c19463c.m61033g(c19463c.webview);
            }
        }

        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            CookieSyncManager.getInstance().sync();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            LogInstrumentation.m79030v("QueueActivity", String.format("%s: %s", "onReceivedError", String.format("%s %s: %s %s", webResourceRequest.getMethod(), webResourceRequest.getUrl(), Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription())));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            LogInstrumentation.m79030v("QueueActivity", String.format("%s: %s", "onReceivedHttpError", String.format("%s %s: %s %s", webResourceRequest.getMethod(), webResourceRequest.getUrl(), Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase())));
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            C19463c.this.broadcaster.mo61026g("SslError, code: " + sslError.getPrimaryError());
            C19463c c19463c = C19463c.this;
            c19463c.m61033g(c19463c.webview);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return C19463c.this.uriOverrider.mo61018c(str, C19463c.this.webview, new C34242a());
        }
    }

    @Instrumented
    /* renamed from: com.disney.wdpro.queueit.c$b */
    class b extends WebChromeClient {
        final /* synthetic */ ProgressBar val$progressBar;

        b(ProgressBar progressBar) {
            this.val$progressBar = progressBar;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            LogInstrumentation.m79030v("Progress", Integer.toString(i10));
            if (i10 < 100) {
                this.val$progressBar.setVisibility(0);
            } else {
                this.val$progressBar.setVisibility(8);
            }
            this.val$progressBar.setProgress(i10);
            super.onProgressChanged(webView, i10);
        }
    }

    public C19463c(Activity activity) {
        this._context = activity;
        this.broadcaster = new C19481u(activity);
    }

    /* renamed from: e */
    private static void m61032e() {
        WebView webView = previousWebView;
        if (webView == null) {
            return;
        }
        webView.destroy();
        previousWebView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m61033g(WebView webView) {
        webView.loadUrl("about:blank");
        this._context.finish();
    }

    /* renamed from: j */
    private void m61034j(Bundle bundle) {
        if (bundle == null) {
            Bundle extras = this._context.getIntent().getExtras();
            if (extras == null) {
                this.queueUrl = null;
                this.targetUrl = null;
                this.webViewUserAgent = null;
            } else {
                this.queueUrl = extras.getString("queueUrl");
                this.targetUrl = extras.getString("targetUrl");
                this.webViewUserAgent = extras.getString("webViewUserAgent");
                this.uriOverrider.mo61016a(extras.getString(AnalyticsAttribute.USER_ID_ATTRIBUTE));
                this.options = (C19471k) extras.getParcelable("options");
            }
        } else {
            this.queueUrl = (String) bundle.getSerializable("queueUrl");
            this.targetUrl = (String) bundle.getSerializable("targetUrl");
            this.webViewUserAgent = (String) bundle.getSerializable("webViewUserAgent");
            this.uriOverrider.mo61016a((String) bundle.getSerializable(AnalyticsAttribute.USER_ID_ATTRIBUTE));
        }
        this.uriOverrider.mo61017b(Uri.parse(this.targetUrl));
        this.uriOverrider.mo61019d(Uri.parse(this.queueUrl));
    }

    /* renamed from: l */
    private void m61035l(String str) {
        if (str == null) {
            str = C19480t.m61130a();
        }
        System.setProperty(BookingApiClientImpl.HTTP_AGENT, str);
        this.webview.getSettings().setUserAgentString(str);
    }

    /* renamed from: f */
    public void m61036f() {
        if (this._context.isFinishing()) {
            this.broadcaster.mo61024e();
        }
    }

    /* renamed from: h */
    public C19471k m61037h() {
        return this.options;
    }

    /* renamed from: i */
    public void m61038i(Bundle bundle) {
        this.uriOverrider = new C19479s();
        this._context.setContentView(C19477q.activity_queue);
        m61034j(bundle);
        m61032e();
        ProgressBar progressBar = (ProgressBar) this._context.findViewById(C19476p.progressBar);
        FrameLayout frameLayout = (FrameLayout) this._context.findViewById(C19476p.relativeLayout);
        WebView webView = new WebView(this._context);
        this.webview = webView;
        frameLayout.addView(webView);
        WebView webView2 = this.webview;
        previousWebView = webView2;
        webView2.getSettings().setJavaScriptEnabled(true);
        this.webview.setWebChromeClient(new b(progressBar));
        this.webview.setWebViewClient(this.webviewClient);
        LogInstrumentation.m79030v("QueueITEngine", "Loading initial URL: " + this.queueUrl);
        m61035l(this.webViewUserAgent);
        this.webview.loadUrl(this.queueUrl);
    }

    /* renamed from: k */
    public void m61039k(Bundle bundle) {
        bundle.putString("queueUrl", this.queueUrl);
        bundle.putString("targetUrl", this.targetUrl);
        bundle.putString("webViewUserAgent", this.webViewUserAgent);
        bundle.putString(AnalyticsAttribute.USER_ID_ATTRIBUTE, this.uriOverrider.getUserId());
    }
}