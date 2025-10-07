package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C4946p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C3816t;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.facility.model.FacilityFacet;
import com.disney.wdpro.support.anim.SlidingUpAnimation;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity;
import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import com.disney.wdpro.virtualqueue.core.fragments.RedeemFragment;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.interfaces.PositionActions;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueNavigationEntriesProvider;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingAttribute;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingEventName;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTrackingScreenName;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.event.GetPositionsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.VQResponseEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.VQResponseHeaderAttribute;
import com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentMyQueuesBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.SingleLiveEvent;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PositionAdapter;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.PositionsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
import p708ko.InterfaceC29611b;

@Metadata(m92037d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u009c\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u0007J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\fJ\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J-\u00107\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010\u0007J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\u0007R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010Y\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001d\u0010y\u001a\u0004\u0018\u00010t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001c\u0010~\u001a\b\u0012\u0004\u0012\u00020.028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010}R\u0018\u0010\u0084\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010}R\u0018\u0010\u0085\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010{R\u0018\u0010\u0086\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010}R!\u0010\u008c\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010{R\u0018\u0010\u008e\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010}R7\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010{R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009d\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", FacilityFacet.VirtualFacets.PLAY_APP_DEEP_LINK_FACET_GROUP, "", "startLoading", "(Z)V", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "event", "onGetPositions", "(Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;)V", "observeViewModel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroy", "data", "refresh", "onBackPressed", "()Z", "triggerPeekView", "displayPeekView", "fromMainButton", "startJoinFlow", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "showLeaveQueue", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;)V", "", "facilityId", "showDirections", "(Ljava/lang/String;)V", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "showRedeem", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "requestEnableBluetooth", "requestEnableLocation", "requestEnablePushNotifications", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "navigationEntriesProvider", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "getNavigationEntriesProvider", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "setNavigationEntriesProvider", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "headerView", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "getHeaderView", "()Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "setHeaderView", "(Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;)V", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "queuesPositionAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "getQueuesPositionAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "setQueuesPositionAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentMyQueuesBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentMyQueuesBinding;", "binding", "isLoadingDeepLink", "Z", "deepLinkedQueueId", "Ljava/lang/String;", "deepLinkedGuestIds", "Ljava/util/List;", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter;", "primaryGuestName", "peekViewQueueId", "didClickIcon", "loggedUser", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel$delegate", "Lkotlin/Lazy;", "getPartyViewModel", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel", "isInitialLoad", "linkedGuestId", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "isSummoned", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nMyQueuesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyQueuesFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n288#2,2:458\n1549#2:460\n1620#2,3:461\n*S KotlinDebug\n*F\n+ 1 MyQueuesFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment\n*L\n283#1:458,2\n288#1:460\n288#1:461,3\n*E\n"})
/* loaded from: classes20.dex */
public final class MyQueuesFragment extends VirtualQueueBaseFragment implements PositionActions, FragmentActions, InterfaceC27132a, InterfaceC30065h0 {
    private static final int AUTO_SCROLL_DELAY = 750;
    private QueuesPositionsAdapter adapter;
    private List<String> deepLinkedGuestIds;
    private boolean didClickIcon;
    private Map<String, Object> eventAttributes;

    @Inject
    public PtrMyQueuesHeader headerView;
    private boolean isInitialLoad;
    private boolean isLoadingDeepLink;
    private boolean isSummoned;

    @Inject
    public LinearLayoutManager layoutManager;
    private String linkedGuestId;
    private String loggedUser;

    @Inject
    public VirtualQueueNavigationEntriesProvider navigationEntriesProvider;

    /* renamed from: partyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy partyViewModel;
    private String peekViewQueueId;

    @Inject
    public PerformanceTracking performanceTracking;
    private String primaryGuestName;

    @Inject
    public QueuesPositionsAdapter.Factory queuesPositionAdapterFactory;

    @Inject
    public C3821v0.c viewModelFactory;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MyQueuesFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentMyQueuesBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, MyQueuesFragment$binding$2.INSTANCE);
    private String deepLinkedQueueId = "";

    @Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment$Companion;", "", "()V", "AUTO_SCROLL_DELAY", "", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment;", "data", "Landroid/os/Bundle;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MyQueuesFragment newInstance(Bundle data) {
            MyQueuesFragment myQueuesFragment = new MyQueuesFragment();
            myQueuesFragment.setArguments(data);
            return myQueuesFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$observeViewModel$1", m92053f = "MyQueuesFragment.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$observeViewModel$1 */
    static final class C215681 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215681(Continuation<? super C215681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215681 c215681 = MyQueuesFragment.this.new C215681(continuation);
            c215681.L$0 = obj;
            return c215681;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final InterfaceC30065h0 interfaceC30065h0 = (InterfaceC30065h0) this.L$0;
            SingleLiveEvent<PartyViewModel.UiState> state = MyQueuesFragment.this.getPartyViewModel().getState();
            final MyQueuesFragment myQueuesFragment = MyQueuesFragment.this;
            state.observe(myQueuesFragment, new MyQueuesFragment$sam$androidx_lifecycle_Observer$0(new Function1<PartyViewModel.UiState, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.observeViewModel.1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PartyViewModel.UiState uiState) {
                    invoke2(uiState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PartyViewModel.UiState it) {
                    String guestId;
                    Object next;
                    PtrDisneyContainer ptrDisneyContainer;
                    PtrDisneyContainer ptrDisneyContainer2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it instanceof PartyViewModel.UiState.NoActiveNetwork) {
                        VqFragmentMyQueuesBinding binding = myQueuesFragment.getBinding();
                        if (binding != null && (ptrDisneyContainer2 = binding.pullToRefreshContainer) != null) {
                            ptrDisneyContainer2.m64009G();
                        }
                        myQueuesFragment.showNoNetworkMessage();
                        return;
                    }
                    if (it instanceof PartyViewModel.UiState.Error) {
                        VqFragmentMyQueuesBinding binding2 = myQueuesFragment.getBinding();
                        if (binding2 != null && (ptrDisneyContainer = binding2.pullToRefreshContainer) != null) {
                            ptrDisneyContainer.m64009G();
                        }
                        VirtualQueueBaseFragment.showDefaultGenericErrorMessage$default(myQueuesFragment, false, 1, null);
                        return;
                    }
                    if (it instanceof PartyViewModel.UiState.QueueOpen) {
                        MyQueuesFragment myQueuesFragment2 = myQueuesFragment;
                        PartyViewModel.UiState.QueueOpen queueOpen = (PartyViewModel.UiState.QueueOpen) it;
                        LinkedGuest linkedGuest = (LinkedGuest) CollectionsKt.firstOrNull((List) queueOpen.getAllGuests());
                        if (linkedGuest == null || (guestId = linkedGuest.getGuestId()) == null) {
                            guestId = "";
                        }
                        myQueuesFragment2.linkedGuestId = guestId;
                        MyQueuesFragment myQueuesFragment3 = myQueuesFragment;
                        Iterator<T> it2 = queueOpen.getAllGuests().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it2.next();
                                if (((LinkedGuest) next).getIsPrimaryGuest()) {
                                    break;
                                }
                            }
                        }
                        LinkedGuest linkedGuest2 = (LinkedGuest) next;
                        String string = linkedGuest2 != null ? myQueuesFragment.getString(C21487R.string.vq_txt_common_name_first_last, linkedGuest2.getFirstName(), linkedGuest2.getLastName()) : null;
                        myQueuesFragment3.primaryGuestName = string != null ? string : "";
                        if (myQueuesFragment.didClickIcon) {
                            myQueuesFragment.displayPeekView();
                            myQueuesFragment.didClickIcon = false;
                        }
                    }
                }
            }));
            SingleLiveEvent<String> parkConfigLiveData = MyQueuesFragment.this.getPartyViewModel().getParkConfigLiveData();
            final MyQueuesFragment myQueuesFragment2 = MyQueuesFragment.this;
            parkConfigLiveData.observe(myQueuesFragment2, new MyQueuesFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.observeViewModel.1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String parkType) {
                    Intrinsics.checkNotNullParameter(parkType, "parkType");
                    VirtualQueueAnalytics virtualQueueAnalytics = myQueuesFragment2.getVirtualQueueAnalytics();
                    String simpleName = interfaceC30065h0.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
                    virtualQueueAnalytics.trackPeekViewLoad(simpleName, VQPageType.MYQUEUES, null, null);
                    String userSwid = ((VirtualQueueBaseFragment) myQueuesFragment2).authenticationManager.getUserSwid();
                    if (userSwid == null) {
                        userSwid = "";
                    }
                    String string$default = VirtualQueueThemer.getString$default(myQueuesFragment2.getVqThemer(), VQStringType.CommonPeekViewInstructionalText, null, false, 6, null);
                    if (!Intrinsics.areEqual(parkType, "DLR")) {
                        if (Intrinsics.areEqual(parkType, "WDW")) {
                            MyQueuesFragment myQueuesFragment3 = myQueuesFragment2;
                            myQueuesFragment3.showPeekView(myQueuesFragment3.loggedUser, myQueuesFragment2.linkedGuestId, string$default);
                            return;
                        }
                        return;
                    }
                    MyQueuesFragment myQueuesFragment4 = myQueuesFragment2;
                    myQueuesFragment4.showPeekView(myQueuesFragment4.loggedUser, "swid:" + userSwid, string$default);
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215681) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m92038d2 = {"com/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment$onGetPositions$6", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$onGetPositions$6 */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC215726 implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC215726() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onGlobalLayout$lambda$0(MyQueuesFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            final Context contextRequireContext = this$0.requireContext();
            C4946p c4946p = new C4946p(contextRequireContext) { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$onGetPositions$6$onGlobalLayout$1$smoothScroller$1
                @Override // androidx.recyclerview.widget.C4946p
                protected int getVerticalSnapPreference() {
                    return -1;
                }
            };
            QueuesPositionsAdapter queuesPositionsAdapter = this$0.adapter;
            if (queuesPositionsAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                queuesPositionsAdapter = null;
            }
            int itemCount = queuesPositionsAdapter.getSize();
            for (int i10 = 0; i10 < itemCount; i10++) {
                QueuesPositionsAdapter queuesPositionsAdapter2 = this$0.adapter;
                if (queuesPositionsAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    queuesPositionsAdapter2 = null;
                }
                PositionAdapter.PositionViewItem item = queuesPositionsAdapter2.getItem(i10);
                if (item != null && item.getPosition().equals(this$0.deepLinkedQueueId, this$0.deepLinkedGuestIds)) {
                    c4946p.setTargetPosition(i10);
                    this$0.getLayoutManager().startSmoothScroll(c4946p);
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView recyclerView;
            ViewTreeObserver viewTreeObserver;
            Handler handler = new Handler();
            final MyQueuesFragment myQueuesFragment = MyQueuesFragment.this;
            handler.postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.fragments.h
                @Override // java.lang.Runnable
                public final void run() {
                    MyQueuesFragment.ViewTreeObserverOnGlobalLayoutListenerC215726.onGlobalLayout$lambda$0(myQueuesFragment);
                }
            }, 750L);
            VqFragmentMyQueuesBinding binding = MyQueuesFragment.this.getBinding();
            if (binding == null || (recyclerView = binding.queueList) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$startLoading$1", m92053f = "MyQueuesFragment.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$startLoading$1 */
    static final class C215771 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215771(Continuation<? super C215771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MyQueuesFragment.this.new C215771(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MyQueuesFragment.this.getPartyViewModel().getQueuePosition();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215771) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MyQueuesFragment() {
        LinkedList linkedListM69272m = Lists.m69272m();
        Intrinsics.checkNotNullExpressionValue(linkedListM69272m, "newLinkedList()");
        this.deepLinkedGuestIds = linkedListM69272m;
        this.primaryGuestName = "";
        this.peekViewQueueId = "";
        this.loggedUser = "";
        this.partyViewModel = LazyKt.lazy(new Function0<PartyViewModel>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment$partyViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PartyViewModel invoke() {
                MyQueuesFragment myQueuesFragment = this.this$0;
                return (PartyViewModel) C3827w0.m20288d(myQueuesFragment, myQueuesFragment.getViewModelFactory()).m20262a(PartyViewModel.class);
            }
        });
        this.isInitialLoad = true;
        this.linkedGuestId = "";
        this.eventAttributes = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VqFragmentMyQueuesBinding getBinding() {
        return (VqFragmentMyQueuesBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PartyViewModel getPartyViewModel() {
        return (PartyViewModel) this.partyViewModel.getValue();
    }

    private final void observeViewModel() {
        C30113j.m92948d(C3816t.m20245a(this), null, null, new C215681(null), 3, null);
        getPartyViewModel().getLoggedUserLiveData().observe(this, new MyQueuesFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.observeViewModel.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                MyQueuesFragment myQueuesFragment = MyQueuesFragment.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                myQueuesFragment.loggedUser = it;
            }
        }));
        getPartyViewModel().getGetPositionEvent().observe(this, new MyQueuesFragment$sam$androidx_lifecycle_Observer$0(new Function1<GetPositionsEvent, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.observeViewModel.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GetPositionsEvent getPositionsEvent) {
                invoke2(getPositionsEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GetPositionsEvent it) {
                MyQueuesFragment myQueuesFragment = MyQueuesFragment.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                myQueuesFragment.onGetPositions(it);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGetPositions(GetPositionsEvent event) {
        String queueId;
        String guestId;
        RecyclerView.Adapter adapter;
        Object next;
        VqFragmentMyQueuesBinding binding;
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        PtrDisneyContainer ptrDisneyContainer;
        VqFragmentMyQueuesBinding binding2 = getBinding();
        if (binding2 != null && (ptrDisneyContainer = binding2.pullToRefreshContainer) != null) {
            ptrDisneyContainer.m64009G();
        }
        if (!event.isSuccess() || event.getPayload() == null || event.getPayload().getResponseStatus() != PositionsResponseStatus.OK) {
            showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesErrorGeneralDetail, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesErrorGeneralTitle, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.onGetPositions.1
                @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
                public void onErrorBannerDismiss(String tag) {
                }

                @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
                public void onErrorBannerRetry(String tag) {
                    MyQueuesFragment myQueuesFragment = MyQueuesFragment.this;
                    myQueuesFragment.startLoading(myQueuesFragment.isLoadingDeepLink);
                }
            }, true, false);
            return;
        }
        VirtualQueueAnalytics virtualQueueAnalytics = getVirtualQueueAnalytics();
        String simpleName = MyQueuesFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        GetPositionsResponse payload = event.getPayload();
        if (payload == null) {
            payload = new GetPositionsResponse(null, null, null, null, false, 31, null);
        }
        virtualQueueAnalytics.trackMyQueuesLoad(simpleName, payload);
        VQResponseEvent vQResponseEvent = new VQResponseEvent();
        vQResponseEvent.setHeaders(event.getHeaders());
        String headerValue = vQResponseEvent.getHeaderValue(VQResponseHeaderAttribute.CORRELATION_ID);
        VqFragmentMyQueuesBinding binding3 = getBinding();
        if (binding3 != null && (recyclerView3 = binding3.queueList) != null) {
            PerformanceTracking.logLoadTime$default(getPerformanceTracking(), PerformanceTrackingScreenName.MY_QUEUES_SCREEN, recyclerView3, headerValue, this.isInitialLoad, false, 16, null);
        }
        GetPositionsResponse payload2 = event.getPayload();
        if (payload2 == null) {
            payload2 = new GetPositionsResponse(null, null, null, null, false, 31, null);
        }
        Queue queue = (Queue) CollectionsKt.firstOrNull((List) payload2.getQueues());
        if (queue == null || (queueId = queue.getQueueId()) == null) {
            queueId = "";
        }
        this.peekViewQueueId = queueId;
        LinkedGuest linkedGuest = (LinkedGuest) CollectionsKt.firstOrNull((List) payload2.getGuests());
        if (linkedGuest == null || (guestId = linkedGuest.getGuestId()) == null) {
            guestId = "";
        }
        this.linkedGuestId = guestId;
        Position position = (Position) CollectionsKt.firstOrNull((List) payload2.getPositions());
        this.isSummoned = position != null ? position.getIsSummoned() : false;
        Iterator<T> it = payload2.getGuests().iterator();
        while (true) {
            adapter = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((LinkedGuest) next).getIsPrimaryGuest()) {
                    break;
                }
            }
        }
        LinkedGuest linkedGuest2 = (LinkedGuest) next;
        String string = linkedGuest2 != null ? getString(C21487R.string.vq_txt_common_name_first_last, linkedGuest2.getFirstName(), linkedGuest2.getLastName()) : null;
        this.primaryGuestName = string != null ? string : "";
        VirtualQueueThemer vqThemer = getVqThemer();
        List<Queue> queues = payload2.getQueues();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(queues, 10));
        Iterator<T> it2 = queues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Queue) it2.next()).getContentId());
        }
        vqThemer.refreshDocuments(arrayList);
        VqFragmentMyQueuesBinding binding4 = getBinding();
        if (binding4 != null && (recyclerView2 = binding4.queueList) != null) {
            adapter = recyclerView2.getAdapter();
        }
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.common.QueuesPositionsAdapter");
        ((QueuesPositionsAdapter) adapter).setPositions(payload2);
        if (!this.isLoadingDeepLink || StringsKt.isBlank(this.deepLinkedQueueId) || (binding = getBinding()) == null || (recyclerView = binding.queueList) == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC215726());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$1(MyQueuesFragment this$0) {
        PtrDisneyContainer ptrDisneyContainer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VqFragmentMyQueuesBinding binding = this$0.getBinding();
        if (binding == null || (ptrDisneyContainer = binding.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.m64008E(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLoading(boolean deepLink) {
        PtrDisneyContainer ptrDisneyContainer;
        VqFragmentMyQueuesBinding binding = getBinding();
        if (binding != null && (ptrDisneyContainer = binding.pullToRefreshContainer) != null) {
            ptrDisneyContainer.m64010J();
        }
        this.isLoadingDeepLink = deepLink;
        C30113j.m92948d(this, null, null, new C215771(null), 3, null);
    }

    public final void displayPeekView() {
        getPartyViewModel().virtualQueueAppType();
    }

    @Override // kotlinx.coroutines.InterfaceC30065h0
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final PtrMyQueuesHeader getHeaderView() {
        PtrMyQueuesHeader ptrMyQueuesHeader = this.headerView;
        if (ptrMyQueuesHeader != null) {
            return ptrMyQueuesHeader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerView");
        return null;
    }

    public final LinearLayoutManager getLayoutManager() {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
        return null;
    }

    public final VirtualQueueNavigationEntriesProvider getNavigationEntriesProvider() {
        VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider = this.navigationEntriesProvider;
        if (virtualQueueNavigationEntriesProvider != null) {
            return virtualQueueNavigationEntriesProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationEntriesProvider");
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

    public final QueuesPositionsAdapter.Factory getQueuesPositionAdapterFactory() {
        QueuesPositionsAdapter.Factory factory = this.queuesPositionAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queuesPositionAdapterFactory");
        return null;
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
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

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        RecyclerView recyclerView;
        getVirtualQueueAnalytics().trackMyQueuesBack();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        VqFragmentMyQueuesBinding binding = getBinding();
        RecyclerView.Adapter adapter = (binding == null || (recyclerView = binding.queueList) == null) ? null : recyclerView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.common.QueuesPositionsAdapter");
        ((QueuesPositionsAdapter) adapter).showLoading();
        return false;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        observeViewModel();
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_my_queues, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.isInitialLoad = true;
        Map<String, Object> map = this.eventAttributes;
        String attrName = PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.MY_QUEUES_SCREEN;
        map.put(attrName, performanceTrackingScreenName.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        String activeNetworkConnection = getVqThemer().getActiveNetworkConnection();
        if (activeNetworkConnection == null || activeNetworkConnection.length() == 0) {
            showNoNetworkMessage();
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.fragments.g
                @Override // java.lang.Runnable
                public final void run() {
                    MyQueuesFragment.onResume$lambda$1(this.f45231a);
                }
            }, 500L);
        }
        PerformanceTracking performanceTracking = getPerformanceTracking();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView()");
        pageLoadTimeTracking(performanceTracking, performanceTrackingScreenName, viewRequireView, this.isInitialLoad, this.isSummoned);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button button;
        Button button2;
        RecyclerView recyclerView;
        PtrDisneyContainer ptrDisneyContainer;
        PtrDisneyContainer ptrDisneyContainer2;
        PtrDisneyContainer ptrDisneyContainer3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivityActions().setTitle(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesHeader, null, false, 6, null), true);
        getPartyViewModel().getLoggedUserFullName();
        this.isInitialLoad = true;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("queueId", null) : null;
        if (string == null) {
            string = "";
        }
        this.deepLinkedQueueId = string;
        Bundle arguments2 = getArguments();
        List<String> stringArrayList = arguments2 != null ? arguments2.getStringArrayList("guest_ids") : null;
        if (stringArrayList == null) {
            stringArrayList = Lists.m69272m();
            Intrinsics.checkNotNullExpressionValue(stringArrayList, "newLinkedList()");
        }
        this.deepLinkedGuestIds = stringArrayList;
        getHeaderView().setVqThemer(getVqThemer());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        new LottieLoader(fragmentActivityRequireActivity, getVqThemer()).setLoaderAnimationUrl(getHeaderView().getPtrLoader());
        VqFragmentMyQueuesBinding binding = getBinding();
        if (binding != null && (ptrDisneyContainer3 = binding.pullToRefreshContainer) != null) {
            ptrDisneyContainer3.m64011f(getHeaderView());
        }
        VqFragmentMyQueuesBinding binding2 = getBinding();
        PtrDisneyContainer ptrDisneyContainer4 = binding2 != null ? binding2.pullToRefreshContainer : null;
        if (ptrDisneyContainer4 != null) {
            ptrDisneyContainer4.setHeaderView(getHeaderView());
        }
        VqFragmentMyQueuesBinding binding3 = getBinding();
        if (binding3 != null && (ptrDisneyContainer2 = binding3.pullToRefreshContainer) != null) {
            ptrDisneyContainer2.setEnablePtr(true);
        }
        VqFragmentMyQueuesBinding binding4 = getBinding();
        if (binding4 != null && (ptrDisneyContainer = binding4.pullToRefreshContainer) != null) {
            ptrDisneyContainer.setPtrHandler(new InterfaceC29611b() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.onViewCreated.1
                @Override // p708ko.InterfaceC29611b
                public /* bridge */ /* synthetic */ boolean checkCanDoRefresh(PtrBaseContainer ptrBaseContainer, View view2, View view3) {
                    return super.checkCanDoRefresh(ptrBaseContainer, view2, view3);
                }

                @Override // p708ko.InterfaceC29611b
                public void onRefreshBegin(PtrBaseContainer frame) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    if (!MyQueuesFragment.this.isInitialLoad) {
                        MyQueuesFragment.this.getVirtualQueueAnalytics().trackMyQueuesRefresh();
                    }
                    VqFragmentMyQueuesBinding binding5 = MyQueuesFragment.this.getBinding();
                    PtrDisneyContainer ptrDisneyContainer5 = binding5 != null ? binding5.pullToRefreshContainer : null;
                    if (ptrDisneyContainer5 != null) {
                        ptrDisneyContainer5.setEnabled(false);
                    }
                    MyQueuesFragment.this.startLoading(false);
                }

                @Override // p708ko.InterfaceC29611b
                public void onRefreshFinish() {
                    if (CommonExtensionsKt.isSafe(MyQueuesFragment.this)) {
                        VqFragmentMyQueuesBinding binding5 = MyQueuesFragment.this.getBinding();
                        PtrDisneyContainer ptrDisneyContainer5 = binding5 != null ? binding5.pullToRefreshContainer : null;
                        if (ptrDisneyContainer5 != null) {
                            ptrDisneyContainer5.setEnabled(true);
                        }
                        MyQueuesFragment.this.isInitialLoad = false;
                        if ((MyQueuesFragment.this.isSummoned ? this : null) != null) {
                            MyQueuesFragment myQueuesFragment = MyQueuesFragment.this;
                            PerformanceTracking performanceTracking = myQueuesFragment.getPerformanceTracking();
                            PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.MY_QUEUES_SCREEN;
                            View viewRequireView = myQueuesFragment.requireView();
                            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView()");
                            myQueuesFragment.pageLoadTimeTracking(performanceTracking, performanceTrackingScreenName, viewRequireView, myQueuesFragment.isInitialLoad, myQueuesFragment.isSummoned);
                        }
                    }
                }
            });
        }
        QueuesPositionsAdapter queuesPositionsAdapterCreate = getQueuesPositionAdapterFactory().create(this, this, this, getVqThemer(), VQPageType.MYQUEUES);
        this.adapter = queuesPositionsAdapterCreate;
        if (queuesPositionsAdapterCreate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            queuesPositionsAdapterCreate = null;
        }
        queuesPositionsAdapterCreate.addDelegates();
        QueuesPositionsAdapter queuesPositionsAdapter = this.adapter;
        if (queuesPositionsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            queuesPositionsAdapter = null;
        }
        queuesPositionsAdapter.showLoading();
        getLayoutManager().setOrientation(1);
        VqFragmentMyQueuesBinding binding5 = getBinding();
        RecyclerView recyclerView2 = binding5 != null ? binding5.queueList : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(getLayoutManager());
        }
        VqFragmentMyQueuesBinding binding6 = getBinding();
        RecyclerView recyclerView3 = binding6 != null ? binding6.queueList : null;
        if (recyclerView3 != null) {
            QueuesPositionsAdapter queuesPositionsAdapter2 = this.adapter;
            if (queuesPositionsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                queuesPositionsAdapter2 = null;
            }
            recyclerView3.setAdapter(queuesPositionsAdapter2);
        }
        VqFragmentMyQueuesBinding binding7 = getBinding();
        if (binding7 != null && (recyclerView = binding7.queueList) != null) {
            recyclerView.addOnChildAttachStateChangeListener(new RecyclerView.InterfaceC4913p() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.onViewCreated.2
                @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC4913p
                public void onChildViewAttachedToWindow(View view2) {
                    RecyclerView recyclerView4;
                    RecyclerView recyclerView5;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    VqFragmentMyQueuesBinding binding8 = MyQueuesFragment.this.getBinding();
                    RecyclerView.AbstractC4902e0 childViewHolder = null;
                    if (((binding8 == null || (recyclerView5 = binding8.queueList) == null) ? null : recyclerView5.getChildViewHolder(view2)) instanceof PositionAdapter.PositionViewHolder) {
                        VqFragmentMyQueuesBinding binding9 = MyQueuesFragment.this.getBinding();
                        if (binding9 != null && (recyclerView4 = binding9.queueList) != null) {
                            childViewHolder = recyclerView4.getChildViewHolder(view2);
                        }
                        Intrinsics.checkNotNull(childViewHolder, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.my_queues.PositionAdapter.PositionViewHolder");
                        ((PositionAdapter.PositionViewHolder) childViewHolder).viewAttached();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC4913p
                public void onChildViewDetachedFromWindow(View view2) {
                    RecyclerView recyclerView4;
                    RecyclerView recyclerView5;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    VqFragmentMyQueuesBinding binding8 = MyQueuesFragment.this.getBinding();
                    RecyclerView.AbstractC4902e0 childViewHolder = null;
                    if (((binding8 == null || (recyclerView5 = binding8.queueList) == null) ? null : recyclerView5.getChildViewHolder(view2)) instanceof PositionAdapter.PositionViewHolder) {
                        VqFragmentMyQueuesBinding binding9 = MyQueuesFragment.this.getBinding();
                        if (binding9 != null && (recyclerView4 = binding9.queueList) != null) {
                            childViewHolder = recyclerView4.getChildViewHolder(view2);
                        }
                        Intrinsics.checkNotNull(childViewHolder, "null cannot be cast to non-null type com.disney.wdpro.virtualqueue.ui.my_queues.PositionAdapter.PositionViewHolder");
                        ((PositionAdapter.PositionViewHolder) childViewHolder).viewDetached();
                    }
                }
            });
        }
        ViewGroup viewGroup = (ViewGroup) view;
        VqFragmentMyQueuesBinding binding8 = getBinding();
        viewGroup.removeView(binding8 != null ? binding8.addIcon : null);
        VqFragmentMyQueuesBinding binding9 = getBinding();
        if (binding9 != null && (button2 = binding9.addIcon) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button2, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.onViewCreated.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MyQueuesFragment.this.startJoinFlow(false);
                }
            }, 1, null);
        }
        VqFragmentMyQueuesBinding binding10 = getBinding();
        Button button3 = binding10 != null ? binding10.addIcon : null;
        if (button3 != null) {
            button3.setText(VirtualQueueThemer.getPeptasiaIcon$default(getVqThemer(), VQIconType.MyLinesHeaderAddIcon, null, 2, null));
        }
        VqFragmentMyQueuesBinding binding11 = getBinding();
        Button button4 = binding11 != null ? binding11.addIcon : null;
        if (button4 != null) {
            button4.setContentDescription(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesJoinAccessibility, null, false, 6, null));
        }
        VqFragmentMyQueuesBinding binding12 = getBinding();
        if (binding12 == null || (button = binding12.addIcon) == null) {
            return;
        }
        getActivityActions().addHeaderRightView(button);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void refresh(android.os.Bundle r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L29
            java.lang.String r0 = "queueId"
            r1 = 0
            java.lang.String r0 = r3.getString(r0, r1)
            java.lang.String r1 = "it.getString(VirtualQueu…nts.QUEUE_ID_PARAM, null)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.deepLinkedQueueId = r0
            java.lang.String r0 = "guest_ids"
            java.util.ArrayList r3 = r3.getStringArrayList(r0)
            if (r3 == 0) goto L23
            java.lang.String r0 = "getStringArrayList(Virtu…onstants.GUEST_IDS_PARAM)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
            if (r3 != 0) goto L27
        L23:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L27:
            r2.deepLinkedGuestIds = r3
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment.refresh(android.os.Bundle):void");
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnableBluetooth() {
        getActivityActions().requestEnableBluetooth();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnableLocation() {
        getActivityActions().requestEnableLocation();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnablePushNotifications() {
        getActivityActions().requestEnablePushNotifications();
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setHeaderView(PtrMyQueuesHeader ptrMyQueuesHeader) {
        Intrinsics.checkNotNullParameter(ptrMyQueuesHeader, "<set-?>");
        this.headerView = ptrMyQueuesHeader;
    }

    public final void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<set-?>");
        this.layoutManager = linearLayoutManager;
    }

    public final void setNavigationEntriesProvider(VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        Intrinsics.checkNotNullParameter(virtualQueueNavigationEntriesProvider, "<set-?>");
        this.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setQueuesPositionAdapterFactory(QueuesPositionsAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.queuesPositionAdapterFactory = factory;
    }

    public final void setViewModelFactory(C3821v0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.viewModelFactory = cVar;
    }

    public final void setVirtualQueueAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.virtualQueueAnalytics = virtualQueueAnalytics;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showDirections(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getVirtualQueueAnalytics().trackMyQueuesDirections();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions activityActions = getActivityActions();
        VirtualQueueNavigationEntriesProvider navigationEntriesProvider = getNavigationEntriesProvider();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        activityActions.navigateTo(navigationEntriesProvider.getWayFindingNavigationEntry(contextRequireContext, facilityId, true));
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showLeaveQueue(Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        VirtualQueueStackActivity.Companion companion = VirtualQueueStackActivity.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Intent intentCreateIntent = companion.createIntent(fragmentActivityRequireActivity);
        intentCreateIntent.putExtra(VirtualQueueConstants.FLOW_PARAM, 20004);
        intentCreateIntent.putExtras(LeaveQueueFragment.INSTANCE.createDataBundle(position));
        getActivityActions().navigateTo(new C8666f.b(intentCreateIntent).withLoginCheck().build());
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showRedeem(Position position, List<LinkedGuest> guests, Queue queue) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        getVirtualQueueAnalytics().trackMyQueuesRedeem();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions activityActions = getActivityActions();
        RedeemFragment.Companion companion = RedeemFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        activityActions.navigateTo(companion.navigationEntry(fragmentActivityRequireActivity, position, guests, queue));
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void startJoinFlow(boolean fromMainButton) {
        getVirtualQueueAnalytics().trackMyQueuesJoin(fromMainButton);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        VirtualQueueStackActivity.Companion companion = VirtualQueueStackActivity.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Intent intentCreateIntent = companion.createIntent(fragmentActivityRequireActivity);
        intentCreateIntent.putExtra(VirtualQueueConstants.FLOW_PARAM, 20001);
        intentCreateIntent.putExtra(VirtualQueueConstants.IS_LINKED_FROM_MY_QUEUES, true);
        getActivityActions().navigateTo(new C8666f.b(intentCreateIntent).withAnimations(new SlidingUpAnimation()).withLoginCheck().build());
    }

    public final void triggerPeekView() {
        this.didClickIcon = true;
        if (StringsKt.isBlank(this.primaryGuestName)) {
            PartyViewModel.getLinkedGuests$default(getPartyViewModel(), this.peekViewQueueId, false, null, 4, null);
        } else {
            displayPeekView();
        }
    }
}