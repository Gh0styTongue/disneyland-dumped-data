package com.disney.wdpro.virtualqueue.core.interfaces;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0013H&¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/CreatePartyActions;", "", "closedQuMessage", "", "minus", "Landroid/widget/TextView;", "plus", "warningLayout", "Landroid/widget/LinearLayout;", "showConfirmation", "response", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "showLinkTicket", "toggledGuestSelection", MAAccessibilityConstants.SELECTED, "", "toggledSelectAll", "updateAnonymousPartySize", "partySize", "", "updatedPartySize", "size", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface CreatePartyActions {
    void closedQuMessage(TextView minus, TextView plus, LinearLayout warningLayout);

    void showConfirmation(GetPositionsResponse response);

    void showLinkTicket();

    void toggledGuestSelection(boolean selected);

    void toggledSelectAll(boolean selected);

    void updateAnonymousPartySize(int partySize);

    void updatedPartySize(int size);
}