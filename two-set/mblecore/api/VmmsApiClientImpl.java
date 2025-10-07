package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.httpclient.C13323a0;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13343o;
import com.disney.wdpro.mblecore.api.model.VmmsTokenListResponse;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/VmmsApiClientImpl;", "Lcom/disney/wdpro/mblecore/api/VmmsApiClient;", "urlBuilder", "Lcom/disney/wdpro/mblecore/api/UrlBuilder;", "httpApiClient", "Lcom/disney/wdpro/httpclient/HttpApiClient;", "userInfo", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "(Lcom/disney/wdpro/mblecore/api/UrlBuilder;Lcom/disney/wdpro/httpclient/HttpApiClient;Lcom/disney/wdpro/mblecore/common/MbleUserInfo;)V", "getTokens", "Lcom/disney/wdpro/mblecore/api/model/VmmsTokenListResponse;", "swid", "", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class VmmsApiClientImpl implements VmmsApiClient {
    private final HttpApiClient httpApiClient;
    private final UrlBuilder urlBuilder;
    private final MbleUserInfo userInfo;

    @Inject
    public VmmsApiClientImpl(UrlBuilder urlBuilder, HttpApiClient httpApiClient, MbleUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        Intrinsics.checkNotNullParameter(httpApiClient, "httpApiClient");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.urlBuilder = urlBuilder;
        this.httpApiClient = httpApiClient;
        this.userInfo = userInfo;
    }

    @Override // com.disney.wdpro.mblecore.api.VmmsApiClient
    public VmmsTokenListResponse getTokens(String swid) throws IOException {
        Intrinsics.checkNotNullParameter(swid, "swid");
        HttpApiClient.C13320c c13320cM55528r = this.httpApiClient.m55505g(this.urlBuilder.buildTokenListUrl(swid), VmmsTokenListResponse.class).m55528r(C13323a0.class);
        InterfaceC13343o mbleAuthInterceptor = this.userInfo.getMbleAuthInterceptor();
        if (mbleAuthInterceptor != null) {
            c13320cM55528r.m55534x(mbleAuthInterceptor);
            c13320cM55528r.m55536z(mbleAuthInterceptor);
        }
        Object objM55683c = c13320cM55528r.m55521i().m55683c();
        Intrinsics.checkNotNullExpressionValue(objM55683c, "request.execute().payload");
        return (VmmsTokenListResponse) objM55683c;
    }
}