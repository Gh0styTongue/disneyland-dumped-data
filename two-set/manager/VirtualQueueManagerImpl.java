package com.disney.wdpro.virtualqueue.core.manager;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.virtualqueue.core.manager.event.GetLinkedGuestsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.GetPositionsEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.GetQueuesEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.JoinQueueEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.LeaveQueueEvent;
import com.disney.wdpro.virtualqueue.core.manager.event.UpdateAnonymousPartySizeEvent;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.LeaveQueueData;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetQueuesResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C30064h;
import kotlinx.coroutines.C30180u0;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ'\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ!\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManagerImpl;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "api", "Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;", "vqRegions", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "(Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;)V", "getAllQueues", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLinkedGuests", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetLinkedGuestsEvent;", "queueId", "", "applyPlanningPartyFilter", "", "requestType", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;", "(Ljava/lang/String;ZLcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPositions", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "joinAnonymousQueue", "Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;", "guestCount", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinQueue", "guestIds", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LeaveQueueData.KEY, "Lcom/disney/wdpro/virtualqueue/core/manager/event/LeaveQueueEvent;", "updateAnonymousPartySize", "Lcom/disney/wdpro/virtualqueue/core/manager/event/UpdateAnonymousPartySizeEvent;", "partySize", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueManagerImpl implements VirtualQueueManager {
    public static final int $stable = 8;
    private final VirtualQueueServiceApi api;
    private final VirtualQueueRegions vqRegions;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/GetQueuesEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$getAllQueues$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {0}, m92055l = {22}, m92056m = "invokeSuspend", m92057n = {"event"}, m92058s = {"L$0"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$getAllQueues$2 */
    static final class C216162 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super GetQueuesEvent>, Object> {
        Object L$0;
        int label;

        C216162(Continuation<? super C216162> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216162(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GetQueuesEvent getQueuesEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GetQueuesEvent getQueuesEvent2 = new GetQueuesEvent();
                VirtualQueueRegions virtualQueueRegions = VirtualQueueManagerImpl.this.vqRegions;
                this.L$0 = getQueuesEvent2;
                this.label = 1;
                if (virtualQueueRegions.getRegions(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getQueuesEvent = getQueuesEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getQueuesEvent = (GetQueuesEvent) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                C13352x<GetQueuesResponse> queues = VirtualQueueManagerImpl.this.api.getQueues();
                getQueuesEvent.setHeaders(queues.m55682b());
                if (queues.m55684d() == 200) {
                    getQueuesEvent.setResult((GetQueuesEvent) queues.m55683c());
                    return getQueuesEvent;
                }
                getQueuesEvent.setResult(false);
                return getQueuesEvent;
            } catch (Throwable unused) {
                getQueuesEvent.setResult(false);
                return getQueuesEvent;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super GetQueuesEvent> continuation) {
            return ((C216162) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetLinkedGuestsEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/GetLinkedGuestsEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$getLinkedGuests$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {0}, m92055l = {45}, m92056m = "invokeSuspend", m92057n = {"event"}, m92058s = {"L$0"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$getLinkedGuests$2 */
    static final class C216172 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super GetLinkedGuestsEvent>, Object> {
        final /* synthetic */ boolean $applyPlanningPartyFilter;
        final /* synthetic */ String $queueId;
        final /* synthetic */ GetLinkedGuestsRequestType $requestType;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216172(String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, Continuation<? super C216172> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$applyPlanningPartyFilter = z10;
            this.$requestType = getLinkedGuestsRequestType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216172(this.$queueId, this.$applyPlanningPartyFilter, this.$requestType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GetLinkedGuestsEvent getLinkedGuestsEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GetLinkedGuestsEvent getLinkedGuestsEvent2 = new GetLinkedGuestsEvent();
                VirtualQueueRegions virtualQueueRegions = VirtualQueueManagerImpl.this.vqRegions;
                this.L$0 = getLinkedGuestsEvent2;
                this.label = 1;
                if (virtualQueueRegions.getRegions(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getLinkedGuestsEvent = getLinkedGuestsEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getLinkedGuestsEvent = (GetLinkedGuestsEvent) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                C13352x<GetLinkedGuestsResponse> linkedGuests = VirtualQueueManagerImpl.this.api.getLinkedGuests(this.$queueId, this.$applyPlanningPartyFilter, this.$requestType);
                getLinkedGuestsEvent.setHeaders(linkedGuests.m55682b());
                if (linkedGuests.m55684d() == 200) {
                    getLinkedGuestsEvent.setResult((GetLinkedGuestsEvent) linkedGuests.m55683c());
                    return getLinkedGuestsEvent;
                }
                getLinkedGuestsEvent.setResult(false);
                return getLinkedGuestsEvent;
            } catch (Throwable unused) {
                getLinkedGuestsEvent.setResult(false);
                return getLinkedGuestsEvent;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super GetLinkedGuestsEvent> continuation) {
            return ((C216172) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/GetPositionsEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$getPositions$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {0}, m92055l = {66}, m92056m = "invokeSuspend", m92057n = {"event"}, m92058s = {"L$0"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$getPositions$2 */
    static final class C216182 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super GetPositionsEvent>, Object> {
        Object L$0;
        int label;

        C216182(Continuation<? super C216182> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216182(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GetPositionsEvent getPositionsEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GetPositionsEvent getPositionsEvent2 = new GetPositionsEvent();
                VirtualQueueRegions virtualQueueRegions = VirtualQueueManagerImpl.this.vqRegions;
                this.L$0 = getPositionsEvent2;
                this.label = 1;
                if (virtualQueueRegions.getRegions(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getPositionsEvent = getPositionsEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getPositionsEvent = (GetPositionsEvent) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                C13352x<GetPositionsResponse> positions = VirtualQueueManagerImpl.this.api.getPositions();
                getPositionsEvent.setHeaders(positions.m55682b());
                if (positions.m55684d() == 200) {
                    getPositionsEvent.setResult((GetPositionsEvent) positions.m55683c());
                    return getPositionsEvent;
                }
                getPositionsEvent.setResult(false);
                return getPositionsEvent;
            } catch (Throwable unused) {
                getPositionsEvent.setResult(false);
                return getPositionsEvent;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super GetPositionsEvent> continuation) {
            return ((C216182) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$joinAnonymousQueue$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$joinAnonymousQueue$2 */
    static final class C216192 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super JoinQueueEvent>, Object> {
        final /* synthetic */ int $guestCount;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216192(String str, int i10, Continuation<? super C216192> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$guestCount = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216192(this.$queueId, this.$guestCount, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JoinQueueEvent joinQueueEvent = new JoinQueueEvent();
            try {
                C13352x<GetPositionsResponse> c13352xJoinAnonymousQueue = VirtualQueueManagerImpl.this.api.joinAnonymousQueue(this.$queueId, this.$guestCount);
                if (c13352xJoinAnonymousQueue.m55684d() == 200) {
                    joinQueueEvent.setSuccessResponse(c13352xJoinAnonymousQueue.m55683c());
                    return joinQueueEvent;
                }
            } catch (UnSuccessStatusException e10) {
                JoinQueueErrorResponse joinQueueErrorResponse = (JoinQueueErrorResponse) e10.getServiceError();
                joinQueueErrorResponse.setHttpStatus(e10.getStatusCode());
                joinQueueEvent.setErrorResponse(joinQueueErrorResponse);
            } catch (Throwable unused) {
                joinQueueEvent.setErrorResponse(new JoinQueueErrorResponse(null, null, null, null, null, null, null, 0, 255, null));
            }
            return joinQueueEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super JoinQueueEvent> continuation) {
            return ((C216192) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/JoinQueueEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$joinQueue$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$joinQueue$2 */
    static final class C216202 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super JoinQueueEvent>, Object> {
        final /* synthetic */ List<String> $guestIds;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216202(String str, List<String> list, Continuation<? super C216202> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$guestIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216202(this.$queueId, this.$guestIds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JoinQueueEvent joinQueueEvent = new JoinQueueEvent();
            try {
                C13352x<GetPositionsResponse> c13352xJoinQueue = VirtualQueueManagerImpl.this.api.joinQueue(this.$queueId, this.$guestIds);
                if (c13352xJoinQueue.m55684d() == 200) {
                    joinQueueEvent.setSuccessResponse(c13352xJoinQueue.m55683c());
                    return joinQueueEvent;
                }
            } catch (UnSuccessStatusException e10) {
                JoinQueueErrorResponse joinQueueErrorResponse = (JoinQueueErrorResponse) e10.getServiceError();
                joinQueueErrorResponse.setHttpStatus(e10.getStatusCode());
                joinQueueEvent.setErrorResponse(joinQueueErrorResponse);
            } catch (Throwable unused) {
                joinQueueEvent.setErrorResponse(new JoinQueueErrorResponse(null, null, null, null, null, null, null, 0, 255, null));
            }
            return joinQueueEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super JoinQueueEvent> continuation) {
            return ((C216202) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/LeaveQueueEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/LeaveQueueEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$leaveQueue$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$leaveQueue$2 */
    static final class C216212 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super LeaveQueueEvent>, Object> {
        final /* synthetic */ List<String> $guestIds;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216212(String str, List<String> list, Continuation<? super C216212> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$guestIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216212(this.$queueId, this.$guestIds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LeaveQueueEvent leaveQueueEvent = new LeaveQueueEvent();
            try {
                int iM55684d = VirtualQueueManagerImpl.this.api.leaveQueue(this.$queueId, this.$guestIds).m55684d();
                if (iM55684d == 200 || iM55684d == 204) {
                    leaveQueueEvent.setResult(true);
                    return leaveQueueEvent;
                }
                leaveQueueEvent.setResult(false);
                return leaveQueueEvent;
            } catch (Exception unused) {
                leaveQueueEvent.setResult(false);
                return leaveQueueEvent;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super LeaveQueueEvent> continuation) {
            return ((C216212) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/virtualqueue/core/manager/event/UpdateAnonymousPartySizeEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/virtualqueue/core/manager/event/UpdateAnonymousPartySizeEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$updateAnonymousPartySize$2", m92053f = "VirtualQueueManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl$updateAnonymousPartySize$2 */
    static final class C216222 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super UpdateAnonymousPartySizeEvent>, Object> {
        final /* synthetic */ int $partySize;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216222(String str, int i10, Continuation<? super C216222> continuation) {
            super(2, continuation);
            this.$queueId = str;
            this.$partySize = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VirtualQueueManagerImpl.this.new C216222(this.$queueId, this.$partySize, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UpdateAnonymousPartySizeEvent updateAnonymousPartySizeEvent = new UpdateAnonymousPartySizeEvent();
            try {
                int iM55684d = VirtualQueueManagerImpl.this.api.updateAnonymousPartySize(this.$queueId, this.$partySize).m55684d();
                if (iM55684d == 200 || iM55684d == 204) {
                    updateAnonymousPartySizeEvent.setResult(true);
                    return updateAnonymousPartySizeEvent;
                }
                updateAnonymousPartySizeEvent.setResult(false);
                return updateAnonymousPartySizeEvent;
            } catch (Exception unused) {
                updateAnonymousPartySizeEvent.setResult(false);
                return updateAnonymousPartySizeEvent;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super UpdateAnonymousPartySizeEvent> continuation) {
            return ((C216222) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public VirtualQueueManagerImpl(VirtualQueueServiceApi api, VirtualQueueRegions vqRegions) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
        this.api = api;
        this.vqRegions = vqRegions;
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object getAllQueues(Continuation<? super GetQueuesEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216162(null), continuation);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object getLinkedGuests(String str, boolean z10, GetLinkedGuestsRequestType getLinkedGuestsRequestType, Continuation<? super GetLinkedGuestsEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216172(str, z10, getLinkedGuestsRequestType, null), continuation);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object getPositions(Continuation<? super GetPositionsEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216182(null), continuation);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object joinAnonymousQueue(String str, int i10, Continuation<? super JoinQueueEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216192(str, i10, null), continuation);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object joinQueue(String str, List<String> list, Continuation<? super JoinQueueEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216202(str, list, null), continuation);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object leaveQueue(String str, List<String> list, Continuation<? super LeaveQueueEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216212(str, list, null), continuation);
    }

    @Override // com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager
    public Object updateAnonymousPartySize(String str, int i10, Continuation<? super UpdateAnonymousPartySizeEvent> continuation) {
        return C30064h.m92775g(C30180u0.m93207b(), new C216222(str, i10, null), continuation);
    }
}