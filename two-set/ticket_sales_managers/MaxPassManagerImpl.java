package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.ProductAssemblerApiClient;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.ProductInstance;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse;
import com.disney.wdpro.ticket_sales_managers.MaxPassManager;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProduct;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProductGroup;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class MaxPassManagerImpl implements MaxPassManager {
    private final ProductAssemblerApiClient productAssemblerApiClient;
    private final C9248i vendomatic;

    @Inject
    public MaxPassManagerImpl(ProductAssemblerApiClient productAssemblerApiClient, C9248i c9248i) {
        this.productAssemblerApiClient = productAssemblerApiClient;
        this.vendomatic = c9248i;
    }

    private MaxPassProductGroup processTicketProducts(TicketAssemblerResponse ticketAssemblerResponse, List<String> list) {
        ArrayList arrayListM69268i = Lists.m69268i();
        String str = new String();
        String str2 = new String();
        String str3 = new String();
        String currencyCode = str3;
        BigDecimal bigDecimal = null;
        String str4 = str2;
        for (String str5 : list) {
            for (ProductInstance productInstance : ticketAssemblerResponse.getProductInstanceList(str5)) {
                arrayListM69268i.add(new MaxPassProduct(productInstance.getProductInstanceId(), productInstance.getATSCode(), productInstance.getProductIdString(), str5, productInstance.getCategoryId(), productInstance.getPolicies()));
                String htmlText = productInstance.getDisplayNames().getName("wdproMobileName").getHtmlText();
                String htmlText2 = productInstance.getDisplayNames().getName(DisplayNameMap.KEY_PRODUCT_SUB_CAPTION).getHtmlText();
                BigDecimal value = productInstance.getPricing().getSubtotal().get().getValue();
                currencyCode = productInstance.getPricing().getCurrencyCode();
                str = htmlText;
                str4 = htmlText2;
                bigDecimal = value;
            }
        }
        return new MaxPassProductGroup(arrayListM69268i, ticketAssemblerResponse.getDestinationId().getId(), ticketAssemblerResponse.getWebStoreId().getId(), str, str4, bigDecimal, currencyCode);
    }

    @Override // com.disney.wdpro.ticket_sales_managers.MaxPassManager
    public MaxPassManager.MaxPassProductEvent fetchMaxPassProducts(ProductCategoryType productCategoryType, DestinationId destinationId, WebStoreId webStoreId, List<String> list, String str, Calendar calendar) {
        MaxPassManager.MaxPassProductEvent maxPassProductEvent = new MaxPassManager.MaxPassProductEvent();
        try {
            maxPassProductEvent.setResult((MaxPassManager.MaxPassProductEvent) processTicketProducts(this.productAssemblerApiClient.getTicketProducts(productCategoryType, destinationId, webStoreId, list, str, calendar, this.vendomatic.m38675C0(), this.vendomatic.m38788r1()), list));
            return maxPassProductEvent;
        } catch (IOException e10) {
            maxPassProductEvent.setException(e10);
            return maxPassProductEvent;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public MaxPassManager noCache() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public MaxPassManager preload() {
        return null;
    }
}