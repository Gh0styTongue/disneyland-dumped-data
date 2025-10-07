package com.disney.wdpro.virtualqueue.core.manager;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingEventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "VQPERFORMANCETRACKING", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public enum PerformanceTrackingEventType {
    VQPERFORMANCETRACKING("VQPerformanceTracking");

    private final String eventType;

    PerformanceTrackingEventType(String str) {
        this.eventType = str;
    }

    public final String getEventType() {
        return this.eventType;
    }
}