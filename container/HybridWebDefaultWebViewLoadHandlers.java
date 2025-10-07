package com.wdpr.p479ee.p480ra.rahybrid.container;

import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.WebViewError;

/* loaded from: classes21.dex */
public interface HybridWebDefaultWebViewLoadHandlers {
    default CallbackHandler<String> onExternalLoadHandler() {
        return null;
    }

    CallbackHandler<WebViewError> onPageErrorHandler();

    CallbackHandler<String> onPageFinishedHandler();

    CallbackHandler<WebViewError> onPageLoadTimedOutHandler();

    CallbackHandler<String> onPageStartedHandler();
}