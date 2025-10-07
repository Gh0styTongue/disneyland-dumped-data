package com.disney.wdpro.qr_core.scan.p423ui;

import com.disney.wdpro.qr_core.QRCodeException;
import com.disney.wdpro.qr_core.display.rest.AgeBand;
import com.disney.wdpro.qr_core.scan.QRCodeScanManager;
import com.disney.wdpro.toolbox.livedata.SingleLiveEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.qr_core.scan.ui.QRCodeScanViewModel$linkNewFriendByQrCode$1", m92053f = "QRCodeScanViewModel.kt", m92054i = {}, m92055l = {76}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes16.dex */
final class QRCodeScanViewModel$linkNewFriendByQrCode$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $age;
    final /* synthetic */ AgeBand $ageBand;
    final /* synthetic */ String $dateOfBirth;
    final /* synthetic */ String $firstName;
    final /* synthetic */ String $lastName;
    final /* synthetic */ String $qrCode;
    Object L$0;
    int label;
    final /* synthetic */ QRCodeScanViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRCodeScanViewModel$linkNewFriendByQrCode$1(QRCodeScanViewModel qRCodeScanViewModel, AgeBand ageBand, String str, String str2, String str3, int i10, String str4, Continuation<? super QRCodeScanViewModel$linkNewFriendByQrCode$1> continuation) {
        super(2, continuation);
        this.this$0 = qRCodeScanViewModel;
        this.$ageBand = ageBand;
        this.$qrCode = str;
        this.$firstName = str2;
        this.$lastName = str3;
        this.$age = i10;
        this.$dateOfBirth = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QRCodeScanViewModel$linkNewFriendByQrCode$1(this.this$0, this.$ageBand, this.$qrCode, this.$firstName, this.$lastName, this.$age, this.$dateOfBirth, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QRCodeScanViewModel$linkNewFriendByQrCode$1 qRCodeScanViewModel$linkNewFriendByQrCode$1;
        SingleLiveEvent singleLiveEvent;
        QRCodeException qRCodeException;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                SingleLiveEvent singleLiveEvent2 = this.this$0.mLinkSuccess;
                QRCodeScanManager qRCodeScanManager = this.this$0.qrScanManager;
                AgeBand ageBand = this.$ageBand;
                String str = this.$qrCode;
                String str2 = this.$firstName;
                String str3 = this.$lastName;
                int i11 = this.$age;
                String str4 = this.$dateOfBirth;
                this.L$0 = singleLiveEvent2;
                this.label = 1;
                qRCodeScanViewModel$linkNewFriendByQrCode$1 = this;
                try {
                    Object objM60958m = qRCodeScanManager.m60958m(ageBand, str, str2, str3, i11, str4, qRCodeScanViewModel$linkNewFriendByQrCode$1);
                    if (objM60958m == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    singleLiveEvent = singleLiveEvent2;
                    obj = objM60958m;
                } catch (QRCodeException e10) {
                    e = e10;
                    qRCodeException = e;
                    qRCodeScanViewModel$linkNewFriendByQrCode$1.this$0.mLinkFailure.postValue(qRCodeException.getErrorCode());
                    return Unit.INSTANCE;
                }
            } catch (QRCodeException e11) {
                e = e11;
                qRCodeScanViewModel$linkNewFriendByQrCode$1 = this;
                qRCodeException = e;
                qRCodeScanViewModel$linkNewFriendByQrCode$1.this$0.mLinkFailure.postValue(qRCodeException.getErrorCode());
                return Unit.INSTANCE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleLiveEvent = (SingleLiveEvent) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                qRCodeScanViewModel$linkNewFriendByQrCode$1 = this;
            } catch (QRCodeException e12) {
                qRCodeException = e12;
                qRCodeScanViewModel$linkNewFriendByQrCode$1 = this;
                qRCodeScanViewModel$linkNewFriendByQrCode$1.this$0.mLinkFailure.postValue(qRCodeException.getErrorCode());
                return Unit.INSTANCE;
            }
        }
        singleLiveEvent.postValue(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
        return ((QRCodeScanViewModel$linkNewFriendByQrCode$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}