package com.disney.wdpro.qr_core.display.p422ui;

import android.app.Dialog;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m92038d2 = {"<anonymous>", "", "Landroid/app/Dialog;", "it", "Landroid/view/View;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes16.dex */
final class QRShowFragment$showMessageDialog$2 extends Lambda implements Function2<Dialog, View, Unit> {
    final /* synthetic */ Function0<Unit> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QRShowFragment$showMessageDialog$2(Function0<Unit> function0) {
        super(2);
        action = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Dialog dialog, View view) {
        invoke2(dialog, view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Dialog bottomMessageDialog, View it) {
        Intrinsics.checkNotNullParameter(bottomMessageDialog, "$this$bottomMessageDialog");
        Intrinsics.checkNotNullParameter(it, "it");
        bottomMessageDialog.dismiss();
        action.invoke();
    }
}