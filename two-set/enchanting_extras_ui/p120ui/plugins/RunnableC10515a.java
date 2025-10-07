package com.disney.wdpro.enchanting_extras_ui.p120ui.plugins;

/* renamed from: com.disney.wdpro.enchanting_extras_ui.ui.plugins.a */
/* loaded from: classes25.dex */
public final /* synthetic */ class RunnableC10515a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f31647b;

    /* renamed from: c */
    public final /* synthetic */ String f31648c;

    /* renamed from: d */
    public final /* synthetic */ String f31649d;

    public /* synthetic */ RunnableC10515a(String str, String str2, String str3) {
        facilityId = str;
        entityType = str2;
        detailFlow = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EECDetailPlugin.navigateFinderDetail$lambda$0(this.f31646a, facilityId, entityType, detailFlow);
    }
}