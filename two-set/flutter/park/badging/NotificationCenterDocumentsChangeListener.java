package com.disney.wdpro.flutter.park.badging;

import com.disney.wdpro.commons.p077di.AbstractC9295d;
import com.disney.wdpro.dash.couchbase.InterfaceC9404h;
import com.disney.wdpro.dash.util.C9501c;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC30065h0;
import p707kl.C29588a;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/badging/NotificationCenterDocumentsChangeListener;", "Lcom/disney/wdpro/dash/couchbase/h;", "Ljavax/inject/Provider;", "Lcom/disney/wdpro/flutter/park/badging/NotificationCenterBadgeManager;", "notificationCenterBadgeManager", "Lcom/disney/wdpro/dash/util/c;", "cbAuthStorage", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "fullDocId", "", "isNotificationStateDocIdInUserNotificationIdsCache", "(Ljava/lang/String;)Z", "isPublicNotificationContentDocIdInUserNotificationIdsCache", "isPrivateNotificationContentDocIdInUserNotificationIdsCache", C29588a.DOC_ID_KEY, "isNotificationsListingDoc", "isNotificationStateDoc", "(Ljava/lang/String;)Ljava/lang/String;", "isPublicNotificationContentDoc", "isPrivateNotificationContentDoc", "", "documentIds", "", "collectionChanged", "(Ljava/util/List;)V", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/h0;", "coroutineScope", "Lkotlinx/coroutines/h0;", "Companion", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class NotificationCenterDocumentsChangeListener implements InterfaceC9404h {
    public static final String EXP_CHANNEL_NAME = "exp";
    public static final String MESSAGE_LISTING_DOC_NAME = "notifications";
    public static final String MESSAGE_STATE_CHANNEL_NAME = "userdata";
    public static final String NOTIFICATION_CENTER_PUBLIC_CHANNEL_NAME = "notification-center";
    private final Provider<C9501c> cbAuthStorage;
    private final CoroutineDispatcher coroutineDispatcher;
    private final InterfaceC30065h0 coroutineScope;
    private final Provider<NotificationCenterBadgeManager> notificationCenterBadgeManager;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.flutter.park.badging.NotificationCenterDocumentsChangeListener$collectionChanged$1", m92053f = "NotificationCenterDocumentsChangeListener.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.flutter.park.badging.NotificationCenterDocumentsChangeListener$collectionChanged$1 */
    static final class C118091 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $documentIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C118091(List<String> list, Continuation<? super C118091> continuation) {
            super(2, continuation);
            this.$documentIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationCenterDocumentsChangeListener.this.new C118091(this.$documentIds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((C9501c) NotificationCenterDocumentsChangeListener.this.cbAuthStorage.get()).m39642b().get()) {
                boolean zIsPrivateNotificationContentDocIdInUserNotificationIdsCache = false;
                for (String str : this.$documentIds) {
                    if (!NotificationCenterDocumentsChangeListener.this.isNotificationsListingDoc(str)) {
                        zIsPrivateNotificationContentDocIdInUserNotificationIdsCache = (NotificationCenterDocumentsChangeListener.this.isNotificationStateDocIdInUserNotificationIdsCache(str) || NotificationCenterDocumentsChangeListener.this.isPublicNotificationContentDocIdInUserNotificationIdsCache(str)) ? true : NotificationCenterDocumentsChangeListener.this.isPrivateNotificationContentDocIdInUserNotificationIdsCache(str);
                        if (zIsPrivateNotificationContentDocIdInUserNotificationIdsCache) {
                            break;
                        }
                    } else {
                        ((NotificationCenterBadgeManager) NotificationCenterDocumentsChangeListener.this.notificationCenterBadgeManager.get()).reloadUserNotificationIdsCache();
                    }
                }
                if (zIsPrivateNotificationContentDocIdInUserNotificationIdsCache) {
                    ((NotificationCenterBadgeManager) NotificationCenterDocumentsChangeListener.this.notificationCenterBadgeManager.get()).updateBadgeDisplay();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C118091) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public NotificationCenterDocumentsChangeListener(Provider<NotificationCenterBadgeManager> notificationCenterBadgeManager, Provider<C9501c> cbAuthStorage, @Named(AbstractC9295d.IO_DISPATCHER) CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(notificationCenterBadgeManager, "notificationCenterBadgeManager");
        Intrinsics.checkNotNullParameter(cbAuthStorage, "cbAuthStorage");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.notificationCenterBadgeManager = notificationCenterBadgeManager;
        this.cbAuthStorage = cbAuthStorage;
        this.coroutineDispatcher = coroutineDispatcher;
        this.coroutineScope = C30069i0.m92780a(coroutineDispatcher);
    }

    private final String isNotificationStateDoc(String docId) {
        MatchGroup matchGroup;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("\\{.+\\}\\.[a-z]+\\.userdata\\..+\\..+\\.(.+)"), docId, 0, 2, null);
        if (matchResultFind$default == null || (matchGroup = matchResultFind$default.getGroups().get(1)) == null) {
            return null;
        }
        return matchGroup.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotificationStateDocIdInUserNotificationIdsCache(String fullDocId) {
        String strIsNotificationStateDoc = isNotificationStateDoc(fullDocId);
        if (strIsNotificationStateDoc != null) {
            return this.notificationCenterBadgeManager.get().notificationIdsCacheContains(strIsNotificationStateDoc);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNotificationsListingDoc(String docId) {
        return new Regex("\\{.+\\}\\.[a-z]+\\.exp\\..+\\..+\\.notifications").matches(docId);
    }

    private final String isPrivateNotificationContentDoc(String docId) {
        MatchGroup matchGroup;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("[a-z]+\\.exp\\..+\\..+\\.(.+)"), docId, 0, 2, null);
        if (matchResultFind$default == null || (matchGroup = matchResultFind$default.getGroups().get(1)) == null) {
            return null;
        }
        return matchGroup.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPrivateNotificationContentDocIdInUserNotificationIdsCache(String fullDocId) {
        String strIsPrivateNotificationContentDoc = isPrivateNotificationContentDoc(fullDocId);
        if (strIsPrivateNotificationContentDoc != null) {
            return this.notificationCenterBadgeManager.get().notificationIdsCacheContains(strIsPrivateNotificationContentDoc);
        }
        return false;
    }

    private final String isPublicNotificationContentDoc(String docId) {
        MatchGroup matchGroup;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("[a-z]+\\.notification-center\\..+\\..+\\.(.+)"), docId, 0, 2, null);
        if (matchResultFind$default == null || (matchGroup = matchResultFind$default.getGroups().get(1)) == null) {
            return null;
        }
        return matchGroup.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublicNotificationContentDocIdInUserNotificationIdsCache(String fullDocId) {
        String strIsPublicNotificationContentDoc = isPublicNotificationContentDoc(fullDocId);
        if (strIsPublicNotificationContentDoc != null) {
            return this.notificationCenterBadgeManager.get().notificationIdsCacheContains(strIsPublicNotificationContentDoc);
        }
        return false;
    }

    @Override // com.disney.wdpro.dash.couchbase.InterfaceC9404h
    public void collectionChanged(List<String> documentIds) {
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        C30113j.m92948d(this.coroutineScope, null, null, new C118091(documentIds, null), 3, null);
    }
}