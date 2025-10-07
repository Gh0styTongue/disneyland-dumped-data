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
public class WalletModalSendMessagePlugin extends Plugin implements WebMessageSendable {

    /* renamed from: b */
    private static final String f71820b = WalletHybridActivity.class.getSimpleName();

    /* renamed from: a */
    private WebMessageSender f71821a;

    public WalletModalSendMessagePlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }

    /* renamed from: a */
    public void m85727a(String str) {
        LogInstrumentation.m79024d(f71820b, "Wallet Modal Sending Response to Web");
        this.f71821a.send("NativeResponse", new String[]{str});
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "WalletModalSendMessagePlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    /* renamed from: getMessageSender */
    public WebMessageSender getWebMessageSender() {
        return this.f71821a;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender webMessageSender) {
        this.f71821a = webMessageSender;
    }
}