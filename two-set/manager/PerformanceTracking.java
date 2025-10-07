package com.disney.wdpro.virtualqueue.core.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.bookingservices.checkout.CheckoutConstants;
import com.disney.wdpro.service.business.APIConstants;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.InterfaceC22815x2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http2.Http2Connection;

@Metadata(m92037d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "<init>", "(Lcom/disney/wdpro/analytics/n;)V", "", CheckoutConstants.ANALYTICS_COMMERCE_EVENT_NAME_KEY, "", "clearEntriesFor", "(Ljava/lang/String;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingScreenName;", "trackingScreen", "Landroid/view/View;", "mainView", "correlationId", "", "isInitialLoad", "isSummoned", "logLoadTime", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingScreenName;Landroid/view/View;Ljava/lang/String;ZZ)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingEventName;", "trackingEvent", "", APIConstants.UrlParams.ATTRIBUTES, "logTimedActionStart", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingEventName;Ljava/util/Map;)V", "logTimedActionEnd", "Lcom/disney/wdpro/analytics/n;", "getCrashHelper", "()Lcom/disney/wdpro/analytics/n;", "Lcom/google/common/collect/x2;", "timedEventData", "Lcom/google/common/collect/x2;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPerformanceTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerformanceTracking.kt\ncom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,84:1\n215#2,2:85\n215#2,2:87\n*S KotlinDebug\n*F\n+ 1 PerformanceTracking.kt\ncom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking\n*L\n51#1:85,2\n65#1:87,2\n*E\n"})
/* loaded from: classes20.dex */
public final class PerformanceTracking {
    public static final int $stable = 8;
    private final InterfaceC8682n crashHelper;
    private final InterfaceC22815x2<String, String, Object> timedEventData;

    @Inject
    public PerformanceTracking(InterfaceC8682n crashHelper) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        this.crashHelper = crashHelper;
        HashBasedTable hashBasedTableCreate = HashBasedTable.create();
        Intrinsics.checkNotNullExpressionValue(hashBasedTableCreate, "create()");
        this.timedEventData = hashBasedTableCreate;
    }

    private final void clearEntriesFor(String eventName) {
        Iterator it = new HashSet(this.timedEventData.row(eventName).keySet()).iterator();
        while (it.hasNext()) {
            this.timedEventData.remove(eventName, (String) it.next());
        }
    }

    public static /* synthetic */ void logLoadTime$default(PerformanceTracking performanceTracking, PerformanceTrackingScreenName performanceTrackingScreenName, View view, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        performanceTracking.logLoadTime(performanceTrackingScreenName, view, str, z10, z11);
    }

    public final InterfaceC8682n getCrashHelper() {
        return this.crashHelper;
    }

    public final void logLoadTime(final PerformanceTrackingScreenName trackingScreen, final View mainView, final String correlationId, final boolean isInitialLoad, final boolean isSummoned) {
        Intrinsics.checkNotNullParameter(trackingScreen, "trackingScreen");
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        final long jNanoTime = System.nanoTime();
        mainView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking.logLoadTime.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (mainView.getMeasuredWidth() <= 0 || mainView.getMeasuredHeight() <= 0) {
                    return;
                }
                long jNanoTime2 = System.nanoTime();
                mainView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                double d10 = (jNanoTime2 - jNanoTime) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                this.getCrashHelper().recordCustomEvent(PerformanceTrackingEventType.VQPERFORMANCETRACKING.getEventType(), PerformanceTrackingEventName.LOAD_TIME.getEventName(), MapsKt.mapOf(TuplesKt.m92045to(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), trackingScreen.getScreenName()), TuplesKt.m92045to(PerformanceTrackingAttribute.LOAD_TOTAL.getAttrName(), Double.valueOf(d10)), TuplesKt.m92045to(PerformanceTrackingAttribute.CORRELATION_ID.getAttrName(), correlationId), TuplesKt.m92045to(PerformanceTrackingAttribute.INITIAL_LOAD.getAttrName(), Boolean.valueOf(isInitialLoad)), TuplesKt.m92045to(PerformanceTrackingAttribute.TOTAL_PAGE_LOAD_TIME.getAttrName(), Double.valueOf(d10)), TuplesKt.m92045to(PerformanceTrackingAttribute.IS_SUMMONED.getAttrName(), Boolean.valueOf(isSummoned))));
            }
        });
    }

    public final void logTimedActionEnd(PerformanceTrackingEventName trackingEvent, Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
        InterfaceC22815x2<String, String, Object> interfaceC22815x2 = this.timedEventData;
        String eventName = trackingEvent.getEventName();
        PerformanceTrackingAttribute performanceTrackingAttribute = PerformanceTrackingAttribute.TIMED_TOTAL;
        if (interfaceC22815x2.contains(eventName, performanceTrackingAttribute.getAttrName())) {
            Intrinsics.checkNotNull(this.timedEventData.get(trackingEvent.getEventName(), performanceTrackingAttribute.getAttrName()), "null cannot be cast to non-null type kotlin.Long");
            this.timedEventData.put(trackingEvent.getEventName(), performanceTrackingAttribute.getAttrName(), Double.valueOf((System.nanoTime() - ((Long) r0).longValue()) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
            if (attributes != null) {
                for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
                    this.timedEventData.put(trackingEvent.getEventName(), entry.getKey(), entry.getValue());
                }
            }
            this.crashHelper.recordCustomEvent(PerformanceTrackingEventType.VQPERFORMANCETRACKING.getEventType(), trackingEvent.getEventName(), this.timedEventData.row(trackingEvent.getEventName()));
            clearEntriesFor(trackingEvent.getEventName());
        }
    }

    public final void logTimedActionStart(PerformanceTrackingEventName trackingEvent, Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
        clearEntriesFor(trackingEvent.getEventName());
        this.timedEventData.put(trackingEvent.getEventName(), PerformanceTrackingAttribute.TIMED_TOTAL.getAttrName(), Long.valueOf(System.nanoTime()));
        if (attributes != null) {
            for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
                this.timedEventData.put(trackingEvent.getEventName(), entry.getKey(), entry.getValue());
            }
        }
    }
}