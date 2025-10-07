package com.wdpr.p479ee.wallet.p482ui.plugins;

import com.wdpr.p479ee.p480ra.rahybrid.WebMessageSender;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable;

/* loaded from: classes21.dex */
public class WalletTokenUpdateNotifyPlugin extends Plugin implements WebMessageSendable {

    /* renamed from: a */
    private WebMessageSender f71830a;

    public WalletTokenUpdateNotifyPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }

    /* renamed from: a */
    public void m85729a(String str) {
        WebMessageSender webMessageSender = this.f71830a;
        if (webMessageSender != null) {
            webMessageSender.send("RenewWalletToken", new String[]{str});
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "WalletTokenUpdateNotifyPlugin";
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public WebMessageSender getMessageSender() {
        return this.f71830a;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.capabilities.WebMessageSendable
    public void setMessageSender(WebMessageSender webMessageSender) {
        this.f71830a = webMessageSender;
    }
}