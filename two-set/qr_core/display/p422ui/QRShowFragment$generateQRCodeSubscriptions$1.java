package com.disney.wdpro.qr_core.display.p422ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m92038d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nQRShowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRShowFragment.kt\ncom/disney/wdpro/qr_core/display/ui/QRShowFragment$generateQRCodeSubscriptions$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
/* loaded from: classes16.dex */
final class QRShowFragment$generateQRCodeSubscriptions$1 extends Lambda implements Function1<Result<? extends Bitmap>, Unit> {
    QRShowFragment$generateQRCodeSubscriptions$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<? extends Bitmap> result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Result<? extends Bitmap> result) {
        Intrinsics.checkNotNullExpressionValue(result, "result");
        Object value = result.getValue();
        QRShowFragment qRShowFragment = this.this$0;
        if (Result.m104763isSuccessimpl(value)) {
            Bitmap bitmap = (Bitmap) value;
            ImageView imageView = qRShowFragment.qrCodeImage;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("qrCodeImage");
                imageView = null;
            }
            imageView.setImageBitmap(bitmap);
        }
        Result.m104759exceptionOrNullimpl(value);
    }
}