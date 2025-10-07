package com.disney.wdpro.photopass_plus.p400ui.providers;

import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class PhotoPassPlusLayoutProvider extends TicketSalesLayoutProvider {
    private static Map<WebStoreId, Integer> brickLayoutIdMap = createBrickLayoutIdMap();
    private final WebStoreId webStoreId;

    public PhotoPassPlusLayoutProvider(WebStoreId webStoreId) {
        super(webStoreId);
        this.webStoreId = webStoreId;
    }

    private static Map<WebStoreId, Integer> createBrickLayoutIdMap() {
        EnumMap enumMapM69380q = Maps.m69380q(WebStoreId.class);
        enumMapM69380q.put((EnumMap) WebStoreId.DLR_MOBILE, (WebStoreId) Integer.valueOf(C18785R.layout.ppp_option_list_item));
        enumMapM69380q.put((EnumMap) WebStoreId.WDW_MOBILE, (WebStoreId) Integer.valueOf(C18785R.layout.ppp_option_list_item));
        if (WebStoreId.values().length == enumMapM69380q.size()) {
            return enumMapM69380q;
        }
        throw new IllegalStateException("Not all web stores are mapped for brick layout id");
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.providers.TicketSalesLayoutProvider
    public Integer getBrickListItemLayoutID() {
        return brickLayoutIdMap.get(this.webStoreId);
    }
}