package com.disney.wdpro.ticket_sales_base_lib.business;

import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF"})
/* loaded from: classes18.dex */
public class Price implements Serializable {
    private static ImmutableMap<SupportedCurrency, Locale> currencyCodeToLocaleMap = createCurrencyCodeToLocaleMap();
    private static final long serialVersionUID = 1;
    private final SafeCurrency currency;
    private final BigDecimal value;

    private enum CompareOperation {
        MIN,
        MAX
    }

    public static class PriceDeserializer implements JsonDeserializer<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Price deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            BigDecimal asBigDecimal = asJsonObject.has("total") ? asJsonObject.get("total").getAsBigDecimal() : asJsonObject.has("value") ? asJsonObject.get("value").getAsBigDecimal() : null;
            String asString = asJsonObject.get("currency").getAsString();
            if (asString == null) {
                throw new JsonParseException("currency not found");
            }
            if (SupportedCurrency.findByCode(asString) != null) {
                return Price.priceFromCurrencyCode(asString, asBigDecimal);
            }
            throw new JsonParseException("currency " + asString + " not supported");
        }
    }

    public static final class SafeCurrency implements Serializable {
        private static final long serialVersionUID = 1;
        private final Currency currency;
        private final String currencyCode;

        private SafeCurrency(String str, Currency currency) {
            this.currencyCode = str;
            this.currency = currency;
        }

        private static Currency createCurrencyIfPossible(String str) {
            try {
                return Currency.getInstance(str);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SafeCurrency getCurrencyFromCode(String str) {
            return new SafeCurrency(str, createCurrencyIfPossible(str));
        }

        public boolean equals(Object obj) {
            if (obj instanceof SafeCurrency) {
                SafeCurrency safeCurrency = (SafeCurrency) obj;
                if (C22459j.m68660a(this.currencyCode, safeCurrency.currencyCode) && C22459j.m68660a(this.currency, safeCurrency.currency)) {
                    return true;
                }
            }
            return false;
        }

        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public int getDefaultFractionDigits() {
            Currency currency = this.currency;
            if (currency != null) {
                return currency.getDefaultFractionDigits();
            }
            return -1;
        }

        public String getName() {
            return getName(Locale.getDefault());
        }

        public Optional<String> getSymbol() {
            Locale locale = (Locale) Price.currencyCodeToLocaleMap.get(SupportedCurrency.findByCurrency(getCurrencyFromCode(this.currencyCode)));
            Currency currency = this.currency;
            return Optional.fromNullable(currency != null ? locale != null ? currency.getSymbol(locale) : currency.getSymbol() : null);
        }

        public int hashCode() {
            return C22459j.m68661b(this.currencyCode) + C22459j.m68661b(this.currency);
        }

        public String getName(Locale locale) {
            try {
                if (this.currency != null && locale != null && !locale.getISO3Language().equalsIgnoreCase(Locale.ENGLISH.getISO3Language())) {
                    return this.currency.getDisplayName(locale);
                }
            } catch (Exception unused) {
                Objects.toString(locale);
            }
            return this.currencyCode;
        }
    }

    public enum SupportedCurrency {
        USD("USD"),
        CNY("CNY");

        private static final Map<SafeCurrency, SupportedCurrency> LOOKUP = Maps.m69381r();
        private final SafeCurrency currency;

        static {
            for (SupportedCurrency supportedCurrency : values()) {
                C22462m.m68691w(LOOKUP.put(supportedCurrency.currency, supportedCurrency) == null, "currency needs to be unique");
            }
        }

        SupportedCurrency(String str) {
            this.currency = SafeCurrency.getCurrencyFromCode(str);
        }

        public static SupportedCurrency findByCode(String str) {
            return LOOKUP.get(SafeCurrency.getCurrencyFromCode(str));
        }

        public static SupportedCurrency findByCurrency(SafeCurrency safeCurrency) {
            return LOOKUP.get(safeCurrency);
        }

        public SafeCurrency getCurrency() {
            return this.currency;
        }
    }

    private Price(String str, BigDecimal bigDecimal) {
        this(SafeCurrency.getCurrencyFromCode(str), bigDecimal);
    }

    public static BigDecimal ceileIntFromBigDecimal(BigDecimal bigDecimal) {
        return bigDecimal != null ? bigDecimal.setScale(0, RoundingMode.CEILING) : BigDecimal.ZERO;
    }

    private Price comparePrice(CompareOperation compareOperation, Price price) {
        CompareOperation compareOperation2 = CompareOperation.MIN;
        C22462m.m68673e(compareOperation == compareOperation2 || compareOperation == CompareOperation.MAX, "Unknown operation");
        C22462m.m68685q(price, "otherPrice == null");
        C22462m.m68673e(this.currency.equals(price.currency), "price currency should be equal");
        return (compareOperation != compareOperation2 ? this.value.max(price.value) != this.value : this.value.min(price.value) != this.value) ? price : this;
    }

    private static ImmutableMap<SupportedCurrency, Locale> createCurrencyCodeToLocaleMap() {
        ImmutableMap.C22588b c22588bBuilder = ImmutableMap.builder();
        c22588bBuilder.mo69013h(SupportedCurrency.USD, Locale.US);
        c22588bBuilder.mo69013h(SupportedCurrency.CNY, Locale.CHINA);
        ImmutableMap<SupportedCurrency, Locale> immutableMapMo69009a = c22588bBuilder.mo69009a();
        if (EnumSet.allOf(SupportedCurrency.class).size() == immutableMapMo69009a.size()) {
            return immutableMapMo69009a;
        }
        throw new IllegalStateException("Not all values of enum " + SupportedCurrency.class.getSimpleName() + " placed in map");
    }

    public static Price priceFromCurrency(SafeCurrency safeCurrency, BigDecimal bigDecimal) {
        C22462m.m68685q(safeCurrency, "currency == null");
        C22462m.m68685q(bigDecimal, "value == null");
        return new Price(safeCurrency, bigDecimal);
    }

    public static Price priceFromCurrencyCode(String str, BigDecimal bigDecimal) {
        C22462m.m68673e(!C22466q.m68722b(str), "currencyCode null or empty");
        C22462m.m68685q(bigDecimal, "value == null");
        return new Price(str.toUpperCase(Locale.US), bigDecimal);
    }

    public Price add(Price price) {
        C22462m.m68685q(price, "priceToAdd == null");
        C22462m.m68673e(this.currency.equals(price.currency), "price currency should be equal");
        return new Price(this.currency, this.value.add(price.value));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Price) {
            Price price = (Price) obj;
            if (C22459j.m68660a(this.value, price.value) && C22459j.m68660a(this.currency, price.currency)) {
                return true;
            }
        }
        return false;
    }

    public SafeCurrency getCurrency() {
        return this.currency;
    }

    public String getDisplayPrice() {
        Locale locale = currencyCodeToLocaleMap.get(SupportedCurrency.findByCurrency(this.currency));
        return (locale != null ? NumberFormat.getCurrencyInstance(locale) : NumberFormat.getCurrencyInstance()).format(this.value);
    }

    public String getFormatCurrencyWithoutDecimals() {
        Locale locale = currencyCodeToLocaleMap.get(SupportedCurrency.findByCurrency(this.currency));
        NumberFormat currencyInstance = locale != null ? NumberFormat.getCurrencyInstance(locale) : NumberFormat.getCurrencyInstance();
        currencyInstance.setParseIntegerOnly(true);
        currencyInstance.setMaximumFractionDigits(0);
        return currencyInstance.format(ceileIntFromBigDecimal(this.value));
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        return C22459j.m68661b(this.value) + C22459j.m68661b(this.currency);
    }

    public Price max(Price price) {
        return comparePrice(CompareOperation.MAX, price);
    }

    public Price min(Price price) {
        return comparePrice(CompareOperation.MIN, price);
    }

    public Price multiply(int i10) {
        return new Price(this.currency, this.value.multiply(new BigDecimal(i10)));
    }

    public Price subtract(Price price) {
        C22462m.m68685q(price, "priceToSubtract == null");
        C22462m.m68673e(this.currency.equals(price.currency), "price currency should be equal");
        C22462m.m68673e(this.value.compareTo(price.value) >= 0, "Negative price is not valid");
        return new Price(this.currency, this.value.subtract(price.value));
    }

    public String toString() {
        return getDisplayPrice();
    }

    private Price(SafeCurrency safeCurrency, BigDecimal bigDecimal) {
        this.value = bigDecimal;
        this.currency = safeCurrency;
    }
}