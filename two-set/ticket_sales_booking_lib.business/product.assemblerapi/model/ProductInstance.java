package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.disney.wdpro.opp.dine.data.services.util.ServicesConstants;
import com.disney.wdpro.sag.deeplink.ScanAndGoDeepLinks;
import com.disney.wdpro.secommerce.api.lexvas.SpecialEventsApiClientImpl;
import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AddOnOption;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DiscountGroupType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.TicketProductType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyImpl;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes18.dex */
public class ProductInstance implements Serializable {
    private static final long serialVersionUID = 1;
    private List<AddOnOption> addOns;
    private String ageGroup;
    private String categoryId;
    private DestinationId destinationId;
    private DiscountGroupType discountGroup;
    private HashMap<String, DisplayNameMap.DisplayName> names;
    private int numDays;
    private List<PolicyImpl> policies;
    private Pricing pricing;
    private TicketProductType productId;
    private String productIdString;
    private String productInstanceId;
    private String productType;
    private boolean renewal;
    private String sku;
    private String sourceSystem;
    private Price subTotalPricePerDay;
    private final String tier;

    private static class Builder {
        private List<AddOnOption> addOns;
        private String ageGroup;
        private String categoryId;
        private DestinationId destinationId;
        private DiscountGroupType discountGroup;
        private HashMap<String, DisplayNameMap.DisplayName> names;
        private int numDays;
        private List<PolicyImpl> policies;
        private Pricing pricing;
        private TicketProductType productId;
        private String productIdString;
        private String productInstanceId;
        private String productType;
        private boolean renewal;
        private String sku;
        private String sourceSystem;
        private Price subTotalPricePerDay;
        private String tier;

        private Builder() {
        }
    }

    private static class ProductInstanceDeserializer implements JsonDeserializer<ProductInstance> {
        private final PolicyMap policyMap;

        ProductInstanceDeserializer(PolicyMap policyMap) {
            this.policyMap = policyMap;
        }

        private void deserializeAddOns(Builder builder, JsonObject jsonObject) {
            builder.addOns = Lists.m69268i();
            if (existsAndIsAnArray(jsonObject, ServicesConstants.PRODUCT_ADD_ONS)) {
                Iterator<JsonElement> it = jsonObject.getAsJsonArray(ServicesConstants.PRODUCT_ADD_ONS).iterator();
                while (it.hasNext()) {
                    AddOnOption addOnOptionFindById = AddOnOption.findById(it.next().getAsString());
                    if (addOnOptionFindById == null) {
                        throw new JsonParseException("unknown add on");
                    }
                    builder.addOns.add(addOnOptionFindById);
                }
            }
        }

        private void deserializeNames(Builder builder, JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            builder.names = Maps.m69381r();
            for (Map.Entry<String, JsonElement> entry : jsonObject.get("names").getAsJsonObject().entrySet()) {
                builder.names.put(entry.getKey(), (DisplayNameMap.DisplayName) jsonDeserializationContext.deserialize(entry.getValue(), DisplayNameMap.DisplayName.class));
            }
        }

        private void deserializePolicies(Builder builder, JsonObject jsonObject) {
            builder.policies = Lists.m69268i();
            if (existsAndIsAnArray(jsonObject, "policyIds")) {
                Iterator<JsonElement> it = jsonObject.getAsJsonArray("policyIds").iterator();
                while (it.hasNext()) {
                    String asString = it.next().getAsString();
                    PolicyImpl policyImpl = this.policyMap.get(asString);
                    if (policyImpl == null) {
                        throw new JsonParseException("unknown policy " + asString);
                    }
                    builder.policies.add(policyImpl);
                }
            }
        }

        private Price deserializePrice(JsonObject jsonObject, String str, String str2) {
            if (existsAndIsNotNull(jsonObject, str)) {
                return Price.priceFromCurrencyCode(str2, jsonObject.get(str).getAsBigDecimal());
            }
            return null;
        }

        private void deserializePricingData(Builder builder, JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            builder.pricing = new Pricing.PricingDeserializer().deserialize((JsonElement) jsonObject, (Type) Pricing.class, jsonDeserializationContext);
            builder.subTotalPricePerDay = deserializePrice(jsonObject, "subTotalPricePerDay", jsonObject.get("currency").getAsString());
        }

