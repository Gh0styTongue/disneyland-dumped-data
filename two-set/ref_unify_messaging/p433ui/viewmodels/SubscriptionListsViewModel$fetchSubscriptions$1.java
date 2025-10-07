package com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.ref_unify_messaging.model.C20029b;
import com.disney.wdpro.ref_unify_messaging.p433ui.viewmodels.SubscriptionListsViewModel;
import hn.NotificationPreferenceDTO;
import hn.NotificationPreferenceInfoDTO;
import hn.NotificationPreferenceResponseBody;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.ref_unify_messaging.ui.viewmodels.SubscriptionListsViewModel$fetchSubscriptions$1", m92053f = "SubscriptionListsViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
@SourceDebugExtension({"SMAP\nSubscriptionListsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionListsViewModel.kt\ncom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$fetchSubscriptions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1549#2:148\n1620#2,3:149\n1045#2:152\n*S KotlinDebug\n*F\n+ 1 SubscriptionListsViewModel.kt\ncom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$fetchSubscriptions$1\n*L\n57#1:148\n57#1:149,3\n61#1:152\n*E\n"})
/* loaded from: classes28.dex */
final class SubscriptionListsViewModel$fetchSubscriptions$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SubscriptionListsViewModel this$0;

    @Metadata(m92037d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m92038d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SubscriptionListsViewModel.kt\ncom/disney/wdpro/ref_unify_messaging/ui/viewmodels/SubscriptionListsViewModel$fetchSubscriptions$1\n*L\n1#1,328:1\n61#2:329\n*E\n"})
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.viewmodels.SubscriptionListsViewModel$fetchSubscriptions$1$a */
    public static final class C20047a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.compareValues(((C20029b) t10).getDisplayName(), ((C20029b) t11).getDisplayName());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionListsViewModel$fetchSubscriptions$1(SubscriptionListsViewModel subscriptionListsViewModel, Continuation<? super SubscriptionListsViewModel$fetchSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionListsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionListsViewModel$fetchSubscriptions$1(this.this$0, continuation);
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
        SubscriptionListsViewModel subscriptionListsViewModel = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            C13352x<NotificationPreferenceResponseBody> c13352xM88156a = subscriptionListsViewModel.mobileNotificationApiClient.m88156a();
            NotificationPreferenceResponseBody notificationPreferenceResponseBodyM55683c = c13352xM88156a != null ? c13352xM88156a.m55683c() : null;
            List<Object> listM88793a = notificationPreferenceResponseBodyM55683c != null ? notificationPreferenceResponseBodyM55683c.m88793a() : null;
            if (listM88793a != null && !listM88793a.isEmpty()) {
                throw new Exception("mobileNotificationApiClient.getMobileNotificationPreferences returned errors.");
            }
            if (notificationPreferenceResponseBodyM55683c != null && (notificationInfo = notificationPreferenceResponseBodyM55683c.getNotificationInfo()) != null && (listM88792a = notificationInfo.m88792a()) != null) {
                List<NotificationPreferenceDTO> list = listM88792a;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (NotificationPreferenceDTO notificationPreferenceDTO : list) {
                    arrayList.add(new C20029b(notificationPreferenceDTO.getId(), notificationPreferenceDTO.getName(), notificationPreferenceDTO.getDisplayName(), notificationPreferenceDTO.getDescription(), notificationPreferenceDTO.getIsGuestSelected()));
                }
                subscriptionListsViewModel._subscriptionLists.postValue(CollectionsKt.sortedWith(arrayList, new C20047a()));
            }
            subscriptionListsViewModel._loading.postValue(Boxing.boxBoolean(false));
            objM104756constructorimpl = Result.m104756constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM104756constructorimpl = Result.m104756constructorimpl(ResultKt.createFailure(th2));
        }
        SubscriptionListsViewModel subscriptionListsViewModel2 = this.this$0;
        Throwable thM104759exceptionOrNullimpl = Result.m104759exceptionOrNullimpl(objM104756constructorimpl);
        if (thM104759exceptionOrNullimpl != null) {
            subscriptionListsViewModel2.crashHelper.recordHandledException(new Exception("Error calling mobileNotificationApiClient.getMobileNotificationPreferences: " + thM104759exceptionOrNullimpl.getMessage()));
            subscriptionListsViewModel2._error.postValue(new SubscriptionListsViewModel.C20046a(SubscriptionListsViewModel.SubscriptionListsErrorType.FETCH_FAILED, subscriptionListsViewModel2.context));
            subscriptionListsViewModel2._loading.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((SubscriptionListsViewModel$fetchSubscriptions$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}