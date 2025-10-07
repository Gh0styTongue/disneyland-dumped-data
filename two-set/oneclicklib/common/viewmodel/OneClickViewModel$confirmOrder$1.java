package com.disney.wdpro.oneclicklib.common.viewmodel;

import androidx.view.C3819u0;
import com.snap.camerakit.internal.h76;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;
import kotlinx.coroutines.InterfaceC30126m0;
import p878qk.AbstractC31721d;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$confirmOrder$1", m92053f = "OneClickViewModel.kt", m92054i = {}, m92055l = {h76.REGISTRATION_SERVER_DNU_FIELD_NUMBER}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes3.dex */
final class OneClickViewModel$confirmOrder$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneClickViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickViewModel$confirmOrder$1(OneClickViewModel oneClickViewModel, Continuation<? super OneClickViewModel$confirmOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = oneClickViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickViewModel$confirmOrder$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC30126m0 interfaceC30126m0M92946b = C30113j.m92946b(C3819u0.m20261a(this.this$0), this.this$0.coroutineContextOneClick, null, new OneClickViewModel$confirmOrder$1$confirmOrderRequest$1(this.this$0, null), 2, null);
            this.label = 1;
            obj = interfaceC30126m0M92946b.mo92975k(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.m56498L((AbstractC31721d) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((OneClickViewModel$confirmOrder$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}