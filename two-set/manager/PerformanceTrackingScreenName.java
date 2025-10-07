package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.p147ma.orion.p230ui.experiences.analytics.OrionExperienceAnalyticsConstants;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingScreenName;", "", RecommenderConstants.RECOMMENDER_PERFORMANCE_LOAD_TIME_SCREEN_NAME, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getScreenName", "()Ljava/lang/String;", "SELECT_QUEUE_SCREEN", "CREATE_PARTY_SCREEN", "MY_DAY_SCREEN", "MY_QUEUES_SCREEN", "CONFIRMATION_SCREEN", "DETAIL_SCREEN", "CONFLICT_SCREEN", "HOW_TO_VISIT_SCREEN", "LEAVE_QUEUE_SCREEN", "REDEEM_SCREEN", "REVIEW_DETAILS_SCREEN", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public enum PerformanceTrackingScreenName {
    SELECT_QUEUE_SCREEN("SelectQueue"),
    CREATE_PARTY_SCREEN("CreateParty"),
    MY_DAY_SCREEN("MyDay"),
    MY_QUEUES_SCREEN("MyQueues"),
    CONFIRMATION_SCREEN("Confirmation"),
    DETAIL_SCREEN("Detail"),
    CONFLICT_SCREEN("Conflict"),
    HOW_TO_VISIT_SCREEN("HowToVisit"),
    LEAVE_QUEUE_SCREEN(OrionExperienceAnalyticsConstants.VALUE_HALF_STACK_LEAVE_QUEUE),
    REDEEM_SCREEN(OrionExperienceAnalyticsConstants.VALUE_HALF_STACK_REDEEM),
    REVIEW_DETAILS_SCREEN("ReviewDetails");

    private final String screenName;

    PerformanceTrackingScreenName(String str) {
        this.screenName = str;
    }

    public final String getScreenName() {
        return this.screenName;
    }
}