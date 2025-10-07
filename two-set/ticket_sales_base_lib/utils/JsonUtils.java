package com.disney.wdpro.ticket_sales_base_lib.utils;

import com.google.common.base.C22462m;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Map;

/* loaded from: classes18.dex */
public final class JsonUtils {
    private static final KeyDeserializer<String> IDENTITY_STRING_CONVERTER = new KeyDeserializer<String>() { // from class: com.disney.wdpro.ticket_sales_base_lib.utils.JsonUtils.1
        @Override // com.disney.wdpro.ticket_sales_base_lib.utils.JsonUtils.KeyDeserializer
        public String deserialize(String str) {
            return str;
        }
    };

    public interface KeyDeserializer<T> {
        T deserialize(String str);
    }

    private JsonUtils() {
        throw new UnsupportedOperationException("Not instantiable class.");
    }

    public static boolean existsAndIsAnArray(JsonObject jsonObject, String str) {
        return jsonObject.has(str) && jsonObject.get(str).isJsonArray();
    }

    public static <V, Result extends Map<String, V>> Result populateMapFromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, Class<V> cls, Result result) {
        return (Result) populateMapFromJson(jsonObject, jsonDeserializationContext, IDENTITY_STRING_CONVERTER, cls, result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V, Result extends Map<K, V>> Result populateMapFromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, KeyDeserializer<K> keyDeserializer, Class<V> cls, Result result) {
        C22462m.m68685q(result, "outputMap == null");
        if (jsonObject != null) {
            C22462m.m68685q(keyDeserializer, "keyDeserializer == null");
            C22462m.m68685q(jsonDeserializationContext, "context == null");
            C22462m.m68685q(cls, "typeOfV == null");
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                try {
                    Object objDeserialize = jsonDeserializationContext.deserialize(entry.getValue(), cls);
                    K kDeserialize = keyDeserializer.deserialize(entry.getKey());
                    if (kDeserialize != null) {
                        result.put(kDeserialize, objDeserialize);
                    }
                } catch (JsonParseException unused) {
                }
            }
        }
        return result;
    }
}