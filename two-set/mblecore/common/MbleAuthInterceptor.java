package com.disney.wdpro.mblecore.common;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.InterceptException;
import com.disney.wdpro.httpclient.InterfaceC13343o;
import com.disney.wdpro.httpclient.Request;
import com.google.common.primitives.Ints;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class MbleAuthInterceptor implements InterfaceC13343o {
    public abstract String getToken();

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public void intercept(C13352x<?> c13352x) throws InterceptException {
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public /* bridge */ /* synthetic */ void interceptException(IOException iOException) {
        super.interceptException(iOException);
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean interceptResponse(int i10) {
        return Ints.m69754c(401, 403).contains(Integer.valueOf(i10));
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public /* bridge */ /* synthetic */ void responseBodyEnd() {
        super.responseBodyEnd();
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public /* bridge */ /* synthetic */ void responseBodyStart() {
        super.responseBodyStart();
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean shouldRetryRequest() {
        return false;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13351w
    public void intercept(Request<?> request) throws InterceptException {
        if (getToken() == null) {
            throw new InterceptException("No Token provided.");
        }
        request.m55548k("Authorization", "BEARER " + getToken());
    }
}