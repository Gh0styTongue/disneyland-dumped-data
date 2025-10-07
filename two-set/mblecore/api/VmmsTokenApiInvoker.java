package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.httpclient.UnSuccessStatusException;
import com.disney.wdpro.mblecore.api.model.VmmsTokenListResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/VmmsTokenApiInvoker;", "", "()V", "retryCount", "", "fetchTokens", "Lcom/disney/wdpro/mblecore/api/model/VmmsTokenListResponse;", "apiClient", "Lcom/disney/wdpro/mblecore/api/VmmsApiClient;", "swid", "", "isMaxRetryCountReached", "", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class VmmsTokenApiInvoker {
    private static final int MAX_RETRY_COUNT = 1;
    private int retryCount = 0;

    private final boolean isMaxRetryCountReached() {
        return this.retryCount >= MAX_RETRY_COUNT;
    }

    public final VmmsTokenListResponse fetchTokens(VmmsApiClient apiClient, String swid) throws Exception {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(swid, "swid");
        try {
            return apiClient.getTokens(swid);
        } catch (Exception e10) {
            if ((!(e10 instanceof IOException) && !(e10 instanceof UnSuccessStatusException)) || this.isMaxRetryCountReached()) {
                throw e10;
            }
            this.retryCount++;
            return this.fetchTokens(apiClient, swid);
        }
    }
}