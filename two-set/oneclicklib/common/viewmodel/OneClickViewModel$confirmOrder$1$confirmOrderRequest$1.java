package com.disney.wdpro.oneclicklib.common.viewmodel;

import com.disney.wdpro.photopass.services.model.titus.TitusOrder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;
import p878qk.AbstractC31721d;
import p914rk.C31920d;

@Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lqk/d;", "Lcom/disney/wdpro/photopass/services/model/titus/TitusOrder;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lqk/d;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$confirmOrder$1$confirmOrderRequest$1", m92053f = "OneClickViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes3.dex */
final class OneClickViewModel$confirmOrder$1$confirmOrderRequest$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super AbstractC31721d<? extends TitusOrder>>, Object> {
    int label;
    final /* synthetic */ OneClickViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickViewModel$confirmOrder$1$confirmOrderRequest$1(OneClickViewModel oneClickViewModel, Continuation<? super OneClickViewModel$confirmOrder$1$confirmOrderRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = oneClickViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickViewModel$confirmOrder$1$confirmOrderRequest$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super AbstractC31721d<? extends TitusOrder>> continuation) {
        return invoke2(interfaceC30065h0, (Continuation<? super AbstractC31721d<TitusOrder>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C31920d.INSTANCE.m98090a(this.this$0.m56514H());
        OneClickViewModel.m56503v(this.this$0);
        this.this$0.m56513G().getOrderId();
        throw null;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC30065h0 interfaceC30065h0, Continuation<? super AbstractC31721d<TitusOrder>> continuation) {
        return ((OneClickViewModel$confirmOrder$1$confirmOrderRequest$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}