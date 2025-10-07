package com.wdpr.p479ee.p480ra.rahybrid.plugin.pageEvents;

import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class PageEventsPlugin extends Plugin implements WebMessageReceivable {
    private static final String CLOSE = "disneyRAWebViewBridgeClose";
    private static final String ERROR = "disneyRAWebViewBridgeError";

    /* renamed from: ID */
    public static final String f71778ID = "PageEventsPlugin";
    private PageEventsPluginListener pageEventsPluginListener;

    public interface PageEventsPluginListener {
        void didReceiveClose(String str);

        void didReceiveError(String str);
    }

    public PageEventsPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71778ID;
    }

    public PageEventsPluginListener getPageEventsPluginListener() {
        return this.pageEventsPluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        HashMap map = new HashMap();
        CallbackHandler<String> callbackHandler = new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                PageEventsPlugin.this.pageEventsPluginListener.didReceiveClose(str2);
            }
        };
        CallbackHandler<String> callbackHandler2 = new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.pageEvents.PageEventsPlugin.2
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                PageEventsPlugin.this.pageEventsPluginListener.didReceiveError(str2);
            }
        };
        map.put(CLOSE, callbackHandler);
        map.put(ERROR, callbackHandler2);
        return map;
    }

    public void setPageEventsPluginListener(PageEventsPluginListener pageEventsPluginListener) {
        this.pageEventsPluginListener = pageEventsPluginListener;
    }
}