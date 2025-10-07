package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.google.common.base.C22452c;
import com.google.common.p466io.C22827d;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* renamed from: com.disney.wdpro.httpclient.h */
/* loaded from: classes23.dex */
public interface InterfaceC13336h {

    /* renamed from: com.disney.wdpro.httpclient.h$a */
    public static class a extends b {
        @Override // com.disney.wdpro.httpclient.InterfaceC13336h.b, com.disney.wdpro.httpclient.InterfaceC13336h
        /* renamed from: a */
        public void mo55651a(Object obj, OutputStream outputStream) throws JsonIOException, IOException {
            if (obj instanceof String) {
                HttpApiClient.m55501h().ordinal();
                HttpApiClient.LogLevel.FULL.ordinal();
                outputStream.write(obj.toString().getBytes(C22452c.f48480c));
            } else if (obj instanceof byte[]) {
                outputStream.write((byte[]) obj);
            } else if (obj != null) {
                super.mo55651a(obj, outputStream);
            }
        }
    }

    @Instrumented
    /* renamed from: com.disney.wdpro.httpclient.h$b */
    public static class b implements InterfaceC13336h {
        private GsonBuilder builder;

        public b() {
            this(new GsonBuilder());
        }

        @Override // com.disney.wdpro.httpclient.InterfaceC13336h
        /* renamed from: a */
        public void mo55651a(Object obj, OutputStream outputStream) throws JsonIOException, IOException {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C22452c.f48480c);
            Gson gsonCreate = this.builder.create();
            if (gsonCreate == null) {
                gsonCreate.toJson(obj, outputStreamWriter);
            } else {
                GsonInstrumentation.toJson(gsonCreate, obj, outputStreamWriter);
            }
            if (HttpApiClient.m55501h().ordinal() >= HttpApiClient.LogLevel.FULL.ordinal()) {
                if (gsonCreate == null) {
                    gsonCreate.toJson(obj);
                } else {
                    GsonInstrumentation.toJson(gsonCreate, obj);
                }
            }
            C22827d.m69734a(outputStreamWriter, true);
        }

        /* renamed from: b */
        public GsonBuilder m55652b() {
            return this.builder;
        }

        public b(GsonBuilder gsonBuilder) {
            this.builder = gsonBuilder;
            gsonBuilder.registerTypeAdapterFactory(new OptionalTypeAdapterFactory());
        }
    }

    /* renamed from: a */
    void mo55651a(Object obj, OutputStream outputStream) throws IOException;
}