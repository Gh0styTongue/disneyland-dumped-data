package com.disney.wdpro.virtualqueue.p462ui.common;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleAdapter;", "", "<init>", "()V", "", "contentDescription", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "item", "", "handleAccessibilityUpdate", "(Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView$e0;Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;)V", "", "FOCUS_DELAY", "J", "getFOCUS_DELAY", "()J", "CONTENT_DESCRIPTION_DELAY", "getCONTENT_DESCRIPTION_DELAY", "NO_DELAY", "getNO_DELAY", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public abstract class AccessibleAdapter {
    public static final int $stable = 0;
    private final long NO_DELAY;
    private final long FOCUS_DELAY = 1000;
    private final long CONTENT_DESCRIPTION_DELAY = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAccessibilityUpdate$lambda$1(AccessibleRecyclerViewItem item, final RecyclerView.AbstractC4902e0 holder, AccessibleAdapter this$0, final String contentDescription) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        if (item.getAccessibilityCustomAnnouncement().length() > 0) {
            holder.itemView.setContentDescription(item.getAccessibilityCustomAnnouncement());
            holder.itemView.postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.a
                @Override // java.lang.Runnable
                public final void run() {
                    AccessibleAdapter.handleAccessibilityUpdate$lambda$1$lambda$0(holder, contentDescription);
                }
            }, this$0.CONTENT_DESCRIPTION_DELAY);
        } else {
            holder.itemView.setContentDescription(contentDescription);
        }
        if (item.getGiveAccessibilityFocus()) {
            holder.itemView.sendAccessibilityEvent(8);
        }
        item.clearAccessibilityFocusRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleAccessibilityUpdate$lambda$1$lambda$0(RecyclerView.AbstractC4902e0 holder, String contentDescription) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        holder.itemView.setContentDescription(contentDescription);
    }

    public final long getCONTENT_DESCRIPTION_DELAY() {
        return this.CONTENT_DESCRIPTION_DELAY;
    }

    public final long getFOCUS_DELAY() {
        return this.FOCUS_DELAY;
    }

    public final long getNO_DELAY() {
        return this.NO_DELAY;
    }

    public final void handleAccessibilityUpdate(final String contentDescription, final RecyclerView.AbstractC4902e0 holder, final AccessibleRecyclerViewItem item) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.itemView.postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.ui.common.b
            @Override // java.lang.Runnable
            public final void run() {
                AccessibleAdapter.handleAccessibilityUpdate$lambda$1(item, holder, this, contentDescription);
            }
        }, item.getGiveAccessibilityFocus() ? this.FOCUS_DELAY : this.NO_DELAY);
    }
}