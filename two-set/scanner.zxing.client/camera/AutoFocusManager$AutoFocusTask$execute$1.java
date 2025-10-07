package com.disney.wdpro.scanner.zxing.client.camera;

import com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager;
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
@DebugMetadata(m92052c = "com.disney.wdpro.scanner.zxing.client.camera.AutoFocusManager$AutoFocusTask$execute$1", m92053f = "AutoFocusManager.kt", m92054i = {}, m92055l = {103}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes17.dex */
final class AutoFocusManager$AutoFocusTask$execute$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AutoFocusManager.AutoFocusTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoFocusManager$AutoFocusTask$execute$1(AutoFocusManager.AutoFocusTask autoFocusTask, Continuation<? super AutoFocusManager$AutoFocusTask$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = autoFocusTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoFocusManager$AutoFocusTask$execute$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AutoFocusManager.AutoFocusTask autoFocusTask = this.this$0;
            this.label = 1;
            if (autoFocusTask.doInBackground(this) == coroutine_suspended) {
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
        return ((AutoFocusManager$AutoFocusTask$execute$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}