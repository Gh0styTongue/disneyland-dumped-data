package com.wdpr.p479ee.p480ra.rahybrid.plugin.print;

import android.content.Context;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.p480ra.rahybrid.util.PluginUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class PrintPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: ID */
    public static final String f71779ID = "PrintPlugin";
    private static final String REQUIRE_PRINT_CONTEXT_NAME = "requirePrintContext";
    private static final String SEND_PRINT_COMMAND = "print";
    public CallbackHandler<String> printCallbackHandler;
    private Context printContext;
    private PrintPluginListener printPluginListener;
    private boolean requirePrintContext;
    private Map<String, CallbackHandler> webMessageHandlers;

    public PrintPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.printCallbackHandler = new CallbackHandler<String>() { // from class: com.wdpr.ee.ra.rahybrid.plugin.print.PrintPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                if (PrintPlugin.this.printPluginListener != null) {
                    PrintPlugin.this.printPluginListener.onReceivedPrintCommand();
                }
            }
        };
        this.webMessageHandlers = new HashMap();
        if (pluginConfig == null || pluginConfig.getConfig() == null) {
            return;
        }
        this.requirePrintContext = PluginUtil.getConfigBoolean(pluginConfig.getConfig(), "requirePrintContext", false);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return f71779ID;
    }

    public Context getPrintContext() {
        return this.printContext;
    }

    public PrintPluginListener getPrintPluginListener() {
        return this.printPluginListener;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        this.webMessageHandlers.put(SEND_PRINT_COMMAND, this.printCallbackHandler);
        return this.webMessageHandlers;
    }

    public boolean requirePrintContext() {
        return this.requirePrintContext;
    }

    public void setPrintContext(Context context) {
        this.printContext = context;
    }

    public void setPrintPluginListener(PrintPluginListener printPluginListener) {
        this.printPluginListener = printPluginListener;
    }
}