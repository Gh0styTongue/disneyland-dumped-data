package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid;

import android.webkit.WebView;
import com.wdpr.p479ee.p480ra.rahybrid.WebServer;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;

/* loaded from: classes21.dex */
public class HybridEmbeddedInteractor extends HybridInteractor {
    private static final String TAG = "HybridEmbeddedInteractor";
    private WebServer webServer;

    public HybridEmbeddedInteractor(HybridFragment hybridFragment, PluginStore pluginStore, WebServer webServer) {
        super(hybridFragment, pluginStore);
        this.webServer = webServer;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractor, com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractorLogic
    public void onViewCreated() {
        super.onViewCreated();
        this.webServer.hostContentBundle();
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractor, com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridInteractorLogic
    public void webViewCreated(WebView webView) {
        super.webViewCreated(webView);
    }
}