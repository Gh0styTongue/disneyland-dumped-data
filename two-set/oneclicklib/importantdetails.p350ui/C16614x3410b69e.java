package com.disney.wdpro.oneclicklib.importantdetails.p350ui;

import androidx.fragment.app.FragmentActivity;
import androidx.view.C3827w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1009vk.C32626a;

@Metadata(m92037d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m92038d2 = {"Lvk/a;", "invoke", "()Lvk/a;", "<anonymous>"}, m92039k = 3, m92040mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneClickImportantDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickImportantDetailsFragment.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/OneClickImportantDetailsFragment$oneClickImportantDetailsViewModel$2\n+ 2 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt\n+ 3 AndroidExt.kt\ncom/disney/wdpro/photopasscommons/ext/AndroidExtKt$getViewModel$1\n*L\n1#1,113:1\n23#2,3:114\n26#2:118\n23#3:117\n*S KotlinDebug\n*F\n+ 1 OneClickImportantDetailsFragment.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/OneClickImportantDetailsFragment$oneClickImportantDetailsViewModel$2\n*L\n33#1:114,3\n33#1:118\n33#1:117\n*E\n"})
/* renamed from: com.disney.wdpro.oneclicklib.importantdetails.ui.OneClickImportantDetailsFragment$oneClickImportantDetailsViewModel$2 */
/* loaded from: classes3.dex */
final class C16614x3410b69e extends Lambda implements Function0<C32626a> {
    C16614x3410b69e() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C32626a invoke() {
        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        return (C32626a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C32626a.class);
    }
}