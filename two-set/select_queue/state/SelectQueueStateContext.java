package com.disney.wdpro.virtualqueue.p462ui.select_queue.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "", "()V", "selectQueueState", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueState;", "getState", "setState", "", "state", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class SelectQueueStateContext {
    public static final int $stable = 8;
    private SelectQueueState selectQueueState;

    /* renamed from: getState, reason: from getter */
    public final SelectQueueState getSelectQueueState() {
        return this.selectQueueState;
    }

    public final void setState(SelectQueueState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.selectQueueState = state;
    }
}