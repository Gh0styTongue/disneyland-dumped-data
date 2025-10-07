package com.disney.wdpro.httpclient;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes23.dex */
public class Request<T> {
    private final Integer connectTimeout;
    private final Class<?> errorPayloadClass;
    private final Map<String, String> httpHeaders;
    private final Method method;
    private final Integer readTimeout;
    private final Object requestBody;
    private final Class<T> responsePayloadClass;
    private int retryCount;
    private final URL url;

    public enum Method {
        GET,
        POST,
        PUT,
        DELETE
    }

    Request(URL url, Method method, Map<String, String> map, Class<T> cls, Class<?> cls2, Object obj, Integer num, Integer num2) {
        C22462m.m68685q(url, "The url cannot be null.");
        C22462m.m68685q(method, "The method cannot be null.");
        C22462m.m68685q(map, "The http headers map cannot be null.");
        C22462m.m68685q(cls, "The response payload class cannot be null.");
        this.url = url;
        this.method = method;
        this.httpHeaders = Maps.m69382s(map);
        this.responsePayloadClass = cls;
        this.errorPayloadClass = cls2;
        this.requestBody = obj;
        this.connectTimeout = num;
        this.readTimeout = num2;
    }

    /* renamed from: a */
    public Integer m55538a() {
        return this.connectTimeout;
    }

    /* renamed from: b */
    public Class<?> m55539b() {
        return this.errorPayloadClass;
    }

    /* renamed from: c */
    public Map<String, String> m55540c() {
        return Collections.unmodifiableMap(this.httpHeaders);
    }

    /* renamed from: d */
    public Method m55541d() {
        return this.method;
    }

    /* renamed from: e */
    public Integer m55542e() {
        return this.readTimeout;
    }

    /* renamed from: f */
    Object m55543f() {
        return this.requestBody;
    }

    /* renamed from: g */
    public Class<T> m55544g() {
        return this.responsePayloadClass;
    }

    /* renamed from: h */
    public int m55545h() {
        return this.retryCount;
    }

    /* renamed from: i */
    public URL m55546i() {
        return this.url;
    }

    /* renamed from: j */
    void m55547j() {
        this.retryCount++;
    }

    /* renamed from: k */
    public void m55548k(String str, String str2) {
        this.httpHeaders.put(str, str2);
    }
}