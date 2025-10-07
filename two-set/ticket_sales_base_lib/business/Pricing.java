package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF", "NP_NULL_PARAM_DEREF_NONVIRTUAL"})
/* loaded from: classes18.dex */
public class Pricing implements Serializable {
    private static final int HASH_CODE_NUMBER = 31;
    public static final Map<Price.SupportedCurrency, Pricing> ZERO_VALUES = createZeroValues();
    private static final long serialVersionUID = 1;
    private final Optional<Price> baseTotalValue;
    private final String currencyCode;
    private final Price gratuity;
    private final Optional<Price> subtotal;
    private final Optional<Price> tax;
    private final boolean taxIncluded;
    private final Price total;
    private final Optional<Price> totalTicketValue;

    public static class PricingDeserializer implements JsonDeserializer<Pricing> {
        private static final String TICKET_CURRENCY_KEY = "currency";
        private static final String TICKET_PRICE_BASE_TOTAL_VALUE_KEY = "baseTotalValue";
        private static final String TICKET_PRICE_GRATUITY_KEY = "gratuity";
        private static final String TICKET_PRICE_SUBTOTAL_KEY = "subtotal";
        private static final String TICKET_PRICE_TAX_KEY = "tax";
        private static final String TICKET_PRICE_TICKET_VALUE_KEY = "totalTicketValue";
        private static final String TICKET_PRICE_TOTAL_KEY = "total";
        private static final String TICKET_TAX_INCLUDED_KEY = "taxIncluded";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Pricing deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            BigDecimal asBigDecimal = asJsonObject.get("total").getAsBigDecimal();
            String asString = asJsonObject.get(TICKET_CURRENCY_KEY).getAsString();
            if (asString == null) {
                throw new JsonParseException("required element currency not found");
            }
            if (Price.SupportedCurrency.findByCode(asString) != null) {
                return new Pricing(asJsonObject.has(TICKET_PRICE_SUBTOTAL_KEY) ? asJsonObject.get(TICKET_PRICE_SUBTOTAL_KEY).getAsBigDecimal() : null, asJsonObject.has(TICKET_PRICE_TAX_KEY) ? asJsonObject.get(TICKET_PRICE_TAX_KEY).getAsBigDecimal() : null, asBigDecimal, asJsonObject.has(TICKET_PRICE_GRATUITY_KEY) ? asJsonObject.get(TICKET_PRICE_GRATUITY_KEY).getAsBigDecimal() : BigDecimal.valueOf(0L), asJsonObject.has(TICKET_PRICE_TICKET_VALUE_KEY) ? asJsonObject.get(TICKET_PRICE_TICKET_VALUE_KEY).getAsBigDecimal() : null, asJsonObject.has(TICKET_PRICE_BASE_TOTAL_VALUE_KEY) ? asJsonObject.get(TICKET_PRICE_BASE_TOTAL_VALUE_KEY).getAsBigDecimal() : null, asString, asJsonObject.has(TICKET_TAX_INCLUDED_KEY) ? asJsonObject.get(TICKET_TAX_INCLUDED_KEY).getAsBoolean() : false);
            }
            throw new JsonParseException("currency " + asString + " not supported");
        }
    }

    public static class PricingSerializer implements JsonSerializer<Pricing> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Pricing pricing, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            if (pricing.getSubtotal().isPresent()) {
                jsonObject.addProperty("subtotal", pricing.getSubtotal().get().getValue());
            }
            if (pricing.getTax().isPresent()) {
                jsonObject.addProperty("tax", pricing.getTax().get().getValue());
            }
            if (pricing.getTotalTicketValue().isPresent()) {
                jsonObject.addProperty("totalTicketValue", pricing.getTotalTicketValue().get().getValue());
            }
            if (pricing.getBaseTotalValue().isPresent()) {
                jsonObject.addProperty("baseTotalValue", pricing.getBaseTotalValue().get().getValue());
            }
            String currencyCode = pricing.getCurrencyCode();
            BigDecimal value = pricing.getTotal().getValue();
            jsonObject.addProperty("currency", currencyCode);
            jsonObject.addProperty("total", value);
            jsonObject.addProperty("taxIncluded", Boolean.valueOf(pricing.getTaxIncluded()));
            return jsonObject;
        }
    }

    private static Map<Price.SupportedCurrency, Pricing> createZeroValues() {
        EnumMap enumMapM69380q = Maps.m69380q(Price.SupportedCurrency.class);
        Price.SupportedCurrency supportedCurrency = Price.SupportedCurrency.USD;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        enumMapM69380q.put((EnumMap) supportedCurrency, (Price.SupportedCurrency) new Pricing(bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, "USD", false));
        enumMapM69380q.put((EnumMap) Price.SupportedCurrency.CNY, (Price.SupportedCurrency) new Pricing(bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, "CNY", false));
        if (EnumSet.allOf(Price.SupportedCurrency.class).size() == enumMapM69380q.size()) {
            return Maps.m69373j(enumMapM69380q);
        }
        throw new IllegalStateException("Not all values of enum " + Price.SupportedCurrency.class.getSimpleName() + " placed in map");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Pricing pricing = (Pricing) obj;
            if (this.taxIncluded == pricing.taxIncluded && Objects.equals(this.subtotal, pricing.subtotal) && Objects.equals(this.tax, pricing.tax) && Objects.equals(this.total, pricing.total) && Objects.equals(this.gratuity, pricing.gratuity) && Objects.equals(this.totalTicketValue, pricing.totalTicketValue) && Objects.equals(this.baseTotalValue, pricing.baseTotalValue) && Objects.equals(this.currencyCode, pricing.currencyCode)) {
                return true;
            }
        }
        return false;
    }

    public Optional<Price> getBaseTotalValue() {
        return this.baseTotalValue;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Price getGratuity() {
        return this.gratuity;
    }

    public Optional<Price> getSubtotal() {
        return this.subtotal;
    }

    public Optional<Price> getTax() {
        return this.tax;
    }

    public boolean getTaxIncluded() {
        return this.taxIncluded;
    }

    public Price getTotal() {
        return this.total;
    }

    public Optional<Price> getTotalTicketValue() {
        return this.totalTicketValue;
    }

    public int hashCode() {
        return Objects.hash(this.subtotal, this.tax, this.total, this.gratuity, this.totalTicketValue, this.baseTotalValue, this.currencyCode, Boolean.valueOf(this.taxIncluded));
    }

    public boolean isTaxIncluded() {
        return this.taxIncluded;
    }

    public Pricing multiply(int i10) {
        return new Pricing(this.subtotal.isPresent() ? this.subtotal.get().multiply(i10) : null, this.tax.isPresent() ? this.tax.get().multiply(i10) : null, this.total.multiply(i10), this.gratuity.multiply(i10), this.totalTicketValue.isPresent() ? this.totalTicketValue.get().multiply(i10) : null, this.baseTotalValue.isPresent() ? this.baseTotalValue.get().multiply(i10) : null, this.taxIncluded, this.currencyCode);
    }

    public String toString() {
        return String.format("subtotal [%s] tax[%s] total[%s] currency[%s] %n", this.subtotal, this.tax, this.total, this.currencyCode);
    }

    public Pricing(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, boolean z10) {
        this(bigDecimal != null ? Price.priceFromCurrencyCode(str, bigDecimal) : null, bigDecimal2 != null ? Price.priceFromCurrencyCode(str, bigDecimal2) : null, Price.priceFromCurrencyCode(str, bigDecimal3), Price.priceFromCurrencyCode(str, bigDecimal4), (Price) null, (Price) null, z10, str);
    }

    private Pricing(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str, boolean z10) {
        this(bigDecimal != null ? Price.priceFromCurrencyCode(str, bigDecimal) : null, bigDecimal2 != null ? Price.priceFromCurrencyCode(str, bigDecimal2) : null, Price.priceFromCurrencyCode(str, bigDecimal3), Price.priceFromCurrencyCode(str, bigDecimal4), bigDecimal5 != null ? Price.priceFromCurrencyCode(str, bigDecimal5) : null, bigDecimal6 != null ? Price.priceFromCurrencyCode(str, bigDecimal6) : null, z10, str);
    }

    private Pricing(Price price, Price price2, Price price3, Price price4, Price price5, Price price6, boolean z10, String str) {
        this.subtotal = Optional.fromNullable(price);
        this.tax = Optional.fromNullable(price2);
        this.total = price3;
        this.gratuity = price4;
        this.totalTicketValue = Optional.fromNullable(price5);
        this.baseTotalValue = Optional.fromNullable(price6);
        this.taxIncluded = z10;
        this.currencyCode = str;
    }
}