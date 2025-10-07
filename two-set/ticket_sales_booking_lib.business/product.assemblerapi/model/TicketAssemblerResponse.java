package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.disney.wdpro.ticket_sales_base_lib.business.DestinationId;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.disney.wdpro.ticket_sales_base_lib.business.WebStoreId;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketCalendarMap;
import com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar;
import com.disney.wdpro.ticket_sales_base_lib.business.product.AgeGroup;
import com.disney.wdpro.ticket_sales_base_lib.business.product.FeatureDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.OfferDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductAffiliationDto;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyImpl;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.ProductInstanceKey;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierNameDescription;
import com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.DiscountGroupMap;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.AbstractC22726b3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public final class TicketAssemblerResponse implements Serializable {
    private static final String AFFILIATIONS = "affiliations";
    private static final String FEATURES = "features";
    private static final String OFFERS = "offers";
    private static final long serialVersionUID = 1;
    private final Optional<HashMap<String, ProductAffiliationDto>> affiliations;
    private Map<String, Collection<AgeGroup>> ageGroupsByProductId;
    private final DestinationId destinationId;
    private final DiscountGroupMap discountGroups;
    private final String dtiStoreId;
    private HashMap<String, FeatureDto> featureDtoMap;
    private final boolean isTieredTicketsEnabled;
    private final Optional<HashMap<String, OfferDto>> offers;
    private final ProductCategoryType productCategoryType;
    private final Map<String, String> productIdByTier;
    private final Set<String> productIdList;
    private final Map<ProductInstanceKey, ProductInstance> productInstanceMap;
    private final Calendar responseDateTime;
    private final Calendar sellableOnDate;
    private final String sessionId;
    private final TicketDays ticketDays;
    private final Optional<TieredTicketCalendarMap> tieredTicketCalendarMap;
    private final WebStoreId webStoreId;

    private static class Builder {
        private Optional<HashMap<String, ProductAffiliationDto>> affiliations;
        private DestinationId destinationId;
        private DiscountGroupMap discountGroups;
        private String dtiStoreId;
        private HashMap<String, FeatureDto> featureDtoMap;
        private boolean isTieredTicketsEnabled;
        private Optional<HashMap<String, OfferDto>> offers;
        private ProductCategoryType productCategoryType;
        private Calendar responseDateTime;
        private Calendar sellableOnDate;
        private String sessionId;
        private TicketDays ticketDays;
        private TieredTicketCalendarMap tieredTicketCalendarMap;
        private WebStoreId webStoreId;

        /* JADX INFO: Access modifiers changed from: private */
        public TicketAssemblerResponse build() {
            return new TicketAssemblerResponse(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setAffiliations(HashMap<String, ProductAffiliationDto> map) {
            this.affiliations = Optional.m68592of(map);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setDestinationId(DestinationId destinationId) {
            this.destinationId = destinationId;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setDiscountGroups(DiscountGroupMap discountGroupMap) {
            this.discountGroups = discountGroupMap;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setDtiStoreId(String str) {
            this.dtiStoreId = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setFeatureDtoMap(HashMap<String, FeatureDto> map) {
            this.featureDtoMap = map;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setOffers(HashMap<String, OfferDto> map) {
            this.offers = Optional.m68592of(map);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setProductCategoryType(ProductCategoryType productCategoryType) {
            this.productCategoryType = productCategoryType;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setResponseDateTime(Calendar calendar) {
            this.responseDateTime = calendar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setSellableOnDate(Calendar calendar) {
            this.sellableOnDate = calendar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setTicketDays(TicketDays ticketDays) {
            this.ticketDays = ticketDays;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setTieredTicketCalendarMap(TieredTicketCalendarMap tieredTicketCalendarMap) {
            this.tieredTicketCalendarMap = tieredTicketCalendarMap;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setTieredTicketsEnabled(boolean z10) {
            this.isTieredTicketsEnabled = z10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder setWebStoreId(WebStoreId webStoreId) {
            this.webStoreId = webStoreId;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        private Builder() {
            this.affiliations = Optional.absent();
            this.offers = Optional.absent();
        }
    }

    @Instrumented
    private static class TicketAssemblerResponseJsonDeserializer implements JsonDeserializer<TicketAssemblerResponse> {
        private static final boolean IS_TIERED_DAY = true;
        private final Calendar sellableOnDate;
        private final String sessionId;
        private final WebStoreId webStoreId;

        TicketAssemblerResponseJsonDeserializer(WebStoreId webStoreId, String str, Calendar calendar) {
            this.webStoreId = webStoreId;
            this.sessionId = str;
            this.sellableOnDate = calendar;
        }

        private TicketDays getSortedTicketDays(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, PolicyMap policyMap) {
            TicketDays ticketDays;
            try {
                ticketDays = (TicketDays) jsonDeserializationContext.deserialize(jsonElement, TicketDays.class);
                Iterator<TicketDay> it = ticketDays.iterator();
                while (it.hasNext()) {
                    it.next().resolvePolicyLinks(policyMap);
                }
            } catch (JsonParseException unused) {
                ticketDays = null;
            }
            if (ticketDays == null || ticketDays.isEmpty()) {
                ticketDays = new TicketDays();
                HashSet hashSetM69460g = Sets.m69460g();
                Iterator<JsonElement> it2 = jsonObject.get("availableNumDays").getAsJsonArray().iterator();
                while (it2.hasNext()) {
                    hashSetM69460g.add(new TicketDay(Boolean.FALSE, Integer.valueOf(it2.next().getAsInt()), null, null, null));
                }
                ticketDays.addAll(hashSetM69460g);
            }
            Collections.sort(ticketDays);
            return ticketDays;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.c] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Calendar] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // com.google.gson.JsonDeserializer
        public TicketAssemblerResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            Gson gson = new Gson();
            ?? r22 = 0;
            Calendar calendar = null;
            r22 = 0;
            r22 = 0;
            Builder builder = new Builder();
            PolicyMap policyMap = (PolicyMap) jsonDeserializationContext.deserialize(asJsonObject.get("policies").getAsJsonObject(), PolicyMap.class);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(DiscountGroupMap.class, DiscountGroupMap.getDeserializer());
            gsonBuilder.registerTypeAdapter(ProductInstance.class, ProductInstance.getDeserializer(policyMap));
            JsonObject asJsonObject2 = asJsonObject.get("discountGroups").getAsJsonObject();
            Gson gsonCreate = gsonBuilder.create();
            DiscountGroupMap discountGroupMap = (DiscountGroupMap) (gsonCreate == null ? gsonCreate.fromJson((JsonElement) asJsonObject2, DiscountGroupMap.class) : GsonInstrumentation.fromJson(gsonCreate, (JsonElement) asJsonObject2, DiscountGroupMap.class));
            boolean z10 = false;
            boolean z11 = asJsonObject.has("isTieredTicketsEnabled") && asJsonObject.get("isTieredTicketsEnabled").getAsBoolean();
            TicketDays sortedTicketDays = getSortedTicketDays(jsonElement, jsonDeserializationContext, asJsonObject, policyMap);
            ProductCategoryType productCategoryTypeFindById = ProductCategoryType.findById(asJsonObject.get("category").getAsString());
            DestinationId destinationId = new DestinationId(asJsonObject.get("destinationId").getAsString());
            String asString = asJsonObject.get("storeId").getAsString();
            if (sortedTicketDays != null && !sortedTicketDays.isEmpty()) {
                z10 = true;
            }
            if (C22466q.m68722b(asString) || this.webStoreId == null || !z10) {
                StringBuilder sb2 = new StringBuilder();
                if (C22466q.m68722b(asString) || this.webStoreId == null) {
                    sb2.append("[Store Id: json key -> storeId] ");
                }
                if (!z10) {
                    sb2.append(String.format("[Available Number of Days: json key -> %s] ", z11 ? "ticketDays" : "availableNumDays"));
                }
                throw new JsonParseException(String.format("%snot found. We cannot process the tickets", sb2.toString()));
            }
            TieredTicketCalendarMap tieredTicketCalendarMap = asJsonObject.has("calendars") ? (TieredTicketCalendarMap) jsonDeserializationContext.deserialize(asJsonObject.get("calendars").getAsJsonObject(), TieredTicketCalendarMap.class) : null;
            if (productCategoryTypeFindById.compareTo(ProductCategoryType.MAX_PASS) == 0 && asJsonObject.has("responseDateTime") && !asJsonObject.get("responseDateTime").getAsString().isEmpty()) {
                try {
                    calendar = Calendar.getInstance();
                    calendar.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS-HH:mm").parse(asJsonObject.get("responseDateTime").getAsString()));
                    r22 = calendar;
                } catch (ParseException e10) {
                    e10.printStackTrace();
                    r22 = calendar;
                }
            }
            builder.setDiscountGroups(discountGroupMap).setTicketDays(sortedTicketDays).setProductCategoryType(productCategoryTypeFindById).setDestinationId(destinationId).setDtiStoreId(asString).setWebStoreId(this.webStoreId).setSessionId(this.sessionId).setSellableOnDate(this.sellableOnDate).setTieredTicketsEnabled(z11).setTieredTicketCalendarMap(tieredTicketCalendarMap).setResponseDateTime(r22);
            if (asJsonObject.has("affiliations")) {
                builder.setAffiliations((HashMap) GsonInstrumentation.fromJson(gson, asJsonObject.get("affiliations").getAsJsonObject(), new TypeToken<HashMap<String, ProductAffiliationDto>>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse.TicketAssemblerResponseJsonDeserializer.1
                }.getType()));
            }
            if (asJsonObject.has(TicketAssemblerResponse.OFFERS)) {
                builder.setOffers((HashMap) GsonInstrumentation.fromJson(gson, asJsonObject.get(TicketAssemblerResponse.OFFERS).getAsJsonObject(), new TypeToken<HashMap<String, OfferDto>>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse.TicketAssemblerResponseJsonDeserializer.2
                }.getType()));
            }
            if (asJsonObject.has(TicketAssemblerResponse.FEATURES)) {
                builder.setFeatureDtoMap((HashMap) GsonInstrumentation.fromJson(gson, asJsonObject.get(TicketAssemblerResponse.FEATURES).getAsJsonObject(), new TypeToken<HashMap<String, FeatureDto>>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketAssemblerResponse.TicketAssemblerResponseJsonDeserializer.3
                }.getType()));
            }
            return builder.build();
        }
    }

    private static Object getDeserializer(WebStoreId webStoreId, String str, Calendar calendar) {
        return new TicketAssemblerResponseJsonDeserializer(webStoreId, str, calendar);
    }

    public static GsonBuilder getGsonBuilder(WebStoreId webStoreId, String str, Calendar calendar) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(TicketAssemblerResponse.class, getDeserializer(webStoreId, str, calendar));
        gsonBuilder.registerTypeAdapter(TicketDay.class, TicketDay.getDeserializer());
        gsonBuilder.registerTypeAdapter(TicketDays.class, TicketDays.getDeserializer());
        gsonBuilder.registerTypeAdapter(TieredTicketCalendarMap.class, TieredTicketCalendarMap.getDeserializer());
        gsonBuilder.registerTypeAdapter(TieredTicketsCalendar.class, TieredTicketsCalendar.getDeserializer());
        gsonBuilder.registerTypeAdapter(TicketTierNameDescription.class, TicketTierNameDescription.getDeserializer());
        gsonBuilder.registerTypeAdapter(Pricing.class, new Pricing.PricingDeserializer());
        gsonBuilder.registerTypeAdapter(Price.class, new Price.PriceDeserializer());
        gsonBuilder.registerTypeAdapter(PolicyImpl.class, PolicyImpl.getDeserializer());
        return gsonBuilder;
    }

    private Map<ProductInstanceKey, ProductInstance> premapData() {
        HashMap mapM69381r = Maps.m69381r();
        AbstractC22726b3<String> it = getDiscountGroupTypes().iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (ProductInstance productInstance : getProductInstanceList(next)) {
                ProductInstance productInstance2 = (ProductInstance) mapM69381r.put(new ProductInstanceKey(productInstance.getTicketProductType().getProductId(), next, productInstance.getAgeGroup(), productInstance.getNumberOfDays(), productInstance.getAddOnOptions(), productInstance.getTier()), productInstance);
                if (productInstance2 != null) {
                    productInstance.getProductInstanceId();
                    productInstance2.getProductInstanceId();
                    throw new JsonParseException("Non unique Product Instances found");
                }
            }
        }
        return mapM69381r;
    }

    public Optional<HashMap<String, ProductAffiliationDto>> getAffiliations() {
        return this.affiliations;
    }

    public Map<String, Collection<AgeGroup>> getAgeGroupsByProductId() {
        return this.ageGroupsByProductId;
    }

    public DestinationId getDestinationId() {
        return this.destinationId;
    }

    public ImmutableSet<String> getDiscountGroupTypes() {
        return ImmutableSet.copyOf((Collection) this.discountGroups.keySet());
    }

    public String getDtiStoreId() {
        return this.dtiStoreId;
    }

    public Map<String, FeatureDto> getFeatureDtoMap() {
        return this.featureDtoMap;
    }

    public ImmutableList<TicketDay> getNumberOfSupportedDays() {
        return ImmutableList.copyOf((Collection) this.ticketDays);
    }

    public Optional<HashMap<String, OfferDto>> getOffers() {
        return this.offers;
    }

    public ProductCategoryType getProductCategoryType() {
        return this.productCategoryType;
    }

    public Map<String, String> getProductIdByTier(String str) {
        return this.productIdByTier;
    }

    public Set<String> getProductIdList(String str) {
        return this.productIdList;
    }

    public List<ProductInstance> getProductInstanceList(String str) {
        DiscountGroupMap.ProductInstanceList productInstanceList = this.discountGroups.get(str);
        ImmutableList.C22583a c22583a = new ImmutableList.C22583a();
        Iterator<ProductInstance> it = productInstanceList.iterator();
        while (it.hasNext()) {
            ProductInstance next = it.next();
            if (next != null) {
                String productIdString = next.getProductIdString();
                HashSet hashSetM69463j = Sets.m69463j(next.getAgeGroup());
                if (this.ageGroupsByProductId.containsKey(productIdString) && this.ageGroupsByProductId.get(productIdString) != null) {
                    hashSetM69463j.addAll(this.ageGroupsByProductId.get(productIdString));
                }
                this.ageGroupsByProductId.put(productIdString, hashSetM69463j);
                this.productIdList.add(productIdString);
                this.productIdByTier.put(next.getTier(), productIdString);
                c22583a.mo69026a(next);
            }
        }
        return c22583a.m69053m();
    }

    public Map<ProductInstanceKey, ProductInstance> getProductInstanceMap() {
        return Collections.unmodifiableMap(this.productInstanceMap);
    }

    public Calendar getResponseDateTime() {
        return this.responseDateTime;
    }

    public Optional<Calendar> getSellableOnDate() {
        return Optional.fromNullable(this.sellableOnDate);
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Optional<TieredTicketCalendarMap> getTieredTicketProductsCalendars() {
        return this.tieredTicketCalendarMap;
    }

    public WebStoreId getWebStoreId() {
        return this.webStoreId;
    }

    public boolean isTieredTicketsEnabled() {
        return this.isTieredTicketsEnabled;
    }

    private TicketAssemblerResponse(Builder builder) {
        this.discountGroups = builder.discountGroups;
        this.ticketDays = builder.ticketDays;
        this.productCategoryType = builder.productCategoryType;
        this.destinationId = builder.destinationId;
        this.dtiStoreId = builder.dtiStoreId;
        this.webStoreId = builder.webStoreId;
        this.sessionId = builder.sessionId;
        this.sellableOnDate = builder.sellableOnDate;
        this.isTieredTicketsEnabled = builder.isTieredTicketsEnabled;
        this.tieredTicketCalendarMap = Optional.fromNullable(builder.tieredTicketCalendarMap);
        this.responseDateTime = builder.responseDateTime;
        this.affiliations = builder.affiliations;
        this.offers = builder.offers;
        this.featureDtoMap = builder.featureDtoMap;
        this.productIdList = Sets.m69460g();
        this.productIdByTier = Maps.m69381r();
        this.ageGroupsByProductId = Maps.m69381r();
        this.productInstanceMap = premapData();
    }
}