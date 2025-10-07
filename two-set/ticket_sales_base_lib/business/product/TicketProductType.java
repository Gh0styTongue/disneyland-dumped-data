package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes18.dex */
public class TicketProductType implements Serializable {
    private static final long serialVersionUID = 1;
    private final String productId;

    public enum ProductId {
        WDW_MAGIC_KINGDOM_SINGLE_DAY("myw-mk"),
        WDW_MAGIC_KINGDOM_SINGLE_DAY_VALUE("myw-mk-value"),
        WDW_MAGIC_KINGDOM_SINGLE_DAY_REGULAR("myw-mk-regular"),
        WDW_MAGIC_KINGDOM_SINGLE_DAY_PEAK("myw-mk-peak"),
        WDW_NON_MAGIC_KINGDOM_SINGLE_DAY("myw-non-mk"),
        WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_VALUE("myw-non-mk-value"),
        WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_REGULAR("myw-non-mk-regular"),
        WDW_NON_MAGIC_KINGDOM_SINGLE_DAY_PEAK("myw-non-mk-peak"),
        WDW_ALL_THEME_PARKS_MULTI_DAY("myw"),
        WDW_ALL_THEME_PARKS_MULTI_DAY_VALUE("myw-value"),
        WDW_ALL_THEME_PARKS_MULTI_DAY_REGULAR("myw-regular"),
        WDW_ALL_THEME_PARKS_MULTI_DAY_PEAK("myw-peak"),
        DLR_THEME_PARK("dlr-theme-park"),
        DLR_MAX_PASS("dlr-maxpass"),
        DLR_THEME_PARK_VALUE("dlr-theme-park-value"),
        DLR_THEME_PARK_REGULAR("dlr-theme-park-regular"),
        DLR_THEME_PARK_PEAK("dlr-theme-park-peak"),
        MEMORY_MAKER("memory-maker"),
        PHOTO_PASS_PLUS("photopass-plus"),
        UNKNOWN_PARK("unknown");

        private static final Map<String, ProductId> LOOKUP = Maps.m69381r();

        /* renamed from: id */
        private final String f43913id;

        static {
            Iterator it = EnumSet.allOf(ProductId.class).iterator();
            while (it.hasNext()) {
                ProductId productId = (ProductId) it.next();
                C22462m.m68691w(LOOKUP.put(productId.getId(), productId) == null, "product id needs to be unique");
            }
        }

        ProductId(String str) {
            this.f43913id = str;
        }

        public static ProductId findById(String str) {
            ProductId productId = LOOKUP.get(str);
            return productId == null ? UNKNOWN_PARK : productId;
        }

        public String getId() {
            return this.f43913id;
        }
    }

    public TicketProductType(String str) {
        this.productId = str;
    }

    public String getProductId() {
        return this.productId;
    }
}