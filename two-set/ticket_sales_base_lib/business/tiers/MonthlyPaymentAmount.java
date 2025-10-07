package com.disney.wdpro.ticket_sales_base_lib.business.tiers;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import javax.annotation.Nonnull;

/* loaded from: classes18.dex */
public final class MonthlyPaymentAmount implements Serializable {
    private final Price monthlyPrice;

    public static class MonthlyPaymentAmountDeserializer implements JsonDeserializer<MonthlyPaymentAmount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public MonthlyPaymentAmount deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            BigDecimal asBigDecimal = asJsonObject.get("value").getAsBigDecimal();
            String asString = asJsonObject.get("currency").getAsString();
            if (asString == null) {
                throw new JsonParseException("currency not found");
            }
            if (Price.SupportedCurrency.findByCode(asString) != null) {
                return new MonthlyPaymentAmount(Price.priceFromCurrencyCode(asString, asBigDecimal));
            }
            throw new JsonParseException("currency " + asString + " not supported");
        }
    }

    @Nonnull
    public Price getPrice() {
        return this.monthlyPrice;
    }

    private MonthlyPaymentAmount(Price price) {
        this.monthlyPrice = price;
    }
}