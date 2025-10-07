package com.wdpr.p479ee.wallet.p482ui.plugins;

import android.app.Activity;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable;
import com.wdpr.p479ee.wallet.p482ui.activities.WalletHybridActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.jose4j.json.internal.json_simple.parser.ParseException;
import p547ez.C27776b;
import p716kx.C30265c;

@Instrumented
/* loaded from: classes21.dex */
public class WalletHybridTriggerPlugin extends Plugin implements WebMessageReceivable {

    /* renamed from: e */
    private static final String f71814e = WalletHybridActivity.class.getSimpleName();

    /* renamed from: a */
    public WalletHybridSendMessagePlugin f71815a;

    /* renamed from: b */
    public HybridCoordinator f71816b;

    /* renamed from: c */
    public Activity f71817c;

    /* renamed from: d */
    private Map<String, CallbackHandler> f71818d;

    /* renamed from: com.wdpr.ee.wallet.ui.plugins.WalletHybridTriggerPlugin$a */
    class C27003a extends CallbackHandler<String> {
        C27003a() {
        }

        @Override // com.wdpr.p479ee.p480ra.rahybrid.CallbackHandler, com.wdpr.p479ee.p480ra.rahybrid.ICallbackHandler
        public void onMessage(String str, String str2) {
            WalletHybridTriggerPlugin walletHybridTriggerPlugin = WalletHybridTriggerPlugin.this;
            if (walletHybridTriggerPlugin.f71817c != null) {
                walletHybridTriggerPlugin.f71815a = (WalletHybridSendMessagePlugin) walletHybridTriggerPlugin.f71816b.getPlugin("WalletHybridSendMessagePlugin");
                WalletHybridTriggerPlugin.this.f71815a.m85724a("VersionResponse", WalletHybridTriggerPlugin.this.m85726b());
            }
        }
    }

    public WalletHybridTriggerPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
        HashMap map = new HashMap();
        this.f71818d = map;
        map.put("getHybridVersion", new C27003a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public String m85726b() {
        try {
            JSONObject jSONObject = (JSONObject) new C27776b().m86922e(new BufferedReader(new InputStreamReader(this.f71817c.getResources().openRawResource(C30265c.wallet_hybrid_config))));
            if (!jSONObject.containsKey("WALLET_HYBRID_VERSION")) {
                return null;
            }
            return ((String) jSONObject.get("WALLET_HYBRID_VERSION")).substring(0, r6.length() - 2);
        } catch (IOException | ParseException e10) {
            LogInstrumentation.m79026e(f71814e, "An exception occurred while reading WalletHybrid version from raw input file" + e10.getStackTrace());
            return null;
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "WalletHybridTriggerPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageReceivable
    public Map<String, CallbackHandler> getWebMessageHandlers() {
        return this.f71818d;
    }
}