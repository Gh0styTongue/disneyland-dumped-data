package com.disney.wdpro.httpclient;

import android.content.Context;
import android.net.ConnectivityManager;
import javax.inject.Inject;

/* loaded from: classes23.dex */
public class ConnectivityInterceptor implements InterfaceC13343o {
    private final Context context;

    public static class NoConnectionException extends InterceptException {
        private static final long serialVersionUID = 1;
    }

    @Inject
    public ConnectivityInterceptor(Context context) {
        this.context = context;
    }

    /* renamed from: a */
    public boolean m55496a() {
        return ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public void intercept(C13352x<?> c13352x) throws InterceptException {
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean interceptResponse(int i10) {
        return false;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean shouldRetryRequest() {
        return false;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13351w
    public void intercept(Request<?> request) throws InterceptException {
        if (!m55496a()) {
            throw new NoConnectionException();
        }
    }
}