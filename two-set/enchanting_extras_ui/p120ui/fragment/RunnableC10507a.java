package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

/* renamed from: com.disney.wdpro.enchanting_extras_ui.ui.fragment.a */
/* loaded from: classes25.dex */
public final /* synthetic */ class RunnableC10507a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f31633b;

    public /* synthetic */ RunnableC10507a(String str) {
        ssoErrorType = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnchantingExtrasFragment.notifyErrorToSSOTokenUpdateListeners$lambda$21(this.f31632a, ssoErrorType);
    }
}