package com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.workers;

import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewBridge;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents.PageEventsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.pluginStore.PluginStore;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes21.dex */
public class WebViewBridgeWorker {
    public static final String TAG = "WebViewBridgeWorker";

    public static void inject(PluginStore pluginStore, WebViewBridge webViewBridge) {
        setupWebMessageReceivablePlugins(pluginStore, webViewBridge);
        setupWebMessageSendablePlugins(pluginStore, webViewBridge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void setupWebMessageReceivablePlugins(PluginStore pluginStore, WebViewBridge webViewBridge) {
        ArrayList<Plugin> arrayList = new ArrayList();
        for (Plugin plugin : pluginStore.getPlugins()) {
            if (plugin instanceof WebMessageReceivable) {
                arrayList.add(plugin);
            }
        }
        for (Plugin plugin2 : arrayList) {
            for (Map.Entry<String, CallbackHandler> entry : ((WebMessageReceivable) plugin2).getWebMessageHandlers().entrySet()) {
                String key = plugin2.getId().equals(PageEventsPlugin.f71778ID) ? entry.getKey() : plugin2.getId() + "." + entry.getKey();
                RAHybridLog.m85711d(TAG, key + " : handler is added to WebViewBridge");
                webViewBridge.addWebViewCustomHandler(key, entry.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void setupWebMessageSendablePlugins(PluginStore pluginStore, final WebViewBridge webViewBridge) {
        ArrayList<Plugin> arrayList = new ArrayList();
        for (Plugin plugin : pluginStore.getPlugins()) {
            if (plugin instanceof WebMessageSendable) {
                arrayList.add(plugin);
            }
        }
        for (final Plugin plugin2 : arrayList) {
            RAHybridLog.m85711d(TAG, plugin2.getId() + " : messageSender added");
            ((WebMessageSendable) plugin2).setMessageSender(new WebMessageSender() { // from class: com.wdpr.ee.ra.rahybrid.ui.hybrid.workers.WebViewBridgeWorker.1
                @Override // com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender
                public void send(String str, String[] strArr) {
                    webViewBridge.evaluateJavascript(plugin2.getId(), str, strArr);
                }
            });
        }
    }
}