package com.disney.wdpro.virtualqueue.core.manager.dashboard;

import com.disney.wdpro.virtualqueue.themer.VQImageUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VQUrlType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0016\u0010!\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0016\u0010#\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006+"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataModelImpl;", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataModel;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "dashboardBannerImageURL", "", "getDashboardBannerImageURL", "()Ljava/lang/String;", "dashboardCtaAnalyticsActionName", "getDashboardCtaAnalyticsActionName", "dashboardCtaDeeplinkURL", "getDashboardCtaDeeplinkURL", "dashboardCtaExtraAnalytics", "", "getDashboardCtaExtraAnalytics", "()Ljava/util/Map;", "dashboardDetails", "getDashboardDetails", "dashboardPrimaryCtaAnalyticsActionName", "getDashboardPrimaryCtaAnalyticsActionName", "dashboardPrimaryCtaDeeplinkURL", "getDashboardPrimaryCtaDeeplinkURL", "dashboardPrimaryCtaExtraAnalytics", "getDashboardPrimaryCtaExtraAnalytics", "dashboardPrimaryCtaTitle", "getDashboardPrimaryCtaTitle", "dashboardSecondaryCtaAnalyticsActionName", "getDashboardSecondaryCtaAnalyticsActionName", "dashboardSecondaryCtaDeeplinkURL", "getDashboardSecondaryCtaDeeplinkURL", "dashboardSecondaryCtaExtraAnalytics", "getDashboardSecondaryCtaExtraAnalytics", "dashboardSecondaryCtaTitle", "getDashboardSecondaryCtaTitle", "dashboardTitle", "getDashboardTitle", "hasValidData", "", "getHasValidData", "()Z", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueDashboardDataModelImpl implements VirtualQueueDashboardDataModel {
    public static final int $stable = 8;
    private final String dashboardBannerImageURL;
    private final String dashboardCtaAnalyticsActionName;
    private final String dashboardCtaDeeplinkURL;
    private final Map<String, String> dashboardCtaExtraAnalytics;
    private final String dashboardDetails;
    private final String dashboardPrimaryCtaAnalyticsActionName;
    private final String dashboardPrimaryCtaDeeplinkURL;
    private final Map<String, String> dashboardPrimaryCtaExtraAnalytics;
    private final String dashboardPrimaryCtaTitle;
    private final String dashboardSecondaryCtaAnalyticsActionName;
    private final String dashboardSecondaryCtaDeeplinkURL;
    private final Map<String, String> dashboardSecondaryCtaExtraAnalytics;
    private final String dashboardSecondaryCtaTitle;
    private final String dashboardTitle;
    private final boolean hasValidData;
    private final VirtualQueueThemer vqThemer;

    public VirtualQueueDashboardDataModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardBannerImageURL() {
        return this.dashboardBannerImageURL;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardCtaAnalyticsActionName() {
        return this.dashboardCtaAnalyticsActionName;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardCtaDeeplinkURL() {
        return this.dashboardCtaDeeplinkURL;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public Map<String, String> getDashboardCtaExtraAnalytics() {
        return this.dashboardCtaExtraAnalytics;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardDetails() {
        return this.dashboardDetails;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardPrimaryCtaAnalyticsActionName() {
        return this.dashboardPrimaryCtaAnalyticsActionName;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardPrimaryCtaDeeplinkURL() {
        return this.dashboardPrimaryCtaDeeplinkURL;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public Map<String, String> getDashboardPrimaryCtaExtraAnalytics() {
        return this.dashboardPrimaryCtaExtraAnalytics;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardPrimaryCtaTitle() {
        return this.dashboardPrimaryCtaTitle;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardSecondaryCtaAnalyticsActionName() {
        return this.dashboardSecondaryCtaAnalyticsActionName;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardSecondaryCtaDeeplinkURL() {
        return this.dashboardSecondaryCtaDeeplinkURL;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public Map<String, String> getDashboardSecondaryCtaExtraAnalytics() {
        return this.dashboardSecondaryCtaExtraAnalytics;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardSecondaryCtaTitle() {
        return this.dashboardSecondaryCtaTitle;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardDataModel
    public String getDashboardTitle() {
        return this.dashboardTitle;
    }

    public final boolean getHasValidData() {
        return this.hasValidData;
    }

    public final VirtualQueueThemer getVqThemer() {
        return this.vqThemer;
    }

    public VirtualQueueDashboardDataModelImpl(VirtualQueueThemer virtualQueueThemer) {
        String dashboardDetails;
        String dashboardBannerImageURL;
        this.vqThemer = virtualQueueThemer;
        boolean z10 = false;
        if (virtualQueueThemer == null) {
            this.hasValidData = false;
            this.dashboardBannerImageURL = null;
            this.dashboardTitle = null;
            this.dashboardDetails = null;
            this.dashboardPrimaryCtaTitle = null;
            this.dashboardPrimaryCtaAnalyticsActionName = null;
            this.dashboardPrimaryCtaDeeplinkURL = null;
            this.dashboardPrimaryCtaExtraAnalytics = null;
            this.dashboardSecondaryCtaTitle = null;
            this.dashboardSecondaryCtaAnalyticsActionName = null;
            this.dashboardSecondaryCtaDeeplinkURL = null;
            this.dashboardSecondaryCtaExtraAnalytics = null;
            this.dashboardCtaAnalyticsActionName = null;
            this.dashboardCtaDeeplinkURL = null;
            this.dashboardCtaExtraAnalytics = null;
            return;
        }
        this.dashboardBannerImageURL = VirtualQueueThemer.getImageUrl$default(virtualQueueThemer, VQImageUrlType.DashboardBannerImageUrl, null, 2, null);
        this.dashboardTitle = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardTitle, null, false, 6, null);
        this.dashboardDetails = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardDetails, null, false, 6, null);
        String dashboardTitle = getDashboardTitle();
        if (dashboardTitle != null && dashboardTitle.length() != 0 && (dashboardDetails = getDashboardDetails()) != null && dashboardDetails.length() != 0 && (dashboardBannerImageURL = getDashboardBannerImageURL()) != null && dashboardBannerImageURL.length() != 0) {
            z10 = true;
        }
        this.hasValidData = z10;
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.m92045to("link.category", "Dashboard"), TuplesKt.m92045to("link.type", "Button | Content"), TuplesKt.m92045to("page.detailname", getDashboardTitle()));
        this.dashboardPrimaryCtaTitle = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardPrimaryCtaTitle, null, false, 6, null);
        this.dashboardPrimaryCtaAnalyticsActionName = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardPrimaryCtaAnalyticsActionName, null, false, 6, null);
        this.dashboardPrimaryCtaDeeplinkURL = VirtualQueueThemer.getUrl$default(virtualQueueThemer, VQUrlType.DashboardPrimaryCtaDeeplinkUrl, null, 2, null);
        this.dashboardPrimaryCtaExtraAnalytics = mapMapOf;
        this.dashboardSecondaryCtaTitle = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardSecondaryCtaTitle, null, false, 6, null);
        this.dashboardSecondaryCtaAnalyticsActionName = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardSecondaryCtaAnalyticsActionName, null, false, 6, null);
        this.dashboardSecondaryCtaDeeplinkURL = VirtualQueueThemer.getUrl$default(virtualQueueThemer, VQUrlType.DashboardSecondaryCtaDeeplinkUrl, null, 2, null);
        this.dashboardSecondaryCtaExtraAnalytics = mapMapOf;
        Map<String, String> mapMapOf2 = MapsKt.mapOf(TuplesKt.m92045to("link.category", "Dashboard"), TuplesKt.m92045to("link.type", "Content"), TuplesKt.m92045to("page.detailname", getDashboardTitle()));
        this.dashboardCtaAnalyticsActionName = VirtualQueueThemer.getString$default(virtualQueueThemer, VQStringType.DashboardCtaAnalyticsActionName, null, false, 6, null);
        this.dashboardCtaDeeplinkURL = VirtualQueueThemer.getUrl$default(virtualQueueThemer, VQUrlType.DashboardCtaDeeplinkUrl, null, 2, null);
        this.dashboardCtaExtraAnalytics = mapMapOf2;
    }

    public /* synthetic */ VirtualQueueDashboardDataModelImpl(VirtualQueueThemer virtualQueueThemer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : virtualQueueThemer);
    }
}