package com.disney.wdpro.async_messaging.activities;

import com.liveperson.infra.auth.C23924a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p768n9.InterfaceC30634g;

@Metadata(m92037d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m92038d2 = {"<anonymous>", "", "jwt", ""}, m92039k = 3, m92040mv = {2, 0, 0}, m92042xi = 48)
@DebugMetadata(m92052c = "com.disney.wdpro.async_messaging.activities.LiveChatActivity$observeViews$5$1", m92053f = "LiveChatActivity.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes24.dex */
final class LiveChatActivity$observeViews$5$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveChatActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveChatActivity$observeViews$5$1(LiveChatActivity liveChatActivity, Continuation<? super LiveChatActivity$observeViews$5$1> continuation) {
        super(2, continuation);
        this.this$0 = liveChatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveChatActivity$observeViews$5$1 liveChatActivity$observeViews$5$1 = new LiveChatActivity$observeViews$5$1(this.this$0, continuation);
        liveChatActivity$observeViews$5$1.L$0 = obj;
        return liveChatActivity$observeViews$5$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) this.L$0;
        if (str != null) {
            InterfaceC30634g interfaceC30634gM37789m0 = this.this$0.m37789m0();
            C23924a c23924aM75902m = new C23924a().m75902m(str);
            Intrinsics.checkNotNullExpressionValue(c23924aM75902m, "setHostAppJWT(...)");
            interfaceC30634gM37789m0.mo94432e(c23924aM75902m);
        } else {
            this.this$0.m37763G0();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((LiveChatActivity$observeViews$5$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}