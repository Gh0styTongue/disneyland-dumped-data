package com.disney.wdpro.scanner.zxing.client;

import com.disney.wdpro.scanner.zxing.client.InactivityTimer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 6, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.scanner.zxing.client.InactivityTimer$InactivityCoroutineTask$execute$1", m92053f = "InactivityTimer.kt", m92054i = {}, m92055l = {68}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes17.dex */
final class InactivityTimer$InactivityCoroutineTask$execute$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InactivityTimer.InactivityCoroutineTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InactivityTimer$InactivityCoroutineTask$execute$1(InactivityTimer.InactivityCoroutineTask inactivityCoroutineTask, Continuation<? super InactivityTimer$InactivityCoroutineTask$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = inactivityCoroutineTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InactivityTimer$InactivityCoroutineTask$execute$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InactivityTimer.InactivityCoroutineTask inactivityCoroutineTask = this.this$0;
            this.label = 1;
            if (inactivityCoroutineTask.doInBackground(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((InactivityTimer$InactivityCoroutineTask$execute$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}