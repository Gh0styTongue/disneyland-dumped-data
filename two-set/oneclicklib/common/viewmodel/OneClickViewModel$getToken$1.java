package com.disney.wdpro.oneclicklib.common.viewmodel;

import android.accounts.AuthenticatorException;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C30064h;
import kotlinx.coroutines.InterfaceC30065h0;
import p878qk.AbstractC31719b;
import p878qk.OneClickToken;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$getToken$1", m92053f = "OneClickViewModel.kt", m92054i = {}, m92055l = {101}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes3.dex */
final class OneClickViewModel$getToken$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $reAuthentication;
    int label;
    final /* synthetic */ OneClickViewModel this$0;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$getToken$1$1", m92053f = "OneClickViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$getToken$1$1 */
    static final class C166121 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $reAuthentication;
        int label;
        final /* synthetic */ OneClickViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C166121(OneClickViewModel oneClickViewModel, boolean z10, Continuation<? super C166121> continuation) {
            super(2, continuation);
            this.this$0 = oneClickViewModel;
            this.$reAuthentication = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C166121(this.this$0, this.$reAuthentication, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws AuthenticatorException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AuthenticationManager authenticationManager = this.this$0.oauthManager;
            String userSwid = this.this$0.oauthManager.getUserSwid();
            if (userSwid == null) {
                userSwid = "";
            }
            String authToken = authenticationManager.getAuthToken("com.disney.android.guest", userSwid, false);
            if (authToken != null) {
                this.this$0._token.postValue(new OneClickToken(authToken, this.$reAuthentication));
            } else {
                OneClickViewModel.m56500b0(this.this$0, null, new AbstractC31719b.ClassicBanner(null, 1, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C166121) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickViewModel$getToken$1(OneClickViewModel oneClickViewModel, boolean z10, Continuation<? super OneClickViewModel$getToken$1> continuation) {
        super(2, continuation);
        this.this$0 = oneClickViewModel;
        this.$reAuthentication = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickViewModel$getToken$1(this.this$0, this.$reAuthentication, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext coroutineContext = this.this$0.coroutineContextOneClick;
            C166121 c166121 = new C166121(this.this$0, this.$reAuthentication, null);
            this.label = 1;
            if (C30064h.m92775g(coroutineContext, c166121, this) == coroutine_suspended) {
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
        return ((OneClickViewModel$getToken$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}