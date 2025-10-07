package com.disney.wdpro.virtualqueue.core.manager.dashboard;

import android.os.Handler;
import android.os.HandlerThread;
import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\"\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProviderImpl;", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProvider;", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "<init>", "(Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardListener;", "callback", "", "loadDashboard", "(Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardListener;)Z", "", "getVirtualQueueDashboardDataModel", "(Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardListener;)V", "Lcom/disney/wdpro/commons/config/i;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "isOnProperty", "Z", "()Z", "setOnProperty", "(Z)V", "isLoggedIn", "setLoggedIn", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueDashboardProviderImpl implements VirtualQueueDashboardProvider {
    public static final long RETRY_DELAY = 10000;
    private boolean isLoggedIn;
    private boolean isOnProperty;
    private final C9248i vendomatic;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Inject
    public VirtualQueueDashboardProviderImpl(C9248i vendomatic, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        this.vendomatic = vendomatic;
        this.vqThemer = vqThemer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVirtualQueueDashboardDataModel$lambda$0(VirtualQueueDashboardProviderImpl this$0, VirtualQueueDashboardListener callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (this$0.vendomatic.m38721S1()) {
            this$0.loadDashboard(callback);
        }
    }

    private final boolean loadDashboard(VirtualQueueDashboardListener callback) {
        this.vqThemer.refreshDocuments(CollectionsKt.emptyList());
        VirtualQueueDashboardDataModelImpl virtualQueueDashboardDataModelImpl = new VirtualQueueDashboardDataModelImpl(this.vqThemer);
        VirtualQueueDashboardDataRefreshResult virtualQueueDashboardDataRefreshResult = new VirtualQueueDashboardDataRefreshResult(virtualQueueDashboardDataModelImpl.getHasValidData(), virtualQueueDashboardDataModelImpl);
        AbstractC9344n<VirtualQueueDashboardDataRefreshResult> abstractC9344n = new AbstractC9344n<VirtualQueueDashboardDataRefreshResult>() { // from class: com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProviderImpl$loadDashboard$response$1
        };
        abstractC9344n.setResult((AbstractC9344n<VirtualQueueDashboardDataRefreshResult>) virtualQueueDashboardDataRefreshResult);
        abstractC9344n.setResult(virtualQueueDashboardDataModelImpl.getHasValidData());
        callback.onChange(abstractC9344n);
        return virtualQueueDashboardDataModelImpl.getHasValidData();
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider
    public void getVirtualQueueDashboardDataModel(final VirtualQueueDashboardListener callback) {
        boolean zLoadDashboard;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.vendomatic.m38721S1()) {
            zLoadDashboard = loadDashboard(callback);
        } else {
            AbstractC9344n<VirtualQueueDashboardDataRefreshResult> abstractC9344n = new AbstractC9344n<VirtualQueueDashboardDataRefreshResult>() { // from class: com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProviderImpl$getVirtualQueueDashboardDataModel$response$1
            };
            zLoadDashboard = false;
            abstractC9344n.setResult((AbstractC9344n<VirtualQueueDashboardDataRefreshResult>) new VirtualQueueDashboardDataRefreshResult(false, new VirtualQueueDashboardDataModelImpl(null, 1, 0 == true ? 1 : 0)));
            abstractC9344n.setResult(false);
            callback.onChange(abstractC9344n);
        }
        if (zLoadDashboard) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("GetDashboardDataThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.manager.dashboard.a
            @Override // java.lang.Runnable
            public final void run() {
                VirtualQueueDashboardProviderImpl.getVirtualQueueDashboardDataModel$lambda$0(this.f45243a, callback);
            }
        }, 10000L);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider
    /* renamed from: isLoggedIn, reason: from getter */
    public boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider
    /* renamed from: isOnProperty, reason: from getter */
    public boolean getIsOnProperty() {
        return this.isOnProperty;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider
    public void setLoggedIn(boolean z10) {
        this.isLoggedIn = z10;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider
    public void setOnProperty(boolean z10) {
        this.isOnProperty = z10;
    }
}