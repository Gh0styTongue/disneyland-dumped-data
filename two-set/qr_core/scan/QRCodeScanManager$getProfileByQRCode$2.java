package com.disney.wdpro.qr_core.scan;

import com.disney.wdpro.qr_core.QRCodeException;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;
import p1045wm.GetProfileByQRCodeResponse;
import p1081xm.InterfaceC33258a;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lwm/a;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lwm/a;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.qr_core.scan.QRCodeScanManager$getProfileByQRCode$2", m92053f = "QRCodeScanManager.kt", m92054i = {}, m92055l = {48}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
@Instrumented
/* loaded from: classes16.dex */
final class QRCodeScanManager$getProfileByQRCode$2 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super GetProfileByQRCodeResponse>, Object> {
    final /* synthetic */ String $qrCode;
    int label;
    final /* synthetic */ QRCodeScanManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRCodeScanManager$getProfileByQRCode$2(String str, QRCodeScanManager qRCodeScanManager, Continuation<? super QRCodeScanManager$getProfileByQRCode$2> continuation) {
        super(2, continuation);
        this.$qrCode = str;
        this.this$0 = qRCodeScanManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRCodeScanManager$getProfileByQRCode$2(this.$qrCode, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws QRCodeException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GetProfileByQRCodeResponse getProfileByQRCodeResponse = (GetProfileByQRCodeResponse) obj;
                LogInstrumentation.m79024d(QRCodeScanManager.TAG, "    Response: " + getProfileByQRCodeResponse);
                return getProfileByQRCodeResponse;
            }
            ResultKt.throwOnFailure(obj);
            LogInstrumentation.m79024d(QRCodeScanManager.TAG, "getMinProfile(qrCode: " + this.$qrCode + "):");
            InterfaceC33258a unused = this.this$0.qrClient;
            QRCodeScanManager.m60946a(this.this$0);
            throw null;
        } catch (Exception e10) {
            throw this.this$0.m60953j(e10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super GetProfileByQRCodeResponse> continuation) {
        return ((QRCodeScanManager$getProfileByQRCode$2) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}