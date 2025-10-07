package com.disney.wdpro.qr_core.display.data;

import com.disney.wdpro.qr_core.QRCodeError;
import com.disney.wdpro.qr_core.QRCodeException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;
import retrofit2.HttpException;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/qr_core/display/data/b;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/qr_core/display/data/b;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.qr_core.display.data.QRCodeDisplayManager$getQRCode$2", m92053f = "QRCodeDisplayManager.kt", m92054i = {}, m92055l = {37}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes16.dex */
final class QRCodeDisplayManager$getQRCode$2 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super QRCodeData>, Object> {
    int label;
    final /* synthetic */ QRCodeDisplayManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRCodeDisplayManager$getQRCode$2(QRCodeDisplayManager qRCodeDisplayManager, Continuation<? super QRCodeDisplayManager$getQRCode$2> continuation) {
        super(2, continuation);
        this.this$0 = qRCodeDisplayManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRCodeDisplayManager$getQRCode$2(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws QRCodeException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            QRCodeDisplayManager.m60863a(this.this$0);
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.throwOnFailure(obj);
            QRCodeData qRCodeData = (QRCodeData) obj;
            if (qRCodeData != null) {
                return qRCodeData;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (IOException e10) {
            throw new QRCodeException(QRCodeError.NETWORK_ERROR, "Something went wrong", e10);
        } catch (IllegalArgumentException e11) {
            throw new QRCodeException(QRCodeError.ILLEGAL_ARGUMENT, "Unexpected null", e11);
        } catch (HttpException unused) {
            throw new QRCodeException(QRCodeError.UNKNOWN, "Something went wrong", null, 4, null);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super QRCodeData> continuation) {
        return ((QRCodeDisplayManager$getQRCode$2) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}