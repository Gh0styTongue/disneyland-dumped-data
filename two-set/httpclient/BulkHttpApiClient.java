package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes23.dex */
public class BulkHttpApiClient {
    private HttpApiClient httpClient;
    private C13345q oAuthApiClient;
    private String serviceBaseUrl;

    public static class BulkResponseBodyDeserializer implements JsonDeserializer<C13332d> {
        private int index;
        private List<HttpApiClient.C13320c<?>> requests;

        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C13332d deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            List<HttpApiClient.C13320c<?>> list = this.requests;
            int i10 = this.index;
            this.index = i10 + 1;
            HttpApiClient.C13320c<?> c13320c = list.get(i10);
            try {
                return new C13332d(c13320c.decoder.decode(new ByteArrayInputStream(jsonElement.getAsString().getBytes()), c13320c.payloadClass));
            } catch (IOException e10) {
                throw new JsonParseException(e10);
            }
        }
    }

    @Inject
    public BulkHttpApiClient(C13345q c13345q, HttpApiClient httpApiClient, String str) {
        this.oAuthApiClient = c13345q;
        this.httpClient = httpApiClient;
        this.serviceBaseUrl = str;
    }
}