package com.disney.wdpro.httpclient;

import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Instrumented
/* renamed from: com.disney.wdpro.httpclient.v */
/* loaded from: classes23.dex */
class C13350v<T> extends TypeAdapter<T> {
    private final Gson gson;
    private final Type wrappedType;

    public C13350v(Gson gson, TypeToken<T> typeToken) {
        this.gson = gson;
        this.wrappedType = ((ParameterizedType) typeToken.getType()).getActualTypeArguments()[0];
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public T read2(JsonReader jsonReader) throws IOException {
        Gson gson = this.gson;
        Type type = this.wrappedType;
        return (T) Optional.fromNullable(gson == null ? gson.fromJson(jsonReader, type) : GsonInstrumentation.fromJson(gson, jsonReader, type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws JsonIOException, IOException {
        Optional optional = (Optional) t10;
        if (optional == null) {
            boolean serializeNulls = jsonWriter.getSerializeNulls();
            jsonWriter.setSerializeNulls(false);
            jsonWriter.nullValue();
            jsonWriter.setSerializeNulls(serializeNulls);
            return;
        }
        Gson gson = this.gson;
        Object objOrNull = optional.orNull();
        Type type = this.wrappedType;
        if (gson == null) {
            gson.toJson(objOrNull, type, jsonWriter);
        } else {
            GsonInstrumentation.toJson(gson, objOrNull, type, jsonWriter);
        }
    }
}