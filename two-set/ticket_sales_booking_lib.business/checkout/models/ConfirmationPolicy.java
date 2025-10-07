package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes18.dex */
public final class ConfirmationPolicy implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<String> policyContent;
    private final String policyTitle;

    public static final class Builder {
        private List<String> policyContent;
        private String policyTitle;

        public ConfirmationPolicy build() {
            return new ConfirmationPolicy(this);
        }

        public Builder withPolicyContent(List<String> list) {
            this.policyContent = list;
            return this;
        }

        public Builder withPolicyTitle(String str) {
            this.policyTitle = str;
            return this;
        }
    }

    public static class ConfirmationPolicyDeserializer implements JsonDeserializer<ConfirmationPolicy> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public ConfirmationPolicy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Builder builder = new Builder();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            String asString = asJsonObject.get("name").getAsString();
            JsonArray asJsonArray = asJsonObject.get("descriptions").getAsJsonArray();
            ArrayList arrayListM69268i = Lists.m69268i();
            for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                Set<Map.Entry<String, JsonElement>> setEntrySet = asJsonArray.get(i10).getAsJsonObject().entrySet();
                HashSet hashSetM69460g = Sets.m69460g();
                for (Map.Entry<String, JsonElement> entry : setEntrySet) {
                    if (!hashSetM69460g.contains(entry.getValue().getAsJsonObject().get("id").getAsString())) {
                        hashSetM69460g.add(entry.getValue().getAsJsonObject().get("id").getAsString());
                        arrayListM69268i.add(entry.getValue().getAsJsonObject().get("text").getAsString());
                    }
                }
            }
            return builder.withPolicyTitle(asString).withPolicyContent(arrayListM69268i).build();
        }
    }

    public ConfirmationPolicy(Builder builder) {
        this.policyTitle = builder.policyTitle;
        this.policyContent = builder.policyContent;
    }

    public List<String> getPolicyContent() {
        return this.policyContent;
    }

    public String getPolicyTitle() {
        return this.policyTitle;
    }
}