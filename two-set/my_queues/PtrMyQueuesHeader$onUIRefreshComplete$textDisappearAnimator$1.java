package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m92038d2 = {"com/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader$onUIRefreshComplete$textDisappearAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PtrMyQueuesHeader$onUIRefreshComplete$textDisappearAnimator$1 extends AnimatorListenerAdapter {
    PtrMyQueuesHeader$onUIRefreshComplete$textDisappearAnimator$1() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationEnd(animation);
        TextView textView = this.this$0.messageTextView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTextView");
            textView = null;
        }
        textView.setText("");
        this.this$0.getPtrLoader().setVisibility(4);
    }
}