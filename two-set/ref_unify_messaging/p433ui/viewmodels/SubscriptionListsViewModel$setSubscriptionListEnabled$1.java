package com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels.SubscriptionListsViewModel;
import hn.NotificationSelectionsResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.ref_unify_messaging.ui.viewmodels.SubscriptionListsViewModel$setSubscriptionListEnabled$1", m92053f = "SubscriptionListsViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes28.dex */
final class SubscriptionListsViewModel$setSubscriptionListEnabled$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ C20029b $item;
    int label;
    final /* synthetic */ SubscriptionListsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionListsViewModel$setSubscriptionListEnabled$1(boolean z10, SubscriptionListsViewModel subscriptionListsViewModel, C20029b c20029b, Continuation<? super SubscriptionListsViewModel$setSubscriptionListEnabled$1> continuation) {
        super(2, continuation);
        this.$checked = z10;
        this.this$0 = subscriptionListsViewModel;
        this.$item = c20029b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionListsViewModel$setSubscriptionListEnabled$1(this.$checked, this.this$0, this.$item, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM104756constructorimpl;
        C13352x<NotificationSelectionsResponseBody> c13352xM88157b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z10 = this.$checked;
        SubscriptionListsViewModel subscriptionListsViewModel = this.this$0;
        C20029b c20029b = this.$item;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (z10) {
                c13352xM88157b = subscriptionListsViewModel.mobileNotificationApiClient.m88157b(c20029b.getId(), true);
                subscriptionListsViewModel.analyticsCacheUiPreference.m86098a(c20029b.getId(), c20029b.getName());
            } else {
                c13352xM88157b = subscriptionListsViewModel.mobileNotificationApiClient.m88157b(c20029b.getId(), false);
                subscriptionListsViewModel.analyticsCacheUiPreference.m86103g(c20029b.getId());
            }
            NotificationSelectionsResponseBody notificationSelectionsResponseBodyM55683c = c13352xM88157b.m55683c();
            List<Object> listM88795a = notificationSelectionsResponseBodyM55683c != null ? notificationSelectionsResponseBodyM55683c.m88795a() : null;
            if (listM88795a != null && !listM88795a.isEmpty()) {
                throw new Exception("mobileNotificationApiClient.updateMobileNotificationPreferences returned errors.");
            }
            subscriptionListsViewModel._loading.postValue(Boxing.boxBoolean(false));
            subscriptionListsViewModel.m61439H(c20029b, z10);
            objM104756constructorimpl = Result.m104756constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM104756constructorimpl = Result.m104756constructorimpl(ResultKt.createFailure(th2));
        }
        SubscriptionListsViewModel subscriptionListsViewModel2 = this.this$0;
        C20029b c20029b2 = this.$item;
        Throwable thM104759exceptionOrNullimpl = Result.m104759exceptionOrNullimpl(objM104756constructorimpl);
        if (thM104759exceptionOrNullimpl != null) {
            subscriptionListsViewModel2.crashHelper.recordHandledException(new Exception("Error calling mobileNotificationApiClient.updateMobileNotificationPreferences: " + thM104759exceptionOrNullimpl.getMessage()));
            subscriptionListsViewModel2._errorItem.postValue(c20029b2);
            subscriptionListsViewModel2._error.postValue(new SubscriptionListsViewModel.C20046a(SubscriptionListsViewModel.SubscriptionListsErrorType.UPDATE_FAILED, subscriptionListsViewModel2.context));
            subscriptionListsViewModel2._loading.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((SubscriptionListsViewModel$setSubscriptionListEnabled$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}