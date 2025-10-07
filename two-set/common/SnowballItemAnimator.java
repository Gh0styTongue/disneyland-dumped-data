package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import androidx.core.view.C3337b1;
import androidx.core.view.C3365i1;
import androidx.core.view.InterfaceC3369j1;
import androidx.recyclerview.widget.AbstractC4955y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.InterfaceC22463n;
import com.google.common.collect.AbstractC22798t1;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes20.dex */
public class SnowballItemAnimator extends AbstractC4955y {
    private static final boolean DEBUG = false;
    private static InterfaceC22463n<MoveInfo> findDownMovementPredicate = new InterfaceC22463n<MoveInfo>() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.1
        @Override // com.google.common.base.InterfaceC22463n
        public boolean apply(MoveInfo moveInfo) {
            return moveInfo.fromY < moveInfo.toY;
        }
    };
    private long mRemoveMoveDifferenceDuration;
    private ArrayList<RecyclerView.AbstractC4902e0> mBeforeMovePendingRemovals = Lists.m69268i();
    private ArrayList<RecyclerView.AbstractC4902e0> mAfterMovePendingRemovals = Lists.m69268i();
    private ArrayList<RecyclerView.AbstractC4902e0> mPendingAdditions = Lists.m69268i();
    private ArrayList<MoveInfo> mPendingMoves = Lists.m69268i();
    private ArrayList<ChangeInfo> mPendingChanges = Lists.m69268i();
    private ArrayList<ArrayList<RecyclerView.AbstractC4902e0>> mAfterMoveList = Lists.m69268i();
    private ArrayList<ArrayList<RecyclerView.AbstractC4902e0>> mAdditionsList = Lists.m69268i();
    private ArrayList<ArrayList<MoveInfo>> mMovesList = Lists.m69268i();
    private ArrayList<ArrayList<ChangeInfo>> mChangesList = Lists.m69268i();
    private ArrayList<RecyclerView.AbstractC4902e0> mAddAnimations = Lists.m69268i();
    private ArrayList<RecyclerView.AbstractC4902e0> mMoveAnimations = Lists.m69268i();
    private ArrayList<RecyclerView.AbstractC4902e0> mRemoveAnimations = Lists.m69268i();
    private ArrayList<RecyclerView.AbstractC4902e0> mChangeAnimations = Lists.m69268i();
    private final ArrayList<AnimationListener> animationListeners = Lists.m69268i();

    public interface AnimationListener {
        void animationsFinished();
    }

    private static class ChangeInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.AbstractC4902e0 newHolder;
        public RecyclerView.AbstractC4902e0 oldHolder;
        public int toX;
        public int toY;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + AbstractJsonLexerKt.END_OBJ;
        }

        private ChangeInfo(RecyclerView.AbstractC4902e0 abstractC4902e0, RecyclerView.AbstractC4902e0 abstractC4902e02) {
            this.oldHolder = abstractC4902e0;
            this.newHolder = abstractC4902e02;
        }

        private ChangeInfo(RecyclerView.AbstractC4902e0 abstractC4902e0, RecyclerView.AbstractC4902e0 abstractC4902e02, int i10, int i11, int i12, int i13) {
            this(abstractC4902e0, abstractC4902e02);
            this.fromX = i10;
            this.fromY = i11;
            this.toX = i12;
            this.toY = i13;
        }
    }

    private static class MoveInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.AbstractC4902e0 holder;
        public int toX;
        public int toY;

        private MoveInfo(RecyclerView.AbstractC4902e0 abstractC4902e0, int i10, int i11, int i12, int i13) {
            this.holder = abstractC4902e0;
            this.fromX = i10;
            this.fromY = i11;
            this.toX = i12;
            this.toY = i13;
        }
    }

    private static class VpaListenerAdapter implements InterfaceC3369j1 {
        @Override // androidx.core.view.InterfaceC3369j1
        public void onAnimationCancel(View view) {
        }

        @Override // androidx.core.view.InterfaceC3369j1
        public void onAnimationEnd(View view) {
        }

        @Override // androidx.core.view.InterfaceC3369j1
        public void onAnimationStart(View view) {
        }

        private VpaListenerAdapter() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateAddImpl(final RecyclerView.AbstractC4902e0 abstractC4902e0) {
        View view = abstractC4902e0.itemView;
        this.mAddAnimations.add(abstractC4902e0);
        final C3365i1 c3365i1M17248e = C3337b1.m17248e(view);
        c3365i1M17248e.m17455b(1.0f).m17458e(((AnimateRecyclerViewHolder) abstractC4902e0).getIsAnimate() ? getAddDuration() : 0L).m17460g(new VpaListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationCancel(View view2) {
                C3337b1.m17283v0(view2, 1.0f);
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationEnd(View view2) {
                c3365i1M17248e.m17460g(null);
                SnowballItemAnimator.this.dispatchAddFinished(abstractC4902e0);
                SnowballItemAnimator.this.mAddAnimations.remove(abstractC4902e0);
                SnowballItemAnimator.this.dispatchFinishedWhenDone();
                SnowballItemAnimator.this.animationsFinished();
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationStart(View view2) {
                SnowballItemAnimator.this.dispatchAddStarting(abstractC4902e0);
            }
        }).m17463k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateChangeImpl(final ChangeInfo changeInfo) {
        RecyclerView.AbstractC4902e0 abstractC4902e0 = changeInfo.oldHolder;
        View view = abstractC4902e0 == null ? null : abstractC4902e0.itemView;
        RecyclerView.AbstractC4902e0 abstractC4902e02 = changeInfo.newHolder;
        final View view2 = abstractC4902e02 != null ? abstractC4902e02.itemView : null;
        if (view != null) {
            if (((AnimateRecyclerViewHolder) abstractC4902e0).getIsAnimate()) {
                this.mChangeAnimations.add(changeInfo.oldHolder);
                final C3365i1 c3365i1M17458e = C3337b1.m17248e(view).m17458e(getChangeDuration());
                c3365i1M17458e.m17464l(changeInfo.toX - changeInfo.fromX);
                c3365i1M17458e.m17465m(changeInfo.toY - changeInfo.fromY);
                c3365i1M17458e.m17455b(0.0f).m17460g(new VpaListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
                    public void onAnimationEnd(View view3) {
                        c3365i1M17458e.m17460g(null);
                        SnowballItemAnimator.this.setChangeEndAttributesForView(view3);
                        SnowballItemAnimator.this.dispatchChangeFinished(changeInfo.oldHolder, true);
                        SnowballItemAnimator.this.mChangeAnimations.remove(changeInfo.oldHolder);
                        SnowballItemAnimator.this.dispatchAllFinished();
                    }

                    @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
                    public void onAnimationStart(View view3) {
                        SnowballItemAnimator.this.dispatchChangeStarting(changeInfo.oldHolder, true);
                    }
                }).m17463k();
            } else {
                setChangeEndAttributesForView(view);
                dispatchChangeFinished(changeInfo.oldHolder, true);
            }
        }
        if (view2 != null) {
            if (!((AnimateRecyclerViewHolder) abstractC4902e02).getIsAnimate()) {
                setChangeEndAttributesForView(view2);
                dispatchChangeFinished(changeInfo.newHolder, false);
            } else {
                this.mChangeAnimations.add(changeInfo.newHolder);
                final C3365i1 c3365i1M17248e = C3337b1.m17248e(view2);
                c3365i1M17248e.m17464l(0.0f).m17465m(0.0f).m17458e(getChangeDuration()).m17455b(1.0f).m17460g(new VpaListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
                    public void onAnimationEnd(View view3) {
                        c3365i1M17248e.m17460g(null);
                        SnowballItemAnimator.this.setChangeEndAttributesForView(view2);
                        SnowballItemAnimator.this.dispatchChangeFinished(changeInfo.newHolder, false);
                        SnowballItemAnimator.this.mChangeAnimations.remove(changeInfo.newHolder);
                        SnowballItemAnimator.this.dispatchAllFinished();
                    }

                    @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
                    public void onAnimationStart(View view3) {
                        SnowballItemAnimator.this.dispatchChangeStarting(changeInfo.newHolder, false);
                    }
                }).m17463k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateMoveImpl(final RecyclerView.AbstractC4902e0 abstractC4902e0, int i10, int i11, int i12, int i13) {
        View view = abstractC4902e0.itemView;
        final int i14 = i12 - i10;
        final int i15 = i13 - i11;
        if (i14 != 0) {
            C3337b1.m17248e(view).m17464l(0.0f);
        }
        if (i15 != 0) {
            C3337b1.m17248e(view).m17465m(0.0f);
        }
        this.mMoveAnimations.add(abstractC4902e0);
        final C3365i1 c3365i1M17248e = C3337b1.m17248e(view);
        c3365i1M17248e.m17458e(getMoveDuration()).m17460g(new VpaListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationCancel(View view2) {
                if (i14 != 0) {
                    C3337b1.m17224Q0(view2, 0.0f);
                }
                if (i15 != 0) {
                    C3337b1.m17226R0(view2, 0.0f);
                }
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationEnd(View view2) {
                c3365i1M17248e.m17460g(null);
                SnowballItemAnimator.this.dispatchMoveFinished(abstractC4902e0);
                SnowballItemAnimator.this.mMoveAnimations.remove(abstractC4902e0);
                SnowballItemAnimator.this.dispatchAllFinished();
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationStart(View view2) {
                SnowballItemAnimator.this.dispatchMoveStarting(abstractC4902e0);
            }
        }).m17463k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateRemoveImpl(final RecyclerView.AbstractC4902e0 abstractC4902e0) {
        final C3365i1 c3365i1M17248e = C3337b1.m17248e(abstractC4902e0.itemView);
        c3365i1M17248e.m17458e(((AnimateRecyclerViewHolder) abstractC4902e0).getIsAnimate() ? getRemoveDuration() : 0L).m17455b(0.0f).m17460g(new VpaListenerAdapter() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationEnd(View view) {
                c3365i1M17248e.m17460g(null);
                C3337b1.m17283v0(view, 1.0f);
                SnowballItemAnimator.this.dispatchRemoveFinished(abstractC4902e0);
                SnowballItemAnimator.this.mRemoveAnimations.remove(abstractC4902e0);
                SnowballItemAnimator.this.dispatchAllFinished();
            }

            @Override // com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.VpaListenerAdapter, androidx.core.view.InterfaceC3369j1
            public void onAnimationStart(View view) {
                SnowballItemAnimator.this.dispatchRemoveStarting(abstractC4902e0);
            }
        }).m17463k();
        this.mRemoveAnimations.add(abstractC4902e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAllFinished() {
        dispatchFinishedWhenDone();
        animationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    private void endChangeAnimation(List<ChangeInfo> list, RecyclerView.AbstractC4902e0 abstractC4902e0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, abstractC4902e0) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                list.remove(changeInfo);
            }
        }
    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
        RecyclerView.AbstractC4902e0 abstractC4902e0 = changeInfo.oldHolder;
        if (abstractC4902e0 != null) {
            endChangeAnimationIfNecessary(changeInfo, abstractC4902e0);
        }
        RecyclerView.AbstractC4902e0 abstractC4902e02 = changeInfo.newHolder;
        if (abstractC4902e02 != null) {
            endChangeAnimationIfNecessary(changeInfo, abstractC4902e02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeEndAttributesForView(View view) {
        C3337b1.m17283v0(view, 1.0f);
        C3337b1.m17224Q0(view, 0.0f);
        C3337b1.m17226R0(view, 0.0f);
    }

    public void addAnimationListener(AnimationListener animationListener) {
        this.animationListeners.add(animationListener);
    }

    @Override // androidx.recyclerview.widget.AbstractC4955y
    public boolean animateAdd(RecyclerView.AbstractC4902e0 abstractC4902e0) {
        endAnimation(abstractC4902e0);
        C3337b1.m17283v0(abstractC4902e0.itemView, 0.0f);
        this.mPendingAdditions.add(abstractC4902e0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC4955y
    public boolean animateChange(RecyclerView.AbstractC4902e0 abstractC4902e0, RecyclerView.AbstractC4902e0 abstractC4902e02, int i10, int i11, int i12, int i13) {
        float fM17211K = C3337b1.m17211K(abstractC4902e0.itemView);
        float fM17213L = C3337b1.m17213L(abstractC4902e0.itemView);
        float fM17270p = C3337b1.m17270p(abstractC4902e0.itemView);
        endAnimation(abstractC4902e0);
        int i14 = (int) ((i12 - i10) - fM17211K);
        int i15 = (int) ((i13 - i11) - fM17213L);
        C3337b1.m17224Q0(abstractC4902e0.itemView, fM17211K);
        C3337b1.m17226R0(abstractC4902e0.itemView, fM17213L);
        C3337b1.m17283v0(abstractC4902e0.itemView, fM17270p);
        if (abstractC4902e02 != null && abstractC4902e02.itemView != null) {
            endAnimation(abstractC4902e02);
            C3337b1.m17224Q0(abstractC4902e02.itemView, -i14);
            C3337b1.m17226R0(abstractC4902e02.itemView, -i15);
            C3337b1.m17283v0(abstractC4902e02.itemView, 0.0f);
        }
        this.mPendingChanges.add(new ChangeInfo(abstractC4902e0, abstractC4902e02, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC4955y
    public boolean animateMove(RecyclerView.AbstractC4902e0 abstractC4902e0, int i10, int i11, int i12, int i13) {
        View view = abstractC4902e0.itemView;
        int iM17211K = (int) (i10 + C3337b1.m17211K(view));
        int iM17213L = (int) (i11 + C3337b1.m17213L(abstractC4902e0.itemView));
        endAnimation(abstractC4902e0);
        int i14 = i12 - iM17211K;
        int i15 = i13 - iM17213L;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(abstractC4902e0);
            return false;
        }
        if (i14 != 0) {
            C3337b1.m17224Q0(view, -i14);
        }
        if (i15 != 0) {
            C3337b1.m17226R0(view, -i15);
        }
        this.mPendingMoves.add(new MoveInfo(abstractC4902e0, iM17211K, iM17213L, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC4955y
    public boolean animateRemove(RecyclerView.AbstractC4902e0 abstractC4902e0) {
        endAnimation(abstractC4902e0);
        if (((AnimateRecyclerViewHolder) abstractC4902e0).getIsAnimate()) {
            this.mBeforeMovePendingRemovals.add(abstractC4902e0);
            return true;
        }
        this.mAfterMovePendingRemovals.add(abstractC4902e0);
        return true;
    }

    public void animationsFinished() {
        isRunning(new RecyclerView.AbstractC4909l.a() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.11
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4909l.a
            public void onAnimationsFinished() {
                Iterator it = SnowballItemAnimator.this.animationListeners.iterator();
                while (it.hasNext()) {
                    ((AnimationListener) it.next()).animationsFinished();
                }
                SnowballItemAnimator.this.animationListeners.clear();
            }
        });
    }

    void cancelAll(List<RecyclerView.AbstractC4902e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C3337b1.m17248e(list.get(size).itemView).m17456c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4909l
    public void endAnimation(RecyclerView.AbstractC4902e0 abstractC4902e0) {
        View view = abstractC4902e0.itemView;
        C3337b1.m17248e(view).m17456c();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).holder == abstractC4902e0) {
                C3337b1.m17226R0(view, 0.0f);
                C3337b1.m17224Q0(view, 0.0f);
                dispatchMoveFinished(abstractC4902e0);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, abstractC4902e0);
        if (this.mBeforeMovePendingRemovals.remove(abstractC4902e0)) {
            C3337b1.m17283v0(view, 1.0f);
            dispatchRemoveFinished(abstractC4902e0);
        }
        if (this.mAfterMovePendingRemovals.remove(abstractC4902e0)) {
            C3337b1.m17283v0(view, 1.0f);
            dispatchRemoveFinished(abstractC4902e0);
        }
        if (this.mPendingAdditions.remove(abstractC4902e0)) {
            C3337b1.m17283v0(view, 1.0f);
            dispatchAddFinished(abstractC4902e0);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<ChangeInfo> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, abstractC4902e0);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<MoveInfo> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).holder == abstractC4902e0) {
                    C3337b1.m17226R0(view, 0.0f);
                    C3337b1.m17224Q0(view, 0.0f);
                    dispatchMoveFinished(abstractC4902e0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAfterMoveList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC4902e0> arrayList3 = this.mAfterMoveList.get(size5);
            if (arrayList3.remove(abstractC4902e0)) {
                C3337b1.m17283v0(view, 1.0f);
                dispatchRemoveFinished(abstractC4902e0);
                if (arrayList3.isEmpty()) {
                    this.mAfterMoveList.remove(size5);
                }
            }
        }
        for (int size6 = this.mAdditionsList.size() - 1; size6 >= 0; size6--) {
            ArrayList<RecyclerView.AbstractC4902e0> arrayList4 = this.mAdditionsList.get(size6);
            if (arrayList4.remove(abstractC4902e0)) {
                C3337b1.m17283v0(view, 1.0f);
                dispatchAddFinished(abstractC4902e0);
                if (arrayList4.isEmpty()) {
                    this.mAdditionsList.remove(size6);
                }
            }
        }
        this.mRemoveAnimations.remove(abstractC4902e0);
        this.mAddAnimations.remove(abstractC4902e0);
        this.mChangeAnimations.remove(abstractC4902e0);
        this.mMoveAnimations.remove(abstractC4902e0);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4909l
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = this.mPendingMoves.get(size);
            View view = moveInfo.holder.itemView;
            C3337b1.m17226R0(view, 0.0f);
            C3337b1.m17224Q0(view, 0.0f);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mBeforeMovePendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mBeforeMovePendingRemovals.get(size2));
            this.mBeforeMovePendingRemovals.remove(size2);
        }
        for (int size3 = this.mAfterMovePendingRemovals.size() - 1; size3 >= 0; size3--) {
            dispatchRemoveFinished(this.mAfterMovePendingRemovals.get(size3));
            this.mAfterMovePendingRemovals.remove(size3);
        }
        int size4 = this.mPendingAdditions.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            RecyclerView.AbstractC4902e0 abstractC4902e0 = this.mPendingAdditions.get(size4);
            C3337b1.m17283v0(abstractC4902e0.itemView, 1.0f);
            dispatchAddFinished(abstractC4902e0);
            this.mPendingAdditions.remove(size4);
        }
        for (int size5 = this.mPendingChanges.size() - 1; size5 >= 0; size5--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size5));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size6 = this.mMovesList.size() - 1; size6 >= 0; size6--) {
                ArrayList<MoveInfo> arrayList = this.mMovesList.get(size6);
                for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                    MoveInfo moveInfo2 = arrayList.get(size7);
                    View view2 = moveInfo2.holder.itemView;
                    C3337b1.m17226R0(view2, 0.0f);
                    C3337b1.m17224Q0(view2, 0.0f);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList.remove(size7);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size8 = this.mAfterMoveList.size() - 1; size8 >= 0; size8--) {
                ArrayList<RecyclerView.AbstractC4902e0> arrayList2 = this.mAfterMoveList.get(size8);
                for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                    RecyclerView.AbstractC4902e0 abstractC4902e02 = arrayList2.get(size9);
                    C3337b1.m17283v0(abstractC4902e02.itemView, 1.0f);
                    dispatchRemoveFinished(abstractC4902e02);
                    arrayList2.remove(size9);
                    if (arrayList2.isEmpty()) {
                        this.mAfterMoveList.remove(arrayList2);
                    }
                }
            }
            for (int size10 = this.mAdditionsList.size() - 1; size10 >= 0; size10--) {
                ArrayList<RecyclerView.AbstractC4902e0> arrayList3 = this.mAdditionsList.get(size10);
                for (int size11 = arrayList3.size() - 1; size11 >= 0; size11--) {
                    RecyclerView.AbstractC4902e0 abstractC4902e03 = arrayList3.get(size11);
                    C3337b1.m17283v0(abstractC4902e03.itemView, 1.0f);
                    dispatchAddFinished(abstractC4902e03);
                    arrayList3.remove(size11);
                    if (arrayList3.isEmpty()) {
                        this.mAdditionsList.remove(arrayList3);
                    }
                }
            }
            for (int size12 = this.mChangesList.size() - 1; size12 >= 0; size12--) {
                ArrayList<ChangeInfo> arrayList4 = this.mChangesList.get(size12);
                for (int size13 = arrayList4.size() - 1; size13 >= 0; size13--) {
                    endChangeAnimationIfNecessary(arrayList4.get(size13));
                    if (arrayList4.isEmpty()) {
                        this.mChangesList.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4909l
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mBeforeMovePendingRemovals.isEmpty() && this.mAfterMovePendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mAfterMoveList.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4909l
    public void runPendingAnimations() {
        boolean zM69697c;
        boolean zIsEmpty = this.mBeforeMovePendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mAfterMovePendingRemovals.isEmpty();
        boolean zIsEmpty3 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty4 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty5 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty3 && zIsEmpty5 && zIsEmpty4 && zIsEmpty2) {
            return;
        }
        Iterator<RecyclerView.AbstractC4902e0> it = this.mBeforeMovePendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mBeforeMovePendingRemovals.clear();
        if (zIsEmpty3) {
            zM69697c = false;
        } else {
            final ArrayList<MoveInfo> arrayListM69268i = Lists.m69268i();
            arrayListM69268i.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayListM69268i);
            this.mPendingMoves.clear();
            zM69697c = AbstractC22798t1.m69693q(arrayListM69268i).m69697c(findDownMovementPredicate);
            Runnable runnable = new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = arrayListM69268i.iterator();
                    while (it2.hasNext()) {
                        MoveInfo moveInfo = (MoveInfo) it2.next();
                        SnowballItemAnimator.this.animateMoveImpl(moveInfo.holder, moveInfo.fromX, moveInfo.fromY, moveInfo.toX, moveInfo.toY);
                    }
                    arrayListM69268i.clear();
                    SnowballItemAnimator.this.mMovesList.remove(arrayListM69268i);
                }
            };
            if (zIsEmpty) {
                runnable.run();
            } else {
                C3337b1.m17261k0(arrayListM69268i.get(0).holder.itemView, runnable, getRemoveDuration());
            }
        }
        if (!zIsEmpty2) {
            final ArrayList<RecyclerView.AbstractC4902e0> arrayListM69268i2 = Lists.m69268i();
            arrayListM69268i2.addAll(this.mAfterMovePendingRemovals);
            this.mAfterMoveList.add(arrayListM69268i2);
            this.mAfterMovePendingRemovals.clear();
            Runnable runnable2 = new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.3
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = arrayListM69268i2.iterator();
                    while (it2.hasNext()) {
                        SnowballItemAnimator.this.animateRemoveImpl((RecyclerView.AbstractC4902e0) it2.next());
                    }
                    arrayListM69268i2.clear();
                    SnowballItemAnimator.this.mAfterMoveList.remove(arrayListM69268i2);
                }
            };
            if ((zIsEmpty3 && zIsEmpty) || zM69697c) {
                runnable2.run();
            } else {
                C3337b1.m17261k0(arrayListM69268i2.get(0).itemView, runnable2, ((!zIsEmpty ? getRemoveDuration() : 0L) + (!zIsEmpty3 ? getMoveDuration() : 0L)) - this.mRemoveMoveDifferenceDuration);
            }
        }
        if (!zIsEmpty4) {
            final ArrayList<ChangeInfo> arrayListM69268i3 = Lists.m69268i();
            arrayListM69268i3.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayListM69268i3);
            this.mPendingChanges.clear();
            Runnable runnable3 = new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.4
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it2 = arrayListM69268i3.iterator();
                    while (it2.hasNext()) {
                        SnowballItemAnimator.this.animateChangeImpl((ChangeInfo) it2.next());
                    }
                    arrayListM69268i3.clear();
                    SnowballItemAnimator.this.mChangesList.remove(arrayListM69268i3);
                    SnowballItemAnimator.this.dispatchAllFinished();
                }
            };
            if (zIsEmpty) {
                runnable3.run();
            } else {
                C3337b1.m17261k0(arrayListM69268i3.get(0).oldHolder.itemView, runnable3, getRemoveDuration());
            }
        }
        if (zIsEmpty5) {
            return;
        }
        final ArrayList<RecyclerView.AbstractC4902e0> arrayListM69268i4 = Lists.m69268i();
        arrayListM69268i4.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayListM69268i4);
        this.mPendingAdditions.clear();
        Runnable runnable4 = new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.SnowballItemAnimator.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = arrayListM69268i4.iterator();
                while (it2.hasNext()) {
                    SnowballItemAnimator.this.animateAddImpl((RecyclerView.AbstractC4902e0) it2.next());
                }
                arrayListM69268i4.clear();
                SnowballItemAnimator.this.mAdditionsList.remove(arrayListM69268i4);
            }
        };
        if (zIsEmpty && zIsEmpty3 && zIsEmpty4) {
            runnable4.run();
        } else {
            C3337b1.m17261k0(arrayListM69268i4.get(0).itemView, runnable4, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty3 ? getMoveDuration() : 0L, zIsEmpty4 ? 0L : getChangeDuration()));
        }
    }

    public void setRemoveMoveDifferenceDuration(long j10) {
        this.mRemoveMoveDifferenceDuration = j10;
    }

    private boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.AbstractC4902e0 abstractC4902e0) {
        boolean z10 = false;
        if (changeInfo.newHolder == abstractC4902e0) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != abstractC4902e0) {
                return false;
            }
            changeInfo.oldHolder = null;
            z10 = true;
        }
        C3337b1.m17283v0(abstractC4902e0.itemView, 1.0f);
        C3337b1.m17224Q0(abstractC4902e0.itemView, 0.0f);
        C3337b1.m17226R0(abstractC4902e0.itemView, 0.0f);
        dispatchChangeFinished(abstractC4902e0, z10);
        return true;
    }
}