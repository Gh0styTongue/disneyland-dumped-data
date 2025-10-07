package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.google.common.base.C22466q;
import com.google.common.p466io.C22826c;
import com.google.common.p466io.C22827d;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Instrumented
/* renamed from: com.disney.wdpro.httpclient.n */
/* loaded from: classes23.dex */
public class C13342n extends AbstractC13341m {
    /* renamed from: b */
    private void m55657b(InputStream inputStream, HttpURLConnection httpURLConnection) throws IOException {
        if (inputStream != null) {
            C22827d.m69734a(inputStream, true);
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: c */
    private void m55658c(List<InterfaceC13353y> list, IOException iOException) {
        Iterator<InterfaceC13353y> it = list.iterator();
        while (it.hasNext()) {
            it.next().interceptException(iOException);
        }
    }

    /* renamed from: d */
    private boolean m55659d(List<InterfaceC13353y> list, C13352x<?> c13352x) throws InterceptException {
        while (true) {
            boolean z10 = false;
            for (InterfaceC13353y interfaceC13353y : list) {
                if (interfaceC13353y.interceptResponse(c13352x.m55684d())) {
                    interfaceC13353y.intercept(c13352x);
                    if (interfaceC13353y.shouldRetryRequest() || z10) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }
    }

    /* renamed from: e */
    private boolean m55660e(int i10) {
        return i10 >= 300 && i10 <= 399;
    }

    /* renamed from: f */
    private boolean m55661f(int i10) {
        return i10 >= 200 && i10 <= 299;
    }

    /* renamed from: h */
    private Object m55662h(HttpURLConnection httpURLConnection, Class<?> cls) throws Throwable {
        Object obj;
        InputStream errorStream;
        InputStream inputStream = null;
        objFromJson = null;
        Object objFromJson = null;
        InputStream inputStream2 = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
        } catch (Exception unused) {
            obj = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
            Gson gson = new Gson();
            if (C13323a0.class.isAssignableFrom(cls)) {
                String strM69732f = C22826c.m69732f(inputStreamReader);
                try {
                    objFromJson = GsonInstrumentation.fromJson(gson, strM69732f, (Class<Object>) cls);
                    strM69732f = httpURLConnection.getResponseMessage();
                } catch (JsonParseException unused2) {
                    objFromJson = GsonInstrumentation.fromJson(gson, "{}", (Class<Object>) cls);
                }
                if (C22466q.m68722b(((C13323a0) objFromJson).getErrorMessage())) {
                    ((C13323a0) objFromJson).setErrorMessage(strM69732f);
                }
            } else {
                objFromJson = GsonInstrumentation.fromJson(gson, (Reader) inputStreamReader, (Class<Object>) cls);
            }
            try {
                m55657b(errorStream, httpURLConnection);
                return objFromJson;
            } catch (IOException unused3) {
                return objFromJson;
            }
        } catch (Exception unused4) {
            obj = objFromJson;
            inputStream2 = errorStream;
            try {
                m55657b(inputStream2, httpURLConnection);
            } catch (IOException unused5) {
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            inputStream = errorStream;
            try {
                m55657b(inputStream, httpURLConnection);
            } catch (IOException unused6) {
            }
            throw th;
        }
    }

    /* renamed from: i */
    private <T> T m55663i(HttpURLConnection httpURLConnection, InterfaceC13334f interfaceC13334f, Class<T> cls, List<InterfaceC13353y> list) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            T t10 = (T) interfaceC13334f.decode(inputStream, cls);
            m55657b(inputStream, httpURLConnection);
            return t10;
        } catch (Throwable th3) {
            th = th3;
            m55657b(inputStream, httpURLConnection);
            throw th;
        }
    }

    /* renamed from: j */
    private <T> void m55664j(Request<T> request, InterfaceC13336h interfaceC13336h, HttpURLConnection httpURLConnection) throws IOException {
        Object objM55543f = request.m55543f();
        if (objM55543f != null) {
            OutputStream outputStream = null;
            try {
                httpURLConnection.setDoOutput(true);
                outputStream = httpURLConnection.getOutputStream();
                interfaceC13336h.mo55651a(objM55543f, outputStream);
            } finally {
                if (outputStream != null) {
                    C22827d.m69734a(outputStream, true);
                }
            }
        }
    }

    @Override // com.disney.wdpro.httpclient.AbstractC13341m
    /* renamed from: a */
    public <T> C13352x<T> mo55656a(Request<T> request, InterfaceC13334f interfaceC13334f, InterfaceC13336h interfaceC13336h, List<InterfaceC13351w> list, List<InterfaceC13353y> list2) throws IOException {
        HttpURLConnection httpURLConnectionMo55665g;
        C13352x<?> c13352x;
        boolean zM55659d;
        do {
            try {
                if (HttpApiClient.m55501h() != HttpApiClient.LogLevel.NONE) {
                    request.m55545h();
                    request.m55541d();
                    request.m55546i();
                }
                Iterator<InterfaceC13351w> it = list.iterator();
                while (it.hasNext()) {
                    it.next().intercept(request);
                }
                httpURLConnectionMo55665g = mo55665g(request.m55546i());
                if (request.m55538a() != null) {
                    httpURLConnectionMo55665g.setConnectTimeout(request.m55538a().intValue());
                }
                if (request.m55542e() != null) {
                    httpURLConnectionMo55665g.setReadTimeout(request.m55542e().intValue());
                }
                httpURLConnectionMo55665g.setRequestMethod(request.m55541d().name());
                for (Map.Entry<String, String> entry : request.m55540c().entrySet()) {
                    httpURLConnectionMo55665g.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (HttpApiClient.m55501h().ordinal() >= HttpApiClient.LogLevel.HEADERS.ordinal()) {
                    GsonInstrumentation.toJson(new Gson(), httpURLConnectionMo55665g.getRequestProperties());
                }
                m55664j(request, interfaceC13336h, httpURLConnectionMo55665g);
                Iterator<InterfaceC13353y> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().responseBodyStart();
                }
                int responseCode = httpURLConnectionMo55665g.getResponseCode();
                if (!m55661f(responseCode) && !m55660e(responseCode)) {
                    c13352x = new C13352x<>(m55662h(httpURLConnectionMo55665g, request.m55539b()), responseCode, httpURLConnectionMo55665g.getHeaderFields());
                    zM55659d = m55659d(list2, c13352x);
                    if (zM55659d) {
                        request.m55547j();
                    }
                    Iterator<InterfaceC13353y> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next().responseBodyEnd();
                    }
                }
                C13352x<T> c13352x2 = new C13352x<>(m55663i(httpURLConnectionMo55665g, interfaceC13334f, request.m55544g(), list2), responseCode, httpURLConnectionMo55665g.getHeaderFields());
                m55659d(list2, c13352x2);
                Iterator<InterfaceC13353y> it4 = list2.iterator();
                while (it4.hasNext()) {
                    it4.next().responseBodyEnd();
                }
                return c13352x2;
            } catch (IOException e10) {
                m55658c(list2, e10);
                throw e10;
            }
        } while (zM55659d);
        throw new UnSuccessStatusException(c13352x.m55684d(), httpURLConnectionMo55665g.getResponseMessage(), c13352x.m55683c(), httpURLConnectionMo55665g.getHeaderFields());
    }

    /* renamed from: g */
    protected HttpURLConnection mo55665g(URL url) throws IOException {
        return (HttpURLConnection) URLConnectionInstrumentation.openConnection(url.openConnection());
    }
}