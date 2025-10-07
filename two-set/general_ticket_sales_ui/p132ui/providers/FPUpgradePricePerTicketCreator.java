package com.disney.wdpro.general_ticket_sales_ui.p132ui.providers;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.C8920R;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.PricePerTicketViewCreator;
import com.disney.wdpro.base_sales_ui_lib.product.manager.TicketSalesConfigManager;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PricePerTicket;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;

/* loaded from: classes28.dex */
public class FPUpgradePricePerTicketCreator implements PricePerTicketViewCreator {

    private static final class BundlePricePerTicketViewHolder {
        private TextView ticketAllAgesTextItem;

        private BundlePricePerTicketViewHolder() {
        }
    }

    private void setTextIfPricePresent(TextView textView, Price price, int i10, String str, StringBuilder sb2) {
        if (price == null) {
            textView.setVisibility(8);
            return;
        }
        Context context = textView.getContext();
        String strValueOf = String.valueOf(i10);
        SpannableString displayPrice = DisplayPriceFormatter.formatDisplayPrice(price);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strValueOf);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) displayPrice);
        spannableStringBuilder.append((CharSequence) context.getString(C8920R.string.ticket_sales_per_ticket_per_day));
        sb2.append(context.getString(C8920R.string.ticket_sales_cd_party_mix_brick, strValueOf, str, displayPrice));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, strValueOf.length(), 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, displayPrice.length() + length, 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.providers.PricePerTicketViewCreator
    public View createView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(C8920R.layout.ticket_brick_bundle_ticket_count, viewGroup, true);
        BundlePricePerTicketViewHolder bundlePricePerTicketViewHolder = new BundlePricePerTicketViewHolder();
        bundlePricePerTicketViewHolder.ticketAllAgesTextItem = (TextView) viewInflate.findViewById(C8920R.id.ticket_all_ages_text_item);
        viewInflate.setTag(bundlePricePerTicketViewHolder);
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.providers.PricePerTicketViewCreator
    public void populateView(View view, TicketSalesConfigManager ticketSalesConfigManager, StringBuilder sb2, SelectedTicketProducts selectedTicketProducts) throws Resources.NotFoundException {
        Context context = view.getContext();
        BundlePricePerTicketViewHolder bundlePricePerTicketViewHolder = (BundlePricePerTicketViewHolder) view.getTag();
        PricePerTicket pricePerTicket = selectedTicketProducts.getPricePerTicket();
        setTextIfPricePresent(bundlePricePerTicketViewHolder.ticketAllAgesTextItem, pricePerTicket.getAllAgesPricePerTicket().orNull(), selectedTicketProducts.getNumberOfAllAgesTickets(), context.getResources().getQuantityString(C8920R.plurals.ticket_sales_bundle_ticket_count_text, selectedTicketProducts.getNumberOfAllAgesTickets(), Integer.valueOf(selectedTicketProducts.getNumberOfAllAgesTickets())), sb2);
    }
}