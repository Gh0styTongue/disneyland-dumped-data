package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.google.common.collect.Maps;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes18.dex */
public final class SupportedDeliveryOptions implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<String, SupportedDeliveryOption> idToDeliveryOptions;

    public static class SupportedDeliveryOption implements Serializable {
        private static final long serialVersionUID = 1;
        private String deliveryItemDescription;
        private String deliveryMethodDescription;
        private String deliveryShippingDescription;

        /* renamed from: id */
        private String f43904id;
        private int leadTime;
        private String name;
        private String pickupArea;
        private Pricing pricing;
        private String salesType;

        public String getDeliveryItemDescription() {
            return this.deliveryItemDescription;
        }

        public String getDeliveryMethodDescription() {
            return this.deliveryMethodDescription;
        }

        public String getDeliveryShippingDescription() {
            return this.deliveryShippingDescription;
        }

        public String getId() {
            return this.f43904id;
        }

        public int getLeadTime() {
            return this.leadTime;
        }

        public String getName() {
            return this.name;
        }

        public String getPickupArea() {
            return this.pickupArea;
        }

        public Pricing getPricing() {
            return this.pricing;
        }

        public String getSalesType() {
            return this.salesType;
        }

        public String toString() {
            return String.format("id[%s], pricing [%s], name[%s] salesType[%s] pickupArea[%s] deliveryShippingDescription[%s] deliveryMethodDescription[%s] leadTime[%s] deliveryItemDescription[%s]", this.f43904id, this.pricing, this.name, this.salesType, this.pickupArea, this.deliveryShippingDescription, this.deliveryMethodDescription, Integer.valueOf(this.leadTime), this.deliveryItemDescription);
        }
    }

    private static class SupportedDeliveryOptionsDeserializer implements JsonDeserializer<SupportedDeliveryOptions> {
        private SupportedDeliveryOptionsDeserializer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public SupportedDeliveryOptions deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonArray asJsonArray = jsonElement.getAsJsonObject().get(APIConstants.JsonKeys.ENTRIES).getAsJsonArray();
            HashMap mapM69381r = Maps.m69381r();
            for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                SupportedDeliveryOption supportedDeliveryOption = (SupportedDeliveryOption) jsonDeserializationContext.deserialize(asJsonArray.get(i10), SupportedDeliveryOption.class);
                mapM69381r.put(supportedDeliveryOption.getId(), supportedDeliveryOption);
            }
            return new SupportedDeliveryOptions(mapM69381r);
        }
    }

    public static InterfaceC13334f getDecoder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Pricing.class, new Pricing.PricingDeserializer());
        gsonBuilder.registerTypeAdapter(SupportedDeliveryOptions.class, new SupportedDeliveryOptionsDeserializer());
        return new InterfaceC13334f.a(gsonBuilder);
    }

    public SupportedDeliveryOption getSupportedDeliveryOption(String str) {
        return this.idToDeliveryOptions.get(str);
    }

    public String toString() {
        return String.format("%s", this.idToDeliveryOptions);
    }

    private SupportedDeliveryOptions(Map<String, SupportedDeliveryOption> map) {
        this.idToDeliveryOptions = map;
    }
}