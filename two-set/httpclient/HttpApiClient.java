package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.AbstractC13329b0;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.httpclient.InterfaceC13336h;
import com.disney.wdpro.httpclient.Request;
import com.google.common.base.C22462m;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.inject.Inject;
import p1113yj.InterfaceC33655a;

/* loaded from: classes23.dex */
public class HttpApiClient {
    private static final String EMPTY_STRING = "";
    private static LogLevel logLevel;
    private InterfaceC33655a akamaiManager;
    private InterfaceC13334f defaultDecoder;
    private AbstractC13341m httpClientAdapter;
    private InterfaceC13319b interceptorFactory;

    public enum LogLevel {
        NONE,
        BASIC,
        HEADERS,
        FULL
    }

    /* renamed from: com.disney.wdpro.httpclient.HttpApiClient$a */
    class C13318a implements InterfaceC33655a {
        C13318a() {
        }

        @Override // p1113yj.InterfaceC33655a
        /* renamed from: a */
        public String mo55508a() {
            return "";
        }

        @Override // p1113yj.InterfaceC33655a
        /* renamed from: b */
        public String mo55509b() {
            return "";
        }

        @Override // p1113yj.InterfaceC33655a
        public void initialize() {
        }
    }

    /* renamed from: com.disney.wdpro.httpclient.HttpApiClient$b */
    public interface InterfaceC13319b {
        /* renamed from: a */
        List<InterfaceC13343o> mo55510a();
    }

    /* renamed from: com.disney.wdpro.httpclient.HttpApiClient$c */
    public class C13320c<T> {
        private Integer connectTimeout;
        protected InterfaceC13334f decoder;
        private boolean executed;
        private Request.Method method;
        protected Class<T> payloadClass;
        private Integer readTimeout;
        private Object requestBody;
        private AbstractC13329b0.c uriBuilder;
        private List<InterfaceC13351w> requestInterceptors = Lists.m69268i();
        private List<InterfaceC13353y> responseInterceptors = Lists.m69268i();
        private Class<?> errorPayloadClass = C13323a0.class;
        protected InterfaceC13336h encoder = new InterfaceC13336h.a();
        private Map<String, String> httpHeaders = Maps.m69381r();

