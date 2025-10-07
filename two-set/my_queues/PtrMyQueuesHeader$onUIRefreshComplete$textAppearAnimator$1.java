package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m92038d2 = {"com/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader$onUIRefreshComplete$textAppearAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PtrMyQueuesHeader$onUIRefreshComplete$textAppearAnimator$1 extends AnimatorListenerAdapter {
    final /* synthetic */ String $formattedDate;

    PtrMyQueuesHeader$onUIRefreshComplete$textAppearAnimator$1(String str) {
        str = str;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationEnd(animation);
        TextView textView = this.this$0.messageTextView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
            textView = null;
        }
        VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
        textView.setText(vqThemer != null ? VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLoadingLastUpdated, MapsKt.mapOf(TuplesKt.m92045to("date", str)), null, false, 12, null) : null);
        PtrMyQueuesHeader ptrMyQueuesHeader = this.this$0;
        TextView textView3 = ptrMyQueuesHeader.messageTextView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
        } else {
            textView2 = textView3;
        }
        ptrMyQueuesHeader.sendAnnouncementEvent(textView2.getText().toString());
    }
}