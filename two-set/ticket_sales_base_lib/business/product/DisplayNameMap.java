package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.google.common.base.C22466q;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes18.dex */
public class DisplayNameMap implements Serializable {
    public static final String KEY_PRODUCT_ASSIGN_TICKET_AGEGROUP_LABEL = "wdproMobileAssignTicketAgeGroupLabel";
    public static final String KEY_PRODUCT_CAPTION = "wdproMobileCaption";
    public static final String KEY_PRODUCT_SUB_CAPTION = "wdproMobileSubCaption";
    public static final String KEY_PRODUCT_TICKET_BRICK_AGEGROUP_LABEL = "wdproMobileTicketBrickAgeGroupLabel";
    public static final String KEY_PRODUCT_TITLE = "wdproMobileName";
    private static final long serialVersionUID = 1;
    private final HashMap<String, DisplayName> map;

    public static class DisplayName implements Serializable {
        private static final long serialVersionUID = 1;
        private String html;
        private String text;

        public DisplayName(String str, String str2) {
            this.text = str;
            this.html = str2;
        }

        public static String getString(DisplayName displayName, Type type) {
            return displayName != null ? type == Type.HTML ? displayName.getHtmlText() : displayName.getPlainText() : "";
        }

        public String getHtmlText() {
            return C22466q.m68725e(this.html).trim();
        }

        public String getPlainText() {
            return C22466q.m68725e(this.text).trim();
        }
    }

    public static class DisplayNameMapDeserializer implements JsonDeserializer<DisplayNameMap> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public DisplayNameMap deserialize(JsonElement jsonElement, java.lang.reflect.Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return DisplayNameMap.deserializeNames(jsonElement.getAsJsonObject(), jsonDeserializationContext);
        }
    }

    public enum Type {
        PLAIN_TEXT,
        HTML
    }

    public DisplayNameMap(HashMap<String, DisplayName> map) {
        this.map = map;
    }

    public static DisplayNameMap deserializeNames(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        HashMap mapM69381r = Maps.m69381r();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            mapM69381r.put(entry.getKey(), (DisplayName) jsonDeserializationContext.deserialize(entry.getValue(), DisplayName.class));
        }
        return new DisplayNameMap(mapM69381r);
    }

    public DisplayName getName(String str) {
        return this.map.get(str);
    }
}