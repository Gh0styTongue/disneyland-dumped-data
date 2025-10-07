package com.disney.wdpro.universal_checkout_ui.p459ui.activities;

import android.content.DialogInterface;

/* renamed from: com.disney.wdpro.universal_checkout_ui.ui.activities.c */
/* loaded from: classes20.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC21444c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String f45071a;

    /* renamed from: b */
    public final /* synthetic */ ChaseActivity f45072b;

    public /* synthetic */ DialogInterfaceOnClickListenerC21444c(String str, ChaseActivity chaseActivity) {
        url = str;
        this = chaseActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        ChaseActivity.onShowDialog$lambda$6(url, this, dialogInterface, i10);
    }
}