        private static boolean existsAndIsAnArray(JsonObject jsonObject, String str) {
            if (jsonObject.has(str)) {
                return jsonObject.get(str).isJsonArray();
            }
            return false;
        }

        private static boolean existsAndIsNotNull(JsonObject jsonObject, String str) {
            if (jsonObject.has(str)) {
                return !jsonObject.get(str).isJsonNull();
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public ProductInstance deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                Builder builder = new Builder();
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                builder.productInstanceId = asJsonObject.get("productInstanceId").getAsString();
                builder.productIdString = asJsonObject.get("productId").getAsString();
                builder.productId = new TicketProductType(builder.productIdString);
                builder.destinationId = new DestinationId(asJsonObject.get("destinationId").getAsString());
                builder.discountGroup = DiscountGroupType.findById(asJsonObject.get("discountGroupId").getAsString());
                builder.renewal = asJsonObject.get(SpecialEventsApiClientImpl.PARAM_RENEWAL).getAsBoolean();
                builder.sourceSystem = asJsonObject.get("sourceSystem").getAsString();
                builder.sku = asJsonObject.get(ScanAndGoDeepLinks.DEEP_LINK_SKU_PARAM_KEY).getAsString();
                builder.productType = asJsonObject.get(ServicesConstants.PRODUCT_TYPE).getAsString();
                builder.ageGroup = asJsonObject.get("ageGroup").getAsString();
                builder.numDays = asJsonObject.get("numDays").getAsInt();
                JsonElement jsonElement2 = asJsonObject.get("tier");
                builder.tier = jsonElement2 != null ? jsonElement2.getAsString().toUpperCase() : null;
                JsonElement jsonElement3 = asJsonObject.get(ServicesConstants.CATEGORY_ID);
                builder.categoryId = jsonElement3 != null ? jsonElement3.getAsString() : null;
                deserializePricingData(builder, asJsonObject, jsonDeserializationContext);
                deserializeNames(builder, asJsonObject, jsonDeserializationContext);
                deserializePolicies(builder, asJsonObject);
                deserializeAddOns(builder, asJsonObject);
                return new ProductInstance(builder);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static Object getDeserializer(PolicyMap policyMap) {
        return new ProductInstanceDeserializer(policyMap);
    }

    public String getATSCode() {
        return this.sku;
    }

    public Set<AddOnOption> getAddOnOptions() {
        return ImmutableSet.copyOf((Collection) this.addOns);
    }

    public AgeGroup getAgeGroup() {
        return AgeGroup.findByCategory(this.ageGroup);
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public DisplayNameMap getDisplayNames() {
        return new DisplayNameMap(this.names);
    }

    public int getNumberOfDays() {
        return this.numDays;
    }

    public List<Policy> getPolicies() {
        ImmutableList.C22583a c22583a = new ImmutableList.C22583a();
        c22583a.m69051k(this.policies);
        return c22583a.m69053m();
    }

    public Pricing getPricing() {
        return this.pricing;
    }

    public String getProductIdString() {
        return this.productIdString;
    }

    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public Price getSubTotalPricePerDay() {
        return this.subTotalPricePerDay;
    }

    public TicketProductType getTicketProductType() {
        return this.productId;
    }

    public String getTier() {
        return this.tier;
    }

    private ProductInstance(Builder builder) {
        this.addOns = builder.addOns;
        this.ageGroup = builder.ageGroup;
        this.destinationId = builder.destinationId;
        this.discountGroup = builder.discountGroup;
        this.names = builder.names;
        this.numDays = builder.numDays;
        this.policies = builder.policies;
        this.pricing = builder.pricing;
        this.productId = builder.productId;
        this.productIdString = builder.productIdString;
        this.productInstanceId = builder.productInstanceId;
        this.productType = builder.productType;
        this.renewal = builder.renewal;
        this.sku = builder.sku;
        this.sourceSystem = builder.sourceSystem;
        this.subTotalPricePerDay = builder.subTotalPricePerDay;
        this.categoryId = builder.categoryId;
        this.tier = builder.tier;
    }
}