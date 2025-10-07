package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

/* renamed from: com.disney.wdpro.enchanting_extras_ui.ui.fragment.g */
/* loaded from: classes25.dex */
public final /* synthetic */ class RunnableC10513g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31640a;

    /* renamed from: b */
    public final /* synthetic */ EnchantingExtrasFragment f31641b;

    /* renamed from: c */
    public final /* synthetic */ String f31642c;

    public /* synthetic */ RunnableC10513g(String str, EnchantingExtrasFragment enchantingExtrasFragment, String str2) {
        jwt = str;
        this = enchantingExtrasFragment;
        entryPointId = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnchantingExtrasFragment.setCookiesIfJWTNotNullAndNotifySuccess$lambda$13(jwt, this, entryPointId);
    }
}