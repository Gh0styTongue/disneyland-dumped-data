package com.disney.wdpro.virtualqueue.core.manager.dashboard;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProvider;", "", "isLoggedIn", "", "()Z", "setLoggedIn", "(Z)V", "isOnProperty", "setOnProperty", "getVirtualQueueDashboardDataModel", "", "callback", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardListener;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface VirtualQueueDashboardProvider {
    void getVirtualQueueDashboardDataModel(VirtualQueueDashboardListener callback);

    boolean isLoggedIn();

    boolean isOnProperty();

    void setLoggedIn(boolean z10);

    void setOnProperty(boolean z10);
}