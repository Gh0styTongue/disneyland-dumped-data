package com.disney.wdpro.lambdareportinglib;

import androidx.view.InterfaceC3785d0;
import androidx.view.InterfaceC3814s;
import androidx.work.WorkInfo;
import com.disney.wdpro.dlog.C10159d;
import com.disney.wdpro.photopass.services.model.lambdareporting.AnalyticsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.lambdareportinglib.LambdaReportingManager$sendAnalytics$1", m92053f = "LambdaReportingManager.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes29.dex */
final class LambdaReportingManager$sendAnalytics$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3814s $lifecycleOwner;
    final /* synthetic */ InterfaceC3785d0<WorkInfo> $observer;
    final /* synthetic */ String $payload;
    int label;
    final /* synthetic */ LambdaReportingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LambdaReportingManager$sendAnalytics$1(String str, LambdaReportingManager lambdaReportingManager, InterfaceC3814s interfaceC3814s, InterfaceC3785d0<WorkInfo> interfaceC3785d0, Continuation<? super LambdaReportingManager$sendAnalytics$1> continuation) {
        super(2, continuation);
        this.$payload = str;
        this.this$0 = lambdaReportingManager;
        this.$lifecycleOwner = interfaceC3814s;
        this.$observer = interfaceC3785d0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LambdaReportingManager$sendAnalytics$1(this.$payload, this.this$0, this.$lifecycleOwner, this.$observer, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (StringsKt.isBlank(this.$payload)) {
            return Unit.INSTANCE;
        }
        long jM29661d = this.this$0.analyticsRepository.m29661d(this.$payload);
        AnalyticsResponse analyticsResponseM29662e = this.this$0.analyticsRepository.m29662e(CollectionsKt.listOf(this.$payload));
        if (analyticsResponseM29662e instanceof AnalyticsResponse.Success ? true : Intrinsics.areEqual(analyticsResponseM29662e, AnalyticsResponse.BadRequest.INSTANCE)) {
            this.this$0.analyticsRepository.m29659b(jM29661d);
        } else if (analyticsResponseM29662e instanceof AnalyticsResponse.ServiceError) {
            Exception exception = ((AnalyticsResponse.ServiceError) analyticsResponseM29662e).getException();
            if (exception != null) {
                Boxing.boxInt(C10159d.m40014b(exception.getMessage(), new Object[0]));
            }
            this.this$0.m55856c(jM29661d, this.$lifecycleOwner, this.$observer);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((LambdaReportingManager$sendAnalytics$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}