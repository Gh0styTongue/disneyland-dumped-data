package com.disney.wdpro.virtualqueue.core.fragments;

import android.view.View;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentLeaveQueueBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
/* synthetic */ class LeaveQueueFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, VqFragmentLeaveQueueBinding> {
    public static final LeaveQueueFragment$binding$2 INSTANCE = new LeaveQueueFragment$binding$2();

    LeaveQueueFragment$binding$2() {
        super(1, VqFragmentLeaveQueueBinding.class, "bind", "bind(Landroid/view/View;)Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentLeaveQueueBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VqFragmentLeaveQueueBinding invoke(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return VqFragmentLeaveQueueBinding.bind(p02);
    }
}