package com.disney.wdpro.virtualqueue.core.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.ConflictActions;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.event.JoinQueueEvent;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentConflictBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.SnowballAnimationUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SnowballItemAnimator;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictMainAdapter;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.PositionsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.Lists;
import com.snap.camerakit.internal.h76;
import java.io.Serializable;
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
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import p498da.InterfaceC27132a;

@Metadata(m92037d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u0085\u0001\u0086\u0001\u0087\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0006J\u0019\u0010*\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b*\u0010+J'\u00101\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b4\u0010\rJ\u000f\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001d\u0010f\u001a\u0004\u0018\u00010a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010kR\u0016\u0010n\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010qR\u0016\u0010s\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR.\u0010w\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020v0u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010oR\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0088\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/ConflictActions;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "handleContinueButton", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "joinQueue", "(Ljava/util/List;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;", "event", "onJoinQueue", "(Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;)V", "", "tryAgain", "handleJoinError", "(Z)V", "showGenericErrorMessage", "showTryAgainErrorMessage", "showQueueClosedErrorMessage", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "response", "showConfirmation", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "conflictTitle", "conflictMessage", "", "numGuestsInBucket", "guestRemoved", "(Ljava/lang/String;Ljava/lang/String;I)V", "guestsReadyToGo", "allConflictsResolved", "onBackPressed", "()Z", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/commons/monitor/k;", "locationMonitor", "Lcom/disney/wdpro/commons/monitor/k;", "getLocationMonitor", "()Lcom/disney/wdpro/commons/monitor/k;", "setLocationMonitor", "(Lcom/disney/wdpro/commons/monitor/k;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "conflictGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "getConflictGuestAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "setConflictGuestAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConflictBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConflictBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "guestsInParty", "Ljava/util/List;", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "initialConflicts", "totalPartySize", "I", VirtualQueueConstants.CONTENT_ID, "Ljava/lang/String;", "completionDeepLink", VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, "Z", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "notEligibleGuestCount", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictMainAdapter;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "ConflictGuestsInParty", "ConflictList", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nConflictFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflictFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n1360#2:383\n1446#2,5:384\n1549#2:389\n1620#2,3:390\n*S KotlinDebug\n*F\n+ 1 ConflictFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment\n*L\n117#1:383\n117#1:384,5\n225#1:389\n225#1:390,3\n*E\n"})
/* loaded from: classes20.dex */
public final class ConflictFragment extends VirtualQueueBaseFragment implements ConflictActions, InterfaceC27132a, InterfaceC30065h0 {
    private ConflictMainAdapter adapter;

    @Inject
    public ConflictGuestAdapter.Factory conflictGuestAdapterFactory;

    @Inject
    public FacilityUtils facilityUtils;

    @Inject
    public InterfaceC9336k locationMonitor;
    private int notEligibleGuestCount;

    @Inject
    public PerformanceTracking performanceTracking;
    private Queue queue;
    private boolean suppressCloseOnConfirmation;
    private int totalPartySize;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ConflictFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentConflictBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, ConflictFragment$binding$2.INSTANCE);
    private List<LinkedGuest> guestsInParty = CollectionsKt.emptyList();
    private List<Conflict> initialConflicts = CollectionsKt.emptyList();
    private List<LinkedGuest> guestsReadyToGo = CollectionsKt.emptyList();
    private String contentId = "";
    private String completionDeepLink = "";
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment;", "guestsInParty", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "queueToJoin", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "conflicts", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "completionDeepLink", "", VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConflictFragment newInstance(List<LinkedGuest> guestsInParty, Queue queueToJoin, List<Conflict> conflicts, String completionDeepLink, boolean suppressCloseOnConfirmation) {
            Intrinsics.checkNotNullParameter(guestsInParty, "guestsInParty");
            Intrinsics.checkNotNullParameter(queueToJoin, "queueToJoin");
            Intrinsics.checkNotNullParameter(conflicts, "conflicts");
            Intrinsics.checkNotNullParameter(completionDeepLink, "completionDeepLink");
            ConflictFragment conflictFragment = new ConflictFragment();
            Bundle bundle = new Bundle();
            ArrayList arrayListM69269j = Lists.m69269j(guestsInParty);
            Intrinsics.checkNotNullExpressionValue(arrayListM69269j, "newArrayList(guestsInParty)");
            bundle.putSerializable("linked_guests_in_party", new ConflictGuestsInParty(arrayListM69269j));
            bundle.putSerializable(VirtualQueueConstants.QUEUE_PARAM, queueToJoin);
            ArrayList arrayListM69269j2 = Lists.m69269j(conflicts);
            Intrinsics.checkNotNullExpressionValue(arrayListM69269j2, "newArrayList(conflicts)");
            bundle.putSerializable("conflicts", new ConflictList(arrayListM69269j2));
            bundle.putSerializable("completionDeepLink", completionDeepLink);
            bundle.putBoolean(VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, suppressCloseOnConfirmation);
            conflictFragment.setArguments(bundle);
            return conflictFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment$ConflictGuestsInParty;", "Ljava/io/Serializable;", "guests", "Ljava/util/ArrayList;", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getGuests", "()Ljava/util/ArrayList;", "setGuests", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class ConflictGuestsInParty implements Serializable {
        private ArrayList<LinkedGuest> guests;

        public ConflictGuestsInParty(ArrayList<LinkedGuest> guests) {
            Intrinsics.checkNotNullParameter(guests, "guests");
            this.guests = guests;
        }

        public final ArrayList<LinkedGuest> getGuests() {
            return this.guests;
        }

        public final void setGuests(ArrayList<LinkedGuest> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            this.guests = arrayList;
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment$ConflictList;", "Ljava/io/Serializable;", "conflicts", "Ljava/util/ArrayList;", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getConflicts", "()Ljava/util/ArrayList;", "setConflicts", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class ConflictList implements Serializable {
        private ArrayList<Conflict> conflicts;

        public ConflictList(ArrayList<Conflict> conflicts) {
            Intrinsics.checkNotNullParameter(conflicts, "conflicts");
            this.conflicts = conflicts;
        }

        public final ArrayList<Conflict> getConflicts() {
            return this.conflicts;
        }

        public final void setConflicts(ArrayList<Conflict> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            this.conflicts = arrayList;
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JoinQueueErrorResponseStatus.values().length];
            try {
                iArr[JoinQueueErrorResponseStatus.INVALID_GUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JoinQueueErrorResponseStatus.PAUSED_QUEUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JoinQueueErrorResponseStatus.CLOSED_QUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment$joinQueue$1", m92053f = "ConflictFragment.kt", m92054i = {}, m92055l = {h76.SERVER_OUTBOUND_MESSAGE_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment$joinQueue$1 */
    static final class C215431 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $guestIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215431(List<String> list, Continuation<? super C215431> continuation) {
            super(2, continuation);
            this.$guestIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConflictFragment.this.new C215431(this.$guestIds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = ConflictFragment.this.getVirtualQueueManager();
                Queue queue = ConflictFragment.this.queue;
                if (queue == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
                    queue = null;
                }
                String queueId = queue.getQueueId();
                List<String> list = this.$guestIds;
                this.label = 1;
                obj = virtualQueueManager.joinQueue(queueId, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ConflictFragment.this.onJoinQueue((JoinQueueEvent) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215431) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final VqFragmentConflictBinding getBinding() {
        return (VqFragmentConflictBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleContinueButton() {
        if (this.guestsReadyToGo.isEmpty()) {
            return;
        }
        joinQueue(this.guestsReadyToGo);
    }

    private final void handleJoinError(boolean tryAgain) {
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        List<LinkedGuest> list = this.guestsReadyToGo;
        Queue queue = this.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        VirtualQueueAnalytics.trackConflictContinue$default(virtualQueueAnalytics, list, queue, null, 4, null);
        if (tryAgain) {
            showTryAgainErrorMessage();
        } else {
            showGenericErrorMessage();
        }
    }

    static /* synthetic */ void handleJoinError$default(ConflictFragment conflictFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        conflictFragment.handleJoinError(z10);
    }

    private final void joinQueue(List<LinkedGuest> guests) {
        VqFragmentConflictBinding binding = getBinding();
        Button button = binding != null ? binding.continueButton : null;
        if (button != null) {
            button.setEnabled(false);
        }
        ConflictMainAdapter conflictMainAdapter = this.adapter;
        if (conflictMainAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            conflictMainAdapter = null;
        }
        conflictMainAdapter.showLoading();
        ConflictMainAdapter conflictMainAdapter2 = this.adapter;
        if (conflictMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            conflictMainAdapter2 = null;
        }
        Queue queue = this.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        conflictMainAdapter2.setGuests(guests, queue);
        List<LinkedGuest> list = guests;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LinkedGuest) it.next()).getGuestId());
        }
        C30113j.m92948d(this, null, null, new C215431(arrayList, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJoinQueue(JoinQueueEvent event) {
        Queue queue;
        ConflictMainAdapter conflictMainAdapter = null;
        Queue queue2 = null;
        if (event.isSuccess()) {
            GetPositionsResponse successResponse = event.getSuccessResponse();
            if (successResponse == null || successResponse.getResponseStatus() != PositionsResponseStatus.OK) {
                handleJoinError$default(this, false, 1, null);
            } else {
                if (successResponse.getPositions().isEmpty()) {
                    VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
                    List<LinkedGuest> list = this.guestsReadyToGo;
                    Queue queue3 = this.queue;
                    if (queue3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
                        queue = null;
                    } else {
                        queue = queue3;
                    }
                    VirtualQueueAnalytics.trackConflictContinue$default(virtualQueueAnalytics, list, queue, null, 4, null);
                } else {
                    VirtualQueueAnalytics virtualQueueAnalytics2 = getVirtualQueueAnalytics();
                    List<LinkedGuest> list2 = this.guestsReadyToGo;
                    Queue queue4 = this.queue;
                    if (queue4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
                    } else {
                        queue2 = queue4;
                    }
                    virtualQueueAnalytics2.trackConflictContinue(list2, queue2, String.valueOf(successResponse.getPositions().get(0).getBoardingGroup()));
                }
                getVirtualQueueAnalytics().trackLocation(getLocationMonitor());
                this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_SUCCESS.getAttrName());
                showConfirmation(successResponse);
            }
        } else {
            JoinQueueErrorResponse errorResponse = event.getErrorResponse();
            this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_FAILURE.getAttrName());
            if (errorResponse != null) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[errorResponse.getResponseStatus().ordinal()];
                if (i10 == 1) {
                    ConflictMainAdapter conflictMainAdapter2 = this.adapter;
                    if (conflictMainAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        conflictMainAdapter = conflictMainAdapter2;
                    }
                    conflictMainAdapter.updateGuestConflicts(errorResponse.getConflicts());
                } else if (i10 == 2 || i10 == 3) {
                    showQueueClosedErrorMessage();
                } else {
                    handleJoinError(errorResponse.getHttpStatus() == 429);
                }
            } else {
                handleJoinError$default(this, false, 1, null);
            }
        }
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), Integer.valueOf(this.guestsReadyToGo.size()));
        this.eventAttributes.put(PerformanceTrackingAttribute.GUESTS_IN_CONFLICT_END.getAttrName(), Integer.valueOf(this.notEligibleGuestCount));
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.JOIN_FLOW_TIME, this.eventAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(ConflictFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleContinueButton();
    }

    private final void showConfirmation(GetPositionsResponse response) {
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), VirtualQueueConfirmationFragment.INSTANCE.newInstance(response, this.completionDeepLink, this.suppressCloseOnConfirmation, this.contentId), new SnowballNextFlowAnimation(), true, false, false, 24, null);
    }

    private final void showGenericErrorMessage() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, this.contentId, false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, this.contentId, false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment.showGenericErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                ConflictFragment.this.getActivityActions().navigateBack();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    private final void showQueueClosedErrorMessage() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersLandClosedMessage, this.contentId, false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersLandClosedTitle, this.contentId, false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment.showQueueClosedErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                FragmentActivity activity = ConflictFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, false);
    }

    private final void showTryAgainErrorMessage() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersRetryErrorMessage, this.contentId, false, 4, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersRetryErrorTitle, this.contentId, false, 4, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment.showTryAgainErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                ConflictFragment.this.getActivityActions().navigateBack();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                ConflictFragment.this.handleContinueButton();
            }
        }, true, false);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ConflictActions
    public void allConflictsResolved(List<LinkedGuest> guestsReadyToGo) {
        Intrinsics.checkNotNullParameter(guestsReadyToGo, "guestsReadyToGo");
        this.guestsReadyToGo = guestsReadyToGo;
        Queue queue = null;
        if (!guestsReadyToGo.isEmpty()) {
            ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NsfReadyHeader, this.contentId, false, 4, null), false, 2, null);
            VqFragmentConflictBinding binding = getBinding();
            Button button = binding != null ? binding.continueButton : null;
            if (button == null) {
                return;
            }
            button.setEnabled(true);
            return;
        }
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        int i10 = this.totalPartySize;
        int i11 = this.notEligibleGuestCount;
        Queue queue2 = this.queue;
        if (queue2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
        } else {
            queue = queue2;
        }
        virtualQueueAnalytics.trackConflictRemoveAll(i10, i11, queue.getName());
        getActivityActions().navigateBack();
    }

    public final ConflictGuestAdapter.Factory getConflictGuestAdapterFactory() {
        ConflictGuestAdapter.Factory factory = this.conflictGuestAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("conflictGuestAdapterFactory");
        return null;
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

    public final InterfaceC9336k getLocationMonitor() {
        InterfaceC9336k interfaceC9336k = this.locationMonitor;
        if (interfaceC9336k != null) {
            return interfaceC9336k;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationMonitor");
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

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.ConflictActions
    public void guestRemoved(String conflictTitle, String conflictMessage, int numGuestsInBucket) {
        Intrinsics.checkNotNullParameter(conflictTitle, "conflictTitle");
        Intrinsics.checkNotNullParameter(conflictMessage, "conflictMessage");
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        Queue queue = this.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        virtualQueueAnalytics.trackConflictRemoveGuest(queue.getName(), conflictTitle, conflictMessage, numGuestsInBucket, this.totalPartySize);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        Queue queue;
        super.onActivityCreated(savedInstanceState);
        Queue queue2 = null;
        ActivityActions.DefaultImpls.setTitle$default(getActivityActions(), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NsfHeader, this.contentId, false, 4, null), false, 2, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        SnowballItemAnimator defaultItemAnimator = SnowballAnimationUtils.getDefaultItemAnimator(getResources());
        FacilityUtils facilityUtils = getFacilityUtils();
        Queue queue3 = this.queue;
        if (queue3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue3 = null;
        }
        Facility facility = facilityUtils.getFacility(queue3.getExternalDefinitionId());
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        if (ancestorThemePark == null) {
            ancestorThemePark = "";
        }
        String str = ancestorThemePark;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        VirtualQueueThemer vqThemer = getVqThemer();
        Queue queue4 = this.queue;
        if (queue4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        } else {
            queue = queue4;
        }
        this.adapter = new ConflictMainAdapter(fragmentActivityRequireActivity, this, vqThemer, queue, str, getConflictGuestAdapterFactory());
        VqFragmentConflictBinding binding = getBinding();
        RecyclerView recyclerView = binding != null ? binding.itemList : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(defaultItemAnimator);
        }
        VqFragmentConflictBinding binding2 = getBinding();
        RecyclerView recyclerView2 = binding2 != null ? binding2.itemList : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        VqFragmentConflictBinding binding3 = getBinding();
        RecyclerView recyclerView3 = binding3 != null ? binding3.itemList : null;
        if (recyclerView3 != null) {
            ConflictMainAdapter conflictMainAdapter = this.adapter;
            if (conflictMainAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                conflictMainAdapter = null;
            }
            recyclerView3.setAdapter(conflictMainAdapter);
        }
        ConflictMainAdapter conflictMainAdapter2 = this.adapter;
        if (conflictMainAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            conflictMainAdapter2 = null;
        }
        List<LinkedGuest> list = this.guestsInParty;
        List<Conflict> list2 = this.initialConflicts;
        Queue queue5 = this.queue;
        if (queue5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
        } else {
            queue2 = queue5;
        }
        conflictMainAdapter2.setGuestsAndQueue(list, list2, queue2);
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getVirtualQueueAnalytics().trackBackPress();
        this.eventAttributes.put(PerformanceTrackingAttribute.EXIT_POINT.getAttrName(), PerformanceTrackingAttribute.EXIT_BACK_PRESSED.getAttrName());
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_END.getAttrName(), this.guestsReadyToGo);
        this.eventAttributes.put(PerformanceTrackingAttribute.GUESTS_IN_CONFLICT_END.getAttrName(), Integer.valueOf(this.notEligibleGuestCount));
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        return false;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C21487R.layout.vq_fragment_conflict, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("linked_guests_in_party");
            if (serializable instanceof ConflictGuestsInParty) {
                this.guestsInParty = ((ConflictGuestsInParty) serializable).getGuests();
            }
            Serializable serializable2 = arguments.getSerializable(VirtualQueueConstants.QUEUE_PARAM);
            Queue queue = serializable2 instanceof Queue ? (Queue) serializable2 : null;
            if (queue == null) {
                queue = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
            }
            this.queue = queue;
            String string = arguments.getString(VirtualQueueConstants.QUEUE_CONTENT_ID_PARAM, "");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(VirtualQu…EUE_CONTENT_ID_PARAM, \"\")");
            this.contentId = string;
            String string2 = arguments.getString("completionDeepLink", "");
            Intrinsics.checkNotNullExpressionValue(string2, "data.getString(VirtualQu…TION_DEEP_LINK_PARAM, \"\")");
            this.completionDeepLink = string2;
            this.suppressCloseOnConfirmation = arguments.getBoolean(VirtualQueueConstants.SUPPRESS_CLOSE_ON_CONFIRMATION, false);
            Serializable serializable3 = arguments.getSerializable("conflicts");
            Intrinsics.checkNotNull(serializable3, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment.ConflictList");
            this.initialConflicts = ((ConflictList) serializable3).getConflicts();
            this.totalPartySize = this.guestsInParty.size();
            List<Conflict> list = this.initialConflicts;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Conflict) it.next()).getGuestIds());
            }
            this.notEligibleGuestCount = CollectionsKt.distinct(arrayList).size();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button button;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FacilityUtils facilityUtils = getFacilityUtils();
        Queue queue = this.queue;
        if (queue == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue = null;
        }
        Facility facility = facilityUtils.getFacility(queue.getExternalDefinitionId());
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        if (ancestorThemePark == null) {
            ancestorThemePark = "";
        }
        String str = ancestorThemePark;
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        List<Conflict> list = this.initialConflicts;
        int i10 = this.totalPartySize;
        int i11 = this.notEligibleGuestCount;
        Queue queue2 = this.queue;
        if (queue2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue2 = null;
        }
        String name = queue2.getName();
        String simpleName = ConflictFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        virtualQueueAnalytics.trackConflictLoad(list, i10, i11, name, simpleName, str);
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.CONFLICT_SCREEN.getScreenName());
        this.eventAttributes.put(PerformanceTrackingAttribute.SELECTED_GUESTS_START.getAttrName(), Integer.valueOf(this.totalPartySize));
        this.eventAttributes.put(PerformanceTrackingAttribute.GUESTS_IN_CONFLICT_START.getAttrName(), Integer.valueOf(this.notEligibleGuestCount));
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        Queue queue3 = this.queue;
        if (queue3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(VirtualQueueConstants.QUEUE_PARAM);
            queue3 = null;
        }
        if (queue3.getGuestIdMode() != QueueGuestIdMode.IDENTIFIED) {
            VqFragmentConflictBinding binding = getBinding();
            FrameLayout frameLayout = binding != null ? binding.continueWrapper : null;
            if (frameLayout == null) {
                return;
            }
            frameLayout.setVisibility(8);
            return;
        }
        VqFragmentConflictBinding binding2 = getBinding();
        Button button2 = binding2 != null ? binding2.continueButton : null;
        if (button2 != null) {
            button2.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NsfMainCta, this.contentId, false, 4, null));
        }
        VqFragmentConflictBinding binding3 = getBinding();
        if (binding3 == null || (button = binding3.continueButton) == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.virtualqueue.core.fragments.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConflictFragment.onViewCreated$lambda$2(this.f45225a, view2);
            }
        });
    }

    public final void setConflictGuestAdapterFactory(ConflictGuestAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.conflictGuestAdapterFactory = factory;
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setFacilityUtils(FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(facilityUtils, "<set-?>");
        this.facilityUtils = facilityUtils;
    }

    public final void setLocationMonitor(InterfaceC9336k interfaceC9336k) {
        Intrinsics.checkNotNullParameter(interfaceC9336k, "<set-?>");
        this.locationMonitor = interfaceC9336k;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }
}