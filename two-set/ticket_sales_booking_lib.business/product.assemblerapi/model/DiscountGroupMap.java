package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes18.dex */
final class DiscountGroupMap extends HashMap<String, ProductInstanceList> {

    static class ProductInstanceList extends ArrayList<ProductInstance> {
        ProductInstanceList() {
        }
    }

    static Object getDeserializer() {
        return new JsonDeserializer<DiscountGroupMap>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.DiscountGroupMap.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public DiscountGroupMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                DiscountGroupMap discountGroupMap = new DiscountGroupMap();
                for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        discountGroupMap.put(key, (ProductInstanceList) jsonDeserializationContext.deserialize(entry.getValue(), ProductInstanceList.class));
                    }
                }
                return discountGroupMap;
            }
        };
    }

    private DiscountGroupMap() {
    }
}