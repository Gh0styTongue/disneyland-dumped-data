package com.disney.wdpro.ticket_sales_base_lib.business.calendar;

import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.VisitDayName;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierName;
import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierNameDescription;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF"})
/* loaded from: classes18.dex */
public final class TieredTicketsCalendar implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<Calendar, TieredTicketDate> dateToTicketTierNameMap;
    private final Map<String, TicketTierNameDescription> tierNameToTierDescriptionMap;
    private final TimeZone timeZone;

    public static class TieredTicketDate implements Serializable {
        private static final long serialVersionUID = 1;
        private final Calendar calendar;
        private final VisitDayName calendarName;
        private final String ticketTierName;

        TieredTicketDate(Calendar calendar, String str, VisitDayName visitDayName) {
            this.calendar = (Calendar) C22462m.m68685q(calendar, "invalid date from parser");
            this.ticketTierName = (String) C22462m.m68685q(str, "invalid tier name from parser");
            this.calendarName = visitDayName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static TieredTicketDate createTieredTicketDate(JsonElement jsonElement, TimeZone timeZone, SimpleDateFormat simpleDateFormat) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            String asString = asJsonObject.get("date").getAsString();
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTimeZone(timeZone);
                calendar.setTime(simpleDateFormat.parse(asString));
                String upperCase = asJsonObject.get(TicketTierName.getJsonKey()).getAsString().toUpperCase(Locale.US);
                JsonElement jsonElement2 = asJsonObject.get("calendarName");
                return new TieredTicketDate(calendar, upperCase, jsonElement2 != null ? VisitDayName.findById(jsonElement2.getAsString()) : null);
            } catch (ParseException unused) {
                throw new JsonParseException("Could not parse the date");
            }
        }

        public Optional<VisitDayName> getCalendarName() {
            return Optional.fromNullable(this.calendarName);
        }

        public Calendar getDate() {
            return this.calendar;
        }

        public String getTicketTierName() {
            return this.ticketTierName;
        }
    }

    public static Object getDeserializer() {
        return new JsonDeserializer<TieredTicketsCalendar>() { // from class: com.disney.wdpro.ticket_sales_base_lib.business.calendar.TieredTicketsCalendar.1
            private Map<Calendar, TieredTicketDate> createDateToTierNameMap(JsonObject jsonObject, TimeZone timeZone) {
                JsonArray asJsonArray = jsonObject.get("dates").getAsJsonArray();
                LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
                SimpleDateFormat simpleDateFormatM39105x = new C9350r().m39105x();
                simpleDateFormatM39105x.setTimeZone(timeZone);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeZone(timeZone);
                try {
                    calendar.setTime(simpleDateFormatM39105x.parse(simpleDateFormatM39105x.format(calendar.getTime())));
                    for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                        try {
                            TieredTicketDate tieredTicketDateCreateTieredTicketDate = TieredTicketDate.createTieredTicketDate(asJsonArray.get(i10), timeZone, simpleDateFormatM39105x);
                            if (calendar.after(tieredTicketDateCreateTieredTicketDate.calendar)) {
                                simpleDateFormatM39105x.format(tieredTicketDateCreateTieredTicketDate.calendar.getTime());
                            } else {
                                linkedHashMapM69385v.put(tieredTicketDateCreateTieredTicketDate.calendar, tieredTicketDateCreateTieredTicketDate);
                            }
                        } catch (Exception unused) {
                            asJsonArray.get(i10);
                        }
                    }
                    if (linkedHashMapM69385v.isEmpty()) {
                        throw new JsonParseException("No date and tier information available");
                    }
                    return linkedHashMapM69385v;
                } catch (ParseException unused2) {
                    throw new JsonParseException("Could not parse the date returned");
                }
            }

            private Map<String, TicketTierNameDescription> createTierNameToTierDescriptionMap(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
                JsonElement jsonElement = jsonObject.get("tiers");
                if (jsonElement == null) {
                    return Maps.m69381r();
                }
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                HashMap mapM69381r = Maps.m69381r();
                if (asJsonObject == null) {
                    return mapM69381r;
                }
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    try {
                        if (entry.getKey() != null) {
                            mapM69381r.put(entry.getKey().toUpperCase(), (TicketTierNameDescription) jsonDeserializationContext.deserialize(entry.getValue(), TicketTierNameDescription.class));
                        }
                    } catch (JsonParseException unused) {
                    }
                }
                if (mapM69381r.isEmpty()) {
                    throw new JsonParseException("No tier name description available");
                }
                if (asJsonObject.entrySet().size() > mapM69381r.size()) {
                    asJsonObject.entrySet().size();
                    mapM69381r.size();
                }
                return mapM69381r;
            }

            private TimeZone createTimeZone(JsonObject jsonObject) {
                TimeZone timeZone = null;
                try {
                    String asString = jsonObject.has("timeZone") ? jsonObject.get("timeZone").getAsString() : null;
                    if (!C22466q.m68722b(asString)) {
                        timeZone = TimeZone.getTimeZone(asString);
                    }
                } catch (Exception unused) {
                }
                return timeZone == null ? TimeZone.getDefault() : timeZone;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public TieredTicketsCalendar deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                TimeZone timeZoneCreateTimeZone = createTimeZone(asJsonObject);
                return new TieredTicketsCalendar(createDateToTierNameMap(asJsonObject, timeZoneCreateTimeZone), createTierNameToTierDescriptionMap(asJsonObject, jsonDeserializationContext), timeZoneCreateTimeZone);
            }
        };
    }

    public Map<Calendar, TieredTicketDate> getDateToTicketTierNameMap() {
        return Collections.unmodifiableMap(this.dateToTicketTierNameMap);
    }

    public Map<String, TicketTierNameDescription> getTierNameToTierDescriptionMap() {
        return Collections.unmodifiableMap(this.tierNameToTierDescriptionMap);
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    private TieredTicketsCalendar(Map<Calendar, TieredTicketDate> map, Map<String, TicketTierNameDescription> map2, TimeZone timeZone) {
        this.dateToTicketTierNameMap = map;
        this.tierNameToTierDescriptionMap = map2;
        this.timeZone = timeZone;
    }
}