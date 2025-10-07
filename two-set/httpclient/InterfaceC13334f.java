package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.google.common.base.C22452c;
import com.google.common.base.C22462m;
import com.google.common.p466io.C22826c;
import com.google.common.p466io.C22827d;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.disney.wdpro.httpclient.f */
/* loaded from: classes23.dex */
public interface InterfaceC13334f {

    @Instrumented
    /* renamed from: com.disney.wdpro.httpclient.f$a */
    public static class a implements InterfaceC13334f {
        private GsonBuilder builder;

        public a() {
            this(new GsonBuilder(), null);
        }

        /* renamed from: a */
        public GsonBuilder m55644a() {
            return this.builder;
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13334f
        public Object decode(InputStream inputStream, Type type) throws IOException {
            Object objFromJson;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C22452c.f48480c);
            Gson gsonCreate = this.builder.create();
            if (HttpApiClient.m55501h().ordinal() >= HttpApiClient.LogLevel.FULL.ordinal()) {
                String strM69732f = C22826c.m69732f(inputStreamReader);
                objFromJson = gsonCreate == null ? gsonCreate.fromJson(strM69732f, type) : GsonInstrumentation.fromJson(gsonCreate, strM69732f, type);
            } else {
                objFromJson = gsonCreate == null ? gsonCreate.fromJson(inputStreamReader, type) : GsonInstrumentation.fromJson(gsonCreate, inputStreamReader, type);
            }
            C22827d.m69734a(inputStreamReader, true);
            return objFromJson;
        }

        public a(GsonBuilder gsonBuilder) {
            this(gsonBuilder, null);
        }

        public a(InterfaceC13344p<?> interfaceC13344p) {
            this(new GsonBuilder(), interfaceC13344p);
        }

        public a(GsonBuilder gsonBuilder, InterfaceC13344p<?> interfaceC13344p) {
            C22462m.m68685q(gsonBuilder, "The GsonBuilder cannot be null.");
            gsonBuilder.registerTypeAdapterFactory(new OptionalTypeAdapterFactory());
            if (interfaceC13344p != null) {
                gsonBuilder.registerTypeAdapterFactory(new ModelValidatorTypeAdapterFactory(interfaceC13344p));
            }
            this.builder = gsonBuilder;
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.f$b */
    public static class b implements InterfaceC13334f {
        @Override // com.disney.wdpro.httpclient.InterfaceC13334f
        public Object decode(InputStream inputStream, Type type) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C22452c.f48480c);
            String strM69732f = C22826c.m69732f(inputStreamReader);
            HttpApiClient.m55501h().ordinal();
            HttpApiClient.LogLevel.FULL.ordinal();
            try {
                try {
                    return new JSONObject(strM69732f);
                } catch (JSONException e10) {
                    throw new IOException(e10);
                }
            } finally {
                C22827d.m69734a(inputStreamReader, true);
            }
        }
    }

    Object decode(InputStream inputStream, Type type) throws IOException;
}