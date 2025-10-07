package com.disney.wdpro.ref_unify_messaging.manager;

import hn.NotificationPreferenceDTO;
import hn.NotificationPreferenceInfoDTO;
import hn.NotificationPreferenceResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.ref_unify_messaging.manager.SubscriptionListsManager$fetchSubscriptions$1", m92053f = "SubscriptionListsManager.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes28.dex */
final class SubscriptionListsManager$fetchSubscriptions$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SubscriptionListsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionListsManager$fetchSubscriptions$1(SubscriptionListsManager subscriptionListsManager, Continuation<? super SubscriptionListsManager$fetchSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionListsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionListsManager$fetchSubscriptions$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM104756constructorimpl;
        NotificationPreferenceInfoDTO notificationInfo;
        List<NotificationPreferenceDTO> listM88792a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SubscriptionListsManager subscriptionListsManager = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            NotificationPreferenceResponseBody notificationPreferenceResponseBodyM55683c = subscriptionListsManager.mobileNotificationApiClient.m88156a().m55683c();
            Unit unit = null;
            List<Object> listM88793a = notificationPreferenceResponseBodyM55683c != null ? notificationPreferenceResponseBodyM55683c.m88793a() : null;
            if (listM88793a != null && !listM88793a.isEmpty()) {
                throw new Exception("mobileNotificationApiClient.getMobileNotificationPreferences returned errors.");
            }
            if (notificationPreferenceResponseBodyM55683c != null && (notificationInfo = notificationPreferenceResponseBodyM55683c.getNotificationInfo()) != null && (listM88792a = notificationInfo.m88792a()) != null) {
                subscriptionListsManager.analyticsCacheUiPreference.m86099b(listM88792a);
                subscriptionListsManager.m61389e(listM88792a);
                unit = Unit.INSTANCE;
            }
            objM104756constructorimpl = Result.m104756constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM104756constructorimpl = Result.m104756constructorimpl(ResultKt.createFailure(th2));
        }
        SubscriptionListsManager subscriptionListsManager2 = this.this$0;
        Throwable thM104759exceptionOrNullimpl = Result.m104759exceptionOrNullimpl(objM104756constructorimpl);
        if (thM104759exceptionOrNullimpl != null) {
            subscriptionListsManager2.crashHelper.recordHandledException(new Exception(thM104759exceptionOrNullimpl));
            thM104759exceptionOrNullimpl.getMessage();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((SubscriptionListsManager$fetchSubscriptions$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}