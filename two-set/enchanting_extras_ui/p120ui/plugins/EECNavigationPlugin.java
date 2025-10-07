package com.disney.wdpro.enchanting_extras_ui.p120ui.plugins;

import android.os.Handler;
import android.os.Looper;
import com.disney.wdpro.enchanting_extras_ui.utils.HybridUtilities;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes25.dex */
public class EECNavigationPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: Id */
    public static final String f31644Id = "EECNavigationPlugin";
    private EECNavigationPluginListener listener;
    private Map<String, CallbackHandler> webMessageHandlers;

    public interface EECNavigationPluginListener {
        void dismiss();

        void navigateBack();

        void navigateToLogin();
    }

    public EECNavigationPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        this.webMessageHandlers = new HashMap();
        CallbackHandler<String> callbackHandler = new CallbackHandler<String>() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECNavigationPlugin.1
            @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
            public void onMessage(String str, String str2) {
                str.getClass();
                if (str.equals(HybridUtilities.COMMAND_NAME_DISMISS_BUTTON)) {
                    EECNavigationPlugin.this.listener.dismiss();
                } else if (str.equals(HybridUtilities.COMMAND_NAME_DETAIL_PAGE_BACK_BUTTON)) {
                    EECNavigationPlugin.this.navigateBack();
                }
            }
        };
        this.webMessageHandlers.put(HybridUtilities.KEY_NAME_DETAIL_PAGE_BACK_BUTTON, callbackHandler);
        this.webMessageHandlers.put("dismissButton", callbackHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$navigateBack$0() {
        this.listener.navigateBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void navigateBack() {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.plugins.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f31650a.lambda$navigateBack$0();
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
        return "EECNavigationPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.webMessageHandlers;
    }

    public void setListener(EECNavigationPluginListener eECNavigationPluginListener) {
        this.listener = eECNavigationPluginListener;
    }
}