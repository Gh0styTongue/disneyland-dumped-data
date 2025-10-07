package com.disney.wdpro.httpclient;

import com.google.common.base.C22462m;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes23.dex */
public class ModelValidatorTypeAdapterFactory implements TypeAdapterFactory {
    private final InterfaceC13344p modelValidator;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.disney.wdpro.httpclient.ModelValidatorTypeAdapterFactory$a */
    class C13321a<T> extends TypeAdapter<T> {
        final /* synthetic */ TypeAdapter val$adapter;

        C13321a(TypeAdapter typeAdapter) {
            this.val$adapter = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public T read2(JsonReader jsonReader) throws JsonParseException, IOException {
            T t10 = (T) this.val$adapter.read2(jsonReader);
            if (t10 != null) {
                ModelValidatorTypeAdapterFactory.this.modelValidator.validate(t10);
            }
            return t10;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            this.val$adapter.write(jsonWriter, t10);
        }
    }

    public ModelValidatorTypeAdapterFactory(InterfaceC13344p interfaceC13344p) {
        C22462m.m68685q(interfaceC13344p, "Model validator cannot be null");
        this.modelValidator = interfaceC13344p;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new C13321a(gson.getDelegateAdapter(this, typeToken));
    }
}