package com.disney.wdpro.qr_core.display.p422ui;

import com.disney.wdpro.qr_core.QRCodeError;
import com.disney.wdpro.qr_core.QRCodeException;
import com.disney.wdpro.qr_core.display.data.QRStatus;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p916rm.C31929h;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m92038d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/disney/wdpro/qr_core/display/data/QRStatus;", "kotlin.jvm.PlatformType", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes16.dex */
final class QRShowFragment$qrCodeStatusSubscriptons$1 extends Lambda implements Function1<Result<? extends QRStatus>, Unit> {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.ui.QRShowFragment$qrCodeStatusSubscriptons$1$a */
    public /* synthetic */ class C19439a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QRCodeError.values().length];
            try {
                iArr[QRCodeError.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    QRShowFragment$qrCodeStatusSubscriptons$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends QRStatus> result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Result<? extends QRStatus> it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        Object value = it.getValue();
        QRShowFragment qRShowFragment = this.this$0;
        if (Result.m104763isSuccessimpl(value)) {
            if (((QRStatus) value) == QRStatus.LINKED) {
                qRShowFragment.trackState(qRShowFragment.m60914a1() ? "content/childaccount/linksuccessfull" : "content/adultaccount/linksuccessfull");
                qRShowFragment.m60923j1();
            } else {
                QRShowFragment.m60921h1(qRShowFragment, C31929h.qr_not_linked_title, C31929h.qr_not_linked_message, null, 4, null);
            }
        }
        QRShowFragment qRShowFragment2 = this.this$0;
        Throwable thM104759exceptionOrNullimpl = Result.m104759exceptionOrNullimpl(value);
        if (thM104759exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(thM104759exceptionOrNullimpl, "null cannot be cast to non-null type com.disney.wdpro.qr_core.QRCodeException");
            if (C19439a.$EnumSwitchMapping$0[((QRCodeException) thM104759exceptionOrNullimpl).getErrorCode().ordinal()] == 1) {
                QRShowFragment.m60921h1(qRShowFragment2, C31929h.qr_network_error_title, C31929h.qr_network_error_message, null, 4, null);
            } else {
                QRShowFragment.m60921h1(qRShowFragment2, C31929h.qr_check_status_error_title, C31929h.qr_check_status_error_message, null, 4, null);
            }
        }
    }
}