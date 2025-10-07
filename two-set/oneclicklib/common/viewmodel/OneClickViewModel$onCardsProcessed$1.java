package com.disney.wdpro.oneclicklib.common.viewmodel;

import com.disney.wdpro.payments.models.BaseCardDetails;
import com.disney.wdpro.payments.models.ProcessedCards;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel$onCardsProcessed$1", m92053f = "OneClickViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes3.dex */
final class OneClickViewModel$onCardsProcessed$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProcessedCards $cards;
    int label;
    final /* synthetic */ OneClickViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickViewModel$onCardsProcessed$1(ProcessedCards processedCards, OneClickViewModel oneClickViewModel, Continuation<? super OneClickViewModel$onCardsProcessed$1> continuation) {
        super(2, continuation);
        this.$cards = processedCards;
        this.this$0 = oneClickViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneClickViewModel$onCardsProcessed$1(this.$cards, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(this.$cards.getApproved().entrySet());
        BaseCardDetails baseCardDetails = entry != null ? (BaseCardDetails) entry.getValue() : null;
        if (baseCardDetails == null) {
            this.this$0.generateGeneralPaymentError();
            return Unit.INSTANCE;
        }
        if (baseCardDetails.getConfirmation().get("confirmationCode") == null) {
            this.this$0.generateGeneralPaymentError();
            return Unit.INSTANCE;
        }
        if (baseCardDetails.getConfirmation().get("issuerAuthCode") == null) {
            this.this$0.generateGeneralPaymentError();
            return Unit.INSTANCE;
        }
        this.this$0.m56530y();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((OneClickViewModel$onCardsProcessed$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}