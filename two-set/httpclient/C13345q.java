package com.disney.wdpro.httpclient;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.authentication.AuthConfig;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.google.common.base.C22462m;
import java.util.List;
import javax.inject.Inject;

/* renamed from: com.disney.wdpro.httpclient.q */
/* loaded from: classes23.dex */
public class C13345q {
    private final AuthConfig authConfig;
    private AuthenticationManager authManager;
    private HttpApiClient client;

    /* renamed from: com.disney.wdpro.httpclient.q$a */
    public class a<T> {
        private final HttpApiClient.C13320c<T> httpRequestBuilder;
        private C13330c interceptor;

        public a(HttpApiClient.C13320c<T> c13320c) {
            this.httpRequestBuilder = c13320c;
        }

        /* renamed from: a */
        private void m55671a(String str, String str2, List<Integer> list) {
            C13330c c13330c = new C13330c(C13345q.this.authManager, str, str2, list);
            this.interceptor = c13330c;
            this.httpRequestBuilder.m55534x(c13330c);
            this.httpRequestBuilder.m55536z(this.interceptor);
        }

        /* renamed from: b */
        public HttpApiClient.C13320c<T> m55672b() {
            return m55673c(null);
        }

        /* renamed from: c */
        public HttpApiClient.C13320c<T> m55673c(List<Integer> list) {
            C22462m.m68691w(this.interceptor == null, "The authentication type is already set");
            m55671a("com.disney.android.guest", C13345q.this.authManager.getUserSwid(), list);
            return this.httpRequestBuilder;
        }

        /* renamed from: d */
        public HttpApiClient.C13320c<T> m55674d() {
            return m55675e(null);
        }

        /* renamed from: e */
        public HttpApiClient.C13320c<T> m55675e(List<Integer> list) {
            C22462m.m68691w(this.interceptor == null, "The authentication type is already set");
            m55671a("com.disney.android.public", null, list);
            return this.httpRequestBuilder;
        }
    }

    @Inject
    public C13345q(AuthenticationManager authenticationManager, HttpApiClient httpApiClient, AuthConfig authConfig) {
        this.client = httpApiClient;
        this.authManager = authenticationManager;
        this.authConfig = (AuthConfig) C22462m.m68684p(authConfig);
    }

    /* renamed from: b */
    public <T> a<T> m55667b(String str, Class<T> cls) {
        return new a<>(this.client.m55504f(str, cls));
    }

    /* renamed from: c */
    public <T> a<T> m55668c(String str, Class<T> cls) {
        return new a<>(this.client.m55505g(str, cls));
    }

    /* renamed from: d */
    public <T> a<T> m55669d(String str, Class<T> cls) {
        return new a<>(this.client.m55506i(str, cls));
    }

    /* renamed from: e */
    public <T> a<T> m55670e(String str, Class<T> cls) {
        return new a<>(this.client.m55507j(str, cls));
    }
}