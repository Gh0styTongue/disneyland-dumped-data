package com.wdpr.p479ee.p480ra.rahybrid.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class CustomMapDeserializer implements JsonDeserializer<Map<String, Object>> {
    @Override // com.google.gson.JsonDeserializer
    public Map<String, Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = value.getAsJsonPrimitive();
                if (!asJsonPrimitive.isNumber()) {
                    map.put(key, jsonDeserializationContext.deserialize(value, Object.class));
                } else if (asJsonPrimitive.getAsString().contains(".")) {
                    map.put(key, Double.valueOf(asJsonPrimitive.getAsDouble()));
                } else {
                    map.put(key, Integer.valueOf(asJsonPrimitive.getAsInt()));
                }
            } else {
                map.put(key, jsonDeserializationContext.deserialize(value, Object.class));
            }
        }
        return map;
    }
}