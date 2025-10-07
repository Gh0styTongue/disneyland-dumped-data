package com.disney.wdpro.virtualqueue.core.manager.dashboard;

import java.util.Map;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R \u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R \u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R \u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0014\u0010 \u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardDataModel;", "", "dashboardBannerImageURL", "", "getDashboardBannerImageURL", "()Ljava/lang/String;", "dashboardCtaAnalyticsActionName", "getDashboardCtaAnalyticsActionName", "dashboardCtaDeeplinkURL", "getDashboardCtaDeeplinkURL", "dashboardCtaExtraAnalytics", "", "getDashboardCtaExtraAnalytics", "()Ljava/util/Map;", "dashboardDetails", "getDashboardDetails", "dashboardPrimaryCtaAnalyticsActionName", "getDashboardPrimaryCtaAnalyticsActionName", "dashboardPrimaryCtaDeeplinkURL", "getDashboardPrimaryCtaDeeplinkURL", "dashboardPrimaryCtaExtraAnalytics", "getDashboardPrimaryCtaExtraAnalytics", "dashboardPrimaryCtaTitle", "getDashboardPrimaryCtaTitle", "dashboardSecondaryCtaAnalyticsActionName", "getDashboardSecondaryCtaAnalyticsActionName", "dashboardSecondaryCtaDeeplinkURL", "getDashboardSecondaryCtaDeeplinkURL", "dashboardSecondaryCtaExtraAnalytics", "getDashboardSecondaryCtaExtraAnalytics", "dashboardSecondaryCtaTitle", "getDashboardSecondaryCtaTitle", "dashboardTitle", "getDashboardTitle", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface VirtualQueueDashboardDataModel {
    String getDashboardBannerImageURL();

    String getDashboardCtaAnalyticsActionName();

    String getDashboardCtaDeeplinkURL();

    Map<String, String> getDashboardCtaExtraAnalytics();

    String getDashboardDetails();

    String getDashboardPrimaryCtaAnalyticsActionName();

    String getDashboardPrimaryCtaDeeplinkURL();

    Map<String, String> getDashboardPrimaryCtaExtraAnalytics();

    String getDashboardPrimaryCtaTitle();

    String getDashboardSecondaryCtaAnalyticsActionName();

    String getDashboardSecondaryCtaDeeplinkURL();

    Map<String, String> getDashboardSecondaryCtaExtraAnalytics();

    String getDashboardSecondaryCtaTitle();

    String getDashboardTitle();
}