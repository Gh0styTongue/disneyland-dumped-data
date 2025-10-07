package com.disney.wdpro.virtualqueue.core.manager.dashboard;

/* renamed from: com.disney.wdpro.virtualqueue.core.manager.dashboard.a */
/* loaded from: classes20.dex */
public final /* synthetic */ class RunnableC21624a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ VirtualQueueDashboardListener f45244b;

    public /* synthetic */ RunnableC21624a(VirtualQueueDashboardListener virtualQueueDashboardListener) {
        callback = virtualQueueDashboardListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualQueueDashboardProviderImpl.getVirtualQueueDashboardDataModel$lambda$0(this.f45243a, callback);
    }
}