package com.disney.wdpro.virtualqueue.core.manager;

import android.app.Activity;
import com.disney.wdpro.commons.InterfaceC9345o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueTakeOverAction;", "Lcom/disney/wdpro/commons/o;", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "Landroid/app/Activity;", "activity", "", "onShow", "(Landroid/app/Activity;)V", "onHide", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueTakeOverAction implements InterfaceC9345o {
    public static final int $stable = 0;
    public static final String VIRTUAL_QUEUE_TAKEOVER_ACTION = "virtualQueueTakeOverAction";

    @Inject
    public VirtualQueueTakeOverAction() {
    }

    @Override // com.disney.wdpro.commons.InterfaceC9345o
    public String getId() {
        return VIRTUAL_QUEUE_TAKEOVER_ACTION;
    }

    @Override // com.disney.wdpro.commons.InterfaceC9345o
    public void onHide(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.disney.wdpro.commons.InterfaceC9345o
    public void onShow(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}