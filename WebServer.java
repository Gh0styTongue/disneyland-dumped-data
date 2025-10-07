package com.wdpr.p479ee.p480ra.rahybrid;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.wdpr.p479ee.p480ra.rahybrid.model.WebServerConfig;

/* loaded from: classes21.dex */
public interface WebServer {
    WebServerConfig getWebServerConfig();

    void hostContentBundle();

    WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest);
}