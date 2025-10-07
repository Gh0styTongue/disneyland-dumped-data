package com.disney.wdpro.httpclient;

import java.io.IOException;

/* renamed from: com.disney.wdpro.httpclient.y */
/* loaded from: classes23.dex */
public interface InterfaceC13353y {
    void intercept(C13352x<?> c13352x) throws InterceptException;

    default void interceptException(IOException iOException) {
    }

    boolean interceptResponse(int i10);

    default void responseBodyEnd() {
    }

    default void responseBodyStart() {
    }

    boolean shouldRetryRequest();
}