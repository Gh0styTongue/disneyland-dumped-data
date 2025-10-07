package com.disney.wdpro.general_ticket_sales_ui.plugins;

import android.os.Handler;
import android.os.Looper;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes28.dex */
public class AvailCalendarNavigationPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: ID */
    public static final String f32780ID = "AvailCalendarNavigationPlugin";
    protected AvailCalendarNavigationPluginListener listener;
    private Map<String, CallbackHandler> webMessageHandlers;

    public interface AvailCalendarNavigationPluginListener {
        void navigateBack();
    }

    public AvailCalendarNavigationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.webMessageHandlers = new HashMap();
        this.webMessageHandlers.put("dismissButton", new CallbackHandler<String>() { // from class: com.disney.wdpro.general_ticket_sales_ui.plugins.AvailCalendarNavigationPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                if ("AvailCalendarNavigationPlugin.dismissButton".equals(str)) {
                    AvailCalendarNavigationPlugin.this.navigateBack();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateBack$0() {
        this.listener.navigateBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateBack() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.general_ticket_sales_ui.plugins.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f32781a.lambda$navigateBack$0();
            }
        });
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "AvailCalendarNavigationPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public void setListener(AvailCalendarNavigationPluginListener availCalendarNavigationPluginListener) {
        this.listener = availCalendarNavigationPluginListener;
    }
}