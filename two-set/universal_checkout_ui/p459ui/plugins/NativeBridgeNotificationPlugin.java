package com.disney.wdpro.universal_checkout_ui.p459ui.plugins;

import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes20.dex */
public class NativeBridgeNotificationPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: Id */
    public static final String f45085Id = "nativeBridgeNotification";
    protected CallbackHandler callBackHandler;
    protected NativeBridgeNotificationPluginListener listener;
    private Map<String, CallbackHandler> webMessageHandlers;

    public interface NativeBridgeNotificationPluginListener {
        void setModalOpened(boolean z10);
    }

    public NativeBridgeNotificationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.webMessageHandlers = new HashMap();
        CallbackHandler<String> callbackHandler = new CallbackHandler<String>() { // from class: com.disney.wdpro.universal_checkout_ui.ui.plugins.NativeBridgeNotificationPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1864246715) {
                    if (iHashCode == 2083779400) {
                        str.equals(HybridUtilities.COMMAND_NAME_WEB_MODAL_CLOSED);
                    }
                } else if (str.equals(HybridUtilities.COMMAND_NAME_WEB_MODAL_OPENED)) {
                    NativeBridgeNotificationPlugin.this.listener.setModalOpened(true);
                    return;
                }
                NativeBridgeNotificationPlugin.this.listener.setModalOpened(false);
            }
        };
        this.callBackHandler = callbackHandler;
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_WEB_MODAL_OPENED, callbackHandler);
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_WEB_MODAL_CLOSED, this.callBackHandler);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "nativeBridgeNotification";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public void setListener(NativeBridgeNotificationPluginListener nativeBridgeNotificationPluginListener) {
        this.listener = nativeBridgeNotificationPluginListener;
    }
}