package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/LeaveQueueActions;", "", "toggledGuestSelection", "", MAAccessibilityConstants.SELECTED, "", "toggledSelectAll", "allSelected", "updatePartySize", "partySize", "", "updatedGuestsToLeave", "guestIds", "", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface LeaveQueueActions {
    void toggledGuestSelection(boolean selected);

    void toggledSelectAll(boolean allSelected);

    void updatePartySize(int partySize);

    void updatedGuestsToLeave(List<String> guestIds);
}