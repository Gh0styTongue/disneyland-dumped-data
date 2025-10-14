package com.disney.wdpro.async_messaging.activities;

import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.C8665e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m92037d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m92038d2 = {"<anonymous>", "", "jwt", ""}, m92039k = 3, m92040mv = {2, 0, 0}, m92042xi = 48)
@DebugMetadata(m92052c = "com.disney.wdpro.async_messaging.activities.LiveChatActivity$obtainJWToken$1", m92053f = "LiveChatActivity.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes24.dex */
final class LiveChatActivity$obtainJWToken$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveChatActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveChatActivity$obtainJWToken$1(LiveChatActivity liveChatActivity, Continuation<? super LiveChatActivity$obtainJWToken$1> continuation) {
        super(2, continuation);
        this.this$0 = liveChatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveChatActivity$obtainJWToken$1 liveChatActivity$obtainJWToken$1 = new LiveChatActivity$obtainJWToken$1(this.this$0, continuation);
        liveChatActivity$obtainJWToken$1.L$0 = obj;
        return liveChatActivity$obtainJWToken$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Fragment fragmentM37774i0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) this.L$0;
        if (str == null || (fragmentM37774i0 = this.this$0.m37774i0(str)) == null) {
            this.this$0.m37763G0();
        } else {
            this.this$0.navigate("", new C8665e.b(fragmentM37774i0).m37330h().build());
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((LiveChatActivity$obtainJWToken$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}