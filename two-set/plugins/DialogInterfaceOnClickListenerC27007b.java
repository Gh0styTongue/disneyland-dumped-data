package com.wdpr.p479ee.wallet.p482ui.plugins;

import android.content.DialogInterface;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletModalTriggerPlugin;

/* renamed from: com.wdpr.ee.wallet.ui.plugins.b */
/* loaded from: classes21.dex */
class DialogInterfaceOnClickListenerC27007b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ WalletModalTriggerPlugin.C270042 f71833a;

    DialogInterfaceOnClickListenerC27007b(WalletModalTriggerPlugin.C270042 c270042) {
        this.f71833a = c270042;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        WalletModalTriggerPlugin walletModalTriggerPlugin = WalletModalTriggerPlugin.this;
        walletModalTriggerPlugin.f71823a = (WalletModalSendMessagePlugin) walletModalTriggerPlugin.f71824b.getPlugin("WalletModalSendMessagePlugin");
        WalletModalTriggerPlugin.this.f71823a.m85727a("POSITIVE_RESP");
        dialogInterface.cancel();
    }
}