        public C13320c(String str, Request.Method method, Class<T> cls) {
            this.payloadClass = cls;
            this.method = method;
            this.uriBuilder = AbstractC13329b0.m55583s(str).mo55584a();
            this.decoder = HttpApiClient.this.defaultDecoder;
            List<InterfaceC13343o> listMo55510a = HttpApiClient.this.interceptorFactory.mo55510a();
            if (listMo55510a != null) {
                this.requestInterceptors.addAll(listMo55510a);
                this.responseInterceptors.addAll(listMo55510a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ C13352x m55513k() {
            try {
                return HttpApiClient.this.httpClientAdapter.mo55656a(m55520h(), this.decoder, this.encoder, this.requestInterceptors, this.responseInterceptors);
            } catch (IOException e10) {
                throw new CompletionException(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ C13352x m55514l(C13352x c13352x, Throwable th2) {
            return th2 != null ? new C13352x(null, 500, null) : c13352x;
        }

        /* renamed from: c */
        public C13320c<T> m55515c() {
            this.httpHeaders.put("Accept", "*/*");
            return this;
        }

        /* renamed from: d */
        public C13320c<T> m55516d() {
            this.httpHeaders.put("Accept", "application/json");
            return this;
        }

        /* renamed from: e */
        public C13320c<T> m55517e() {
            this.httpHeaders.put("Content-Type", "*/*");
            return this;
        }

        /* renamed from: f */
        public C13320c<T> m55518f(String str) {
            C22462m.m68685q(str, "The new segment cannot be null.");
            this.uriBuilder.m55596a(str);
            return this;
        }

        /* renamed from: g */
        public C13320c<T> m55519g(String str) {
            C22462m.m68685q(str, "The new segment cannot be null.");
            this.uriBuilder.m55597b(str);
            return this;
        }

        /* renamed from: h */
        protected Request<T> m55520h() {
            try {
                return new Request<>(new URL(this.uriBuilder.m55601g().toString()), this.method, this.httpHeaders, this.payloadClass, this.errorPayloadClass, this.requestBody, this.connectTimeout, this.readTimeout);
            } catch (MalformedURLException e10) {
                throw new IllegalArgumentException("Creating the url", e10);
            }
        }

        /* renamed from: i */
        public C13352x<T> m55521i() throws IOException {
            C22462m.m68691w(!this.executed, "The request is already executed.");
            this.executed = true;
            return HttpApiClient.this.httpClientAdapter.mo55656a(m55520h(), this.decoder, this.encoder, this.requestInterceptors, this.responseInterceptors);
        }

        /* renamed from: j */
        public Future<C13352x<T>> m55522j() {
            C22462m.m68691w(!this.executed, "The request is already executed.");
            this.executed = true;
            return CompletableFuture.supplyAsync(new Supplier() { // from class: com.disney.wdpro.httpclient.j
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f33418a.m55513k();
                }
            }).handle(new BiFunction() { // from class: com.disney.wdpro.httpclient.k
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return this.f33419a.m55514l((C13352x) obj, (Throwable) obj2);
                }
            });
        }

        /* renamed from: m */
        public C13320c<T> m55523m() {
            this.httpHeaders.put("Content-Type", "application/json");
            return this;
        }

        /* renamed from: n */
        public C13320c<T> m55524n() {
            this.httpHeaders.put("Content-Type", "application/x-www-form-urlencoded");
            return this;
        }

        /* renamed from: o */
        public C13320c<T> m55525o() {
            String strMo55509b = HttpApiClient.this.akamaiManager.mo55509b();
            String strMo55508a = HttpApiClient.this.akamaiManager.mo55508a();
            m55530t("X-acf-sensor-data", strMo55509b);
            m55530t("User-Agent", strMo55508a);
            return this;
        }

        /* renamed from: p */
        public C13320c<T> m55526p(Object obj) {
            C22462m.m68685q(obj, "The requestBody cannot be null.");
            C22462m.m68691w(this.method != Request.Method.GET, "The requestBody is not allowed in a 'Get' method");
            this.requestBody = obj;
            return this;
        }

        /* renamed from: q */
        public C13320c<T> m55527q(int i10) {
            this.connectTimeout = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: r */
        public C13320c<T> m55528r(Class<? extends InterfaceC13354z> cls) {
            C22462m.m68685q(cls, "The response interceptor cannot be null.");
            this.errorPayloadClass = cls;
            return this;
        }

        /* renamed from: s */
        public C13320c<T> m55529s() {
            C22462m.m68685q(this.errorPayloadClass, "The response interceptor cannot be null.");
            this.errorPayloadClass = JsonObject.class;
            return this;
        }

        /* renamed from: t */
        public C13320c<T> m55530t(String str, String str2) {
            C22462m.m68685q(str, "The header key cannot be null.");
            C22462m.m68685q(str, "The header value cannot be null.");
            this.httpHeaders.put(str, str2);
            return this;
        }

        /* renamed from: u */
        public C13320c<T> m55531u(String str, String str2) {
            C22462m.m68685q(str, "The param key cannot be null.");
            C22462m.m68685q(str2, "The param value cannot be null.");
            this.uriBuilder.m55598c(str, str2);
            return this;
        }

        /* renamed from: v */
        public C13320c<T> m55532v(int i10) {
            this.readTimeout = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: w */
        public C13320c<T> m55533w(InterfaceC13336h interfaceC13336h) {
            C22462m.m68685q(interfaceC13336h, "The encoder cannot be null.");
            this.encoder = interfaceC13336h;
            return this;
        }

        /* renamed from: x */
        public C13320c<T> m55534x(InterfaceC13351w interfaceC13351w) {
            C22462m.m68685q(interfaceC13351w, "The request interceptor cannot be null.");
            this.requestInterceptors.add(interfaceC13351w);
            return this;
        }

        /* renamed from: y */
        public C13320c<T> m55535y(InterfaceC13334f interfaceC13334f) {
            C22462m.m68685q(interfaceC13334f, "The decoder cannot be null.");
            this.decoder = interfaceC13334f;
            return this;
        }

        /* renamed from: z */
        public C13320c<T> m55536z(InterfaceC13353y interfaceC13353y) {
            C22462m.m68685q(interfaceC13353y, "The response interceptor cannot be null.");
            this.responseInterceptors.add(interfaceC13353y);
            return this;
        }
    }

    public <T> HttpApiClient() {
        this(new C13342n());
    }

    /* renamed from: h */
    public static LogLevel m55501h() {
        if (logLevel == null) {
            logLevel = LogLevel.NONE;
        }
        return logLevel;
    }

    /* renamed from: k */
    public static void m55502k(LogLevel logLevel2) {
        C22462m.m68685q(logLevel2, "logLevel cannot be null");
        if (logLevel == null) {
            logLevel = logLevel2;
        }
    }

    /* renamed from: e */
    protected <T> C13320c<T> m55503e(String str, Request.Method method, Class<T> cls) {
        C22462m.m68685q(str, "The url cannot be null.");
        C22462m.m68685q(cls, "The payload class cannot be null.");
        return new C13320c<>(str, method, cls);
    }

    /* renamed from: f */
    public <T> C13320c<T> m55504f(String str, Class<T> cls) {
        return m55503e(str, Request.Method.DELETE, cls);
    }

    /* renamed from: g */
    public <T> C13320c<T> m55505g(String str, Class<T> cls) {
        return m55503e(str, Request.Method.GET, cls);
    }

    /* renamed from: i */
    public <T> C13320c<T> m55506i(String str, Class<T> cls) {
        return m55503e(str, Request.Method.POST, cls);
    }

    /* renamed from: j */
    public <T> C13320c<T> m55507j(String str, Class<T> cls) {
        return m55503e(str, Request.Method.PUT, cls);
    }

    public <T> HttpApiClient(AbstractC13341m abstractC13341m) {
        this(abstractC13341m, new InterfaceC13334f.a());
    }

    public <T> HttpApiClient(AbstractC13341m abstractC13341m, InterfaceC13334f interfaceC13334f) {
        this(abstractC13341m, new InterfaceC13319b() { // from class: com.disney.wdpro.httpclient.i
            @Override // com.disney.wdpro.httpclient.HttpApiClient.InterfaceC13319b
            /* renamed from: a */
            public final List mo55510a() {
                return Lists.m69268i();
            }
        }, interfaceC13334f);
    }

    public <T> HttpApiClient(AbstractC13341m abstractC13341m, InterfaceC13319b interfaceC13319b, InterfaceC13334f interfaceC13334f) {
        this(abstractC13341m, interfaceC13319b, interfaceC13334f, new C13318a());
    }

    @Inject
    public <T> HttpApiClient(AbstractC13341m abstractC13341m, InterfaceC13319b interfaceC13319b, InterfaceC13334f interfaceC13334f, InterfaceC33655a interfaceC33655a) {
        C22462m.m68685q(abstractC13341m, "The adapter cannot be null.");
        C22462m.m68685q(interfaceC13319b, "The interceptor factory cannot be null.");
        this.httpClientAdapter = abstractC13341m;
        this.interceptorFactory = interfaceC13319b;
        this.defaultDecoder = interfaceC13334f;
        this.akamaiManager = interfaceC33655a;
    }
}