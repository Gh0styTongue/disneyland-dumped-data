package com.disney.wdpro.virtualqueue.core.manager.dashboard;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataRefreshResult;", "", "success", "", "dataModel", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataModel;", "(ZLcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataModel;)V", "getDataModel", "()Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataModel;", "getSuccess", "()Z", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueDashboardDataRefreshResult {
    public static final int $stable = 8;
    private final VirtualQueueDashboardDataModel dataModel;
    private final boolean success;

    public VirtualQueueDashboardDataRefreshResult(boolean z10, VirtualQueueDashboardDataModel dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.success = z10;
        this.dataModel = dataModel;
    }

    public final VirtualQueueDashboardDataModel getDataModel() {
        return this.dataModel;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}