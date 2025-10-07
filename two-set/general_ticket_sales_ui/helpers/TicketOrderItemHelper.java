package com.disney.wdpro.general_ticket_sales_ui.helpers;

import android.text.TextUtils;
import com.disney.wdpro.bookingservices.model.PolicyItem;
import com.disney.wdpro.bookingservices.model.TicketOrderItem;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyDescription;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.Lists;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: classes28.dex */
public class TicketOrderItemHelper {
    private static final String TICKET_UNIT = "Ticket";

    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.helpers.TicketOrderItemHelper$1 */
    static /* synthetic */ class C120251 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$AgeGroup */
        static final /* synthetic */ int[] f32779x6a0953e1;

        static {
            int[] iArr = new int[AgeGroup.values().length];
            f32779x6a0953e1 = iArr;
            try {
                iArr[AgeGroup.ADULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32779x6a0953e1[AgeGroup.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32779x6a0953e1[AgeGroup.SENIOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32779x6a0953e1[AgeGroup.ALL_AGES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    TicketOrderItemHelper() {
    }

    public void addPoliciesToTicketOrder(SelectedTicketProducts selectedTicketProducts, String str, TicketOrderItem.Builder builder) {
        Iterator<Policy> it = selectedTicketProducts.getPolicies().iterator();
        while (it.hasNext()) {
            Policy next = it.next();
            for (Map.Entry<String, PolicyDescription> entry : next.getDescriptions().entrySet()) {
                addPolicy(PolicyGroup.PolicyDescriptionKey.TERMS_OF_USE_DESCRIPTION, entry, next, builder, str);
                addPolicy(PolicyGroup.PolicyDescriptionKey.TOGGLE_DESCRIPTION, entry, next, builder, str);
                addPolicy(PolicyGroup.PolicyDescriptionKey.MAX_PASS_TOGGLE_HEADER, entry, next, builder, str);
                addPolicy(PolicyGroup.PolicyDescriptionKey.MAX_PASS_TOGGLE_BODY, entry, next, builder, str);
            }
        }
    }

    public void addPolicy(PolicyGroup.PolicyDescriptionKey policyDescriptionKey, Map.Entry<String, PolicyDescription> entry, Policy policy, TicketOrderItem.Builder builder, String str) {
        if (TextUtils.isEmpty(policy.getPolicyDescriptionMap().get(policyDescriptionKey))) {
            return;
        }
        if (policyDescriptionKey != PolicyGroup.PolicyDescriptionKey.TOGGLE_DESCRIPTION) {
            str = "";
        }
        builder.addPolicy(entry.getValue().getKey(), new PolicyItem(str, entry.getValue().getText(), null));
    }

    public TicketOrderItem.Builder configureTicketOrder(SelectedTicketProducts.SelectedTicketProduct selectedTicketProduct, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i10) {
        StringBuilder sb2 = new StringBuilder();
        DisplayNames.TicketTitle ticketTitle = selectedTicketProduct.getTicketDisplayNames().getTicketTitle().get();
        DisplayNameMap.Type type = DisplayNameMap.Type.PLAIN_TEXT;
        sb2.append(ticketTitle.getCaption(type));
        sb2.append(" ");
        sb2.append(selectedTicketProduct.getTicketDisplayNames().getTicketTitle().get().getTitle(type));
        TicketOrderItem.Builder builder = new TicketOrderItem.Builder(selectedTicketProduct.getProductInstanceId(), str, sb2.toString(), i10, false, "Ticket", "");
        builder.withProductSKU(str2);
        builder.withPerItemSubtotal(bigDecimal);
        builder.withSubtotal(bigDecimal2);
        return builder;
    }

    public String getAgeGroupCategoryId(AgeGroup ageGroup, SelectedTicketProducts selectedTicketProducts) {
        int i10 = C120251.f32779x6a0953e1[ageGroup.ordinal()];
        if (i10 == 1) {
            return selectedTicketProducts.getAdultCategoryId().orNull();
        }
        if (i10 == 2) {
            return selectedTicketProducts.getChildCategoryId().orNull();
        }
        if (i10 == 3) {
            return selectedTicketProducts.getSeniorCategoryId().orNull();
        }
        if (i10 == 4) {
            return selectedTicketProducts.getAllAgesCategoryId().orNull();
        }
        throw new IllegalArgumentException("Section not specified");
    }

    public List<TicketOrderItem> getTicketOrderItems(SelectedTicketProducts selectedTicketProducts, String str) {
        ArrayList arrayListM69268i = Lists.m69268i();
        ArrayList arrayListM69268i2 = Lists.m69268i();
        AbstractC22726b3<Map.Entry<AgeGroup, SelectedTicketProducts.SelectedTicketProduct>> it = selectedTicketProducts.getAgeGroupToSelectedTicketsMap().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<AgeGroup, SelectedTicketProducts.SelectedTicketProduct> next = it.next();
            SelectedTicketProducts.SelectedTicketProduct value = next.getValue();
            AgeGroup key = next.getKey();
            if (!arrayListM69268i2.contains(key)) {
                TicketOrderItem.Builder ticketOrderItemBuilderByAgeGroup = setTicketOrderItemBuilderByAgeGroup(key, value, selectedTicketProducts);
                ticketOrderItemBuilderByAgeGroup.withAgeGroup(com.disney.wdpro.bookingservices.product.AgeGroup.valueOf(key.name()).getCategory());
                ticketOrderItemBuilderByAgeGroup.withValidityDates(null, null, selectedTicketProducts.getNumberOfSelectedDays().intValue());
                ticketOrderItemBuilderByAgeGroup.withTax(selectedTicketProducts.getCombinedTax().get().getValue());
                ticketOrderItemBuilderByAgeGroup.withTotal(selectedTicketProducts.getCombinedTotal().get().getValue());
                ticketOrderItemBuilderByAgeGroup.withCategoryId(getAgeGroupCategoryId(key, selectedTicketProducts));
                addPoliciesToTicketOrder(selectedTicketProducts, str, ticketOrderItemBuilderByAgeGroup);
                arrayListM69268i2.add(key);
                arrayListM69268i.add(ticketOrderItemBuilderByAgeGroup.build());
            }
        }
        return arrayListM69268i;
    }

    public TicketOrderItem.Builder setTicketOrderItemBuilderByAgeGroup(AgeGroup ageGroup, SelectedTicketProducts.SelectedTicketProduct selectedTicketProduct, SelectedTicketProducts selectedTicketProducts) {
        int i10 = C120251.f32779x6a0953e1[ageGroup.ordinal()];
        if (i10 == 1) {
            return configureTicketOrder(selectedTicketProduct, selectedTicketProducts.getProductId(), selectedTicketProducts.getAdultATSCode().get(), selectedTicketProducts.getPricePerTicket().getAdultPricePerTicket().get().getValue(), selectedTicketProducts.getAdultCombinedSubtotal().get().getValue(), selectedTicketProducts.getNumberOfAdultTickets());
        }
        if (i10 == 2) {
            return configureTicketOrder(selectedTicketProduct, selectedTicketProducts.getProductId(), selectedTicketProducts.getChildATSCode().get(), selectedTicketProducts.getPricePerTicket().getChildPricePerTicket().get().getValue(), selectedTicketProducts.getChildCombinedSubtotal().get().getValue(), selectedTicketProducts.getNumberOfChildTickets());
        }
        if (i10 == 3) {
            return configureTicketOrder(selectedTicketProduct, selectedTicketProducts.getProductId(), selectedTicketProducts.getSeniorATSCode().get(), selectedTicketProducts.getPricePerTicket().getSeniorPricePerTicket().get().getValue(), selectedTicketProducts.getSeniorCombinedSubtotal().get().getValue(), selectedTicketProducts.getNumberOfSeniorTickets());
        }
        if (i10 == 4) {
            return configureTicketOrder(selectedTicketProduct, selectedTicketProducts.getProductId(), selectedTicketProducts.getAllAgesATSCode().get(), selectedTicketProducts.getPricePerTicket().getAllAgesPricePerTicket().get().getValue(), selectedTicketProducts.getCombinedSubtotal().get().getValue(), selectedTicketProducts.getNumberOfAllAgesTickets());
        }
        throw new IllegalArgumentException("Section not specified");
    }
}