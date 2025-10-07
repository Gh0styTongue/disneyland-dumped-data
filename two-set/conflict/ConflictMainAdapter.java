package com.disney.wdpro.virtualqueue.p462ui.conflict;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.C1176t0;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.ConflictActions;
import com.disney.wdpro.virtualqueue.p462ui.common.AccessibleRecyclerViewItem;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.DetailAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LoadingAdapter;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001iB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001f\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010%\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u0018¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0015¢\u0006\u0004\b-\u0010\u0017J\r\u0010.\u001a\u00020\u0015¢\u0006\u0004\b.\u0010\u0017J\u0015\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00152\u0006\u00100\u001a\u00020/¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\u00020\u00152\u0006\u00100\u001a\u00020/¢\u0006\u0004\b4\u00102J\u001d\u00107\u001a\u00020\u00152\u0006\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020/¢\u0006\u0004\b7\u00108J\u001f\u0010<\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020/H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020/H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u0019H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010OR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR&\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010\u0017\u001a\u0004\bU\u0010VR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010TR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010`R\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010TR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010TR\u0016\u0010e\u001a\u0004\u0018\u00010d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00020g0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010T¨\u0006j"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestActions;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ConflictActions;", "actions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "", "parkName", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "conflictGuestAdapterFactory", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/virtualqueue/core/interfaces/ConflictActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;)V", "", "hasConflicts", "()Z", "", "updateList", "()V", "", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;", "conflictGuestItems", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "conflictHeader", "showHeader", "isInConflict", "updateConflictSublist", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;ZZ)V", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guestsInParty", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "initialConflicts", "setGuestsAndQueue", "(Ljava/util/List;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "guestsRemainingInParty", "setGuests", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "conflicts", "updateGuestConflicts", "(Ljava/util/List;)V", "showLoading", "dataSetChanged", "", "position", "itemChanged", "(I)V", "itemRemoved", "itemInserted", "positionStart", "count", "itemRangeRemoved", "(II)V", "Landroid/view/ViewGroup;", "parent", "type", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "guestViewItem", "removeGuestFromParty", "(Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;)V", "isAccessibilityEnabled", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ConflictActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "", "Lcom/disney/wdpro/virtualqueue/ui/common/AccessibleRecyclerViewItem;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "loadingViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/LoadingAdapter$LoadingViewType;", "conflictAlmostDoneItem", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "readyToGoItem", "allGuestItems", "readyGuestItems", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter$Bucket;", "conflictBuckets", "Bucket", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nConflictMainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflictMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1549#2:319\n1620#2,3:320\n1549#2:323\n1620#2,3:324\n1549#2:327\n1620#2,2:328\n1855#2:330\n1856#2:332\n1622#2:333\n766#2:334\n857#2,2:335\n1855#2,2:337\n1855#2,2:339\n1549#2:341\n1620#2,3:342\n1855#2,2:345\n1855#2,2:347\n1#3:331\n*S KotlinDebug\n*F\n+ 1 ConflictMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter\n*L\n96#1:319\n96#1:320,3\n104#1:323\n104#1:324,3\n113#1:327\n113#1:328,2\n120#1:330\n120#1:332\n113#1:333\n133#1:334\n133#1:335,2\n157#1:337,2\n222#1:339,2\n273#1:341\n273#1:342,3\n290#1:345,2\n313#1:347,2\n*E\n"})
/* loaded from: classes20.dex */
public final class ConflictMainAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> implements ConflictGuestAdapter.ConflictGuestActions {
    public static final int $stable = 8;
    private final AccessibilityManager accessibilityManager;
    private final ConflictActions actions;
    private List<ConflictGuestAdapter.ConflictGuestViewItem> allGuestItems;
    private final DetailAdapter.DetailViewItem conflictAlmostDoneItem;
    private List<Bucket> conflictBuckets;
    private final ConflictGuestAdapter.Factory conflictGuestAdapterFactory;
    private final Context context;
    private final C1176t0<Object> delegateAdapters;
    private List<LinkedGuest> guestsInParty;
    private final List<AccessibleRecyclerViewItem> items;
    private final LoadingAdapter.LoadingViewType loadingViewItem;
    private final String parkName;
    private final Queue queue;
    private List<ConflictGuestAdapter.ConflictGuestViewItem> readyGuestItems;
    private final DetailAdapter.DetailViewItem readyToGoItem;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter$Bucket;", "", "title", "", "detail", "(Ljava/lang/String;Ljava/lang/String;)V", "headerItem", "Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "getHeaderItem", "()Lcom/disney/wdpro/virtualqueue/ui/common/DetailAdapter$DetailViewItem;", "items", "", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$ConflictGuestViewItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class Bucket {
        private final DetailAdapter.DetailViewItem headerItem;
        private List<ConflictGuestAdapter.ConflictGuestViewItem> items;

        public Bucket(String title, String detail) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.items = new ArrayList();
            this.headerItem = new DetailAdapter.DetailViewItem(10010, title, detail, "");
        }

        public final DetailAdapter.DetailViewItem getHeaderItem() {
            return this.headerItem;
        }

        public final List<ConflictGuestAdapter.ConflictGuestViewItem> getItems() {
            return this.items;
        }

        public final void setItems(List<ConflictGuestAdapter.ConflictGuestViewItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.items = list;
        }
    }

    public ConflictMainAdapter(Context context, ConflictActions actions, VirtualQueueThemer vqThemer, Queue queue, String parkName, ConflictGuestAdapter.Factory conflictGuestAdapterFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(parkName, "parkName");
        Intrinsics.checkNotNullParameter(conflictGuestAdapterFactory, "conflictGuestAdapterFactory");
        this.context = context;
        this.actions = actions;
        this.vqThemer = vqThemer;
        this.queue = queue;
        this.parkName = parkName;
        this.conflictGuestAdapterFactory = conflictGuestAdapterFactory;
        this.items = new ArrayList();
        this.guestsInParty = CollectionsKt.emptyList();
        C1176t0<Object> c1176t0 = new C1176t0<>(0, 1, null);
        this.delegateAdapters = c1176t0;
        this.allGuestItems = CollectionsKt.emptyList();
        this.readyGuestItems = CollectionsKt.emptyList();
        Object systemService = context.getSystemService("accessibility");
        this.accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        this.conflictBuckets = CollectionsKt.emptyList();
        DetailAdapter.DetailViewItem detailViewItem = new DetailAdapter.DetailViewItem(VirtualQueueConstants.CONFLICT_READY_TO_GO_TYPE, VirtualQueueThemer.getString$default(vqThemer, VQStringType.NsfAllSetTitle, null, false, 6, null), null, VirtualQueueThemer.getString$default(vqThemer, VQStringType.NsfAllSetTitleAccessibility, null, false, 6, null), 4, null);
        this.readyToGoItem = detailViewItem;
        LoadingAdapter.LoadingViewType loadingViewType = new LoadingAdapter.LoadingViewType(VirtualQueueThemer.getString$default(vqThemer, VQStringType.NsfLoading, null, false, 6, null));
        this.loadingViewItem = loadingViewType;
        DetailAdapter.DetailViewItem detailViewItem2 = new DetailAdapter.DetailViewItem(10013, null, VirtualQueueThemer.getString$default(vqThemer, VQStringType.NsfReadyDescription, null, false, 6, null), null, 10, null);
        this.conflictAlmostDoneItem = detailViewItem2;
        c1176t0.m5321k(loadingViewType.getViewType(), new LoadingAdapter(LoadingAdapter.LoadingStyleUI.COMMON_LOADING, context, vqThemer));
        c1176t0.m5321k(detailViewItem2.getViewType(), new DetailAdapter());
        c1176t0.m5321k(10010, new DetailAdapter());
        c1176t0.m5321k(detailViewItem.getViewType(), new DetailAdapter());
        c1176t0.m5321k(10014, conflictGuestAdapterFactory.create(context, this, vqThemer));
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    private final boolean hasConflicts() {
        Iterator<T> it = this.conflictBuckets.iterator();
        while (it.hasNext()) {
            if (!((Bucket) it.next()).getItems().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final void updateConflictSublist(List<ConflictGuestAdapter.ConflictGuestViewItem> conflictGuestItems, DetailAdapter.DetailViewItem conflictHeader, boolean showHeader, boolean isInConflict) {
        if (showHeader) {
            this.items.add(conflictHeader);
            conflictHeader.setShowTopLine(true);
        }
        List listSortedWith = CollectionsKt.sortedWith(conflictGuestItems, ConflictGuestAdapter.ConflictGuestViewItem.INSTANCE.getSortComparator());
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            ((ConflictGuestAdapter.ConflictGuestViewItem) it.next()).setInConflict(isInConflict);
        }
        this.items.addAll(listSortedWith);
    }

    private final void updateList() {
        this.items.clear();
        if (hasConflicts()) {
            for (Bucket bucket : this.conflictBuckets) {
                if (!bucket.getItems().isEmpty()) {
                    updateConflictSublist(bucket.getItems(), bucket.getHeaderItem(), true, true);
                }
            }
        } else {
            this.items.add(this.conflictAlmostDoneItem);
        }
        if (this.readyGuestItems.isEmpty()) {
            return;
        }
        updateConflictSublist(this.readyGuestItems, this.readyToGoItem, hasConflicts(), false);
    }

    public final void dataSetChanged() {
        notifyDataSetChanged();
    }

    public final Context getContext() {
        return this.context;
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

    @Override // com.disney.wdpro.virtualqueue.ui.conflict.ConflictGuestAdapter.ConflictGuestActions
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    public final void itemChanged(int position) {
        notifyItemChanged(position);
    }

    public final void itemInserted(int position) {
        notifyItemInserted(position);
    }

    public final void itemRangeRemoved(int positionStart, int count) {
        notifyItemRangeRemoved(positionStart, count);
    }

    public final void itemRemoved(int position) {
        notifyItemRemoved(position);
    }

    @Override // com.disney.wdpro.virtualqueue.ui.conflict.ConflictGuestAdapter.ConflictGuestActions
    public void removeGuestFromParty(ConflictGuestAdapter.ConflictGuestViewItem guestViewItem) {
        Intrinsics.checkNotNullParameter(guestViewItem, "guestViewItem");
        String titleString = "";
        Bucket bucket = null;
        String detailString = "";
        for (Bucket bucket2 : this.conflictBuckets) {
            if (bucket2.getItems().contains(guestViewItem)) {
                titleString = bucket2.getHeaderItem().getTitleString();
                detailString = bucket2.getHeaderItem().getDetailString();
                bucket = bucket2;
            }
        }
        if (bucket != null) {
            this.actions.guestRemoved(titleString, detailString, bucket.getItems().size());
            bucket.getItems().remove(guestViewItem);
            if (!hasConflicts()) {
                itemRemoved(this.items.indexOf(this.readyToGoItem));
            }
            int iIndexOf = this.items.indexOf(guestViewItem);
            int i10 = iIndexOf + 1;
            if (this.items.size() <= i10) {
                i10 = iIndexOf - 1;
            }
            if (bucket.getItems().isEmpty()) {
                itemRangeRemoved(iIndexOf - 1, 2);
            } else {
                itemRemoved(iIndexOf);
            }
            AccessibleRecyclerViewItem accessibleRecyclerViewItem = this.items.get(i10);
            updateList();
            AccessibilityManager accessibilityManager = this.accessibilityManager;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                AccessibleRecyclerViewItem.makeAccessibilityFocusRequest$default(accessibleRecyclerViewItem, null, 1, null);
                itemChanged(this.items.indexOf(accessibleRecyclerViewItem));
            }
            if (hasConflicts()) {
                return;
            }
            itemInserted(this.items.indexOf(this.conflictAlmostDoneItem));
            ConflictActions conflictActions = this.actions;
            List<ConflictGuestAdapter.ConflictGuestViewItem> list = this.readyGuestItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConflictGuestAdapter.ConflictGuestViewItem) it.next()).getGuest());
            }
            conflictActions.allConflictsResolved(arrayList);
        }
    }

    public final void setGuests(List<LinkedGuest> guestsRemainingInParty, Queue queue) {
        Intrinsics.checkNotNullParameter(guestsRemainingInParty, "guestsRemainingInParty");
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.guestsInParty = guestsRemainingInParty;
        List<LinkedGuest> list = guestsRemainingInParty;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConflictGuestAdapter.ConflictGuestViewItem((LinkedGuest) it.next(), queue));
        }
        this.allGuestItems = arrayList;
    }

    public final void setGuestsAndQueue(List<LinkedGuest> guestsInParty, List<Conflict> initialConflicts, Queue queue) {
        Intrinsics.checkNotNullParameter(guestsInParty, "guestsInParty");
        Intrinsics.checkNotNullParameter(initialConflicts, "initialConflicts");
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.guestsInParty = guestsInParty;
        List<LinkedGuest> list = guestsInParty;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConflictGuestAdapter.ConflictGuestViewItem((LinkedGuest) it.next(), queue));
        }
        this.allGuestItems = arrayList;
        updateGuestConflicts(initialConflicts);
    }

    public final void showLoading() {
        this.items.clear();
        this.items.add(this.loadingViewItem);
        dataSetChanged();
    }

    public final void updateGuestConflicts(List<Conflict> conflicts) {
        Object next;
        Intrinsics.checkNotNullParameter(conflicts, "conflicts");
        if (this.queue.getGuestIdMode() == QueueGuestIdMode.IDENTIFIED) {
            ArrayList arrayList = new ArrayList();
            List<Conflict> list = conflicts;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Conflict conflict : list) {
                Bucket bucket = new Bucket(this.vqThemer.getTitleForConflict(conflict.getConflictType(), this.queue), VirtualQueueThemer.getDetailForConflict$default(this.vqThemer, conflict.getConflictType(), this.queue, this.parkName, false, 8, null));
                for (String str : conflict.getGuestIds()) {
                    Iterator<T> it = this.allGuestItems.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.areEqual(((ConflictGuestAdapter.ConflictGuestViewItem) next).getGuest().getGuestId(), str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ConflictGuestAdapter.ConflictGuestViewItem conflictGuestViewItem = (ConflictGuestAdapter.ConflictGuestViewItem) next;
                    if (conflictGuestViewItem != null && !arrayList.contains(conflictGuestViewItem)) {
                        bucket.getItems().add(conflictGuestViewItem);
                        arrayList.add(conflictGuestViewItem);
                    }
                }
                arrayList2.add(bucket);
            }
            this.conflictBuckets = arrayList2;
            List<ConflictGuestAdapter.ConflictGuestViewItem> list2 = this.allGuestItems;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list2) {
                if (!arrayList.contains((ConflictGuestAdapter.ConflictGuestViewItem) obj)) {
                    arrayList3.add(obj);
                }
            }
            this.readyGuestItems = arrayList3;
        } else {
            Conflict conflict2 = (Conflict) CollectionsKt.firstOrNull((List) conflicts);
            if (conflict2 == null) {
                conflict2 = new Conflict(null, null, 3, null);
            }
            Bucket bucket2 = new Bucket(this.vqThemer.getTitleForConflict(conflict2.getConflictType(), this.queue), VirtualQueueThemer.getDetailForConflict$default(this.vqThemer, conflict2.getConflictType(), this.queue, this.parkName, false, 8, null));
            ConflictGuestAdapter.ConflictGuestViewItem conflictGuestViewItem2 = (ConflictGuestAdapter.ConflictGuestViewItem) CollectionsKt.firstOrNull((List) this.allGuestItems);
            if (conflictGuestViewItem2 != null) {
                bucket2.getItems().add(conflictGuestViewItem2);
            }
            this.conflictBuckets = CollectionsKt.listOf(bucket2);
        }
        updateList();
        dataSetChanged();
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
    public AnimateRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objM5316e = this.delegateAdapters.m5316e(type);
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        RecyclerView.AbstractC4902e0 abstractC4902e0OnCreateViewHolder = ((InterfaceC9229c) objM5316e).onCreateViewHolder(parent);
        Intrinsics.checkNotNullExpressionValue(abstractC4902e0OnCreateViewHolder, "adapter.onCreateViewHolder(parent)");
        return (AnimateRecyclerViewHolder) abstractC4902e0OnCreateViewHolder;
    }
}