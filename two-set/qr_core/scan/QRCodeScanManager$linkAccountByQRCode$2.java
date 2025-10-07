package com.disney.wdpro.qr_core.scan;

import com.disney.wdpro.qr_core.QRCodeException;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;
import p1045wm.LinkAccountByQRCodeRequest;
import p1045wm.LinkAccountByQRCodeResponse;
import p1045wm.LinkedAccount;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lwm/d;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lwm/d;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.qr_core.scan.QRCodeScanManager$linkAccountByQRCode$2", m92053f = "QRCodeScanManager.kt", m92054i = {}, m92055l = {138}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
@Instrumented
/* loaded from: classes16.dex */
final class QRCodeScanManager$linkAccountByQRCode$2 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super LinkAccountByQRCodeResponse>, Object> {
    final /* synthetic */ AgeBand $ageBand;
    final /* synthetic */ LinkAccountByQRCodeRequest $linkAccountByQRCodeRequest;
    int label;
    final /* synthetic */ QRCodeScanManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRCodeScanManager$linkAccountByQRCode$2(QRCodeScanManager qRCodeScanManager, LinkAccountByQRCodeRequest linkAccountByQRCodeRequest, AgeBand ageBand, Continuation<? super QRCodeScanManager$linkAccountByQRCode$2> continuation) {
        super(2, continuation);
        this.this$0 = qRCodeScanManager;
        this.$linkAccountByQRCodeRequest = linkAccountByQRCodeRequest;
        this.$ageBand = ageBand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRCodeScanManager$linkAccountByQRCode$2(this.this$0, this.$linkAccountByQRCodeRequest, this.$ageBand, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws QRCodeException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            QRCodeScanManager.m60949d(this.this$0);
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.throwOnFailure(obj);
            LinkAccountByQRCodeResponse linkAccountByQRCodeResponse = (LinkAccountByQRCodeResponse) obj;
            LogInstrumentation.m79024d(QRCodeScanManager.TAG, "    Response: " + linkAccountByQRCodeResponse);
            List<LinkedAccount> listM100554b = linkAccountByQRCodeResponse.m100554b();
            String value = listM100554b.get(0).getValue();
            String value2 = listM100554b.get(1).getValue();
            LogInstrumentation.m79024d(QRCodeScanManager.TAG, "        Parent SWID: " + value2);
            LogInstrumentation.m79024d(QRCodeScanManager.TAG, "        Child SWID: " + value);
            return linkAccountByQRCodeResponse;
        } catch (Exception e10) {
            throw this.this$0.m60953j(e10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super LinkAccountByQRCodeResponse> continuation) {
        return ((QRCodeScanManager$linkAccountByQRCode$2) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}