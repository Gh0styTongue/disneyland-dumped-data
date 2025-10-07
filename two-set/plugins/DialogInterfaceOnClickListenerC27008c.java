package com.wdpr.p479ee.wallet.p482ui.plugins;

import android.content.DialogInterface;
import com.wdpr.p479ee.wallet.p482ui.plugins.WalletModalTriggerPlugin;

/* renamed from: com.wdpr.ee.wallet.ui.plugins.c */
/* loaded from: classes21.dex */
class DialogInterfaceOnClickListenerC27008c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ WalletModalTriggerPlugin.C270042 f71834a;

    DialogInterfaceOnClickListenerC27008c(WalletModalTriggerPlugin.C270042 c270042) {
        this.f71834a = c270042;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}