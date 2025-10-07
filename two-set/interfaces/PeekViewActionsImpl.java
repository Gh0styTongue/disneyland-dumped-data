package com.disney.wdpro.virtualqueue.core.interfaces;

import androidx.fragment.app.Fragment;
import com.disney.wdpro.virtualqueue.core.fragments.DetailFragment;
import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActionsImpl;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "()V", "triggerPeekView", "", "fragment", "Landroidx/fragment/app/Fragment;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PeekViewActionsImpl implements PeekViewActions {
    public static final int $stable = 0;

    @Inject
    public PeekViewActionsImpl() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions
    public void triggerPeekView(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment instanceof MyQueuesFragment) {
            ((MyQueuesFragment) fragment).triggerPeekView();
            return;
        }
        if (fragment instanceof SelectQueueFragment) {
            ((SelectQueueFragment) fragment).triggerPeekView();
            return;
        }
        if (fragment instanceof DetailFragment) {
            ((DetailFragment) fragment).triggerPeekView();
            return;
        }
        throw new IllegalStateException("The fragment " + fragment.getClass().getName() + " is missing trigger method to handle peek view click callback, add trigger method in fragment and call it in PeekViewActionsImpl");
    }
}