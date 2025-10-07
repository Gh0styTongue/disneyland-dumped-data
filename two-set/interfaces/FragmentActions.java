package com.disney.wdpro.virtualqueue.core.interfaces;

import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "", "pageLoadTimeTracking", "", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", RecommenderConstants.RECOMMENDER_PERFORMANCE_LOAD_TIME_SCREEN_NAME, "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingScreenName;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "Landroid/view/View;", "isInitialLoad", "", "isSummoned", "showHyperlink", "url", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface FragmentActions {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void pageLoadTimeTracking$default(FragmentActions fragmentActions, PerformanceTracking performanceTracking, PerformanceTrackingScreenName performanceTrackingScreenName, View view, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pageLoadTimeTracking");
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            if ((i10 & 16) != 0) {
                z11 = false;
            }
            fragmentActions.pageLoadTimeTracking(performanceTracking, performanceTrackingScreenName, view, z10, z11);
        }
    }

    void pageLoadTimeTracking(PerformanceTracking performanceTracking, PerformanceTrackingScreenName screenName, View view, boolean isInitialLoad, boolean isSummoned);

    void showHyperlink(String url);
}