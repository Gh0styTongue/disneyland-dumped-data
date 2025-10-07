package com.disney.wdpro.virtualqueue.core.viewmodels;

import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import androidx.view.C3819u0;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.facilityui.fragments.detail.FinderDetailFragment;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.event.GetLinkedGuestsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.GetPositionsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.GetQueuesEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.JoinQueueEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.VQResponseEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.VQResponseHeaderAttribute;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SingleLiveEvent;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueParkButton;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetQueuesResponse;
import com.disney.wdpro.virtualqueue.service.model.Hub;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponseStatus;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.service.model.QueueStatus;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.snap.camerakit.internal.h76;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0004\u009b\u0001\u009c\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003JK\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J'\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0003J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\u0003J\u0015\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0004¢\u0006\u0004\b9\u0010\u0003J\r\u0010:\u001a\u00020\u0004¢\u0006\u0004\b:\u0010\u0003J\r\u0010;\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020o0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020v0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000b0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010uR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010qR\u001c\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010qR\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010|R*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010}R*\u0010~\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R*\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010}R,\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@BX\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010}R,\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@BX\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010}R\u001e\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010}R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010}R\u001e\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010}R\u0019\u0010\u0084\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010<R\u001b\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020o0\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020s0r8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020v0\u008c\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u008e\u0001R\u001a\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0r8F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0091\u0001R\u001b\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u008c\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u008e\u0001R\u001d\u0010\u009a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u008c\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u008e\u0001¨\u0006\u009d\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel;", "Landroidx/lifecycle/t0;", "<init>", "()V", "", "updateSelectedGuests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "newQueue", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "newAllGuests", "", "newPlanningPartyIds", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "newConflicts", "", "forceRefresh", "setupParty", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "updateQueue", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "setupNewParty", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", VirtualQueueConstants.QUEUE_PARAM, "allGuests", "conflicts", "setupAnonParty", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/util/List;Ljava/util/List;)V", "mergeParty", "queueId", "isDeepLinkedFlow", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;", "requestType", "getLinkedGuests", "(Ljava/lang/String;ZLcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;)V", "showClosedQueueMessage", "getLoggedUserFullName", "virtualQueueAppType", "Lcom/disney/wdpro/facility/model/Facility;", FinderDetailFragment.FACILITY_PARAM, "setupQueueParkName", "(Lcom/disney/wdpro/facility/model/Facility;)V", "updatedSelectedIds", "modifyParty", "(Ljava/util/List;)V", "guestIds", "onJoinQueue", "(Ljava/lang/String;Ljava/util/List;)V", "", "partySize", "onJoinAnonymousQueue", "(Ljava/lang/String;I)V", "clear", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "parkItem", "selectParkItem", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;)V", "loadQueues", "getQueuePosition", "shouldReloadLinkedTickets", "()Z", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "getFacilityUtils", "()Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "setFacilityUtils", "(Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "virtualQueueAnalytics", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "getVirtualQueueAnalytics", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "setVirtualQueueAnalytics", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;)V", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "performanceTracking", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "getPerformanceTracking", "()Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "setPerformanceTracking", "(Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;)V", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/commons/j;", "getParkAppConfiguration", "()Lcom/disney/wdpro/commons/j;", "setParkAppConfiguration", "(Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "loggedInUser", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "getLoggedInUser", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "setLoggedInUser", "(Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;)V", "Landroidx/lifecycle/c0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "_getPositionEvent", "Landroidx/lifecycle/c0;", "Lcom/disney/wdpro/virtualqueue/ui/common/SingleLiveEvent;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "_state", "Lcom/disney/wdpro/virtualqueue/ui/common/SingleLiveEvent;", "Lcom/disney/wdpro/virtualqueue/service/model/QueueGuestIdMode;", "_queueType", "_parkConfigLiveData", "_loggedUserLiveData", "_parkNameLiveData", "<set-?>", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "Ljava/util/List;", "selectedGuests", "unselectedGuests", "conflictedGuests", "ineligiblePartyGuests", "planningPartyIds", "conflictedIds", "correlationId", "Ljava/lang/String;", "queuesLoading", "Z", "conflictOccurred", "shouldRefreshUI", "currentQueueId", "isOnboardedParty", "Landroidx/lifecycle/y;", "getGetPositionEvent", "()Landroidx/lifecycle/y;", "getPositionEvent", "getState", "()Lcom/disney/wdpro/virtualqueue/ui/common/SingleLiveEvent;", "state", "getQueueType", "queueType", "getParkConfigLiveData", "parkConfigLiveData", "getLoggedUserLiveData", "loggedUserLiveData", "getParkNameLiveData", "parkNameLiveData", "ErrorType", "UiState", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPartyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyViewModel.kt\ncom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,495:1\n766#2:496\n857#2,2:497\n766#2:499\n857#2,2:500\n1360#2:502\n1446#2,5:503\n766#2:508\n857#2,2:509\n766#2:511\n857#2,2:512\n766#2:514\n857#2,2:515\n766#2:517\n857#2,2:518\n1549#2:520\n1620#2,3:521\n1549#2:524\n1620#2,3:525\n1549#2:528\n1620#2,3:529\n766#2:532\n857#2,2:533\n1549#2:535\n1620#2,3:536\n1360#2:539\n1446#2,5:540\n1855#2,2:545\n1855#2,2:547\n766#2:549\n857#2,2:550\n1360#2:552\n1446#2,5:553\n766#2:558\n857#2,2:559\n766#2:561\n857#2,2:562\n766#2:564\n857#2,2:565\n766#2:567\n857#2,2:568\n*S KotlinDebug\n*F\n+ 1 PartyViewModel.kt\ncom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel\n*L\n252#1:496\n252#1:497,2\n255#1:499\n255#1:500,2\n357#1:502\n357#1:503,5\n361#1:508\n361#1:509,2\n364#1:511\n364#1:512,2\n367#1:514\n367#1:515,2\n370#1:517\n370#1:518,2\n391#1:520\n391#1:521,3\n392#1:524\n392#1:525,3\n394#1:528\n394#1:529,3\n395#1:532\n395#1:533,2\n395#1:535\n395#1:536,3\n396#1:539\n396#1:540,5\n405#1:545,2\n414#1:547,2\n421#1:549\n421#1:550,2\n430#1:552\n430#1:553,5\n434#1:558\n434#1:559,2\n437#1:561\n437#1:562,2\n440#1:564\n440#1:565,2\n443#1:567\n443#1:568,2\n*E\n"})
/* loaded from: classes20.dex */
public final class PartyViewModel extends AbstractC3817t0 {
    public static final int $stable = 8;
    private boolean conflictOccurred;

