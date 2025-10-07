package com.disney.wdpro.ticketsaleshybrid.p452ui;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/AnalyticsConfiguration;", "Ljava/io/Serializable;", "linkCategory", "", "trackStateStem", "isEnableNewRelicTracker", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getLinkCategory", "()Ljava/lang/String;", "getTrackStateStem", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class AnalyticsConfiguration implements Serializable {
    private final boolean isEnableNewRelicTracker;
    private final String linkCategory;
    private final String trackStateStem;

    public AnalyticsConfiguration(String linkCategory, String trackStateStem, boolean z10) {
        Intrinsics.checkNotNullParameter(linkCategory, "linkCategory");
        Intrinsics.checkNotNullParameter(trackStateStem, "trackStateStem");
        this.linkCategory = linkCategory;
        this.trackStateStem = trackStateStem;
        this.isEnableNewRelicTracker = z10;
    }

    public final String getLinkCategory() {
        return this.linkCategory;
    }

    public final String getTrackStateStem() {
        return this.trackStateStem;
    }

    /* renamed from: isEnableNewRelicTracker, reason: from getter */
    public final boolean getIsEnableNewRelicTracker() {
        return this.isEnableNewRelicTracker;
    }
}