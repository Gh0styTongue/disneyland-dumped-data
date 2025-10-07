package com.disney.wdpro.virtualqueue.p462ui.redeem;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC4956z;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/BarcodeScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$s;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Landroidx/recyclerview/widget/z;", "snapHelper", "Landroid/widget/TextView;", "textView", "", "size", "<init>", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Lcom/disney/wdpro/virtualqueue/service/model/Position;Ljava/util/List;Landroidx/recyclerview/widget/z;Landroid/widget/TextView;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "Ljava/util/List;", "Landroidx/recyclerview/widget/z;", "Landroid/widget/TextView;", "I", "lastPosition", "getCurrentPosition", "()I", "currentPosition", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class BarcodeScrollListener extends RecyclerView.AbstractC4916s {
    public static final int $stable = 8;
    private final List<LinkedGuest> guests;
    private int lastPosition;
    private final Position position;
    private final Queue queue;
    private final int size;
    private final AbstractC4956z snapHelper;
    private final TextView textView;
    private final VirtualQueueAnalytics virtualQueueAnalytics;
    private final VirtualQueueThemer vqThemer;

    public BarcodeScrollListener(VirtualQueueAnalytics virtualQueueAnalytics, VirtualQueueThemer vqThemer, Queue queue, Position position, List<LinkedGuest> guests, AbstractC4956z snapHelper, TextView textView, int i10) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "virtualQueueAnalytics");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
        this.vqThemer = vqThemer;
        this.queue = queue;
        this.position = position;
        this.guests = guests;
        this.snapHelper = snapHelper;
        this.textView = textView;
        this.size = i10;
    }

    /* renamed from: getCurrentPosition, reason: from getter */
    public final int getLastPosition() {
        return this.lastPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4916s
    public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
        View viewFindSnapView;
        int position;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, dx2, dy2);
        RecyclerView.AbstractC4912o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindSnapView = this.snapHelper.findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == this.lastPosition) {
            return;
        }
        int i10 = position + 1;
        this.textView.setText(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.RedeemTicketIndicator, MapsKt.mapOf(TuplesKt.m92045to("current", String.valueOf(i10)), TuplesKt.m92045to("total", Integer.valueOf(this.size))), null, false, 12, null));
        this.virtualQueueAnalytics.trackRedeemSwipe(i10, this.position, this.queue, this.guests);
        this.lastPosition = position;
    }
}