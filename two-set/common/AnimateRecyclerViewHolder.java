package com.disney.wdpro.virtualqueue.p462ui.common;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "isAnimate", "Z", "()Z", "setAnimate", "(Z)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public abstract class AnimateRecyclerViewHolder extends RecyclerView.AbstractC4902e0 {
    public static final int $stable = 8;
    private boolean isAnimate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateRecyclerViewHolder(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    /* renamed from: isAnimate, reason: from getter */
    public final boolean getIsAnimate() {
        return this.isAnimate;
    }

    public final void setAnimate(boolean z10) {
        this.isAnimate = z10;
    }
}