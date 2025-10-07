package com.disney.wdpro.virtualqueue.core.interfaces;

import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J&\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "", "requestEnableBluetooth", "", "requestEnableLocation", "requestEnablePushNotifications", "showDirections", "facilityId", "", "showLeaveQueue", "position", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "showRedeem", "guests", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "startJoinFlow", "fromMainButton", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface PositionActions {
    void requestEnableBluetooth();

    void requestEnableLocation();

    void requestEnablePushNotifications();

    void showDirections(String facilityId);

    void showLeaveQueue(Position position);

    void showRedeem(Position position, List<LinkedGuest> guests, Queue queue);

    void startJoinFlow(boolean fromMainButton);
}