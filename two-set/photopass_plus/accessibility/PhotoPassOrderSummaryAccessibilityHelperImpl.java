package com.disney.wdpro.photopass_plus.accessibility;

import android.content.Context;
import com.disney.wdpro.base_sales_ui_lib.interfaces.OrderSummaryAccessibilityHelper;
import com.disney.wdpro.photopass_plus.C18785R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/accessibility/PhotoPassOrderSummaryAccessibilityHelperImpl;", "Lcom/disney/wdpro/base_sales_ui_lib/interfaces/OrderSummaryAccessibilityHelper;", "()V", "getEditCreditCardContentDescription", "", "context", "Landroid/content/Context;", "creditCardType", "creditCardNumber", "expirationMonth", "expirationYear", "getTermsAndConditionsTextContentDescription", "getTermsConditionsCheckBoxContentDescription", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class PhotoPassOrderSummaryAccessibilityHelperImpl implements OrderSummaryAccessibilityHelper {
    @Override // com.disney.wdpro.base_sales_ui_lib.interfaces.OrderSummaryAccessibilityHelper
    public String getEditCreditCardContentDescription(Context context, String creditCardType, String creditCardNumber, String expirationMonth, String expirationYear) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C18785R.string.pp_order_summary_edit_credit_card_accessibility, creditCardType, creditCardNumber, expirationMonth, expirationYear);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     … expirationYear\n        )");
        return string;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.interfaces.OrderSummaryAccessibilityHelper
    public String getTermsAndConditionsTextContentDescription(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C18785R.string.pp_commerce_terms_and_conditions_accessibility, context.getString(C18785R.string.ticket_sales_terms_of_conditions_ticket_sales));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …s_ticket_sales)\n        )");
        return string;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.interfaces.OrderSummaryAccessibilityHelper
    public String getTermsConditionsCheckBoxContentDescription(Context context) {
        if (context != null) {
            return context.getString(C18785R.string.pp_order_summary_accept_checkbox_accessibility);
        }
        return null;
    }
}