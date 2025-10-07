package com.disney.wdpro.experiences;

import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {2, 0, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.experiences.HybridExperiencesActivity$loadHybridConfigURL$2", m92053f = "HybridExperiencesActivity.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes27.dex */
final class HybridExperiencesActivity$loadHybridConfigURL$2 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $tokens;
    int label;
    final /* synthetic */ HybridExperiencesActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridExperiencesActivity$loadHybridConfigURL$2(HybridExperiencesActivity hybridExperiencesActivity, Map<String, String> map, Continuation<? super HybridExperiencesActivity$loadHybridConfigURL$2> continuation) {
        super(2, continuation);
        this.this$0 = hybridExperiencesActivity;
        this.$tokens = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HybridExperiencesActivity$loadHybridConfigURL$2(this.this$0, this.$tokens, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HybridCoordinator hybridCoordinator = this.this$0.coordinator;
        if (hybridCoordinator != null) {
            hybridCoordinator.load("woc70", this.$tokens);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((HybridExperiencesActivity$loadHybridConfigURL$2) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}