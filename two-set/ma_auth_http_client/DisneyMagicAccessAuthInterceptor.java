package com.disney.wdpro.ma_auth_http_client;

import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.InterceptException;
import com.disney.wdpro.httpclient.InterfaceC13343o;
import com.disney.wdpro.httpclient.Request;
import com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/ma_auth_http_client/DisneyMagicAccessAuthInterceptor;", "Lcom/disney/wdpro/httpclient/o;", "Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;", "authProvider", "<init>", "(Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;)V", "Lcom/disney/wdpro/httpclient/Request;", "request", "", "intercept", "(Lcom/disney/wdpro/httpclient/Request;)V", "Lcom/disney/wdpro/httpclient/x;", "response", "(Lcom/disney/wdpro/httpclient/x;)V", "", "statusCode", "", "interceptResponse", "(I)Z", "shouldRetryRequest", "()Z", "Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;", "Companion", "ma-auth-http-client_release"}, m92039k = 1, m92040mv = {1, 4, 0})
/* loaded from: classes13.dex */
public final class DisneyMagicAccessAuthInterceptor implements InterfaceC13343o {
    private static final String BEARER = "BEARER";
    private final DisneyMagicAccessAuthProvider authProvider;

    public DisneyMagicAccessAuthInterceptor(DisneyMagicAccessAuthProvider authProvider) {
        Intrinsics.checkParameterIsNotNull(authProvider, "authProvider");
        this.authProvider = authProvider;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public void intercept(C13352x<?> response) {
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public /* bridge */ /* synthetic */ void interceptException(IOException iOException) {
        super.interceptException(iOException);
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13353y
    public boolean interceptResponse(int statusCode) {
        return CollectionsKt.listOf((Object[]) new Integer[]{401, 403}).contains(Integer.valueOf(statusCode));
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
        String accessToken = this.authProvider.getAccessToken();
        if (accessToken == null) {
            throw new InterceptException("No Token provided.");
        }
        if (request != null) {
            request.m55548k("Authorization", "BEARER " + accessToken);
        }
    }
}