package com.disney.wdpro.httpclient;

import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes23.dex */
public class OptionalTypeAdapterFactory implements TypeAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (Optional.class.isAssignableFrom(typeToken.getRawType())) {
            return new C13350v(gson, typeToken);
        }
        return null;
    }
}