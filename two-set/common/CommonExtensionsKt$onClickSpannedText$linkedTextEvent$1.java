package com.disney.wdpro.virtualqueue.p462ui.common;

import android.text.style.ClickableSpan;
import android.view.View;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m92038d2 = {"com/disney/wdpro/virtualqueue/ui/common/CommonExtensionsKt$onClickSpannedText$linkedTextEvent$1", "Landroid/text/style/ClickableSpan;", "onClick", "", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "Landroid/view/View;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class CommonExtensionsKt$onClickSpannedText$linkedTextEvent$1 extends ClickableSpan {
    final /* synthetic */ Function1<View, Unit> $clickEvent;

    /* JADX WARN: Multi-variable type inference failed */
    CommonExtensionsKt$onClickSpannedText$linkedTextEvent$1(Function1<? super View, Unit> function1) {
        clickEvent = function1;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        clickEvent.invoke(view);
    }
}