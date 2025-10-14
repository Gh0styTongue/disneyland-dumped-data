package com.disney.wdpro.async_messaging.activities;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.InterfaceC30021e;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m92038d2 = {"Lkotlinx/coroutines/flow/e;", "", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Throwable;)V"}, m92039k = 3, m92040mv = {2, 0, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.async_messaging.activities.LiveChatActivity$obtainJWToken$2", m92053f = "LiveChatActivity.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes24.dex */
final class LiveChatActivity$obtainJWToken$2 extends SuspendLambda implements Function3<InterfaceC30021e<? super String>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveChatActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveChatActivity$obtainJWToken$2(LiveChatActivity liveChatActivity, Continuation<? super LiveChatActivity$obtainJWToken$2> continuation) {
        super(3, continuation);
        this.this$0 = liveChatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m37763G0();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC30021e<? super String> interfaceC30021e, Throwable th2, Continuation<? super Unit> continuation) {
        LiveChatActivity$obtainJWToken$2 liveChatActivity$obtainJWToken$2 = new LiveChatActivity$obtainJWToken$2(this.this$0, continuation);
        liveChatActivity$obtainJWToken$2.L$0 = th2;
        return liveChatActivity$obtainJWToken$2.invokeSuspend(Unit.INSTANCE);
    }
}