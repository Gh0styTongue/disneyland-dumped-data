package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes18.dex */
public class TicketDays extends ArrayList<TicketDay> {
    public static Object getDeserializer() {
        return new JsonDeserializer<TicketDays>() { // from class: com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model.TicketDays.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public TicketDays deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                TicketDays ticketDays = new TicketDays();
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject.has("ticketDays")) {
                    HashSet hashSetM69460g = Sets.m69460g();
                    Iterator<JsonElement> it = asJsonObject.get("ticketDays").getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        try {
                            hashSetM69460g.add((TicketDay) jsonDeserializationContext.deserialize(it.next(), TicketDay.class));
                        } catch (Exception unused) {
                        }
                    }
                    ticketDays.addAll(hashSetM69460g);
                }
                return ticketDays;
            }
        };
    }
}