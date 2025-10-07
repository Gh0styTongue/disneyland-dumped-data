package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid;

import com.wdpr.p479ee.p480ra.rahybrid.WebViewBridge;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes21.dex */
public class HybridNavigationInteractor implements NavigationActionDecidable {
    public static final String TAG = "HybridNavigationInteractor";
    private ArrayList<NavigationActionDecidable> navigationActionDecidables = new ArrayList<>();
    private WebViewBridge webViewBridge;

    public HybridNavigationInteractor(PluginStore pluginStore) {
        if (pluginStore != null) {
            for (Object obj : pluginStore.getPlugins()) {
                if (obj instanceof NavigationActionDecidable) {
                    this.navigationActionDecidables.add((NavigationActionDecidable) obj);
                }
            }
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable
    public int decidePolicy(String str) {
        Iterator<NavigationActionDecidable> it = this.navigationActionDecidables.iterator();
        int iDecidePolicy = 1;
        while (it.hasNext() && (iDecidePolicy = it.next().decidePolicy(str)) != 0) {
        }
        return iDecidePolicy;
    }

    public WebViewBridge getWebViewBridge() {
        return this.webViewBridge;
    }

    public void setWebViewBridge(WebViewBridge webViewBridge) {
        this.webViewBridge = webViewBridge;
    }
}