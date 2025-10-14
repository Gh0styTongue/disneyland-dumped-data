package com.disney.wdpro.async_messaging.viewmodels;

import android.accounts.AuthenticatorException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.InterfaceC30021e;

@Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m92038d2 = {"Lkotlinx/coroutines/flow/e;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/e;)V"}, m92039k = 3, m92040mv = {2, 0, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.async_messaging.viewmodels.LiveChatViewModel$jwtFlow$1", m92053f = "LiveChatViewModel.kt", m92054i = {}, m92055l = {103}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes24.dex */
final class LiveChatViewModel$jwtFlow$1 extends SuspendLambda implements Function2<InterfaceC30021e<? super String>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveChatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveChatViewModel$jwtFlow$1(LiveChatViewModel liveChatViewModel, Continuation<? super LiveChatViewModel$jwtFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = liveChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveChatViewModel$jwtFlow$1 liveChatViewModel$jwtFlow$1 = new LiveChatViewModel$jwtFlow$1(this.this$0, continuation);
        liveChatViewModel$jwtFlow$1.L$0 = obj;
        return liveChatViewModel$jwtFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws AuthenticatorException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC30021e interfaceC30021e = (InterfaceC30021e) this.L$0;
            String strM37893D = this.this$0.m37893D();
            this.label = 1;
            if (interfaceC30021e.emit(strM37893D, this) == coroutine_suspended) {
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
    public final Object invoke(InterfaceC30021e<? super String> interfaceC30021e, Continuation<? super Unit> continuation) {
        return ((LiveChatViewModel$jwtFlow$1) create(interfaceC30021e, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}