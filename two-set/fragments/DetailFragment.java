package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C3816t;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.widget.SnowballHeader;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueStackActivity;
import com.disney.wdpro.virtualqueue.core.fragments.RedeemFragment;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.interfaces.PeekViewActions;
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
import com.disney.wdpro.virtualqueue.databinding.VqFragmentDetailBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.LottieLoader;
import com.disney.wdpro.virtualqueue.p462ui.common.QueuesPositionsAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.service.model.BoardingGroupType;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.PositionsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
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
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
import p708ko.InterfaceC29611b;

@Metadata(m92037d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002¡\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u0006J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J-\u00106\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010\u0006J\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\u0006R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010Y\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010E\u001a\u0004\bg\u0010G\"\u0004\bh\u0010IR\"\u0010j\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010x\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R!\u0010\u0083\u0001\u001a\u0004\u0018\u00010~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008f\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008b\u0001R7\u0010\u0097\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¢\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/DetailFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PositionActions;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "startLoading", "", "returnWindowMinutes", "", "getReturnTime", "(I)Ljava/lang/String;", "loadPositions", "showErrorMessage", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "response", "setupSecretTap", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "onResume", "onDestroy", "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "showLeaveQueue", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;)V", "fromMainButton", "startJoinFlow", "(Z)V", "facilityId", "showDirections", "(Ljava/lang/String;)V", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "showRedeem", "(Lcom/disney/wdpro/virtualqueue/service/model/Position;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "requestEnableBluetooth", "requestEnableLocation", "requestEnablePushNotifications", "triggerPeekView", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "navigationEntriesProvider", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "getNavigationEntriesProvider", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "setNavigationEntriesProvider", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "vqAnalytics", "getVqAnalytics", "setVqAnalytics", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "peekViewActions", "Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "getPeekViewActions", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;", "setPeekViewActions", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/PeekViewActions;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "loggedInUser", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "getLoggedInUser", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "setLoggedInUser", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "queuesPositionsAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "getQueuesPositionsAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;", "setQueuesPositionsAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentDetailBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentDetailBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/common/QueuesPositionsAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "headerView", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "isInitialLoad", "Z", "positionsResponse", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "positionId", "Ljava/lang/String;", "linkedGuestId", "triedRemovingGuests", VirtualQueueConstants.GUEST_NAME_PARAM, "loggedUser", "isSummoned", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class DetailFragment extends VirtualQueueBaseFragment implements PositionActions, InterfaceC27132a, InterfaceC30065h0 {
    private QueuesPositionsAdapter adapter;
    private PtrMyQueuesHeader headerView;
    private boolean isSummoned;

    @Inject
    public LoggedInUser loggedInUser;

    @Inject
    public VirtualQueueNavigationEntriesProvider navigationEntriesProvider;

    @Inject
    public C9314j parkAppConfiguration;

    @Inject
    public PeekViewActions peekViewActions;

    @Inject
    public PerformanceTracking performanceTracking;

    @Inject
    public QueuesPositionsAdapter.Factory queuesPositionsAdapterFactory;

    @Inject
    public SharedPreferences sharedPreferences;
    private boolean triedRemovingGuests;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;

    @Inject
    public VirtualQueueAnalytics vqAnalytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DetailFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, DetailFragment$binding$2.INSTANCE);
    private boolean isInitialLoad = true;
    private GetPositionsResponse positionsResponse = new GetPositionsResponse(null, null, null, null, false, 31, null);
    private String positionId = "";
    private String linkedGuestId = "";
    private String guestName = "";
    private String loggedUser = "";
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/DetailFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/DetailFragment;", "data", "Landroid/os/Bundle;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DetailFragment newInstance(Bundle data) {
            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setArguments(data);
            return detailFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.DetailFragment$loadPositions$1", m92053f = "DetailFragment.kt", m92054i = {0}, m92055l = {h76.LENSSTUDIO_SCRIPTNODE_ADD_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {"$this$launch"}, m92058s = {"L$0"})
    @SourceDebugExtension({"SMAP\nDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/DetailFragment$loadPositions$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,434:1\n1#2:435\n288#3,2:436\n288#3,2:438\n288#3,2:440\n1549#3:442\n1620#3,3:443\n*S KotlinDebug\n*F\n+ 1 DetailFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/DetailFragment$loadPositions$1\n*L\n270#1:436,2\n271#1:438,2\n273#1:440,2\n332#1:442\n332#1:443,3\n*E\n"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.DetailFragment$loadPositions$1 */
    static final class C215541 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215541(Continuation<? super C215541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215541 c215541 = DetailFragment.this.new C215541(continuation);
            c215541.L$0 = obj;
            return c215541;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object positions;
            InterfaceC30065h0 interfaceC30065h0;
            Object next;
            Object next2;
            Object next3;
            TextView textView;
            Queue queueById;
            TextView textView2;
            String guestId;
            String contentId;
            RecyclerView recyclerView;
            PtrDisneyContainer ptrDisneyContainer;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC30065h0 interfaceC30065h02 = (InterfaceC30065h0) this.L$0;
                VirtualQueueManager virtualQueueManager = DetailFragment.this.getVirtualQueueManager();
                this.L$0 = interfaceC30065h02;
                this.label = 1;
                positions = virtualQueueManager.getPositions(this);
                if (positions == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC30065h0 = interfaceC30065h02;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC30065h0 = (InterfaceC30065h0) this.L$0;
                ResultKt.throwOnFailure(obj);
                positions = obj;
            }
            GetPositionsEvent getPositionsEvent = (GetPositionsEvent) positions;
            VqFragmentDetailBinding binding = DetailFragment.this.getBinding();
            if (binding != null && (ptrDisneyContainer = binding.pullToRefreshContainer) != null) {
                ptrDisneyContainer.m64009G();
            }
            if (!getPositionsEvent.isSuccess() || getPositionsEvent.getPayload() == null || getPositionsEvent.getPayload().getResponseStatus() != PositionsResponseStatus.OK) {
                DetailFragment.this.showErrorMessage();
            }
            GetPositionsResponse payload = getPositionsEvent.getPayload();
            if (payload == null) {
                payload = new GetPositionsResponse(null, null, null, null, false, 31, null);
            }
            VirtualQueueAnalytics virtualQueueAnalytics = DetailFragment.this.getVirtualQueueAnalytics();
            String simpleName = interfaceC30065h0.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
            virtualQueueAnalytics.trackDetailLoad(simpleName, payload);
            VQResponseEvent vQResponseEvent = new VQResponseEvent();
            vQResponseEvent.setHeaders(getPositionsEvent.getHeaders());
            String headerValue = vQResponseEvent.getHeaderValue(VQResponseHeaderAttribute.CORRELATION_ID);
            VqFragmentDetailBinding binding2 = DetailFragment.this.getBinding();
            if (binding2 != null && (recyclerView = binding2.queueList) != null) {
                DetailFragment detailFragment = DetailFragment.this;
                PerformanceTracking.logLoadTime$default(detailFragment.getPerformanceTracking(), PerformanceTrackingScreenName.DETAIL_SCREEN, recyclerView, headerValue, detailFragment.isInitialLoad, false, 16, null);
            }
            List<Position> positions2 = payload.getPositions();
            DetailFragment detailFragment2 = DetailFragment.this;
            Iterator<T> it = positions2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Position) next).getPositionIdHash(), detailFragment2.positionId)) {
                    break;
                }
            }
            Position position = (Position) next;
            Iterator<T> it2 = payload.getQueues().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.areEqual(((Queue) next2).getQueueId(), position != null ? position.getQueueId() : null)) {
                    break;
                }
            }
            Queue queue = (Queue) next2;
            String str = "";
            String str2 = (queue == null || (contentId = queue.getContentId()) == null) ? "" : contentId;
            DetailFragment detailFragment3 = DetailFragment.this;
            Iterator<T> it3 = payload.getGuests().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (((LinkedGuest) next3).getIsPrimaryGuest()) {
                    break;
                }
            }
            LinkedGuest linkedGuest = (LinkedGuest) next3;
            String string = linkedGuest != null ? DetailFragment.this.getString(C21487R.string.vq_txt_common_name_first_last, linkedGuest.getFirstName(), linkedGuest.getLastName()) : null;
            if (string == null) {
                string = "";
            }
            detailFragment3.guestName = string;
            DetailFragment detailFragment4 = DetailFragment.this;
            LinkedGuest linkedGuest2 = (LinkedGuest) CollectionsKt.firstOrNull((List) payload.getGuests());
            if (linkedGuest2 != null && (guestId = linkedGuest2.getGuestId()) != null) {
                str = guestId;
            }
            detailFragment4.linkedGuestId = str;
            DetailFragment detailFragment5 = DetailFragment.this;
            Position position2 = (Position) CollectionsKt.firstOrNull((List) payload.getPositions());
            int postedSummonReturnWindowMinutes = 0;
            detailFragment5.isSummoned = position2 != null && position2.getIsSummoned();
            if (position != null) {
                DetailFragment.this.triedRemovingGuests = false;
                VqFragmentDetailBinding binding3 = DetailFragment.this.getBinding();
                ScrollView scrollView = binding3 != null ? binding3.contentWrapper : null;
                if (scrollView != null) {
                    scrollView.setVisibility(0);
                }
                DetailFragment.this.positionsResponse = new GetPositionsResponse(payload.getResponseStatus(), payload.getQueues(), payload.getGuests(), CollectionsKt.listOf(position), false, 16, null);
                QueuesPositionsAdapter queuesPositionsAdapter = DetailFragment.this.adapter;
                if (queuesPositionsAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    queuesPositionsAdapter = null;
                }
                queuesPositionsAdapter.setPositions(DetailFragment.this.positionsResponse);
                if (position.getIsReleased() || position.getIsSummoned() || position.getIsExpired() || position.getBoardingGroupType() == BoardingGroupType.BACKUP) {
                    VqFragmentDetailBinding binding4 = DetailFragment.this.getBinding();
                    TextView textView3 = binding4 != null ? binding4.whatsNext : null;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    VqFragmentDetailBinding binding5 = DetailFragment.this.getBinding();
                    LinearLayout linearLayout = binding5 != null ? binding5.bullet1Container : null;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    VqFragmentDetailBinding binding6 = DetailFragment.this.getBinding();
                    LinearLayout linearLayout2 = binding6 != null ? binding6.bullet2Container : null;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                } else {
                    VqFragmentDetailBinding binding7 = DetailFragment.this.getBinding();
                    TextView textView4 = binding7 != null ? binding7.whatsNext : null;
                    if (textView4 != null) {
                        textView4.setText(VirtualQueueThemer.getString$default(DetailFragment.this.getVqThemer(), VQStringType.DetailFooterTitle, str2, false, 4, null));
                    }
                    VqFragmentDetailBinding binding8 = DetailFragment.this.getBinding();
                    TextView textView5 = binding8 != null ? binding8.bullet1Icon : null;
                    if (textView5 != null) {
                        textView5.setText(DetailFragment.this.getVqThemer().getPeptasiaIcon(VQIconType.DetailFooterBullet1Icon, str2));
                    }
                    VqFragmentDetailBinding binding9 = DetailFragment.this.getBinding();
                    TextView textView6 = binding9 != null ? binding9.bullet2Icon : null;
                    if (textView6 != null) {
                        textView6.setText(DetailFragment.this.getVqThemer().getPeptasiaIcon(VQIconType.DetailFooterBullet2Icon, str2));
                    }
                    VqFragmentDetailBinding binding10 = DetailFragment.this.getBinding();
                    TextView textView7 = binding10 != null ? binding10.bullet1 : null;
                    if (textView7 != null) {
                        textView7.setText(VirtualQueueThemer.getString$default(DetailFragment.this.getVqThemer(), VQStringType.DetailFooterBullet1, str2, false, 4, null));
                    }
                    VqFragmentDetailBinding binding11 = DetailFragment.this.getBinding();
                    LinearLayout linearLayout3 = binding11 != null ? binding11.bullet1Container : null;
                    if (linearLayout3 != null) {
                        VqFragmentDetailBinding binding12 = DetailFragment.this.getBinding();
                        linearLayout3.setContentDescription((binding12 == null || (textView2 = binding12.bullet1) == null) ? null : textView2.getText());
                    }
                    if (!DetailFragment.this.positionsResponse.getPositions().isEmpty() && (queueById = DetailFragment.this.positionsResponse.getQueueById(DetailFragment.this.positionsResponse.getPositions().get(0).getQueueId())) != null) {
                        postedSummonReturnWindowMinutes = queueById.getPostedSummonReturnWindowMinutes();
                    }
                    String returnTime = DetailFragment.this.getReturnTime(postedSummonReturnWindowMinutes);
                    VqFragmentDetailBinding binding13 = DetailFragment.this.getBinding();
                    TextView textView8 = binding13 != null ? binding13.bullet2 : null;
                    if (textView8 != null) {
                        String str3 = str2;
                        str2 = str3;
                        textView8.setText(VirtualQueueThemer.getString$default(DetailFragment.this.getVqThemer(), VQStringType.DetailFooterBullet2, MapsKt.mapOf(TuplesKt.m92045to("returnTime", returnTime)), str3, false, 8, null));
                    }
                    VqFragmentDetailBinding binding14 = DetailFragment.this.getBinding();
                    LinearLayout linearLayout4 = binding14 != null ? binding14.bullet2Container : null;
                    if (linearLayout4 != null) {
                        VqFragmentDetailBinding binding15 = DetailFragment.this.getBinding();
                        linearLayout4.setContentDescription((binding15 == null || (textView = binding15.bullet2) == null) ? null : textView.getText());
                    }
                }
                VqFragmentDetailBinding binding16 = DetailFragment.this.getBinding();
                TextView textView9 = binding16 != null ? binding16.virtualQueueTapIcon : null;
                if (textView9 != null) {
                    textView9.setText(DetailFragment.this.getVqThemer().getPeptasiaIcon(VQIconType.HowToVisitPlaceholderIcon, str2));
                }
                DetailFragment.this.setupSecretTap(payload);
            } else if (DetailFragment.this.triedRemovingGuests) {
                DetailFragment.this.requireActivity().finish();
            } else {
                DetailFragment.this.showErrorMessage();
                VqFragmentDetailBinding binding17 = DetailFragment.this.getBinding();
                PtrDisneyContainer ptrDisneyContainer2 = binding17 != null ? binding17.pullToRefreshContainer : null;
                if (ptrDisneyContainer2 != null) {
                    ptrDisneyContainer2.setVisibility(8);
                }
            }
            VirtualQueueThemer vqThemer = DetailFragment.this.getVqThemer();
            List<Queue> queues = payload.getQueues();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(queues, 10));
            Iterator<T> it4 = queues.iterator();
            while (it4.hasNext()) {
                arrayList.add(((Queue) it4.next()).getContentId());
            }
            vqThemer.refreshDocuments(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215541) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.DetailFragment$onViewCreated$3", m92053f = "DetailFragment.kt", m92054i = {}, m92055l = {179}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.DetailFragment$onViewCreated$3 */
    static final class C215563 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C215563(Continuation<? super C215563> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DetailFragment.this.new C215563(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DetailFragment detailFragment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DetailFragment detailFragment2 = DetailFragment.this;
                LoggedInUser loggedInUser = detailFragment2.getLoggedInUser();
                this.L$0 = detailFragment2;
                this.label = 1;
                Object loggedInUserName = loggedInUser.getLoggedInUserName(this);
                if (loggedInUserName == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = loggedInUserName;
                detailFragment = detailFragment2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                detailFragment = (DetailFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            detailFragment.loggedUser = (String) obj;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215563) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VqFragmentDetailBinding getBinding() {
        return (VqFragmentDetailBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getReturnTime(int returnWindowMinutes) {
        if (returnWindowMinutes <= 0) {
            return VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.DetailReturnTimeAllDay, null, false, 6, null);
        }
        if (returnWindowMinutes % 60 != 0) {
            return VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.DetailReturnTimeWithinMinutes, MapsKt.mapOf(TuplesKt.m92045to("minutes", String.valueOf(returnWindowMinutes))), null, false, 12, null);
        }
        int i10 = (int) (returnWindowMinutes / 60.0f);
        return i10 == 1 ? VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.DetailReturnTimeWithinNextHour, null, false, 6, null) : VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.DetailReturnTimeWithinHours, MapsKt.mapOf(TuplesKt.m92045to("hours", String.valueOf(i10))), null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadPositions() {
        PtrDisneyContainer ptrDisneyContainer;
        String activeNetworkConnection = getVqThemer().getActiveNetworkConnection();
        if (activeNetworkConnection != null && activeNetworkConnection.length() != 0) {
            C30113j.m92948d(this, null, null, new C215541(null), 3, null);
            return;
        }
        VqFragmentDetailBinding binding = getBinding();
        if (binding != null && (ptrDisneyContainer = binding.pullToRefreshContainer) != null) {
            ptrDisneyContainer.m64009G();
        }
        showNoNetworkMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$1(DetailFragment this$0) {
        PtrDisneyContainer ptrDisneyContainer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VqFragmentDetailBinding binding = this$0.getBinding();
        if (binding == null || (ptrDisneyContainer = binding.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.m64008E(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupSecretTap(final GetPositionsResponse response) {
        TextView textView;
        if (!response.getShowCastAssistanceCode()) {
            VqFragmentDetailBinding binding = getBinding();
            TextView textView2 = binding != null ? binding.virtualQueueTapIcon : null;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        VqFragmentDetailBinding binding2 = getBinding();
        TextView textView3 = binding2 != null ? binding2.virtualQueueTapIcon : null;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        VqFragmentDetailBinding binding3 = getBinding();
        if (binding3 == null || (textView = binding3.virtualQueueTapIcon) == null) {
            return;
        }
        CommonExtensionsKt.setOnDebouncedClickListener$default(textView, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.DetailFragment.setupSecretTap.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                VirtualQueueAnalytics virtualQueueAnalytics = DetailFragment.this.getVirtualQueueAnalytics();
                String simpleName = DetailFragment.this.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
                virtualQueueAnalytics.trackPeekViewLoad(simpleName, VQPageType.DETAIL, response, null);
                String strM38908h = DetailFragment.this.getParkAppConfiguration().m38908h();
                if (Intrinsics.areEqual(strM38908h, "DLR")) {
                    DetailFragment.this.getPeekViewActions().triggerPeekView(DetailFragment.this);
                    return;
                }
                if (!Intrinsics.areEqual(strM38908h, "WDW")) {
                    DetailFragment.this.getPeekViewActions().triggerPeekView(DetailFragment.this);
                    return;
                }
                DetailFragment detailFragment = DetailFragment.this;
                String str = detailFragment.loggedUser;
                String str2 = DetailFragment.this.linkedGuestId;
                if (str2 == null) {
                    str2 = "";
                }
                detailFragment.showPeekView(str, str2, VirtualQueueThemer.getString$default(DetailFragment.this.getVqThemer(), VQStringType.CommonPeekViewInstructionalText, null, false, 6, null));
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesErrorGeneralDetail, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.MyLinesErrorGeneralTitle, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.DetailFragment.showErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                DetailFragment.this.onBackPressed();
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                DetailFragment.this.loadPositions();
            }
        }, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLoading() {
        PtrDisneyContainer ptrDisneyContainer;
        VqFragmentDetailBinding binding = getBinding();
        if (binding != null && (ptrDisneyContainer = binding.pullToRefreshContainer) != null) {
            ptrDisneyContainer.m64010J();
        }
        loadPositions();
    }

    @Override // kotlinx.coroutines.InterfaceC30065h0
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final Map<String, Object> getEventAttributes() {
        return this.eventAttributes;
    }

    public final LoggedInUser getLoggedInUser() {
        LoggedInUser loggedInUser = this.loggedInUser;
        if (loggedInUser != null) {
            return loggedInUser;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loggedInUser");
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

    public final C9314j getParkAppConfiguration() {
        C9314j c9314j = this.parkAppConfiguration;
        if (c9314j != null) {
            return c9314j;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkAppConfiguration");
        return null;
    }

    public final PeekViewActions getPeekViewActions() {
        PeekViewActions peekViewActions = this.peekViewActions;
        if (peekViewActions != null) {
            return peekViewActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("peekViewActions");
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

    public final QueuesPositionsAdapter.Factory getQueuesPositionsAdapterFactory() {
        QueuesPositionsAdapter.Factory factory = this.queuesPositionsAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queuesPositionsAdapterFactory");
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

    public final VirtualQueueAnalytics getVqAnalytics() {
        VirtualQueueAnalytics virtualQueueAnalytics = this.vqAnalytics;
        if (virtualQueueAnalytics != null) {
            return virtualQueueAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqAnalytics");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivityActions().setTitle(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.DetailHeader, null, false, 6, null), true);
        SnowballHeader header = getActivityActions().getHeader();
        if (header != null) {
            header.setNavigationIcon((Drawable) null);
        }
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        requireActivity().finish();
        return true;
    }

    @Override // com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_fragment_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Map<String, Object> map = this.eventAttributes;
        String attrName = PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.DETAIL_SCREEN;
        map.put(attrName, performanceTrackingScreenName.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        this.isInitialLoad = true;
        new Handler().postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.fragments.b
            @Override // java.lang.Runnable
            public final void run() {
                DetailFragment.onResume$lambda$1(this.f45226a);
            }
        }, 500L);
        PerformanceTracking performanceTracking = getPerformanceTracking();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView()");
        pageLoadTimeTracking(performanceTracking, performanceTrackingScreenName, viewRequireView, this.isInitialLoad, this.isSummoned);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        PtrDisneyContainer ptrDisneyContainer;
        PtrDisneyContainer ptrDisneyContainer2;
        PtrDisneyContainer ptrDisneyContainer3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(VirtualQueueConstants.POSITION_ID_HASH_PARAM, "");
            Intrinsics.checkNotNullExpressionValue(string, "data.getString(VirtualQu…SITION_ID_HASH_PARAM, \"\")");
            this.positionId = string;
            if (string.length() == 0) {
                String activeNetworkConnection = getVqThemer().getActiveNetworkConnection();
                if (activeNetworkConnection == null || activeNetworkConnection.length() == 0) {
                    showNoNetworkMessage();
                } else {
                    showErrorMessage();
                    VqFragmentDetailBinding binding = getBinding();
                    PtrDisneyContainer ptrDisneyContainer4 = binding != null ? binding.pullToRefreshContainer : null;
                    if (ptrDisneyContainer4 != null) {
                        ptrDisneyContainer4.setVisibility(8);
                    }
                }
                VqFragmentDetailBinding binding2 = getBinding();
                PtrDisneyContainer ptrDisneyContainer5 = binding2 != null ? binding2.pullToRefreshContainer : null;
                if (ptrDisneyContainer5 != null) {
                    ptrDisneyContainer5.setVisibility(8);
                }
            }
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        PtrMyQueuesHeader ptrMyQueuesHeader = new PtrMyQueuesHeader(contextRequireContext);
        this.headerView = ptrMyQueuesHeader;
        ptrMyQueuesHeader.setVqThemer(getVqThemer());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        LottieLoader lottieLoader = new LottieLoader(fragmentActivityRequireActivity, getVqThemer());
        PtrMyQueuesHeader ptrMyQueuesHeader2 = this.headerView;
        if (ptrMyQueuesHeader2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
            ptrMyQueuesHeader2 = null;
        }
        lottieLoader.setLoaderAnimationUrl(ptrMyQueuesHeader2.getPtrLoader());
        VqFragmentDetailBinding binding3 = getBinding();
        if (binding3 != null && (ptrDisneyContainer3 = binding3.pullToRefreshContainer) != null) {
            PtrMyQueuesHeader ptrMyQueuesHeader3 = this.headerView;
            if (ptrMyQueuesHeader3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
                ptrMyQueuesHeader3 = null;
            }
            ptrDisneyContainer3.m64011f(ptrMyQueuesHeader3);
        }
        VqFragmentDetailBinding binding4 = getBinding();
        PtrDisneyContainer ptrDisneyContainer6 = binding4 != null ? binding4.pullToRefreshContainer : null;
        if (ptrDisneyContainer6 != null) {
            PtrMyQueuesHeader ptrMyQueuesHeader4 = this.headerView;
            if (ptrMyQueuesHeader4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
                ptrMyQueuesHeader4 = null;
            }
            ptrDisneyContainer6.setHeaderView(ptrMyQueuesHeader4);
        }
        VqFragmentDetailBinding binding5 = getBinding();
        if (binding5 != null && (ptrDisneyContainer2 = binding5.pullToRefreshContainer) != null) {
            ptrDisneyContainer2.setEnablePtr(true);
        }
        VqFragmentDetailBinding binding6 = getBinding();
        if (binding6 != null && (ptrDisneyContainer = binding6.pullToRefreshContainer) != null) {
            ptrDisneyContainer.setPtrHandler(new InterfaceC29611b() { // from class: com.disney.wdpro.virtualqueue.core.fragments.DetailFragment.onViewCreated.2
                @Override // p708ko.InterfaceC29611b
                public /* bridge */ /* synthetic */ boolean checkCanDoRefresh(PtrBaseContainer ptrBaseContainer, View view2, View view3) {
                    return super.checkCanDoRefresh(ptrBaseContainer, view2, view3);
                }

                @Override // p708ko.InterfaceC29611b
                public void onRefreshBegin(PtrBaseContainer frame) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    if (!DetailFragment.this.isInitialLoad) {
                        DetailFragment.this.getVirtualQueueAnalytics().trackDetailRefresh();
                    }
                    VqFragmentDetailBinding binding7 = DetailFragment.this.getBinding();
                    PtrDisneyContainer ptrDisneyContainer7 = binding7 != null ? binding7.pullToRefreshContainer : null;
                    if (ptrDisneyContainer7 != null) {
                        ptrDisneyContainer7.setEnabled(false);
                    }
                    DetailFragment.this.startLoading();
                }

                @Override // p708ko.InterfaceC29611b
                public void onRefreshFinish() {
                    if (CommonExtensionsKt.isSafe(DetailFragment.this)) {
                        VqFragmentDetailBinding binding7 = DetailFragment.this.getBinding();
                        PtrDisneyContainer ptrDisneyContainer7 = binding7 != null ? binding7.pullToRefreshContainer : null;
                        if (ptrDisneyContainer7 != null) {
                            ptrDisneyContainer7.setEnabled(true);
                        }
                        DetailFragment.this.isInitialLoad = false;
                        if ((DetailFragment.this.isSummoned ? this : null) != null) {
                            DetailFragment detailFragment = DetailFragment.this;
                            PerformanceTracking performanceTracking = detailFragment.getPerformanceTracking();
                            PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.DETAIL_SCREEN;
                            View viewRequireView = detailFragment.requireView();
                            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView()");
                            detailFragment.pageLoadTimeTracking(performanceTracking, performanceTrackingScreenName, viewRequireView, detailFragment.isInitialLoad, detailFragment.isSummoned);
                        }
                    }
                }
            });
        }
        QueuesPositionsAdapter queuesPositionsAdapterCreate = getQueuesPositionsAdapterFactory().create(this, this, this, getVqThemer(), VQPageType.DETAIL);
        this.adapter = queuesPositionsAdapterCreate;
        if (queuesPositionsAdapterCreate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            queuesPositionsAdapterCreate = null;
        }
        queuesPositionsAdapterCreate.addDelegates();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        VqFragmentDetailBinding binding7 = getBinding();
        RecyclerView recyclerView = binding7 != null ? binding7.queueList : null;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        VqFragmentDetailBinding binding8 = getBinding();
        RecyclerView recyclerView2 = binding8 != null ? binding8.queueList : null;
        if (recyclerView2 != null) {
            QueuesPositionsAdapter queuesPositionsAdapter = this.adapter;
            if (queuesPositionsAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                queuesPositionsAdapter = null;
            }
            recyclerView2.setAdapter(queuesPositionsAdapter);
        }
        getSharedPreferences().edit().putBoolean("vqHasRemovedGuests", false).apply();
        C30113j.m92948d(C3816t.m20245a(this), null, null, new C215563(null), 3, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnableBluetooth() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnableLocation() {
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void requestEnablePushNotifications() {
    }

    public final void setEventAttributes(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.eventAttributes = map;
    }

    public final void setLoggedInUser(LoggedInUser loggedInUser) {
        Intrinsics.checkNotNullParameter(loggedInUser, "<set-?>");
        this.loggedInUser = loggedInUser;
    }

    public final void setNavigationEntriesProvider(VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        Intrinsics.checkNotNullParameter(virtualQueueNavigationEntriesProvider, "<set-?>");
        this.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
    }

    public final void setPeekViewActions(PeekViewActions peekViewActions) {
        Intrinsics.checkNotNullParameter(peekViewActions, "<set-?>");
        this.peekViewActions = peekViewActions;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setQueuesPositionsAdapterFactory(QueuesPositionsAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.queuesPositionsAdapterFactory = factory;
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

    public final void setVqAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.vqAnalytics = virtualQueueAnalytics;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void showDirections(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getVirtualQueueAnalytics().trackDetailDirections(this.positionsResponse);
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
        this.triedRemovingGuests = true;
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
        getVirtualQueueAnalytics().trackDetailRedeem(this.positionsResponse);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions activityActions = getActivityActions();
        RedeemFragment.Companion companion = RedeemFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        activityActions.navigateTo(companion.navigationEntry(fragmentActivityRequireActivity, position, guests, queue));
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.PositionActions
    public void startJoinFlow(boolean fromMainButton) {
    }

    public final void triggerPeekView() {
        String userSwid = ((VirtualQueueBaseFragment) this).authenticationManager.getUserSwid();
        if (userSwid == null) {
            userSwid = "";
        }
        showPeekView(this.loggedUser, "swid:" + userSwid, VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CommonPeekViewInstructionalText, null, false, 6, null));
    }
}