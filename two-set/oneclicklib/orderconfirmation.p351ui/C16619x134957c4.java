package com.disney.wdpro.oneclicklib.orderconfirmation.p351ui;

import androidx.fragment.app.FragmentActivity;
import androidx.view.C3827w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1079xk.C33248a;

@Metadata(m92037d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m92038d2 = {"Lxk/a;", "invoke", "()Lxk/a;", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneClickOrderConfirmationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickOrderConfirmationFragment.kt\ncom/disney/wdpro/oneclicklib/orderconfirmation/ui/OneClickOrderConfirmationFragment$oneClickOrderConfirmationViewModel$2\n+ 2 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt\n+ 3 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt$getViewModel$1\n*L\n1#1,237:1\n23#2,3:238\n26#2:242\n23#3:241\n*S KotlinDebug\n*F\n+ 1 OneClickOrderConfirmationFragment.kt\ncom/disney/wdpro/oneclicklib/orderconfirmation/ui/OneClickOrderConfirmationFragment$oneClickOrderConfirmationViewModel$2\n*L\n38#1:238,3\n38#1:242\n38#1:241\n*E\n"})
/* renamed from: com.disney.wdpro.oneclicklib.orderconfirmation.ui.OneClickOrderConfirmationFragment$oneClickOrderConfirmationViewModel$2 */
/* loaded from: classes3.dex */
final class C16619x134957c4 extends Lambda implements Function0<C33248a> {
    C16619x134957c4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C33248a invoke() {
        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        return (C33248a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C33248a.class);
    }
}