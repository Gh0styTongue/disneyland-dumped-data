package com.disney.wdpro.ticket_sales_base_lib.business.tiers;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.disney.wdpro.ticket_sales_base_lib.business.Pricing;
import com.google.common.base.Optional;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.lang.reflect.Type;

/* loaded from: classes18.dex */
public final class TicketTierNameDescription implements Serializable {
    private static final long serialVersionUID = 1;
    private final String htmlName;
    private final int priority;
    private final Price startingFromPrice;
    private final String textName;
    private final String tierId;

    public static class TicketTierNameDescriptionDeserializer implements JsonDeserializer<TicketTierNameDescription> {

        private static final class Names {
            final String htmlName;
            final int priority;
            final String textName;
            final String tierId;

            private Names(String str, String str2, String str3, int i10) {
                this.htmlName = str;
                this.textName = str2;
                this.tierId = str3;
                this.priority = i10;
            }
        }

        private Price parseStartingFromPrice(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            try {
                Pricing pricing = (Pricing) jsonDeserializationContext.deserialize(jsonObject.get("startingFromPrice").getAsJsonObject(), Pricing.class);
                if (pricing != null) {
                    return pricing.getSubtotal().orNull();
                }
            } catch (Exception unused) {
            }
            return null;
        }

        private Names parseTextNames(JsonObject jsonObject) {
            String str;
            String asString;
            String str2;
            String str3;
            String asString2 = null;
            try {
                JsonObject asJsonObject = jsonObject.get("names").getAsJsonObject().get("guestFacingName").getAsJsonObject();
                JsonElement jsonElement = asJsonObject.get("text");
                JsonElement jsonElement2 = asJsonObject.get("html");
                JsonElement jsonElement3 = jsonObject.get("id");
                JsonElement jsonElement4 = jsonObject.get("priority");
                String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                if (jsonElement2 != null) {
                    try {
                        asString = jsonElement2.getAsString();
                    } catch (Exception unused) {
                        str = null;
                        asString = null;
                        asString2 = asString3;
                        str3 = asString2;
                        str2 = str;
                        return new Names(asString, str3, str2, asInt);
                    }
                } else {
                    asString = null;
                }
                if (jsonElement3 != null) {
                    try {
                        asString2 = jsonElement3.getAsString();
                    } catch (Exception unused2) {
                        str = asString2;
                        asString2 = asString3;
                        str3 = asString2;
                        str2 = str;
                        return new Names(asString, str3, str2, asInt);
                    }
                }
                asInt = jsonElement4 != null ? jsonElement4.getAsInt() : -1;
                str2 = asString2;
                str3 = asString3;
            } catch (Exception unused3) {
                str = null;
                asString = null;
            }
            return new Names(asString, str3, str2, asInt);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public TicketTierNameDescription deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            Price startingFromPrice = parseStartingFromPrice(asJsonObject, jsonDeserializationContext);
            Names textNames = parseTextNames(asJsonObject);
            return new TicketTierNameDescription(startingFromPrice, textNames.htmlName, textNames.textName, textNames.tierId, textNames.priority);
        }
    }

    public static Object getDeserializer() {
        return new TicketTierNameDescriptionDeserializer();
    }

    public Optional<String> getHtmlName() {
        return Optional.fromNullable(this.htmlName);
    }

    public int getPriority() {
        return this.priority;
    }

    public Optional<Price> getStartingFromPrice() {
        return Optional.fromNullable(this.startingFromPrice);
    }

    public Optional<String> getTextName() {
        return Optional.fromNullable(this.textName);
    }

    public Optional<String> getTierId() {
        return Optional.fromNullable(this.tierId);
    }

    private TicketTierNameDescription(Price price, String str, String str2, String str3, int i10) {
        this.startingFromPrice = price;
        this.htmlName = str;
        this.textName = str2;
        this.tierId = str3;
        this.priority = i10;
    }
}