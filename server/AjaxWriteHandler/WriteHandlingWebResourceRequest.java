package com.wdpr.p479ee.p480ra.rahybrid.server.AjaxWriteHandler;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

/* loaded from: classes21.dex */
public class WriteHandlingWebResourceRequest implements WebResourceRequest {
    private final WebResourceRequest originalWebResourceRequest;
    private final String requestBody;
    private final Uri uri;

    public WriteHandlingWebResourceRequest(WebResourceRequest webResourceRequest, String str, Uri uri) {
        this.originalWebResourceRequest = webResourceRequest;
        this.requestBody = str;
        if (uri != null) {
            this.uri = uri;
        } else {
            this.uri = webResourceRequest.getUrl();
        }
    }

    public String getAjaxData() {
        return this.requestBody;
    }

    @Override // android.webkit.WebResourceRequest
    public String getMethod() {
        return this.originalWebResourceRequest.getMethod();
    }

    @Override // android.webkit.WebResourceRequest
    public Map<String, String> getRequestHeaders() {
        return this.originalWebResourceRequest.getRequestHeaders();
    }

    @Override // android.webkit.WebResourceRequest
    public Uri getUrl() {
        return this.uri;
    }

    public boolean hasAjaxData() {
        return this.requestBody != null;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.originalWebResourceRequest.hasGesture();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.originalWebResourceRequest.isForMainFrame();
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        throw new UnsupportedOperationException();
    }
}