package com.disney.wdpro.ticket_sales_base_lib.business.calendar;

import com.disney.wdpro.ticket_sales_base_lib.utils.JsonUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* loaded from: classes18.dex */
public class TieredTicketCalendarMap extends HashMap<String, TieredTicketsCalendar> {
    public static Object getDeserializer() {
        return new JsonDeserializer<TieredTicketCalendarMap>() { // from class: com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketCalendarMap.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public TieredTicketCalendarMap deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return (TieredTicketCalendarMap) JsonUtils.populateMapFromJson(jsonElement.getAsJsonObject(), jsonDeserializationContext, TieredTicketsCalendar.class, new TieredTicketCalendarMap());
            }
        };
    }
}