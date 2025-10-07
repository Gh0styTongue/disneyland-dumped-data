package com.wdpr.p479ee.wallet.p482ui.plugins;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.Html;
import apptentive.com.android.feedback.notifications.NotificationUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.wallet.p482ui.activities.WalletHybridActivity;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletModalTriggerPlugin;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class WalletModalTriggerPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: e */
    private static final String f71822e = WalletHybridActivity.class.getSimpleName();

    /* renamed from: a */
    public WalletModalSendMessagePlugin f71823a;

    /* renamed from: b */
    public HybridCoordinator f71824b;

    /* renamed from: c */
    public Activity f71825c;

    /* renamed from: d */
    private Map<String, CallbackHandler> f71826d;

    @Instrumented
    /* renamed from: com.wdpr.ee.wallet.ui.plugins.WalletModalTriggerPlugin$2 */
    class C270042 extends CallbackHandler<String> {
        C270042() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m85728a(C270042 c270042, Map map) {
            c270042.getClass();
            AlertDialog.Builder builder = new AlertDialog.Builder(WalletModalTriggerPlugin.this.f71825c);
            Object obj = map.get("title");
            Object obj2 = map.get("yesLabel");
            Object obj3 = map.get("noLabel");
            builder.setTitle(obj.toString());
            builder.setMessage(Html.fromHtml(map.get(NotificationUtils.BODY_DEFAULT).toString()));
            builder.setPositiveButton(obj2.toString(), new DialogInterfaceOnClickListenerC27007b(c270042));
            builder.setNegativeButton(obj3.toString(), new DialogInterfaceOnClickListenerC27008c(c270042));
            builder.show();
        }

        @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
        public void onMessage(String str, String str2) {
            if (WalletModalTriggerPlugin.this.f71825c != null) {
                final Map map = (Map) GsonInstrumentation.fromJson(new Gson(), str2, new TypeToken<Map<String, Object>>() { // from class: com.wdpr.ee.wallet.ui.plugins.WalletModalTriggerPlugin.2.1
                }.getType());
                WalletModalTriggerPlugin.this.f71825c.runOnUiThread(new Runnable() { // from class: com.wdpr.ee.wallet.ui.plugins.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        WalletModalTriggerPlugin.C270042.m85728a(this.f71831a, map);
                    }
                });
            }
        }
    }

    /* renamed from: com.wdpr.ee.wallet.ui.plugins.WalletModalTriggerPlugin$a */
    class C27005a extends CallbackHandler<String> {
        C27005a() {
        }

        @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
        public void onMessage(String str, String str2) {
            WalletModalTriggerPlugin walletModalTriggerPlugin = WalletModalTriggerPlugin.this;
            walletModalTriggerPlugin.f71823a = (WalletModalSendMessagePlugin) walletModalTriggerPlugin.f71824b.getPlugin("WalletModalSendMessagePlugin");
            WalletModalTriggerPlugin.this.f71823a.m85727a("MODAL_SUPPORTED");
        }
    }

    public WalletModalTriggerPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        HashMap map = new HashMap();
        this.f71826d = map;
        map.put("modalSupported", new C27005a());
        this.f71826d.put("triggerWalletModal", new C270042());
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "WalletModalTriggerPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.f71826d;
    }
}