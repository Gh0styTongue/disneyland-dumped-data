package com.disney.wdpro.photopass_plus.accessibility;

import android.content.Context;
import com.disney.wdpro.base_sales_ui_lib.interfaces.TicketOptionAccessibilityHelper;
import com.disney.wdpro.photopass_plus.C18785R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/accessibility/PhotoPassTicketOptionAccessibilityHelperImpl;", "Lcom/disney/wdpro/base_sales_ui_lib/interfaces/TicketOptionAccessibilityHelper;", "()V", "getBrickContentDescriptionPrefix", "", "context", "Landroid/content/Context;", "itemPosition", "", "totalPosition", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class PhotoPassTicketOptionAccessibilityHelperImpl implements TicketOptionAccessibilityHelper {
    @Override // com.disney.wdpro.base_sales_ui_lib.interfaces.TicketOptionAccessibilityHelper
    public String getBrickContentDescriptionPrefix(Context context, int itemPosition, int totalPosition) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C18785R.string.photo_pass_plus_brick_position_in_list_accessibility, Integer.valueOf(itemPosition), Integer.valueOf(totalPosition));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…mPosition, totalPosition)");
        return string;
    }
}