package com.disney.wdpro.flutter.park.badging;

import com.disney.wdpro.commons.p077di.AbstractC9295d;
import com.disney.wdpro.dash.dao.C9440k;
import com.disney.wdpro.dash.dash_secure.InterfaceC9481k;
import com.disney.wdpro.dash.dash_secure.InterfaceC9482l;
import com.disney.wdpro.flutter.park.dao.CBNotificationsDAO;
import com.disney.wdpro.flutter.park.models.MessageStateDTO;
import com.disney.wdpro.flutter.park.models.NotificationDTO;
import com.disney.wdpro.flutter.park.models.NotificationItemDTO;
import com.disney.wdpro.flutter.park.models.NotificationListingDTO;
import com.disney.wdpro.support.badging.BadgeCounter;
import com.disney.wdpro.support.badging.C20564f;
import com.disney.wdpro.support.badging.InterfaceC20563e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC30065h0;
import p559fa.InterfaceC27942e;

@Metadata(m92037d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BU\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0016J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManagerImpl;", "Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManager;", "Lcom/disney/wdpro/dash/dash_secure/k;", "Lcom/disney/wdpro/dash/dao/k;", "Lcom/disney/wdpro/flutter/park/models/NotificationListingDTO;", "userNotificationsDao", "Lcom/disney/wdpro/flutter/park/dao/CBNotificationsDAO;", "notificationsDao", "Lcom/disney/wdpro/flutter/park/models/NotificationDTO;", "privateNotificationsDao", "Lcom/disney/wdpro/flutter/park/models/MessageStateDTO;", "messageStateDao", "Lcom/disney/wdpro/support/badging/e;", "badgeCounterRepository", "Lcom/disney/wdpro/dash/dash_secure/l;", "dashSecureManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lcom/disney/wdpro/dash/dao/k;Lcom/disney/wdpro/flutter/park/dao/CBNotificationsDAO;Lcom/disney/wdpro/dash/dao/k;Lcom/disney/wdpro/dash/dao/k;Lcom/disney/wdpro/support/badging/e;Lcom/disney/wdpro/dash/dash_secure/l;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "internalReloadNotificationIdsCache", "()V", "internalClearNotificationIdsCache", "internalUpdateBadgeDisplay", "", "messageId", "", "hasDashDocument", "(Ljava/lang/String;)Z", "hasDashSecureDocument", "isMessageRead", "notificationId", "notificationIdsCacheContains", "updateBadgeDisplay", "reloadUserNotificationIdsCache", "onDatabaseAvailable", "onDatabaseRemoved", "onFailedDatabaseInitialization", "Lcom/disney/wdpro/dash/dao/k;", "Lcom/disney/wdpro/flutter/park/dao/CBNotificationsDAO;", "Lcom/disney/wdpro/support/badging/e;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/h0;", "coroutineScope", "Lkotlinx/coroutines/h0;", "", "Lcom/disney/wdpro/flutter/park/models/NotificationItemDTO;", "userNotificationIdsCache", "Ljava/util/List;", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nNotificationCenterBadgeManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterBadgeManagerImpl.kt\ncom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1747#2,3:141\n1549#2:144\n1620#2,3:145\n1855#2,2:148\n*S KotlinDebug\n*F\n+ 1 NotificationCenterBadgeManagerImpl.kt\ncom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManagerImpl\n*L\n45#1:141,3\n80#1:144\n80#1:145,3\n94#1:148,2\n*E\n"})
/* loaded from: classes28.dex */
public final class NotificationCenterBadgeManagerImpl implements NotificationCenterBadgeManager, InterfaceC9481k {
    private final InterfaceC20563e badgeCounterRepository;
    private final CoroutineDispatcher coroutineDispatcher;
    private final InterfaceC30065h0 coroutineScope;
    private final C9440k<MessageStateDTO> messageStateDao;
    private final CBNotificationsDAO notificationsDao;
    private final C9440k<NotificationDTO> privateNotificationsDao;
    private List<NotificationItemDTO> userNotificationIdsCache;
    private final C9440k<NotificationListingDTO> userNotificationsDao;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$onDatabaseAvailable$1", m92053f = "NotificationCenterBadgeManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$onDatabaseAvailable$1 */
    static final class C118041 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C118041(Continuation<? super C118041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCenterBadgeManagerImpl.this.new C118041(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationCenterBadgeManagerImpl.this.internalReloadNotificationIdsCache();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C118041) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$onDatabaseRemoved$1", m92053f = "NotificationCenterBadgeManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$onDatabaseRemoved$1 */
    static final class C118051 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C118051(Continuation<? super C118051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCenterBadgeManagerImpl.this.new C118051(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationCenterBadgeManagerImpl.this.internalClearNotificationIdsCache();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C118051) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$onFailedDatabaseInitialization$1", m92053f = "NotificationCenterBadgeManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$onFailedDatabaseInitialization$1 */
    static final class C118061 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C118061(Continuation<? super C118061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCenterBadgeManagerImpl.this.new C118061(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationCenterBadgeManagerImpl.this.internalClearNotificationIdsCache();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C118061) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$reloadUserNotificationIdsCache$1", m92053f = "NotificationCenterBadgeManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$reloadUserNotificationIdsCache$1 */
    static final class C118071 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C118071(Continuation<? super C118071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCenterBadgeManagerImpl.this.new C118071(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationCenterBadgeManagerImpl.this.internalReloadNotificationIdsCache();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C118071) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$updateBadgeDisplay$1", m92053f = "NotificationCenterBadgeManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManagerImpl$updateBadgeDisplay$1 */
    static final class C118081 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C118081(Continuation<? super C118081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCenterBadgeManagerImpl.this.new C118081(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NotificationCenterBadgeManagerImpl.this.internalUpdateBadgeDisplay();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C118081) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public NotificationCenterBadgeManagerImpl(C9440k<NotificationListingDTO> userNotificationsDao, CBNotificationsDAO notificationsDao, C9440k<NotificationDTO> privateNotificationsDao, C9440k<MessageStateDTO> messageStateDao, InterfaceC20563e badgeCounterRepository, InterfaceC9482l dashSecureManager, @Named(AbstractC9295d.IO_DISPATCHER) CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(userNotificationsDao, "userNotificationsDao");
        Intrinsics.checkNotNullParameter(notificationsDao, "notificationsDao");
        Intrinsics.checkNotNullParameter(privateNotificationsDao, "privateNotificationsDao");
        Intrinsics.checkNotNullParameter(messageStateDao, "messageStateDao");
        Intrinsics.checkNotNullParameter(badgeCounterRepository, "badgeCounterRepository");
        Intrinsics.checkNotNullParameter(dashSecureManager, "dashSecureManager");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.userNotificationsDao = userNotificationsDao;
        this.notificationsDao = notificationsDao;
        this.privateNotificationsDao = privateNotificationsDao;
        this.messageStateDao = messageStateDao;
        this.badgeCounterRepository = badgeCounterRepository;
        this.coroutineDispatcher = coroutineDispatcher;
        this.coroutineScope = C30069i0.m92780a(coroutineDispatcher);
        this.userNotificationIdsCache = CollectionsKt.emptyList();
        dashSecureManager.mo39493a(this);
    }

    private final boolean hasDashDocument(String messageId) {
        InterfaceC27942e<NotificationDTO> notification = this.notificationsDao.getNotification(messageId);
        return (notification != null ? (NotificationDTO) CollectionsKt.firstOrNull((List) notification) : null) != null;
    }

    private final boolean hasDashSecureDocument(String messageId) {
        InterfaceC27942e<NotificationDTO> interfaceC27942eM39429d = this.privateNotificationsDao.m39429d(messageId);
        return (interfaceC27942eM39429d != null ? (NotificationDTO) CollectionsKt.firstOrNull((List) interfaceC27942eM39429d) : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalClearNotificationIdsCache() {
        this.userNotificationIdsCache = CollectionsKt.emptyList();
        internalUpdateBadgeDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalReloadNotificationIdsCache() {
        List<NotificationItemDTO> listEmptyList;
        NotificationListingDTO notificationListingDTO;
        List<NotificationItemDTO> list;
        InterfaceC27942e<NotificationListingDTO> interfaceC27942eM39428c = this.userNotificationsDao.m39428c();
        if (interfaceC27942eM39428c == null || (notificationListingDTO = (NotificationListingDTO) CollectionsKt.firstOrNull((List) interfaceC27942eM39428c)) == null || (list = notificationListingDTO.getList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            List<NotificationItemDTO> list2 = list;
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                listEmptyList.add(new NotificationItemDTO(((NotificationItemDTO) it.next()).getId()));
            }
        }
        this.userNotificationIdsCache = listEmptyList;
        internalUpdateBadgeDisplay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalUpdateBadgeDisplay() {
        Iterator<T> it = this.userNotificationIdsCache.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String id2 = ((NotificationItemDTO) it.next()).getId();
            if (id2 != null && (hasDashDocument(id2) || hasDashSecureDocument(id2))) {
                if (!isMessageRead(id2)) {
                    i10++;
                }
            }
        }
        this.badgeCounterRepository.mo62130d(new BadgeCounter(C20564f.BADGE_IN_NOTIFICATION_CENTER, i10, null, 4, null));
    }

    private final boolean isMessageRead(String messageId) {
        InterfaceC27942e<MessageStateDTO> interfaceC27942eM39429d = this.messageStateDao.m39429d(messageId);
        MessageStateDTO messageStateDTO = interfaceC27942eM39429d != null ? (MessageStateDTO) CollectionsKt.firstOrNull((List) interfaceC27942eM39429d) : null;
        return messageStateDTO != null && messageStateDTO.getStatus().isRead();
    }

    @Override // com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManager
    public boolean notificationIdsCacheContains(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        List<NotificationItemDTO> list = this.userNotificationIdsCache;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((NotificationItemDTO) it.next()).getId(), notificationId)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.disney.wdpro.dash.dash_secure.InterfaceC9481k
    public void onDatabaseAvailable() {
        C30113j.m92948d(this.coroutineScope, null, null, new C118041(null), 3, null);
    }

    @Override // com.disney.wdpro.dash.dash_secure.InterfaceC9481k
    public void onDatabaseRemoved() {
        C30113j.m92948d(this.coroutineScope, null, null, new C118051(null), 3, null);
    }

    @Override // com.disney.wdpro.dash.dash_secure.InterfaceC9481k
    public void onFailedDatabaseInitialization() {
        C30113j.m92948d(this.coroutineScope, null, null, new C118061(null), 3, null);
    }

    @Override // com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManager
    public void reloadUserNotificationIdsCache() {
        C30113j.m92948d(this.coroutineScope, null, null, new C118071(null), 3, null);
    }

    @Override // com.disney.wdpro.flutter.park.badging.NotificationCenterBadgeManager
    public void updateBadgeDisplay() {
        C30113j.m92948d(this.coroutineScope, null, null, new C118081(null), 3, null);
    }
}