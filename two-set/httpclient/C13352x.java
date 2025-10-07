package com.disney.wdpro.httpclient;

import java.util.List;
import java.util.Map;

/* renamed from: com.disney.wdpro.httpclient.x */
/* loaded from: classes23.dex */
public class C13352x<T> {
    private final Map<String, List<String>> headers;
    private final T payload;
    private final int statusCode;

    C13352x(T t10, int i10, Map<String, List<String>> map) {
        this.payload = t10;
        this.statusCode = i10;
        this.headers = map;
    }

    /* renamed from: a */
    public List<String> m55681a(String str) {
        return this.headers.get(str);
    }

    /* renamed from: b */
    public Map<String, List<String>> m55682b() {
        return this.headers;
    }

    /* renamed from: c */
    public T m55683c() {
        return this.payload;
    }

    /* renamed from: d */
    public final int m55684d() {
        return this.statusCode;
    }
}