package com.disney.wdpro.oneclicklib.checkout.p349ui;

import androidx.fragment.app.FragmentActivity;
import androidx.view.C3827w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import pk.C31542a;

@Metadata(m92037d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m92038d2 = {"Lpk/a;", "invoke", "()Lpk/a;", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneClickCheckoutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickCheckoutFragment.kt\ncom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment$checkoutViewModel$2\n+ 2 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt\n+ 3 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt$getViewModel$1\n*L\n1#1,303:1\n23#2,3:304\n26#2:308\n23#3:307\n*S KotlinDebug\n*F\n+ 1 OneClickCheckoutFragment.kt\ncom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment$checkoutViewModel$2\n*L\n57#1:304,3\n57#1:308\n57#1:307\n*E\n"})
/* loaded from: classes3.dex */
final class OneClickCheckoutFragment$checkoutViewModel$2 extends Lambda implements Function0<C31542a> {
    OneClickCheckoutFragment$checkoutViewModel$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C31542a invoke() {
        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        return (C31542a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C31542a.class);
    }
}