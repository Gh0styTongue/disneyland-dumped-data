package com.disney.wdpro.mblecore.data.manager;

import com.disney.wdpro.mblecore.data.storage.TokenDao;
import com.disney.wdpro.mblecore.data.storage.TokenDatabase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/mblecore/data/storage/TokenDao;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/mblecore/data/storage/TokenDao;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl$getTokenDao$token$1", m92053f = "MbleDataManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes2.dex */
final class MbleDataManagerImpl$getTokenDao$token$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super TokenDao>, Object> {
    int label;
    final /* synthetic */ MbleDataManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MbleDataManagerImpl$getTokenDao$token$1(MbleDataManagerImpl mbleDataManagerImpl, Continuation<? super MbleDataManagerImpl$getTokenDao$token$1> continuation) {
        super(2, continuation);
        this.this$0 = mbleDataManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MbleDataManagerImpl$getTokenDao$token$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TokenDatabase.INSTANCE.getInstance(this.this$0.getContext()).tokenDao();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super TokenDao> continuation) {
        return ((MbleDataManagerImpl$getTokenDao$token$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}