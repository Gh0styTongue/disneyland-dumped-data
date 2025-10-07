package com.disney.wdpro.ticket_sales_base_lib.business.checkout.models;

import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.service.model.Address;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* loaded from: classes18.dex */
public final class TicketSalesAddressDeserializer implements JsonDeserializer<Address> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Address deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.get(APIConstants.UrlParams.LINE1).getAsString();
        String asString2 = asJsonObject.has(APIConstants.UrlParams.LINE2) ? asJsonObject.get(APIConstants.UrlParams.LINE2).getAsString() : null;
        String asString3 = asJsonObject.has("line3") ? asJsonObject.get("line3").getAsString() : null;
        String asString4 = asJsonObject.get("city").getAsString();
        String asString5 = asJsonObject.has("stateOrProvince") ? asJsonObject.get("stateOrProvince").getAsString() : asJsonObject.has("stateProvince") ? asJsonObject.get("stateProvince").getAsString() : null;
        String asString6 = asJsonObject.get("country").getAsString();
        String asString7 = asJsonObject.get("postalCode").getAsString();
        String asString8 = asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : null;
        String asString9 = asJsonObject.has("addressGuid") ? asJsonObject.get("addressGuid").getAsString() : null;
        Address.AddressBuilder addressBuilder = new Address.AddressBuilder();
        addressBuilder.setLine1(asString);
        addressBuilder.setLine2(asString2);
        addressBuilder.setLine3(asString3);
        addressBuilder.setCity(asString4);
        addressBuilder.setStateOrProvince(asString5);
        addressBuilder.setCountry(asString6);
        addressBuilder.setPostalCode(asString7);
        addressBuilder.setType(asString8);
        addressBuilder.setAddressId(asString9);
        return addressBuilder.build();
    }
}