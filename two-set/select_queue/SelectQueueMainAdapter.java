package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import android.content.Context;
import android.view.ViewGroup;
import androidx.collection.C1176t0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.commons.adapter.InterfaceC9229c;
import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import com.disney.wdpro.recommender.cms.database.dto.model.ExperienceCategoryData;
import com.disney.wdpro.support.sticky_header.InterfaceC20917l;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectHubActions;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CategoryData;
import com.disney.wdpro.virtualqueue.p462ui.common.AnimateRecyclerViewHolder;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VirtualQueueSecretTapAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectHubCardAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectHubQueueEmptyAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCardAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueCategoryHeaderAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueDisclaimerAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueEmptyAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.state.SelectQueueStateContext;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.model.Hub;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002klB_\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J_\u00103\u001a\u00020%2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0(2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020%2\b\b\u0002\u00105\u001a\u00020!¢\u0006\u0004\b6\u0010'J\u001f\u0010:\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020%2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u001bH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001bH\u0016¢\u0006\u0004\bF\u0010EJ\u0017\u0010G\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\bI\u0010HJ\u0017\u0010J\u001a\u00020!2\u0006\u0010=\u001a\u00020\u001bH\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010LR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010MR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010NR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010PR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010QR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010RR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010SR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001d0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020i0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010U¨\u0006m"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "Lcom/disney/wdpro/support/sticky_header/l;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "queueActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;", "hubActions", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "vqRegions", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "secretTapAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$Factory;", "selectQueueCardAdapterFactory", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$Factory;)V", "", "viewType", "Lcom/disney/wdpro/commons/adapter/g;", "getStickyHeaderItem", "(I)Lcom/disney/wdpro/commons/adapter/g;", "item", "", "isStickyHeader", "(Lcom/disney/wdpro/commons/adapter/g;)Z", "showCastAssistanceIcon", "", "updateList", "(Z)V", "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CategoryData;", ExperienceCategoryData.KEY, "", "hubCategories", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "queues", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "hubs", "", "selectedHubContentId", "setCategories", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "genericError", "setEmptyParkView", "Landroid/view/ViewGroup;", "parent", "type", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/disney/wdpro/virtualqueue/ui/common/AnimateRecyclerViewHolder;I)V", "viewHolder", "onBindStickyHeaderViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "onBindHeaderViewHolder", "getItemCount", "()I", "getNextHeaderOffset", "getItemViewType", "(I)I", "getHeaderType", "isHeader", "(I)Z", "Landroidx/fragment/app/Fragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "items", "Ljava/util/List;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "selectQueueStateContent", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "Landroidx/collection/t0;", "", "delegateAdapters", "Landroidx/collection/t0;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueEmptyAdapter$SelectQueueEmptyViewItem;", "emptyViewItem", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueEmptyAdapter$SelectQueueEmptyViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewItem;", "emptyHubQueueItem", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectHubQueueEmptyAdapter$SelectHubQueueEmptyViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewItem;", "disclaimerViewItem", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueDisclaimerAdapter$SelectQueueDisclaimerViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;", "virtualQueueSecretTapViewItem", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$VirtualQueueSecretTapViewItem;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Bucket;", "categoryBuckets", "Bucket", "Factory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSelectQueueMainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1002#2,2:299\n766#2:301\n857#2,2:302\n766#2:304\n857#2,2:305\n766#2:307\n857#2,2:308\n1855#2,2:311\n1855#2:313\n1855#2,2:314\n1856#2:316\n1#3:310\n*S KotlinDebug\n*F\n+ 1 SelectQueueMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter\n*L\n122#1:299,2\n124#1:301\n124#1:302,2\n138#1:304\n138#1:305,2\n139#1:307\n139#1:308,2\n158#1:311,2\n266#1:313\n268#1:314,2\n266#1:316\n*E\n"})
/* loaded from: classes20.dex */
public final class SelectQueueMainAdapter extends RecyclerView.Adapter<AnimateRecyclerViewHolder> implements InterfaceC20917l<RecyclerView.AbstractC4902e0> {
    public static final int $stable = 8;
    private List<Bucket> categoryBuckets;
    private final C1176t0<Object> delegateAdapters;
    private final SelectQueueDisclaimerAdapter.SelectQueueDisclaimerViewItem disclaimerViewItem;
    private SelectHubQueueEmptyAdapter.SelectHubQueueEmptyViewItem emptyHubQueueItem;
    private final SelectQueueEmptyAdapter.SelectQueueEmptyViewItem emptyViewItem;
    private final FacilityUtils facilityUtils;
    private final Fragment fragment;
    private final SelectHubActions hubActions;
    private List<InterfaceC9233g> items;
    private final PicassoUtils picassoUtils;
    private final SelectQueueActions queueActions;
    private final SelectQueueStateContext selectQueueStateContent;
    private final VirtualQueueSecretTapAdapter.VirtualQueueSecretTapViewItem virtualQueueSecretTapViewItem;
    private final VirtualQueueAnalytics vqAnalytics;
    private final VirtualQueueRegions vqRegions;
    private final VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Bucket;", "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CategoryData;", "category", "", "i", "<init>", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CategoryData;I)V", "", "Lcom/disney/wdpro/commons/adapter/g;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$SelectQueueCategoryHeaderViewItem;", "headerItem", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$SelectQueueCategoryHeaderViewItem;", "getHeaderItem", "()Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCategoryHeaderAdapter$SelectQueueCategoryHeaderViewItem;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class Bucket {
        private final SelectQueueCategoryHeaderAdapter.SelectQueueCategoryHeaderViewItem headerItem;
        private List<InterfaceC9233g> items;

        public Bucket(CategoryData category, int i10) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.items = new ArrayList();
            int i11 = i10 + 14000;
            String title = category.getTitle();
            this.headerItem = new SelectQueueCategoryHeaderAdapter.SelectQueueCategoryHeaderViewItem(i11, title == null ? "" : title);
        }

        public final SelectQueueCategoryHeaderAdapter.SelectQueueCategoryHeaderViewItem getHeaderItem() {
            return this.headerItem;
        }

        public final List<InterfaceC9233g> getItems() {
            return this.items;
        }

        public final void setItems(List<InterfaceC9233g> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.items = list;
        }
    }

    @Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JN\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "", "secretTapAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;", "selectQueueCardAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$Factory;", "(Lcom/disney/wdpro/virtualqueue/ui/common/VirtualQueueSecretTapAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueCardAdapter$Factory;)V", "create", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "queueActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "hubActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Factory {
        public static final int $stable = 8;
        private final VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory;
        private final SelectQueueCardAdapter.Factory selectQueueCardAdapterFactory;

        @Inject
        public Factory(VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory, SelectQueueCardAdapter.Factory selectQueueCardAdapterFactory) {
            Intrinsics.checkNotNullParameter(secretTapAdapterFactory, "secretTapAdapterFactory");
            Intrinsics.checkNotNullParameter(selectQueueCardAdapterFactory, "selectQueueCardAdapterFactory");
            this.secretTapAdapterFactory = secretTapAdapterFactory;
            this.selectQueueCardAdapterFactory = selectQueueCardAdapterFactory;
        }

        public static /* synthetic */ SelectQueueMainAdapter create$default(Factory factory, Fragment fragment, SelectQueueActions selectQueueActions, SelectHubActions selectHubActions, VirtualQueueThemer virtualQueueThemer, PicassoUtils picassoUtils, FacilityUtils facilityUtils, VirtualQueueAnalytics virtualQueueAnalytics, VirtualQueueRegions virtualQueueRegions, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                selectQueueActions = null;
            }
            if ((i10 & 4) != 0) {
                selectHubActions = null;
            }
            return factory.create(fragment, selectQueueActions, selectHubActions, virtualQueueThemer, picassoUtils, facilityUtils, virtualQueueAnalytics, virtualQueueRegions);
        }

        public final SelectQueueMainAdapter create(Fragment fragment, SelectQueueActions queueActions, SelectHubActions hubActions, VirtualQueueThemer vqThemer, PicassoUtils picassoUtils, FacilityUtils facilityUtils, VirtualQueueAnalytics vqAnalytics, VirtualQueueRegions vqRegions) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
            Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
            Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
            Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
            Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
            return new SelectQueueMainAdapter(fragment, queueActions, hubActions, vqThemer, picassoUtils, facilityUtils, vqAnalytics, vqRegions, this.secretTapAdapterFactory, this.selectQueueCardAdapterFactory);
        }
    }

    public /* synthetic */ SelectQueueMainAdapter(Fragment fragment, SelectQueueActions selectQueueActions, SelectHubActions selectHubActions, VirtualQueueThemer virtualQueueThemer, PicassoUtils picassoUtils, FacilityUtils facilityUtils, VirtualQueueAnalytics virtualQueueAnalytics, VirtualQueueRegions virtualQueueRegions, VirtualQueueSecretTapAdapter.Factory factory, SelectQueueCardAdapter.Factory factory2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i10 & 2) != 0 ? null : selectQueueActions, (i10 & 4) != 0 ? null : selectHubActions, virtualQueueThemer, picassoUtils, facilityUtils, virtualQueueAnalytics, virtualQueueRegions, factory, factory2);
    }

    private final InterfaceC9233g getStickyHeaderItem(int viewType) {
        for (Bucket bucket : this.categoryBuckets) {
            if (viewType == bucket.getHeaderItem().getViewType()) {
                return bucket.getHeaderItem();
            }
        }
        return null;
    }

    private final boolean isStickyHeader(InterfaceC9233g item) {
        Iterator<Bucket> it = this.categoryBuckets.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(item, it.next().getHeaderItem())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCategories$default(SelectQueueMainAdapter selectQueueMainAdapter, List list, List list2, List list3, List list4, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = null;
        }
        if ((i10 & 2) != 0) {
            list2 = null;
        }
        selectQueueMainAdapter.setCategories(list, list2, list3, list4, str, z10);
    }

    public static /* synthetic */ void setEmptyParkView$default(SelectQueueMainAdapter selectQueueMainAdapter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectQueueMainAdapter.setEmptyParkView(z10);
    }

    private final void updateList(boolean showCastAssistanceIcon) {
        for (Bucket bucket : this.categoryBuckets) {
            this.items.add(bucket.getHeaderItem());
            Iterator<T> it = bucket.getItems().iterator();
            while (it.hasNext()) {
                this.items.add((InterfaceC9233g) it.next());
            }
        }
        if (!StringsKt.isBlank(VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.HowToVisitDisclaimer, null, false, 6, null))) {
            List<InterfaceC9233g> list = this.items;
            Context contextRequireContext = this.fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
            list.add(new SelectQueueDisclaimerAdapter.SelectQueueDisclaimerViewItem(contextRequireContext));
        }
        if (showCastAssistanceIcon) {
            this.items.add(this.virtualQueueSecretTapViewItem);
        }
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public int getHeaderType(int position) {
        InterfaceC9233g interfaceC9233g = this.items.get(position);
        if (isStickyHeader(interfaceC9233g)) {
            return interfaceC9233g.getViewType();
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

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public int getNextHeaderOffset() {
        return getNextHeaderOffset();
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public boolean isHeader(int position) {
        return isStickyHeader(this.items.get(position));
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public void onBindHeaderViewHolder(RecyclerView.AbstractC4902e0 viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        InterfaceC9233g stickyHeaderItem = getStickyHeaderItem(viewType);
        if (stickyHeaderItem != null) {
            Object objM5316e = this.delegateAdapters.m5316e(stickyHeaderItem.getViewType());
            Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
            ((ViewTypeStickyHeaderDelegateAdapter) objM5316e).onBindViewHolder(viewHolder, stickyHeaderItem);
        }
    }

    @Override // com.disney.wdpro.support.sticky_header.InterfaceC20917l
    public void onBindStickyHeaderViewHolder(RecyclerView.AbstractC4902e0 viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        InterfaceC9233g stickyHeaderItem = getStickyHeaderItem(viewType);
        if (stickyHeaderItem != null) {
            Object objM5316e = this.delegateAdapters.m5316e(stickyHeaderItem.getViewType());
            Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.sticky_headers.ViewTypeStickyHeaderDelegateAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
            ((ViewTypeStickyHeaderDelegateAdapter) objM5316e).onBindStickyHeaderViewHolder(viewHolder, stickyHeaderItem);
        }
    }

    public final void setCategories(List<CategoryData> categories, List<CategoryData> hubCategories, List<Queue> queues, List<Hub> hubs, String selectedHubContentId, boolean showCastAssistanceIcon) {
        String str;
        Bucket bucket;
        List<InterfaceC9233g> items;
        List<InterfaceC9233g> items2;
        Intrinsics.checkNotNullParameter(queues, "queues");
        Intrinsics.checkNotNullParameter(hubs, "hubs");
        this.items.clear();
        this.categoryBuckets.clear();
        if (selectedHubContentId == null || !queues.isEmpty()) {
            str = selectedHubContentId;
        } else {
            str = selectedHubContentId;
            String string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.HubNoQueuesDetail, str, false, 4, null);
            Context contextRequireContext = this.fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
            SelectHubQueueEmptyAdapter.SelectHubQueueEmptyViewItem selectHubQueueEmptyViewItem = new SelectHubQueueEmptyAdapter.SelectHubQueueEmptyViewItem(contextRequireContext, string$default);
            this.emptyHubQueueItem = selectHubQueueEmptyViewItem;
            this.items.add(selectHubQueueEmptyViewItem);
        }
        if (queues.isEmpty() && hubs.isEmpty() && str == null) {
            this.items.add(this.emptyViewItem);
        } else {
            int i10 = 0;
            if (hubCategories != null) {
                if (hubCategories.size() > 1) {
                    CollectionsKt.sortWith(hubCategories, new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.SelectQueueMainAdapter$setCategories$lambda$6$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return ComparisonsKt.compareValues(((CategoryData) t10).getTitle(), ((CategoryData) t11).getTitle());
                        }
                    });
                }
                int i11 = 0;
                for (CategoryData categoryData : hubCategories) {
                    int i12 = i11 + 1;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : hubs) {
                        if (Intrinsics.areEqual(((Hub) obj).getCategoryContentId(), categoryData.getCategoryContentId())) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.delegateAdapters.m5321k(i11 + 14000, new SelectQueueCategoryHeaderAdapter());
                        Bucket bucket2 = new Bucket(categoryData, i11);
                        Iterator it = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.SelectQueueMainAdapter$setCategories$lambda$6$$inlined$compareBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t10, T t11) {
                                return ComparisonsKt.compareValues(((Hub) t10).getName(), ((Hub) t11).getName());
                            }
                        }).iterator();
                        while (it.hasNext()) {
                            bucket2.getItems().add(new SelectHubCardAdapter.SelectHubCardViewItem((Hub) it.next()));
                        }
                        this.categoryBuckets.add(bucket2);
                    }
                    i11 = i12;
                }
            }
            Unit unit = null;
            if (categories != null) {
                for (CategoryData categoryData2 : categories) {
                    int i13 = i10 + 1;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : queues) {
                        if (Intrinsics.areEqual(((Queue) obj2).getCategoryContentId(), categoryData2.getCategoryContentId())) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : hubs) {
                        if (Intrinsics.areEqual(((Hub) obj3).getCategoryContentId(), categoryData2.getCategoryContentId())) {
                            arrayList3.add(obj3);
                        }
                    }
                    if (arrayList3.isEmpty() && arrayList2.isEmpty()) {
                        bucket = null;
                    } else {
                        this.delegateAdapters.m5321k(i10 + 14000, new SelectQueueCategoryHeaderAdapter());
                        bucket = new Bucket(categoryData2, i10);
                    }
                    if (!arrayList3.isEmpty()) {
                        for (Hub hub : CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.SelectQueueMainAdapter$setCategories$lambda$12$$inlined$compareBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t10, T t11) {
                                return ComparisonsKt.compareValues(((Hub) t10).getName(), ((Hub) t11).getName());
                            }
                        })) {
                            if (bucket != null && (items2 = bucket.getItems()) != null) {
                                items2.add(new SelectHubCardAdapter.SelectHubCardViewItem(hub));
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        for (Queue queue : CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.select_queue.SelectQueueMainAdapter$setCategories$lambda$12$$inlined$compareBy$2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t10, T t11) {
                                return ComparisonsKt.compareValues(((Queue) t10).getName(), ((Queue) t11).getName());
                            }
                        })) {
                            if (bucket != null && (items = bucket.getItems()) != null) {
                                items.add(new SelectQueueCardAdapter.SelectQueueCardViewItem(queue));
                            }
                        }
                    }
                    if (bucket != null) {
                        this.categoryBuckets.add(bucket);
                    }
                    i10 = i13;
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                Iterator<T> it2 = queues.iterator();
                while (it2.hasNext()) {
                    this.items.add(new SelectQueueCardAdapter.SelectQueueCardViewItem((Queue) it2.next()));
                }
            }
            if (!this.categoryBuckets.isEmpty() || !hubs.isEmpty()) {
                updateList(showCastAssistanceIcon);
            } else if (this.items.size() == 0) {
                this.items.add(this.emptyViewItem);
            }
        }
        notifyDataSetChanged();
    }

    public final void setEmptyParkView(boolean genericError) {
        List<InterfaceC9233g> list = this.items;
        list.clear();
        list.add(this.emptyViewItem);
        if (!genericError) {
            list = null;
        }
        if (list != null) {
            list.add(this.virtualQueueSecretTapViewItem);
        }
        notifyDataSetChanged();
    }

    public SelectQueueMainAdapter(Fragment fragment, SelectQueueActions selectQueueActions, SelectHubActions selectHubActions, VirtualQueueThemer vqThemer, PicassoUtils picassoUtils, FacilityUtils facilityUtils, VirtualQueueAnalytics vqAnalytics, VirtualQueueRegions vqRegions, VirtualQueueSecretTapAdapter.Factory secretTapAdapterFactory, SelectQueueCardAdapter.Factory selectQueueCardAdapterFactory) {
        VirtualQueueThemer virtualQueueThemer;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(picassoUtils, "picassoUtils");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(vqAnalytics, "vqAnalytics");
        Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
        Intrinsics.checkNotNullParameter(secretTapAdapterFactory, "secretTapAdapterFactory");
        Intrinsics.checkNotNullParameter(selectQueueCardAdapterFactory, "selectQueueCardAdapterFactory");
        this.fragment = fragment;
        this.queueActions = selectQueueActions;
        this.hubActions = selectHubActions;
        this.vqThemer = vqThemer;
        this.picassoUtils = picassoUtils;
        this.facilityUtils = facilityUtils;
        this.vqAnalytics = vqAnalytics;
        this.vqRegions = vqRegions;
        ArrayList arrayListM69268i = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i, "newArrayList()");
        this.items = arrayListM69268i;
        SelectQueueStateContext selectQueueStateContext = new SelectQueueStateContext();
        this.selectQueueStateContent = selectQueueStateContext;
        C1176t0<Object> c1176t0 = new C1176t0<>(0, 1, null);
        this.delegateAdapters = c1176t0;
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        SelectQueueEmptyAdapter.SelectQueueEmptyViewItem selectQueueEmptyViewItem = new SelectQueueEmptyAdapter.SelectQueueEmptyViewItem(contextRequireContext);
        this.emptyViewItem = selectQueueEmptyViewItem;
        Context contextRequireContext2 = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "fragment.requireContext()");
        this.emptyHubQueueItem = new SelectHubQueueEmptyAdapter.SelectHubQueueEmptyViewItem(contextRequireContext2, "");
        Context contextRequireContext3 = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "fragment.requireContext()");
        SelectQueueDisclaimerAdapter.SelectQueueDisclaimerViewItem selectQueueDisclaimerViewItem = new SelectQueueDisclaimerAdapter.SelectQueueDisclaimerViewItem(contextRequireContext3);
        this.disclaimerViewItem = selectQueueDisclaimerViewItem;
        VirtualQueueSecretTapAdapter.VirtualQueueSecretTapViewItem virtualQueueSecretTapViewItem = new VirtualQueueSecretTapAdapter.VirtualQueueSecretTapViewItem();
        this.virtualQueueSecretTapViewItem = virtualQueueSecretTapViewItem;
        ArrayList arrayListM69268i2 = Lists.m69268i();
        Intrinsics.checkNotNullExpressionValue(arrayListM69268i2, "newArrayList()");
        this.categoryBuckets = arrayListM69268i2;
        c1176t0.m5321k(selectQueueEmptyViewItem.getViewType(), new SelectQueueEmptyAdapter(vqThemer));
        c1176t0.m5321k(this.emptyHubQueueItem.getViewType(), new SelectHubQueueEmptyAdapter());
        c1176t0.m5321k(virtualQueueSecretTapViewItem.getViewType(), secretTapAdapterFactory.create(fragment));
        if (selectQueueActions != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "fragment.requireActivity()");
            c1176t0.m5321k(13000, selectQueueCardAdapterFactory.create(selectQueueActions, vqThemer, picassoUtils, facilityUtils, vqAnalytics, vqRegions, fragmentActivityRequireActivity, selectQueueStateContext));
        }
        if (selectHubActions != null) {
            FragmentActivity fragmentActivityRequireActivity2 = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "fragment.requireActivity()");
            virtualQueueThemer = vqThemer;
            c1176t0.m5321k(13004, new SelectHubCardAdapter(selectHubActions, virtualQueueThemer, vqAnalytics, picassoUtils, facilityUtils, fragmentActivityRequireActivity2));
        } else {
            virtualQueueThemer = vqThemer;
        }
        c1176t0.m5321k(selectQueueDisclaimerViewItem.getViewType(), new SelectQueueDisclaimerAdapter(virtualQueueThemer));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AnimateRecyclerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InterfaceC9233g interfaceC9233g = this.items.get(position);
        holder.setAnimate(true);
        Object objM5316e = this.delegateAdapters.m5316e(interfaceC9233g.getViewType());
        Intrinsics.checkNotNull(objM5316e, "null cannot be cast to non-null type com.disney.wdpro.commons.adapter.DelegateAdapter<com.disney.wdpro.virtualqueue.ui.common.AnimateRecyclerViewHolder, com.disney.wdpro.commons.adapter.RecyclerViewType>");
        ((InterfaceC9229c) objM5316e).onBindViewHolder(holder, interfaceC9233g);
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