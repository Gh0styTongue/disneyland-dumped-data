package com.disney.wdpro.photopass_plus.models;

import com.disney.wdpro.photopass_plus.PhotoPassPlusConstants;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public enum PhotoPassProduct {
    A_LA_CARTE(0),
    ONE_DAY_MEMORY_MAKER(1),
    MULTI_DAY_MEMORY_MAKER(14),
    LEGACY_MEMORY_MAKER(null);

    private static final Map<Integer, PhotoPassProduct> LOOKUP = new HashMap();
    private Integer numOfDays;

    static {
        for (PhotoPassProduct photoPassProduct : values()) {
            LOOKUP.put(photoPassProduct.numOfDays, photoPassProduct);
        }
    }

    PhotoPassProduct(Integer num) {
        this.numOfDays = num;
    }

    public static PhotoPassProduct getProduct(SelectedTicketProducts selectedTicketProducts) {
        return PhotoPassPlusConstants.LEGACY_MEMORY_MAKER_CODE.equalsIgnoreCase(selectedTicketProducts.getAllAgesATSCode().orNull()) ? LEGACY_MEMORY_MAKER : LOOKUP.get(selectedTicketProducts.getNumberOfSelectedDays());
    }
}