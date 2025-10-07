package com.disney.wdpro.ma_auth_http_client;

import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13343o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u00000\u0001R\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0004\u0012\u00028\u00000\u0001R\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u00000\u0001R\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0004\u0012\u00028\u00000\u0001R\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"T", "Lcom/disney/wdpro/httpclient/HttpApiClient$c;", "Lcom/disney/wdpro/httpclient/HttpApiClient;", "Lcom/disney/wdpro/httpclient/o;", "interceptor", "setInterceptor", "(Lcom/disney/wdpro/httpclient/HttpApiClient$c;Lcom/disney/wdpro/httpclient/o;)Lcom/disney/wdpro/httpclient/HttpApiClient$c;", "asJson", "(Lcom/disney/wdpro/httpclient/HttpApiClient$c;)Lcom/disney/wdpro/httpclient/HttpApiClient$c;", "ma-auth-http-client_release"}, m92039k = 2, m92040mv = {1, 4, 0})
/* loaded from: classes13.dex */
public final class HttpRequestBuilderExtensionKt {
    public static final <T> HttpApiClient.C13320c<T> asJson(HttpApiClient.C13320c<T> asJson) {
        Intrinsics.checkParameterIsNotNull(asJson, "$this$asJson");
        HttpApiClient.C13320c<T> c13320cM55523m = asJson.m55516d().m55523m();
        Intrinsics.checkExpressionValueIsNotNull(c13320cM55523m, "this.acceptsJson().setJsonContentType()");
        return c13320cM55523m;
    }

    public static final <T> HttpApiClient.C13320c<T> setInterceptor(HttpApiClient.C13320c<T> setInterceptor, InterfaceC13343o interceptor) {
        Intrinsics.checkParameterIsNotNull(setInterceptor, "$this$setInterceptor");
        Intrinsics.checkParameterIsNotNull(interceptor, "interceptor");
        setInterceptor.m55534x(interceptor);
        setInterceptor.m55536z(interceptor);
        return setInterceptor;
    }
}