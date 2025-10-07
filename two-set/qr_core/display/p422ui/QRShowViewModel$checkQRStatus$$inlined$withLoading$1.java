package com.disney.wdpro.qr_core.display.p422ui;

import androidx.view.C3783c0;
import com.disney.wdpro.qr_core.QRCodeException;
import com.disney.wdpro.qr_core.display.data.QRCodeDisplayManager;
import com.disney.wdpro.qr_core.display.data.QRStatus;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.qr_core.display.ui.QRShowViewModel$checkQRStatus$$inlined$withLoading$1", m92053f = "QRShowViewModel.kt", m92054i = {}, m92055l = {108}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
@SourceDebugExtension({"SMAP\nQRShowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRShowViewModel.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowViewModel$withLoading$1\n+ 2 QRShowViewModel.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowViewModel\n*L\n1#1,106:1\n74#2,7:107\n*E\n"})
/* loaded from: classes16.dex */
public final class QRShowViewModel$checkQRStatus$$inlined$withLoading$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AgeBand $ageBand$inlined;
    int label;
    final /* synthetic */ QRShowViewModel this$0;
    final /* synthetic */ QRShowViewModel this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRShowViewModel$checkQRStatus$$inlined$withLoading$1(QRShowViewModel qRShowViewModel, Continuation continuation, QRShowViewModel qRShowViewModel2, AgeBand ageBand) {
        super(2, continuation);
        this.this$0$inline_fun = qRShowViewModel;
        this.this$0 = qRShowViewModel2;
        this.$ageBand$inlined = ageBand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRShowViewModel$checkQRStatus$$inlined$withLoading$1(this.this$0$inline_fun, continuation, this.this$0, this.$ageBand$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    QRCodeDisplayManager qRCodeDisplayManager = this.this$0.manager;
                    AgeBand ageBand = this.$ageBand$inlined;
                    this.label = 1;
                    obj = qRCodeDisplayManager.m60864b(ageBand, null, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.mQRCodeStatus.postValue(Result.m104755boximpl(Result.m104756constructorimpl((QRStatus) obj)));
            } catch (QRCodeException e10) {
                C3783c0 c3783c0 = this.this$0.mQRCodeStatus;
                Result.Companion companion = Result.INSTANCE;
                c3783c0.postValue(Result.m104755boximpl(Result.m104756constructorimpl(ResultKt.createFailure(e10))));
            }
            this.this$0$inline_fun.mIsLoading.postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.this$0$inline_fun.mIsLoading.postValue(Boxing.boxBoolean(false));
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((QRShowViewModel$checkQRStatus$$inlined$withLoading$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}