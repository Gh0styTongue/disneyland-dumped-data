package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.mblecore.api.model.VmmsTokenListResponse;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/VmmsApiClient;", "", "getTokens", "Lcom/disney/wdpro/mblecore/api/model/VmmsTokenListResponse;", "swid", "", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface VmmsApiClient {
    VmmsTokenListResponse getTokens(String swid) throws IOException;
}