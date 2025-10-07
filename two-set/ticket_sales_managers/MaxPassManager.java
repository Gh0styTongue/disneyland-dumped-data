package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.midichlorian.CacheContextModifier;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.ticket_sales_base_lib.ResponseEvent;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_managers.models.MaxPassProductGroup;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes19.dex */
public interface MaxPassManager extends CacheContextModifier<MaxPassManager> {

    public static class MaxPassProductEvent extends ResponseEvent<MaxPassProductGroup> {
    }

    @UIEvent
    MaxPassProductEvent fetchMaxPassProducts(ProductCategoryType productCategoryType, DestinationId destinationId, WebStoreId webStoreId, List<String> list, String str, Calendar calendar);
}