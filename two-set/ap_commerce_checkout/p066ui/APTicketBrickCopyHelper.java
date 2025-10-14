package com.disney.wdpro.ap_commerce_checkout.p066ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.ap_commerce_checkout.TicketOrder;
import com.disney.wdpro.ap_commerce_checkout.TicketOrderItem;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;

/* loaded from: classes23.dex */
public final class APTicketBrickCopyHelper extends APFlowUIHelper {
    private final TicketOrder ticketOrder;

    public APTicketBrickCopyHelper(Context context, SelectedTicketProducts selectedTicketProducts, TicketOrder ticketOrder) {
        super(context, selectedTicketProducts, Boolean.valueOf(ticketOrder.isGuestOnMonthlyPaymentPlan()));
        this.ticketOrder = ticketOrder;
    }

    public String getDisplayNameContentDescription(String str) {
        switch (this.type) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return str.replace(this.context.getString(C8689R.string.ticket_sales_cd_hyphen), this.context.getString(C8689R.string.ticket_sales_cd_through)).replace(this.context.getString(C8689R.string.ap_commerce_florida_res), this.context.getString(C8689R.string.ap_commerce_florida_res_accessibility));
            default:
                return str;
        }
    }

    public String getHeader() {
        switch (this.type) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.context.getString(C8689R.string.ap_commerce_passes_to_purchase_header_wdw);
            case 5:
            case 6:
                return this.context.getString(C8689R.string.ap_commerce_passes_to_renew_header_wdw);
            case 7:
            case 8:
            case 9:
            case 10:
                return this.context.getString(C8689R.string.ap_commerce_passes_to_purchase_header_dlr);
            case 11:
            case 12:
                return this.context.getString(C8689R.string.ap_commerce_passes_to_renew_header_dlr);
            default:
                return this.emptyString;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.SpannableStringBuilder getMonthPayment() {
        /*
            r3 = this;
            int r0 = r3.type
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 5
            if (r0 == r1) goto L57
            r1 = 7
            if (r0 == r1) goto L17
            r1 = 9
            if (r0 == r1) goto L17
            r1 = 11
            if (r0 == r1) goto L57
            goto L70
        L17:
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r0 = r3.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue r0 = r0.getTotalDepositDue()
            if (r0 == 0) goto L57
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.content.Context r1 = r3.context
            int r2 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_interest_payment_description
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            android.content.Context r1 = r3.context
            int r2 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_new_line
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r1 = r3.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue r1 = r1.getTotalDepositDue()
            com.disney.wdpro.ticket_sales_base_lib.business.Price r1 = r1.getTotal()
            android.text.SpannableString r1 = com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter.formatDisplayPrice(r1)
            r0.append(r1)
            android.content.Context r3 = r3.context
            int r1 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_price_down_payment
            java.lang.String r3 = r3.getString(r1)
            r0.append(r3)
            return r0
        L57:
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r0 = r3.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue r0 = r0.getTotalDepositDue()
            if (r0 == 0) goto L70
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.content.Context r3 = r3.context
            int r1 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_interest_payment_description
            java.lang.String r3 = r3.getString(r1)
            r0.append(r3)
            return r0
        L70:
            java.lang.String r3 = r3.emptyString
            android.text.SpannableStringBuilder r3 = android.text.SpannableStringBuilder.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.ap_commerce_checkout.p066ui.APTicketBrickCopyHelper.getMonthPayment():android.text.SpannableStringBuilder");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getMonthPaymentContentDescription() {
        /*
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 5
            if (r0 == r1) goto L4f
            r1 = 7
            if (r0 == r1) goto L17
            r1 = 9
            if (r0 == r1) goto L17
            r1 = 11
            if (r0 == r1) goto L4f
            goto L69
        L17:
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r0 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue r0 = r0.getTotalDepositDue()
            if (r0 == 0) goto L4f
            com.disney.wdpro.support.accessibility.d r0 = new com.disney.wdpro.support.accessibility.d
            android.content.Context r1 = r2.context
            r0.<init>(r1)
            int r1 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_interest_payment_description_accessibility
            com.disney.wdpro.support.accessibility.d r0 = r0.m62022a(r1)
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r1 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue r1 = r1.getTotalDepositDue()
            com.disney.wdpro.ticket_sales_base_lib.business.Price r1 = r1.getTotal()
            java.lang.String r1 = r1.getDisplayPrice()
            com.disney.wdpro.support.accessibility.d r0 = r0.m62027f(r1)
            android.content.Context r2 = r2.context
            int r1 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_price_down_payment
            java.lang.String r2 = r2.getString(r1)
            com.disney.wdpro.support.accessibility.d r2 = r0.m62027f(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L4f:
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r0 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.TotalDepositDue r0 = r0.getTotalDepositDue()
            if (r0 == 0) goto L69
            com.disney.wdpro.support.accessibility.d r0 = new com.disney.wdpro.support.accessibility.d
            android.content.Context r2 = r2.context
            r0.<init>(r2)
            int r2 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_interest_payment_description_accessibility
            com.disney.wdpro.support.accessibility.d r2 = r0.m62022a(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L69:
            java.lang.String r2 = r2.emptyString
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.ap_commerce_checkout.p066ui.APTicketBrickCopyHelper.getMonthPaymentContentDescription():java.lang.String");
    }

    public CharSequence getProductPriceInfo(TicketOrderItem ticketOrderItem) {
        switch (this.type) {
            case 1:
            case 3:
            case 7:
            case 9:
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                AbstractC22726b3<TicketOrderItem.PriceDetail> it = ticketOrderItem.getPriceDetailList().iterator();
                while (it.hasNext()) {
                    TicketOrderItem.PriceDetail next = it.next();
                    spannableStringBuilder.append((CharSequence) String.valueOf(next.getQuantity()));
                    spannableStringBuilder.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_x_character));
                    Price pricePerMonth = next.getPricePerMonth();
                    spannableStringBuilder.append(pricePerMonth != null ? DisplayPriceFormatter.formatDisplayPrice(pricePerMonth) : this.emptyString);
                    spannableStringBuilder.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_per_month));
                    spannableStringBuilder.append((CharSequence) this.context.getString(C8689R.string.ticket_sales_comma));
                    spannableStringBuilder.append((CharSequence) this.context.getString(C8689R.string.ticket_sales_non_breaking_space));
                    Price deposit = next.getDeposit();
                    spannableStringBuilder.append(deposit != null ? DisplayPriceFormatter.formatDisplayPrice(deposit) : this.emptyString);
                    spannableStringBuilder.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_price_down_payment));
                    spannableStringBuilder.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_new_line));
                }
                return spannableStringBuilder;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                AbstractC22726b3<TicketOrderItem.PriceDetail> it2 = ticketOrderItem.getPriceDetailList().iterator();
                while (it2.hasNext()) {
                    TicketOrderItem.PriceDetail next2 = it2.next();
                    Pricing unitPrice = next2.getUnitPrice();
                    Optional<Price> subtotal = unitPrice.getSubtotal();
                    Price total = subtotal.isPresent() ? subtotal.get() : unitPrice.getTotal();
                    spannableStringBuilder2.append((CharSequence) String.valueOf(next2.getQuantity()));
                    spannableStringBuilder2.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_x_character));
                    spannableStringBuilder2.append((CharSequence) DisplayPriceFormatter.formatDisplayPrice(total));
                    spannableStringBuilder2.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_pass));
                    spannableStringBuilder2.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_new_line));
                }
                return spannableStringBuilder2;
            case 5:
            case 11:
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                AbstractC22726b3<TicketOrderItem.PriceDetail> it3 = ticketOrderItem.getPriceDetailList().iterator();
                while (it3.hasNext()) {
                    TicketOrderItem.PriceDetail next3 = it3.next();
                    spannableStringBuilder3.append((CharSequence) String.valueOf(next3.getQuantity()));
                    spannableStringBuilder3.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_x_character));
                    Price pricePerMonth2 = next3.getPricePerMonth();
                    spannableStringBuilder3.append(pricePerMonth2 != null ? DisplayPriceFormatter.formatDisplayPrice(pricePerMonth2) : this.emptyString);
                    spannableStringBuilder3.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_per_month));
                    spannableStringBuilder3.append((CharSequence) this.context.getString(C8689R.string.ap_commerce_new_line));
                }
                return spannableStringBuilder3;
            default:
                return this.emptyString;
        }
    }

    public CharSequence getProductPriceInfoAccessibility(TicketOrderItem ticketOrderItem) {
        switch (this.type) {
            case 1:
            case 3:
            case 7:
            case 9:
                StringBuilder sb2 = new StringBuilder();
                AbstractC22726b3<TicketOrderItem.PriceDetail> it = ticketOrderItem.getPriceDetailList().iterator();
                while (it.hasNext()) {
                    TicketOrderItem.PriceDetail next = it.next();
                    int quantity = next.getQuantity();
                    Price pricePerMonth = next.getPricePerMonth();
                    Price deposit = next.getDeposit();
                    if (deposit == null) {
                        sb2.append(this.context.getResources().getString(C8689R.string.ap_commerce_cd_passes_price_info_per_month, Integer.valueOf(quantity), this.context.getResources().getQuantityString(C8689R.plurals.passes_accessibility, quantity), pricePerMonth));
                    } else {
                        sb2.append(this.context.getResources().getString(C8689R.string.ap_commerce_pass_price_info_with_payment_plan_and_down_payment, Integer.valueOf(quantity), pricePerMonth, deposit));
                    }
                    sb2.append(this.context.getResources().getString(C8689R.string.ap_commerce_new_line));
                }
                return sb2;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                StringBuilder sb3 = new StringBuilder();
                AbstractC22726b3<TicketOrderItem.PriceDetail> it2 = ticketOrderItem.getPriceDetailList().iterator();
                while (it2.hasNext()) {
                    TicketOrderItem.PriceDetail next2 = it2.next();
                    Pricing unitPrice = next2.getUnitPrice();
                    Optional<Price> subtotal = unitPrice.getSubtotal();
                    Price total = subtotal.isPresent() ? subtotal.get() : unitPrice.getTotal();
                    int quantity2 = next2.getQuantity();
                    sb3.append(this.context.getString(C8689R.string.ap_commerce_cd_passes_price_info_per_pass, Integer.valueOf(quantity2), this.context.getResources().getQuantityString(C8689R.plurals.passes_accessibility, quantity2), total));
                    sb3.append(this.context.getResources().getString(C8689R.string.ap_commerce_new_line));
                }
                return sb3;
            case 5:
            case 11:
                StringBuilder sb4 = new StringBuilder();
                AbstractC22726b3<TicketOrderItem.PriceDetail> it3 = ticketOrderItem.getPriceDetailList().iterator();
                while (it3.hasNext()) {
                    TicketOrderItem.PriceDetail next3 = it3.next();
                    int quantity3 = next3.getQuantity();
                    sb4.append(this.context.getResources().getString(C8689R.string.ap_commerce_cd_passes_price_info_per_month, Integer.valueOf(quantity3), this.context.getResources().getQuantityString(C8689R.plurals.passes_accessibility, quantity3), next3.getPricePerMonth()));
                    sb4.append(this.context.getResources().getString(C8689R.string.ap_commerce_new_line));
                }
                return sb4;
            default:
                return this.emptyString;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence getTotalBeforeTax() {
        /*
            r2 = this;
            int r0 = r2.type
            switch(r0) {
                case 1: goto L29;
                case 2: goto L6;
                case 3: goto L29;
                case 4: goto L6;
                case 5: goto L29;
                case 6: goto L6;
                case 7: goto L29;
                case 8: goto L6;
                case 9: goto L29;
                case 10: goto L6;
                case 11: goto L29;
                case 12: goto L6;
                default: goto L5;
            }
        L5:
            goto L53
        L6:
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r0 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.Pricing r0 = r0.getPricing()
            com.google.common.base.Optional r0 = r0.getSubtotal()
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r1 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.Pricing r1 = r1.getPricing()
            if (r1 == 0) goto L29
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L29
            java.lang.Object r2 = r0.get()
            com.disney.wdpro.ticket_sales_base_lib.business.Price r2 = (com.disney.wdpro.ticket_sales_base_lib.business.Price) r2
            android.text.SpannableString r2 = com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter.formatDisplayPrice(r2)
            return r2
        L29:
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r0 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount r0 = r0.getMonthlyPaymentAmount()
            if (r0 == 0) goto L53
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            com.disney.wdpro.ap_commerce_checkout.TicketOrder r1 = r2.ticketOrder
            com.disney.wdpro.ticket_sales_base_lib.business.tiers.MonthlyPaymentAmount r1 = r1.getMonthlyPaymentAmount()
            com.disney.wdpro.ticket_sales_base_lib.business.Price r1 = r1.getPrice()
            android.text.SpannableString r1 = com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter.formatDisplayPrice(r1)
            r0.append(r1)
            android.content.Context r2 = r2.context
            int r1 = com.disney.wdpro.ap_commerce_checkout.C8689R.string.ap_commerce_per_month
            java.lang.String r2 = r2.getString(r1)
            r0.append(r2)
            return r0
        L53:
            java.lang.String r2 = r2.emptyString
            android.text.SpannableString r2 = android.text.SpannableString.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.ap_commerce_checkout.p066ui.APTicketBrickCopyHelper.getTotalBeforeTax():java.lang.CharSequence");
    }

    public String getTotalTaxHeader() {
        switch (this.type) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return this.context.getString(C8689R.string.ap_commerce_total_label);
            case 2:
            case 4:
            case 6:
                return this.context.getString(C8689R.string.ap_commerce_total_before_tax);
            default:
                return this.emptyString;
        }
    }
}