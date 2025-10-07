package com.disney.wdpro.virtualqueue.core.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC3830y;
import androidx.view.C3816t;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrBaseContainer;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueBaseFragment;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueFoundationActivity;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import com.disney.wdpro.virtualqueue.core.interfaces.FragmentActions;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectHubActions;
import com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions;
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
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CategoryData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.FilterData;
import com.disney.wdpro.virtualqueue.databinding.VqFragmentSelectQueueBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SingleLiveEvent;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.p462ui.my_queues.PtrMyQueuesHeader;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueMainAdapter;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueParkButton;
import com.disney.wdpro.virtualqueue.p462ui.sticky_headers.StickyHeadersItemDecoration;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.Hub;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.snap.camerakit.internal.h76;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
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

@Metadata(m92037d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ¾\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002¾\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\bJ/\u0010(\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\bJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\bJ\u0017\u00100\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\t2\u0006\u00102\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\u0006\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010z\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R#\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001R!\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010£\u0001R\u0019\u0010¥\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u0019\u0010¨\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010¦\u0001R\u0019\u0010©\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u009b\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¦\u0001R\u0019\u0010«\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¦\u0001R!\u0010±\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R7\u0010´\u0001\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030³\u00010²\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001¨\u0006¿\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment;", "Lcom/disney/wdpro/virtualqueue/core/VirtualQueueBaseFragment;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectQueueActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/SelectHubActions;", "Lcom/disney/wdpro/virtualqueue/core/interfaces/FragmentActions;", "Lda/a;", "Lkotlinx/coroutines/h0;", "<init>", "()V", "", "setupParkSelection", "showMyQueues", "displayPeekView", "observeViewModel", "getPositions", "showGenericErrorMessage", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onActivityCreated", "onResume", "onDestroy", "", "isAnonymous", VirtualQueueConstants.SELECT_GUEST_IN_PARTY, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "", "facilityId", "showCreateParty", "(ZZLcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "showReviewDetails", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "onBackPressed", "()Z", "showRequestEnableLocation", "triggerPeekView", "showFinderDetails", "(Ljava/lang/String;)V", "url", "park", "showHyperlink", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "hub", "showHubQueues", "(Lcom/disney/wdpro/virtualqueue/service/model/Hub;)V", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "getVqRegions", "()Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "setVqRegions", "(Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "picassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "getPicassoUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "setPicassoUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "vqAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVqAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVqAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "navigationEntriesProvider", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "getNavigationEntriesProvider", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;", "setNavigationEntriesProvider", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueNavigationEntriesProvider;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Landroid/graphics/Point;", "screenSize", "Landroid/graphics/Point;", "getScreenSize", "()Landroid/graphics/Point;", "setScreenSize", "(Landroid/graphics/Point;)V", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "selectQueueMainAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "getSelectQueueMainAdapterFactory", "()Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;", "setSelectQueueMainAdapterFactory", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter$Factory;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentSelectQueueBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentSelectQueueBinding;", "binding", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter;", "adapter", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter;", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "ptrHeaderView", "Lcom/disney/wdpro/virtualqueue/ui/my_queues/PtrMyQueuesHeader;", "isInitialLoad", "Z", "isLinkedFromMyQueues", "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;", APIConstants.UrlParams.FILTERS, "Ljava/util/List;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "firstPark", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "selectedPark", "selectedParkTab", "Ljava/lang/String;", APIConstants.JsonKeys.PRIMARY_GUEST, "peekViewQueueId", "didClickIcon", "linkedGuestId", "loggedUser", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel$delegate", "Lkotlin/Lazy;", "getPartyViewModel", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "partyViewModel", "", "", "eventAttributes", "Ljava/util/Map;", "getEventAttributes", "()Ljava/util/Map;", "setEventAttributes", "(Ljava/util/Map;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSelectQueueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n766#2:556\n857#2,2:557\n1#3:559\n*S KotlinDebug\n*F\n+ 1 SelectQueueFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment\n*L\n153#1:556\n153#1:557,2\n*E\n"})
/* loaded from: classes20.dex */
public final class SelectQueueFragment extends VirtualQueueBaseFragment implements SelectQueueActions, SelectHubActions, FragmentActions, InterfaceC27132a, InterfaceC30065h0 {
    private SelectQueueMainAdapter adapter;
    private boolean didClickIcon;

    @Inject
    public FacilityUtils facilityUtils;
    private List<FilterData> filters;
    private SelectQueueParkButton firstPark;
    private boolean isLinkedFromMyQueues;

    @Inject
    public VirtualQueueNavigationEntriesProvider navigationEntriesProvider;

    @Inject
    public C9314j parkAppConfiguration;

    @Inject
    public PerformanceTracking performanceTracking;

    @Inject
    public PicassoUtils picassoUtils;
    private PtrMyQueuesHeader ptrHeaderView;

    @Inject
    @Named("ScreenSize")
    public Point screenSize;

    @Inject
    public SelectQueueMainAdapter.Factory selectQueueMainAdapterFactory;
    private SelectQueueParkButton selectedPark;

    @Inject
    public SharedPreferences sharedPreferences;

    @Inject
    public C3821v0.c viewModelFactory;

    @Inject
    public VirtualQueueManager virtualQueueManager;

    @Inject
    public VirtualQueueAnalytics vqAnalytics;

    @Inject
    public VirtualQueueRegions vqRegions;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SelectQueueFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqFragmentSelectQueueBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0 = C30069i0.m92781b();

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, SelectQueueFragment$binding$2.INSTANCE);
    private boolean isInitialLoad = true;
    private String selectedParkTab = "";
    private String primaryGuest = "";
    private String peekViewQueueId = "";
    private String linkedGuestId = "";
    private String loggedUser = "";

    /* renamed from: partyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy partyViewModel = LazyKt.lazy(new Function0<PartyViewModel>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment$partyViewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PartyViewModel invoke() {
            return (PartyViewModel) C3827w0.m20290f(this.this$0.requireActivity(), this.this$0.getViewModelFactory()).m20262a(PartyViewModel.class);
        }
    });
    private Map<String, Object> eventAttributes = new LinkedHashMap();

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment;", "data", "Landroid/os/Bundle;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SelectQueueFragment newInstance(Bundle data) {
            SelectQueueFragment selectQueueFragment = new SelectQueueFragment();
            selectQueueFragment.setArguments(data);
            return selectQueueFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment$getPositions$1", m92053f = "SelectQueueFragment.kt", m92054i = {}, m92055l = {h76.ARES_FEATURE_EXIT_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    @SourceDebugExtension({"SMAP\nSelectQueueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectQueueFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment$getPositions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,555:1\n288#2,2:556\n*S KotlinDebug\n*F\n+ 1 SelectQueueFragment.kt\ncom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment$getPositions$1\n*L\n499#1:556,2\n*E\n"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment$getPositions$1 */
    static final class C215931 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C215931(Continuation<? super C215931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SelectQueueFragment.this.new C215931(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<LinkedGuest> guests;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = SelectQueueFragment.this.getVirtualQueueManager();
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
            GetPositionsResponse payload = ((GetPositionsEvent) obj).getPayload();
            SelectQueueFragment selectQueueFragment = SelectQueueFragment.this;
            String string = null;
            if (payload != null && (guests = payload.getGuests()) != null) {
                Iterator<T> it = guests.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((LinkedGuest) next).getIsPrimaryGuest()) {
                        break;
                    }
                }
                LinkedGuest linkedGuest = (LinkedGuest) next;
                if (linkedGuest != null) {
                    string = SelectQueueFragment.this.getString(C21487R.string.vq_txt_common_name_first_last, linkedGuest.getFirstName(), linkedGuest.getLastName());
                }
            }
            if (string == null) {
                string = "";
            }
            selectQueueFragment.primaryGuest = string;
            SelectQueueFragment.this.displayPeekView();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215931) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment$observeViewModel$1", m92053f = "SelectQueueFragment.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment$observeViewModel$1 */
    static final class C215941 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215941(Continuation<? super C215941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215941 c215941 = SelectQueueFragment.this.new C215941(continuation);
            c215941.L$0 = obj;
            return c215941;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final InterfaceC30065h0 interfaceC30065h0 = (InterfaceC30065h0) this.L$0;
            SingleLiveEvent<PartyViewModel.UiState> state = SelectQueueFragment.this.getPartyViewModel().getState();
            final SelectQueueFragment selectQueueFragment = SelectQueueFragment.this;
            state.observe(selectQueueFragment, new SelectQueueFragment$sam$androidx_lifecycle_Observer$0(new Function1<PartyViewModel.UiState, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.observeViewModel.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    String str;
                    PtrDisneyContainer ptrDisneyContainer;
                    PtrDisneyContainer ptrDisneyContainer2;
                    RecyclerView recyclerView;
                    String queueId;
                    SelectQueueMainAdapter selectQueueMainAdapter;
                    PtrDisneyContainer ptrDisneyContainer3;
                    String guestId;
                    Object next;
                    PtrDisneyContainer ptrDisneyContainer4;
                    Intrinsics.checkNotNullParameter(it, "it");
                    SelectQueueMainAdapter selectQueueMainAdapter2 = null;
                    if (it instanceof PartyViewModel.UiState.Error) {
                        VqFragmentSelectQueueBinding binding = selectQueueFragment.getBinding();
                        if (binding != null && (ptrDisneyContainer4 = binding.pullToRefreshContainer) != null) {
                            ptrDisneyContainer4.m64009G();
                        }
                        selectQueueFragment.showGenericErrorMessage();
                        SelectQueueMainAdapter selectQueueMainAdapter3 = selectQueueFragment.adapter;
                        if (selectQueueMainAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            selectQueueMainAdapter2 = selectQueueMainAdapter3;
                        }
                        selectQueueMainAdapter2.setEmptyParkView(true);
                        return;
                    }
                    str = "";
                    if (it instanceof PartyViewModel.UiState.QueueOpen) {
                        SelectQueueFragment selectQueueFragment2 = selectQueueFragment;
                        PartyViewModel.UiState.QueueOpen queueOpen = (PartyViewModel.UiState.QueueOpen) it;
                        LinkedGuest linkedGuest = (LinkedGuest) CollectionsKt.firstOrNull((List) queueOpen.getAllGuests());
                        if (linkedGuest == null || (guestId = linkedGuest.getGuestId()) == null) {
                            guestId = "";
                        }
                        selectQueueFragment2.linkedGuestId = guestId;
                        SelectQueueFragment selectQueueFragment3 = selectQueueFragment;
                        Iterator<T> it2 = queueOpen.getAllGuests().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((LinkedGuest) next).getIsPrimaryGuest()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LinkedGuest linkedGuest2 = (LinkedGuest) next;
                        String string = linkedGuest2 != null ? selectQueueFragment.getString(C21487R.string.vq_txt_common_name_first_last, linkedGuest2.getFirstName(), linkedGuest2.getLastName()) : null;
                        selectQueueFragment3.primaryGuest = string != null ? string : "";
                        if (selectQueueFragment.didClickIcon) {
                            selectQueueFragment.displayPeekView();
                            selectQueueFragment.didClickIcon = false;
                            return;
                        }
                        return;
                    }
                    if (!(it instanceof PartyViewModel.UiState.LoadQueuesSucceed)) {
                        if (it instanceof PartyViewModel.UiState.SelectParkItem) {
                            SelectQueueParkButton selectQueueParkButton = selectQueueFragment.selectedPark;
                            if (selectQueueParkButton != null) {
                                selectQueueParkButton.setParkSelected(false);
                            }
                            PartyViewModel.UiState.SelectParkItem selectParkItem = (PartyViewModel.UiState.SelectParkItem) it;
                            selectQueueFragment.selectedPark = selectParkItem.getParkItem();
                            SelectQueueParkButton selectQueueParkButton2 = selectQueueFragment.selectedPark;
                            if (selectQueueParkButton2 != null) {
                                selectQueueParkButton2.setParkSelected(true);
                            }
                            selectQueueFragment.selectedParkTab = String.valueOf(selectParkItem.getParkItem().getData().getFilter().getTitle());
                            selectQueueFragment.getVqAnalytics().trackSelectQueueParkTab(selectQueueFragment.selectedParkTab);
                            return;
                        }
                        if (it instanceof PartyViewModel.UiState.LoadingQueue) {
                            VqFragmentSelectQueueBinding binding2 = selectQueueFragment.getBinding();
                            if (binding2 == null || (ptrDisneyContainer2 = binding2.pullToRefreshContainer) == null) {
                                return;
                            }
                            ptrDisneyContainer2.m64010J();
                            return;
                        }
                        if (it instanceof PartyViewModel.UiState.EmptyParks) {
                            SelectQueueMainAdapter selectQueueMainAdapter4 = selectQueueFragment.adapter;
                            if (selectQueueMainAdapter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                selectQueueMainAdapter4 = null;
                            }
                            SelectQueueMainAdapter.setEmptyParkView$default(selectQueueMainAdapter4, false, 1, null);
                            return;
                        }
                        if (it instanceof PartyViewModel.UiState.NoActiveNetwork) {
                            VqFragmentSelectQueueBinding binding3 = selectQueueFragment.getBinding();
                            if (binding3 != null && (ptrDisneyContainer = binding3.pullToRefreshContainer) != null) {
                                ptrDisneyContainer.m64009G();
                            }
                            selectQueueFragment.showNoNetworkMessage();
                            return;
                        }
                        return;
                    }
                    selectQueueFragment.dismissErrorBanner();
                    VqFragmentSelectQueueBinding binding4 = selectQueueFragment.getBinding();
                    if (binding4 != null && (ptrDisneyContainer3 = binding4.pullToRefreshContainer) != null) {
                        ptrDisneyContainer3.m64009G();
                    }
                    VirtualQueueThemer vqThemer = selectQueueFragment.getVqThemer();
                    PartyViewModel.UiState.LoadQueuesSucceed loadQueuesSucceed = (PartyViewModel.UiState.LoadQueuesSucceed) it;
                    List<Queue> queuesLoaded = loadQueuesSucceed.getQueuesLoaded();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(queuesLoaded, 10));
                    Iterator<T> it3 = queuesLoaded.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((Queue) it3.next()).getContentId());
                    }
                    vqThemer.refreshDocuments(arrayList);
                    SelectQueueParkButton selectQueueParkButton3 = selectQueueFragment.selectedPark;
                    if (selectQueueParkButton3 != null) {
                        SelectQueueFragment selectQueueFragment4 = selectQueueFragment;
                        InterfaceC30065h0 interfaceC30065h02 = interfaceC30065h0;
                        List<Queue> queuesLoaded2 = loadQueuesSucceed.getQueuesLoaded();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : queuesLoaded2) {
                            if (Intrinsics.areEqual(((Queue) obj2).getTabContentId(), selectQueueParkButton3.getData().getFilter().getTabContentId())) {
                                arrayList2.add(obj2);
                            }
                        }
                        loadQueuesSucceed.setQueuesLoaded(arrayList2);
                        List<Hub> hubsLoaded = loadQueuesSucceed.getHubsLoaded();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : hubsLoaded) {
                            if (Intrinsics.areEqual(((Hub) obj3).getTabContentId(), selectQueueParkButton3.getData().getFilter().getTabContentId())) {
                                arrayList3.add(obj3);
                            }
                        }
                        loadQueuesSucceed.setHubsLoaded(arrayList3);
                        FilterData filter = selectQueueParkButton3.getData().getFilter();
                        SelectQueueMainAdapter selectQueueMainAdapter5 = selectQueueFragment4.adapter;
                        if (selectQueueMainAdapter5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            selectQueueMainAdapter = null;
                        } else {
                            selectQueueMainAdapter = selectQueueMainAdapter5;
                        }
                        List<CategoryData> categories = filter.getCategories();
                        List<CategoryData> hubCategoryKey = filter.getHubCategoryKey();
                        selectQueueMainAdapter.setCategories(categories, hubCategoryKey != null ? CollectionsKt.toMutableList((Collection) hubCategoryKey) : null, loadQueuesSucceed.getQueuesLoaded(), loadQueuesSucceed.getHubsLoaded(), null, loadQueuesSucceed.getShowCastAssistanceCode());
                        VirtualQueueAnalytics vqAnalytics = selectQueueFragment4.getVqAnalytics();
                        String simpleName = interfaceC30065h02.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
                        vqAnalytics.trackSelectQueuesLoad(simpleName, loadQueuesSucceed.getQueuesLoaded(), selectQueueParkButton3.getData().getFilter().getTitle(), loadQueuesSucceed.getHubsLoaded());
                    }
                    SelectQueueFragment selectQueueFragment5 = selectQueueFragment;
                    Queue queue = (Queue) CollectionsKt.firstOrNull((List) loadQueuesSucceed.getQueuesLoaded());
                    if (queue != null && (queueId = queue.getQueueId()) != null) {
                        str = queueId;
                    }
                    selectQueueFragment5.peekViewQueueId = str;
                    VQResponseEvent vQResponseEvent = new VQResponseEvent();
                    vQResponseEvent.setHeaders(loadQueuesSucceed.getEvent().getHeaders());
                    String headerValue = vQResponseEvent.getHeaderValue(VQResponseHeaderAttribute.CORRELATION_ID);
                    VqFragmentSelectQueueBinding binding5 = selectQueueFragment.getBinding();
                    if (binding5 == null || (recyclerView = binding5.queueList) == null) {
                        return;
                    }
                    SelectQueueFragment selectQueueFragment6 = selectQueueFragment;
                    PerformanceTracking.logLoadTime$default(selectQueueFragment6.getPerformanceTracking(), PerformanceTrackingScreenName.SELECT_QUEUE_SCREEN, recyclerView, headerValue, selectQueueFragment6.isInitialLoad, false, 16, null);
                }
            }));
            AbstractC3830y<String> loggedUserLiveData = SelectQueueFragment.this.getPartyViewModel().getLoggedUserLiveData();
            final SelectQueueFragment selectQueueFragment2 = SelectQueueFragment.this;
            loggedUserLiveData.observe(selectQueueFragment2, new SelectQueueFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.observeViewModel.1.2
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
                    SelectQueueFragment selectQueueFragment3 = selectQueueFragment2;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    selectQueueFragment3.loggedUser = it;
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C215941) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayPeekView() {
        this.didClickIcon = false;
        getPartyViewModel().virtualQueueAppType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VqFragmentSelectQueueBinding getBinding() {
        return (VqFragmentSelectQueueBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PartyViewModel getPartyViewModel() {
        return (PartyViewModel) this.partyViewModel.getValue();
    }

    private final void getPositions() {
        C30113j.m92948d(this, null, null, new C215931(null), 3, null);
    }

    private final void observeViewModel() {
        C30113j.m92948d(C3816t.m20245a(this), null, null, new C215941(null), 3, null);
        getPartyViewModel().getParkConfigLiveData().observe(this, new SelectQueueFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.observeViewModel.2
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
                String str;
                Intrinsics.checkNotNullParameter(parkType, "parkType");
                VirtualQueueAnalytics vqAnalytics = SelectQueueFragment.this.getVqAnalytics();
                String simpleName = SelectQueueFragment.this.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
                vqAnalytics.trackPeekViewLoad(simpleName, VQPageType.SELECTQUEUE, null, SelectQueueFragment.this.selectedParkTab);
                String str2 = "";
                if (Intrinsics.areEqual(parkType, "DLR")) {
                    String userSwid = ((VirtualQueueBaseFragment) SelectQueueFragment.this).authenticationManager.getUserSwid();
                    if (userSwid != null && !StringsKt.contains$default((CharSequence) userSwid, (CharSequence) "swid", false, 2, (Object) null)) {
                        str2 = "swid:" + userSwid;
                    }
                } else if (Intrinsics.areEqual(parkType, "WDW") && (str = SelectQueueFragment.this.linkedGuestId) != null) {
                    str2 = str;
                }
                String string$default = VirtualQueueThemer.getString$default(SelectQueueFragment.this.getVqThemer(), VQStringType.CommonPeekViewInstructionalText, null, false, 6, null);
                SelectQueueFragment selectQueueFragment = SelectQueueFragment.this;
                selectQueueFragment.showPeekView(selectQueueFragment.loggedUser, str2, string$default);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$8(SelectQueueFragment this$0) {
        PtrDisneyContainer ptrDisneyContainer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VqFragmentSelectQueueBinding binding = this$0.getBinding();
        if (binding == null || (ptrDisneyContainer = binding.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.m64008E(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setupParkSelection() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.setupParkSelection():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupParkSelection$lambda$2(SelectQueueFragment this$0, SelectQueueParkButton parkItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parkItem, "$parkItem");
        this$0.getPartyViewModel().selectParkItem(parkItem);
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            arguments.putString("parkId", parkItem.getData().getFilter().getTabContentId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupParkSelection$lambda$3(ArrayList parkButtons) {
        Intrinsics.checkNotNullParameter(parkButtons, "$parkButtons");
        SelectQueueParkButton.INSTANCE.adjustParkButtonsHeight(parkButtons);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGenericErrorMessage() {
        showErrorBanner(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorMessage, null, false, 6, null), VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.ErrorBannersJoinErrorTitle, null, false, 6, null), new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.showGenericErrorMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
            }
        }, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMyQueues() {
        getVqAnalytics().trackSelectQueuesMyQueues();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        if (getActivity() != null) {
            requireActivity().finish();
        }
        if (!CommonExtensionsKt.isSafe(this) || this.isLinkedFromMyQueues) {
            return;
        }
        ActivityActions activityActions = getActivityActions();
        VirtualQueueFoundationActivity.Companion companion = VirtualQueueFoundationActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        activityActions.navigateTo(new C8666f.b(companion.createIntent(contextRequireContext)).withLoginCheck().build());
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

    public final PerformanceTracking getPerformanceTracking() {
        PerformanceTracking performanceTracking = this.performanceTracking;
        if (performanceTracking != null) {
            return performanceTracking;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceTracking");
        return null;
    }

    public final PicassoUtils getPicassoUtils() {
        PicassoUtils picassoUtils = this.picassoUtils;
        if (picassoUtils != null) {
            return picassoUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("picassoUtils");
        return null;
    }

    public final Point getScreenSize() {
        Point point = this.screenSize;
        if (point != null) {
            return point;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenSize");
        return null;
    }

    public final SelectQueueMainAdapter.Factory getSelectQueueMainAdapterFactory() {
        SelectQueueMainAdapter.Factory factory = this.selectQueueMainAdapterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectQueueMainAdapterFactory");
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

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
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

    public final VirtualQueueRegions getVqRegions() {
        VirtualQueueRegions virtualQueueRegions = this.vqRegions;
        if (virtualQueueRegions != null) {
            return virtualQueueRegions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqRegions");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Button button;
        Button button2;
        super.onActivityCreated(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.isLinkedFromMyQueues = arguments.getBoolean(VirtualQueueConstants.IS_LINKED_FROM_MY_QUEUES);
        }
        View view = getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        VqFragmentSelectQueueBinding binding = getBinding();
        SelectQueueMainAdapter selectQueueMainAdapter = null;
        viewGroup.removeView(binding != null ? binding.myQueues : null);
        VqFragmentSelectQueueBinding binding2 = getBinding();
        if (binding2 != null && (button2 = binding2.myQueues) != null) {
            CommonExtensionsKt.setOnDebouncedClickListener$default(button2, 0, new Function0<Unit>() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.onActivityCreated.2
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
                    SelectQueueFragment.this.showMyQueues();
                }
            }, 1, null);
        }
        VqFragmentSelectQueueBinding binding3 = getBinding();
        Button button3 = binding3 != null ? binding3.myQueues : null;
        if (button3 != null) {
            button3.setText(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.SelectQueueMyStatusCta, null, false, 6, null));
        }
        VqFragmentSelectQueueBinding binding4 = getBinding();
        if (binding4 != null && (button = binding4.myQueues) != null) {
            getActivityActions().addHeaderRightView(button);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(1);
        this.adapter = getSelectQueueMainAdapterFactory().create(this, this, this, getVqThemer(), getPicassoUtils(), getFacilityUtils(), getVqAnalytics(), getVqRegions());
        VqFragmentSelectQueueBinding binding5 = getBinding();
        RecyclerView recyclerView2 = binding5 != null ? binding5.queueList : null;
        if (recyclerView2 != null) {
            SelectQueueMainAdapter selectQueueMainAdapter2 = this.adapter;
            if (selectQueueMainAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                selectQueueMainAdapter2 = null;
            }
            recyclerView2.setAdapter(selectQueueMainAdapter2);
        }
        VqFragmentSelectQueueBinding binding6 = getBinding();
        RecyclerView recyclerView3 = binding6 != null ? binding6.queueList : null;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        VqFragmentSelectQueueBinding binding7 = getBinding();
        if (binding7 != null && (recyclerView = binding7.queueList) != null) {
            SelectQueueMainAdapter selectQueueMainAdapter3 = this.adapter;
            if (selectQueueMainAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                selectQueueMainAdapter = selectQueueMainAdapter3;
            }
            recyclerView.addItemDecoration(new StickyHeadersItemDecoration(selectQueueMainAdapter));
        }
        getVqRegions().startTracking();
    }

    @Override // p498da.InterfaceC27132a
    public boolean onBackPressed() {
        getVqAnalytics().trackSelectQueueBack();
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
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
        return VqFragmentSelectQueueBinding.inflate(inflater, container, false).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C30069i0.m92784e(this, null, 1, null);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Button button;
        super.onResume();
        SelectQueueParkButton selectQueueParkButton = this.selectedPark;
        if (selectQueueParkButton != null) {
            selectQueueParkButton.setParkSelected(true);
        }
        getActivityActions().setTitle(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.SelectQueueTitle, null, false, 6, null), true);
        VqFragmentSelectQueueBinding binding = getBinding();
        if (binding != null && (button = binding.myQueues) != null) {
            getActivityActions().addHeaderRightView(button);
        }
        this.isInitialLoad = true;
        new Handler().postDelayed(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.fragments.l
            @Override // java.lang.Runnable
            public final void run() {
                SelectQueueFragment.onResume$lambda$8(this.f45238a);
            }
        }, 500L);
        PerformanceTracking performanceTracking = getPerformanceTracking();
        PerformanceTrackingScreenName performanceTrackingScreenName = PerformanceTrackingScreenName.SELECT_QUEUE_SCREEN;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.requireView()");
        PerformanceTracking.logLoadTime$default(performanceTracking, performanceTrackingScreenName, viewRequireView, "", this.isInitialLoad, false, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        PtrDisneyContainer ptrDisneyContainer;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.eventAttributes.put(PerformanceTrackingAttribute.LOAD_TIME_SCREEN_NAME.getAttrName(), PerformanceTrackingScreenName.SELECT_QUEUE_SCREEN.getScreenName());
        getPerformanceTracking().logTimedActionStart(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        getPartyViewModel().getLoggedUserFullName();
        setupParkSelection();
        this.isInitialLoad = true;
        VqFragmentSelectQueueBinding binding = getBinding();
        if (binding != null) {
            PtrDisneyContainer ptrDisneyContainer2 = binding.pullToRefreshContainer;
            Intrinsics.checkNotNullExpressionValue(ptrDisneyContainer2, "it.pullToRefreshContainer");
            setupCommonPullToRefresh(ptrDisneyContainer2);
        }
        VqFragmentSelectQueueBinding binding2 = getBinding();
        if (binding2 == null || (ptrDisneyContainer = binding2.pullToRefreshContainer) == null) {
            return;
        }
        ptrDisneyContainer.setPtrHandler(new InterfaceC29611b() { // from class: com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment.onViewCreated.2
            @Override // p708ko.InterfaceC29611b
            public /* bridge */ /* synthetic */ boolean checkCanDoRefresh(PtrBaseContainer ptrBaseContainer, View view2, View view3) {
                return super.checkCanDoRefresh(ptrBaseContainer, view2, view3);
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshBegin(PtrBaseContainer frame) {
                Intrinsics.checkNotNullParameter(frame, "frame");
                if (!SelectQueueFragment.this.isInitialLoad) {
                    SelectQueueFragment.this.getVqAnalytics().trackSelectQueueRefresh();
                }
                VqFragmentSelectQueueBinding binding3 = SelectQueueFragment.this.getBinding();
                PtrDisneyContainer ptrDisneyContainer3 = binding3 != null ? binding3.pullToRefreshContainer : null;
                if (ptrDisneyContainer3 != null) {
                    ptrDisneyContainer3.setEnabled(false);
                }
                SelectQueueFragment.this.getPartyViewModel().loadQueues();
            }

            @Override // p708ko.InterfaceC29611b
            public void onRefreshFinish() {
                if (CommonExtensionsKt.isSafe(SelectQueueFragment.this)) {
                    VqFragmentSelectQueueBinding binding3 = SelectQueueFragment.this.getBinding();
                    PtrDisneyContainer ptrDisneyContainer3 = binding3 != null ? binding3.pullToRefreshContainer : null;
                    if (ptrDisneyContainer3 != null) {
                        ptrDisneyContainer3.setEnabled(true);
                    }
                    SelectQueueFragment.this.isInitialLoad = false;
                }
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

    public final void setNavigationEntriesProvider(VirtualQueueNavigationEntriesProvider virtualQueueNavigationEntriesProvider) {
        Intrinsics.checkNotNullParameter(virtualQueueNavigationEntriesProvider, "<set-?>");
        this.navigationEntriesProvider = virtualQueueNavigationEntriesProvider;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
    }

    public final void setPerformanceTracking(PerformanceTracking performanceTracking) {
        Intrinsics.checkNotNullParameter(performanceTracking, "<set-?>");
        this.performanceTracking = performanceTracking;
    }

    public final void setPicassoUtils(PicassoUtils picassoUtils) {
        Intrinsics.checkNotNullParameter(picassoUtils, "<set-?>");
        this.picassoUtils = picassoUtils;
    }

    public final void setScreenSize(Point point) {
        Intrinsics.checkNotNullParameter(point, "<set-?>");
        this.screenSize = point;
    }

    public final void setSelectQueueMainAdapterFactory(SelectQueueMainAdapter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.selectQueueMainAdapterFactory = factory;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setViewModelFactory(C3821v0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.viewModelFactory = cVar;
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }

    public final void setVqAnalytics(VirtualQueueAnalytics virtualQueueAnalytics) {
        Intrinsics.checkNotNullParameter(virtualQueueAnalytics, "<set-?>");
        this.vqAnalytics = virtualQueueAnalytics;
    }

    public final void setVqRegions(VirtualQueueRegions virtualQueueRegions) {
        Intrinsics.checkNotNullParameter(virtualQueueRegions, "<set-?>");
        this.vqRegions = virtualQueueRegions;
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showCreateParty(boolean isAnonymous, boolean selectGuestInParty, Queue queue, String facilityId) {
        String string;
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getPartyViewModel().clear();
        getVqAnalytics().trackSelectQueuesJoin(queue, facilityId);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        Bundle bundle = new Bundle();
        bundle.putString("queueId", queue.getQueueId());
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("completionDeepLink")) != null) {
            bundle.putString("completionDeepLink", string);
        }
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), CreatePartyFragment.INSTANCE.newInstance(bundle, isAnonymous, false, selectGuestInParty), new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showFinderDetails(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        ActivityActions activityActions = getActivityActions();
        VirtualQueueNavigationEntriesProvider navigationEntriesProvider = getNavigationEntriesProvider();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        activityActions.navigateTo(navigationEntriesProvider.getFinderDetailEntry(contextRequireContext, facilityId, true));
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectHubActions
    public void showHubQueues(Hub hub) {
        String string;
        Intrinsics.checkNotNullParameter(hub, "hub");
        Bundle bundle = new Bundle();
        bundle.putString(VirtualQueueConstants.HUB_ID_PARAM, hub.getId());
        bundle.putParcelable(VirtualQueueConstants.SELECTED_HUB, hub);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("completionDeepLink")) != null) {
            bundle.putString("completionDeepLink", string);
        }
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), HubLandingFragment.INSTANCE.newInstance(bundle), new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showHyperlink(String url, Queue queue, String park) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(park, "park");
        super.showHyperlink(url);
        VirtualQueueAnalytics.trackHyperlinkClick$default(getVqAnalytics(), VQPageType.SELECTQUEUE, queue, park, false, 8, null);
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showRequestEnableLocation() {
        getActivityActions().requestEnableLocation();
    }

    @Override // com.disney.wdpro.virtualqueue.core.interfaces.SelectQueueActions
    public void showReviewDetails(Queue queue, String facilityId) {
        String string;
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        getPartyViewModel().clear();
        getVqAnalytics().trackSelectQueuesJoin(queue, facilityId);
        getPerformanceTracking().logTimedActionEnd(PerformanceTrackingEventName.SCREEN_TIME, this.eventAttributes);
        Bundle bundle = new Bundle();
        bundle.putString("queueId", queue.getQueueId());
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("completionDeepLink")) != null) {
            bundle.putString("completionDeepLink", string);
        }
        ActivityActions.DefaultImpls.navigateTo$default(getActivityActions(), ReviewDetailsFragment.INSTANCE.newInstance(bundle), new SnowballNextFlowAnimation(), false, false, false, 28, null);
    }

    public final void triggerPeekView() {
        this.didClickIcon = true;
        if (!StringsKt.isBlank(this.primaryGuest)) {
            displayPeekView();
        } else if (Intrinsics.areEqual(getParkAppConfiguration().m38908h(), "DLR")) {
            getPositions();
        } else {
            PartyViewModel.getLinkedGuests$default(getPartyViewModel(), this.peekViewQueueId, false, null, 4, null);
        }
    }
}