    @Inject
    public FacilityUtils facilityUtils;

    @Inject
    public LoggedInUser loggedInUser;

    @Inject
    public C9314j parkAppConfiguration;

    @Inject
    public PerformanceTracking performanceTracking;
    private boolean queuesLoading;
    private boolean shouldRefreshUI;

    @Inject
    public VirtualQueueAnalytics virtualQueueAnalytics;

    @Inject
    public VirtualQueueManager virtualQueueManager;

    @Inject
    public VirtualQueueThemer vqThemer;
    private final C3783c0<GetPositionsEvent> _getPositionEvent = new C3783c0<>();
    private final SingleLiveEvent<UiState> _state = new SingleLiveEvent<>();
    private final SingleLiveEvent<QueueGuestIdMode> _queueType = new SingleLiveEvent<>();
    private final SingleLiveEvent<String> _parkConfigLiveData = new SingleLiveEvent<>();
    private final C3783c0<String> _loggedUserLiveData = new C3783c0<>();
    private final C3783c0<String> _parkNameLiveData = new C3783c0<>();
    private Queue queue = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
    private List<LinkedGuest> allGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> selectedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> unselectedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> conflictedGuests = CollectionsKt.emptyList();
    private List<LinkedGuest> ineligiblePartyGuests = CollectionsKt.emptyList();
    private List<String> planningPartyIds = CollectionsKt.emptyList();
    private List<Conflict> conflicts = CollectionsKt.emptyList();
    private List<String> conflictedIds = CollectionsKt.emptyList();
    private String correlationId = "";
    private String currentQueueId = "";

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;", "", "(Ljava/lang/String;I)V", "QUEUE_CLOSED", "TRY_AGAIN", "MAX_PARTY", "GENERIC", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum ErrorType {
        QUEUE_CLOSED,
        TRY_AGAIN,
        MAX_PARTY,
        GENERIC
    }

    @Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "", "()V", "EmptyParks", "Error", "JoinError", "JoinQueue", "LoadQueuesSucceed", "LoadingQueue", "NoActiveNetwork", "QueueOpen", "SelectParkItem", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$EmptyParks;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$Error;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$JoinError;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$JoinQueue;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$LoadQueuesSucceed;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$LoadingQueue;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$NoActiveNetwork;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$QueueOpen;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$SelectParkItem;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static abstract class UiState {
        public static final int $stable = 0;

        @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$EmptyParks;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "()V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class EmptyParks extends UiState {
            public static final int $stable = 0;
            public static final EmptyParks INSTANCE = new EmptyParks();

            private EmptyParks() {
                super(null);
            }
        }

        @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$Error;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "errorType", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;", "(Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;)V", "getErrorType", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Error extends UiState {
            public static final int $stable = 0;
            private final ErrorType errorType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(ErrorType errorType) {
                super(null);
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                this.errorType = errorType;
            }

            public static /* synthetic */ Error copy$default(Error error, ErrorType errorType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    errorType = error.errorType;
                }
                return error.copy(errorType);
            }

            /* renamed from: component1, reason: from getter */
            public final ErrorType getErrorType() {
                return this.errorType;
            }

            public final Error copy(ErrorType errorType) {
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                return new Error(errorType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.errorType == ((Error) other).errorType;
            }

            public final ErrorType getErrorType() {
                return this.errorType;
            }

            public int hashCode() {
                return this.errorType.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.errorType + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$JoinError;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "errorResponse", "Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "(Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;)V", "getErrorResponse", "()Lcom/disney/wdpro/virtualqueue/service/model/JoinQueueErrorResponse;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class JoinError extends UiState {
            public static final int $stable = 8;
            private final JoinQueueErrorResponse errorResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JoinError(JoinQueueErrorResponse errorResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                this.errorResponse = errorResponse;
            }

            public static /* synthetic */ JoinError copy$default(JoinError joinError, JoinQueueErrorResponse joinQueueErrorResponse, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    joinQueueErrorResponse = joinError.errorResponse;
                }
                return joinError.copy(joinQueueErrorResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final JoinQueueErrorResponse getErrorResponse() {
                return this.errorResponse;
            }

            public final JoinError copy(JoinQueueErrorResponse errorResponse) {
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                return new JoinError(errorResponse);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof JoinError) && Intrinsics.areEqual(this.errorResponse, ((JoinError) other).errorResponse);
            }

            public final JoinQueueErrorResponse getErrorResponse() {
                return this.errorResponse;
            }

            public int hashCode() {
                return this.errorResponse.hashCode();
            }

            public String toString() {
                return "JoinError(errorResponse=" + this.errorResponse + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$JoinQueue;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "response", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "getResponse", "()Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class JoinQueue extends UiState {
            public static final int $stable = 8;
            private final GetPositionsResponse response;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JoinQueue(GetPositionsResponse response) {
                super(null);
                Intrinsics.checkNotNullParameter(response, "response");
                this.response = response;
            }

            public static /* synthetic */ JoinQueue copy$default(JoinQueue joinQueue, GetPositionsResponse getPositionsResponse, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    getPositionsResponse = joinQueue.response;
                }
                return joinQueue.copy(getPositionsResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final GetPositionsResponse getResponse() {
                return this.response;
            }

            public final JoinQueue copy(GetPositionsResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new JoinQueue(response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof JoinQueue) && Intrinsics.areEqual(this.response, ((JoinQueue) other).response);
            }

            public final GetPositionsResponse getResponse() {
                return this.response;
            }

            public int hashCode() {
                return this.response.hashCode();
            }

            public String toString() {
                return "JoinQueue(response=" + this.response + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$LoadQueuesSucceed;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "queuesLoaded", "", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "hubsLoaded", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "event", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;", "showCastAssistanceCode", "", "(Ljava/util/List;Ljava/util/List;Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;Z)V", "getEvent", "()Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;", "getHubsLoaded", "()Ljava/util/List;", "setHubsLoaded", "(Ljava/util/List;)V", "getQueuesLoaded", "setQueuesLoaded", "getShowCastAssistanceCode", "()Z", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class LoadQueuesSucceed extends UiState {
            public static final int $stable = 8;
            private final GetQueuesEvent event;
            private List<Hub> hubsLoaded;
            private List<Queue> queuesLoaded;
            private final boolean showCastAssistanceCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadQueuesSucceed(List<Queue> queuesLoaded, List<Hub> hubsLoaded, GetQueuesEvent event, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(queuesLoaded, "queuesLoaded");
                Intrinsics.checkNotNullParameter(hubsLoaded, "hubsLoaded");
                Intrinsics.checkNotNullParameter(event, "event");
                this.queuesLoaded = queuesLoaded;
                this.hubsLoaded = hubsLoaded;
                this.event = event;
                this.showCastAssistanceCode = z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LoadQueuesSucceed copy$default(LoadQueuesSucceed loadQueuesSucceed, List list, List list2, GetQueuesEvent getQueuesEvent, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = loadQueuesSucceed.queuesLoaded;
                }
                if ((i10 & 2) != 0) {
                    list2 = loadQueuesSucceed.hubsLoaded;
                }
                if ((i10 & 4) != 0) {
                    getQueuesEvent = loadQueuesSucceed.event;
                }
                if ((i10 & 8) != 0) {
                    z10 = loadQueuesSucceed.showCastAssistanceCode;
                }
                return loadQueuesSucceed.copy(list, list2, getQueuesEvent, z10);
            }

            public final List<Queue> component1() {
                return this.queuesLoaded;
            }

            public final List<Hub> component2() {
                return this.hubsLoaded;
            }

            /* renamed from: component3, reason: from getter */
            public final GetQueuesEvent getEvent() {
                return this.event;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowCastAssistanceCode() {
                return this.showCastAssistanceCode;
            }

            public final LoadQueuesSucceed copy(List<Queue> queuesLoaded, List<Hub> hubsLoaded, GetQueuesEvent event, boolean showCastAssistanceCode) {
                Intrinsics.checkNotNullParameter(queuesLoaded, "queuesLoaded");
                Intrinsics.checkNotNullParameter(hubsLoaded, "hubsLoaded");
                Intrinsics.checkNotNullParameter(event, "event");
                return new LoadQueuesSucceed(queuesLoaded, hubsLoaded, event, showCastAssistanceCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadQueuesSucceed)) {
                    return false;
                }
                LoadQueuesSucceed loadQueuesSucceed = (LoadQueuesSucceed) other;
                return Intrinsics.areEqual(this.queuesLoaded, loadQueuesSucceed.queuesLoaded) && Intrinsics.areEqual(this.hubsLoaded, loadQueuesSucceed.hubsLoaded) && Intrinsics.areEqual(this.event, loadQueuesSucceed.event) && this.showCastAssistanceCode == loadQueuesSucceed.showCastAssistanceCode;
            }

            public final GetQueuesEvent getEvent() {
                return this.event;
            }

            public final List<Hub> getHubsLoaded() {
                return this.hubsLoaded;
            }

            public final List<Queue> getQueuesLoaded() {
                return this.queuesLoaded;
            }

            public final boolean getShowCastAssistanceCode() {
                return this.showCastAssistanceCode;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = ((((this.queuesLoaded.hashCode() * 31) + this.hubsLoaded.hashCode()) * 31) + this.event.hashCode()) * 31;
                boolean z10 = this.showCastAssistanceCode;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return iHashCode + i10;
            }

            public final void setHubsLoaded(List<Hub> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.hubsLoaded = list;
            }

            public final void setQueuesLoaded(List<Queue> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.queuesLoaded = list;
            }

            public String toString() {
                return "LoadQueuesSucceed(queuesLoaded=" + this.queuesLoaded + ", hubsLoaded=" + this.hubsLoaded + ", event=" + this.event + ", showCastAssistanceCode=" + this.showCastAssistanceCode + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$LoadingQueue;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "()V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class LoadingQueue extends UiState {
            public static final int $stable = 0;
            public static final LoadingQueue INSTANCE = new LoadingQueue();

            private LoadingQueue() {
                super(null);
            }
        }

        @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$NoActiveNetwork;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "()V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class NoActiveNetwork extends UiState {
            public static final int $stable = 0;
            public static final NoActiveNetwork INSTANCE = new NoActiveNetwork();

            private NoActiveNetwork() {
                super(null);
            }
        }

        @Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u0091\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00061"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$QueueOpen;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "allGuests", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "selectedGuests", "unselectedGuests", "conflictedGuests", "ineligiblePartyGuests", "isOnboardedParty", "", "shouldRefreshUI", "correlationId", "", "conflicts", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;Ljava/util/List;)V", "getAllGuests", "()Ljava/util/List;", "getConflictedGuests", "getConflicts", "getCorrelationId", "()Ljava/lang/String;", "getIneligiblePartyGuests", "()Z", "getQueue", "()Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "getSelectedGuests", "getShouldRefreshUI", "getUnselectedGuests", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "other", "", "hashCode", "", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class QueueOpen extends UiState {
            public static final int $stable = 8;
            private final List<LinkedGuest> allGuests;
            private final List<LinkedGuest> conflictedGuests;
            private final List<Conflict> conflicts;
            private final String correlationId;
            private final List<LinkedGuest> ineligiblePartyGuests;
            private final boolean isOnboardedParty;
            private final Queue queue;
            private final List<LinkedGuest> selectedGuests;
            private final boolean shouldRefreshUI;
            private final List<LinkedGuest> unselectedGuests;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QueueOpen(Queue queue, List<LinkedGuest> allGuests, List<LinkedGuest> selectedGuests, List<LinkedGuest> unselectedGuests, List<LinkedGuest> conflictedGuests, List<LinkedGuest> ineligiblePartyGuests, boolean z10, boolean z11, String correlationId, List<Conflict> conflicts) {
                super(null);
                Intrinsics.checkNotNullParameter(queue, "queue");
                Intrinsics.checkNotNullParameter(allGuests, "allGuests");
                Intrinsics.checkNotNullParameter(selectedGuests, "selectedGuests");
                Intrinsics.checkNotNullParameter(unselectedGuests, "unselectedGuests");
                Intrinsics.checkNotNullParameter(conflictedGuests, "conflictedGuests");
                Intrinsics.checkNotNullParameter(ineligiblePartyGuests, "ineligiblePartyGuests");
                Intrinsics.checkNotNullParameter(correlationId, "correlationId");
                Intrinsics.checkNotNullParameter(conflicts, "conflicts");
                this.queue = queue;
                this.allGuests = allGuests;
                this.selectedGuests = selectedGuests;
                this.unselectedGuests = unselectedGuests;
                this.conflictedGuests = conflictedGuests;
                this.ineligiblePartyGuests = ineligiblePartyGuests;
                this.isOnboardedParty = z10;
                this.shouldRefreshUI = z11;
                this.correlationId = correlationId;
                this.conflicts = conflicts;
            }

            public static /* synthetic */ QueueOpen copy$default(QueueOpen queueOpen, Queue queue, List list, List list2, List list3, List list4, List list5, boolean z10, boolean z11, String str, List list6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    queue = queueOpen.queue;
                }
                if ((i10 & 2) != 0) {
                    list = queueOpen.allGuests;
                }
                if ((i10 & 4) != 0) {
                    list2 = queueOpen.selectedGuests;
                }
                if ((i10 & 8) != 0) {
                    list3 = queueOpen.unselectedGuests;
                }
                if ((i10 & 16) != 0) {
                    list4 = queueOpen.conflictedGuests;
                }
                if ((i10 & 32) != 0) {
                    list5 = queueOpen.ineligiblePartyGuests;
                }
                if ((i10 & 64) != 0) {
                    z10 = queueOpen.isOnboardedParty;
                }
                if ((i10 & 128) != 0) {
                    z11 = queueOpen.shouldRefreshUI;
                }
                if ((i10 & 256) != 0) {
                    str = queueOpen.correlationId;
                }
                if ((i10 & 512) != 0) {
                    list6 = queueOpen.conflicts;
                }
                String str2 = str;
                List list7 = list6;
                boolean z12 = z10;
                boolean z13 = z11;
                List list8 = list4;
                List list9 = list5;
                return queueOpen.copy(queue, list, list2, list3, list8, list9, z12, z13, str2, list7);
            }

            /* renamed from: component1, reason: from getter */
            public final Queue getQueue() {
                return this.queue;
            }

            public final List<Conflict> component10() {
                return this.conflicts;
            }

            public final List<LinkedGuest> component2() {
                return this.allGuests;
            }

            public final List<LinkedGuest> component3() {
                return this.selectedGuests;
            }

            public final List<LinkedGuest> component4() {
                return this.unselectedGuests;
            }

            public final List<LinkedGuest> component5() {
                return this.conflictedGuests;
            }

            public final List<LinkedGuest> component6() {
                return this.ineligiblePartyGuests;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsOnboardedParty() {
                return this.isOnboardedParty;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getShouldRefreshUI() {
                return this.shouldRefreshUI;
            }

            /* renamed from: component9, reason: from getter */
            public final String getCorrelationId() {
                return this.correlationId;
            }

            public final QueueOpen copy(Queue queue, List<LinkedGuest> allGuests, List<LinkedGuest> selectedGuests, List<LinkedGuest> unselectedGuests, List<LinkedGuest> conflictedGuests, List<LinkedGuest> ineligiblePartyGuests, boolean isOnboardedParty, boolean shouldRefreshUI, String correlationId, List<Conflict> conflicts) {
                Intrinsics.checkNotNullParameter(queue, "queue");
                Intrinsics.checkNotNullParameter(allGuests, "allGuests");
                Intrinsics.checkNotNullParameter(selectedGuests, "selectedGuests");
                Intrinsics.checkNotNullParameter(unselectedGuests, "unselectedGuests");
                Intrinsics.checkNotNullParameter(conflictedGuests, "conflictedGuests");
                Intrinsics.checkNotNullParameter(ineligiblePartyGuests, "ineligiblePartyGuests");
                Intrinsics.checkNotNullParameter(correlationId, "correlationId");
                Intrinsics.checkNotNullParameter(conflicts, "conflicts");
                return new QueueOpen(queue, allGuests, selectedGuests, unselectedGuests, conflictedGuests, ineligiblePartyGuests, isOnboardedParty, shouldRefreshUI, correlationId, conflicts);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QueueOpen)) {
                    return false;
                }
                QueueOpen queueOpen = (QueueOpen) other;
                return Intrinsics.areEqual(this.queue, queueOpen.queue) && Intrinsics.areEqual(this.allGuests, queueOpen.allGuests) && Intrinsics.areEqual(this.selectedGuests, queueOpen.selectedGuests) && Intrinsics.areEqual(this.unselectedGuests, queueOpen.unselectedGuests) && Intrinsics.areEqual(this.conflictedGuests, queueOpen.conflictedGuests) && Intrinsics.areEqual(this.ineligiblePartyGuests, queueOpen.ineligiblePartyGuests) && this.isOnboardedParty == queueOpen.isOnboardedParty && this.shouldRefreshUI == queueOpen.shouldRefreshUI && Intrinsics.areEqual(this.correlationId, queueOpen.correlationId) && Intrinsics.areEqual(this.conflicts, queueOpen.conflicts);
            }

            public final List<LinkedGuest> getAllGuests() {
                return this.allGuests;
            }

            public final List<LinkedGuest> getConflictedGuests() {
                return this.conflictedGuests;
            }

            public final List<Conflict> getConflicts() {
                return this.conflicts;
            }

            public final String getCorrelationId() {
                return this.correlationId;
            }

            public final List<LinkedGuest> getIneligiblePartyGuests() {
                return this.ineligiblePartyGuests;
            }

            public final Queue getQueue() {
                return this.queue;
            }

            public final List<LinkedGuest> getSelectedGuests() {
                return this.selectedGuests;
            }

            public final boolean getShouldRefreshUI() {
                return this.shouldRefreshUI;
            }

            public final List<LinkedGuest> getUnselectedGuests() {
                return this.unselectedGuests;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = ((((((((((this.queue.hashCode() * 31) + this.allGuests.hashCode()) * 31) + this.selectedGuests.hashCode()) * 31) + this.unselectedGuests.hashCode()) * 31) + this.conflictedGuests.hashCode()) * 31) + this.ineligiblePartyGuests.hashCode()) * 31;
                boolean z10 = this.isOnboardedParty;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                int i11 = (iHashCode + i10) * 31;
                boolean z11 = this.shouldRefreshUI;
                return ((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.correlationId.hashCode()) * 31) + this.conflicts.hashCode();
            }

            public final boolean isOnboardedParty() {
                return this.isOnboardedParty;
            }

            public String toString() {
                return "QueueOpen(queue=" + this.queue + ", allGuests=" + this.allGuests + ", selectedGuests=" + this.selectedGuests + ", unselectedGuests=" + this.unselectedGuests + ", conflictedGuests=" + this.conflictedGuests + ", ineligiblePartyGuests=" + this.ineligiblePartyGuests + ", isOnboardedParty=" + this.isOnboardedParty + ", shouldRefreshUI=" + this.shouldRefreshUI + ", correlationId=" + this.correlationId + ", conflicts=" + this.conflicts + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState$SelectParkItem;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$UiState;", "parkItem", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "(Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;)V", "getParkItem", "()Lcom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueParkButton;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class SelectParkItem extends UiState {
            public static final int $stable = 8;
            private final SelectQueueParkButton parkItem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectParkItem(SelectQueueParkButton parkItem) {
                super(null);
                Intrinsics.checkNotNullParameter(parkItem, "parkItem");
                this.parkItem = parkItem;
            }

            public static /* synthetic */ SelectParkItem copy$default(SelectParkItem selectParkItem, SelectQueueParkButton selectQueueParkButton, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    selectQueueParkButton = selectParkItem.parkItem;
                }
                return selectParkItem.copy(selectQueueParkButton);
            }

            /* renamed from: component1, reason: from getter */
            public final SelectQueueParkButton getParkItem() {
                return this.parkItem;
            }

            public final SelectParkItem copy(SelectQueueParkButton parkItem) {
                Intrinsics.checkNotNullParameter(parkItem, "parkItem");
                return new SelectParkItem(parkItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectParkItem) && Intrinsics.areEqual(this.parkItem, ((SelectParkItem) other).parkItem);
            }

            public final SelectQueueParkButton getParkItem() {
                return this.parkItem;
            }

            public int hashCode() {
                return this.parkItem.hashCode();
            }

            public String toString() {
                return "SelectParkItem(parkItem=" + this.parkItem + ")";
            }
        }

        public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UiState() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QueueGuestIdMode.values().length];
            try {
                iArr[QueueGuestIdMode.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QueueGuestIdMode.IDENTIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$getLinkedGuests$1", m92053f = "PartyViewModel.kt", m92054i = {}, m92055l = {165}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    @SourceDebugExtension({"SMAP\nPartyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyViewModel.kt\ncom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$getLinkedGuests$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n1#2:496\n*E\n"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$getLinkedGuests$1 */
    static final class C216281 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isDeepLinkedFlow;
        final /* synthetic */ String $queueId;
        final /* synthetic */ GetLinkedGuestsRequestType $requestType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216281(String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, Continuation<? super C216281> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$isDeepLinkedFlow = z10;
            this.$requestType = getLinkedGuestsRequestType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartyViewModel.this.new C216281(this.$queueId, this.$isDeepLinkedFlow, this.$requestType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object error;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = PartyViewModel.this.getVirtualQueueManager();
                String str = this.$queueId;
                boolean z10 = this.$isDeepLinkedFlow;
                GetLinkedGuestsRequestType getLinkedGuestsRequestType = this.$requestType;
                this.label = 1;
                obj = virtualQueueManager.getLinkedGuests(str, z10, getLinkedGuestsRequestType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetLinkedGuestsEvent getLinkedGuestsEvent = (GetLinkedGuestsEvent) obj;
            GetLinkedGuestsResponse payload = getLinkedGuestsEvent.getPayload();
            Map<String, List<String>> headers = getLinkedGuestsEvent.getHeaders();
            if (!getLinkedGuestsEvent.isSuccess() || payload == null || payload.getResponseStatus() != GetLinkedGuestsResponseStatus.OK) {
                PartyViewModel.this._state.setValue(new UiState.Error(ErrorType.GENERIC));
                return Unit.INSTANCE;
            }
            List<Queue> queues = payload.getQueues();
            PartyViewModel partyViewModel = PartyViewModel.this;
            Iterator<T> it = queues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Queue) next).getQueueId(), partyViewModel.currentQueueId)) {
                    break;
                }
            }
            Queue queue = (Queue) next;
            if (queue == null) {
                PartyViewModel.this._state.setValue(new UiState.Error(ErrorType.GENERIC));
                return Unit.INSTANCE;
            }
            PartyViewModel.this.queue = queue;
            List<LinkedGuest> guests = payload.getGuests();
            if (guests == null || guests.isEmpty()) {
                PartyViewModel partyViewModel2 = PartyViewModel.this;
                partyViewModel2.updateQueue(partyViewModel2.queue);
                PartyViewModel.this.shouldRefreshUI = false;
            } else {
                PartyViewModel partyViewModel3 = PartyViewModel.this;
                PartyViewModel.setupParty$default(partyViewModel3, partyViewModel3.queue, payload.getGuests(), payload.getPlanningPartyGuestIds(), payload.getConflicts(), false, 16, null);
                PartyViewModel.this.shouldRefreshUI = true;
            }
            VQResponseEvent vQResponseEvent = new VQResponseEvent();
            vQResponseEvent.setHeaders(headers);
            PartyViewModel.this.correlationId = vQResponseEvent.getHeaderValue(VQResponseHeaderAttribute.CORRELATION_ID);
            SingleLiveEvent singleLiveEvent = PartyViewModel.this._state;
            try {
                PartyViewModel.this.updateSelectedGuests();
                error = new UiState.QueueOpen(PartyViewModel.this.queue, PartyViewModel.this.allGuests, PartyViewModel.this.selectedGuests, PartyViewModel.this.unselectedGuests, PartyViewModel.this.conflictedGuests, PartyViewModel.this.ineligiblePartyGuests, PartyViewModel.this.isOnboardedParty(), PartyViewModel.this.shouldRefreshUI, PartyViewModel.this.correlationId, PartyViewModel.this.conflicts);
            } catch (Exception unused) {
                error = new UiState.Error(ErrorType.GENERIC);
            }
            singleLiveEvent.setValue(error);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216281) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$getLoggedUserFullName$1", m92053f = "PartyViewModel.kt", m92054i = {}, m92055l = {h76.OUR_STORY_SHOW_MY_NAME_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$getLoggedUserFullName$1 */
    static final class C216291 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C216291(Continuation<? super C216291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartyViewModel.this.new C216291(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C3783c0 c3783c0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3783c0 c3783c02 = PartyViewModel.this._loggedUserLiveData;
                LoggedInUser loggedInUser = PartyViewModel.this.getLoggedInUser();
                this.L$0 = c3783c02;
                this.label = 1;
                Object loggedInUserName = loggedInUser.getLoggedInUserName(this);
                if (loggedInUserName == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = loggedInUserName;
                c3783c0 = c3783c02;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3783c0 = (C3783c0) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            c3783c0.setValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216291) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$getQueuePosition$1", m92053f = "PartyViewModel.kt", m92054i = {}, m92055l = {h76.TIV_NOTIFICATION_RECEIVED_SERVER_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$getQueuePosition$1 */
    static final class C216301 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C216301(Continuation<? super C216301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartyViewModel.this.new C216301(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String activeNetworkConnection = PartyViewModel.this.getVqThemer().getActiveNetworkConnection();
                if (activeNetworkConnection == null || activeNetworkConnection.length() == 0) {
                    PartyViewModel.this._state.setValue(UiState.NoActiveNetwork.INSTANCE);
                    return Unit.INSTANCE;
                }
                VirtualQueueManager virtualQueueManager = PartyViewModel.this.getVirtualQueueManager();
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
            PartyViewModel.this._getPositionEvent.setValue((GetPositionsEvent) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216301) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$loadQueues$1", m92053f = "PartyViewModel.kt", m92054i = {}, m92055l = {h76.VERIFY_TWOFA_ATTEMPT_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$loadQueues$1 */
    static final class C216311 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C216311(Continuation<? super C216311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartyViewModel.this.new C216311(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = PartyViewModel.this.getVirtualQueueManager();
                this.label = 1;
                obj = virtualQueueManager.getAllQueues(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetQueuesEvent getQueuesEvent = (GetQueuesEvent) obj;
            GetQueuesResponse payload = getQueuesEvent.getPayload();
            if (getQueuesEvent.isSuccess() && payload != null && payload.getResponseStatus() == QueueStatus.OK) {
                PartyViewModel.this._state.setValue(new UiState.LoadQueuesSucceed(payload.getQueues(), payload.getHubs(), getQueuesEvent, payload.getShowCastAssistanceCode()));
            } else {
                PartyViewModel.this._state.setValue(new UiState.Error(ErrorType.GENERIC));
            }
            PartyViewModel.this.queuesLoading = false;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216311) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$onJoinAnonymousQueue$1", m92053f = "PartyViewModel.kt", m92054i = {}, m92055l = {297}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$onJoinAnonymousQueue$1 */
    static final class C216321 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $partySize;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216321(String str, int i10, Continuation<? super C216321> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$partySize = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartyViewModel.this.new C216321(this.$queueId, this.$partySize, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = PartyViewModel.this.getVirtualQueueManager();
                String str = this.$queueId;
                int i11 = this.$partySize;
                this.label = 1;
                obj = virtualQueueManager.joinAnonymousQueue(str, i11, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            JoinQueueEvent joinQueueEvent = (JoinQueueEvent) obj;
            if (joinQueueEvent.isSuccess()) {
                GetPositionsResponse successResponse = joinQueueEvent.getSuccessResponse();
                if (successResponse != null) {
                    PartyViewModel.this._state.setValue(new UiState.JoinQueue(successResponse));
                }
            } else {
                JoinQueueErrorResponse errorResponse = joinQueueEvent.getErrorResponse();
                if (errorResponse != null) {
                    PartyViewModel.this._state.setValue(new UiState.JoinError(errorResponse));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216321) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$onJoinQueue$1", m92053f = "PartyViewModel.kt", m92054i = {}, m92055l = {h76.APP_APPLICATION_LOGIN_FAILURE_SERVER_EVENT_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel$onJoinQueue$1 */
    static final class C216331 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $guestIds;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216331(String str, List<String> list, Continuation<? super C216331> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$guestIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartyViewModel.this.new C216331(this.$queueId, this.$guestIds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                VirtualQueueManager virtualQueueManager = PartyViewModel.this.getVirtualQueueManager();
                String str = this.$queueId;
                List<String> list = this.$guestIds;
                this.label = 1;
                obj = virtualQueueManager.joinQueue(str, list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            JoinQueueEvent joinQueueEvent = (JoinQueueEvent) obj;
            if (joinQueueEvent.isSuccess()) {
                GetPositionsResponse successResponse = joinQueueEvent.getSuccessResponse();
                if (successResponse != null) {
                    PartyViewModel.this._state.setValue(new UiState.JoinQueue(successResponse));
                }
            } else {
                JoinQueueErrorResponse errorResponse = joinQueueEvent.getErrorResponse();
                if (errorResponse != null) {
                    PartyViewModel.this._state.setValue(new UiState.JoinError(errorResponse));
                    if (errorResponse.getResponseStatus() == JoinQueueErrorResponseStatus.INVALID_GUEST) {
                        PartyViewModel.this.conflictOccurred = true;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216331) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public PartyViewModel() {
    }

    public static /* synthetic */ void getLinkedGuests$default(PartyViewModel partyViewModel, String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            getLinkedGuestsRequestType = GetLinkedGuestsRequestType.DEFAULT;
        }
        partyViewModel.getLinkedGuests(str, z10, getLinkedGuestsRequestType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOnboardedParty() {
        return !this.planningPartyIds.isEmpty();
    }

    private final void mergeParty(Queue newQueue, List<LinkedGuest> newAllGuests, List<String> newPlanningPartyIds, List<Conflict> newConflicts) {
        List<LinkedGuest> list = this.selectedGuests;
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LinkedGuest) it.next()).getGuestId());
        }
        List<LinkedGuest> list2 = this.unselectedGuests;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LinkedGuest) it2.next()).getGuestId());
        }
        List<LinkedGuest> list3 = newAllGuests;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((LinkedGuest) it3.next()).getGuestId());
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list3) {
            if (((LinkedGuest) obj).getIsPreselected()) {
                arrayList4.add(obj);
            }
        }
        ArrayList<String> arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((LinkedGuest) it4.next()).getGuestId());
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator<T> it5 = newConflicts.iterator();
        while (it5.hasNext()) {
            CollectionsKt.addAll(arrayList6, ((Conflict) it5.next()).getGuestIds());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : arrayList) {
            if (arrayList3.contains(str) && !arrayList6.contains(str) && linkedHashSet.size() < newQueue.getMaxPartySize()) {
                linkedHashSet.add(str);
            }
        }
        for (String str2 : arrayList5) {
            if (!arrayList2.contains(str2) && !arrayList6.contains(str2) && linkedHashSet.size() < newQueue.getMaxPartySize()) {
                linkedHashSet.add(str2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : arrayList3) {
            String str3 = (String) obj2;
            if (!linkedHashSet.contains(str3) && !arrayList6.contains(str3)) {
                arrayList7.add(obj2);
            }
        }
        this.queue = newQueue;
        this.allGuests = newAllGuests;
        this.planningPartyIds = newPlanningPartyIds;
        this.conflicts = newConflicts;
        ArrayList arrayList8 = new ArrayList();
        Iterator<T> it6 = newConflicts.iterator();
        while (it6.hasNext()) {
            CollectionsKt.addAll(arrayList8, ((Conflict) it6.next()).getGuestIds());
        }
        this.conflictedIds = arrayList8;
        List<LinkedGuest> list4 = this.allGuests;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj3 : list4) {
            if (linkedHashSet.contains(((LinkedGuest) obj3).getGuestId())) {
                arrayList9.add(obj3);
            }
        }
        this.selectedGuests = arrayList9;
        List<LinkedGuest> list5 = this.allGuests;
        ArrayList arrayList10 = new ArrayList();
        for (Object obj4 : list5) {
            if (arrayList7.contains(((LinkedGuest) obj4).getGuestId())) {
                arrayList10.add(obj4);
            }
        }
        this.unselectedGuests = arrayList10;
        List<LinkedGuest> list6 = this.allGuests;
        ArrayList arrayList11 = new ArrayList();
        for (Object obj5 : list6) {
            LinkedGuest linkedGuest = (LinkedGuest) obj5;
            if (this.planningPartyIds.contains(linkedGuest.getGuestId()) && this.conflictedIds.contains(linkedGuest.getGuestId())) {
                arrayList11.add(obj5);
            }
        }
        this.ineligiblePartyGuests = arrayList11;
        List<LinkedGuest> list7 = this.allGuests;
        ArrayList arrayList12 = new ArrayList();
        for (Object obj6 : list7) {
            if (this.conflictedIds.contains(((LinkedGuest) obj6).getGuestId())) {
                arrayList12.add(obj6);
            }
        }
        this.conflictedGuests = arrayList12;
    }

    private final void setupAnonParty(Queue queue, List<LinkedGuest> allGuests, List<Conflict> conflicts) {
        this.queue = queue;
        this.allGuests = allGuests;
        this.planningPartyIds = CollectionsKt.emptyList();
        this.conflicts = conflicts;
        LinkedGuest linkedGuest = (LinkedGuest) CollectionsKt.firstOrNull((List) allGuests);
        if (linkedGuest == null) {
            linkedGuest = new LinkedGuest(null, false, null, null, null, null, null, false, null, null, null, false, null, 8191, null);
        }
        this.selectedGuests = CollectionsKt.listOf(linkedGuest);
        this.unselectedGuests = CollectionsKt.emptyList();
        this.ineligiblePartyGuests = CollectionsKt.emptyList();
        this.conflictedGuests = CollectionsKt.emptyList();
    }

    private final void setupNewParty(Queue newQueue, List<LinkedGuest> newAllGuests, List<String> newPlanningPartyIds, List<Conflict> newConflicts) {
        this.queue = newQueue;
        this.allGuests = newAllGuests;
        this.planningPartyIds = newPlanningPartyIds;
        this.conflicts = newConflicts;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = newConflicts.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Conflict) it.next()).getGuestIds());
        }
        this.conflictedIds = arrayList;
        List<LinkedGuest> list = this.allGuests;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            LinkedGuest linkedGuest = (LinkedGuest) obj;
            if (linkedGuest.getIsPreselected() && !this.conflictedIds.contains(linkedGuest.getGuestId())) {
                arrayList2.add(obj);
            }
        }
        this.selectedGuests = arrayList2;
        List<LinkedGuest> list2 = this.allGuests;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            LinkedGuest linkedGuest2 = (LinkedGuest) obj2;
            if (!linkedGuest2.getIsPreselected() && !this.conflictedIds.contains(linkedGuest2.getGuestId())) {
                arrayList3.add(obj2);
            }
        }
        this.unselectedGuests = arrayList3;
        List<LinkedGuest> list3 = this.allGuests;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list3) {
            LinkedGuest linkedGuest3 = (LinkedGuest) obj3;
            if (this.planningPartyIds.contains(linkedGuest3.getGuestId()) && this.conflictedIds.contains(linkedGuest3.getGuestId())) {
                arrayList4.add(obj3);
            }
        }
        this.ineligiblePartyGuests = arrayList4;
        List<LinkedGuest> list4 = this.allGuests;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list4) {
            if (this.conflictedIds.contains(((LinkedGuest) obj4).getGuestId())) {
                arrayList5.add(obj4);
            }
        }
        this.conflictedGuests = arrayList5;
    }

    private final void setupParty(Queue newQueue, List<LinkedGuest> newAllGuests, List<String> newPlanningPartyIds, List<Conflict> newConflicts, boolean forceRefresh) {
        if (newQueue.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS) {
            setupAnonParty(newQueue, newAllGuests, newConflicts);
        } else if (!Intrinsics.areEqual(this.queue.getQueueId(), newQueue.getQueueId()) || forceRefresh) {
            setupNewParty(newQueue, newAllGuests, newPlanningPartyIds, newConflicts);
        } else {
            mergeParty(newQueue, newAllGuests, newPlanningPartyIds, newConflicts);
        }
    }

    static /* synthetic */ void setupParty$default(PartyViewModel partyViewModel, Queue queue, List list, List list2, List list3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        partyViewModel.setupParty(queue, list, list2, list3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateQueue(Queue newQueue) {
        if (Intrinsics.areEqual(this.queue.getQueueId(), newQueue.getQueueId())) {
            this.queue = newQueue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectedGuests() {
        if (this.selectedGuests.size() > this.queue.getMaxPartySize()) {
            this.selectedGuests = CollectionsKt.dropLast(this.selectedGuests, this.selectedGuests.size() - this.queue.getMaxPartySize());
        }
    }

    public final void clear() {
        this.queue = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        this.allGuests = CollectionsKt.emptyList();
        this.selectedGuests = CollectionsKt.emptyList();
        this.unselectedGuests = CollectionsKt.emptyList();
        this.conflictedGuests = CollectionsKt.emptyList();
        this.ineligiblePartyGuests = CollectionsKt.emptyList();
        this.planningPartyIds = CollectionsKt.emptyList();
        this.conflicts = CollectionsKt.emptyList();
        this.conflictedIds = CollectionsKt.emptyList();
    }

    public final FacilityUtils getFacilityUtils() {
        FacilityUtils facilityUtils = this.facilityUtils;
        if (facilityUtils != null) {
            return facilityUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("facilityUtils");
        return null;
    }

    public final AbstractC3830y<GetPositionsEvent> getGetPositionEvent() {
        return this._getPositionEvent;
    }

    public final void getLinkedGuests(String queueId, boolean isDeepLinkedFlow, GetLinkedGuestsRequestType requestType) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.currentQueueId = queueId;
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216281(queueId, isDeepLinkedFlow, requestType, null), 3, null);
    }

    public final LoggedInUser getLoggedInUser() {
        LoggedInUser loggedInUser = this.loggedInUser;
        if (loggedInUser != null) {
            return loggedInUser;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loggedInUser");
        return null;
    }

    public final void getLoggedUserFullName() {
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216291(null), 3, null);
    }

    public final AbstractC3830y<String> getLoggedUserLiveData() {
        return this._loggedUserLiveData;
    }

    public final C9314j getParkAppConfiguration() {
        C9314j c9314j = this.parkAppConfiguration;
        if (c9314j != null) {
            return c9314j;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkAppConfiguration");
        return null;
    }

    public final SingleLiveEvent<String> getParkConfigLiveData() {
        return this._parkConfigLiveData;
    }

    public final AbstractC3830y<String> getParkNameLiveData() {
        return this._parkNameLiveData;
    }

    public final PerformanceTracking getPerformanceTracking() {
        PerformanceTracking performanceTracking = this.performanceTracking;
        if (performanceTracking != null) {
            return performanceTracking;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceTracking");
        return null;
    }

    public final void getQueuePosition() {
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216301(null), 3, null);
    }

    public final AbstractC3830y<QueueGuestIdMode> getQueueType() {
        return this._queueType;
    }

    public final SingleLiveEvent<UiState> getState() {
        return this._state;
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

    public final VirtualQueueThemer getVqThemer() {
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        if (virtualQueueThemer != null) {
            return virtualQueueThemer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqThemer");
        return null;
    }

    public final void loadQueues() {
        String activeNetworkConnection = getVqThemer().getActiveNetworkConnection();
        if (activeNetworkConnection == null || activeNetworkConnection.length() == 0) {
            this._state.setValue(UiState.NoActiveNetwork.INSTANCE);
        } else {
            if (getVqThemer().getFilterData().isEmpty()) {
                this._state.setValue(UiState.EmptyParks.INSTANCE);
                return;
            }
            this.queuesLoading = true;
            this._state.postValue(UiState.LoadingQueue.INSTANCE);
            C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216311(null), 3, null);
        }
    }

    public final void modifyParty(List<String> updatedSelectedIds) {
        UiState error;
        Intrinsics.checkNotNullParameter(updatedSelectedIds, "updatedSelectedIds");
        List<LinkedGuest> list = this.allGuests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (updatedSelectedIds.contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        this.selectedGuests = arrayList;
        List<LinkedGuest> list2 = this.allGuests;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            LinkedGuest linkedGuest = (LinkedGuest) obj2;
            if (!this.selectedGuests.contains(linkedGuest) && !this.conflictedGuests.contains(linkedGuest)) {
                arrayList2.add(obj2);
            }
        }
        this.unselectedGuests = arrayList2;
        SingleLiveEvent<UiState> singleLiveEvent = this._state;
        try {
            updateSelectedGuests();
            error = new UiState.QueueOpen(this.queue, this.allGuests, this.selectedGuests, this.unselectedGuests, this.conflictedGuests, this.ineligiblePartyGuests, isOnboardedParty(), this.shouldRefreshUI, this.correlationId, this.conflicts);
        } catch (Exception unused) {
            error = new UiState.Error(ErrorType.GENERIC);
        }
        singleLiveEvent.setValue(error);
    }

    public final void onJoinAnonymousQueue(String queueId, int partySize) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216321(queueId, partySize, null), 3, null);
    }

    public final void onJoinQueue(String queueId, List<String> guestIds) {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        this.conflictOccurred = false;
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216331(queueId, guestIds, null), 3, null);
    }

    public final void selectParkItem(SelectQueueParkButton parkItem) {
        Intrinsics.checkNotNullParameter(parkItem, "parkItem");
        if (this.queuesLoading) {
            return;
        }
        this._state.setValue(new UiState.SelectParkItem(parkItem));
        loadQueues();
    }

    public final void setFacilityUtils(FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(facilityUtils, "<set-?>");
        this.facilityUtils = facilityUtils;
    }

    public final void setLoggedInUser(LoggedInUser loggedInUser) {
        Intrinsics.checkNotNullParameter(loggedInUser, "<set-?>");
        this.loggedInUser = loggedInUser;
    }

    public final void setParkAppConfiguration(C9314j c9314j) {
        Intrinsics.checkNotNullParameter(c9314j, "<set-?>");
        this.parkAppConfiguration = c9314j;
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

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        Intrinsics.checkNotNullParameter(virtualQueueThemer, "<set-?>");
        this.vqThemer = virtualQueueThemer;
    }

    public final void setupQueueParkName(Facility facility) {
        String ancestorEntertainmentVenue;
        String ancestorThemePark;
        String string$default = VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.NonAttractionPark, this.queue.getContentId(), false, 4, null);
        C3783c0<String> c3783c0 = this._parkNameLiveData;
        if (StringsKt.isBlank(string$default)) {
            string$default = (facility == null || (ancestorThemePark = facility.getAncestorThemePark()) == null || !(StringsKt.isBlank(ancestorThemePark) ^ true)) ? (facility == null || (ancestorEntertainmentVenue = facility.getAncestorEntertainmentVenue()) == null || !(StringsKt.isBlank(ancestorEntertainmentVenue) ^ true)) ? null : facility.getAncestorEntertainmentVenue() : facility.getAncestorThemePark();
        }
        c3783c0.setValue(string$default);
    }

    /* renamed from: shouldReloadLinkedTickets, reason: from getter */
    public final boolean getConflictOccurred() {
        return this.conflictOccurred;
    }

    public final void showClosedQueueMessage() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.queue.getGuestIdMode().ordinal()];
        if (i10 == 1) {
            this._queueType.setValue(QueueGuestIdMode.ANONYMOUS);
        } else {
            if (i10 != 2) {
                return;
            }
            this._queueType.setValue(QueueGuestIdMode.IDENTIFIED);
        }
    }

    public final void virtualQueueAppType() {
        String strM38908h = getParkAppConfiguration().m38908h();
        if (Intrinsics.areEqual(strM38908h, "DLR")) {
            this._parkConfigLiveData.setValue("DLR");
        } else if (Intrinsics.areEqual(strM38908h, "WDW")) {
            this._parkConfigLiveData.setValue("WDW");
        }
    }
}