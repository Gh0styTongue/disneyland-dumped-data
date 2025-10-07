package com.disney.wdpro.httpclient;

import java.io.IOException;

/* loaded from: classes23.dex */
public class InterceptException extends IOException {
    private static final long serialVersionUID = 1;

    public InterceptException() {
    }

    public InterceptException(String str, Throwable th2) {
        super(str, th2);
    }

    public InterceptException(String str) {
        super(str);
    }

    public InterceptException(Throwable th2) {
        super(th2);
    }
}