package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/* loaded from: classes18.dex */
public final class TotalDepositDue implements Serializable {
    public static final Map<Price.SupportedCurrency, TotalDepositDue> ZERO_VALUES = createZeroValues();
    private static final long serialVersionUID = 1;
    private final String currencyCode;
    private final boolean taxIncluded;
    private final Price total;

    public static final class TotalDepositDueDeserializer implements JsonDeserializer<TotalDepositDue> {
        private static final String TICKET_CURRENCY_KEY = "currency";
        private static final String TICKET_PRICE_TOTAL_KEY = "total";
        private static final String TICKET_TAX_INCLUDED_KEY = "taxIncluded";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public TotalDepositDue deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            BigDecimal asBigDecimal = asJsonObject.get("total").getAsBigDecimal();
            String asString = asJsonObject.get(TICKET_CURRENCY_KEY).getAsString();
            if (asString != null) {
                return new TotalDepositDue(asBigDecimal, asString, asJsonObject.has(TICKET_TAX_INCLUDED_KEY) ? asJsonObject.get(TICKET_TAX_INCLUDED_KEY).getAsBoolean() : false);
            }
            throw new JsonParseException("required element currency not found");
        }
    }

    public static final class TotalDepositDueSerializer implements JsonSerializer<TotalDepositDue> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(TotalDepositDue totalDepositDue, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            String currencyCode = totalDepositDue.getCurrencyCode();
            BigDecimal value = totalDepositDue.getTotal().getValue();
            jsonObject.addProperty("currency", currencyCode);
            jsonObject.addProperty("total", value);
            jsonObject.addProperty("taxIncluded", Boolean.valueOf(totalDepositDue.isTaxIncluded()));
            return jsonObject;
        }
    }

    public TotalDepositDue(Price price, String str, boolean z10) {
        this.total = price;
        this.currencyCode = str;
        this.taxIncluded = z10;
    }

    private static Map<Price.SupportedCurrency, TotalDepositDue> createZeroValues() {
        EnumMap enumMapM69380q = Maps.m69380q(Price.SupportedCurrency.class);
        Price.SupportedCurrency supportedCurrency = Price.SupportedCurrency.USD;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        enumMapM69380q.put((EnumMap) supportedCurrency, (Price.SupportedCurrency) new TotalDepositDue(bigDecimal, "USD", false));
        enumMapM69380q.put((EnumMap) Price.SupportedCurrency.CNY, (Price.SupportedCurrency) new TotalDepositDue(bigDecimal, "CNY", false));
        if (EnumSet.allOf(Price.SupportedCurrency.class).size() == enumMapM69380q.size()) {
            return Maps.m69373j(enumMapM69380q);
        }
        throw new IllegalStateException("Not all values of enum " + Price.SupportedCurrency.class.getSimpleName() + " placed in map");
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Price getTotal() {
        return this.total;
    }

    public boolean isTaxIncluded() {
        return this.taxIncluded;
    }

    public TotalDepositDue multiply(int i10) {
        return new TotalDepositDue(this.total.multiply(i10), this.currencyCode, this.taxIncluded);
    }

    public String toString() {
        return String.format("total[%s] currency[%s] taxIncluded[%b]", this.total, this.currencyCode, Boolean.valueOf(this.taxIncluded));
    }

    public TotalDepositDue(BigDecimal bigDecimal, String str, boolean z10) {
        this(Price.priceFromCurrencyCode(str, bigDecimal), str, z10);
    }
}