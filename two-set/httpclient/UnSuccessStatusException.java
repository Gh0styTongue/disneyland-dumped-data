package com.disney.wdpro.httpclient;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes23.dex */
public class UnSuccessStatusException extends IOException {
    private static final long serialVersionUID = 1;
    private final Object error;
    private Map<String, List<String>> headers;
    private final String message;
    private final int statusCode;

    public UnSuccessStatusException(int i10, String str, Object obj, Map<String, List<String>> map) {
        super(String.format(Locale.US, "(%s) %s", Integer.valueOf(i10), str));
        this.statusCode = i10;
        this.message = str;
        this.error = obj;
        this.headers = map;
    }

    @Deprecated
    public C13323a0 getError() {
        Object obj = this.error;
        if (obj instanceof C13323a0) {
            return (C13323a0) obj;
        }
        return null;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public <T> T getServiceError() {
        return (T) this.error;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.message;
    }

    public UnSuccessStatusException(int i10, String str, Object obj) {
        this(i10, str, obj, null);
    }
}