package com.disney.wdpro.ap_commerce_checkout.p066ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.TicketOrder;
import com.disney.wdpro.ap_commerce_checkout.TicketOrderItem;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.C22466q;
import com.google.common.collect.AbstractC22726b3;

/* loaded from: classes23.dex */
public final class APTicketBrickUiHelper implements TicketBrickUiHelper {
    private Context context;
    private View.OnClickListener importantAnnualPassDetailsClickListener;
    private final TicketOrderProvider ticketOrderProvider;

    public static final class Builder {
        private Context context;
        private View.OnClickListener importantAnnualPassDetailsClickListener;
        private TicketOrderProvider ticketOrderProvider;

        public APTicketBrickUiHelper build() {
            return new APTicketBrickUiHelper(this);
        }

        public Builder importantAnnualPassDetailsClickListener(View.OnClickListener onClickListener) {
            this.importantAnnualPassDetailsClickListener = onClickListener;
            return this;
        }

        public Builder paymentPlanProvider(TicketOrderProvider ticketOrderProvider) {
            this.ticketOrderProvider = ticketOrderProvider;
            return this;
        }

        private Builder(Context context) {
            this.context = context;
        }
    }

    public interface TicketOrderProvider {
        TicketOrder getTicketOrder();
    }

    private void createProductViews(TicketOrder ticketOrder, APTicketBrickCopyHelper aPTicketBrickCopyHelper, View view) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C8689R.id.list_of_passes_to_renew);
        linearLayout.removeAllViews();
        AbstractC22726b3<TicketOrderItem> it = ticketOrder.getTicketOrderItemList().iterator();
        while (it.hasNext()) {
            TicketOrderItem next = it.next();
            LinearLayout linearLayout2 = (LinearLayout) layoutInflaterFrom.inflate(C8689R.layout.ap_commerce_pass_item_layout, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) linearLayout2.findViewById(C8689R.id.ap_pass_name);
            TextView textView2 = (TextView) linearLayout2.findViewById(C8689R.id.ap_pass_price_info);
            String displayName = next.getDisplayName();
            textView.setText(displayName);
            textView.setContentDescription(aPTicketBrickCopyHelper.getDisplayNameContentDescription(displayName));
            textView2.setText(aPTicketBrickCopyHelper.getProductPriceInfo(next));
            textView2.setContentDescription(aPTicketBrickCopyHelper.getProductPriceInfoAccessibility(next));
            linearLayout.addView(linearLayout2);
        }
    }

    public static Builder from(Context context) {
        return new Builder(context);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper
    public View createSelectedProductsView(LayoutInflater layoutInflater, ViewGroup viewGroup, SelectedTicketProducts selectedTicketProducts) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C8689R.id.order_summary_header);
        frameLayout.setImportantForAccessibility(2);
        View viewInflate = layoutInflater.inflate(C8689R.layout.ap_commerce_passes_container, (ViewGroup) frameLayout, false);
        TicketOrder ticketOrder = this.ticketOrderProvider.getTicketOrder();
        if (ticketOrder == null) {
            viewInflate.setVisibility(8);
            return viewInflate;
        }
        APTicketBrickCopyHelper aPTicketBrickCopyHelper = new APTicketBrickCopyHelper(this.context, selectedTicketProducts, ticketOrder);
        TextView textView = (TextView) viewInflate.findViewById(C8689R.id.total_before_tax_content);
        TextView textView2 = (TextView) viewInflate.findViewById(C8689R.id.total_before_tax_header);
        TextView textView3 = (TextView) viewInflate.findViewById(C8689R.id.monthly_payment_apr_content);
        TextView textView4 = (TextView) viewInflate.findViewById(C8689R.id.passes_to_renew_header);
        Button button = (Button) viewInflate.findViewById(C8689R.id.important_details_button);
        View viewFindViewById = viewInflate.findViewById(C8689R.id.important_details_seperator);
        if (selectedTicketProducts.getPolicy(SelectedTicketProducts.PolicyUILocation.ORDER_SUMMARY_IMPORTANT_DETAILS) != null) {
            button.setOnClickListener(this.importantAnnualPassDetailsClickListener);
            viewFindViewById.setVisibility(0);
            button.setVisibility(0);
        }
        createProductViews(ticketOrder, aPTicketBrickCopyHelper, viewInflate);
        textView4.setText(aPTicketBrickCopyHelper.getHeader());
        CharSequence totalBeforeTax = aPTicketBrickCopyHelper.getTotalBeforeTax();
        if (!C22466q.m68722b(totalBeforeTax.toString())) {
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(totalBeforeTax);
            textView2.setText(aPTicketBrickCopyHelper.getTotalTaxHeader());
        }
        SpannableStringBuilder monthPayment = aPTicketBrickCopyHelper.getMonthPayment();
        if (!C22466q.m68722b(monthPayment.toString())) {
            textView3.setText(monthPayment);
            textView3.setContentDescription(aPTicketBrickCopyHelper.getMonthPaymentContentDescription());
            textView3.setVisibility(0);
        }
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.TicketBrickUiHelper
    public void populateSelectedTicketHeader(TicketSalesConfigManager ticketSalesConfigManager, View view, boolean z10, String str, boolean z11) {
    }

    private APTicketBrickUiHelper(Builder builder) {
        this.context = builder.context.getApplicationContext();
        this.ticketOrderProvider = builder.ticketOrderProvider;
        this.importantAnnualPassDetailsClickListener = builder.importantAnnualPassDetailsClickListener;
    }
}