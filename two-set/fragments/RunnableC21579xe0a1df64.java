package com.disney.wdpro.virtualqueue.core.fragments;

import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentReviewDetailsBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m92038d2 = {"", "run", "()V", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 ReviewDetailsFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment$finishSoftRefresh$1\n*L\n1#1,18:1\n494#2,30:19\n*E\n"})
/* renamed from: com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment$finishSoftRefresh$1$invokeSuspend$$inlined$Runnable$1 */
/* loaded from: classes20.dex */
public final class RunnableC21579xe0a1df64 implements Runnable {
    public RunnableC21579xe0a1df64() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        Button button;
        Button button2;
        RecyclerView recyclerView2;
        Button button3;
        if (CommonExtensionsKt.isSafe(reviewDetailsFragment)) {
            if (reviewDetailsFragment.maxPartySizeReached) {
                VqFragmentReviewDetailsBinding binding = reviewDetailsFragment.getBinding();
                TextView textView = binding != null ? binding.yourPartyAlertText : null;
                if (textView != null) {
                    textView.setText(VirtualQueueThemer.getString$default(reviewDetailsFragment.getVqThemer(), VQStringType.ReviewDetailsMaxPartySizeExceeded, MapsKt.mapOf(TuplesKt.m92045to("maxPartySize", Integer.valueOf(reviewDetailsFragment.queue.getMaxPartySize()))), null, false, 12, null));
                }
            }
            if (reviewDetailsFragment.queue.getIsAcceptingJoins()) {
                VqFragmentReviewDetailsBinding binding2 = reviewDetailsFragment.getBinding();
                Button button4 = binding2 != null ? binding2.continueButton : null;
                if (button4 != null) {
                    button4.setEnabled(!reviewDetailsFragment.selectedGuests.isEmpty());
                }
                VqFragmentReviewDetailsBinding binding3 = reviewDetailsFragment.getBinding();
                ConstraintLayout constraintLayout = binding3 != null ? binding3.updateScreenContainer : null;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                VqFragmentReviewDetailsBinding binding4 = reviewDetailsFragment.getBinding();
                Button button5 = binding4 != null ? binding4.continueButton : null;
                if (button5 != null) {
                    button5.setVisibility(0);
                }
                VqFragmentReviewDetailsBinding binding5 = reviewDetailsFragment.getBinding();
                if (binding5 != null && (button3 = binding5.continueButton) != null) {
                    button3.sendAccessibilityEvent(8);
                }
                VqFragmentReviewDetailsBinding binding6 = reviewDetailsFragment.getBinding();
                if (binding6 != null && (recyclerView2 = binding6.groupList) != null) {
                    childAt = recyclerView2.getChildAt(0);
                }
                if (childAt == null) {
                    return;
                }
                childAt.setImportantForAccessibility(1);
                return;
            }
            if (reviewDetailsFragment.noLinkedGuests) {
                VqFragmentReviewDetailsBinding binding7 = reviewDetailsFragment.getBinding();
                ConstraintLayout constraintLayout2 = binding7 != null ? binding7.updateScreenContainer : null;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
                VqFragmentReviewDetailsBinding binding8 = reviewDetailsFragment.getBinding();
                Button button6 = binding8 != null ? binding8.refreshButton : null;
                if (button6 != null) {
                    button6.setEnabled(false);
                }
                VqFragmentReviewDetailsBinding binding9 = reviewDetailsFragment.getBinding();
                childAt = binding9 != null ? binding9.refreshButton : null;
                if (childAt != null) {
                    childAt.setVisibility(0);
                }
                VqFragmentReviewDetailsBinding binding10 = reviewDetailsFragment.getBinding();
                if (binding10 == null || (button2 = binding10.refreshButton) == null) {
                    return;
                }
                button2.sendAccessibilityEvent(8);
                return;
            }
            VqFragmentReviewDetailsBinding binding11 = reviewDetailsFragment.getBinding();
            TextView textView2 = binding11 != null ? binding11.updateScreenWarningText : null;
            if (textView2 != null) {
                textView2.setText(reviewDetailsFragment.nextStepsMessage);
            }
            VqFragmentReviewDetailsBinding binding12 = reviewDetailsFragment.getBinding();
            ConstraintLayout constraintLayout3 = binding12 != null ? binding12.updateScreenContainer : null;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding13 = reviewDetailsFragment.getBinding();
            Button button7 = binding13 != null ? binding13.refreshButton : null;
            if (button7 != null) {
                button7.setEnabled(true);
            }
            VqFragmentReviewDetailsBinding binding14 = reviewDetailsFragment.getBinding();
            Button button8 = binding14 != null ? binding14.refreshButton : null;
            if (button8 != null) {
                button8.setVisibility(0);
            }
            VqFragmentReviewDetailsBinding binding15 = reviewDetailsFragment.getBinding();
            if (binding15 != null && (button = binding15.refreshButton) != null) {
                button.sendAccessibilityEvent(8);
            }
            VqFragmentReviewDetailsBinding binding16 = reviewDetailsFragment.getBinding();
            if (binding16 != null && (recyclerView = binding16.groupList) != null) {
                childAt = recyclerView.getChildAt(0);
            }
            if (childAt == null) {
                return;
            }
            childAt.setImportantForAccessibility(1);
        }
    }
}