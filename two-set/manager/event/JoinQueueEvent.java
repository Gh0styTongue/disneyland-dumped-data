package com.disney.wdpro.virtualqueue.core.manager.event;

import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;", "", "()V", "errorResponse", "Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "getErrorResponse", "()Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "setErrorResponse", "(Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;)V", "successResponse", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "getSuccessResponse", "()Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "setSuccessResponse", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "isSuccess", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class JoinQueueEvent {
    public static final int $stable = 8;
    private JoinQueueErrorResponse errorResponse;
    private GetPositionsResponse successResponse;

    public final JoinQueueErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    public final GetPositionsResponse getSuccessResponse() {
        return this.successResponse;
    }

    public final boolean isSuccess() {
        return this.successResponse != null;
    }

    public final void setErrorResponse(JoinQueueErrorResponse joinQueueErrorResponse) {
        this.errorResponse = joinQueueErrorResponse;
    }

    public final void setSuccessResponse(GetPositionsResponse getPositionsResponse) {
        this.successResponse = getPositionsResponse;
    }
}