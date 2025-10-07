package com.disney.wdpro.friendsservices.deserializer;

import com.disney.wdpro.commons.C9350r;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/deserializer/DateDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Ljava/util/Date;", "Lcom/disney/wdpro/commons/r;", "time", "<init>", "(Lcom/disney/wdpro/commons/r;)V", "", "dateString", "parseDate", "(Ljava/lang/String;)Ljava/util/Date;", "Lcom/google/gson/JsonElement;", "jsonElement", "Ljava/lang/reflect/Type;", "type", "Lcom/google/gson/JsonDeserializationContext;", "context", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/util/Date;", "", "Ljava/text/SimpleDateFormat;", "dateFormatters", "Ljava/util/Map;", "Companion", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nDateDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateDeserializer.kt\ncom/disney/wdpro/friendsservices/deserializer/DateDeserializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n215#2,2:79\n*S KotlinDebug\n*F\n+ 1 DateDeserializer.kt\ncom/disney/wdpro/friendsservices/deserializer/DateDeserializer\n*L\n52#1:79,2\n*E\n"})
/* loaded from: classes28.dex */
public final class DateDeserializer implements JsonDeserializer<Date> {
    private static final String DATE_ISO8601_MILLISECONDS_REGULAR_EXPRESSION = "(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2})\\:(\\d{2})\\:(\\d{2}).\\d{1,3}";
    private static final String DATE_ISO8601_REGULAR_EXPRESSION = "(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2})\\:(\\d{2})\\:(\\d{2})Z";
    private static final String DATE_ISO8601_REGULAR_EXPRESSION_X = "(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2})\\:(\\d{2})\\:(\\d{2})(?:[+-](?:2[0-3]|[01][0-9]):[0-5][0-9])";
    private static final String DATE_WITHOUT_TIME_REGULAR_EXPRESSION = "\\d{4}-\\d{2}-\\d{2}";
    private static final String SERVICE_ISO8601_TIME_FORMAT_X = "yyyy-MM-dd'T'HH:mm:ssZZZZZ";
    private static final String TIME_24_REGULAR_EXPRESSION = "([01]?[0-9]|2[0-3]):[0-5][0-9]:[0][0]";
    private final Map<String, SimpleDateFormat> dateFormatters;

    public DateDeserializer(C9350r time) {
        Intrinsics.checkNotNullParameter(time, "time");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.dateFormatters = linkedHashMap;
        SimpleDateFormat simpleDateFormatM39105x = time.m39105x();
        Intrinsics.checkNotNullExpressionValue(simpleDateFormatM39105x, "time.serviceDateFormatter");
        linkedHashMap.put(DATE_WITHOUT_TIME_REGULAR_EXPRESSION, simpleDateFormatM39105x);
        SimpleDateFormat simpleDateFormatM39077F = time.m39077F();
        Intrinsics.checkNotNullExpressionValue(simpleDateFormatM39077F, "time.zuluFormatter");
        linkedHashMap.put(DATE_ISO8601_REGULAR_EXPRESSION, simpleDateFormatM39077F);
        SimpleDateFormat simpleDateFormatM39094l = time.m39094l();
        Intrinsics.checkNotNullExpressionValue(simpleDateFormatM39094l, "time.diningReservationTimeFormatter");
        linkedHashMap.put(DATE_ISO8601_MILLISECONDS_REGULAR_EXPRESSION, simpleDateFormatM39094l);
        SimpleDateFormat simpleDateFormatM39106y = time.m39106y();
        Intrinsics.checkNotNullExpressionValue(simpleDateFormatM39106y, "time.serviceTimeFormatter");
        linkedHashMap.put(TIME_24_REGULAR_EXPRESSION, simpleDateFormatM39106y);
        linkedHashMap.put(DATE_ISO8601_REGULAR_EXPRESSION_X, new SimpleDateFormat(SERVICE_ISO8601_TIME_FORMAT_X, Locale.US));
    }

    private final Date parseDate(String dateString) {
        try {
            for (Map.Entry<String, SimpleDateFormat> entry : this.dateFormatters.entrySet()) {
                if (new Regex(entry.getKey()).matches(dateString)) {
                    return entry.getValue().parse(dateString);
                }
            }
            return null;
        } catch (ParseException unused) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("Unparseable date: \"%s\".", Arrays.copyOf(new Object[]{dateString}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            throw new JsonParseException(str);
        }
    }

    @Override // com.google.gson.JsonDeserializer
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        String dateString = jsonElement.getAsString();
        if (dateString == null || dateString.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(dateString, "dateString");
        return parseDate(dateString);
    }
}