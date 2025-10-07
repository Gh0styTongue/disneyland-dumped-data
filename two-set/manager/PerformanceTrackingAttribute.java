package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.park.dashboard.utils.ThemeableHeaderNewRelicHelper;
import com.disney.wdpro.recommender.core.RecommenderConstants;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTrackingAttribute;", "", "attrName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAttrName", "()Ljava/lang/String;", "LOAD_TIME_SCREEN_NAME", "LOAD_TOTAL", "TIMED_TOTAL", "LINKED_GUESTS", "SELECTED_GUESTS_START", "SELECTED_GUESTS_END", "UNSELECTED_GUESTS_START", "GUESTS_IN_CONFLICT_START", "GUESTS_IN_CONFLICT_END", "ANONYMOUS_GUEST", "CHANGES_MADE", "CORRELATION_ID", "INITIAL_LOAD", "EXIT_POINT", "EXIT_SUCCESS", "EXIT_FAILURE", "EXIT_BACK_PRESSED", "EXIT_NSF", "TOTAL_PAGE_LOAD_TIME", "IS_SUMMONED", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public enum PerformanceTrackingAttribute {
    LOAD_TIME_SCREEN_NAME(RecommenderConstants.RECOMMENDER_PERFORMANCE_LOAD_TIME_SCREEN_NAME),
    LOAD_TOTAL("loadTotal"),
    TIMED_TOTAL("timedTotal"),
    LINKED_GUESTS("linkedGuests"),
    SELECTED_GUESTS_START("selectedGuestsStart"),
    SELECTED_GUESTS_END("selectedGuestsEnd"),
    UNSELECTED_GUESTS_START("unselectedGuestsStart"),
    GUESTS_IN_CONFLICT_START("guestsInConflictStart"),
    GUESTS_IN_CONFLICT_END("guestsInConflictEnd"),
    ANONYMOUS_GUEST("isAnonymousGuest"),
    CHANGES_MADE("changesMade"),
    CORRELATION_ID("correlationId"),
    INITIAL_LOAD(ThemeableHeaderNewRelicHelper.INITIAL_LOAD),
    EXIT_POINT("exitPoint"),
    EXIT_SUCCESS("success"),
    EXIT_FAILURE("failure"),
    EXIT_BACK_PRESSED("backPressed"),
    EXIT_NSF("notSoFast"),
    TOTAL_PAGE_LOAD_TIME("pageLoadTime"),
    IS_SUMMONED("isSummoned");

    private final String attrName;

    PerformanceTrackingAttribute(String str) {
        this.attrName = str;
    }

    public final String getAttrName() {
        return this.attrName;
    }
}