package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "", "showCreateParty", "", "isAnonymous", "", VirtualQueueConstants.SELECT_GUEST_IN_PARTY, VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "facilityId", "", "showFinderDetails", "showHyperlink", "url", "park", "showRequestEnableLocation", "showReviewDetails", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface SelectQueueActions {
    void showCreateParty(boolean isAnonymous, boolean selectGuestInParty, Queue queue, String facilityId);

    void showFinderDetails(String facilityId);

    void showHyperlink(String url, Queue queue, String park);

    void showRequestEnableLocation();

    void showReviewDetails(Queue queue, String facilityId);
}