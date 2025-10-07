package com.disney.wdpro.oneclicklib.processingpayment.p352ui;

import androidx.fragment.app.FragmentActivity;
import androidx.view.C3827w0;
import com.disney.wdpro.oneclicklib.common.viewmodel.OneClickViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m92038d2 = {"<anonymous>", "Lcom/disney/wdpro/oneclicklib/common/viewmodel/OneClickViewModel;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nOneClickProcessingPaymentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickProcessingPaymentFragment.kt\ncom/disney/wdpro/oneclicklib/processingpayment/ui/OneClickProcessingPaymentFragment$oneClickViewModel$2\n+ 2 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt\n+ 3 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt$getViewModel$1\n*L\n1#1,126:1\n23#2,3:127\n26#2:131\n23#3:130\n*S KotlinDebug\n*F\n+ 1 OneClickProcessingPaymentFragment.kt\ncom/disney/wdpro/oneclicklib/processingpayment/ui/OneClickProcessingPaymentFragment$oneClickViewModel$2\n*L\n39#1:127,3\n39#1:131\n39#1:130\n*E\n"})
/* loaded from: classes3.dex */
final class OneClickProcessingPaymentFragment$oneClickViewModel$2 extends Lambda implements Function0<OneClickViewModel> {
    OneClickProcessingPaymentFragment$oneClickViewModel$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OneClickViewModel invoke() {
        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        return (OneClickViewModel) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(OneClickViewModel.class);
    }
}