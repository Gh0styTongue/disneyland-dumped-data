package com.disney.wdpro.virtualqueue.p462ui.leave_queue;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.C1176t0;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.support.sticky_header.InterfaceC20917l;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.LeaveQueueActions;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.AnonymousPartySizeAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.DetailAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LoadingAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.QueueAction;
import com.disney.wdpro.virtualqueue.p462ui.common.SectionHeaderAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectAllAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.AbstractC22798t1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007:\u0001{B/\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001d¢\u0006\u0004\b%\u0010\u001fJ\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010\u001fJ\u001b\u0010*\u001a\u00020\u001d2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b*\u0010$J\u0015\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0014H\u0016¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u0014H\u0016¢\u0006\u0004\b<\u0010/J\u0017\u0010=\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014H\u0016¢\u0006\u0004\b?\u0010>J\u0017\u0010@\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u0014H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010G\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001aH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020\u0014H\u0016¢\u0006\u0004\bQ\u0010-J'\u0010W\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020R2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\\R\u0014\u0010]\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R&\u0010`\u001a\b\u0012\u0004\u0012\u00020_0 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010\u001f\u001a\u0004\bb\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010aR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010y¨\u0006|"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/support/sticky_header/l;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllActions;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestActions;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeActions;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LeaveQueueActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "selectLinkedGuestAdapterFactory", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/core/interfaces/LeaveQueueActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;)V", "", "viewType", "Lcom/disney/wdpro/commons/adapter/g;", "getStickyHeaderItem", "(I)Lcom/disney/wdpro/commons/adapter/g;", "item", "", "isStickyHeader", "(Lcom/disney/wdpro/commons/adapter/g;)Z", "", "updateList", "()V", "", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;", "guestsList", "addGuestsToList", "(Ljava/util/List;)V", "showLoading", "dataSetChanged", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "setGuests", "maxAnonymousPartySize", "setTotalGuests", "(I)V", "getNextHeaderOffset", "()I", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "viewHolder", "onBindStickyHeaderViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "onBindHeaderViewHolder", "getItemCount", "getItemViewType", "(I)I", "getHeaderType", "isHeader", "(I)Z", MAAccessibilityConstants.SELECTED, "onSelectAllStateChange", "(Z)V", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "setQueueNameHeader", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "guestSelectionUpdated", "(Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$SelectLinkedGuestViewItem;)V", "hasReachedMaxParty", "()Z", "Lcom/disney/wdpro/virtualqueue/ui/common/QueueAction;", "actionType", "()Lcom/disney/wdpro/virtualqueue/ui/common/QueueAction;", "partySize", "updatePartySize", "Landroid/widget/TextView;", "minus", "plus", "Landroid/widget/LinearLayout;", "warningLayout", "updateClosedQueueMessage", "(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V", "Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LeaveQueueActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "nextStickyHeaderOffset", "I", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "guestsToCancel", "guestsToKeep", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "anonymousPartySizeViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/AnonymousPartySizeAdapter$AnonymousPartySizeViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "loadingViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "detailItem", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;", "selectAllViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectAllAdapter$SelectAllViewType;", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "cancelHeaderItem", "Lcom/disney/wdpro/virtualqueue/ui/common/SectionHeaderAdapter$SectionHeaderViewItem;", "keepHeaderItem", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nLeaveQueueMainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeaveQueueMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n1549#2:374\n1620#2,3:375\n1864#2,3:378\n*S KotlinDebug\n*F\n+ 1 LeaveQueueMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter\n*L\n274#1:374\n274#1:375,3\n281#1:378,3\n*E\n"})
/* loaded from: classes20.dex */
public final class LeaveQueueMainAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> implements InterfaceC20917l<RecyclerView.AbstractC4902e0>, SelectAllAdapter.SelectAllActions, SelectLinkedGuestAdapter.SelectLinkedGuestActions, AnonymousPartySizeAdapter.AnonymousPartySizeActions {
    public static final int $stable = 8;
    private final LeaveQueueActions actions;
    private final AnonymousPartySizeAdapter.AnonymousPartySizeViewItem anonymousPartySizeViewItem;
    private final SectionHeaderAdapter.SectionHeaderViewItem cancelHeaderItem;
    private final Context context;
    private final C1176t0<Object> delegateAdapters;
    private final DetailAdapter.DetailViewItem detailItem;
    private final List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> guestsToCancel;
    private final List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> guestsToKeep;
    private final List<AccessibleRecyclerViewItem> items;
    private final SectionHeaderAdapter.SectionHeaderViewItem keepHeaderItem;
    private final LinkedGuestUtils linkedGuestUtils;
    private final LoadingAdapter.LoadingViewType loadingViewItem;
    private final int nextStickyHeaderOffset;
    private final SelectAllAdapter.SelectAllViewType selectAllViewItem;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter$Factory;", "", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "selectLinkedGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter;", "context", "Landroid/content/Context;", "actions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LeaveQueueActions;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final LinkedGuestUtils linkedGuestUtils;
        private final SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapterFactory;

        @Inject
        public Factory(LinkedGuestUtils linkedGuestUtils, SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapterFactory) {
            Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
            Intrinsics.checkNotNullParameter(selectLinkedGuestAdapterFactory, "selectLinkedGuestAdapterFactory");
            this.linkedGuestUtils = linkedGuestUtils;
            this.selectLinkedGuestAdapterFactory = selectLinkedGuestAdapterFactory;
        }

        public final LeaveQueueMainAdapter create(Context context, LeaveQueueActions actions, VirtualQueueThemer vqThemer) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            return new LeaveQueueMainAdapter(context, actions, vqThemer, this.linkedGuestUtils, this.selectLinkedGuestAdapterFactory);
        }
    }

    public LeaveQueueMainAdapter(Context context, LeaveQueueActions actions, VirtualQueueThemer vqThemer, LinkedGuestUtils linkedGuestUtils, SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapterFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(selectLinkedGuestAdapterFactory, "selectLinkedGuestAdapterFactory");
        this.context = context;
        this.actions = actions;
        this.vqThemer = vqThemer;
        this.linkedGuestUtils = linkedGuestUtils;
        this.nextStickyHeaderOffset = context.getResources().getDimensionPixelOffset(C21487R.dimen.vq_shadow_height) + context.getResources().getDimensionPixelOffset(C21487R.dimen.vq_hr_height);
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        this.items = arrayListM69268i;
        ArrayList arrayListM69268i2 = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i2, "newArrayList()");
        this.guestsToCancel = arrayListM69268i2;
        ArrayList arrayListM69268i3 = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i3, "newArrayList()");
        this.guestsToKeep = arrayListM69268i3;
        C1176t0<Object> c1176t0 = new C1176t0<>(0, 1, null);
        this.delegateAdapters = c1176t0;
        AnonymousPartySizeAdapter.AnonymousPartySizeViewItem anonymousPartySizeViewItem = new AnonymousPartySizeAdapter.AnonymousPartySizeViewItem(10006, 0, 1, VirtualQueueThemer.getString$default(vqThemer, VQStringType.LeaveQueueAnonymousUpdatePartyDetail, null, false, 6, null), VirtualQueueThemer.getString$default(vqThemer, VQStringType.LeaveQueueAnonymousPartySize, null, false, 6, null));
        this.anonymousPartySizeViewItem = anonymousPartySizeViewItem;
        LoadingAdapter.LoadingViewType loadingViewType = new LoadingAdapter.LoadingViewType(VirtualQueueThemer.getString$default(vqThemer, VQStringType.LeaveQueueLoading, null, false, 6, null));
        this.loadingViewItem = loadingViewType;
        DetailAdapter.DetailViewItem detailViewItem = new DetailAdapter.DetailViewItem(VirtualQueueConstants.LEAVE_QUEUE_DETAIL_TYPE, null, VirtualQueueThemer.getString$default(vqThemer, VQStringType.LeaveQueueDetail, null, false, 6, null), null, 10, null);
        this.detailItem = detailViewItem;
        SelectAllAdapter.SelectAllViewType selectAllViewType = new SelectAllAdapter.SelectAllViewType();
        this.selectAllViewItem = selectAllViewType;
        SectionHeaderAdapter.SectionHeaderViewItem sectionHeaderViewItem = new SectionHeaderAdapter.SectionHeaderViewItem(VirtualQueueConstants.LEAVE_QUEUE_CANCEL_HEADER, VirtualQueueThemer.getString$default(vqThemer, VQStringType.LeaveQueueRemoveGuestsHeader, null, false, 6, null));
        this.cancelHeaderItem = sectionHeaderViewItem;
        SectionHeaderAdapter.SectionHeaderViewItem sectionHeaderViewItem2 = new SectionHeaderAdapter.SectionHeaderViewItem(VirtualQueueConstants.LEAVE_QUEUE_KEEP_HEADER, VirtualQueueThemer.getString$default(vqThemer, VQStringType.LeaveQueueKeepGuestsHeader, null, false, 6, null));
        this.keepHeaderItem = sectionHeaderViewItem2;
        c1176t0.m5321k(anonymousPartySizeViewItem.getViewType(), new AnonymousPartySizeAdapter(this, vqThemer));
        c1176t0.m5321k(loadingViewType.getViewType(), new LoadingAdapter(LoadingAdapter.LoadingStyleUI.COMMON_LOADING, context, vqThemer));
        c1176t0.m5321k(detailViewItem.getViewType(), new DetailAdapter());
        c1176t0.m5321k(selectAllViewType.getViewType(), new SelectAllAdapter(this, vqThemer));
        int i10 = 2;
        c1176t0.m5321k(sectionHeaderViewItem.getViewType(), new SectionHeaderAdapter(vqThemer, null, i10, 0 == true ? 1 : 0));
        c1176t0.m5321k(sectionHeaderViewItem2.getViewType(), new SectionHeaderAdapter(vqThemer, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0));
        c1176t0.m5321k(10001, selectLinkedGuestAdapterFactory.create(context, this, vqThemer));
    }

    private final void addGuestsToList(List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> guestsList) {
        ImmutableList sortedGuests = AbstractC22798t1.m69693q(guestsList).m69710x(SelectLinkedGuestAdapter.SelectLinkedGuestViewItem.INSTANCE.getSortComparator());
        Intrinsics.checkNotNullExpressionValue(sortedGuests, "sortedGuests");
        int i10 = 0;
        for (Object obj : sortedGuests) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SelectLinkedGuestAdapter.SelectLinkedGuestViewItem selectLinkedGuestViewItem = (SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) obj;
            selectLinkedGuestViewItem.setIndex(i11);
            selectLinkedGuestViewItem.setSectionTotal(sortedGuests.size());
            i10 = i11;
        }
        this.items.addAll(sortedGuests);
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    private final InterfaceC9233g getStickyHeaderItem(int viewType) {
        if (viewType == this.cancelHeaderItem.getViewType()) {
            return this.cancelHeaderItem;
        }
        if (viewType == this.keepHeaderItem.getViewType()) {
            return this.keepHeaderItem;
        }
        return null;
    }

    private final boolean isStickyHeader(InterfaceC9233g item) {
        return Intrinsics.areEqual(item, this.cancelHeaderItem) || Intrinsics.areEqual(item, this.keepHeaderItem);
    }

    private final void updateList() {
        this.items.clear();
        this.items.add(this.detailItem);
        this.items.add(this.selectAllViewItem);
        if (this.guestsToCancel.size() > 0) {
            this.items.add(this.cancelHeaderItem);
            addGuestsToList(this.guestsToCancel);
        }
        if (this.guestsToKeep.size() > 0) {
            this.keepHeaderItem.setHideHeaderText(this.guestsToCancel.size() == 0);
            this.items.add(this.keepHeaderItem);
            addGuestsToList(this.guestsToKeep);
        }
        LeaveQueueActions leaveQueueActions = this.actions;
        List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> list = this.guestsToCancel;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) it.next()).getGuest().getGuestId());
        }
        leaveQueueActions.updatedGuestsToLeave(arrayList);
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions
    public QueueAction actionType() {
        return QueueAction.LEAVE_QUEUE;
    }

    public final void dataSetChanged() {
        notifyDataSetChanged();
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public int getHeaderType(int position) {
        AccessibleRecyclerViewItem accessibleRecyclerViewItem = this.items.get(position);
        if (isStickyHeader(accessibleRecyclerViewItem)) {
            return accessibleRecyclerViewItem.getViewType();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getViewType();
    }

    public final List<AccessibleRecyclerViewItem> getItems() {
        return this.items;
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    /* renamed from: getNextHeaderOffset, reason: from getter */
    public int getNextStickyHeaderOffset() {
        return this.nextStickyHeaderOffset;
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectLinkedGuestAdapter.SelectLinkedGuestActions
    public void guestSelectionUpdated(SelectLinkedGuestAdapter.SelectLinkedGuestViewItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean selected = item.getSelected();
        List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> list = selected ? this.guestsToKeep : this.guestsToCancel;
        List<SelectLinkedGuestAdapter.SelectLinkedGuestViewItem> list2 = selected ? this.guestsToCancel : this.guestsToKeep;
        list.remove(item);
        list2.add(item);
        boolean z10 = this.guestsToKeep.size() == 0;
        if (this.selectAllViewItem.getSelected() != z10) {
            this.selectAllViewItem.setSelected(z10);
        }
        int iIndexOf = this.items.indexOf(item);
        int i10 = iIndexOf + 1;
        if (this.items.size() <= i10) {
            i10 = iIndexOf - 1;
        }
        if (list.size() == 0) {
            i10--;
        }
        updateList();
        dataSetChanged();
        this.items.get(i10).makeAccessibilityFocusRequest(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.CommonGuestMovedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("guest", this.linkedGuestUtils.accessibilityName(item.getGuest(), this.vqThemer)), TuplesKt.m92045to("group", VirtualQueueThemer.getString$default(this.vqThemer, selected ? VQStringType.LeaveQueueRemoveGuestsHeader : VQStringType.LeaveQueueKeepGuestsHeader, null, false, 6, null))), null, false, 12, null));
        this.actions.toggledGuestSelection(selected);
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions, com.disney.wdpro.virtualqueue.ui.common.SelectLinkedGuestAdapter.SelectLinkedGuestActions
    public boolean hasReachedMaxParty() {
        return false;
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public boolean isHeader(int position) {
        return isStickyHeader(this.items.get(position));
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public void onBindHeaderViewHolder(RecyclerView.AbstractC4902e0 viewHolder, int viewType) {
        InterfaceC9233g stickyHeaderItem = getStickyHeaderItem(viewType);
        if (stickyHeaderItem == null || viewHolder == null) {
            return;
        }
        Object objM5316e = this.delegateAdapters.m5316e(stickyHeaderItem.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((ViewTypeStickyHeaderDelegateAdapter) objM5316e).onBindViewHolder(viewHolder, stickyHeaderItem);
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public void onBindStickyHeaderViewHolder(RecyclerView.AbstractC4902e0 viewHolder, int viewType) {
        InterfaceC9233g stickyHeaderItem = getStickyHeaderItem(viewType);
        if (stickyHeaderItem == null || viewHolder == null) {
            return;
        }
        Object objM5316e = this.delegateAdapters.m5316e(stickyHeaderItem.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((ViewTypeStickyHeaderDelegateAdapter) objM5316e).onBindStickyHeaderViewHolder(viewHolder, stickyHeaderItem);
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions
    public void onSelectAllStateChange(boolean selected) {
        for (AccessibleRecyclerViewItem accessibleRecyclerViewItem : this.items) {
            if (accessibleRecyclerViewItem.getViewType() == 10001) {
                Intrinsics.checkNotNull(accessibleRecyclerViewItem, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.common.SelectLinkedGuestAdapter.SelectLinkedGuestViewItem");
                ((SelectLinkedGuestAdapter.SelectLinkedGuestViewItem) accessibleRecyclerViewItem).setSelected(selected);
            }
        }
        if (selected) {
            this.guestsToCancel.addAll(this.guestsToKeep);
            this.guestsToKeep.clear();
        } else {
            this.guestsToKeep.addAll(this.guestsToCancel);
            this.guestsToCancel.clear();
        }
        updateList();
        dataSetChanged();
        this.selectAllViewItem.makeAccessibilityFocusRequest(VirtualQueueThemer.getString$default(this.vqThemer, selected ? VQStringType.CommonAllGuestsAddedAccessibility : VQStringType.CommonAllGuestsRemovedAccessibility, MapsKt.mapOf(TuplesKt.m92045to("group", VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.LeaveQueueRemoveGuestsHeader, null, false, 6, null))), null, false, 12, null));
        this.actions.toggledSelectAll(selected);
    }

    public final void setGuests(List<LinkedGuest> guests) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        this.guestsToCancel.clear();
        this.guestsToKeep.clear();
        Iterator<LinkedGuest> it = guests.iterator();
        while (it.hasNext()) {
            SelectLinkedGuestAdapter.SelectLinkedGuestViewItem selectLinkedGuestViewItem = new SelectLinkedGuestAdapter.SelectLinkedGuestViewItem(it.next(), 0, 0);
            selectLinkedGuestViewItem.setSelected(false);
            this.guestsToKeep.add(selectLinkedGuestViewItem);
        }
        this.selectAllViewItem.setSelected(false);
        this.selectAllViewItem.setShowTopLine(true);
        updateList();
        dataSetChanged();
    }

    public final void setQueueNameHeader(Queue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.detailItem.setTitleString(queue.getName());
        this.anonymousPartySizeViewItem.setQueueName(queue.getName());
    }

    public final void setTotalGuests(int maxAnonymousPartySize) {
        this.anonymousPartySizeViewItem.setMaxPartySize(maxAnonymousPartySize);
        this.anonymousPartySizeViewItem.setPartySize(maxAnonymousPartySize);
        this.items.clear();
        this.items.add(this.anonymousPartySizeViewItem);
        dataSetChanged();
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.SelectAllAdapter.SelectAllActions
    public boolean shouldEnableSelectAll() {
        return SelectAllAdapter.SelectAllActions.DefaultImpls.shouldEnableSelectAll(this);
    }

    public final void showLoading() {
        this.items.clear();
        this.items.add(this.loadingViewItem);
        dataSetChanged();
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.AnonymousPartySizeAdapter.AnonymousPartySizeActions
    public void updateClosedQueueMessage(TextView minus, TextView plus, LinearLayout warningLayout) {
        Intrinsics.checkNotNullParameter(minus, "minus");
        Intrinsics.checkNotNullParameter(plus, "plus");
        Intrinsics.checkNotNullParameter(warningLayout, "warningLayout");
    }

    @Override // com.disney.wdpro.virtualqueue.ui.common.AnonymousPartySizeAdapter.AnonymousPartySizeActions
    public void updatePartySize(int partySize) {
        this.actions.updatePartySize(partySize);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AccessibleRecyclerViewItem accessibleRecyclerViewItem = this.items.get(position);
        holder.setAnimate(true);
        Object objM5316e = this.delegateAdapters.m5316e(accessibleRecyclerViewItem.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((InterfaceC9229c) objM5316e).onBindViewHolder(holder, accessibleRecyclerViewItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AnimateRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objM5316e = this.delegateAdapters.m5316e(viewType);
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        RecyclerView.AbstractC4902e0 abstractC4902e0OnCreateViewHolder = ((InterfaceC9229c) objM5316e).onCreateViewHolder(parent);
        Intrinsics.checkNotNullExpressionValue(abstractC4902e0OnCreateViewHolder, "adapter.onCreateViewHolder(parent)");
        return (AnimateRecyclerViewHolder) abstractC4902e0OnCreateViewHolder;
    }
}