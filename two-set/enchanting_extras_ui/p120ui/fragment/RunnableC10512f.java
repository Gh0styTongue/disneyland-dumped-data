package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

/* renamed from: com.disney.wdpro.enchanting_extras_ui.ui.fragment.f */
/* loaded from: classes25.dex */
public final /* synthetic */ class RunnableC10512f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31638a;

    /* renamed from: b */
    public final /* synthetic */ EnchantingExtrasFragment f31639b;

    public /* synthetic */ RunnableC10512f(String str, EnchantingExtrasFragment enchantingExtrasFragment) {
        entryPointId = str;
        this = enchantingExtrasFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnchantingExtrasFragment.notifySuccessToSSOTokenUpdateListeners$lambda$20(entryPointId, this);
    }
}