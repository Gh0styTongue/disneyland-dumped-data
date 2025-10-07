package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid;

import android.webkit.WebView;

/* loaded from: classes21.dex */
public abstract class HybridInteractorLogic {
    protected HybridNavigationInteractor navigationInteractor;

    public HybridNavigationInteractor getNavigationInteractor() {
        return this.navigationInteractor;
    }

    public abstract void onViewCreated();

    public void setNavigationInteractor(HybridNavigationInteractor hybridNavigationInteractor) {
        this.navigationInteractor = hybridNavigationInteractor;
    }

    public abstract void webViewCreated(WebView webView);
}