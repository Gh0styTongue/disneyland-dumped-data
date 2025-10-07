package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.DialogInterfaceC0229b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.interfaces.LeaveQueueActions;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.event.GetPositionsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.LeaveQueueEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.UpdateAnonymousPartySizeEvent;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentLeaveQueueBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.SnowballAnimationUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SnowballItemAnimator;
import com.disney.wdpro.virtualqueue.p462ui.leave_queue.LeaveQueueMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.StickyHeadersItemDecoration;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.PositionsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.snap.camerakit.internal.h76;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import p498da.InterfaceC27132a;

@Metadata(m92037d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008c\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J-\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010\u0006J\u0019\u0010-\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u0010\u0006J\u001d\u00102\u001a\u00020\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u0010\u001dJ\u0017\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u0010\u001dJ\u0017\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010b\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001d\u0010m\u001a\u0004\u0018\u00010h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020n008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010xR\u0016\u0010z\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\n008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010pR7\u0010\u0082\u0001\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008d\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/LeaveQueueFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LeaveQueueActions;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "handleRemove", "handleRemoveAnonymous", "", "title", "detail", "removeCta", "cancelCta", "showConfirmationAlert", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "doRemove", "", "isSuccess", "removingAllGuests", "onLeaveQueue", "(ZZ)V", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "event", "onGetPositions", "(Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;)V", "isRemovingAllGuests", "handleNavigationToNextPage", "(Z)V", "showLoadingError", "showLeaveErrorMessage", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onActivityCreated", "(Landroid/os/Bundle;)V", "onDestroy", "", "guestIds", "updatedGuestsToLeave", "(Ljava/util/List;)V", "allSelected", "toggledSelectAll", MAAccessibilityConstants.SELECTED, "toggledGuestSelection", "", "partySize", "updatePartySize", "(I)V", "onBackPressed", "()Z", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter$Factory;", "leaveQueueMainAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter$Factory;", "getLeaveQueueMainAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter$Factory;", "setLeaveQueueMainAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentLeaveQueueBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentLeaveQueueBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guestsInParty", "Ljava/util/List;", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.POSITION_ID_HASH_PARAM, "Ljava/lang/String;", "completionDeepLink", "newPartySize", "I", "Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/leave_queue/LeaveQueueMainAdapter;", "guestIdsToRemove", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nLeaveQueueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeaveQueueFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/LeaveQueueFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n1549#2:393\n1620#2,3:394\n288#2,2:397\n288#2,2:399\n766#2:401\n857#2,2:402\n1549#2:404\n1620#2,3:405\n*S KotlinDebug\n*F\n+ 1 LeaveQueueFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/LeaveQueueFragment\n*L\n240#1:393\n240#1:394,3\n246#1:397,2\n248#1:399,2\n249#1:401\n249#1:402,2\n277#1:404\n277#1:405,3\n*E\n"})
/* loaded from: classes20.dex */
public final class LeaveQueueFragment extends VirtualQueueBaseFragment implements LeaveQueueActions, InterfaceC27132a, InterfaceC30065h0 {
    private LeaveQueueMainAdapter adapter;

    @Inject
    public FacilityUtils facilityUtils;

    @Inject
    public LeaveQueueMainAdapter.Factory leaveQueueMainAdapterFactory;
    private int newPartySize;

    @Inject
    public PerformanceTracking performanceTracking;
    private Queue queue;

    @Inject
    public SharedPreferences sharedPreferences;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LeaveQueueFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentLeaveQueueBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, LeaveQueueFragment$binding$2.INSTANCE);
    private List<LinkedGuest> guestsInParty = CollectionsKt.emptyList();
    private Position position = new Position(null, null, 0, 0, 0, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
    private String positionIdHash = "";
    private String completionDeepLink = "";
    private List<String> guestIdsToRemove = CollectionsKt.emptyList();
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/LeaveQueueFragment$Companion;", "", "()V", "createDataBundle", "Landroid/os/Bundle;", "position", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/LeaveQueueFragment;", "data", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle createDataBundle(Position position) {
            Intrinsics.checkNotNullParameter(position, "position");
            Bundle bundle = new Bundle();
            bundle.putString(VirtualQueueConstants.POSITION_ID_HASH_PARAM, position.getPositionIdHash());
            return bundle;
        }

        public final LeaveQueueFragment newInstance(Bundle data) {
            LeaveQueueFragment leaveQueueFragment = new LeaveQueueFragment();
            leaveQueueFragment.setArguments(data);
            return leaveQueueFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$doRemove$1", m92053f = "LeaveQueueFragment.kt", m92054i = {}, m92055l = {197}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$doRemove$1 */
    static final class C215621 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $removingAllGuests;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215621(boolean z10, Continuation<? super C215621> continuation) {
            super(2, continuation);
            this.$removingAllGuests = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LeaveQueueFragment.this.new C215621(this.$removingAllGuests, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = LeaveQueueFragment.this.getVirtualQueueManager();
                String queueId = LeaveQueueFragment.this.position.getQueueId();
                List<String> list = LeaveQueueFragment.this.guestIdsToRemove;
                this.label = 1;
                obj = virtualQueueManager.leaveQueue(queueId, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LeaveQueueFragment.this.onLeaveQueue(((LeaveQueueEvent) obj).isSuccess(), this.$removingAllGuests);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215621) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$doRemove$2", m92053f = "LeaveQueueFragment.kt", m92054i = {}, m92055l = {208}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$doRemove$2 */
    static final class C215632 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215632(Continuation<? super C215632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LeaveQueueFragment.this.new C215632(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = LeaveQueueFragment.this.getVirtualQueueManager();
                String queueId = LeaveQueueFragment.this.position.getQueueId();
                int i11 = LeaveQueueFragment.this.newPartySize;
                this.label = 1;
                obj = virtualQueueManager.updateAnonymousPartySize(queueId, i11, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LeaveQueueFragment.this.onLeaveQueue(((UpdateAnonymousPartySizeEvent) obj).isSuccess(), LeaveQueueFragment.this.newPartySize == 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215632) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$doRemove$3", m92053f = "LeaveQueueFragment.kt", m92054i = {}, m92055l = {h76.CAMPAIGN_PUSH_NOTIFICATION_RECEIVED_IN_EXTENSION_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$doRemove$3 */
    static final class C215643 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215643(Continuation<? super C215643> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LeaveQueueFragment.this.new C215643(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = LeaveQueueFragment.this.getVirtualQueueManager();
                String queueId = LeaveQueueFragment.this.position.getQueueId();
                List<String> listEmptyList = CollectionsKt.emptyList();
                this.label = 1;
                obj = virtualQueueManager.leaveQueue(queueId, listEmptyList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LeaveQueueFragment.this.onLeaveQueue(((LeaveQueueEvent) obj).isSuccess(), LeaveQueueFragment.this.guestIdsToRemove.size() == LeaveQueueFragment.this.guestsInParty.size());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215643) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$onActivityCreated$1", m92053f = "LeaveQueueFragment.kt", m92054i = {}, m92055l = {133}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment$onActivityCreated$1 */
    static final class C215651 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215651(Continuation<? super C215651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LeaveQueueFragment.this.new C215651(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = LeaveQueueFragment.this.getVirtualQueueManager();
                this.label = 1;
                obj = virtualQueueManager.getPositions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LeaveQueueFragment.this.onGetPositions((GetPositionsEvent) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215651) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void doRemove() {
        LeaveQueueMainAdapter leaveQueueMainAdapter = this.adapter;
        Queue queue = null;
        if (leaveQueueMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            leaveQueueMainAdapter = null;
        }
        leaveQueueMainAdapter.showLoading();
        Queue queue2 = this.queue;
        if (queue2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue2 = null;
        }
        if (queue2.getGuestIdMode() != QueueGuestIdMode.IDENTIFIED) {
            if (this.newPartySize > 0) {
                C30113j.m92948d(this, null, null, new C215632(null), 3, null);
                return;
            } else {
                C30113j.m92948d(this, null, null, new C215643(null), 3, null);
                return;
            }
        }
        boolean z10 = this.guestIdsToRemove.size() == this.guestsInParty.size();
        C30113j.m92948d(this, null, null, new C215621(z10, null), 3, null);
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        Queue queue3 = this.queue;
        if (queue3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
        } else {
            queue = queue3;
        }
        virtualQueueAnalytics.trackLeaveQueueConfirm(queue, this.guestIdsToRemove.size(), z10, this.position.getBoardingGroup());
    }

    private final VqFragmentLeaveQueueBinding getBinding() {
        return (VqFragmentLeaveQueueBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNavigationToNextPage(boolean isRemovingAllGuests) {
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        if (StringsKt.isBlank(this.completionDeepLink)) {
            requireActivity().finish();
        } else {
            getActivityActions().navigateTo(new C8663c.b(this.completionDeepLink).m37293g().build());
        }
    }

    private final void handleRemove() {
        showConfirmationAlert(this.guestIdsToRemove.size() == 1 ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueConfirmationTitle, null, false, 6, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueConfirmationTitlePlural, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueConfirmationDetail, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueConfirmationRemove, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueConfirmationCancel, null, false, 6, null));
        int size = this.guestsInParty.size() - this.guestIdsToRemove.size();
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        List<LinkedGuest> list = this.guestsInParty;
        Queue queue = this.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        virtualQueueAnalytics.trackLeaveQueueRemove(list, queue, size);
    }

    private final void handleRemoveAnonymous() {
        showConfirmationAlert(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousConfirmationTitle, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousConfirmationDetail, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousConfirmationRemove, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousConfirmationCancel, null, false, 6, null));
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        List<LinkedGuest> list = this.guestsInParty;
        Queue queue = this.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        virtualQueueAnalytics.trackLeaveQueueRemove(list, queue, this.newPartySize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGetPositions(GetPositionsEvent event) {
        Object next;
        Queue queue;
        String ancestorThemePark;
        String str;
        Object next2;
        if (!event.isSuccess() || event.getPayload() == null || event.getPayload().getResponseStatus() != PositionsResponseStatus.OK) {
            showLoadingError();
        }
        GetPositionsResponse payload = event.getPayload();
        if (payload == null) {
            payload = new GetPositionsResponse(null, null, null, null, false, 31, null);
        }
        VirtualQueueThemer vqThemer = getVqThemer();
        List<Queue> queues = payload.getQueues();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(queues, 10));
        Iterator<T> it = queues.iterator();
        while (it.hasNext()) {
            arrayList.add(((Queue) it.next()).getContentId());
        }
        vqThemer.refreshDocuments(arrayList);
        List listEmptyList = CollectionsKt.emptyList();
        Iterator<T> it2 = payload.getPositions().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.areEqual(((Position) next).getPositionIdHash(), this.positionIdHash)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Position position = (Position) next;
        if (position != null) {
            Iterator<T> it3 = payload.getQueues().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.areEqual(((Queue) next2).getQueueId(), position.getQueueId())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            queue = (Queue) next2;
            List<LinkedGuest> guests = payload.getGuests();
            listEmptyList = new ArrayList();
            for (Object obj : guests) {
                if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                    listEmptyList.add(obj);
                }
            }
            if ((queue != null ? queue.getGuestIdMode() : null) == QueueGuestIdMode.ANONYMOUS) {
                ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousUpdatePartyHeader, null, false, 6, null), false, 2, null);
                VqFragmentLeaveQueueBinding binding = getBinding();
                Button button = binding != null ? binding.removeButton : null;
                if (button != null) {
                    button.setEnabled(true);
                }
            } else {
                ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueHeader, null, false, 6, null), false, 2, null);
                VqFragmentLeaveQueueBinding binding2 = getBinding();
                Button button2 = binding2 != null ? binding2.removeButton : null;
                if (button2 != null) {
                    button2.setEnabled(false);
                }
            }
        } else {
            queue = null;
        }
        if (position == null || queue == null || (queue.getGuestIdMode() == QueueGuestIdMode.IDENTIFIED && listEmptyList.isEmpty())) {
            showLoadingError();
            return;
        }
        if (queue.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS) {
            this.guestsInParty = listEmptyList;
            this.guestIdsToRemove = CollectionsKt.emptyList();
            this.queue = queue;
            this.position = position;
            LeaveQueueMainAdapter leaveQueueMainAdapter = this.adapter;
            if (leaveQueueMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                leaveQueueMainAdapter = null;
            }
            leaveQueueMainAdapter.setTotalGuests(this.position.getAnonymousPartySize());
            LeaveQueueMainAdapter leaveQueueMainAdapter2 = this.adapter;
            if (leaveQueueMainAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                leaveQueueMainAdapter2 = null;
            }
            Queue queue2 = this.queue;
            if (queue2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
                queue2 = null;
            }
            leaveQueueMainAdapter2.setQueueNameHeader(queue2);
            FacilityUtils facilityUtils = getFacilityUtils();
            Queue queue3 = this.queue;
            if (queue3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
                queue3 = null;
            }
            Facility facility = facilityUtils.getFacility(queue3.getExternalDefinitionId());
            ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
            str = ancestorThemePark != null ? ancestorThemePark : "";
            VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
            int anonymousPartySize = this.position.getAnonymousPartySize();
            String simpleName = LeaveQueueFragment.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
            virtualQueueAnalytics.trackLeaveQueueLoad(anonymousPartySize, simpleName, str);
            return;
        }
        this.guestsInParty = listEmptyList;
        List list = listEmptyList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((LinkedGuest) it4.next()).getGuestId());
        }
        this.guestIdsToRemove = arrayList2;
        this.queue = queue;
        this.position = position;
        LeaveQueueMainAdapter leaveQueueMainAdapter3 = this.adapter;
        if (leaveQueueMainAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            leaveQueueMainAdapter3 = null;
        }
        leaveQueueMainAdapter3.setGuests(this.guestsInParty);
        LeaveQueueMainAdapter leaveQueueMainAdapter4 = this.adapter;
        if (leaveQueueMainAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            leaveQueueMainAdapter4 = null;
        }
        Queue queue4 = this.queue;
        if (queue4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue4 = null;
        }
        leaveQueueMainAdapter4.setQueueNameHeader(queue4);
        FacilityUtils facilityUtils2 = getFacilityUtils();
        Queue queue5 = this.queue;
        if (queue5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue5 = null;
        }
        Facility facility2 = facilityUtils2.getFacility(queue5.getExternalDefinitionId());
        ancestorThemePark = facility2 != null ? facility2.getAncestorThemePark() : null;
        str = ancestorThemePark != null ? ancestorThemePark : "";
        VirtualQueueAnalytics virtualQueueAnalytics2 = getVirtualQueueAnalytics();
        int size = this.guestsInParty.size();
        String simpleName2 = LeaveQueueFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName2, "javaClass.simpleName");
        virtualQueueAnalytics2.trackLeaveQueueLoad(size, simpleName2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLeaveQueue(boolean isSuccess, boolean removingAllGuests) {
        if (!isSuccess) {
            showLeaveErrorMessage();
        } else {
            getSharedPreferences().edit().putBoolean("vqHasRemovedGuests", true).apply();
            handleNavigationToNextPage(removingAllGuests);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(LeaveQueueFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Queue queue = this$0.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        if (queue.getGuestIdMode() == QueueGuestIdMode.IDENTIFIED) {
            this$0.handleRemove();
        } else {
            this$0.handleRemoveAnonymous();
        }
    }

    private final void showConfirmationAlert(String title, String detail, String removeCta, String cancelCta) {
        VqFragmentLeaveQueueBinding binding = getBinding();
        Button button = binding != null ? binding.removeButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        new DialogInterfaceC0229b.a(requireContext(), C21487R.style.VQAlertDialog).setTitle(title).mo960h(detail).mo967o(removeCta, new DialogInterface.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                LeaveQueueFragment.showConfirmationAlert$lambda$2(this.f45228a, dialogInterface, i10);
            }
        }).mo962j(cancelCta, new DialogInterface.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                LeaveQueueFragment.showConfirmationAlert$lambda$3(this.f45229a, dialogInterface, i10);
            }
        }).mo954b(false).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmationAlert$lambda$2(LeaveQueueFragment this$0, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doRemove();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmationAlert$lambda$3(LeaveQueueFragment this$0, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VqFragmentLeaveQueueBinding binding = this$0.getBinding();
        Button button = binding != null ? binding.removeButton : null;
        if (button == null) {
            return;
        }
        button.setEnabled(true);
    }

    private final void showLeaveErrorMessage() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment.showLeaveErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                LeaveQueueFragment.this.handleNavigationToNextPage(false);
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    private final void showLoadingError() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesErrorGeneralDetail, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesErrorGeneralTitle, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment.showLoadingError.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                LeaveQueueFragment.this.onBackPressed();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    @Override // kotlinx.coroutines.InterfaceC30065h0
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final FacilityUtils getFacilityUtils() {
        FacilityUtils facilityUtils = this.facilityUtils;
        if (facilityUtils != null) {
            return facilityUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("facilityUtils");
        return null;
    }

    public final LeaveQueueMainAdapter.Factory getLeaveQueueMainAdapterFactory() {
        LeaveQueueMainAdapter.Factory factory = this.leaveQueueMainAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leaveQueueMainAdapterFactory");
        return null;
    }

    public final PerformanceTracking getPerformanceTracking() {
        PerformanceTracking performanceTracking = this.performanceTracking;
        if (performanceTracking != null) {
            return performanceTracking;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceTracking");
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        return null;
    }

    public final VirtualQueueAnalytics getVirtualQueueAnalytics() {
        VirtualQueueAnalytics virtualQueueAnalytics = this.virtualQueueAnalytics;
        if (virtualQueueAnalytics != null) {
            return virtualQueueAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueAnalytics");
        return null;
    }

    public final VirtualQueueManager getVirtualQueueManager() {
        VirtualQueueManager virtualQueueManager = this.virtualQueueManager;
        if (virtualQueueManager != null) {
            return virtualQueueManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        super.onActivityCreated(savedInstanceState);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        SnowballItemAnimator defaultItemAnimator = SnowballAnimationUtils.getDefaultItemAnimator(getResources());
        LeaveQueueMainAdapter.Factory leaveQueueMainAdapterFactory = getLeaveQueueMainAdapterFactory();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        LeaveQueueMainAdapter leaveQueueMainAdapterCreate = leaveQueueMainAdapterFactory.create(fragmentActivityRequireActivity, this, getVqThemer());
        this.adapter = leaveQueueMainAdapterCreate;
        if (leaveQueueMainAdapterCreate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            leaveQueueMainAdapterCreate = null;
        }
        StickyHeadersItemDecoration stickyHeadersItemDecoration = new StickyHeadersItemDecoration(leaveQueueMainAdapterCreate);
        VqFragmentLeaveQueueBinding binding = getBinding();
        RecyclerView recyclerView2 = binding != null ? binding.itemList : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        VqFragmentLeaveQueueBinding binding2 = getBinding();
        RecyclerView recyclerView3 = binding2 != null ? binding2.itemList : null;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(defaultItemAnimator);
        }
        VqFragmentLeaveQueueBinding binding3 = getBinding();
        RecyclerView recyclerView4 = binding3 != null ? binding3.itemList : null;
        if (recyclerView4 != null) {
            LeaveQueueMainAdapter leaveQueueMainAdapter = this.adapter;
            if (leaveQueueMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                leaveQueueMainAdapter = null;
            }
            recyclerView4.setAdapter(leaveQueueMainAdapter);
        }
        VqFragmentLeaveQueueBinding binding4 = getBinding();
        if (binding4 != null && (recyclerView = binding4.itemList) != null) {
            recyclerView.addItemDecoration(stickyHeadersItemDecoration);
        }
        LeaveQueueMainAdapter leaveQueueMainAdapter2 = this.adapter;
        if (leaveQueueMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            leaveQueueMainAdapter2 = null;
        }
        leaveQueueMainAdapter2.showLoading();
        C30113j.m92948d(this, null, null, new C215651(null), 3, null);
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getVirtualQueueAnalytics().trackBackPress();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        return false;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C21487R.layout.vq_fragment_leave_queue, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(VirtualQueueConstants.POSITION_ID_HASH_PARAM, "");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(VirtualQu…SITION_ID_HASH_PARAM, \"\")");
            this.positionIdHash = string;
            String string2 = arguments.getString("completionDeepLink", "");
            Intrinsics.checkNotNullExpressionValue(string2, "data.getString(VirtualQu…TION_DEEP_LINK_PARAM, \"\")");
            this.completionDeepLink = string2;
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PerformanceTracking performanceTracking = getPerformanceTracking();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.LEAVE_QUEUE_SCREEN;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView()");
        FragmentActions.DefaultImpls.pageLoadTimeTracking$default(this, performanceTracking, performanceTrackingScreenName, viewRequireView, true, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button button;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.LEAVE_QUEUE_SCREEN.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        VqFragmentLeaveQueueBinding binding = getBinding();
        Button button2 = binding != null ? binding.removeButton : null;
        if (button2 != null) {
            button2.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueMainCta, null, false, 6, null));
        }
        VqFragmentLeaveQueueBinding binding2 = getBinding();
        if (binding2 == null || (button = binding2.removeButton) == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LeaveQueueFragment.onViewCreated$lambda$1(this.f45230a, view2);
            }
        });
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setFacilityUtils(FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(facilityUtils, "<set-?>");
        this.facilityUtils = facilityUtils;
    }

    public final void setLeaveQueueMainAdapterFactory(LeaveQueueMainAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.leaveQueueMainAdapterFactory = factory;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.LeaveQueueActions
    public void toggledGuestSelection(boolean selected) {
        getVirtualQueueAnalytics().trackLeaveQueueGuestSelectionToggled(selected);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.LeaveQueueActions
    public void toggledSelectAll(boolean allSelected) {
        getVirtualQueueAnalytics().trackLeaveQueueSelectAllToggled(allSelected);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.LeaveQueueActions
    public void updatePartySize(int partySize) {
        VqFragmentLeaveQueueBinding binding = getBinding();
        Button button = binding != null ? binding.removeButton : null;
        if (button != null) {
            button.setEnabled(partySize != this.position.getAnonymousPartySize());
        }
        this.newPartySize = partySize;
        VqFragmentLeaveQueueBinding binding2 = getBinding();
        Button button2 = binding2 != null ? binding2.removeButton : null;
        if (button2 == null) {
            return;
        }
        button2.setText(this.newPartySize == 0 ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousCancelPartyCta, null, false, 6, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.LeaveQueueAnonymousUpdatePartyCta, null, false, 6, null));
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.LeaveQueueActions
    public void updatedGuestsToLeave(List<String> guestIds) {
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        VqFragmentLeaveQueueBinding binding = getBinding();
        Button button = binding != null ? binding.removeButton : null;
        if (button != null) {
            button.setEnabled(!guestIds.isEmpty());
        }
        VqFragmentLeaveQueueBinding binding2 = getBinding();
        Button button2 = binding2 != null ? binding2.removeButton : null;
        if (button2 != null) {
            button2.setEnabled(!guestIds.isEmpty());
        }
        this.guestIdsToRemove = guestIds;
    }
}