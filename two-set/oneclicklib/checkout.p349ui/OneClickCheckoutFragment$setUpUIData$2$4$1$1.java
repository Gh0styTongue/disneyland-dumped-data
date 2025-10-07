package com.disney.wdpro.oneclicklib.checkout.p349ui;

import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.photopass.services.dto.CBEnableCTA;
import com.disney.wdpro.photopass.services.dto.CBReviewAndPurchaseScreen;
import com.disney.wdpro.photopass.services.dto.CBText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p914rk.C31917a;

@Metadata(m92037d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m92038d2 = {"<anonymous>", "", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nOneClickCheckoutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickCheckoutFragment.kt\ncom/disney/wdpro/oneclicklib/checkout/ui/OneClickCheckoutFragment$setUpUIData$2$4$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
/* loaded from: classes3.dex */
final class OneClickCheckoutFragment$setUpUIData$2$4$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CBReviewAndPurchaseScreen $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneClickCheckoutFragment$setUpUIData$2$4$1$1(CBReviewAndPurchaseScreen cBReviewAndPurchaseScreen) {
        super(0);
        reviewAndPurchaseScreen = cBReviewAndPurchaseScreen;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        CBText title;
        String text;
        C31917a c31917a = C31917a.INSTANCE;
        InterfaceC8679k analyticsHelper = this.this$0.analyticsHelper;
        Intrinsics.checkNotNullExpressionValue(analyticsHelper, "analyticsHelper");
        c31917a.m98086a(analyticsHelper, this.this$0.m56474H0().getImportantNoticeMoMAnalytics(), "content/photopass/ARplus/Legacy/OneClickCheckout");
        CBEnableCTA usTermsCheckCTA = reviewAndPurchaseScreen.getUsTermsCheckCTA();
        if (usTermsCheckCTA == null || (title = usTermsCheckCTA.getTitle()) == null || (text = title.getText()) == null) {
            return;
        }
        this.this$0.m56481O0(text, 1);
    }
}