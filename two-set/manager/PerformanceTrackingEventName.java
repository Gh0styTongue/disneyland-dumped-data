package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingEventName;", "", CheckoutConstants.ANALYTICS_COMMERCE_EVENT_NAME_KEY, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "LOAD_TIME", "SCREEN_TIME", "JOIN_FLOW_TIME", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public enum PerformanceTrackingEventName {
    LOAD_TIME("ScreenLoadTime"),
    SCREEN_TIME("ScreenTime"),
    JOIN_FLOW_TIME("JoinFlowTime");

    private final String eventName;

    PerformanceTrackingEventName(String str) {
        this.eventName = str;
    }

    public final String getEventName() {
        return this.eventName;
    }
}