package com.wdpr.p479ee.wallet.p482ui.plugins;

import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;
import com.wdpr.p479ee.wallet.p482ui.activities.WalletHybridActivity;

@Instrumented
/* loaded from: classes21.dex */
public class WalletHybridSendMessagePlugin extends Plugin implements WebMessageSendable {

    /* renamed from: b */
    private static final String f71812b = WalletHybridActivity.class.getSimpleName();

    /* renamed from: a */
    private WebMessageSender f71813a;

    public WalletHybridSendMessagePlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }

    /* renamed from: a */
    public void m85724a(String str, String str2) {
        LogInstrumentation.m79024d(f71812b, "Wallet Hybrid Sending Response to Web");
        this.f71813a.send(str, new String[]{str2});
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "WalletHybridSendMessagePlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    /* renamed from: getMessageSender */
    public WebMessageSender getWebMessageSender() {
        return this.f71813a;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender webMessageSender) {
        this.f71813a = webMessageSender;
    }
}