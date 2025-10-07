package com.disney.wdpro.httpclient.authentication.model;

import android.text.TextUtils;
import com.google.common.base.C22459j;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.Nullable;

@Instrumented
/* loaded from: classes23.dex */
public class DisneyUser {
    private static final int MODEL_VERSION = 1;
    private static final String USER_DATA = "data";
    private static final String USER_DATA_CLASS = "dataClassName";
    private static final String VERSION = "version";
    private final String email;
    private HashMap<String, String> jwt;
    private final String swid;
    private DisneyUserData userData;
    private final int version;

    public static class Builder<T> {
        private String email;
        private String swid;
        private DisneyUserData userData;

        public DisneyUser build() {
            return new DisneyUser(this);
        }

        public Builder<T> data(T t10) {
            if (t10 != null) {
                this.userData = new DisneyUserData(t10, t10.getClass().getName());
            }
            return this;
        }

        public Builder<T> email(String str) {
            this.email = str;
            return this;
        }

        public Builder<T> swid(String str) {
            this.swid = str;
            return this;
        }
    }

    private static class DisneyUserDataDeserializer implements JsonDeserializer<DisneyUserData> {
        private DisneyUserDataDeserializer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public DisneyUserData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            try {
                if (!asJsonObject.has(DisneyUser.USER_DATA_CLASS) || !asJsonObject.has("data")) {
                    return null;
                }
                String asString = asJsonObject.get(DisneyUser.USER_DATA_CLASS).getAsString();
                return new DisneyUserData(jsonDeserializationContext.deserialize(asJsonObject.get("data"), Class.forName(asString)), asString, asJsonObject.get("version").getAsInt());
            } catch (ClassNotFoundException e10) {
                throw new JsonParseException(e10);
            }
        }
    }

    @Nullable
    public static DisneyUser fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DisneyUserData.class, new DisneyUserDataDeserializer());
        Gson gsonCreate = gsonBuilder.create();
        return (DisneyUser) (gsonCreate == null ? gsonCreate.fromJson(str, DisneyUser.class) : GsonInstrumentation.fromJson(gsonCreate, str, DisneyUser.class));
    }

    public void clearAllJwt() {
        HashMap<String, String> map = this.jwt;
        if (map == null) {
            this.jwt = new HashMap<>();
        } else {
            map.clear();
        }
    }

    public void clearJwt(@Nullable String str) {
        HashMap<String, String> map = this.jwt;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.jwt.remove(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DisneyUser disneyUser = (DisneyUser) obj;
            if (this.version == disneyUser.version && Objects.equals(this.swid, disneyUser.swid) && Objects.equals(this.email, disneyUser.email) && Objects.equals(this.jwt, disneyUser.getJwt()) && Objects.equals(this.userData, disneyUser.userData)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Object getData() {
        DisneyUserData disneyUserData = this.userData;
        if (disneyUserData != null) {
            return disneyUserData.data;
        }
        return null;
    }

    public String getEmail() {
        return this.email;
    }

    public HashMap<String, String> getJwt() {
        return this.jwt;
    }

    public String getSwid() {
        return this.swid;
    }

    public int hashCode() {
        return C22459j.m68661b(this.swid, this.email, this.jwt, this.userData, Integer.valueOf(this.version));
    }

    public boolean isCurrentVersion() {
        DisneyUserData disneyUserData = this.userData;
        return 1 == this.version && (disneyUserData == null || disneyUserData.isCurrentVersion());
    }

    public void setData(Object obj) {
        if (obj != null) {
            this.userData = new DisneyUserData(obj, obj.getClass().getName());
        } else {
            this.userData = null;
        }
    }

    public void setJwt(@Nullable String str, String str2) {
        if (this.jwt == null) {
            this.jwt = new HashMap<>();
        }
        this.jwt.put(str, str2);
    }

    private static class DisneyUserData {
        private static final int MODEL_VERSION = 1;
        private final Object data;
        private final String dataClassName;
        private final int version;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isCurrentVersion() {
            return 1 == this.version;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                DisneyUserData disneyUserData = (DisneyUserData) obj;
                if (this.version == disneyUserData.version && Objects.equals(this.data, disneyUserData.data) && Objects.equals(this.dataClassName, disneyUserData.dataClassName)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C22459j.m68661b(this.data, this.dataClassName, Integer.valueOf(this.version));
        }

        private DisneyUserData(Object obj, String str) {
            this.data = obj;
            this.dataClassName = str;
            this.version = 1;
        }

        private DisneyUserData(Object obj, String str, int i10) {
            this.data = obj;
            this.dataClassName = str;
            this.version = i10;
        }
    }

    private DisneyUser(Builder builder) {
        this.swid = builder.swid;
        this.email = builder.email;
        this.userData = builder.userData;
        this.version = 1;
        this.jwt = new HashMap<>();
    }

    @Nullable
    public String getJwt(@Nullable String str) {
        HashMap<String, String> map = this.jwt;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}